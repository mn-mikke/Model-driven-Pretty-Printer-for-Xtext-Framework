package gpp.formatting;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCommentFormattingOperatorImplementation extends AbstractTransformingOperatorImplementation{
	protected abstract List<Row> getFormattedText();
	
	protected List<String> getContentAsSetOfWords()
	{
		String text = getText();
		String[] words = text.split("\\s");
		List<String> returnValue = new ArrayList<String>();
		for(int i = 0; i < words.length; i++)
		{
			if(!words[i].isEmpty())
			{
				returnValue.add(words[i]);
			}
		}
		return returnValue;
	}
	
	@Override
	public List<Row> getFormattedString(int indentingSize, boolean horizontally, int offset, int length) {
		return getFormattedText();
	}
	@Override
	public int getMaxRowSize(int indentingSize, boolean horizontally)
	{
		super.getMaxRowSize(indentingSize, horizontally);
		List<Row> formattedText = getFormattedText();
		int returnValue = 0;
		for(Row row : formattedText)
		{
			if(returnValue < row.getValue().length())
			{
				returnValue = row.getValue().length();
			}
		}
		return returnValue;
	}

	@Override
	public int getFirstRowSize(int indentingSize, boolean horizontally) {
		super.getFirstRowSize(indentingSize, horizontally);
		List<Row> formattedText = getFormattedText();
		if(formattedText.size() > 0)
		{
			return formattedText.get(0).getValue().length();
		}
		return 0;
	}

	@Override
	public int getLastRowSize(int indentingSize, boolean horizontally) {
		super.getLastRowSize(indentingSize, horizontally);
		List<Row> formattedText = getFormattedText();
		if(formattedText.size() > 0)
		{
			return formattedText.get(formattedText.size() -1).getValue().length();
		}
		return 0;
	}

	@Override
	public int getRowCount(int indentingSize) {
		super.getRowCount(indentingSize);
		List<Row> formattedText = getFormattedText();
		return formattedText.size();
	}

}
