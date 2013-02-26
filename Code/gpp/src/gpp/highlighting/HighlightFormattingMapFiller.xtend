package gpp.highlighting

import java.util.HashMap
import gpp.boxmodel.boxModel.*
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.naming.IQualifiedNameProvider
import gpp.boxmodel.operators.utils.BoxModelOperatorsHelper

class HighlightFormattingMapFiller {
	
	BoxModel boxModel
	IQualifiedNameProvider qualifiedNameProvider
	HashMap<QualifiedName,String> map
	boolean initialized
	
	def initialize(BoxModel boxModel, IQualifiedNameProvider qualifiedNameProvider, HashMap<QualifiedName,String> map)
	{
		this.boxModel = boxModel;
		this.qualifiedNameProvider = qualifiedNameProvider;
		this.map = map;
		initialized = true;
	}
	
	def fill()
	{
		if(!initialized)
		{
			throw new IllegalStateException("Object is not initialized");
		}
		for(formatting : boxModel.formatting.parserRuleFormatings)
		{
			addElement(formatting.content, "");
		}
	}
	
	def dispatch void addElement(ParserRuleOperatorApplication operator, String operatorId)
	{
		var String newOperatorId = operatorId;
		if(BoxModelOperatorsHelper::isOperatorHighlight(operator.operator))
		{
			newOperatorId = operator.name.toLowerCase();
		}
		addElement(operator.content, newOperatorId);
	}
	
	def dispatch void addElement(MultipleBox multipleBox, String operatorId)
	{
		for(box : multipleBox.elements)
		{
			addElement(box, operatorId);
		}
	}
	
	def dispatch void addElement(GroupBox groupBox, String operatorId)
	{
		for(box : groupBox.elements)
		{
			addElement(box, operatorId);
		}
	}
	
	def dispatch void addElement(AssignmentBox assignmentBox, String operatorId)
	{
		addElement(assignmentBox.terminal, operatorId);
	}
	
	def dispatch void addElement(Reference reference, String operatorId)
	{
		if(!operatorId.equals(""))
		{
			val QualifiedName name = qualifiedNameProvider.getFullyQualifiedName(reference.element);
			map.put(name, operatorId);
		}
	}
}