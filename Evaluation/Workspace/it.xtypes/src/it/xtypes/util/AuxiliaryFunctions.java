/**
 * 
 */
package it.xtypes.util;

import it.xtypes.typesystem.BasicType;
import it.xtypes.typesystem.CollectionType;
import it.xtypes.typesystem.CompoundExpression;
import it.xtypes.typesystem.EClassifierType;
import it.xtypes.typesystem.Expression;
import it.xtypes.typesystem.ExpressionType;
import it.xtypes.typesystem.JudgmentDescription;
import it.xtypes.typesystem.Rule;
import it.xtypes.typesystem.RuleWithPremises;
import it.xtypes.typesystem.SubExpression;
import it.xtypes.typesystem.TypeSystemDefinition;
import it.xtypes.typesystem.TypesystemFactory;
import it.xtypes.typesystem.TypingJudgment;
import it.xtypes.typesystem.TypingJudgmentWithEnvironment;
import it.xtypes.typesystem.TypingStatementExpression;
import it.xtypes.typesystem.VariableDeclaration;
import it.xtypes.typesystem.VariableDeclarationWithType;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.EcoreUtil2;

/**
 * @author bettini
 * 
 */
public class AuxiliaryFunctions {
	protected static VariableDeclarationsSelector variableDeclarationsSelector = new VariableDeclarationsSelector();

	public static List<TypingJudgmentWithEnvironment> collectSingleTypingStatements(
			RuleWithPremises ruleWithPremises) {
		return collectSingleTypingStatements(ruleWithPremises.getPremises());
	}

	public static List<TypingJudgmentWithEnvironment> collectSingleTypingStatements(
			EList<TypingJudgment> typingJudgments) {
		return new SingleTypingJudgmentCollector().collect(typingJudgments);
	}

	public static SubExpression getSubExpression(Expression expression) {
		if (expression instanceof CompoundExpression) {
			return ((CompoundExpression) expression).getSubExpression();
		}
		return null;
	}

	/**
	 * Converts the passed EClassifier to an EClass if possible otherwise
	 * returns null.
	 * 
	 * @param classRef
	 * @return
	 */
	public static EClass convertToEClass(EClassifier classRef) {
		if (classRef instanceof EClass) {
			return (EClass) classRef;
		}
		return null;
	}

	/**
	 * Converts the passed EClassifier to an EEnum if possible otherwise returns
	 * null.
	 * 
	 * @param classRef
	 * @return
	 */
	public static EEnum convertToEEnum(EClassifier classRef) {
		if (classRef instanceof EEnum) {
			return (EEnum) classRef;
		}
		return null;
	}

	/**
	 * Converts the passed ENamedElement to an EStructuralFeature if possible
	 * otherwise returns null.
	 * 
	 * @param classRef
	 * @return
	 */
	public static EStructuralFeature convertToEStructuralFeature(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			return (EStructuralFeature) element;
		}
		return null;
	}

	/**
	 * If the passed ENamedElement is an EStructuralFeature try to convert its
	 * type to an EClass; otherwise returns null
	 * 
	 * @param element
	 * @return
	 */
	public static ExpressionType getFeatureType(ENamedElement element) {
		EStructuralFeature convertToEStructuralFeature = convertToEStructuralFeature(element);
		if (convertToEStructuralFeature == null)
			return null;
		return createTypeFromEClassifier(
				convertToEStructuralFeature.getEType(),
				convertToEStructuralFeature.isMany());
	}

	public static BasicType createBasicType(String name) {
		BasicType basicType = TypesystemFactory.eINSTANCE.createBasicType();
		basicType.setBasic(name);
		return basicType;
	}

	public static ExpressionType createTypeFromEClassifier(
			EClassifier eClassifier, boolean multi) {
		if (multi) {
			CollectionType collectionType = TypesystemFactory.eINSTANCE
					.createCollectionType();
			collectionType
					.setType(createTypeFromEClassifier(eClassifier, false));
			collectionType.setCollection("List");
			return collectionType;
		} else {
			EClassifierType eClassifierType = TypesystemFactory.eINSTANCE
					.createEClassifierType();
			eClassifierType.setEclassifier(eClassifier);
			return eClassifierType;
		}
	}

	public static CollectionType createCollectionType(
			ExpressionType expressionType) {
		CollectionType collectionType = TypesystemFactory.eINSTANCE
				.createCollectionType();
		collectionType.setType(expressionType);
		collectionType.setCollection("List");
		return collectionType;
	}

	public static EClassifierType createEClassifierType(EClassifier eClassifier) {
		EClassifierType eClassifierType = TypesystemFactory.eINSTANCE
				.createEClassifierType();
		eClassifierType.setEclassifier(eClassifier);
		return eClassifierType;
	}

	public static String getBasic(ExpressionType expressionType) {
		if (expressionType instanceof BasicType) {
			BasicType basicType = (BasicType) expressionType;
			return basicType.getBasic();
		}
		return null;
	}

	/**
	 * If the passed ENamedElement is an EStructuralFeature try to convert its
	 * type to an EClass; otherwise returns null
	 * 
	 * @param element
	 * @return
	 */
	public static EClass getFeatureEClass(ENamedElement element) {
		EStructuralFeature convertToEStructuralFeature = convertToEStructuralFeature(element);
		if (convertToEStructuralFeature == null)
			return null;
		return convertToEClass(convertToEStructuralFeature.getEType());
	}

	/**
	 * If the passed ENamedElement is an EStructuralFeature try to convert its
	 * type to an EEnum; otherwise returns null
	 * 
	 * @param element
	 * @return
	 */
	public static EEnum getFeatureEEnum(ENamedElement element) {
		EStructuralFeature convertToEStructuralFeature = convertToEStructuralFeature(element);
		if (convertToEStructuralFeature == null)
			return null;
		return convertToEEnum(convertToEStructuralFeature.getEType());
	}

	/**
	 * Returns true if the passed ENamedElement is a multi EStructuralFeature
	 * 
	 * @param element
	 * @return
	 */
	public static boolean isFeatureMany(ENamedElement element) {
		EStructuralFeature convertToEStructuralFeature = convertToEStructuralFeature(element);
		if (convertToEStructuralFeature == null)
			return false;
		return convertToEStructuralFeature.isMany();
	}

	public static List<VariableDeclaration> selectVariableDeclarations(
			List<TypingJudgment> typingJudgments) {
		return variableDeclarationsSelector
				.selectVariableDeclarations(typingJudgments);
	}

	public static List<VariableDeclaration> selectVariableDeclarations(
			TypingJudgment typingJudgment) {
		return variableDeclarationsSelector
				.selectVariableDeclarations(typingJudgment);
	}

	public static List<VariableDeclaration> getTypingJudgmentsWhichAreVariableDeclarations(
			List<TypingJudgment> typingJudgments) {
		return EcoreUtil2
				.typeSelect(typingJudgments, VariableDeclaration.class);
	}

	public static List<VariableDeclaration> getAllVariableDeclarationsInsideTypingJudgments(
			List<TypingJudgment> typingJudgments) {
		List<VariableDeclaration> result = getTypingJudgmentsWhichAreVariableDeclarations(typingJudgments);
		for (TypingJudgment judgment : typingJudgments) {
			result.addAll(getAllVariableDeclarationsInsideTypingJudgment(judgment));
		}
		return result;
	}

	public static List<VariableDeclaration> getAllVariableDeclarationsInsideTypingJudgment(
			TypingJudgment typingJudgment) {
		return EcoreUtil2.getAllContentsOfType(typingJudgment,
				VariableDeclaration.class);
	}

	public static List<VariableDeclarationWithType> getAllVariableDeclarationsWithType(
			TypingJudgment typingJudgment) {
		return EcoreUtil2.getAllContentsOfType(typingJudgment,
				VariableDeclarationWithType.class);
	}

	public static VariableDeclarationWithType getLeftVariableDeclaration(
			TypingJudgment typingJudgment) {
		List<VariableDeclarationWithType> variableDeclarationWithTypes = getAllVariableDeclarationsWithType(typingJudgment);
		return variableDeclarationWithTypes.get(0);
	}

	public static VariableDeclarationWithType getRightVariableDeclaration(
			TypingJudgment typingJudgment) {
		List<VariableDeclarationWithType> variableDeclarationWithTypes = getAllVariableDeclarationsWithType(typingJudgment);
		if (variableDeclarationWithTypes.size() > 1)
			return variableDeclarationWithTypes.get(1);
		return variableDeclarationWithTypes.get(0);
	}

	public static VariableDeclarationWithType getLeftVariableDeclaration(
			Rule rule) {
		TypingStatementExpression languageExpression = rule.getTypejudgment()
				.getTypingstatement().getLeft();
		if (languageExpression instanceof VariableDeclarationWithType) {
			return (VariableDeclarationWithType) languageExpression;
		}
		return null;
	}

	public static VariableDeclarationWithType getRightVariableDeclaration(
			Rule rule) {
		TypingStatementExpression languageExpression = rule.getTypejudgment()
				.getTypingstatement().getRight();
		if (languageExpression instanceof VariableDeclarationWithType) {
			return (VariableDeclarationWithType) languageExpression;
		}
		return null;
	}

	public static TypingJudgment getContainingTypingJudgment(EObject eObject) {
		while (eObject != null) {
			if (eObject instanceof TypingJudgment) {
				return (TypingJudgment) eObject;
			}
			eObject = eObject.eContainer();
		}
		return null;
	}

	public static RuleWithPremises getContainingRuleWithPremises(EObject eObject) {
		while (eObject != null) {
			if (eObject instanceof RuleWithPremises) {
				return (RuleWithPremises) eObject;
			}
			eObject = eObject.eContainer();
		}
		return null;
	}

	public static Rule getContainingRule(EObject eObject) {
		while (eObject != null) {
			if (eObject instanceof Rule) {
				return (Rule) eObject;
			}
			eObject = eObject.eContainer();
		}
		return null;
	}

	public static TypeSystemDefinition getTypeSystemDefinition(EObject eObject) {
		if (eObject == null)
			return null;
		eObject = eObject.eContainer();
		while (eObject != null) {
			if (eObject instanceof TypeSystemDefinition) {
				return (TypeSystemDefinition) eObject;
			}
			eObject = eObject.eContainer();
		}
		return null;
	}

	public static EClass convertToEClass(EClassifierType t2) {
		return convertToEClass(t2.getEclassifier());
	}

	public static JudgmentDescription getJudgmentDescription(
			TypeSystemDefinition typeSystemDefinition,
			String typingJudgmentSymbol, String typingStatementRelation) {
		EList<JudgmentDescription> judgmentDescriptions = typeSystemDefinition
				.getJudgmentDescriptions();
		for (JudgmentDescription judgmentDescription : judgmentDescriptions) {
			if (judgmentDescription.getJudgmentsymbol().equals(
					typingJudgmentSymbol)
					&& judgmentDescription.getRelation().equals(
							typingStatementRelation))
				return judgmentDescription;
		}

		return null;
	}
}
