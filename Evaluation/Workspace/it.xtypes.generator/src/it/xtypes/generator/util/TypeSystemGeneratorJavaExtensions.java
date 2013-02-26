/**
 * 
 */
package it.xtypes.generator.util;

import it.xtypes.generator.TypeSystemGeneratorObservable;
import it.xtypes.linker.GenModelLoader;
import it.xtypes.typesystem.BasicType;
import it.xtypes.typesystem.CastTo;
import it.xtypes.typesystem.EClassifierType;
import it.xtypes.typesystem.EnvironmentId;
import it.xtypes.typesystem.ExpressionType;
import it.xtypes.typesystem.JudgmentDescription;
import it.xtypes.typesystem.Rule;
import it.xtypes.typesystem.RuleWithPremises;
import it.xtypes.typesystem.TypeSystemDefinition;
import it.xtypes.typesystem.TypingStatementExpression;
import it.xtypes.typesystem.VariableDeclaration;
import it.xtypes.typesystem.VariableDeclarationWithType;
import it.xtypes.typing.ExpressionTypingSystem;
import it.xtypes.typing.RemoveMultiType;
import it.xtypes.typing.RuleSelector;
import it.xtypes.util.AuxiliaryFunctions;
import it.xtypes.util.CheckRulesCollector;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Observer;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;

/**
 * This class is a support to XTend method. Therefore it can be called by java
 * extension methods.
 * 
 * @author Lorenzo Bettini
 */
public class TypeSystemGeneratorJavaExtensions {

	public static final String DEFAULT_TYPESYSTEM_SUBPACKAGE = "typesystem";

	static protected ExpressionTypingSystem expressionTypingSystem;

	static protected GenModelLoader genModelLoader = new GenModelLoader();

	static protected RuleSelector ruleSelector;

	static protected CheckRulesCollector checkRulesCollector;

	static protected RemoveMultiType removeMultiType;

	static protected TypeSystemDefinition currentTypeSystemDefinition;

	static protected GenModel currentGenModel;

	static protected TypeSystemGeneratorObservable typeSystemGeneratorObservable = new TypeSystemGeneratorObservable();

	public static String getBasic(ExpressionType expressionType) {
		return ((BasicType) expressionType).getBasic();
	}

	/**
	 * Returns the element package name.
	 * 
	 * @param element
	 *            the element in which lookup the package name name.
	 * @return the package name of this element, that is the element URI without
	 *         file extension and all to lower case.
	 */
	public static String uriToPackageDir(Rule element) {
		return uriToPackageDir((EObject) element);
	}

	/**
	 * Returns the element package name.
	 * 
	 * @param element
	 *            the element in which lookup the package name name.
	 * @return the package name of this element, that is the element URI without
	 *         file extension and all to lower case.
	 */
	public static String uriToPackageDir(TypeSystemDefinition element) {
		return uriToPackageDir((EObject) element);
	}

	/**
	 * Returns the element package name.
	 * 
	 * @param element
	 *            the element in which lookup the package name name.
	 * @return the package name of this element, that is the element URI without
	 *         file extension and all to lower case.
	 */
	public static String uriToPackageDir(EObject element) {
		return uriToPackageDir(element.eResource().getURI().lastSegment());
	}

	/**
	 * Returns the element package name.
	 * 
	 * @param element
	 *            the element in which lookup the package name name.
	 * @return the package name of this element, that is the element URI without
	 *         file extension and all to lower case.
	 */
	public static String uriToPackageName(Rule element) {
		return uriToPackageName((EObject) element);
	}

	/**
	 * Returns the element package name.
	 * 
	 * @param element
	 *            the element in which lookup the package name name.
	 * @return the package name of this element, that is the element URI without
	 *         file extension and all to lower case.
	 */
	public static String uriToPackageName(TypeSystemDefinition element) {
		return uriToPackageName((EObject) element);
	}

	/**
	 * Returns the element package name.
	 * 
	 * @param element
	 *            the element in which lookup the package name name.
	 * @return the package name of this element, that is the element URI without
	 *         file extension and all to lower case.
	 */
	public static String uriToPackageName(EObject element) {
		return uriToPackageName(element.eResource().getURI().lastSegment());
	}

	/**
	 * Returns the element package name.
	 * 
	 * @param element
	 *            the element in which lookup the package name name.
	 * @return the package name of this element, that is the element URI without
	 *         file extension and all to lower case.
	 */
	public static String uriToPackageName(String element) {
		int dotIndex = element.lastIndexOf('.');
		return element.substring(0, dotIndex).toLowerCase();
	}

	/**
	 * Returns the element package name.
	 * 
	 * @param element
	 *            the element in which lookup the package name name.
	 * @return the package name of this element, that is the element URI without
	 *         file extension and all to lower case.
	 */
	public static String uriToPackageDir(String element) {
		int dotIndex = element.lastIndexOf('.');
		return element.substring(0, dotIndex).toLowerCase();
	}

	public static String packageToDir(String s) {
		return s.replace('.', '/');
	}

	public static List<VariableDeclaration> getAllVariableDeclarations(Rule rule) {
		LinkedList<VariableDeclaration> variableDeclarations = new LinkedList<VariableDeclaration>();
		if (rule instanceof RuleWithPremises) {
			variableDeclarations
					.addAll(AuxiliaryFunctions
							.getAllVariableDeclarationsInsideTypingJudgments(((RuleWithPremises) rule)
									.getPremises()));
		}
		variableDeclarations.addAll(AuxiliaryFunctions
				.getAllVariableDeclarationsInsideTypingJudgment(rule
						.getTypejudgment()));
		return variableDeclarations;
	}

	/**
	 * @param type
	 * @return
	 */
	public static boolean isBasicType(ExpressionType type) {
		return expressionTypingSystem.isBasicType(type);
	}

	public static ExpressionType getExpressionType(
			TypingStatementExpression typingStatementExpression) {
		return expressionTypingSystem
				.getExpressionType(typingStatementExpression);
	}

	public static ExpressionType getExpressionTypeWithoutMulti(
			TypingStatementExpression typingStatementExpression) {
		return removeMultiType.removeMulti(expressionTypingSystem
				.getExpressionType(typingStatementExpression));
	}

	public static ExpressionType getVariableType(
			VariableDeclaration variableDeclaration) {
		return expressionTypingSystem.getExpressionType(variableDeclaration);
	}

	public static ExpressionType getLeftType(Rule rule) {
		return expressionTypingSystem.getExpressionType(rule.getTypejudgment()
				.getTypingstatement().getLeft());
	}

	public static ExpressionType getRightType(Rule rule) {
		return expressionTypingSystem.getExpressionType(rule.getTypejudgment()
				.getTypingstatement().getRight());
	}

	public static VariableDeclarationWithType getLeftVariable(Rule rule) {
		return AuxiliaryFunctions.getLeftVariableDeclaration(rule);
	}

	public static VariableDeclarationWithType getRightVariable(Rule rule) {
		return AuxiliaryFunctions.getRightVariableDeclaration(rule);
	}

	/**
	 * Returns the Java package name of the generated classes of an EMF model,
	 * given its genmodel file (i.e., basepackage + EMF package name)
	 * 
	 * @param model
	 * @param genmodel
	 * @return
	 */
	public static String getModelPackage(TypeSystemDefinition model) {
		String basePackage = getBasePackage(model);
		if (basePackage.length() > 0)
			basePackage += ".";
		return basePackage + model.getEPackage().getName();
	}

	/**
	 * Returns the Java package name of the base package for the generated
	 * classes of an EMF model, given its genmodel file
	 * 
	 * @param model
	 * @return
	 */
	public static String getBasePackage(TypeSystemDefinition model) {
		GenModel genModel = getGenModel(model);
		GenPackage genPackage = getGenPackage(genModel);
		String basePackage = genPackage.getBasePackage();
		return (basePackage != null ? basePackage : "");
	}

	public static String getGeneratedTypeSystemBasePackage(
			TypeSystemDefinition model) {
		return getBasePackage(model);
	}

	public static String getGeneratedTypesystemPackage(
			TypeSystemDefinition model) {
		String basePackage = getBasePackage(model);
		if (basePackage.length() > 0)
			basePackage += ".";
		return basePackage + "typesystem."
				+ getGeneratedTypeSystemSubPackage(model);
	}

	public static String getGeneratedTypeSystemSubPackage(
			TypeSystemDefinition model) {
		return (model.getName().length() > 0 ? model.getName().toLowerCase()
				: DEFAULT_TYPESYSTEM_SUBPACKAGE);
	}

	public static String getGeneratedTypeSystemRulePackage(
			TypeSystemDefinition model) {
		return getGeneratedTypesystemPackage(model) + ".rules";
	}

	public static String getGeneratedTypeSystemValidatorPackage(
			TypeSystemDefinition model) {
		return getGeneratedTypesystemPackage(model) + ".validator";
	}

	/**
	 * Returns the EMF prefix
	 * 
	 * @param model
	 * @param genmodel
	 * @return
	 */
	public static String getFactoryName(TypeSystemDefinition model) {
		GenModel genModel = getGenModel(model);
		return getGenPackage(genModel).getFactoryName();
	}

	/**
	 * @param genModel
	 * @return
	 */
	public static GenPackage getGenPackage(GenModel genModel) {
		return genModel.getGenPackages().get(0);
	}

	public static String getFactoryName(Rule rule) {
		return getFactoryName(rule.getContainingTypeSystem());
	}

	public static String getPackageName(TypeSystemDefinition model) {
		return getGenPackage(getGenModel(model)).getBasicPackageName();
	}

	public static String getPackageName(Rule rule) {
		return getPackageName(rule.getContainingTypeSystem());
	}

	/**
	 * @param model
	 * @param genmodel
	 * @return
	 */
	public static GenModel getGenModel(TypeSystemDefinition model) {
		if (model != currentTypeSystemDefinition) {
			currentTypeSystemDefinition = model;
			currentGenModel = genModelLoader.getGenModel(model);
		}
		return currentGenModel;
	}

	public static String getModelPackage(Rule rule) {
		return getModelPackage(rule.getContainingTypeSystem());
	}

	public static Set<EnvironmentId> getAllEnvironmentIds(Rule rule) {
		Set<EnvironmentId> result = new TreeSet<EnvironmentId>(
				new Comparator<EnvironmentId>() {
					public int compare(EnvironmentId o1, EnvironmentId o2) {
						return o1.getEnvironmentId().compareTo(
								o2.getEnvironmentId());
					}
				});

		result.addAll(EcoreUtil2
				.getAllContentsOfType(rule, EnvironmentId.class));

		return result;
	}

	/**
	 * Returns the list of the statements which should be generated (or require
	 * a preprocessing) before the specified judgment. For instance, casts
	 * should be checked before being executed.
	 * 
	 * @param object
	 * @return
	 */
	public static List<TypingStatementExpression> getStatementsToExecuteBefore(
			EObject object) {
		List<TypingStatementExpression> typingStatementExpressions = new LinkedList<TypingStatementExpression>();

		typingStatementExpressions.addAll(EcoreUtil2.getAllContentsOfType(
				object, CastTo.class));

		if (object instanceof CastTo) {
			typingStatementExpressions.add((CastTo) object);
		}

		return typingStatementExpressions;
	}

	public static boolean isJavaType(String s) {
		return s.equals("class") || s.equals("Class");
	}

	public static String namedElementToGetMethod(String s) {
		return "get" + s.substring(0, 1).toUpperCase() + s.substring(1)
				+ (isJavaType(s) ? "_" : "") + "()";
	}

	public static String namedElementToSetMethod(String s) {
		return "set" + s.substring(0, 1).toUpperCase() + s.substring(1);
	}

	public static String namedElementToCreateMethod(String s) {
		return "create" + s.substring(0, 1).toUpperCase() + s.substring(1);
	}

	public static String getClassName(EClassifierType eClassifierType) {
		EClassifier eclassifier = eClassifierType.getEclassifier();
		return getClassName(eclassifier);
	}

	/**
	 * @param eclassifier
	 * @return
	 */
	public static String getClassName(EClassifier eclassifier) {
		String className = eclassifier.getInstanceClassName();
		if (className != null)
			return className;
		return eclassifier.getName();
	}

	public static List<Rule> getRules(
			TypeSystemDefinition typeSystemDefinition,
			String typingJudgmentSymbol, String typeStatementRelation) {
		return ruleSelector.findRules(typeSystemDefinition.getRules(),
				typingJudgmentSymbol, typeStatementRelation);
	}

	public static String getJudgmentFailMessage(
			TypeSystemDefinition typeSystemDefinition,
			String typingJudgmentSymbol, String typeStatementRelation) {
		JudgmentDescription judgmentDescription = AuxiliaryFunctions
				.getJudgmentDescription(typeSystemDefinition,
						typingJudgmentSymbol, typeStatementRelation);
		if (judgmentDescription == null)
			return null;
		return judgmentDescription.getFail();
	}

	public static List<Rule> collectCheckRules(
			TypeSystemDefinition typeSystemDefinition) {
		return checkRulesCollector.collectCheckRules(typeSystemDefinition);
	}

	/**
	 * This method is expected to be called when starting to generate code of a type
	 * system definition and it initializes crucial elements.
	 * 
	 * @param typeSystemDefinition
	 */
	public static void startingGenerationFor(
			TypeSystemDefinition typeSystemDefinition) {
		// this way we can use injected types, as suggested in comments of
		// http://kthoms.wordpress.com/2011/08/17/using-xtext-injected-types-in-xpand/
		IResourceServiceProvider resourceProvider = ((XtextResource) typeSystemDefinition
				.eResource()).getResourceServiceProvider();
		expressionTypingSystem = resourceProvider.get(ExpressionTypingSystem.class);
		ruleSelector = resourceProvider.get(RuleSelector.class);
		checkRulesCollector = resourceProvider.get(CheckRulesCollector.class);
		removeMultiType = resourceProvider.get(RemoveMultiType.class);
	}

	public static void nowGenerating(String string) {
		typeSystemGeneratorObservable.nowGenerating(string);
	}

	public static void addObserver(Observer o) {
		typeSystemGeneratorObservable.addObserver(o);
	}

	public static void deleteObserver(Observer o) {
		typeSystemGeneratorObservable.deleteObserver(o);
	}
}
