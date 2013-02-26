package gpp.formatting;

import gpp.boxmodel.operators.impl.EnumParameterResult;
import gpp.boxmodel.operators.impl.IntParameterResult;
import gpp.boxmodel.operators.impl.ParameterEnumValues;
import gpp.boxmodel.operators.impl.ParameterResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HorizontalIfPossibleOperatorImplementation extends AbstractPositionalOperatorImplementation
{
	private static final String HORIZONTAL_SPACING_CHARACTER_PARAMETER_NAME = "hc";
	private static final String HORIZONTAL_SPACING_COUNT_PARAMETER_NAME = "hs";
	private static final String VERTICAL_SPACING_COUNT_PARAMETER_NAME = "vs";
	private static final String MAX_ROW_SIZE_PARAMETER_NAME = "rs";
	
	protected int horizontalSpacingCount = 1;
	protected int verticalSpacingCount = 1;
	protected String horizontalSpacingCharacter = " ";
	protected int maxRowSize = 80;

	
	@Override
	public List<Row> getFormattedString(int indentingSize, boolean horizontally, int offset, int length)
	{
		super.getFormattedString(indentingSize, horizontally, offset, length);
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
					if(getLineSize(rowBuilder) + horizontalSpacingCount*getLineSize(horizontalSpacingCharacter) + getLineSize(nodeValue.get(0).getValue()) > maxRowSize - indentingSize)
					{
						Row row = new Row(rowBuilder.toString());
						row.getComments().addAll(comments);
						row.setCommentIndentation(commentIndentation);
						returnValue.add(row);
						for(int i = 0; i < verticalSpacingCount - 1; i++)
						{
							returnValue.add(new Row(null));
						}
						rowBuilder = new StringBuilder();
						comments.clear();
						commentIndentation = "";
						nodeValue = node.getFormattedString(indentingSize, false, offset, length);
					}
					else
					{
						for (int i = 0; i < horizontalSpacingCount; i++) {
							rowBuilder.append(horizontalSpacingCharacter);
						}
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
		int returnValue = 0;
		int rowSize=0;
		for(IOperatorTreeNode node : children)
		{
			int nodeRowCount = node.getRowCount(indentingSize);
			if(nodeRowCount >0)
			{
				if(returnValue == 0)
				{
					returnValue = 1;
					rowSize += node.getLastRowSize(indentingSize, true);
				}
				else
				{
					rowSize += horizontalSpacingCount*getLineSize(horizontalSpacingCharacter) + node.getFirstRowSize(indentingSize, true);
				}
				if(rowSize > maxRowSize - indentingSize)
				{
					returnValue += verticalSpacingCount;
					rowSize = 0;
				}
				if(nodeRowCount > 1)
				{
					returnValue += nodeRowCount - 1;
					rowSize = node.getLastRowSize(indentingSize, false);
				}
			}
		}
		return returnValue;
	}
	
	@Override
	public int getMaxRowSize(int indentingSize, boolean horizontally)
	{
		super.getMaxRowSize(indentingSize, horizontally);
		int returnValue = 0;
		int currentRowSize = 0;
		boolean isFirst = true;
		for(IOperatorTreeNode node : children)
		{
			boolean nodeHorizontally = horizontally || !isFirst;
			isFirst = false;
			if(currentRowSize > 0)
			{
				if(currentRowSize + horizontalSpacingCount*getLineSize(horizontalSpacingCharacter) + node.getFirstRowSize(indentingSize, nodeHorizontally) > maxRowSize - indentingSize)
				{
					if(currentRowSize > returnValue)
					{
						returnValue = currentRowSize;
					}
					nodeHorizontally = false;
				}
			}
			else
			{
				currentRowSize += horizontalSpacingCount*getLineSize(horizontalSpacingCharacter);
			}
			if(node.getRowCount(indentingSize) > 1)
			{
				currentRowSize += node.getFirstRowSize(indentingSize, nodeHorizontally);
				if(returnValue < currentRowSize)
				{
					returnValue = currentRowSize;
				}
				int nodeMaxRowSize = node.getMaxRowSize(indentingSize, nodeHorizontally);
				if(returnValue < nodeMaxRowSize)
				{
					returnValue = nodeMaxRowSize;
				}
				currentRowSize = 0;
			}
			currentRowSize += node.getLastRowSize(indentingSize, nodeHorizontally);
		}
		if(returnValue < currentRowSize)
		{
			returnValue = currentRowSize;
		}
		return returnValue;
	}
	
	@Override
	public int getFirstRowSize(int indentingSize, boolean horizontally)
	{
		super.getFirstRowSize(indentingSize, horizontally);
		int returnValue = 0;
		boolean isFirst = true;
		for(IOperatorTreeNode node : children)
		{
			int nodeFirstRowSize = node.getFirstRowSize(indentingSize, horizontally || !isFirst);
			if(isFirst)
			{
				isFirst = false;
			}
			else
			{
				if(returnValue + horizontalSpacingCount*getLineSize(horizontalSpacingCharacter) + nodeFirstRowSize > maxRowSize - indentingSize )
				{
					break;
				}
				returnValue += horizontalSpacingCount*getLineSize(horizontalSpacingCharacter);
			}
			returnValue += nodeFirstRowSize;
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
		int returnValue = 0;
		boolean isFirst = true;
		for(IOperatorTreeNode node : children)
		{
			if(node.getRowCount(indentingSize) > 1)
			{
				isFirst = true;
				returnValue = 0;
			}
			int nodeLastRowSize = node.getLastRowSize(indentingSize, horizontally || !isFirst);
			if(isFirst)
			{
				isFirst = false;
			}
			else
			{
				if(returnValue + horizontalSpacingCount*getLineSize(horizontalSpacingCharacter) + nodeLastRowSize > maxRowSize - indentingSize)
				{
					returnValue = 0;
					isFirst = true;
					nodeLastRowSize = node.getLastRowSize(indentingSize, false);
				}
				else
				{
					returnValue += horizontalSpacingCount*getLineSize(horizontalSpacingCharacter);
				}
			}
			returnValue += nodeLastRowSize;

		}
		return returnValue;
	}
	
	@Override
	public void initialize(HashMap<String, ParameterResult> parameters) {
		super.initialize(parameters);
		
		if(parameters.containsKey(HORIZONTAL_SPACING_CHARACTER_PARAMETER_NAME))
		{
			ParameterResult parameter = parameters.get(HORIZONTAL_SPACING_CHARACTER_PARAMETER_NAME);
			if(!(parameter instanceof EnumParameterResult))
			{
				throw new IllegalStateException(String.format("The parameter %s has not enum value.", parameter.getParameterName()));
			}
			EnumParameterResult enumParameter = (EnumParameterResult)parameter;
			if(enumParameter.getValue().getName().equals(ParameterEnumValues.HORIZONAL_SPACING_TABULATOR))
			{
				horizontalSpacingCharacter = "\t";
			}
			else if(enumParameter.getValue().getName().equals(ParameterEnumValues.HORIZONAL_SPACING_WHITE_SPACE))
			{
				horizontalSpacingCharacter = " ";
			}
			else
			{
				throw new IllegalStateException(String.format("Value of parameter %s is not supported.", parameter.getParameterName()));
			}
		}
		
		if(parameters.containsKey(HORIZONTAL_SPACING_COUNT_PARAMETER_NAME))
		{
			ParameterResult parameter = parameters.get(HORIZONTAL_SPACING_COUNT_PARAMETER_NAME);
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
			horizontalSpacingCount = value;
		}
		
		if(parameters.containsKey(VERTICAL_SPACING_COUNT_PARAMETER_NAME))
		{
			ParameterResult parameter = parameters.get(VERTICAL_SPACING_COUNT_PARAMETER_NAME);
			if(!(parameter instanceof IntParameterResult))
			{
				throw new IllegalStateException(String.format("The parameter %s has not integer value.",parameter.getParameterName()));
			}
			IntParameterResult intParameter = (IntParameterResult)parameter;
			int value = intParameter.getValue();
			if(value < 1)
			{
				throw new IllegalStateException(String.format("The value of the parameter %s is less than 1.", parameter.getParameterName()));
			}
			verticalSpacingCount = value;
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
