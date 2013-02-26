package it.xtypes.runtime.operations;

import it.xtypes.runtime.RuntimeEnvironmentEntry;
import it.xtypes.runtime.TypingJudgmentEnvironment;
import it.xtypes.runtime.Variable;
import it.xtypes.runtime.util.ObjectResolver;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;

/**
 * Implementation of standard operations
 * 
 * @author Lorenzo Bettini
 * 
 */
public class JudgmentOperations {
	@Inject
	protected ObjectResolver objectResolver;

	/**
	 * Assigns the value of the passed variable, if the right expression is
	 * itself a variable then gets its value
	 * 
	 * @param var
	 * @param right
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void assignment(Variable var, Object right) {
		right = objectResolver.getValue(right);
		var.setValue(right);
	}

	public boolean equals(Object left, Object right) {
		left = objectResolver.getValue(left);
		right = objectResolver.getValue(right);
		if (left == null || right == null)
			return left == right;
		return left.equals(right);
	}

	public boolean notEquals(Object left, Object right) {
		return !equals(left, right);
	}

	/**
	 * Can we cast exp to clazz?
	 * 
	 * @param <T>
	 * 
	 * @param exp
	 * @param claszz
	 * @return
	 */
	public <T> boolean checkCast(Object exp, Class<T> clazz) {
		exp = objectResolver.getValue(exp);

		if (exp == null)
			return true;

		return clazz.isAssignableFrom(exp.getClass());
	}

	public <T> List<T> getAll(EObject eObject, EStructuralFeature mainFeature,
			EStructuralFeature extendFeature) {
		List<T> list = new LinkedList<T>();

		if (eObject != null) {
			// then follow the extend feature performing the closure
			List<Object> nodesInRelation = getAllNodesInRelation(eObject,
					extendFeature);
			for (Object object : nodesInRelation) {
				EObject node = objectResolver.getEObject(object);
				if (node != null) {
					addToList(list, node.eGet(mainFeature));
				}
			}

			// then get all the stuff from the main object
			Object o = eObject.eGet(mainFeature);
			addToList(list, o);
		}

		return list;
	}

	public List<Object> getAllNodesInRelation(EObject eObject,
			EStructuralFeature extendFeature) {
		List<Object> nodes = new LinkedList<Object>();
		Set<Object> seen = new HashSet<Object>();

		if (eObject != null) {
			// follow the extend feature performing the closure
			EObject toFollow = objectResolver.getEObject(eObject
					.eGet(extendFeature));
			while (toFollow != null && !seen.contains(toFollow)) {
				seen.add(toFollow);
				nodes.add(toFollow);
				toFollow = objectResolver.getEObject(toFollow
						.eGet(extendFeature));
			}
		}

		Collections.reverse(nodes);

		return nodes;
	}

	public <T> List<T> getAll(EObject eObject, String mainFeature,
			String extendFeature) {
		if (eObject == null)
			return new LinkedList<T>();
		EClass eClass = eObject.eClass();
		return getAll(eObject, eClass.getEStructuralFeature(mainFeature),
				eClass.getEStructuralFeature(extendFeature));
	}

	/**
	 * Possible null pointers or class cast exceptions are not handled here;
	 * object is expected to be a list (or a variable containing a list)
	 * 
	 * @param object
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public int length(Object object) {
		object = objectResolver.getValue(object);
		return ((List) object).size();
	}

	public TypingJudgmentEnvironment union(TypingJudgmentEnvironment e1,
			TypingJudgmentEnvironment e2) {
		TypingJudgmentEnvironment newEnv = new TypingJudgmentEnvironment(e1);
		if (newEnv.union(e2))
			return newEnv;
		return null;
	}

	public TypingJudgmentEnvironment union(RuntimeEnvironmentEntry entry1,
			RuntimeEnvironmentEntry entry2) {
		TypingJudgmentEnvironment newEnv = new TypingJudgmentEnvironment();
		newEnv.add(entry1);
		if (newEnv.union(entry2))
			return newEnv;
		return null;
	}

	public TypingJudgmentEnvironment union(TypingJudgmentEnvironment e1,
			RuntimeEnvironmentEntry e2) {
		TypingJudgmentEnvironment newEnv = new TypingJudgmentEnvironment(e1);
		if (newEnv.union(e2))
			return newEnv;
		return null;
	}

	public TypingJudgmentEnvironment envListCons(
			TypingJudgmentEnvironment head, TypingJudgmentEnvironment tail) {
		head.setNext(tail);
		return head;
	}

	public TypingJudgmentEnvironment envListCons(
			TypingJudgmentEnvironment head, RuntimeEnvironmentEntry tail) {
		head.setNext(tail);
		return head;
	}

	public TypingJudgmentEnvironment envListCons(RuntimeEnvironmentEntry head,
			TypingJudgmentEnvironment tail) {
		TypingJudgmentEnvironment env = new TypingJudgmentEnvironment();
		env.add(head);
		env.setNext(tail);
		return env;
	}

	public Object env(TypingJudgmentEnvironment environment, Object key) {
		if (environment == null)
			return null;
		return environment.get(key);
	}

	/**
	 * Adds the object to the list, if the object is a list itself then use
	 * addAll()
	 * 
	 * @param list
	 * @param o
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void addToList(List list, Object o) {
		if (o == null)
			return;
		if (o instanceof List) {
			list.addAll((List) o);
		} else {
			list.add(o);
		}
	}

	public <T> T clone(T object) {
		if (object instanceof EObject) {
			@SuppressWarnings("unchecked")
			T copy = (T) EcoreUtil.copy((EObject) object);
			return copy;
		}

		return object;
	}

	public <T> List<T> clone(List<T> list) {
		List<T> clone = new LinkedList<T>();
		for (T item : list)
			clone.add(clone(item));
		return clone;
	}

}
