package gpp.formatting;

import gpp.boxmodel.operators.impl.EnumParameterResult;
import gpp.boxmodel.operators.impl.IntParameterResult;
import gpp.boxmodel.operators.impl.ParameterEnumValues;
import gpp.boxmodel.operators.impl.ParameterResult;

import java.util.HashMap;
import java.util.List;

public class HorizontalOrVerticalOperatorImplementation extends AbstractPositionalOperatorImplementation
{
	private static final String HORIZONTAL_SPACING_CHARACTER_PARAMETER_NAME = "hc";
	private static final String HORIZONTAL_SPACING_COUNT_PARAMETER_NAME = "hs";
	private static final String VERTICAL_SPACING_COUNT_PARAMETER_NAME = "vs";
	private static final String MAX_ROW_SIZE_PARAMETER_NAME = "rs";
	
	protected int horizontalSpacingCount = 1;
	protected int verticalSpacingCount = 1;
	protected String horizontalSpacingCharacter = " ";
	protected int maxRowSize = 80;
	protected boolean horizontalMode;
	
	protected boolean worksInHorizontalMode(int indentingSize)
	{
		int rowSize = 0;
		boolean isFirst = true;
		for(IOperatorTreeNode node : children)
		{
			if(node.getRowCount(indentingSize) > 0)
			{
				if(isFirst)
				{
					isFirst = false;
					rowSize += node.getLastRowSize(indentingSize,false);
				}
				else
				{
					rowSize += horizontalSpacingCount*getLineSize(horizontalSpacingCharacter);
					rowSize += node.getFirstRowSize(indentingSize,true);
					if(rowSize > maxRowSize - indentingSize)
					{
						return false;
					}
					if(node.getRowCount(indentingSize) > 1)
					{
						rowSize = node.getLastRowSize(indentingSize,false);
					}
				}
			}
		}
		return true;
	}
	
	@Override
	public List<Row> getFormattedString(int indentingSize, boolean horizontally, int offset, int length)
	{
		super.getFormattedString(indentingSize, horizontally, offset, length);
		List<Row> returnValue;
		horizontalMode = worksInHorizontalMode(indentingSize);
		if(horizontalMode)
		{
			returnValue = HorizontalOperatorImplementation.getFormattedString(indentingSize, horizontally, offset, length, children, horizontalSpacingCount, horizontalSpacingCharacter);
		}
		else
		{
			returnValue = VerticalOperatorImplementation.getFormattedString(indentingSize, offset, length, children, verticalSpacingCount);
		}
		return returnValue;
	}
	
	@Override
	public int getRowCount(int indentingSize)
	{
		super.getRowCount(indentingSize);
		int returnValue;
		horizontalMode = worksInHorizontalMode(indentingSize);
		if(horizontalMode)
		{
			returnValue = HorizontalOperatorImplementation.getRowCount(indentingSize, children);
		}
		else
		{
			returnValue = VerticalOperatorImplementation.getRowCount(indentingSize, children, verticalSpacingCount);
		}
		return returnValue;
	}
	
	@Override
	public int getMaxRowSize(int indentingSize, boolean horizontally)
	{
		super.getMaxRowSize(indentingSize, horizontally);
		int returnValue;
		horizontalMode = worksInHorizontalMode(indentingSize);
		if(horizontalMode)
		{
			returnValue = HorizontalOperatorImplementation.getMaxRowSize(indentingSize, horizontally, children, horizontalSpacingCount, getLineSize(horizontalSpacingCharacter));
		}
		else
		{
			returnValue = VerticalOperatorImplementation.getMaxRowSize(indentingSize, children);
		}
		return returnValue;		
	}
	
	
	@Override
	public int getFirstRowSize(int indentingSize, boolean horizontally)
	{
		super.getFirstRowSize(indentingSize, horizontally);
		int returnValue;
		horizontalMode = worksInHorizontalMode(indentingSize);
		if(horizontalMode)
		{
			returnValue = HorizontalOperatorImplementation.getFirstRowSize(indentingSize, horizontally, children, horizontalSpacingCount, getLineSize(horizontalSpacingCharacter));
		}
		else
		{
			returnValue = VerticalOperatorImplementation.getFirstRowSize(indentingSize, children);
		}
		return returnValue;
	}
	
	
	@Override
	public int getLastRowSize(int indentingSize, boolean horizontally)
	{
		super.getLastRowSize(indentingSize, horizontally);
		int returnValue;
		horizontalMode = worksInHorizontalMode(indentingSize);
		if(horizontalMode)
		{
			returnValue = HorizontalOperatorImplementation.getLastRowSize(indentingSize, horizontally, children, horizontalSpacingCount, getLineSize(horizontalSpacingCharacter));
		}
		else
		{
			returnValue = VerticalOperatorImplementation.getLastRowSize(indentingSize, children);
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
		
		horizontalMode = true;
	}
}
