package gpp.boxmodel.utils

import java.util.*
import gpp.boxmodel.operators.impl.*
import gpp.boxmodel.operators.boxModelOperators.*
import gpp.boxmodel.boxModel.*

class CurrentParameterValueFinder {
	
	ParameterResultProducer parameterResultProducer
	
	def  HashMap<String, ParameterResult> getCurrentParameterValues(ParserRuleOperatorApplication operatorApplication)
	{
		parameterResultProducer = new ParameterResultProducer();
		val HashMap<String, ParameterResult> returnValue = new HashMap<String, ParameterResult>();
		for(paramater : operatorApplication.parameters)
		{
			val ParameterResult parameterResult = parameterResultProducer.getParameterResult(paramater);
			returnValue.put(parameterResult.parameterName, parameterResult);
		}
		addOtherParameterValues(operatorApplication.operator,returnValue);
		return returnValue;
	}
	
	def  HashMap<String, ParameterResult> getCurrentParameterValues(TerminalRuleOperatorApplication operatorApplication)
	{
		parameterResultProducer = new ParameterResultProducer();
		val HashMap<String, ParameterResult> returnValue = new HashMap<String, ParameterResult>();
		for(paramater : operatorApplication.parameters)
		{
			val ParameterResult parameterResult = parameterResultProducer.getParameterResult(paramater);
			returnValue.put(parameterResult.parameterName, parameterResult);
		}
		addOtherParameterValues(operatorApplication.operator,returnValue);
		return returnValue;
	}
	
	def dispatch addOtherParameterValues(AliasOperatorDefinition operator, HashMap<String, ParameterResult> result)
	{
		for(paramater : operator.parameters)
		{
			val ParameterResult parameterResult = parameterResultProducer.getParameterResult(paramater);
			if(!result.containsKey(parameterResult.parameterName))
			{
				result.put(parameterResult.parameterName, parameterResult);
			}
		}
		addOtherParameterValues(operator.operator,result);
	}
	
	def dispatch addOtherParameterValues(BasicOperatorDefinition operator, HashMap<String, ParameterResult> result)
	{
		for(paramater : operator.parameters)
		{
			val ParameterResult parameterResult = parameterResultProducer.getParameterResult(paramater);
			if(!result.containsKey(parameterResult.parameterName))
			{
				result.put(parameterResult.parameterName, parameterResult);
			}
		}
	}

}