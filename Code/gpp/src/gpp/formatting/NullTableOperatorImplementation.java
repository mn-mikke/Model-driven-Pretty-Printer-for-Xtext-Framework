package gpp.formatting;

public class NullTableOperatorImplementation implements ITableOperatorImplementation
{
    RowOperatorImplementation rowOperator;
    
    public NullTableOperatorImplementation(RowOperatorImplementation rowOperator)
    {
    	this.rowOperator = rowOperator;
    }
	
	@Override
	public String getHorizontalSpacingCharacter() {
    	return " ";
	}

	@Override
	public int getHorizontalSpacingCount() {
		return 1;
	}

	@Override
	public int getColumnSize(int indexingSize, int columnIndex) {
		return rowOperator.getChildSize(indexingSize, columnIndex);
	}
	
	@Override
	public String getSupplementaryCharacter()
	{
		return " ";
	}

	@Override
	public String getAlignment(int columnIndex) {
		return "l";
	}

}
