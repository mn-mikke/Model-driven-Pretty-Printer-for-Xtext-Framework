package gpp.formatting;

import java.util.List;

public interface ICompositeOperatorTreeNode extends IOperatorTreeNode
{	
	ICompositeOperatorTreeNode getParent();
	
	void setParent(ICompositeOperatorTreeNode  parent);
	
	List<IOperatorTreeNode> getChildren();
	
}
