package gpp.formatting;

import gpp.boxmodel.boxModel.ParserRuleOperatorApplication;
import gpp.boxmodel.operators.boxModelOperators.ParameterApplication;
import gpp.boxmodel.operators.boxModelOperators.ParameterDefinition;
import gpp.boxmodel.operators.impl.ParameterResult;
import gpp.common.IDeclarativelyDefinedOperatorTreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractTransformingOperatorImplementation implements IOperatorTreeNode, IDeclarativelyDefinedOperatorTreeNode {
	protected INode node;
	
	protected boolean initialized = false;
	
	
	private List<AbstractTransformingOperatorImplementation> comments = new ArrayList<AbstractTransformingOperatorImplementation>(0);
	
	protected String getText()
	{
		return node.getText();
	}
	
	@Override
	public List<AbstractTransformingOperatorImplementation> getComments()
	{
		return this.comments;
	}

	@Override
	public boolean isRelevant(int offset, int length) {
		boolean isOutLeft =  node.getOffset() + node.getLength() <= offset;
		boolean isOutRight = offset + length <= node.getOffset();
		return !(isOutLeft || isOutRight);
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

	@Override
	public String getName() {
		return node.toString();
	}

	@Override
	public void setName(String name) {}
	
	public void initialize(INode node, HashMap<String,ParameterResult> parameters)
	{
		initialized = true;
		this.node = node;
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
