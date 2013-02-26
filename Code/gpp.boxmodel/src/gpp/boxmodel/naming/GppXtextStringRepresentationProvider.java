package gpp.boxmodel.naming;

import gpp.boxmodel.utils.XtextGrammarElementDefinitions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.*;


public class GppXtextStringRepresentationProvider extends CompositeStringRepresentationProvider
{
	
	public GppXtextStringRepresentationProvider()
	{
		specificProviders.put(XtextGrammarElementDefinitions.ASSIGNMENT, new AssignmentStringRepresentationProvider());
		specificProviders.put(XtextGrammarElementDefinitions.RULE_CALL, new RuleCallStringRepresentationProvider());
		specificProviders.put(XtextGrammarElementDefinitions.CROSS_REFERENCE, new CrossReferenceStringRepresentationProvider());
		specificProviders.put(XtextGrammarElementDefinitions.KEYWORD, new KeywordStringRepresentationProvider());
		AbstractRuleStringRepresentationProvider abstractRuleStringRepresentationProvider = new AbstractRuleStringRepresentationProvider();
		specificProviders.put(XtextGrammarElementDefinitions.TERMINAL_RULE, abstractRuleStringRepresentationProvider);
		specificProviders.put(XtextGrammarElementDefinitions.PARSER_RULE, abstractRuleStringRepresentationProvider);
	}
	
	@Override
	public String getStringRepresentation(EObject obj) {
		if(obj == null)
		{
			return null;
		}
		String elementName = obj.eClass().getName();
		IStringRepresentationProvider specificProvider = specificProviders.get(elementName);
		if(specificProvider == null)
		{
			return null;
		}
		return specificProvider.getStringRepresentation(obj);
	}
	
	abstract class InnerCompositeStringRepresentationProvider extends CompositeStringRepresentationProvider
	{
		@Override
		protected IStringRepresentationProvider getStringRepresentationProvider(EObject obj)
		{
			String elementName = obj.eClass().getName();
			IStringRepresentationProvider returnValue = specificProviders.get(elementName);
			if(returnValue == null)
			{
				returnValue = GppXtextStringRepresentationProvider.this.specificProviders.get(elementName);
			}
			return returnValue;
		}
	}

	class AssignmentStringRepresentationProvider implements IStringRepresentationProvider
	{
		@Override
		public String getStringRepresentation(EObject obj) {
			Assignment assignment = (Assignment)obj;
			return assignment.getFeature();
		}
	}
	
	class RuleCallStringRepresentationProvider implements IStringRepresentationProvider
	{
		@Override
		public String getStringRepresentation(EObject obj) {
			RuleCall ruleCall = (RuleCall)obj;
			if(ruleCall.getRule() == null)
			{
				return null;
			}
			return ruleCall.getRule().getName();
		}
	}
	
	class KeywordStringRepresentationProvider implements IStringRepresentationProvider
	{
		@Override
		public String getStringRepresentation(EObject obj) {
			Keyword keyword = (Keyword)obj;
			return keyword.getValue();
		}
	}
	
	class TypeRefStringRepresentationProvider implements IStringRepresentationProvider
	{
		@Override
		public String getStringRepresentation(EObject obj) {
			TypeRef typeRef = (TypeRef)obj;
			StringBuilder builder = new StringBuilder();
			if(typeRef.getMetamodel() != null  && typeRef.getMetamodel().getAlias() !=null)
			{
				builder.append(typeRef.getMetamodel().getAlias());
				builder.append("::");
			}
			builder.append(GrammarUtil.getTypeRefName(typeRef));
			return builder.toString();
		}
		
	}
	
	class AbstractRuleStringRepresentationProvider implements IStringRepresentationProvider
	{
		@Override
		public String getStringRepresentation(EObject obj) {
			AbstractRule rule = (AbstractRule)obj;
			return rule.getName();
		}
		
	}
	
	class CrossReferenceStringRepresentationProvider extends InnerCompositeStringRepresentationProvider
	{
		public CrossReferenceStringRepresentationProvider()
		{
			specificProviders.put(XtextGrammarElementDefinitions.TYPE_REFERENCE, new TypeRefStringRepresentationProvider());
		}
		
		@Override
		public String getStringRepresentation(EObject obj) {
			
			CrossReference  crossReference  = (CrossReference)obj;
			if(crossReference.getType() == null)
			{
				return null;
			}
			IStringRepresentationProvider typeStringRepresentationProvider = getStringRepresentationProvider(crossReference.getType());
			StringBuilder builder = new StringBuilder();
			builder.append('[');
			builder.append(typeStringRepresentationProvider.getStringRepresentation(crossReference.getType()));
			if(crossReference.getTerminal() != null)
			{
				builder.append('|');
				IStringRepresentationProvider crossTerminalStringRepresentationProvider = getStringRepresentationProvider(crossReference.getTerminal());
				builder.append(crossTerminalStringRepresentationProvider.getStringRepresentation(crossReference.getTerminal()));
			}
			builder.append(']');
			return builder.toString();
		}
	}
}
