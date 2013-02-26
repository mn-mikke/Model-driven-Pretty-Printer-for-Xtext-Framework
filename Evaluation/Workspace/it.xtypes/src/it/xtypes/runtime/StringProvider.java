/**
 * 
 */
package it.xtypes.runtime;

import it.xtypes.typesystem.BasicType;
import it.xtypes.typesystem.CollectionType;
import it.xtypes.typesystem.EClassifierType;

import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.util.PolymorphicDispatcher;

/**
 * @author Lorenzo Bettini
 * 
 */
public class StringProvider {

	public static final String NULL_REPRESENTATION = "null";

	private PolymorphicDispatcher<String> dispatcher = PolymorphicDispatcher
			.createForSingleTarget("stringRep", this);

	public String string(Object object) {
		// don't pass null argument to polymorphic dispatch
		// otherwise we get ambiguos methods error
		if (object == null)
			return NULL_REPRESENTATION;
		return dispatcher.invoke(object);
	}

	@SuppressWarnings("rawtypes")
	protected String stringRep(Variable variable) {
		String buffer = "";
		Object value = variable.getValue();
		if (value != null) {
			buffer = string(value);
			return string(value);
		}
		String string = string(variable.getExpressionType()) + " " + buffer;
		return string.trim();
	}

	protected String quoted(String buffer) {
		return "'" + buffer + "'";
	}

	protected <T> String stringRep(Class<T> clazz) {
		return clazz.getSimpleName();
	}

	protected String stringRep(EClassifierType languageExpressionType) {
		return stringRep(languageExpressionType.getEclassifier());
	}

	protected String stringRep(EClassifier eClassifier) {
		return eClassifier.getName();
	}

	protected String stringRep(BasicType basicType) {
		return notNullToString(basicType.getBasic());
	}

	protected String stringRep(CollectionType languageExpressionType) {
		return languageExpressionType.getCollection() + "["
				+ string(languageExpressionType.getType()) + "]";
	}

	protected String stringRep(Object value) {
		return notNullToString(value);
	}

	protected String notNullToString(Object value) {
		if (value == null)
			return NULL_REPRESENTATION;
		return value.toString();
	}

	protected String withType(String typeName, String s) {
		return typeName + " " + quoted(s);
	}

	protected String stringRep(EObject eObject) {
		EClass eClass = eObject.eClass();
		EStructuralFeature eStructuralFeature = eClass
				.getEStructuralFeature("name");
		String stringRepEClass = stringRep(eClass);
		if (eStructuralFeature != null) {
			Object eGet = eObject.eGet(eStructuralFeature);
			if (eGet != null)
				return withType(stringRepEClass, string(eGet));
			else
				return stringRepEClass;
		} else {
			EList<EStructuralFeature> eStructuralFeatures = eClass
					.getEStructuralFeatures();
			for (EStructuralFeature eStructuralFeature2 : eStructuralFeatures) {
				if (eStructuralFeature2 instanceof EAttribute) {
					EAttribute attribute = (EAttribute) eStructuralFeature2;
					if (attribute.getEType().getName().equals("EString")) {
						Object eGet = eObject.eGet(attribute);
						if (eGet != null)
							return withType(stringRepEClass, string(eGet));
					}
				}

				if (eStructuralFeature2 instanceof EReference) {
					Object ref = eObject.eGet(eStructuralFeature2, true);
					if (ref != null) {
						return withType(stringRepEClass, string(ref));
					}
				}
			}
		}

		return stringRepEClass;
	}

	@SuppressWarnings("rawtypes")
	protected String stringRep(List list) {
		StringBuffer buffer = new StringBuffer();

		buffer.append("[");

		for (Object object : list) {
			if (buffer.length() > 1)
				buffer.append(", ");
			buffer.append(string(object));
		}

		buffer.append("]");

		return buffer.toString();
	}

	protected String stringRep(TypingJudgmentEnvironment environment) {
		if (environment.empty())
			return "";
		StringBuilder buffer = new StringBuilder();
		Set<Entry<Object, Object>> entrySet = environment.getEnvironment()
				.entrySet();
		// make sure to always use the alpha order
		Set<String> strings = new TreeSet<String>();
		for (Entry<Object, Object> entry : entrySet) {
			strings.add(string(entry.getKey()) + " -> " + string(entry.getValue()));
		}
		buffer.append(strings.toString());

		if (environment.getNext() != null) {
			String nextRep = stringRep(environment.getNext());
			if (nextRep.length() > 0)
				buffer.append("::" + nextRep);
		}

		return buffer.toString();
	}
}
