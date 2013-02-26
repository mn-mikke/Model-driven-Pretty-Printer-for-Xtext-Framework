/**
 * 
 */
package it.xtypes.runtime.util;

import it.xtypes.runtime.RuleFailedException;

import java.util.Collections;
import java.util.List;


/**
 * @author Lorenzo Bettini
 * 
 */
public class TraceFailureExceptionCollector {
	public List<RuleFailedException> getFailures(RuleFailedException failure) {
		if (failure.getPrevious() != null)
			return failure.getPrevious().getFailureTrace();
		return Collections.emptyList();
	}

}
