package gpp.boxmodel.utils

import gpp.boxmodel.boxModel.*
import java.util.*
import org.eclipse.xtext.util.*

class ParserRuleOperatorApplicationNameInjector {
	
	def void injectNames(BoxModel boxModel)
	{
		for(ParserRuleFormatting formatting : boxModel.getFormatting().getParserRuleFormatings())
		{
			val String ruleName = Strings::toFirstUpper(formatting.getRule().getName());
			addNameToParserRuleOperatorApplications(ruleName, 1, formatting.getContent());
		}
	}
	
	def dispatch addNameToParserRuleOperatorApplications(String prefix, int order, ParserRuleOperatorApplication operatorApplication)
	{
		val String operatorName = prefix + "." + String::valueOf(order);
		operatorApplication.setName(operatorName);
		addNameToParserRuleOperatorApplications(operatorName, 1, operatorApplication.getContent());
	}
		
	def dispatch addNameToParserRuleOperatorApplications(String prefix, int order, MultipleBox multipleBox)
	{
		addNameToParserRuleOperatorApplicationsInElements(prefix, order, multipleBox.elements);
	}
	
	def dispatch addNameToParserRuleOperatorApplications(String prefix, int order, GroupBox groupBox)
	{
		addNameToParserRuleOperatorApplicationsInElements(prefix, order, groupBox.elements);
	}
	
	
	def dispatch addNameToParserRuleOperatorApplications(String prefix, int order, Box box)
	{
		return
	}
	
	def addNameToParserRuleOperatorApplicationsInElements(String prefix, int order, List<Box> elements)
	{
		var int newOrder = order;
		var int prevCount = 0;
		for(Box box : elements)
		{
			newOrder = newOrder + prevCount;
			addNameToParserRuleOperatorApplications(prefix,newOrder,box);
			prevCount = box.countOfParserRuleOperatorApplications;
		}
	}
	
	def dispatch int getCountOfParserRuleOperatorApplications(ParserRuleOperatorApplication operator)
	{
		return 1;
	}
	
	def dispatch int getCountOfParserRuleOperatorApplications(MultipleBox box)
	{
		var int returnValue = 0;
		for(Box subBox : box.elements)
		{
			returnValue = returnValue + subBox.countOfParserRuleOperatorApplications;	
		}
		return returnValue;
	}
	
	def dispatch int getCountOfParserRuleOperatorApplications(GroupBox box)
	{
		var	int returnValue = 0;
		for(Box subBox : box.elements)
		{
			returnValue = returnValue + subBox.countOfParserRuleOperatorApplications;	
		}
		return  returnValue;
	}
	
	def dispatch int getCountOfParserRuleOperatorApplications(Box box)
	{
		return 0;
	}
	
}