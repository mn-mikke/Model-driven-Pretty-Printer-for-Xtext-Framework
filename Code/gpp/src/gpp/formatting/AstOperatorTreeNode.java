package gpp.formatting;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.ui.editor.XtextEditor;

public class AstOperatorTreeNode implements IOperatorTreeNode
{
	private INode node;
	
	private List<AbstractTransformingOperatorImplementation> comments = new ArrayList<AbstractTransformingOperatorImplementation>(0);
	
	public AstOperatorTreeNode(INode node)
	{
		this.node = node;
	}
	
	@Override
	public List<AbstractTransformingOperatorImplementation> getComments()
	{
		return this.comments;
	}
	
	@Override
	public List<Row> getFormattedString(int indentingSize, boolean horizontally, int offset, int length) {
		List<Row> returnValue = new ArrayList<Row>(1);
		Row row = new Row(node.getText().trim());
		row.getComments().addAll(comments);
		returnValue.add(row);
		return returnValue;
	}

	@Override
	public boolean isRelevant(int offset, int length) {
		boolean isOutLeft =  node.getOffset() + node.getLength() <= offset;
		boolean isOutRight = offset + length <= node.getOffset();
		return !(isOutLeft || isOutRight);
	}

	@Override
	public int getFirstRowSize(int indentingSize, boolean horizontally) {
		return getLineSize(node.getText().trim());
	}

	@Override
	public int getLastRowSize(int indentingSize, boolean horizontally) {
		return getLineSize(node.getText().trim());
	}

	@Override
	public int getMaxRowSize(int indentingSize, boolean horizontally)
	{
		return getLineSize(node.getText().trim());
	}
	
	protected int getTabSize()
	{
		XtextEditor text = (XtextEditor)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		int returnValue  = text.getXtextSourceViewerConfiguration().getTabWidth(null);
		return returnValue;
	}
	
	protected int getLineSize(String line)
	{
		char[] chars = line.toCharArray();
		int returnValue = 0;
		for(int i = 0; i < chars.length; i++)
		{
			if(chars[i] == '\t')
			{
				returnValue += getTabSize();
			}
			else
			{
				returnValue++;
			}
		}
		return returnValue;
	}
	
	@Override
	public int getRowCount(int indentingSize) {	
		return 1;
	}

	@Override
	public String getName() {
		return node.toString();
	}

	@Override
	public void setName(String name) {}
}
