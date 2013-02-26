/**
 * 
 */
package it.xtypes.runtime;

import it.xtypes.runtime.util.TraceToString;

import java.util.LinkedList;
import java.util.List;


/**
 * Keeps a trace of rule applied (and also failures)
 * 
 * @author Lorenzo Bettini
 * 
 */
public class RuleApplicationTrace {
	RuntimeRule main;

	List<Object> trace = new LinkedList<Object>();

	public RuleApplicationTrace() {

	}

	public void addMain(RuntimeRule rule) {
		main = rule;
		add(main.getRuleName() + " " + main.toString());
	}

	public RuntimeRule getMain() {
		return main;
	}

	public void addApplied(RuntimeRule rule) {
		trace.add(rule);
	}

	public void addFailure(RuleFailedException e) {
		if (!trace.contains(e))
			trace.add(e);
	}

	public List<Object> getTrace() {
		return trace;
	}

	public List<String> getTraceAsStrings() {
		return new TraceToString().buildTrace(this);
	}

	public void add(String string) {
		trace.add(string);
	}
}
