/**
 * 
 */
package it.xtypes.runtime.util;

import it.xtypes.runtime.RuleApplicationTrace;
import it.xtypes.runtime.RuleFailedException;
import it.xtypes.runtime.RuntimeRule;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.xtext.util.PolymorphicDispatcher;

/**
 * @author Lorenzo Bettini
 * 
 */
public class TraceToString {
	private PolymorphicDispatcher<Void> traceDispatcher = PolymorphicDispatcher
			.createForSingleTarget("build", 3, 3, this);

	public String traceAsString(RuleFailedException ruleFailedException) {
		List<String> trace = buildTrace(ruleFailedException);
		StringBuffer buffer = new StringBuffer();
		for (String string : trace) {
			buffer.append(string);
		}
		return buffer.toString();
	}

	public List<String> buildTrace(RuleFailedException ruleFailedException) {
		return buildTrace(ruleFailedException.getRuleApplicationTrace());
	}

	public List<String> buildTrace(RuntimeRule runtimeRule) {
		return buildTrace(runtimeRule.getRuleApplicationTrace());
	}

	public List<String> buildTrace(RuleApplicationTrace ruleApplicationTrace) {
		LinkedList<String> trace = new LinkedList<String>();
		buildTrace(trace, ruleApplicationTrace, 0);
		return trace;
	}

	protected void buildTrace(LinkedList<String> trace, Object object, int inc) {
		traceDispatcher.invoke(trace, object, inc);
	}

	protected void build(LinkedList<String> trace,
			RuleApplicationTrace ruleApplicationTrace, int inc) {
		RuntimeRule main = ruleApplicationTrace.getMain();
		if (main == null)
			return;
		String nextToAdd = main.getRuleName() + " " + main.toString();
		addToTrace(trace, nextToAdd, inc);
		++inc;
		for (Object object : ruleApplicationTrace.getTrace()) {
			buildTrace(trace, object, inc);
		}
	}

	protected void build(LinkedList<String> trace, RuntimeRule rule, int inc) {
		buildTrace(trace, rule.getRuleApplicationTrace(), inc + 1);
	}

	protected void build(LinkedList<String> trace,
			RuleFailedException failedException, int inc) {
		trace.add(increment(inc) + failedException.getMessage());
		buildTrace(trace, failedException.getRuleApplicationTrace(), inc + 1);
	}

	protected void build(LinkedList<String> trace, Object object, int inc) {
		addToTrace(trace, object.toString(), inc);
	}

	/**
	 * @param trace
	 * @param object
	 * @param inc
	 * @return
	 */
	public void addToTrace(LinkedList<String> trace, String s, int inc) {
		// avoid to add too many redundant strings to trace
		if (trace.size() == 0 || !trace.getLast().trim().equals(s))
			trace.add(increment(inc) + s);
	}

	protected static String increment(int inc) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < inc; ++i)
			buffer.append(' ');
		return buffer.toString();
	}

}
