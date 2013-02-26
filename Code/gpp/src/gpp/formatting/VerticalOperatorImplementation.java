package gpp.formatting;

import gpp.boxmodel.operators.impl.IntParameterResult;
import gpp.boxmodel.operators.impl.ParameterResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VerticalOperatorImplementation extends AbstractPositionalOperatorImplementation
{
	private static final String SPACING_COUNT_PARAMETER_NAME = "vs";
	
	protected int spacingCount = 1;


	@Override
	public List<Row> getFormattedString(int indentingSize, boolean horizontally, int offset, int length)
	{
		super.getFormattedString(indentingSize, horizontally, offset, length);
		return getFormattedString(indentingSize, offset, length, children, spacingCount);
	}
	
	public static List<Row> getFormattedString(int indentingSize, int offset, int length, List<IOperatorTreeNode> children, int spacingCount)
	{
		List<Row> returnValue = new ArrayList<Row>();
		boolean isFirst = true;
		for(IOperatorTreeNode node : children)
		{
			if(node.isRelevant(offset, length) && node.getRowCount(indentingSize) > 0)
			{
				if(isFirst)
				{
					isFirst = false;
				}
				else
				{
					for (int i = 0; i < spacingCount - 1; i++) {
						returnValue.add(new Row(null));
					}
				}
				returnValue.addAll(node.getFormattedString(indentingSize, false, offset, length));
			}
		}
		return returnValue;
	}

	@Override
	public int getRowCount(int indentingSize)
	{
		super.getRowCount(indentingSize);
		return getRowCount(indentingSize, children, spacingCount);
	}

	public static int getRowCount(int indentingSize, List<IOperatorTreeNode> children, int spacingCount)
	{
		int returnValue = 0;
		for(IOperatorTreeNode node : children)
		{
			if(returnValue == 0)
			{
				returnValue = 1;
			}
			else
			{
				returnValue += spacingCount;
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
	public int getMaxRowSize(int indentingSize, boolean horizontally)
	{
		super.getMaxRowSize(indentingSize, horizontally);
		return getMaxRowSize(indentingSize, children);
	}
	
	public static int getMaxRowSize(int indentingSize, List<IOperatorTreeNode> children)
	{
		int returnValue = 0;
		for(IOperatorTreeNode node : children)
		{
			int nodeMaxRowSize = node.getMaxRowSize(indentingSize, false);
			if(returnValue < nodeMaxRowSize)
			{
				returnValue = nodeMaxRowSize;
			}
		}
		return returnValue;
	}
	
	@Override
	public int getFirstRowSize(int indentingSize, boolean horizontally)
	{
		super.getFirstRowSize(indentingSize, horizontally);
		return getFirstRowSize(indentingSize, children);
	}
	
	public static int getFirstRowSize(int indentingSize, List<IOperatorTreeNode> children)
	{
		if(children.size() == 0)
		{
			return 0;
		}
		return children.get(0).getFirstRowSize(indentingSize, false);
	}
	
	@Override
	public int getLastRowSize(int indentingSize, boolean horizontally)
	{
		super.getLastRowSize(indentingSize, horizontally);
		return getLastRowSize(indentingSize, children);
	}
	
	public static int getLastRowSize(int indentingSize, List<IOperatorTreeNode> children)
	{
		if(children.size() == 0)
		{
			return 0;
		}
		return children.get(children.size()-1).getLastRowSize(indentingSize, false);
	}

	@Override
	public void initialize(HashMap<String, ParameterResult> parameters) {
		super.initialize(parameters);
		if(parameters.containsKey(SPACING_COUNT_PARAMETER_NAME))
		{
			ParameterResult parameter = parameters.get(SPACING_COUNT_PARAMETER_NAME);
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
			spacingCount = value;
		}
	}
}
