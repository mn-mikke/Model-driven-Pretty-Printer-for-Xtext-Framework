package gpp.formatting;

import gpp.boxmodel.boxModel.ParserRuleOperatorApplication;
import gpp.boxmodel.operators.boxModelOperators.ParameterApplication;
import gpp.boxmodel.operators.boxModelOperators.ParameterDefinition;
import gpp.boxmodel.operators.impl.ParameterResult;
import gpp.common.IDeclarativelyDefinedOperatorTreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractPositionalOperatorImplementation implements ICompositeOperatorTreeNode, IDeclarativelyDefinedOperatorTreeNode
{
	protected boolean initialized = false;
	
	protected String name;
	
	protected ICompositeOperatorTreeNode parent;
	
	protected List<IOperatorTreeNode> children = new ArrayList<IOperatorTreeNode>();
	
	private List<AbstractTransformingOperatorImplementation> comments = new ArrayList<AbstractTransformingOperatorImplementation>(0);

	@Override
	public boolean isRelevant(int offset, int length) {
		for(IOperatorTreeNode node : children)
		{
			if(node.isRelevant(offset, length))
			{
				return true;
			}
		}
		return false;
	}
	
	protected static int getTabSize()
	{
		XtextEditor text = (XtextEditor)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		int returnValue  = text.getXtextSourceViewerConfiguration().getTabWidth(null);
		return returnValue;
	}
	
	protected int getLineSize(StringBuilder builder)
	{
		return getLineSize(builder.toString());
	}
	
	protected int getLineSize(String line)
	{
		return getLineSizeStatically(line);
	}
	
	public static int getLineSizeStatically(String line)
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
	public List<AbstractTransformingOperatorImplementation> getComments()
	{
		return this.comments;
	}
	
	public void initialize(HashMap<String,ParameterResult> parameters)
	{
		initialized = true;
	}
	
	@Override
	public List<Row> getFormattedString(int indentingSize, boolean horizontally, int offset, int length) {
		if(!initialized)
		{
			throw new IllegalStateException("Object is not initialized.");
		}
		return null;
	}

	@Override
	public ICompositeOperatorTreeNode getParent() {
		return parent;
	}

	@Override
	public void setParent(ICompositeOperatorTreeNode parent) {
		this.parent = parent;
	}

	@Override
	public List<IOperatorTreeNode> getChildren() {
		return children;
	}
	
	@Override
	public String getName()
	{
		return name;
	}
	
	@Override
	public void setName(String name)
	{
		this.name = name;
	}
	
	@Override
	public int getMaxRowSize(int indentingSize, boolean horizontally)
	{
		if(!initialized)
		{
			throw new IllegalStateException("Object is not initialized.");
		}
		return 0;
	}

	@Override
	public int getFirstRowSize(int indentingSize, boolean horizontally) {
		if(!initialized)
		{
			throw new IllegalStateException("Object is not initialized.");
		}
		return 0;
	}

	@Override
	public int getLastRowSize(int indentingSize, boolean horizontally) {
		if(!initialized)
		{
			throw new IllegalStateException("Object is not initialized.");
		}
		return 0;
	}

	@Override
	public int getRowCount(int indentingSize) {
		if(!initialized)
		{
			throw new IllegalStateException("Object is not initialized.");
		}
		return 0;
	}
	
	protected String cloneCharacter(String character, int multiplicity)
	{
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < multiplicity; i++)
		{
			builder.append(character);
		}
		return builder.toString();
	}

	@Override
	public void checkParameterDefinition(
			AbstractDeclarativeValidator validator,
			ParameterDefinition parameterDefinition) {
		
	}

	@Override
	public void checkParameterApplication(
			AbstractDeclarativeValidator validator,
			ParameterApplication parameterApplication) {
		
	}

	@Override
	public void checkParserRuleOperatorApplicaton(
			AbstractDeclarativeValidator validator,
			ParserRuleOperatorApplication operatorApplication) {
		
	}

}
