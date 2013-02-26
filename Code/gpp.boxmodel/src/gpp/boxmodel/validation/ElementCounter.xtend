package gpp.boxmodel.validation

import gpp.boxmodel.boxModel.*
import org.eclipse.xtext.*

class ElementCounter {
	def dispatch int getBoxModelElementCount(ParserRuleOperatorApplication operatorApplication)
	{
		return operatorApplication.content.boxModelElementCount;
	}
	
	def dispatch int getBoxModelElementCount(Void box)
	{
		return 0;
	}
	
	def dispatch int getBoxModelElementCount(GroupBox box)
	{
		var int returnValue = 0;
		for(Box subBox : box.elements)
		{
			returnValue = returnValue + subBox.boxModelElementCount;	
		}
		return returnValue;
	}
	
	def dispatch int getBoxModelElementCount(MultipleBox box)
	{
		var int returnValue = 0;
		for(Box subBox : box.elements)
		{
			returnValue = returnValue + subBox.boxModelElementCount;	
		}
		return returnValue;
	}
	
	def dispatch int getBoxModelElementCount(AssignmentBox box)
	{
		return box.terminal.boxModelElementCount;
	}
	
	def dispatch int getBoxModelElementCount(Box box)
	{
		return 1;	
	}
	
	def dispatch int getXtextElementCount(Group group)
	{
		var int returnValue = 0;
		for(AbstractElement element : group.elements)
		{
			returnValue = returnValue + element.xtextElementCount;
		}
		return returnValue;
	}
	
	def dispatch int getXtextElementCount(Alternatives alternatives)
	{
		var int returnValue = 0;
		for(AbstractElement element : alternatives.elements)
		{
			returnValue = returnValue + element.xtextElementCount;
		}
		return returnValue;
	}
	
	def dispatch int getXtextElementCount(UnorderedGroup group)
	{
		var int returnValue = 0;
		for(AbstractElement element : group.elements)
		{
			returnValue = returnValue + element.xtextElementCount;
		}
		return returnValue;
	}
	
	def dispatch int getXtextElementCount(Assignment assignment)
	{
		return assignment.terminal.xtextElementCount
		
	}
	
	def dispatch int getXtextElementCount(Void element)
	{
		return 0;
	}
	
	def dispatch int getXtextElementCount(Action action)
	{
		return 0;
	}
	
	def dispatch int getXtextElementCount(AbstractElement element)
	{
		return 1;
	}
	
}