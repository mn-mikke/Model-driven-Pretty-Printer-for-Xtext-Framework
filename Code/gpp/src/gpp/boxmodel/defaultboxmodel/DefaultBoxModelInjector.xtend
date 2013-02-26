package gpp.boxmodel.defaultboxmodel

import java.util.*

import gpp.boxmodel.boxModel.Box
import gpp.boxmodel.boxModel.BoxModel
import gpp.boxmodel.boxModel.BoxModelFactory
import gpp.boxmodel.boxModel.GroupBox
import gpp.boxmodel.boxModel.MultipleBox
import gpp.boxmodel.boxModel.ParserRuleFormatting
import gpp.boxmodel.boxModel.TerminalRuleFormatting
import gpp.boxmodel.boxModel.KeywordTerminalRuleFormatting
import gpp.boxmodel.boxModel.DefaultTerminalRuleFormatting
import gpp.boxmodel.boxModel.XtextFileImport
import gpp.boxmodel.operators.boxModelOperators.BoxModelOperatorsFactory
import gpp.boxmodel.operators.boxModelOperators.Import
import gpp.boxmodel.defaultboxmodel.defaultBoxModelDefinition.*

import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.TerminalRule

class DefaultBoxModelInjector {
	DefaultBoxModelMatcher matcher 
	
	def void inject(BoxModel boxModel, Grammar grammar, DefaultBoxModelDefinition defaultBoxModelDefinition)
	{	
		matcher = new DefaultBoxModelMatcher();	
		//Create import of xtext file.
		val XtextFileImport xImp = BoxModelFactory::eINSTANCE.createXtextFileImport();
		xImp.setImportURI(grammar.eResource().getURI().toString());
		boxModel.setXtextFile(xImp);
		
		// Create a section of operator imports.
		boxModel.setOperatorsSection(BoxModelOperatorsFactory::eINSTANCE.createBoxModelOperators());
		for(OperatorsImport opImp: defaultBoxModelDefinition.getOperatorsImportSection().getImports())
		{
			val Import bOpImp = BoxModelOperatorsFactory::eINSTANCE.createImport();
			bOpImp.setImportURI(opImp.getImportURI());
			boxModel.getOperatorsSection().getImports().add(bOpImp);
		}
		
		val EList<Grammar> correspondingGrammars = Xtext2BoxModelTransformationHelper::getCorrespondingGrammars(grammar);
		
		// Create terminal formatting rules.
		val EList<TerminalRule> terminalRules = Xtext2BoxModelTransformationHelper::getTerminalRules(correspondingGrammars);
		boxModel.getFormatting().getTerminalRuleFormattings().addAll(transformTerminalRules(terminalRules, defaultBoxModelDefinition.getTerminalRulesHeuristicSection()));
		boxModel.getFormatting().setDefaultTerminalRuleFormatting(transformDefaultTerminalRule(defaultBoxModelDefinition.terminalRulesHeuristicSection.^default));
		boxModel.getFormatting().getKeywordTerminalRuleFormattings().addAll(transformKeywordTerminalRules(defaultBoxModelDefinition.terminalRulesHeuristicSection()));
		
		// Modify parser formatting rules.
		modifyParserRuleFormattings(boxModel.getFormatting().getParserRuleFormatings(), defaultBoxModelDefinition.getParserRulesHeuristicSection());
	}
	
	def void modifyParserRuleFormattings(List<ParserRuleFormatting> parserRuleFormattings,ParserRuleHeuristicSection parserRuleHeuristicSection)
	{
		for(ParserRuleFormatting parserRule : parserRuleFormattings)
		{
			modifyParserRuleFormatting(parserRule, parserRuleHeuristicSection);
		}
	}
	
	def void modifyParserRuleFormatting(ParserRuleFormatting parserRuleFormatting, ParserRuleHeuristicSection parserRuleHeuristicSection)
	{
		 val Box box = modifyBox(parserRuleFormatting.getContent().content,parserRuleHeuristicSection.getRules());
		 if(parserRuleHeuristicSection.getRootRule().isOptional() && box instanceof gpp.boxmodel.boxModel.ParserRuleOperatorApplication)
		 {
			 parserRuleFormatting.setContent(box as gpp.boxmodel.boxModel.ParserRuleOperatorApplication); 
		 }
		 else
		 {
			 parserRuleFormatting.setContent(applyOperators(parserRuleHeuristicSection.getRootRule().getOperators(),box));
		 }
	}
	
	def gpp.boxmodel.boxModel.ParserRuleOperatorApplication applyOperators(List<OperatorApplication> operators, Box content)
	{
		var gpp.boxmodel.boxModel.ParserRuleOperatorApplication returnValue = null;
		var gpp.boxmodel.boxModel.ParserRuleOperatorApplication prevOperator = null;
		var gpp.boxmodel.boxModel.ParserRuleOperatorApplication currentOperator = null;
		for(OperatorApplication operator : operators)
		{
			currentOperator = transformParserRuleOperator(operator);
			if(returnValue == null) returnValue = currentOperator;
			if(prevOperator != null)
			{
				 prevOperator.setContent(currentOperator);
			}
			prevOperator = currentOperator;
		}
		prevOperator.setContent(content);
		return returnValue;
	}
	
	def Box modifySingleBox(Box box, List<ParserRuleHeuristic> heuristicRules)
	{	
		var Box returnValue = box;
		val ArrayList<Box> boxArray = new ArrayList<Box>(1);
		val ArrayList<OperatorApplication> operatorsToApply = new ArrayList<OperatorApplication>();
		boxArray.add(box);
		var List<ParserRuleHeuristic> tempHeuristicRules = heuristicRules;
		while(tempHeuristicRules != null && tempHeuristicRules.size() > 0)
		{
			val gpp.boxmodel.defaultboxmodel.DefaultBoxModelMatcherResult matchResult = matcher.match(boxArray, null, tempHeuristicRules);
			if(matchResult.matched())
			{
			operatorsToApply.addAll(matchResult.getMatchingRule().getOperators());
			}
			tempHeuristicRules = matchResult.getUnprocesedRules();
		}
		if(operatorsToApply.size() > 0)
		{
			returnValue = applyOperators(operatorsToApply, box);
		}
		return returnValue;
	}
	
	def dispatch Box modifyBox(Box box, List<ParserRuleHeuristic> heuristicRules)
	{
		return modifySingleBox(box, heuristicRules);
	}
	
	def dispatch Box modifyBox(MultipleBox box, List<ParserRuleHeuristic> heuristicRules)
	{
		var Box returnValue = modifyBoxInternal(box, heuristicRules);
		returnValue = modifySingleBox(returnValue,heuristicRules);
		return returnValue;
	}
	
	def dispatch Box modifyBox(GroupBox box, List<ParserRuleHeuristic> heuristicRules)
	{
		var Box returnValue = modifyBoxInternal(box, heuristicRules);
		returnValue = modifySingleBox(returnValue,heuristicRules);
		return returnValue;
	}
	
	def dispatch Box modifyBoxInternal(Box box, List<ParserRuleHeuristic> heuristicRules)
	{
		return box;
	}
	
	def dispatch Box modifyBoxInternal(MultipleBox box, List<ParserRuleHeuristic> heuristicRules)
	{
		val Box returnValue = box;
		var int i = 0;
		val elements = new ArrayList<Box>(box.getElements());
		box.elements.clear();
		while(i < elements.size())
		{
			var Box element = elements.get(i);
			element = modifyBox(element, heuristicRules);
			box.getElements().add(element);
			i = i+1;
		}
		return returnValue;
	}
	
	def dispatch Box modifyBoxInternal(GroupBox box, List<ParserRuleHeuristic> heuristicRules)
	{
		val Box returnValue = box;
		var List<Box> elements = new ArrayList<Box>(box.getElements());
		box.getElements().clear();
		elements = modifyElementList(elements, null, heuristicRules,heuristicRules);
		box.getElements().addAll(elements);
		if(elements.size == 1 &&
		elements.get(0) instanceof gpp.boxmodel.boxModel.ParserRuleOperatorApplication &&
		(elements.get(0) as gpp.boxmodel.boxModel.ParserRuleOperatorApplication).content instanceof GroupBox)
		{
			((elements.get(0) as gpp.boxmodel.boxModel.ParserRuleOperatorApplication).content as GroupBox).parenthesized = box.parenthesized;
			return elements.get(0);
		} 
		return returnValue;
	}

	def List<Box> modifyElementList(List<Box> elements, ParserRuleHeuristic heuristicRuleAppliedToWhole, List<ParserRuleHeuristic> heuristicRules, List<ParserRuleHeuristic> allHeuristicRules)
	{
		val gpp.boxmodel.defaultboxmodel.DefaultBoxModelMatcherResult matchResult = matcher.match(elements, heuristicRuleAppliedToWhole , heuristicRules);
		if(!matchResult.matched())
		{
			val List<Box> returnValue = new ArrayList<Box>();
			for(Box element : elements)
			{
				returnValue.add(modifyBoxInternal(element,allHeuristicRules));
			}
			return returnValue;
		}
		else
		{
			val List<Box> returnValue = new ArrayList<Box>();
			if(!(matchResult.getPrevRest() == null || matchResult.getPrevRest().isEmpty()))
			{
				val List<Box> subResult = modifyElementList(matchResult.getPrevRest(), null, matchResult.getUnprocesedRules(),allHeuristicRules);
				returnValue.addAll(subResult);
			}
			if(!(matchResult.getMatchedElements() == null || matchResult.getMatchedElements().isEmpty()))
			{
				
				val List<Box> subResult = modifyElementList(matchResult.getMatchedElements(), matchResult.getMatchingRule(), matchResult.getUnprocesedRules(), allHeuristicRules);
				val GroupBox groupBox = BoxModelFactory::eINSTANCE.createGroupBox();
				groupBox.getElements().addAll(subResult);
				returnValue.add(applyOperators(matchResult.getMatchingRule().getOperators(), groupBox));
			}
			if(!(matchResult.getPostRest() == null || matchResult.getPostRest().isEmpty()))
			{
				val List<ParserRuleHeuristic> postRestFormattingRules = new ArrayList<ParserRuleHeuristic>();
				postRestFormattingRules.add(matchResult.getMatchingRule());
				postRestFormattingRules.addAll(matchResult.getUnprocesedRules());
				val List<Box> subResult = modifyElementList(matchResult.getPostRest(), null, postRestFormattingRules, allHeuristicRules);
				returnValue.addAll(subResult);
			}
			return returnValue;
		}
	}
	
	def List<TerminalRuleFormatting> transformTerminalRules(List<TerminalRule> terminalRules,TerminalRuleHeuristicSection terminalRuleHeuristicSection)
	{
		val EList<TerminalRuleFormatting> returnValue = new BasicEList<TerminalRuleFormatting>();
		for(TerminalRule terminalRule : terminalRules)
		{
			var TerminalRuleHeuristic correspondingTerminalHeuristic = null;
			for(TerminalRuleHeuristic trh : terminalRuleHeuristicSection.getRules())
			{
				if(terminalRule.getName().equals(trh.getName()) && trh.getPattern() == null)
				{
					if(correspondingTerminalHeuristic == null)
					{
						correspondingTerminalHeuristic = trh;
					}
				}
			}
			if(correspondingTerminalHeuristic != null)
			{ 
				val TerminalRuleFormatting formatting = BoxModelFactory::eINSTANCE.createTerminalRuleFormatting();
				formatting.setRule(terminalRule);
				for(OperatorApplication operator : correspondingTerminalHeuristic.getOperators())
				{
					formatting.getContent().add(transformTerminalRuleOperator(operator));
				}
				returnValue.add(formatting);
			}
		}
		return returnValue;
	}
	
	def List<KeywordTerminalRuleFormatting> transformKeywordTerminalRules(TerminalRuleHeuristicSection terminalRuleHeuristicSection)
	{
		val EList<KeywordTerminalRuleFormatting> returnValue = new BasicEList<KeywordTerminalRuleFormatting>();
		for(TerminalRuleHeuristic trh : terminalRuleHeuristicSection.getRules())
		{
			if(trh.getPattern() !=null)
			{
				val KeywordTerminalRuleFormatting formatting = BoxModelFactory::eINSTANCE.createKeywordTerminalRuleFormatting();
				formatting.setName(trh.getName());
				formatting.setPattern(trh.getPattern());
				for(OperatorApplication operator : trh.getOperators())
				{
					formatting.getContent().add(transformTerminalRuleOperator(operator));
				}
				returnValue.add(formatting);
			}
		}
		return returnValue;
	}
	
	def DefaultTerminalRuleFormatting transformDefaultTerminalRule(DefaultTerminalRuleHeuristic defaultTerminalRuleHeuristic)
	{
		val  DefaultTerminalRuleFormatting formatting = BoxModelFactory::eINSTANCE.createDefaultTerminalRuleFormatting();
		formatting.setName("Default");
		for(OperatorApplication operator : defaultTerminalRuleHeuristic.getOperators())
		{
			formatting.getContent().add(transformTerminalRuleOperator(operator));
		}
		return formatting;
	}
	
	def gpp.boxmodel.boxModel.TerminalRuleOperatorApplication transformTerminalRuleOperator(OperatorApplication operator)
	{
		val gpp.boxmodel.boxModel.TerminalRuleOperatorApplication returnValue = BoxModelFactory::eINSTANCE.createTerminalRuleOperatorApplication();
		returnValue.setOperator(operator.getOperator());
		returnValue.getParameters().addAll(operator.getParameters());
		return returnValue;
	}
	
	def gpp.boxmodel.boxModel.ParserRuleOperatorApplication transformParserRuleOperator(OperatorApplication operator)
	{
		val gpp.boxmodel.boxModel.ParserRuleOperatorApplication returnValue = BoxModelFactory::eINSTANCE.createParserRuleOperatorApplication();
		returnValue.setOperator(operator.getOperator());
		returnValue.getParameters().addAll(operator.getParameters());
		return returnValue;
	}
}