package gpp.boxmodel.operators.impl;

public final class IntParameterResult extends  ParameterResult 
{
	private int value;
	
	public int getValue()
	{
		return value;
	}
	
	public IntParameterResult(String parameterName, int value)
	{
		this.parameterName = parameterName;
		this.value = value;
	}

	@Override
	public Object getValueAsObject() {
		return new Integer(value);
	}
}
