package gpp.boxmodel.naming;

import java.util.HashSet;

import gpp.boxmodel.boxModel.AssignmentBox;
import gpp.boxmodel.boxModel.Box;
import gpp.boxmodel.boxModel.GroupBox;
import gpp.boxmodel.boxModel.MultipleBox;
import gpp.boxmodel.boxModel.ParserRuleFormatting;
import gpp.boxmodel.boxModel.ParserRuleOperatorApplication;
import gpp.boxmodel.utils.BoxModelGrammarElementDefinitions;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.inject.Inject;

public class GppQualifiedNameProvider extends IQualifiedNameProvider.AbstractImpl {
	
	@Inject
	private IQualifiedNameConverter converter = new IQualifiedNameConverter.DefaultImpl();
	
	private HashSet<String>  qualifiableElementTypes = new HashSet<String>();
	
	@Inject
	//private IResourceScopeCache cache = IResourceScopeCache.NullImpl.INSTANCE;
	
	public QualifiedName getFullyQualifiedName(final EObject obj) {
		return getFullyQualifiedName(obj,false);
	}
	
	public GppQualifiedNameProvider()
	{
		qualifiableElementTypes.add(BoxModelGrammarElementDefinitions.REFERENCE);
		qualifiableElementTypes.add(BoxModelGrammarElementDefinitions.ASSIGNMENT_BOX);
		qualifiableElementTypes.add(BoxModelGrammarElementDefinitions.MULTIPLE_BOX);
		qualifiableElementTypes.add(BoxModelGrammarElementDefinitions.RULE_FORMATTING);
	}
	
	protected boolean isContainerGroupBox(final EObject obj)
	{
		if(obj == null || obj.eContainer() == null)
		{
			return false;
		}
		EObject container = obj.eContainer();
		if(container.eClass().getName().equals(BoxModelGrammarElementDefinitions.GROUP_BOX))
		{
			return true;
		}
		if(container.eClass().getName().equals(BoxModelGrammarElementDefinitions.MULTIPLE_BOX))
		{
			return false;
		}
		return isContainerGroupBox(obj.eContainer());
	}
	
	protected boolean isElementParentsized(final Box element)
	{
		return element.isParenthesized() || isContainerPerentsizedParserOperator(element);
	}
	
	protected boolean isContainerPerentsizedParserOperator(final EObject object)
	{
		if(object == null || object.eContainer() == null || !object.eContainer().eClass().getName().equals(BoxModelGrammarElementDefinitions.PARSER_RULE_OPERATOR_APPLICATION))
		{
			return false;
		}
		ParserRuleOperatorApplication operatorApplication = (ParserRuleOperatorApplication)object.eContainer();
		return operatorApplication.isParenthesized() || isContainerPerentsizedParserOperator(object.eContainer());
	}

	protected boolean isElementQualifiable(final EObject obj)
	{
		if(obj.eClass().getName().equals(BoxModelGrammarElementDefinitions.GROUP_BOX))
		{
			GroupBox group = (GroupBox)obj;
			return (isElementParentsized(group) || !isContainerGroupBox(obj));
		}
		return qualifiableElementTypes.contains(obj.eClass().getName());
	}
	
	
	public QualifiedName getFullyQualifiedName(final EObject obj, boolean isParent) {
		//return cache.get(Tuples.pair(obj, "fqn"), obj.eResource(), new Provider<QualifiedName>(){

			//public QualifiedName get() {
				EObject temp = obj;
				// The Grammar object has no name
				if(obj instanceof ParserRuleFormatting)
				{
					ParserRuleFormatting formatting = (ParserRuleFormatting)obj;
					AbstractRule rule = formatting.getRule();
					if(rule == null || rule.getName() == null)
					{
						return null;
					}
					return converter.toQualifiedName(rule.getName());
				}
				if(!isElementQualifiable(obj))
				{
					return null;
				}
				int order = getOrderNumber(obj);
				QualifiedName qualifiedNameFromConverter = converter.toQualifiedName(String.valueOf(order));
				if(order < 0)
				{
					qualifiedNameFromConverter = QualifiedName.EMPTY;
				}
				if(isParent)
				{
					if(obj.eClass().getName().equals(BoxModelGrammarElementDefinitions.ASSIGNMENT_BOX))
					{
						qualifiedNameFromConverter = qualifiedNameFromConverter.append(":");
					}
					if(obj.eClass().getName().equals(BoxModelGrammarElementDefinitions.MULTIPLE_BOX))
					{
						qualifiedNameFromConverter = qualifiedNameFromConverter.append(((MultipleBox)obj).getType());
					}
					if(obj.eClass().getName().equals(BoxModelGrammarElementDefinitions.GROUP_BOX))
					{
							qualifiedNameFromConverter = qualifiedNameFromConverter.append(" ");
					}
				}
				while (temp.eContainer() != null) {
					temp = temp.eContainer();
					QualifiedName parentsQualifiedName = getFullyQualifiedName(temp, true);
					if (parentsQualifiedName != null)
						return parentsQualifiedName.append(qualifiedNameFromConverter);
				}
				return qualifiedNameFromConverter;
			//}
		//});
	}

	
	protected int getOrderNumber(final EObject obj)
	{
		if(obj.eContainer() == null)
		{
			return -1;
		}
		if(obj.eContainer().eClass().getName().equals(BoxModelGrammarElementDefinitions.ASSIGNMENT_BOX))
		{
			return -1;
		}
		if(obj.eContainer().eClass().getName().equals(BoxModelGrammarElementDefinitions.MULTIPLE_BOX))
		{
			int returnValue = 0;
			MultipleBox multipleBox = (MultipleBox)obj.eContainer();
			for(Box box : multipleBox.getElements())
			{
				if(box.equals(obj))
				{
					break;
				}
				returnValue += getRecoursiveSize(box);
			}
			return returnValue;
		}
		if(obj.eContainer().eClass().getName().equals(BoxModelGrammarElementDefinitions.GROUP_BOX))
		{
			int returnValue = 0;
			GroupBox groupBox= (GroupBox)obj.eContainer();
			for(Box box : groupBox.getElements())
			{
				if(box.equals(obj))
				{
					break;
				}
				returnValue += getRecoursiveSize(box);
			}			
			if(!isElementQualifiable(obj.eContainer()))
			{
				returnValue += getOrderNumber(obj.eContainer());
			}
			return returnValue;
		}
		return getOrderNumber(obj.eContainer());
	}
	
	protected int getRecoursiveSize(final EObject obj)
	{
		if(obj.eClass().getName().equals(BoxModelGrammarElementDefinitions.GROUP_BOX) && !isElementQualifiable(obj))
		{
			int returnValue = 0;
			GroupBox groupBox = (GroupBox)obj;
			for(Box box : groupBox.getElements())
			{
				returnValue += getRecoursiveSize(box);
			}
			return returnValue;
		}
		else if(obj.eClass().getName().equals(BoxModelGrammarElementDefinitions.ASSIGNMENT_BOX))
		{
			if(((AssignmentBox)obj).getTerminal() == null)
			{
				return 1;
			}
			return getRecoursiveSize(((AssignmentBox)obj).getTerminal());
		}
		else if(obj.eClass().getName().equals(BoxModelGrammarElementDefinitions.PARSER_RULE_OPERATOR_APPLICATION))
		{
			if(((ParserRuleOperatorApplication)obj).getContent() == null)
			{
				return 1;
			}
		    return getRecoursiveSize(((ParserRuleOperatorApplication)obj).getContent());
		}
		else
		{
			return 1;
		}
			
	}
	
	protected IQualifiedNameConverter getConverter() {
		return converter;
	}
}