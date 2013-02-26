package gpp.boxmodel.operators.impl

import gpp.boxmodel.operators.boxModelOperators.*

class ParameterResultProducer {
	
	def getParameterResult(ParameterDefinition parameterDefinition)
	{
		return ParameterResult::createParameterResult(parameterDefinition.name, parameterDefinition.value);
	}
	
	def getParameterResult(ParameterApplication parameterApplication)
	{
		return ParameterResult::createParameterResult(parameterApplication.referencedParameter.name, getValue(parameterApplication.value));
	}
	
	def dispatch  Object getValue(IntParameterDefinition definition)
	{
		return getValue(definition.value);
	}
	
	def dispatch  Object getValue(StringParameterDefinition definition)
	{
		return getValue(definition.value);
	}
	
	def dispatch  Object getValue(EnumParameterDefinition definition)
	{
		return getValue(definition.value);
	}
	
	def dispatch  Object getValue(IntValue value)
	{
		return new Integer(value.value);
	}
	
	def dispatch Object getValue(StringValue value)
	{
		return value.value;
	}
	
	def dispatch Object getValue(IntConstantApplication value)
	{
		return new Integer(value.value.value);
	}
	
	def dispatch Object getValue(StringConstantApplication value)
	{
		return value.value.value;
	}
	
	def dispatch Object getValue(ConstantReferenceValue value)
	{
		return getValue(value.value);	
	}
	
	def dispatch Object getValue(IntConstant value)
	{
		return new Integer(value.value);
	}
	
	def dispatch Object getValue(StringConstant value)
	{
		return value.value;	
	}
	
	def dispatch Object getValue(EnumAlternative value)
	{
		return value;	
	}
}