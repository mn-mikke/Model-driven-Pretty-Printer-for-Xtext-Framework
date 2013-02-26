package gpp.boxmodel.operators.impl;

import gpp.boxmodel.operators.boxModelOperators.EnumAlternative;

public abstract class ParameterResult {
	
	protected String parameterName;
	
	public String getParameterName()
	{
		return parameterName;
	}
	
	public abstract Object getValueAsObject();
	
	public static ParameterResult createParameterResult(String parameterName, Integer value)
	{
		return new IntParameterResult(parameterName, value);
	}

	public static ParameterResult createParameterResult(String parameterName, String value)
	{
		return new StringParameterResult(parameterName, value);
	}
	
	public static ParameterResult createParameterResult(String parameterName, EnumAlternative value)
	{
		return new EnumParameterResult(parameterName, value);
	}
	
	public static ParameterResult createParameterResult(String parameterName, Object value)
	{
		if(value instanceof Integer)
		{
			return createParameterResult(parameterName, (Integer)value);
		}
		else if(value instanceof String)
		{
			return createParameterResult(parameterName, (String)value);
		}
		else if(value instanceof EnumAlternative)
		{
			return createParameterResult(parameterName, (EnumAlternative)value);
		}
		else
		{
			 throw new IllegalArgumentException("Unhandled parameter type: " + value.toString());
		}
	}
}
