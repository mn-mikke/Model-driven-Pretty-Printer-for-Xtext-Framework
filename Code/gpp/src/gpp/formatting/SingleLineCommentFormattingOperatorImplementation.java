package gpp.formatting;

import gpp.boxmodel.operators.impl.IntParameterResult;
import gpp.boxmodel.operators.impl.ParameterResult;
import gpp.boxmodel.operators.impl.StringParameterResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.xtext.nodemodel.INode;

public class SingleLineCommentFormattingOperatorImplementation extends AbstractCommentFormattingOperatorImplementation
{
	private static final String LINE_PREFIX_PARAMETER_NAME = "bs";
	private static final String WORD_SEPARATOR_PARAMETER_NAME = "ws";
	private static final String MAX_ROW_SIZE_PARAMETER_NAME = "rs";
	
	private int maxRowSize = 80;
	private String wordSeparator = " ";
	private String linePrefix = "//";
	
	@Override
	protected String getText()
	{
		String text = super.getText();
		if(text.startsWith(linePrefix))
		{
			text = text.substring(linePrefix.length());
		}
		text = text.trim();
		return text;
	}
	
	@Override
	protected List<Row> getFormattedText()
	{
		List<Row> returnValue = new ArrayList<Row>();
		StringBuilder rowBuilder = new StringBuilder();
		List<String> words = getContentAsSetOfWords();
		rowBuilder.append(linePrefix);
		if(words.size() > 0)
		{
			rowBuilder.append(wordSeparator);
			rowBuilder.append(words.get(0));
		}
		for(int i = 1; i < words.size(); i++)
		{
			if(rowBuilder.length() + wordSeparator.length() + words.get(i).length() > maxRowSize)
			{
				returnValue.add(new Row(rowBuilder.toString()));
				rowBuilder = new StringBuilder();
				rowBuilder.append(linePrefix);

			}
			rowBuilder.append(wordSeparator);
			rowBuilder.append(words.get(i));
		}
		returnValue.add(new Row(rowBuilder.toString()));
		return returnValue;
	}
	
	@Override
	public void initialize(INode node, HashMap<String, ParameterResult> parameters) {
		super.initialize(node, parameters);
		if(parameters.containsKey(LINE_PREFIX_PARAMETER_NAME))
		{
			ParameterResult parameter = parameters.get(LINE_PREFIX_PARAMETER_NAME);
			if(!(parameter instanceof StringParameterResult))
			{
				throw new IllegalStateException(String.format("The parameter %s has not string value.",parameter.getParameterName()));
			}
			StringParameterResult stringParameter = (StringParameterResult)parameter;
			linePrefix = stringParameter.getValue();
		}
		if(parameters.containsKey(WORD_SEPARATOR_PARAMETER_NAME))
		{
			ParameterResult parameter = parameters.get(WORD_SEPARATOR_PARAMETER_NAME);
			if(!(parameter instanceof StringParameterResult))
			{
				throw new IllegalStateException(String.format("The parameter %s has not string value.",parameter.getParameterName()));
			}
			StringParameterResult stringParameter = (StringParameterResult)parameter;
			wordSeparator = stringParameter.getValue();
		}
		if(parameters.containsKey(MAX_ROW_SIZE_PARAMETER_NAME))
		{
			ParameterResult parameter = parameters.get(MAX_ROW_SIZE_PARAMETER_NAME);
			if(!(parameter instanceof IntParameterResult))
			{
				throw new IllegalStateException(String.format("The parameter %s has not integer value.", parameter.getParameterName()));
			}
			IntParameterResult intParameter = (IntParameterResult)parameter;
			int value = intParameter.getValue();
			if(value < 0)
			{
				throw new IllegalStateException(String.format("The value of the parameter %s is less than 0.", parameter.getParameterName()));
			}
			maxRowSize = value;
		}
	}
}
