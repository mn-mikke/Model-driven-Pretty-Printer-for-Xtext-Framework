/**
 * 
 */
package it.xtypes.scoping;

import it.xtypes.typesystem.EClassifierType;
import it.xtypes.typesystem.ExpressionType;
import it.xtypes.typesystem.util.TypesystemSwitch;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;

/**
 * Collects EStructuralFeatures
 * 
 * @author Lorenzo Bettini
 * 
 */
public class ENamedElementCollector extends
		TypesystemSwitch<List<ENamedElement>> {

	@Override
	public List<ENamedElement> caseEClassifierType(EClassifierType object) {
		EClassifier eClassifier = object.getEclassifier();

		return collect(eClassifier);
	}

	/**
	 * Makes sure we never return an empty list
	 * 
	 * @see it.xtypes.typesystem.util.TypesystemSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public List<ENamedElement> defaultCase(EObject object) {
		return new LinkedList<ENamedElement>();
	}

	public List<ENamedElement> collect(ExpressionType expressionType) {
		List<ENamedElement> features = new LinkedList<ENamedElement>();

		if (expressionType != null)
			return doSwitch(expressionType);

		return features;
	}

	public List<ENamedElement> collect(EClassifier eClassifier) {
		if (eClassifier != null) {
			if (eClassifier instanceof EClass) {
				EClass eClass = (EClass) eClassifier;
				return new LinkedList<ENamedElement>(
						eClass.getEAllStructuralFeatures());
			}

			if (eClassifier instanceof EEnum) {
				EEnum eEnum = (EEnum) eClassifier;
				return new LinkedList<ENamedElement>(eEnum.getELiterals());
			}

			return new LinkedList<ENamedElement>();
		}

		return new LinkedList<ENamedElement>();
	}
}
