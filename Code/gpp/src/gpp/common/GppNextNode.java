package gpp.common;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.BidiTreeIterable;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;

public class GppNextNode implements INode
{
	private final INode innerNode;
	private final boolean hasFollowingNode;
	
	
	public GppNextNode(INode innerNode, boolean hasFollowingNode)
	{
		this.innerNode = innerNode;
		this.hasFollowingNode = hasFollowingNode;
	}
	
	public INode getInnerNode()
	{
		return innerNode;
	}
	
	@Override
	public ICompositeNode getParent() {
		return innerNode.getParent();
	}

	@Override
	public boolean hasSiblings() {
		return innerNode.hasSiblings();
	}

	@Override
	public boolean hasPreviousSibling() {
		return innerNode.hasPreviousSibling() || hasFollowingNode;
	}

	@Override
	public boolean hasNextSibling() {
		return innerNode.hasNextSibling() || hasFollowingNode;
	}

	@Override
	public INode getPreviousSibling() {
		return innerNode.getPreviousSibling();
	}

	@Override
	public INode getNextSibling() {
		return innerNode.getNextSibling();
	}

	@Override
	public ICompositeNode getRootNode() {
		return innerNode.getRootNode();
	}

	@Override
	public Iterable<ILeafNode> getLeafNodes() {
		return innerNode.getLeafNodes();
	}

	@Override
	public int getTotalOffset() {
		return innerNode.getTotalOffset();
	}

	@Override
	public int getOffset() {
		return innerNode.getOffset();
	}

	@Override
	public int getTotalLength() {
		return innerNode.getTotalLength();
	}

	@Override
	public int getLength() {
		return innerNode.getLength();
	}

	@Override
	public int getTotalEndOffset() {
		return innerNode.getTotalEndOffset();
	}

	@Override
	public int getTotalStartLine() {
		return innerNode.getTotalStartLine();
	}

	@Override
	public int getStartLine() {
		return innerNode.getStartLine();
	}

	@Override
	public int getTotalEndLine() {
		return innerNode.getTotalEndLine();
	}

	@Override
	public int getEndLine() {
		return innerNode.getEndLine();
	}

	@Override
	public String getText() {
		return innerNode.getText();
	}

	@Override
	public EObject getGrammarElement() {
		return innerNode.getGrammarElement();
	}

	@Override
	public EObject getSemanticElement() {
		return innerNode.getSemanticElement();
	}

	@Override
	public boolean hasDirectSemanticElement() {
		return innerNode.hasDirectSemanticElement();
	}

	@Override
	public SyntaxErrorMessage getSyntaxErrorMessage() {
		return innerNode.getSyntaxErrorMessage();
	}

	@Override
	public BidiTreeIterable<INode> getAsTreeIterable() {
		return innerNode.getAsTreeIterable();
	}
	

}
