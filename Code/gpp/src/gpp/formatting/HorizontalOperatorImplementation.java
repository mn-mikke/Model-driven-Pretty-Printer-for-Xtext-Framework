package gpp.formatting;

import gpp.boxmodel.operators.impl.EnumParameterResult;
import gpp.boxmodel.operators.impl.IntParameterResult;
import gpp.boxmodel.operators.impl.ParameterEnumValues;
import gpp.boxmodel.operators.impl.ParameterResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class HorizontalOperatorImplementation extends AbstractPositionalOperatorImplementation
{
	private static final String SPACING_CHARACTER_PARAMETER_NAME = "hc";
	private static final String SPACING_COUNT_PARAMETER_NAME = "hs";
	
	protected int spacingCount = 1;
	protected String spacingCharacter = " ";

	@Override
	public List<Row> getFormattedString(int indentingSize, boolean horizontally, int offset, int length)
	{
		super.getFormattedString(indentingSize, horizontally, offset, length);
		return getFormattedString(indentingSize, horizontally, offset, length, children, spacingCount, spacingCharacter);
	}
	
	public static List<Row> getFormattedString(int indentingSize, boolean horizontally, int offset, int length, List<IOperatorTreeNode> children, int spacingCount, String spacingCharacter)
	{
		List<Row> returnValue = new ArrayList<Row>();
		StringBuilder rowBuilder = new StringBuilder();
		List<AbstractTransformingOperatorImplementation> comments = new ArrayList<AbstractTransformingOperatorImplementation>(0);
		boolean isFirst = true;
		String commentIndentation = "";
		for(IOperatorTreeNode node : children)
		{
			int nodeRowCount = node.getRowCount(indentingSize);
			if(node.isRelevant(offset, length) && nodeRowCount > 0)
			{
				List<Row> nodeValue = node.getFormattedString(indentingSize, horizontally || !isFirst, offset, length);
				if(isFirst)
				{
					isFirst = false;
				}
				else
				{
					for (int i = 0; i < spacingCount; i++) {
						rowBuilder.append(spacingCharacter);
					}
				}
				
				rowBuilder.append(nodeValue.get(0).getValue());
				comments.addAll(nodeValue.get(0).getComments());
				commentIndentation = nodeValue.get(0).getCommentIndentation();
				if(nodeRowCount > 1)
				{
					Row row = new Row(rowBuilder.toString());
					row.getComments().addAll(comments);
					row.setCommentIndentation(commentIndentation);
					returnValue.add(row);
					rowBuilder = new StringBuilder();
					comments.clear();
					rowBuilder.append(nodeValue.get(nodeValue.size()-1).getValue());
					comments.addAll(nodeValue.get(nodeValue.size()-1).getComments());
					commentIndentation = nodeValue.get(nodeValue.size()-1).getCommentIndentation();
					for(int i = 1; i < nodeValue.size()-1; i++)
					{
						returnValue.add(nodeValue.get(i));
					}
				}
			}
		}
		if(rowBuilder.length() > 0)
		{
			Row row = new Row(rowBuilder.toString());
			row.getComments().addAll(comments);
			row.setCommentIndentation(commentIndentation);
			returnValue.add(row);
		}
		return returnValue;
	}
	
	@Override
	public int getRowCount(int indentingSize)
	{
		super.getRowCount(indentingSize);
		return getRowCount(indentingSize, children);
	}
	
	public static int getRowCount(int indentingSize, List<IOperatorTreeNode> children)
	{
		int returnValue = 0;
		for(IOperatorTreeNode node : children)
		{
			if(returnValue == 0)
			{
				returnValue = 1;
			}
			int nodeRowCount = node.getRowCount(indentingSize);
			if(nodeRowCount > 1)
			{
				returnValue += nodeRowCount - 1;
			}
		}
		return returnValue;
	}
	
	@Override
	public int getFirstRowSize(int indentingSize, boolean horizontally)
	{
		super.getFirstRowSize(indentingSize, horizontally);
		return getFirstRowSize(indentingSize, horizontally, children, spacingCount, getLineSize(spacingCharacter));
	}
	
	@Override
	public int getMaxRowSize(int indentingSize, boolean horizontally)
	{
		super.getMaxRowSize(indentingSize, horizontally);
		return getMaxRowSize(indentingSize, horizontally, children, spacingCount, getLineSize(spacingCharacter));
	}
	
	public static int getMaxRowSize(int indentingSize, boolean horizontally, List<IOperatorTreeNode> children, int spacingCount, int spacingCharacterSize)
	{
		int returnValue = 0;
		int currentRowSize = 0;
		boolean first = true;
		for(IOperatorTreeNode node : children)
		{
			if(currentRowSize > 0)
			{
				currentRowSize += spacingCount*spacingCharacterSize;
			}
			if(node.getRowCount(indentingSize) > 1)
			{
				currentRowSize += node.getFirstRowSize(indentingSize, horizontally || !first);
				if(returnValue < currentRowSize)
				{
					returnValue = currentRowSize;
				}
				int nodeMaxRowSize = node.getMaxRowSize(indentingSize, horizontally || !first);
				if(returnValue < nodeMaxRowSize)
				{
					returnValue = nodeMaxRowSize;
				}
				currentRowSize = 0;
			}
			currentRowSize += node.getLastRowSize(indentingSize, horizontally || !first);
			first = false;
		}
		if(returnValue < currentRowSize)
		{
			returnValue = currentRowSize;
		}
		return returnValue;
	}
	
	public static int getFirstRowSize(int indentingSize, boolean horizontally, List<IOperatorTreeNode> children, int spacingCount, int spacingCharacterSize)
	{
		int returnValue = 0;
		boolean isFirst = true;
		for(IOperatorTreeNode node : children)
		{
			if(isFirst)
			{
				isFirst = false;
				returnValue += node.getFirstRowSize(indentingSize, horizontally);
			}
			else
			{
				returnValue += spacingCount*spacingCharacterSize;
				returnValue += node.getFirstRowSize(indentingSize, true);
			}
			if(node.getRowCount(indentingSize) > 1)
			{
				break;
			}
		}
		return returnValue;
	}
	
	@Override
	public int getLastRowSize(int indentingSize, boolean horizontally)
	{
		super.getLastRowSize(indentingSize, horizontally);
		return getLastRowSize(indentingSize, horizontally, children, spacingCount, getLineSize(spacingCharacter));
	}
	
	public static int getLastRowSize(int indentingSize, boolean horizontally, List<IOperatorTreeNode> children, int spacingCount, int spacingCharacterSize)
	{
		int returnValue = 0;
		boolean isFirst = true;
		for(IOperatorTreeNode node : children)
		{
			if(node.getRowCount(indentingSize) > 1)
			{
				isFirst = true;
				returnValue = 0;
			}
			if(isFirst)
			{
				isFirst = false;
				returnValue += node.getLastRowSize(indentingSize,horizontally);
			}
			else
			{
				returnValue += spacingCount*spacingCharacterSize;
				returnValue += node.getLastRowSize(indentingSize, true);
			}

		}
		return returnValue;
	}
	


	@Override
	public void initialize(HashMap<String, ParameterResult> parameters) {
		super.initialize(parameters);
		if(parameters.containsKey(SPACING_CHARACTER_PARAMETER_NAME))
		{
			ParameterResult parameter = parameters.get(SPACING_CHARACTER_PARAMETER_NAME);
			if(!(parameter instanceof EnumParameterResult))
			{
				throw new IllegalStateException(String.format("The parameter %s has not enum value.", parameter.getParameterName()));
			}
			EnumParameterResult enumParameter = (EnumParameterResult)parameter;
			if(enumParameter.getValue().getName().equals(ParameterEnumValues.HORIZONAL_SPACING_TABULATOR))
			{
				spacingCharacter = "\t";
			}
			else if(enumParameter.getValue().getName().equals(ParameterEnumValues.HORIZONAL_SPACING_WHITE_SPACE))
			{
				spacingCharacter = " ";
			}
			else
			{
				throw new IllegalStateException(String.format("Value of parameter %s is not supported.", parameter.getParameterName()));
			}
		}
		if(parameters.containsKey(SPACING_COUNT_PARAMETER_NAME))
		{
			ParameterResult parameter = parameters.get(SPACING_COUNT_PARAMETER_NAME);
			if(!(parameter instanceof IntParameterResult))
			{
				throw new IllegalStateException(String.format("The parameter %s has not integer value.",parameter.getParameterName()));
			}
			IntParameterResult intParameter = (IntParameterResult)parameter;
			int value = intParameter.getValue();
			if(value < 0)
			{
				throw new IllegalStateException(String.format("The value of the parameter %s is less than 0.", parameter.getParameterName()));
			}
			spacingCount = value;
		}
	}
}
