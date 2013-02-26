package gpp.formatting;

public interface ITableOperatorImplementation {
	String getHorizontalSpacingCharacter();
	
	int getHorizontalSpacingCount();
	
	int getColumnSize(int indexingSize, int columnIndex);
	
	String getAlignment(int columnIndex);
	
	String getSupplementaryCharacter();
}
