package gpp.formatting;

import gpp.boxmodel.operators.impl.ParameterResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class RowOperatorImplementation extends AbstractPositionalOperatorImplementation
{

	protected ITableOperatorImplementation tableOperator = null;
	
	public int getChildSize(int indexingSize, int childIndex)
	{
		IOperatorTreeNode child = getChild(childIndex);
		if(child != null)
		{
			return child.getMaxRowSize(indexingSize, true);
		}
		return 0;
	}
	
	public int getChildrenCount()
	{
		return children.size();
	}
	
	public IOperatorTreeNode getChild(int childIndex)
	{
		if(children.size() <= childIndex)
		{
			return null;
		}
		return children.get(childIndex);
	}
	
	@Override
	public List<Row> getFormattedString(int indexingSize, boolean horizontally, int offset, int length)
	{
		super.getFormattedString(indexingSize, horizontally, offset, length);
		if(parent != null && parent instanceof ITableOperatorImplementation)
		{
			tableOperator = (ITableOperatorImplementation)parent;
		}
		else
		{
			tableOperator = new NullTableOperatorImplementation(this);
		}
		int rowCount = getRowCount(indexingSize);
		List<Row> returnValue = new ArrayList<Row>(rowCount);
		
		List<List<Row>> childrenRepresentation = new ArrayList<List<Row>>();
		boolean first = true;
		for(IOperatorTreeNode node : children)
		{
			childrenRepresentation.add(node.getFormattedString(indexingSize, horizontally || !first, offset, length));
			first = false;
		}
		for(int i = 0; i < rowCount; i++)
		{
			String commentIndentation = "";
			int rowBound = getRowBound(childrenRepresentation, i);
			StringBuilder builder = new StringBuilder();
			List<AbstractTransformingOperatorImplementation> comments = new ArrayList<AbstractTransformingOperatorImplementation>();
			for(int j = 0; j < rowBound; j++)
			{
				String element = childrenRepresentation.get(j).get(i).getValue();
				if(!children.get(j).isRelevant(offset, length))
				{
					element = "";
				}
				else if(commentIndentation.equals(""))
				{
					commentIndentation = childrenRepresentation.get(j).get(i).getCommentIndentation();
				}
				String align = tableOperator.getAlignment(j);
				int columnSize = tableOperator.getColumnSize(indexingSize, j);
				int prefixCount = columnSize - element.length();
				int postfixCount = columnSize - element.length();
				if(align.equals("l"))
				{
					prefixCount = 0;
				}
				else if(align.equals("c"))
				{
					postfixCount = (postfixCount / 2) + (postfixCount % 2);
					prefixCount = prefixCount / 2;
				}
				else if(align.equals("r"))
				{
					postfixCount=0;
				}
				comments.addAll(childrenRepresentation.get(j).get(i).getComments());
				if(j < rowBound-1 || (j < rowBound && children.get(rowBound-1).isRelevant(offset, length)))
				{
					builder.append(cloneCharacter(tableOperator.getSupplementaryCharacter(), prefixCount));
				}
				builder.append(element);
				if(j < rowBound-2 || (j < rowBound-1 && children.get(rowBound-1).isRelevant(offset, length)))
				{
					builder.append(cloneCharacter(tableOperator.getSupplementaryCharacter(), postfixCount));
					builder.append(cloneCharacter(tableOperator.getHorizontalSpacingCharacter(), tableOperator.getHorizontalSpacingCount()));
				}
			}
			String rowValue = null;
			if(builder.length() > 0)
			{
				rowValue = builder.toString();
			}
			Row row = new Row(rowValue);
			row.getComments().addAll(comments);
			row.setCommentIndentation(commentIndentation);
			returnValue.add(row);
		}
		return returnValue;
	}
	
	protected int getRowBound(List<List<Row>> childrenRepresentation, int row)
	{
		int returnValue = childrenRepresentation.size();
		while(returnValue > 0)
		{
			List<Row> childRepresentation = childrenRepresentation.get(returnValue-1);
			if(childRepresentation.size() > row && childRepresentation.get(row) != null && !childRepresentation.get(row).isEmpty())
			{
				break;
			}
			returnValue--;
		}
		return returnValue;
	}
	
	@Override
	public int getRowCount(int indexingSize)
	{
		super.getRowCount(indexingSize);
		int returnValue = 0;
		for(IOperatorTreeNode node : children)
		{
			int nodeRowCount = node.getRowCount(indexingSize);
			if(returnValue < nodeRowCount)
			{
				returnValue = nodeRowCount;
			}
		}
		return returnValue;
	}
	
	protected int getSizeWithoutLast(int indexingSize)
	{
		if(parent != null && parent instanceof ITableOperatorImplementation)
		{
			tableOperator = (ITableOperatorImplementation)parent;
		}
		else
		{
			tableOperator = new NullTableOperatorImplementation(this);
		}
		int returnValue = 0;
		for(int i = 0; i < getChildrenCount() -1; i++)
		{
			returnValue += tableOperator.getColumnSize(indexingSize, i);
			returnValue += tableOperator.getHorizontalSpacingCount()*getLineSize(tableOperator.getHorizontalSpacingCharacter());
		}
		return returnValue;
	}
	
	@Override
	public int getMaxRowSize(int indexingSize, boolean horizontally)
	{
		super.getMaxRowSize(indexingSize, horizontally);
		if(getChildrenCount() == 0)
		{
			return 0;
		}
		return getSizeWithoutLast(indexingSize) + children.get(children.size()-1).getMaxRowSize(indexingSize, true);
	}
	
	@Override
	public int getFirstRowSize(int indexingSize, boolean horizontally)
	{
		super.getFirstRowSize(indexingSize, horizontally);
		if(getChildrenCount() == 0)
		{
			return 0;
		}
		return getSizeWithoutLast(indexingSize) + children.get(children.size()-1).getFirstRowSize(indexingSize, true);
	}
	
	
	@Override
	public int getLastRowSize(int indexingSize, boolean horizontally)
	{
		super.getLastRowSize(indexingSize, horizontally);
		if(getChildrenCount() == 0)
		{
			return 0;
		}
		return getSizeWithoutLast(indexingSize) + children.get(children.size()-1).getLastRowSize(indexingSize, true);
	}
	
	@Override
	public void initialize(HashMap<String, ParameterResult> parameters) {
		super.initialize(parameters);
		if(parent != null && parent instanceof ITableOperatorImplementation)
		{
			tableOperator = (ITableOperatorImplementation)parent;
		}
		else
		{
			tableOperator = new NullTableOperatorImplementation(this);
		}
	} 
		
}
