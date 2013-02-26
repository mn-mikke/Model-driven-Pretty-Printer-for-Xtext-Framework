package gpp.boxmodel.defaultboxmodel;

import java.util.List;

import gpp.boxmodel.boxModel.Box;
import gpp.boxmodel.defaultboxmodel.defaultBoxModelDefinition.*;

public class DefaultBoxModelMatcherResult {
	private List<Box> prevRest;
	private List<Box> matchedElements;
	private List<Box> postRest;
	private List<ParserRuleHeuristic> unprocessedRules;
	private ParserRuleHeuristic matchingRule;
	
	public List<Box> getPrevRest()
	{
		return prevRest;
	}

	public List<Box> getMatchedElements() {
		return matchedElements;
	}

	public List<Box> getPostRest() {
		return postRest;
	}

	public List<ParserRuleHeuristic> getUnprocesedRules() {
		return unprocessedRules;
	}
	
	public void setUnprocessedRules(final List<ParserRuleHeuristic> unprocessedRules) {
		this.unprocessedRules = unprocessedRules;
	}

	public ParserRuleHeuristic getMatchingRule() {
		return matchingRule;
	}
	
	public boolean matched()
	{
		return matchedElements != null; 
	}
	
	public DefaultBoxModelMatcherResult(
			List<Box> prevRest,
			List<Box> matchedElements,
			List<Box> postRest,
			List<ParserRuleHeuristic> unprocessedRules,
			ParserRuleHeuristic matchingRule)
	{
		this.prevRest = prevRest;
		this.matchedElements = matchedElements;
		this.postRest = postRest;
		this.unprocessedRules = unprocessedRules;
		this.matchingRule = matchingRule;
	}
	
	public DefaultBoxModelMatcherResult(List<Box> prevRest)
	{
		this.prevRest = prevRest;
	}
}
