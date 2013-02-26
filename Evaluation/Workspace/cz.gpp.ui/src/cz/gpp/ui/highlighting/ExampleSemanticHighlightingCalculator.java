package cz.gpp.ui.highlighting;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class ExampleSemanticHighlightingCalculator implements
		ISemanticHighlightingCalculator
{
	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor){
		// It gets a node model.
		INode root = resource.getParseResult().getRootNode();
		for (INode node : root.getAsTreeIterable()){   
		   EObject grammarElement = node.getGrammarElement(); 
		   if(grammarElement instanceof RuleCall)
		   {
			   RuleCall ruleCallElement = (RuleCall)grammarElement;
			   AbstractRule rule = ruleCallElement.getRule();
			   EObject container = grammarElement.eContainer();
			   
			   // It tests whether the node represents 
			   // a name of an element (class, method, parameter).
			   if(rule.getName().equals("ID")
					   && container instanceof Assignment 
					   && ((Assignment)container).getFeature().equals("name")
			   ){
				   INode parent = node.getParent();
				   if(parent != null 
						   && parent.getGrammarElement() instanceof RuleCall
				   ){
					   ruleCallElement = (RuleCall)parent.getGrammarElement();
					   AbstractRule r = ruleCallElement.getRule();
					   
					   // It tests whether the parent node represents a method.
					   if(r.getName().equals("Method"))
					   {
						   acceptor.addPosition(
								   node.getOffset(),
								   node.getLength(),
								   ExampleHighlightingConfiguration.METHOD_ID
						   );
					   }
				   }
			   }
		   }
	   }
	}
}
