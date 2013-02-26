package gpp.boxmodel.defaultboxmodel

import gpp.boxmodel.boxModel.*
import gpp.boxmodel.operators.boxModelOperators.*
import gpp.xtext2boxmodel.defaultFormatting.boxModelDefaultFormatting.*

import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.*

class Xtext2PlainBoxModelTransformer {
	def BoxModel transformToModel(Grammar grammar)
	{
		val BoxModel returnValue = BoxModelFactory::eINSTANCE.createBoxModel();
		val EList<Grammar> correspondingGrammars = Xtext2BoxModelTransformationHelper::getCorrespondingGrammars(grammar);
		returnValue.setFormatting(BoxModelFactory::eINSTANCE.createFormatting());
		
		// Create parser formatting rules.
		val EList<ParserRule> parserRules = Xtext2BoxModelTransformationHelper::getParserRules(correspondingGrammars);
		returnValue.getFormatting().getParserRuleFormatings().addAll((transformParserRules(parserRules)));
		return returnValue;
	}
	
	
	def EList<ParserRuleFormatting> transformParserRules(EList<ParserRule> parserRules)
	{
		val EList<ParserRuleFormatting> returnValue = new BasicEList<ParserRuleFormatting>();
		for(ParserRule parserRule : parserRules)
		{
			returnValue.add(transformParserRule(parserRule));
		}
		return returnValue;
	}
	
	def ParserRuleFormatting transformParserRule(ParserRule parserRule)
	{
		val ParserRuleFormatting returnValue = BoxModelFactory::eINSTANCE.createParserRuleFormatting();
		returnValue.setRule(parserRule);
		returnValue.setContent(BoxModelFactory::eINSTANCE.createParserRuleOperatorApplication());
		returnValue.getContent().setContent(transform(parserRule.getAlternatives()));
		return returnValue;
	}
	
	def dispatch Box transform(AbstractElement element)
	{
		return null; // TODO: Throw suitable exception.
	}
	
	def dispatch Box transform(Alternatives alternatives)
	{
		val returnValue = BoxModelFactory::eINSTANCE.createMultipleBox();
		returnValue.setType("|");
		returnValue.setParenthesized(!(alternatives.eContainer() instanceof ParserRule));
		for(AbstractElement element : alternatives.getElements())
		{
			if(!(element instanceof Action))
			{
				returnValue.getElements().add(transform(element));
			}
		}
		switch returnValue.getElements().size()
		{
			case 0: null
			case 1: returnValue.getElements().get(0)
			default: returnValue
		}
	}
	
	def dispatch Box transform(Group group)
	{
		val GroupBox returnValue = BoxModelFactory::eINSTANCE.createGroupBox();
		returnValue.setParenthesized(!(group.eContainer() instanceof ParserRule || group.eContainer() instanceof Alternatives || group.eContainer() instanceof UnorderedGroup));
		for(AbstractElement element : group.getElements())
		{
			if(!(element instanceof Action))
			{
				returnValue.getElements().add(transform(element));
			}
		}
		switch returnValue.getElements().size()
		{
			case 0: null
			case 1: returnValue.getElements().get(0)
			default: returnValue
		}
	}
	
	def dispatch Box transform(UnorderedGroup unorderedGroup)
	{
		val MultipleBox returnValue = BoxModelFactory::eINSTANCE.createMultipleBox();
		returnValue.setType("&");
		returnValue.setParenthesized(!(unorderedGroup.eContainer() instanceof ParserRule || unorderedGroup.eContainer() instanceof Alternatives));
		for(AbstractElement element : unorderedGroup.getElements())
		{
			if(!(element instanceof Action))
			{
				returnValue.getElements().add(transform(element));
			}
		}
		switch returnValue.getElements().size()
		{
			case 0: null
			case 1: returnValue.getElements().get(0)
			default: returnValue
		}
	}
	
	def dispatch Box transform(Assignment assignment)
	{
		val AssignmentBox returnValue = BoxModelFactory::eINSTANCE.createAssignmentBox();
		returnValue.setAssignment(assignment);
		returnValue.setTerminal(transform(assignment.getTerminal()));
		return returnValue;
	}
	
	def dispatch Box transform(RuleCall ruleCall)
	{
		val Reference returnValue = BoxModelFactory::eINSTANCE.createReference();
		returnValue.setElement(ruleCall);
		return returnValue;
	}
	
	def dispatch Box transform(Keyword keyword)
	{
		val Reference returnValue = BoxModelFactory::eINSTANCE.createReference();
		returnValue.setElement(keyword);
		return returnValue;
	}
	
	def dispatch Box transform(CrossReference crossReference)
	{
		val Reference returnValue = BoxModelFactory::eINSTANCE.createReference();
		returnValue.setElement(crossReference);
		return returnValue;
	}
}