package gpp.formatting;

import gpp.boxmodel.operators.impl.EnumParameterResult;
import gpp.boxmodel.operators.impl.IntParameterResult;
import gpp.boxmodel.operators.impl.ParameterEnumValues;
import gpp.boxmodel.operators.impl.ParameterResult;
import gpp.boxmodel.operators.impl.StringParameterResult;

import java.util.HashMap;
import java.util.List;

public class TableOperatorImplementation extends AbstractPositionalOperatorImplementation implements ITableOperatorImplementation
{
	private static final String HORIZONTAL_SPACING_CHARACTER_PARAMETER_NAME = "hc";
	private static final String HORIZONTAL_SPACING_COUNT_PARAMETER_NAME = "hs";
	private static final String VERTICAL_SPACING_COUNT_PARAMETER_NAME = "vs";
	private static final String SUPPLEMETARY_CHARACTER_PARAMETER_NAME = "sc";
	private static final String ALIGNMENT_CHARACTER_PARAMETER_NAME = "al";
	
	protected int horizontalSpacingCount = 1;
	protected int verticalSpacingCount = 1;
	protected String horizontalSpacingCharacter = " ";
	protected String supplementaryCharacter = " ";
	protected String alignment = "l";
	
	
	@Override
	public List<Row> getFormattedString(int indentingSize, boolean horizontally, int offset, int length)
	{
		super.getFormattedString(indentingSize, horizontally, offset, length);
		setChildrenParent();
		List<Row> returnValue;
		returnValue = VerticalOperatorImplementation.getFormattedString(indentingSize, offset, length, children, verticalSpacingCount);
		return returnValue;
	}
	
	protected void setChildrenParent()
	{
		for(IOperatorTreeNode child: children)
		{
			if(child instanceof RowOperatorImplementation)
			{
				((RowOperatorImplementation)child).setParent(this);
			}
			else if(child instanceof TableOperatorImplementation)
			{
				((TableOperatorImplementation)child).setParent(this);
			}
		}
	}
	
	@Override
	public String getHorizontalSpacingCharacter()
	{
		return horizontalSpacingCharacter;
	}
	
	@Override
	public int getHorizontalSpacingCount()
	{
		return horizontalSpacingCount;
	}
	
	@Override
	public String getSupplementaryCharacter()
	{
		return supplementaryCharacter;
	}
	
	@Override
	public String getAlignment(int columnIndex)
	{
		if(alignment.length() <= columnIndex)
		{
			return alignment.substring(alignment.length() - 1, alignment.length());
		}
		else
		{
			return alignment.substring(columnIndex, columnIndex+1);
		}
	}
	
	@Override
	public int getColumnSize(int indexingSize, int columnIndex)
	{
		if(parent != null && parent instanceof TableOperatorImplementation)
		{
			return ((TableOperatorImplementation)parent).getColumnSize(indexingSize, columnIndex);
		}
		else
		{
			return getChildSize(indexingSize, columnIndex);
		}
	}
	
	public int getChildSize(int indexingSize,int columnIndex)
	{
		int returnValue = 0;
		for(IOperatorTreeNode node : children)
		{
			if(node instanceof RowOperatorImplementation)
			{
				int nodeColumnSize = ((RowOperatorImplementation)node).getChildSize(indexingSize, columnIndex);
				if(returnValue < nodeColumnSize)
				{
					returnValue = nodeColumnSize;
				}
			}
			if(node instanceof TableOperatorImplementation)
			{
				int nodeColumnSize = ((TableOperatorImplementation)node).getChildSize(indexingSize, columnIndex);
				if(returnValue < nodeColumnSize)
				{
					returnValue = nodeColumnSize;
				}
			}
		}
		return returnValue;
	}
	
	
	
	@Override
	public int getRowCount(int indentingSize)
	{
		super.getRowCount(indentingSize);
		int returnValue;
		returnValue = VerticalOperatorImplementation.getRowCount(indentingSize, children, verticalSpacingCount);
		return returnValue;
	}
	
	
	@Override
	public int getMaxRowSize(int indentingSize, boolean horizontally)
	{
		super.getMaxRowSize(indentingSize, horizontally);
		int returnValue;
		returnValue = VerticalOperatorImplementation.getMaxRowSize(indentingSize, children);
		return returnValue;
	}
	
	@Override
	public int getFirstRowSize(int indentingSize, boolean horizontally)
	{
		super.getFirstRowSize(indentingSize, horizontally);
		int returnValue;
		returnValue = VerticalOperatorImplementation.getFirstRowSize(indentingSize, children);
		return returnValue;
	}
	
	
	@Override
	public int getLastRowSize(int indentingSize, boolean horizontally)
	{
		super.getLastRowSize(indentingSize, horizontally);
		int returnValue;
		returnValue = VerticalOperatorImplementation.getLastRowSize(indentingSize, children);
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
		
		if(parameters.containsKey(SUPPLEMETARY_CHARACTER_PARAMETER_NAME))
		{
			ParameterResult parameter = parameters.get(SUPPLEMETARY_CHARACTER_PARAMETER_NAME);
			if(!(parameter instanceof EnumParameterResult))
			{
				throw new IllegalStateException(String.format("The parameter %s has not enum value.", parameter.getParameterName()));
			}
			EnumParameterResult enumParameter = (EnumParameterResult)parameter;
			if(enumParameter.getValue().getName().equals(ParameterEnumValues.HORIZONAL_SPACING_TABULATOR))
			{
				supplementaryCharacter = "\t";
			}
			else if(enumParameter.getValue().getName().equals(ParameterEnumValues.HORIZONAL_SPACING_WHITE_SPACE))
			{
				supplementaryCharacter = " ";
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
			if(value < 1)
			{
				throw new IllegalStateException(String.format("The value of the parameter %s is less than 1.", parameter.getParameterName()));
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
		
		if(parameters.containsKey(ALIGNMENT_CHARACTER_PARAMETER_NAME))
		{
			ParameterResult parameter = parameters.get(ALIGNMENT_CHARACTER_PARAMETER_NAME);
			if(!(parameter instanceof StringParameterResult))
			{
				throw new IllegalStateException(String.format("The parameter %s has not string value.",parameter.getParameterName()));
			}
			StringParameterResult strParameter = (StringParameterResult)parameter;
			String value = strParameter.getValue();
			if(value.isEmpty())
			{
				throw new IllegalStateException(String.format("The value of the parameter %s is empty string.", parameter.getParameterName()));
			}
			if(!value.matches("^(l|c|r)*$"))
			{
				throw new IllegalStateException(String.format("The value of the parameter %s contain a different character from 'l','c','r'.", parameter.getParameterName()));
			}
			alignment = value;
		}
	}
}
