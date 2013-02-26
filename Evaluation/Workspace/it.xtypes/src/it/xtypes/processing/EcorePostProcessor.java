package it.xtypes.processing;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

public class EcorePostProcessor {
	/**
	 * Adds a back reference to the Rule class to the TypeSystem
	 * 
	 * @param ePackage
	 */
	public static void processPackage(EPackage ePackage) {
		EClass typeSystemClass = (EClass) ePackage
				.getEClassifier("TypeSystemDefinition");

		// makes sure the attribute name of a TypeSystemDefinition is not null
		EAttribute nameAttribute = typeSystemClass.getEAttributes().get(0);
		nameAttribute.setDefaultValue("");

		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;
		
		// an attribute to store the uri of the package
		EAttribute packageUriAttribute = ecoreFactory.createEAttribute();
		packageUriAttribute.setName("ePackageURI");
		packageUriAttribute.setEType(EcorePackage.eINSTANCE.getEString());
		packageUriAttribute.setDefaultValue("");
		packageUriAttribute.setTransient(true);
		typeSystemClass.getEStructuralFeatures().add(packageUriAttribute);
		
		// add a back reference in Rule to the containing TypeSystemDefinition
		EClass ruleClass = (EClass) ePackage.getEClassifier("Rule");
		EReference typeSystem = ecoreFactory.createEReference();
		typeSystem.setName("containingTypeSystem");
		typeSystem.setEType(typeSystemClass);
		typeSystem.setContainment(false);
		EReference rulesReference = (EReference) typeSystemClass
				.getEStructuralFeature("rules");
		typeSystem.setEOpposite(rulesReference);
		ruleClass.getEStructuralFeatures().add(typeSystem);
		// make sure to set the opposite also in the original containment
		// relation
		rulesReference.setEOpposite(typeSystem);
	}
}
