package gpp.formatting;

import java.util.List;

public class NoFormattingCompositeOperatorTreeNode extends AbstractPositionalOperatorImplementation {

	@Override
	public List<Row> getFormattedString(int indentingSize, boolean horizontally, int offset, int length) {
		super.getFormattedString(indentingSize, horizontally, offset, length);
		return HorizontalOperatorImplementation.getFormattedString(indentingSize, horizontally, offset, length, children, 0, "");
	}
	
	@Override
	public int getRowCount(int indentingSize)
	{
		super.getRowCount(indentingSize);
		return HorizontalOperatorImplementation.getRowCount(indentingSize, children);
	}
	
	@Override
	public int getFirstRowSize(int indentingSize, boolean horizontally)
	{
		super.getFirstRowSize(indentingSize, horizontally);
		return HorizontalOperatorImplementation.getFirstRowSize(indentingSize, horizontally, children, 0, getLineSize(""));
	}
	
	@Override
	public int getLastRowSize(int indentingSize, boolean horizontally)
	{
		super.getLastRowSize(indentingSize, horizontally);
		return HorizontalOperatorImplementation.getLastRowSize(indentingSize, horizontally, children, 0, getLineSize(""));
	}
	
	@Override
	public int getMaxRowSize(int indentingSize,boolean horizontally)
	{
		super.getMaxRowSize(indentingSize, horizontally);
		return HorizontalOperatorImplementation.getMaxRowSize(indentingSize, horizontally, children, 0, getLineSize(""));
	}

}
