package gpp.formatting;

import gpp.boxmodel.operators.impl.EnumParameterResult;
import gpp.boxmodel.operators.impl.IntParameterResult;
import gpp.boxmodel.operators.impl.ParameterEnumValues;
import gpp.boxmodel.operators.impl.ParameterResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IndentOperatorImplementation extends AbstractSinglePositionalOperatorImplementation 
{
	private static final String SPACING_CHARACTER_PARAMETER_NAME = "ic";
	private static final String SPACING_COUNT_PARAMETER_NAME = "is";
	
	protected int spacingCount = 3;
	protected String spacingCharacter = " ";
	

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
		int incrementOfIndentingSize = this.getLineSize(spacingCharacter)*spacingCount;
		if(horizontally) incrementOfIndentingSize =0; 
		List<Row> returnValue = children.get(0).getFormattedString(indentingSize+incrementOfIndentingSize, horizontally, offset, length);
		if(!horizontally)
		{
			for(int i = 0; i < returnValue.size(); i++)
			{
				Row row = returnValue.get(i);
				if(row != null)
				{
					String rowValue = row.getValue();
					StringBuilder builder = new StringBuilder();
					for(int j = 0; j < spacingCount; j++)
					{
						builder.append(spacingCharacter);
					}
					String indentation = builder.toString();
					builder.append(rowValue);
					rowValue = builder.toString();
					Row newRow = new Row(rowValue);
					newRow.getComments().addAll(row.getComments());
					newRow.setCommentIndentation(indentation + row.getCommentIndentation());
					returnValue.set(i,newRow);
				}
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
		int incrementOfIndentingSize = this.getLineSize(spacingCharacter)*spacingCount;
		return children.get(0).getRowCount(indentingSize+incrementOfIndentingSize);
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
		int incrementOfIndentingSize = this.getLineSize(spacingCharacter)*spacingCount;
		if(horizontally) incrementOfIndentingSize =0; 
		int returnValue = children.get(0).getMaxRowSize(incrementOfIndentingSize+indentingSize,horizontally);
		if(!horizontally)
		{
			returnValue += spacingCount*getLineSize(spacingCharacter);
		}
		return returnValue;
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
		int incrementOfIndentingSize = this.getLineSize(spacingCharacter)*spacingCount;
		if(horizontally) incrementOfIndentingSize =0; 
		int returnValue = children.get(0).getFirstRowSize(indentingSize+incrementOfIndentingSize, horizontally);
		if(!horizontally)
		{
			returnValue += spacingCount*getLineSize(spacingCharacter);
		}
		return returnValue;
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
		int incrementOfIndentingSize = this.getLineSize(spacingCharacter)*spacingCount;
		if(horizontally) incrementOfIndentingSize =0; 
		int returnValue = children.get(0).getLastRowSize(indentingSize+incrementOfIndentingSize, horizontally);
		if(!horizontally)
		{
			returnValue += spacingCount*getLineSize(spacingCharacter);
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
			if(value < 1)
			{
				throw new IllegalStateException(String.format("The value of the parameter %s is less than 1.", parameter.getParameterName()));
			}
			spacingCount = value;
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
		IndentOperatorImplementation returnValue = new IndentOperatorImplementation();
		returnValue.parent = parent;
		returnValue.spacingCharacter = this.spacingCharacter;
		returnValue.spacingCount = this.spacingCount;
		returnValue.clones = this.clones;
		returnValue.name = name;
		returnValue.initialized = initialized;
		this.clones.add(returnValue);
		parent.getChildren().add(returnValue);
		return returnValue;
	}
}
