/**
 * 
 */
package it.xtypes.util;

import it.xtypes.typesystem.OrBranch;
import it.xtypes.typesystem.OrTypingJudgment;
import it.xtypes.typesystem.TypingJudgment;
import it.xtypes.typesystem.TypingJudgmentWithEnvironment;
import it.xtypes.typesystem.util.TypesystemSwitch;

import java.util.LinkedList;
import java.util.List;


/**
 * @author Lorenzo Bettini
 *
 */
public class SingleTypingJudgmentCollector extends TypesystemSwitch<List<TypingJudgmentWithEnvironment>> {
	
	@Override
	public List<TypingJudgmentWithEnvironment> caseTypingJudgmentWithEnvironment(
			TypingJudgmentWithEnvironment object) {
		List<TypingJudgmentWithEnvironment> singleTypingStatements = new LinkedList<TypingJudgmentWithEnvironment>();
		singleTypingStatements.add(object);
		return singleTypingStatements;
	}

	@Override
	public List<TypingJudgmentWithEnvironment> caseOrTypingJudgment(
			OrTypingJudgment object) {
		List<TypingJudgmentWithEnvironment> singleTypingStatements = new LinkedList<TypingJudgmentWithEnvironment>();
		
		for (OrBranch branch : object.getBranches()) {
			singleTypingStatements.addAll(collect(branch.getJudgments()));
		}
		
		return singleTypingStatements;
	}

	public List<TypingJudgmentWithEnvironment> collect(List<TypingJudgment> typingJudgments) {
		List<TypingJudgmentWithEnvironment> singleTypingStatems = new LinkedList<TypingJudgmentWithEnvironment>();
		
		for (TypingJudgment typingJudgment : typingJudgments) {
			singleTypingStatems.addAll(collect(typingJudgment));
		}
		
		return singleTypingStatems;
	}
	
	public List<TypingJudgmentWithEnvironment> collect(TypingJudgment typingJudgment) {
		
		List<TypingJudgmentWithEnvironment> result = doSwitch(typingJudgment);
		
		if (result == null)
			return new LinkedList<TypingJudgmentWithEnvironment>();
		
		return result;
	}
}
