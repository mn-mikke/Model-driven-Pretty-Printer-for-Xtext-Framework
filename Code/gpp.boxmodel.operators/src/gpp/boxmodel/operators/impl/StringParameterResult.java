package gpp.boxmodel.operators.impl;

public class StringParameterResult extends ParameterResult
{
	private String value;
	
	public String getValue()
	{
		return value;
	}
	
	public StringParameterResult(String parameterName, String value)
	{
		this.parameterName = parameterName;
		this.value = value;
	}

	@Override
	public Object getValueAsObject() {
		return value;
	}
}
