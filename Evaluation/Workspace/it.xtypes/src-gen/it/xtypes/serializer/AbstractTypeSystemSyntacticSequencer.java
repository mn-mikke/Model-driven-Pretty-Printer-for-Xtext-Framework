package it.xtypes.serializer;

import com.google.inject.Inject;
import it.xtypes.services.TypeSystemGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractTypeSystemSyntacticSequencer extends AbstractSyntacticSequencer {

	protected TypeSystemGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (TypeSystemGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getAssignOpRule())
			return getAssignOpToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEqualsOpRule())
			return getEqualsOpToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMinusOpRule())
			return getMinusOpToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOrSeparatorRule())
			return getOrSeparatorToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPlusOpRule())
			return getPlusOpToken(semanticObject, ruleCall, node);
		return "";
	}
	
	protected String getAssignOpToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":=";
	}
	protected String getEqualsOpToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	protected String getMinusOpToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "-";
	}
	protected String getOrSeparatorToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "|";
	}
	protected String getPlusOpToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}
