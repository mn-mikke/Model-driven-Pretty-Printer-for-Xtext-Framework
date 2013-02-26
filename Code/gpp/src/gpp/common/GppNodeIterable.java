package gpp.common;

import org.eclipse.xtext.nodemodel.BidiIterable;
import org.eclipse.xtext.nodemodel.BidiIterator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.ReversedBidiIterable;

public class GppNodeIterable implements BidiIterable<INode> {
	
	private final INode startWith;
	private final INode continueWith;

	public GppNodeIterable(INode startWith, INode continueWith) {
		this.startWith = startWith;
		this.continueWith = continueWith;
	}

	public BidiIterator<INode> iterator() {
		return new GppNodeIterator(startWith,continueWith);
	}
	
	public BidiIterable<INode> reverse() {
		return new ReversedBidiIterable<INode>(this);
	}
}