/**
 * 
 */
package it.xtypes.runtime.util;

import it.xtypes.runtime.RuntimeTypeCreator;
import it.xtypes.typesystem.BasicType;
import it.xtypes.typesystem.EClassifierType;
import it.xtypes.typesystem.ExpressionType;
import it.xtypes.util.AuxiliaryFunctions;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcoreFactory;

/**
 * @author Lorenzo Bettini
 * 
 */
public class AuxiliaryFunctionsRuntime {

	static RuntimeTypeCreator runtimeTypeCreator = new RuntimeTypeCreator();

	public static EClassifierType createEClassifierType(EClassifier eClassifier) {
		return AuxiliaryFunctions.createEClassifierType(eClassifier);
	}

	public static ExpressionType createCollectionType(EClassifier eClassifier) {
		return AuxiliaryFunctions.createTypeFromEClassifier(eClassifier, true);
	}

	public static ExpressionType createLanguageExpressionType(
			String classifier, boolean multi) {
		if (multi)
			return createCollectionType(classifier);
		return createEClassifierType(classifier);
	}

	public static BasicType createBasicType(String type) {
		return AuxiliaryFunctions.createBasicType(type);
	}

	public static ExpressionType createTypeFromJavaObject(Object object) {
		return runtimeTypeCreator.createExpressionType(object);
	}

	public static ExpressionType createEClassifierType(String classifier) {
		EClassifier eClassifier = EcoreFactory.eINSTANCE.createEClass();
		eClassifier.setName(classifier);
		return AuxiliaryFunctions.createTypeFromEClassifier(eClassifier, false);
	}

	public static ExpressionType createCollectionType(String classifier) {
		EClassifier eClassifier = EcoreFactory.eINSTANCE.createEClass();
		eClassifier.setName(classifier);
		return AuxiliaryFunctions.createTypeFromEClassifier(eClassifier, true);
	}

	public static ExpressionType createCollectionType(
			ExpressionType expressionType) {
		return AuxiliaryFunctions.createCollectionType(expressionType);
	}

	public static ExpressionType createCollectionTypeFromBasic(String basic) {
		return createCollectionType(createBasicType(basic));
	}

	public static ExpressionType createLanguageExpressionType(String string) {
		return createLanguageExpressionType(string, false);
	}

}
