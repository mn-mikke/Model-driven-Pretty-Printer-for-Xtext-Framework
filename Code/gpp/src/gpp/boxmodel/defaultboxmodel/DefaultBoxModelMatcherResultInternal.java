package gpp.boxmodel.defaultboxmodel;

import gpp.boxmodel.boxModel.Box;
import java.util.List;


public class DefaultBoxModelMatcherResultInternal {
	private List<Box> matchedElements;
	private List<Box> postRest;
	private boolean matched;
	

	public List<Box> getMatchedElements() {
		return matchedElements;
	}

	public List<Box> getPostRest() {
		return postRest;
	}

	
	public boolean matched()
	{
		return matched;
	}
	
	public DefaultBoxModelMatcherResultInternal(
			List<Box> matchedElements,
			List<Box> postRest)
	{
		this.matchedElements = matchedElements;
		this.postRest = postRest;
		this.matched = true;
	}
	
	public DefaultBoxModelMatcherResultInternal()
	{
		this.matched = false;
	}
}