package gpp.highlighting

import org.eclipse.xtext.* 
import java.util.*
import gpp.boxmodel.boxModel.*
import gpp.boxmodel.operators.boxModelOperators.AliasOperatorDefinition
import gpp.boxmodel.operators.boxModelOperators.BasicOperatorDefinition
import gpp.boxmodel.operators.boxModelOperators.HighlightOperatorDefinition
import gpp.boxmodel.operators.boxModelOperators.PositionalOperatorDefinition
import gpp.boxmodel.operators.utils.BoxModelOperatorsHelper

class HighlightOperatorApplicationFinder {
	def List<ParserRuleOperatorApplication> getHighlightOperatorsFromParserRules(BoxModel boxModel)
	{
		val List<ParserRuleOperatorApplication> returnValue = new ArrayList<ParserRuleOperatorApplication>();
		for(ruleFormatting : boxModel.formatting.parserRuleFormatings)
		{
			findInParaserRuleFormatting(ruleFormatting, returnValue);
		}
		return returnValue;
	}	
	
	def void findInParaserRuleFormatting(ParserRuleFormatting formatting, List<ParserRuleOperatorApplication> result)
	{
	    findInBox(formatting.content,result);
	}
	
	def dispatch void findInBox(ParserRuleOperatorApplication operatorApplication, List<ParserRuleOperatorApplication> result)
	{
		if(BoxModelOperatorsHelper::isOperatorHighlight(operatorApplication.operator))
		{
			result.add(operatorApplication);
		}
		findInBox(operatorApplication.content, result);
	}
	
	def dispatch void findInBox(GroupBox box, List<ParserRuleOperatorApplication> result)
	{
		for(element : box.elements)
		{
			findInBox(element, result);
		}
	}
	
	def dispatch void findInBox(MultipleBox box, List<ParserRuleOperatorApplication> result)
	{
		for(element : box.elements)
		{
			findInBox(element, result);
		}
	}
	
	def dispatch void findInBox(AssignmentBox box, List<ParserRuleOperatorApplication> result)
	{
		findInBox(box.terminal, result);	
	}
	
	def dispatch void findInBox(Reference box, List<ParserRuleOperatorApplication> result)
	{
		return
	}
}