package it.xtypes.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import it.xtypes.services.TypeSystemGrammarAccess;
import it.xtypes.typesystem.Assignment;
import it.xtypes.typesystem.Axiom;
import it.xtypes.typesystem.BasicType;
import it.xtypes.typesystem.CastTo;
import it.xtypes.typesystem.Clone;
import it.xtypes.typesystem.CollectionType;
import it.xtypes.typesystem.ComposedError;
import it.xtypes.typesystem.CompoundExpression;
import it.xtypes.typesystem.Container;
import it.xtypes.typesystem.EClassifierType;
import it.xtypes.typesystem.EmptyEnvironment;
import it.xtypes.typesystem.EnvironmentAccess;
import it.xtypes.typesystem.EnvironmentAssignment;
import it.xtypes.typesystem.EnvironmentComposition;
import it.xtypes.typesystem.EnvironmentDecrement;
import it.xtypes.typesystem.EnvironmentId;
import it.xtypes.typesystem.EnvironmentIncrement;
import it.xtypes.typesystem.EnvironmentStatement;
import it.xtypes.typesystem.Equals;
import it.xtypes.typesystem.ErrorExpression;
import it.xtypes.typesystem.ErrorSpecification;
import it.xtypes.typesystem.ErrorString;
import it.xtypes.typesystem.Exists;
import it.xtypes.typesystem.Fail;
import it.xtypes.typesystem.Feature;
import it.xtypes.typesystem.ForAll;
import it.xtypes.typesystem.ForEach;
import it.xtypes.typesystem.GetAll;
import it.xtypes.typesystem.Indexed;
import it.xtypes.typesystem.IndexedVariable;
import it.xtypes.typesystem.IntegerConstant;
import it.xtypes.typesystem.JudgmentDescription;
import it.xtypes.typesystem.Length;
import it.xtypes.typesystem.ListDecrement;
import it.xtypes.typesystem.ListIncrement;
import it.xtypes.typesystem.NewName;
import it.xtypes.typesystem.Null;
import it.xtypes.typesystem.OrBranch;
import it.xtypes.typesystem.OrTypingJudgment;
import it.xtypes.typesystem.RuleWithPremises;
import it.xtypes.typesystem.StringConstant;
import it.xtypes.typesystem.Success;
import it.xtypes.typesystem.TypeSystemDefinition;
import it.xtypes.typesystem.TypesystemPackage;
import it.xtypes.typesystem.TypingJudgmentWithEnvironment;
import it.xtypes.typesystem.TypingStatement;
import it.xtypes.typesystem.VariableDeclarationWithType;
import it.xtypes.typesystem.VariableReference;
import it.xtypes.typesystem.VariableSimpleDeclaration;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractTypeSystemSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected TypeSystemGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TypesystemPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TypesystemPackage.ASSIGNMENT:
				if(context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getStandardOperationRule() ||
				   context == grammarAccess.getTypingJudgmentRule()) {
					sequence_Assignment(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.AXIOM:
				if(context == grammarAccess.getAxiomRule() ||
				   context == grammarAccess.getRuleRule()) {
					sequence_Axiom(context, (Axiom) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.BASIC_TYPE:
				if(context == grammarAccess.getBasicTypeRule() ||
				   context == grammarAccess.getExpressionTypeRule()) {
					sequence_BasicType(context, (BasicType) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.CAST_TO:
				if(context == grammarAccess.getArrayIndexRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getTypingStatementExpressionRule()) {
					sequence_Expression(context, (CastTo) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.CLONE:
				if(context == grammarAccess.getArrayIndexRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getTypingStatementExpressionRule()) {
					sequence_Expression(context, (Clone) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.COLLECTION_TYPE:
				if(context == grammarAccess.getCollectionTypeRule() ||
				   context == grammarAccess.getExpressionTypeRule()) {
					sequence_CollectionType(context, (CollectionType) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.COMPOSED_ERROR:
				if(context == grammarAccess.getFailureErrorRule() ||
				   context == grammarAccess.getFailureErrorAccess().getComposedErrorLeftAction_1_0()) {
					sequence_FailureError(context, (ComposedError) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.COMPOUND_EXPRESSION:
				if(context == grammarAccess.getArrayIndexRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getCompoundExpressionMainExpressionAction_9_1_0() ||
				   context == grammarAccess.getTypingStatementExpressionRule()) {
					sequence_Expression(context, (CompoundExpression) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.CONTAINER:
				if(context == grammarAccess.getArrayIndexRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getTypingStatementExpressionRule()) {
					sequence_Expression(context, (Container) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.ECLASSIFIER_TYPE:
				if(context == grammarAccess.getEClassifierTypeRule() ||
				   context == grammarAccess.getExpressionTypeRule()) {
					sequence_EClassifierType(context, (EClassifierType) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.EMPTY_ENVIRONMENT:
				if(context == grammarAccess.getEmptyEnvironmentRule() ||
				   context == grammarAccess.getEnvironmentRule() ||
				   context == grammarAccess.getEnvironmentAccess().getEnvironmentCompositionCurrentEnvironmentAction_1_0() ||
				   context == grammarAccess.getTerminalEnvironmentRule()) {
					sequence_EmptyEnvironment(context, (EmptyEnvironment) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.ENVIRONMENT_ACCESS:
				if(context == grammarAccess.getArrayIndexRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getTypingStatementExpressionRule()) {
					sequence_Expression(context, (EnvironmentAccess) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.ENVIRONMENT_ASSIGNMENT:
				if(context == grammarAccess.getEnvironmentOperationRule() ||
				   context == grammarAccess.getStandardOperationRule() ||
				   context == grammarAccess.getTypingJudgmentRule()) {
					sequence_EnvironmentOperation(context, (EnvironmentAssignment) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.ENVIRONMENT_COMPOSITION:
				if(context == grammarAccess.getEnvironmentRule() ||
				   context == grammarAccess.getEnvironmentAccess().getEnvironmentCompositionCurrentEnvironmentAction_1_0()) {
					sequence_Environment(context, (EnvironmentComposition) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.ENVIRONMENT_DECREMENT:
				if(context == grammarAccess.getEnvironmentOperationRule() ||
				   context == grammarAccess.getStandardOperationRule() ||
				   context == grammarAccess.getTypingJudgmentRule()) {
					sequence_EnvironmentOperation(context, (EnvironmentDecrement) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.ENVIRONMENT_ID:
				if(context == grammarAccess.getEnvironmentRule() ||
				   context == grammarAccess.getEnvironmentIdRule() ||
				   context == grammarAccess.getEnvironmentAccess().getEnvironmentCompositionCurrentEnvironmentAction_1_0() ||
				   context == grammarAccess.getTerminalEnvironmentRule()) {
					sequence_EnvironmentId(context, (EnvironmentId) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.ENVIRONMENT_INCREMENT:
				if(context == grammarAccess.getEnvironmentOperationRule() ||
				   context == grammarAccess.getStandardOperationRule() ||
				   context == grammarAccess.getTypingJudgmentRule()) {
					sequence_EnvironmentOperation(context, (EnvironmentIncrement) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.ENVIRONMENT_STATEMENT:
				if(context == grammarAccess.getEnvironmentRule() ||
				   context == grammarAccess.getEnvironmentStatementRule() ||
				   context == grammarAccess.getEnvironmentAccess().getEnvironmentCompositionCurrentEnvironmentAction_1_0() ||
				   context == grammarAccess.getTerminalEnvironmentRule()) {
					sequence_EnvironmentStatement(context, (EnvironmentStatement) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.EQUALS:
				if(context == grammarAccess.getEqualsRule() ||
				   context == grammarAccess.getStandardOperationRule() ||
				   context == grammarAccess.getTypingJudgmentRule()) {
					sequence_Equals(context, (Equals) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.ERROR_EXPRESSION:
				if(context == grammarAccess.getFailureErrorRule() ||
				   context == grammarAccess.getFailureErrorAccess().getComposedErrorLeftAction_1_0() ||
				   context == grammarAccess.getTerminalErrorRule()) {
					sequence_TerminalError(context, (ErrorExpression) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.ERROR_SPECIFICATION:
				if(context == grammarAccess.getErrorSpecificationRule()) {
					sequence_ErrorSpecification(context, (ErrorSpecification) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.ERROR_STRING:
				if(context == grammarAccess.getFailureErrorRule() ||
				   context == grammarAccess.getFailureErrorAccess().getComposedErrorLeftAction_1_0() ||
				   context == grammarAccess.getTerminalErrorRule()) {
					sequence_TerminalError(context, (ErrorString) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.EXISTS:
				if(context == grammarAccess.getExistsRule()) {
					sequence_Exists(context, (Exists) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getQuantificationRule() ||
				   context == grammarAccess.getTypingJudgmentRule()) {
					sequence_Quantification(context, (Exists) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.FAIL:
				if(context == grammarAccess.getFailRule() ||
				   context == grammarAccess.getStandardOperationRule() ||
				   context == grammarAccess.getTypingJudgmentRule()) {
					sequence_Fail(context, (Fail) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.FEATURE:
				if(context == grammarAccess.getSubExpressionRule()) {
					sequence_SubExpression(context, (Feature) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.FOR_ALL:
				if(context == grammarAccess.getForAllRule()) {
					sequence_ForAll(context, (ForAll) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getQuantificationRule() ||
				   context == grammarAccess.getTypingJudgmentRule()) {
					sequence_Quantification(context, (ForAll) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.FOR_EACH:
				if(context == grammarAccess.getForEachRule()) {
					sequence_ForEach(context, (ForEach) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getQuantificationRule() ||
				   context == grammarAccess.getTypingJudgmentRule()) {
					sequence_Quantification(context, (ForEach) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.GET_ALL:
				if(context == grammarAccess.getArrayIndexRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getTypingStatementExpressionRule()) {
					sequence_Expression(context, (GetAll) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.INDEXED:
				if(context == grammarAccess.getSubExpressionRule()) {
					sequence_SubExpression(context, (Indexed) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.INDEXED_VARIABLE:
				if(context == grammarAccess.getArrayIndexRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getCompoundExpressionMainExpressionAction_9_1_0() ||
				   context == grammarAccess.getIndexedVariableRule() ||
				   context == grammarAccess.getTerminalExpressionRule() ||
				   context == grammarAccess.getTypingStatementExpressionRule() ||
				   context == grammarAccess.getVariableAccessRule()) {
					sequence_IndexedVariable(context, (IndexedVariable) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.INTEGER_CONSTANT:
				if(context == grammarAccess.getArrayIndexRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getCompoundExpressionMainExpressionAction_9_1_0() ||
				   context == grammarAccess.getIntegerConstantRule() ||
				   context == grammarAccess.getTerminalExpressionRule() ||
				   context == grammarAccess.getTypingStatementExpressionRule()) {
					sequence_IntegerConstant(context, (IntegerConstant) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.JUDGMENT_DESCRIPTION:
				if(context == grammarAccess.getJudgmentDescriptionRule()) {
					sequence_JudgmentDescription(context, (JudgmentDescription) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.LENGTH:
				if(context == grammarAccess.getArrayIndexRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getTypingStatementExpressionRule()) {
					sequence_Expression(context, (Length) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.LIST_DECREMENT:
				if(context == grammarAccess.getListOperationRule() ||
				   context == grammarAccess.getStandardOperationRule() ||
				   context == grammarAccess.getTypingJudgmentRule()) {
					sequence_ListOperation(context, (ListDecrement) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.LIST_INCREMENT:
				if(context == grammarAccess.getListOperationRule() ||
				   context == grammarAccess.getStandardOperationRule() ||
				   context == grammarAccess.getTypingJudgmentRule()) {
					sequence_ListOperation(context, (ListIncrement) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.NEW_NAME:
				if(context == grammarAccess.getArrayIndexRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getTypingStatementExpressionRule()) {
					sequence_Expression(context, (NewName) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.NULL:
				if(context == grammarAccess.getArrayIndexRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getTypingStatementExpressionRule()) {
					sequence_TypingStatementExpression(context, (Null) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.OR_BRANCH:
				if(context == grammarAccess.getOrBranchRule()) {
					sequence_OrBranch(context, (OrBranch) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.OR_TYPING_JUDGMENT:
				if(context == grammarAccess.getOrTypingJudgmentRule() ||
				   context == grammarAccess.getTypingJudgmentRule()) {
					sequence_OrTypingJudgment(context, (OrTypingJudgment) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.RULE_WITH_PREMISES:
				if(context == grammarAccess.getRuleRule() ||
				   context == grammarAccess.getRuleWithPremisesRule()) {
					sequence_RuleWithPremises(context, (RuleWithPremises) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.STRING_CONSTANT:
				if(context == grammarAccess.getArrayIndexRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getCompoundExpressionMainExpressionAction_9_1_0() ||
				   context == grammarAccess.getStringConstantRule() ||
				   context == grammarAccess.getTerminalExpressionRule() ||
				   context == grammarAccess.getTypingStatementExpressionRule()) {
					sequence_StringConstant(context, (StringConstant) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.SUCCESS:
				if(context == grammarAccess.getStandardOperationRule() ||
				   context == grammarAccess.getSuccessRule() ||
				   context == grammarAccess.getTypingJudgmentRule()) {
					sequence_TypingJudgment(context, (Success) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.TYPE_SYSTEM_DEFINITION:
				if(context == grammarAccess.getTypeSystemDefinitionRule()) {
					sequence_TypeSystemDefinition(context, (TypeSystemDefinition) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT:
				if(context == grammarAccess.getTypingJudgmentRule() ||
				   context == grammarAccess.getTypingJudgmentWithEnvironmentRule()) {
					sequence_TypingJudgmentWithEnvironment(context, (TypingJudgmentWithEnvironment) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.TYPING_STATEMENT:
				if(context == grammarAccess.getTypingStatementRule()) {
					sequence_TypingStatement(context, (TypingStatement) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE:
				if(context == grammarAccess.getArrayIndexRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getTypingJudgmentRule() ||
				   context == grammarAccess.getTypingStatementExpressionRule() ||
				   context == grammarAccess.getVariableDeclarationRule() ||
				   context == grammarAccess.getVariableDeclarationWithTypeRule()) {
					sequence_VariableDeclarationWithType(context, (VariableDeclarationWithType) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.VARIABLE_REFERENCE:
				if(context == grammarAccess.getArrayIndexRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getCompoundExpressionMainExpressionAction_9_1_0() ||
				   context == grammarAccess.getTerminalExpressionRule() ||
				   context == grammarAccess.getTypingStatementExpressionRule() ||
				   context == grammarAccess.getVariableAccessRule() ||
				   context == grammarAccess.getVariableReferenceRule()) {
					sequence_VariableReference(context, (VariableReference) semanticObject); 
					return; 
				}
				else break;
			case TypesystemPackage.VARIABLE_SIMPLE_DECLARATION:
				if(context == grammarAccess.getVariableDeclarationRule() ||
				   context == grammarAccess.getVariableSimpleDeclarationRule()) {
					sequence_VariableSimpleDeclaration(context, (VariableSimpleDeclaration) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=Expression right=Expression)
	 *
	 * Features:
	 *    left[1, 1]
	 *    right[1, 1]
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.ASSIGNMENT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.ASSIGNMENT__LEFT));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.ASSIGNMENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.ASSIGNMENT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignmentAccess().getLeftExpressionParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAssignmentAccess().getRightExpressionParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID typejudgment=TypingJudgmentWithEnvironment)
	 *
	 * Features:
	 *    name[1, 1]
	 *    typejudgment[1, 1]
	 */
	protected void sequence_Axiom(EObject context, Axiom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (basic='String' | basic='Integer' | basic='Object')
	 *
	 * Features:
	 *    basic[0, 3]
	 */
	protected void sequence_BasicType(EObject context, BasicType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (collection='List' type=ExpressionType)
	 *
	 * Features:
	 *    collection[1, 1]
	 *    type[1, 1]
	 */
	protected void sequence_CollectionType(EObject context, CollectionType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.COLLECTION_TYPE__COLLECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.COLLECTION_TYPE__COLLECTION));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.COLLECTION_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.COLLECTION_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCollectionTypeAccess().getCollectionListKeyword_0_0(), semanticObject.getCollection());
		feeder.accept(grammarAccess.getCollectionTypeAccess().getTypeExpressionTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     eclassifier=[EClassifier|ID]
	 *
	 * Features:
	 *    eclassifier[1, 1]
	 */
	protected void sequence_EClassifierType(EObject context, EClassifierType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.ECLASSIFIER_TYPE__ECLASSIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.ECLASSIFIER_TYPE__ECLASSIFIER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEClassifierTypeAccess().getEclassifierEClassifierIDTerminalRuleCall_0_1(), semanticObject.getEclassifier());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     empty='empty'
	 *
	 * Features:
	 *    empty[1, 1]
	 */
	protected void sequence_EmptyEnvironment(EObject context, EmptyEnvironment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.EMPTY_ENVIRONMENT__EMPTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.EMPTY_ENVIRONMENT__EMPTY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEmptyEnvironmentAccess().getEmptyEmptyKeyword_0(), semanticObject.getEmpty());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     environmentId=ID
	 *
	 * Features:
	 *    environmentId[1, 1]
	 */
	protected void sequence_EnvironmentId(EObject context, EnvironmentId semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_ID__ENVIRONMENT_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_ID__ENVIRONMENT_ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnvironmentIdAccess().getEnvironmentIdIDTerminalRuleCall_0(), semanticObject.getEnvironmentId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=EnvironmentId right=Environment)
	 *
	 * Features:
	 *    left[1, 1]
	 *    right[1, 1]
	 */
	protected void sequence_EnvironmentOperation(EObject context, EnvironmentAssignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_OPERATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_ASSIGNMENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_ASSIGNMENT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnvironmentOperationAccess().getLeftEnvironmentIdParserRuleCall_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getEnvironmentOperationAccess().getRightEnvironmentParserRuleCall_0_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=EnvironmentId right=TypingStatementExpression)
	 *
	 * Features:
	 *    left[1, 1]
	 *    right[1, 1]
	 */
	protected void sequence_EnvironmentOperation(EObject context, EnvironmentDecrement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_OPERATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_DECREMENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_DECREMENT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnvironmentOperationAccess().getLeftEnvironmentIdParserRuleCall_2_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getEnvironmentOperationAccess().getRightTypingStatementExpressionParserRuleCall_2_4_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=EnvironmentId right=EnvironmentStatement)
	 *
	 * Features:
	 *    left[1, 1]
	 *    right[1, 1]
	 */
	protected void sequence_EnvironmentOperation(EObject context, EnvironmentIncrement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_OPERATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_INCREMENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_INCREMENT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnvironmentOperationAccess().getLeftEnvironmentIdParserRuleCall_1_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getEnvironmentOperationAccess().getRightEnvironmentStatementParserRuleCall_1_4_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=TypingStatementExpression relation=MappingRelation right=TypingStatementExpression)
	 *
	 * Features:
	 *    left[1, 1]
	 *    relation[1, 1]
	 *    right[1, 1]
	 */
	protected void sequence_EnvironmentStatement(EObject context, EnvironmentStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_STATEMENT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_STATEMENT__LEFT));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_STATEMENT__RELATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_STATEMENT__RELATION));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_STATEMENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_STATEMENT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnvironmentStatementAccess().getLeftTypingStatementExpressionParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getEnvironmentStatementAccess().getRelationMappingRelationParserRuleCall_1_0(), semanticObject.getRelation());
		feeder.accept(grammarAccess.getEnvironmentStatementAccess().getRightTypingStatementExpressionParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (currentEnvironment=Environment_EnvironmentComposition_1_0 op=EnvironmentComposition subEnvironment=Environment)
	 *
	 * Features:
	 *    currentEnvironment[1, 1]
	 *    op[1, 1]
	 *    subEnvironment[1, 1]
	 */
	protected void sequence_Environment(EObject context, EnvironmentComposition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_COMPOSITION__CURRENT_ENVIRONMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_COMPOSITION__CURRENT_ENVIRONMENT));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_COMPOSITION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_COMPOSITION__OP));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_COMPOSITION__SUB_ENVIRONMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_COMPOSITION__SUB_ENVIRONMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnvironmentAccess().getEnvironmentCompositionCurrentEnvironmentAction_1_0(), semanticObject.getCurrentEnvironment());
		feeder.accept(grammarAccess.getEnvironmentAccess().getOpEnvironmentCompositionParserRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getEnvironmentAccess().getSubEnvironmentEnvironmentParserRuleCall_1_2_0(), semanticObject.getSubEnvironment());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression (op=EqualsOp | op=NotEqualsOp) right=Expression error=ErrorSpecification?)
	 *
	 * Features:
	 *    left[1, 1]
	 *    op[0, 2]
	 *    right[1, 1]
	 *    error[0, 1]
	 */
	protected void sequence_Equals(EObject context, Equals semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     failureError=FailureError
	 *
	 * Features:
	 *    failureError[1, 1]
	 */
	protected void sequence_ErrorSpecification(EObject context, ErrorSpecification semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.ERROR_SPECIFICATION__FAILURE_ERROR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.ERROR_SPECIFICATION__FAILURE_ERROR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getErrorSpecificationAccess().getFailureErrorFailureErrorParserRuleCall_2_0(), semanticObject.getFailureError());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (not?='!'? variable=VariableSimpleDeclaration expression=Expression judgments+=TypingJudgment+)
	 *
	 * Features:
	 *    expression[1, 1]
	 *    variable[1, 1]
	 *    judgments[1, *]
	 *    not[0, 1]
	 */
	protected void sequence_Exists(EObject context, Exists semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ExpressionType expression=Expression)
	 *
	 * Features:
	 *    type[1, 1]
	 *    expression[1, 1]
	 */
	protected void sequence_Expression(EObject context, CastTo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.CAST_TO__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.CAST_TO__TYPE));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.CAST_TO__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.CAST_TO__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionAccess().getTypeExpressionTypeParserRuleCall_5_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getExpressionAccess().getExpressionExpressionParserRuleCall_5_4_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     argument=Expression
	 *
	 * Features:
	 *    argument[1, 1]
	 */
	protected void sequence_Expression(EObject context, Clone semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.CLONE__ARGUMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.CLONE__ARGUMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionAccess().getArgumentExpressionParserRuleCall_8_3_0(), semanticObject.getArgument());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (mainExpression=Expression_CompoundExpression_9_1_0 op='.' subExpression=SubExpression)
	 *
	 * Features:
	 *    mainExpression[1, 1]
	 *    op[1, 1]
	 *    subExpression[1, 1]
	 */
	protected void sequence_Expression(EObject context, CompoundExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.COMPOUND_EXPRESSION__MAIN_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.COMPOUND_EXPRESSION__MAIN_EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.COMPOUND_EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.COMPOUND_EXPRESSION__OP));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.COMPOUND_EXPRESSION__SUB_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.COMPOUND_EXPRESSION__SUB_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionAccess().getCompoundExpressionMainExpressionAction_9_1_0(), semanticObject.getMainExpression());
		feeder.accept(grammarAccess.getExpressionAccess().getOpFullStopKeyword_9_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getExpressionAccess().getSubExpressionSubExpressionParserRuleCall_9_1_2_0(), semanticObject.getSubExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     argument=Expression
	 *
	 * Features:
	 *    argument[1, 1]
	 */
	protected void sequence_Expression(EObject context, Container semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.CONTAINER__ARGUMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.CONTAINER__ARGUMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionAccess().getArgumentExpressionParserRuleCall_4_3_0(), semanticObject.getArgument());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (envId=EnvironmentId argument=Expression)
	 *
	 * Features:
	 *    envId[1, 1]
	 *    argument[1, 1]
	 */
	protected void sequence_Expression(EObject context, EnvironmentAccess semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_ACCESS__ENV_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_ACCESS__ENV_ID));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_ACCESS__ARGUMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.ENVIRONMENT_ACCESS__ARGUMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionAccess().getEnvIdEnvironmentIdParserRuleCall_1_3_0(), semanticObject.getEnvId());
		feeder.accept(grammarAccess.getExpressionAccess().getArgumentExpressionParserRuleCall_1_5_0(), semanticObject.getArgument());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression mainfeature=[EStructuralFeature|ID] extendfeature=[EStructuralFeature|ID])
	 *
	 * Features:
	 *    expression[1, 1]
	 *    mainfeature[1, 1]
	 *    extendfeature[1, 1]
	 */
	protected void sequence_Expression(EObject context, GetAll semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.GET_ALL__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.GET_ALL__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.GET_ALL__MAINFEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.GET_ALL__MAINFEATURE));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.GET_ALL__EXTENDFEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.GET_ALL__EXTENDFEATURE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionAccess().getExpressionExpressionParserRuleCall_3_3_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getExpressionAccess().getMainfeatureEStructuralFeatureIDTerminalRuleCall_3_5_0_1(), semanticObject.getMainfeature());
		feeder.accept(grammarAccess.getExpressionAccess().getExtendfeatureEStructuralFeatureIDTerminalRuleCall_3_7_0_1(), semanticObject.getExtendfeature());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     argument=Expression
	 *
	 * Features:
	 *    argument[1, 1]
	 */
	protected void sequence_Expression(EObject context, Length semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.LENGTH__ARGUMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.LENGTH__ARGUMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionAccess().getArgumentExpressionParserRuleCall_2_3_0(), semanticObject.getArgument());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     argument=STRING
	 *
	 * Features:
	 *    argument[1, 1]
	 */
	protected void sequence_Expression(EObject context, NewName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.NEW_NAME__ARGUMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.NEW_NAME__ARGUMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionAccess().getArgumentSTRINGTerminalRuleCall_7_3_0(), semanticObject.getArgument());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (error=ErrorSpecification?)
	 *
	 * Features:
	 *    error[0, 1]
	 */
	protected void sequence_Fail(EObject context, Fail semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=FailureError_ComposedError_1_0 op=PlusOp right=FailureError)
	 *
	 * Features:
	 *    left[1, 1]
	 *    op[1, 1]
	 *    right[1, 1]
	 */
	protected void sequence_FailureError(EObject context, ComposedError semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.COMPOSED_ERROR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.COMPOSED_ERROR__LEFT));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.COMPOSED_ERROR__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.COMPOSED_ERROR__OP));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.COMPOSED_ERROR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.COMPOSED_ERROR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFailureErrorAccess().getComposedErrorLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getFailureErrorAccess().getOpPlusOpParserRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getFailureErrorAccess().getRightFailureErrorParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variable=VariableSimpleDeclaration expression=Expression judgments+=TypingJudgment+)
	 *
	 * Features:
	 *    expression[1, 1]
	 *    variable[1, 1]
	 *    judgments[1, *]
	 */
	protected void sequence_ForAll(EObject context, ForAll semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression variable=VariableSimpleDeclaration judgments+=TypingJudgment+)
	 *
	 * Features:
	 *    expression[1, 1]
	 *    variable[1, 1]
	 *    judgments[1, *]
	 */
	protected void sequence_ForEach(EObject context, ForEach semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (varRef=[VariableDeclaration|ID] index=ArrayIndex)
	 *
	 * Features:
	 *    varRef[1, 1]
	 *    index[1, 1]
	 */
	protected void sequence_IndexedVariable(EObject context, IndexedVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.VARIABLE_ACCESS__VAR_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.VARIABLE_ACCESS__VAR_REF));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.INDEXED_VARIABLE__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.INDEXED_VARIABLE__INDEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIndexedVariableAccess().getVarRefVariableDeclarationIDTerminalRuleCall_1_0_1(), semanticObject.getVarRef());
		feeder.accept(grammarAccess.getIndexedVariableAccess().getIndexArrayIndexParserRuleCall_3_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_IntegerConstant(EObject context, IntegerConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.INTEGER_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.INTEGER_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerConstantAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         judgmentsymbol=STRING 
	 *         relation=STRING 
	 *         kind=STRING 
	 *         success=STRING? 
	 *         fail=STRING? 
	 *         nomatch=STRING? 
	 *         binary?='binary'?
	 *     )
	 *
	 * Features:
	 *    judgmentsymbol[1, 1]
	 *    relation[1, 1]
	 *    kind[1, 1]
	 *    success[0, 1]
	 *    fail[0, 1]
	 *    nomatch[0, 1]
	 *    binary[0, 1]
	 */
	protected void sequence_JudgmentDescription(EObject context, JudgmentDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression right=Expression)
	 *
	 * Features:
	 *    left[1, 1]
	 *    right[1, 1]
	 */
	protected void sequence_ListOperation(EObject context, ListDecrement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.LIST_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.LIST_OPERATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.LIST_OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.LIST_OPERATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getListOperationAccess().getLeftExpressionParserRuleCall_1_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getListOperationAccess().getRightExpressionParserRuleCall_1_4_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression right=Expression)
	 *
	 * Features:
	 *    left[1, 1]
	 *    right[1, 1]
	 */
	protected void sequence_ListOperation(EObject context, ListIncrement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.LIST_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.LIST_OPERATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.LIST_OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.LIST_OPERATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getListOperationAccess().getLeftExpressionParserRuleCall_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getListOperationAccess().getRightExpressionParserRuleCall_0_4_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     judgments+=TypingJudgment+
	 *
	 * Features:
	 *    judgments[1, *]
	 */
	protected void sequence_OrBranch(EObject context, OrBranch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (branches+=OrBranch branches+=OrBranch+ error=ErrorSpecification?)
	 *
	 * Features:
	 *    branches[2, *]
	 *    error[0, 1]
	 */
	protected void sequence_OrTypingJudgment(EObject context, OrTypingJudgment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (not?='!'? variable=VariableSimpleDeclaration expression=Expression judgments+=TypingJudgment+ error=ErrorSpecification?)
	 *
	 * Features:
	 *    error[0, 1]
	 *    expression[1, 1]
	 *    variable[1, 1]
	 *    judgments[1, *]
	 *    not[0, 1]
	 */
	protected void sequence_Quantification(EObject context, Exists semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=VariableSimpleDeclaration expression=Expression judgments+=TypingJudgment+ error=ErrorSpecification?)
	 *
	 * Features:
	 *    error[0, 1]
	 *    expression[1, 1]
	 *    variable[1, 1]
	 *    judgments[1, *]
	 */
	protected void sequence_Quantification(EObject context, ForAll semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression variable=VariableSimpleDeclaration judgments+=TypingJudgment+ error=ErrorSpecification?)
	 *
	 * Features:
	 *    error[0, 1]
	 *    expression[1, 1]
	 *    variable[1, 1]
	 *    judgments[1, *]
	 */
	protected void sequence_Quantification(EObject context, ForEach semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID typejudgment=TypingJudgmentWithEnvironment premises+=TypingJudgment+)
	 *
	 * Features:
	 *    name[1, 1]
	 *    typejudgment[1, 1]
	 *    premises[1, *]
	 */
	protected void sequence_RuleWithPremises(EObject context, RuleWithPremises semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_StringConstant(EObject context, StringConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.STRING_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.STRING_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringConstantAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     feature=[ENamedElement|ID]
	 *
	 * Features:
	 *    feature[1, 1]
	 */
	protected void sequence_SubExpression(EObject context, Feature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.SUB_EXPRESSION__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.SUB_EXPRESSION__FEATURE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubExpressionAccess().getFeatureENamedElementIDTerminalRuleCall_1_1_0_1(), semanticObject.getFeature());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (feature=[ENamedElement|ID] index=ArrayIndex)
	 *
	 * Features:
	 *    feature[1, 1]
	 *    index[1, 1]
	 */
	protected void sequence_SubExpression(EObject context, Indexed semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.SUB_EXPRESSION__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.SUB_EXPRESSION__FEATURE));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.INDEXED__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.INDEXED__INDEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubExpressionAccess().getFeatureENamedElementIDTerminalRuleCall_0_1_0_1(), semanticObject.getFeature());
		feeder.accept(grammarAccess.getSubExpressionAccess().getIndexArrayIndexParserRuleCall_0_3_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 *
	 * Features:
	 *    expression[1, 1]
	 */
	protected void sequence_TerminalError(EObject context, ErrorExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.ERROR_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.ERROR_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTerminalErrorAccess().getExpressionExpressionParserRuleCall_1_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     errString=STRING
	 *
	 * Features:
	 *    errString[1, 1]
	 */
	protected void sequence_TerminalError(EObject context, ErrorString semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.ERROR_STRING__ERR_STRING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.ERROR_STRING__ERR_STRING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTerminalErrorAccess().getErrStringSTRINGTerminalRuleCall_0_1_0(), semanticObject.getErrString());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? ePackage=[EPackage|STRING] genModel=STRING? judgmentDescriptions+=JudgmentDescription* rules+=Rule*)
	 *
	 * Features:
	 *    name[0, 1]
	 *    ePackage[1, 1]
	 *    genModel[0, 1]
	 *    judgmentDescriptions[0, *]
	 *    rules[0, *]
	 */
	protected void sequence_TypeSystemDefinition(EObject context, TypeSystemDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (environment=Environment typejudgmentsymbol=TypeJudgmentSymbol typingstatement=TypingStatement error=ErrorSpecification?)
	 *
	 * Features:
	 *    environment[1, 1]
	 *    typejudgmentsymbol[1, 1]
	 *    typingstatement[1, 1]
	 *    error[0, 1]
	 */
	protected void sequence_TypingJudgmentWithEnvironment(EObject context, TypingJudgmentWithEnvironment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Success}
	 *
	 * Features:
	 */
	protected void sequence_TypingJudgment(EObject context, Success semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Null}
	 *
	 * Features:
	 */
	protected void sequence_TypingStatementExpression(EObject context, Null semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=TypingStatementExpression relation=TypeRelation right=TypingStatementExpression)
	 *
	 * Features:
	 *    left[1, 1]
	 *    relation[1, 1]
	 *    right[1, 1]
	 */
	protected void sequence_TypingStatement(EObject context, TypingStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.TYPING_STATEMENT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.TYPING_STATEMENT__LEFT));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.TYPING_STATEMENT__RELATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.TYPING_STATEMENT__RELATION));
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.TYPING_STATEMENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.TYPING_STATEMENT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypingStatementAccess().getLeftTypingStatementExpressionParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getTypingStatementAccess().getRelationTypeRelationParserRuleCall_1_0(), semanticObject.getRelation());
		feeder.accept(grammarAccess.getTypingStatementAccess().getRightTypingStatementExpressionParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expressionType=ExpressionType name=ID (op=AssignOp right=Expression)?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    expressionType[1, 1]
	 *    op[0, 1]
	 *         EXCLUDE_IF_UNSET right
	 *         MANDATORY_IF_SET right
	 *    right[0, 1]
	 *         EXCLUDE_IF_UNSET op
	 *         MANDATORY_IF_SET op
	 */
	protected void sequence_VariableDeclarationWithType(EObject context, VariableDeclarationWithType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     varRef=[VariableDeclaration|ID]
	 *
	 * Features:
	 *    varRef[1, 1]
	 */
	protected void sequence_VariableReference(EObject context, VariableReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.VARIABLE_ACCESS__VAR_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.VARIABLE_ACCESS__VAR_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableReferenceAccess().getVarRefVariableDeclarationIDTerminalRuleCall_1_0_1(), semanticObject.getVarRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_VariableSimpleDeclaration(EObject context, VariableSimpleDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesystemPackage.Literals.VARIABLE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesystemPackage.Literals.VARIABLE_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableSimpleDeclarationAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
}
