package gpp.boxmodel.utils

import gpp.boxmodel.boxModel.*
import java.util.*
import org.eclipse.xtext.naming.*


class ReferenceTableProvider {
	
	IQualifiedNameProvider qualifiedNameProvider
	
	boolean initialized
	
	def initialize(IQualifiedNameProvider qualifiedNameProvider)
	{
		this.qualifiedNameProvider = qualifiedNameProvider;
		initialized = true;
	}
	
	def getReferenceTable(BoxModel boxModel)
	{
		if(!initialized)
		{
			throw new IllegalStateException("The object is not initilized.");
		}
		val HashMap<QualifiedName, Reference> returnValue = new HashMap<QualifiedName, Reference>();
	 	for(formatting : boxModel.formatting.parserRuleFormatings)
	 	{
	 		addReference(formatting.content, returnValue);	
	 	}
		return returnValue;
	}
	
	def dispatch void addReference(MultipleBox multipleBox, HashMap<QualifiedName, Reference> destinationMap)
	{
		for(box : multipleBox.elements)
		{
			addReference(box, destinationMap);
		}
	}
	
	def dispatch void addReference(GroupBox groupBox, HashMap<QualifiedName, Reference> destinationMap)
	{
		for(box : groupBox.elements)
		{
			addReference(box, destinationMap);
		}
	}
	
	def dispatch void addReference(AssignmentBox box, HashMap<QualifiedName, Reference> destinationMap)
	{
		addReference(box.terminal, destinationMap);
	}
	
	def dispatch void addReference(ParserRuleOperatorApplication box, HashMap<QualifiedName, Reference> destinationMap)
	{
		addReference(box.content, destinationMap);
	}
	
	def dispatch void addReference(Reference reference, HashMap<QualifiedName, Reference> destinationMap)
	{
		val element = reference.element;
		val elementName = qualifiedNameProvider.getFullyQualifiedName(element);
		destinationMap.put(elementName, reference);
	}
}