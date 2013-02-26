package gpp.formatting;

import java.util.List;


public interface IOperatorTreeNode {
	List<Row> getFormattedString(int indentingSize, boolean horizontally, int offset, int length);
	
	boolean isRelevant(int offset, int length);
	
	int getFirstRowSize(int indentingSize, boolean horizontally);
	
	int getLastRowSize(int indentingSize, boolean horizontally);
	
	int getMaxRowSize(int indentingSize, boolean horizontally);
	
	int getRowCount(int indentingSize);
	
	String getName();
	
	void setName(String name);
	
	List<AbstractTransformingOperatorImplementation> getComments();
	
}
