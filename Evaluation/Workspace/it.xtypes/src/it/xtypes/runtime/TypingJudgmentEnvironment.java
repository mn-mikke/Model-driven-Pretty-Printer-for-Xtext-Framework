/**
 * 
 */
package it.xtypes.runtime;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Implements the environment for a typing judgment
 * 
 * @author Lorenzo Bettini
 * 
 */
public class TypingJudgmentEnvironment {

	protected Map<Object, Object> environment = new HashMap<Object, Object>();

	protected TypingJudgmentEnvironment next = null;

	public TypingJudgmentEnvironment(TypingJudgmentEnvironment e) {
		if (e == null)
			environment = new HashMap<Object, Object>();
		else
			environment = new HashMap<Object, Object>(e.getEnvironment());
	}

	public TypingJudgmentEnvironment() {
	}

	public Map<Object, Object> getEnvironment() {
		return environment;
	}

	public TypingJudgmentEnvironment getNext() {
		return next;
	}

	public void setNext(TypingJudgmentEnvironment next) {
		this.next = next;
	}

	public void setNext(RuntimeEnvironmentEntry runtimeEnvironmentEntry) {
		TypingJudgmentEnvironment next2 = new TypingJudgmentEnvironment();
		setNext(next2);
		next2.add(runtimeEnvironmentEntry);
	}

	/**
	 * If checkExist is true, before inserting, also checks that there is no
	 * other statement in the environment with left equal to the passed
	 * typingStatement left (otherwise returns false=
	 * 
	 * @param typingStatement
	 * @param checkExist
	 * @return
	 */
	public boolean add(Object o1, Object o2, boolean checkExist) {
		if (checkExist && environment.containsKey(o1))
			return false;

		environment.put(o1, o2);

		return true;
	}

	public boolean add(Object o1, Object o2) {
		return add(o1, o2, false);
	}

	/**
	 * If the key is not found in this environment tries recursively with the
	 * next one
	 * 
	 * @param key
	 * @return
	 */
	public Object get(Object key) {
		Object object = environment.get(key);
		if (object == null && next != null)
			return next.get(key);
		return object;
	}

	public void increment(TypingJudgmentEnvironment typingJudgmentEnvironment) {
		environment.putAll(typingJudgmentEnvironment.getEnvironment());
	}

	public void decrement(TypingJudgmentEnvironment typingJudgmentEnvironment) {
		environment.keySet().removeAll(
				typingJudgmentEnvironment.getEnvironment().keySet());
	}

	public void increment(Object o1, Object o2) {
		add(o1, o2);
	}

	public void decrement(Object o1) {
		environment.remove(o1);
	}

	public boolean union(TypingJudgmentEnvironment typingJudgmentEnvironment) {
		Set<Entry<Object, Object>> entrySet = typingJudgmentEnvironment
				.getEnvironment().entrySet();
		for (Entry<Object, Object> entry : entrySet) {
			if (!union(entry.getKey(), entry.getValue()))
				return false;
		}
		return true;
	}

	public boolean union(Object o1, Object o2) {
		return add(o1, o2, true);
	}

	public void add(RuntimeEnvironmentEntry runtimeEnvironmentEntry) {
		add(runtimeEnvironmentEntry.getLeft(),
				runtimeEnvironmentEntry.getRight());
	}

	public boolean union(RuntimeEnvironmentEntry runtimeEnvironmentEntry) {
		return union(runtimeEnvironmentEntry.getLeft(),
				runtimeEnvironmentEntry.getRight());
	}

	public void increment(RuntimeEnvironmentEntry runtimeEnvironmentEntry) {
		increment(runtimeEnvironmentEntry.getLeft(),
				runtimeEnvironmentEntry.getRight());
	}

	public boolean empty() {
		return environment.size() == 0;
	}

	public String toString() {
		if (empty())
			return "";
		StringBuffer buffer = new StringBuffer();
		Set<Entry<Object, Object>> entrySet = getEnvironment().entrySet();
		for (Entry<Object, Object> entry : entrySet) {
			buffer.append(entry.getKey() + " -> " + entry.getValue());
		}
		if (next != null) {
			buffer.append("::");
			buffer.append(next.toString());
		}
		return buffer.toString();
	}
}
