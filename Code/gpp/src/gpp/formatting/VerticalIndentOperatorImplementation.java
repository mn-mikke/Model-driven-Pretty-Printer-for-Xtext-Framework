package gpp.formatting;


import gpp.boxmodel.operators.impl.IntParameterResult;
import gpp.boxmodel.operators.impl.ParameterResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VerticalIndentOperatorImplementation extends AbstractSinglePositionalOperatorImplementation 
{
	private static final String TOP_SPACING_COUNT_PARAMETER_NAME = "ts";
	private static final String BOTTOM_SPACING_COUNT_PARAMETER_NAME = "bs";
	
	protected int topSpacingCount = 1;
	protected int bottomSpacingCount = 1;
	

	protected void childrenCheck()
	{
		if(children.size() > 1)
		{
			throw new IllegalStateException("The operator contains more than one child.");
		}
	}
	
	@Override
	public List<Row> getFormattedString(int indentingSize, boolean horizontally, int offset, int length)
	{
		super.getFormattedString(indentingSize, horizontally, offset, length);
		childrenCheck();
		if(children.size() == 0)
		{
			return new ArrayList<Row>();
		}
		List<Row> returnValue = children.get(0).getFormattedString(indentingSize, horizontally, offset, length);
		if(isFirstClone())
		{
			List<Row> oldReturnValue = returnValue;
			returnValue = new ArrayList<Row>();
			for(int i = 0; i < topSpacingCount; i++)
			{
				returnValue.add(new Row(""));
			}
			returnValue.addAll(oldReturnValue);
		}
		if(isLastClone())
		{
			for(int i = 0; i < bottomSpacingCount; i++)
			{
				returnValue.add(new Row(""));
			}
		}
		return returnValue;
	}
	
	@Override
	public int getRowCount(int indentingSize)
	{
		super.getRowCount(indentingSize);
		childrenCheck();
		if(children.size() == 0)
		{
			return 0;
		}
		int returnValue = children.get(0).getRowCount(indentingSize);
		if(isFirstClone())
		{
			returnValue += topSpacingCount;
		}
		if(isLastClone())
		{
			returnValue += bottomSpacingCount;
		}
		return returnValue;
	}
	
	@Override
	public int getMaxRowSize(int indentingSize, boolean horizontally)
	{
		super.getMaxRowSize(indentingSize, horizontally);
		childrenCheck();
		if(children.size() == 0)
		{
			return 0;
		}
		return children.get(0).getMaxRowSize(indentingSize, horizontally);
	}

	
	@Override
	public int getFirstRowSize(int indentingSize, boolean horizontally)
	{
		super.getFirstRowSize(indentingSize, horizontally);
		childrenCheck();
		if(children.size() == 0)
		{
			return 0;
		}
		if(isFirstClone() && topSpacingCount > 0)
		{
			return 0;
		}
		return children.get(0).getFirstRowSize(indentingSize, horizontally);
	}
	
	
	
	@Override
	public int getLastRowSize(int indentingSize, boolean horizontally)
	{
		super.getLastRowSize(indentingSize, horizontally);
		childrenCheck();
		if(children.size() == 0)
		{
			return 0;
		}
		if(isLastClone() && bottomSpacingCount > 0)
		{
			return 0;
		}
		return children.get(0).getLastRowSize(indentingSize, horizontally);
	}
	

	@Override
	public void initialize(HashMap<String, ParameterResult> parameters) {
		super.initialize(parameters);
		if(parameters.containsKey(TOP_SPACING_COUNT_PARAMETER_NAME))
		{
			ParameterResult parameter = parameters.get(TOP_SPACING_COUNT_PARAMETER_NAME);
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
			topSpacingCount = value;
		}
		if(parameters.containsKey(BOTTOM_SPACING_COUNT_PARAMETER_NAME))
		{
			ParameterResult parameter = parameters.get(BOTTOM_SPACING_COUNT_PARAMETER_NAME);
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
			bottomSpacingCount = value;
		}
		clones = new ArrayList<ISingleChildTreeNode>(1);
		clones.add(this);
	}
	
	@Override 
	public ISingleChildTreeNode createCloneWithoutChildren(){
		ICompositeOperatorTreeNode parent = this.parent;
		if(parent instanceof ISingleChildTreeNode)
		{
			parent = ((ISingleChildTreeNode)parent).createCloneWithoutChildren();
		}
		VerticalIndentOperatorImplementation returnValue = new VerticalIndentOperatorImplementation();
		returnValue.parent = parent;
		returnValue.topSpacingCount = this.topSpacingCount;
		returnValue.bottomSpacingCount = this.bottomSpacingCount;
		returnValue.clones = this.clones;
		returnValue.name = name;
		returnValue.initialized = initialized;
		this.clones.add(returnValue);
		parent.getChildren().add(returnValue);
		return returnValue;
	}
}
