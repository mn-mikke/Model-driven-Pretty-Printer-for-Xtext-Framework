package cz.gpp.zoo.ui.highlighting;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class ZooSemanticHighlightingCalculator implements
		ISemanticHighlightingCalculator
{
	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor){
		
		INode root = resource.getParseResult().getRootNode();
		for (INode node : root.getAsTreeIterable()){   
		   EObject grammarElement = node.getGrammarElement();
		   boolean header=false;
		   if(grammarElement instanceof RuleCall)
		   {
			   RuleCall ruleCallElement = (RuleCall)grammarElement;
			   AbstractRule rule = ruleCallElement.getRule();
			   EObject container = grammarElement.eContainer();
			   
			   if(rule.getName().equals("STRING")
					   && container instanceof Assignment 
					   && ((Assignment)container).getFeature().equals("name")
			   ){
				   header=true;
			   } 
		   }
		   if(grammarElement instanceof Keyword)
		   {
			   Keyword keyword = (Keyword)grammarElement;
			   if(keyword.getValue().equals("animal"))
			   {
				   header=true;
			   }
		   }
		   INode parent = node.getParent();
		   if(parent != null 
				   && parent.getGrammarElement() instanceof RuleCall
		   ){
			   RuleCall ruleCallElement = (RuleCall)parent.getGrammarElement();
			   AbstractRule r = ruleCallElement.getRule();
			   if(!r.getName().equals("Animal"))
			   {
				   header=false;
			   }
		   }
		   else
		   {
			   header=false;
		   }
		   if(header)
		   {
			   acceptor.addPosition(
				  node.getOffset(),
				  node.getLength(),
			      ZooHighlightingConfiguration.HEADER_ID
			    );
		   }
	   }
	}
}
