package gpp.common;

import java.util.NoSuchElementException;

import org.eclipse.xtext.nodemodel.BidiIterator;
import org.eclipse.xtext.nodemodel.INode;

import com.google.common.collect.UnmodifiableIterator;

public class GppNodeIterator extends UnmodifiableIterator<INode> implements BidiIterator<INode>{

	private final INode startWith;
	private INode lastReturned;
	private INode continueWith;
	private boolean followingSegment;

	public GppNodeIterator(INode startWith, INode continueWith) {
		this.startWith = startWith;
		this.continueWith = continueWith;
		this.followingSegment = continueWith != null;
	}

	public boolean hasNext() {
		return lastReturned == null || lastReturned.hasNextSibling() || this.followingSegment;
	}

	public INode next() {
		if (!hasNext())
			throw new NoSuchElementException();
		if (lastReturned == null) {
			lastReturned = startWith;
		} else {
			if(continueWith != null)
			{
				if(lastReturned.getNextSibling() == null)
				{
					lastReturned = continueWith;
					followingSegment = false;
				}
				else
				{
					lastReturned = lastReturned.getNextSibling();
				}
			}else{
				lastReturned = lastReturned.getNextSibling();
			}
		}
		return lastReturned;
	}

	public boolean hasPrevious() {
		return lastReturned == null || lastReturned.hasPreviousSibling() || this.followingSegment;
	}

	public INode previous() {
		if (!hasPrevious())
			throw new NoSuchElementException();
		if (lastReturned == null) {
			if(continueWith != null && continueWith.getParent() != null){
				lastReturned = continueWith.getParent().getLastChild();
			} else if (startWith.getParent() != null) {
				lastReturned = startWith.getParent().getLastChild();
			} else {
				lastReturned = startWith;
			}
		} else {
			if(continueWith != null)
			{
				if(lastReturned.getPreviousSibling() == null)
				{
					lastReturned = startWith.getParent().getLastChild();
					followingSegment = false;
				}
				else
				{
					lastReturned = lastReturned.getPreviousSibling();
				}
			}else{
				lastReturned = lastReturned.getPreviousSibling();
			}
		}
		return lastReturned;
	}
}