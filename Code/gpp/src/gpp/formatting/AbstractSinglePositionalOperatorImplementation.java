package gpp.formatting;

import java.util.List;

public abstract class AbstractSinglePositionalOperatorImplementation extends
		AbstractPositionalOperatorImplementation implements
		ISingleChildTreeNode {

	protected List<ISingleChildTreeNode> clones;

	protected boolean isFirstClone()
	{
		return clones.indexOf(this) == 0;
	}
	
	protected boolean isLastClone()
	{
		return clones.indexOf(this) == clones.size() - 1;
	}
	
	@Override
	public void setParent(ICompositeOperatorTreeNode parent)
	{
		for(ISingleChildTreeNode clone : clones)
		{
			AbstractSinglePositionalOperatorImplementation i = (AbstractSinglePositionalOperatorImplementation)clone;
			i.parent = parent;
		}
	}
	
	@Override
	public void setName(String name)
	{
		for(ISingleChildTreeNode clone : clones)
		{
			AbstractSinglePositionalOperatorImplementation i = (AbstractSinglePositionalOperatorImplementation)clone;
			i.name = name;
		}
	}
	

	@Override
	public List<ISingleChildTreeNode> getAllClones(){
		return clones;
	}
	
}
