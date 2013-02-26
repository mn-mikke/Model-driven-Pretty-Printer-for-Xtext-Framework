package gpp.boxmodel.scoping;

public class GppCrossReferenceStringCleaner implements ICrossReferenceStringCleaner
{
	
	protected static final String[] QUOTES = new String[]{"'", "\""};
	protected static final String[] BLANKS = new String[]{" ","\t", "\n"};
	
	public String clean(String crossReferenceString)
	{
		String returnValue = crossReferenceString;
		returnValue = normalizeCrossReference(returnValue);
		returnValue = removeQuotes(returnValue);
		return returnValue;
	}
	
	protected String removeQuotes(String crossReferenceString)
	{
		if (crossReferenceString == null) return null;
		String returnValue;
		returnValue = crossReferenceString;
		if(returnValue.startsWith(QUOTES[0]) && returnValue.endsWith(QUOTES[0]) || returnValue.startsWith(QUOTES[1]) && returnValue.endsWith(QUOTES[1]))
		{
			returnValue = returnValue.substring(1, returnValue.length() - 1);
		}
		return returnValue;
	}
	
	protected String removeBlanks(String crossReferenceString)
	{
		if(crossReferenceString == null) return null;
		String returnValue = crossReferenceString;
		for(int i =0; i < BLANKS.length; i++)
		{
			returnValue = returnValue.replace(BLANKS[i], "");
		}
		return returnValue;
	}
	
	protected String normalizeCrossReference(String crossReferenceString)
	{
		if (crossReferenceString == null) return null;
		String returnValue = crossReferenceString;
		if (returnValue.matches("^(\\[)(\\s)*((\\^)?([a-zA-Z_])(\\w)*(\\s)*([:]{2})(\\s)*)?((\\^)?([a-zA-Z_])(\\w)*)(\\s)*(\\])$"))
		{
			returnValue = returnValue.substring(0,returnValue.length()-1) + "|ID]";
			returnValue = removeBlanks(returnValue);
		}
		return returnValue;
	}
}
