package gpp.boxmodel.operators.impl;

import gpp.boxmodel.operators.boxModelOperators.EnumAlternative;

public class EnumParameterResult extends ParameterResult
{
	private EnumAlternative value;
	
	public EnumAlternative getValue()
	{
		return value;
	}
	
	public EnumParameterResult(String parameterName, EnumAlternative value)
	{
		this.parameterName = parameterName;
		this.value = value;
	}

	@Override
	public Object getValueAsObject() {
		return value;
	}
}
