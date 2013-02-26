package gpp.formatting;

import java.util.List;

public interface ISingleChildTreeNode extends ICompositeOperatorTreeNode
{
	ISingleChildTreeNode createCloneWithoutChildren();
	
	List<ISingleChildTreeNode> getAllClones();
}
