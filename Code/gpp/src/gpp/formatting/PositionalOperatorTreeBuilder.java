package gpp.formatting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.BidiIterable;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.CompositeNode;
import org.eclipse.xtext.nodemodel.impl.HiddenLeafNode;
import org.eclipse.xtext.nodemodel.util.EmptyBidiIterable;
import org.eclipse.xtext.nodemodel.util.NodeIterable;
import gpp.boxmodel.boxModel.Box;
import gpp.boxmodel.boxModel.BoxModel;
import gpp.boxmodel.boxModel.KeywordTerminalRuleFormatting;
import gpp.boxmodel.boxModel.ParserRuleOperatorApplication;
import gpp.boxmodel.boxModel.Reference;
import gpp.boxmodel.boxModel.TerminalRuleFormatting;
import gpp.boxmodel.boxModel.TerminalRuleOperatorApplication;
import gpp.boxmodel.naming.GppXtextQualifiedNameProvider;
import gpp.boxmodel.operators.boxModelOperators.BasicOperatorDefinition;
import gpp.boxmodel.operators.impl.ParameterResult;
import gpp.boxmodel.operators.utils.BoxModelOperatorsHelper;
import gpp.boxmodel.utils.BoxModelHelper;
import gpp.boxmodel.utils.CurrentParameterValueFinder;
import gpp.boxmodel.utils.ReferenceTableProvider;
import gpp.common.GppNodeIterable;


public class PositionalOperatorTreeBuilder {
	private GppXtextQualifiedNameProvider qualifiedNameProvider = new GppXtextQualifiedNameProvider();
	
	private static final String POSITIONAL_EXCEPTION_MESSAGE = "The implementation of the positional operator does not extend the AbstractPositionalOperatorImplementation class.";
	private static final String TRANSFORMING_EXCEPTION_MESSAGE = "The implementation of the transforming operator does not extend the AbstractTransformingOperatorImplementation class.";
	
	private HashMap<QualifiedName, Reference> referenceTable;
	
	private BoxModel boxModel;

	
	private CurrentParameterValueFinder parameterValueFinder = new CurrentParameterValueFinder();
	
	public PositionalOperatorTreeBuilder(BoxModel boxModel)
	{
		this.boxModel = boxModel;
		ReferenceTableProvider tableProvider = new ReferenceTableProvider();
		tableProvider.initialize(qualifiedNameProvider);
		referenceTable = tableProvider.getReferenceTable(boxModel);
	}
	
	protected void addNodeMap(ICompositeOperatorTreeNode node, HashMap<String,ICompositeOperatorTreeNode> map)
	{
		if(!map.containsKey(node.getName()))
		{
			map.put(node.getName(),node);
		}
		for(IOperatorTreeNode child : node.getChildren())
		{
			if(child instanceof ICompositeOperatorTreeNode)
			{
				addNodeMap((ICompositeOperatorTreeNode)child, map);
			}
		}
	}
	
	protected AbstractTransformingOperatorImplementation getTransformingOperatorForTerminal(INode node, String ruleName)
	{
		for(TerminalRuleFormatting terminalRuleFormatting : boxModel.getFormatting().getTerminalRuleFormattings())
		{
			if(terminalRuleFormatting.getRule().getName().equals(ruleName))
			{
				TerminalRuleOperatorApplication ruleApplication = BoxModelHelper.getTransformingOperatorApplication(terminalRuleFormatting.getContent());
				if(ruleApplication == null)
				{
					return null;
				}
				BasicOperatorDefinition basicOperator  = BoxModelOperatorsHelper.getBasicOperator(ruleApplication.getOperator());
				if(basicOperator == null)
				{
					return null;
				}
				Object retVal;
				try {
					retVal = Class.forName(basicOperator.getImplementation()).newInstance();
				} catch (Exception e) {
					throw new WrappedException(e);
				}
				if(!(retVal instanceof AbstractTransformingOperatorImplementation))
				{
					throw new IllegalStateException(TRANSFORMING_EXCEPTION_MESSAGE);
				}
				AbstractTransformingOperatorImplementation operatorImplementation = (AbstractTransformingOperatorImplementation)retVal;
				HashMap<String, ParameterResult> parameters = parameterValueFinder.getCurrentParameterValues(ruleApplication);
				operatorImplementation.initialize(node,parameters);
				operatorImplementation.setName(ruleApplication.getName());
				return operatorImplementation;
			}
		}
		return null;
	}
	
	protected AbstractTransformingOperatorImplementation getTransformingOperatorForKeyword(INode node, String keyword)
	{
		for(KeywordTerminalRuleFormatting terminalRuleFormatting : boxModel.getFormatting().getKeywordTerminalRuleFormattings())
		{
			if(Pattern.matches(terminalRuleFormatting.getPattern(),keyword))
			{
				TerminalRuleOperatorApplication ruleApplication = BoxModelHelper.getTransformingOperatorApplication(terminalRuleFormatting.getContent());
				if(ruleApplication == null)
				{
					continue;
				}
				BasicOperatorDefinition basicOperator  = BoxModelOperatorsHelper.getBasicOperator(ruleApplication.getOperator());
				if(basicOperator == null)
				{
					continue;
				}
				Object retVal;
				try {
					retVal = Class.forName(basicOperator.getImplementation()).newInstance();
				} catch (Exception e) {
					throw new WrappedException(e);
				}
				if(!(retVal instanceof AbstractTransformingOperatorImplementation))
				{
					throw new IllegalStateException(TRANSFORMING_EXCEPTION_MESSAGE);
				}
				AbstractTransformingOperatorImplementation operatorImplementation = (AbstractTransformingOperatorImplementation)retVal;
				HashMap<String, ParameterResult> parameters = parameterValueFinder.getCurrentParameterValues(ruleApplication);
				operatorImplementation.initialize(node,parameters);
				operatorImplementation.setName(ruleApplication.getName());
				return operatorImplementation;
			}
		}
		return null;
	}
	
	protected AbstractTransformingOperatorImplementation getDefaultTransformingOperator(INode node)
	{
		TerminalRuleOperatorApplication ruleApplication = BoxModelHelper.getTransformingOperatorApplication(boxModel.getFormatting().getDefaultTerminalRuleFormatting().getContent());
		if(ruleApplication == null)
		{
			return null;
		}
		BasicOperatorDefinition basicOperator  = BoxModelOperatorsHelper.getBasicOperator(ruleApplication.getOperator());
		if(basicOperator == null)
		{
			return null;
		}
		Object retVal;
		try {
			retVal = Class.forName(basicOperator.getImplementation()).newInstance();
		} catch (Exception e) {
			throw new WrappedException(e);
		}
		if(!(retVal instanceof AbstractTransformingOperatorImplementation))
		{
			throw new IllegalStateException(TRANSFORMING_EXCEPTION_MESSAGE);
		}
		AbstractTransformingOperatorImplementation operatorImplementation = (AbstractTransformingOperatorImplementation)retVal;
		HashMap<String, ParameterResult> parameters = parameterValueFinder.getCurrentParameterValues(ruleApplication);
		operatorImplementation.initialize(node,parameters);
		operatorImplementation.setName(ruleApplication.getName());
		return operatorImplementation;
	}
	
	public List<ICompositeOperatorTreeNode> buildOperatorTree(ICompositeNode compositeNode, List<AbstractTransformingOperatorImplementation> comments)
	{
		List<ICompositeOperatorTreeNode> returnValue = new ArrayList<ICompositeOperatorTreeNode>(1);
		HashMap<String,ICompositeOperatorTreeNode> operators = new HashMap<String,ICompositeOperatorTreeNode>();
		for(INode node : compositeNode.getChildren())
		{
			INode tempNode = node;
			
			if(tempNode instanceof HiddenLeafNode)
			{
				EObject grammarElement = tempNode.getGrammarElement();
				if(grammarElement instanceof TerminalRule)
				{
					AbstractTransformingOperatorImplementation comment = getTransformingOperatorForTerminal(tempNode, ((TerminalRule)grammarElement).getName());
					if(comment != null)
					{
						comments.add(comment);
					}
				}
				continue;
			}
			
			EObject grammarElement = tempNode.getGrammarElement();
			if(tempNode instanceof ILeafNode)
			{
				if(grammarElement instanceof EnumLiteralDeclaration)
				{
					NoFormattingCompositeOperatorTreeNode parent = new NoFormattingCompositeOperatorTreeNode();
					parent.initialize(null);
					IOperatorTreeNode child = new AstOperatorTreeNode(tempNode);
					parent.getChildren().add(child);
					child.getComments().addAll(comments);
					comments.clear();
					returnValue.add(parent);
					continue;
				}
			}
			
			if(tempNode instanceof ICompositeNode)
			{
				if(grammarElement instanceof Action)
				{
					final ICompositeNode actionNode = (ICompositeNode)tempNode; 
					CompositeNode cNode = new CompositeNode()
					{
						@Override 
						public EObject getGrammarElement()
						{
							return actionNode.getFirstChild().getGrammarElement();
						}
						
						@Override
						public BidiIterable<INode> getChildren() {
							if (actionNode.hasChildren()) {
								INode firstChild = actionNode.getFirstChild();
								if(firstChild instanceof ICompositeNode && ((ICompositeNode)firstChild).hasChildren())
								{
									if (firstChild.hasSiblings()) {
										return new GppNodeIterable(((ICompositeNode)firstChild).getFirstChild(),firstChild.getNextSibling());
									} else {
										return new NodeIterable(((ICompositeNode)firstChild).getFirstChild());
									}
								}else if (firstChild.hasSiblings()) {
									return new NodeIterable(firstChild.getNextSibling());
								} else {
									return EmptyBidiIterable.instance();
								}
							}
							return EmptyBidiIterable.instance();
						}
					};
					grammarElement = cNode.getGrammarElement();
					tempNode = cNode;
				}
			}
				
			QualifiedName elementName = qualifiedNameProvider.getFullyQualifiedName(grammarElement);
			Reference reference = referenceTable.get(elementName);
			if(reference == null)
			{
				throw new IllegalStateException(String.format("It does not exist reference for the %s grammar element.", elementName));
			}
			ICompositeOperatorTreeNode applicatedOperatorImplementations = getApplicatedPositionalOperatorImplementations(reference, operators);
			if(applicatedOperatorImplementations == null)
			{
				throw new IllegalStateException(String.format("The reference of the %s grammar element is not encapsulated in any operator application.", elementName));
			}
			ICompositeOperatorTreeNode rootOfApplicatedOperatorImplementations = getRootOfTree(applicatedOperatorImplementations);
			if(!returnValue.contains(rootOfApplicatedOperatorImplementations))
			{
				returnValue.add(rootOfApplicatedOperatorImplementations);
			}
			if(tempNode instanceof ICompositeNode)
			{
				List<ICompositeOperatorTreeNode> nodeReturnValue = buildOperatorTree((ICompositeNode)tempNode, comments);
				for(ICompositeOperatorTreeNode n : nodeReturnValue)
				{
					applicatedOperatorImplementations = createImplementationCloneIfNecessary(applicatedOperatorImplementations);
					applicatedOperatorImplementations.getChildren().add(n);
				}
			}
			else
			{
				applicatedOperatorImplementations = createImplementationCloneIfNecessary(applicatedOperatorImplementations);
				IOperatorTreeNode child = null;
				if(grammarElement instanceof RuleCall)
				{
					AbstractRule calledRule = ((RuleCall)grammarElement).getRule();
					if(calledRule instanceof TerminalRule)
					{
						child = getTransformingOperatorForTerminal(tempNode, ((TerminalRule)calledRule).getName());
					}
					else
					{
						child = new AstOperatorTreeNode(tempNode);
					}
				}
				else if(grammarElement instanceof Keyword)
				{
					child = getTransformingOperatorForKeyword(tempNode, ((Keyword)grammarElement).getValue());
				}
				
				if(child == null)
				{
					child = getDefaultTransformingOperator(tempNode);
				}
				
				if(child == null)
				{
					child = new AstOperatorTreeNode(tempNode);
				}

				child.getComments().addAll(comments);
				comments.clear();
				applicatedOperatorImplementations.getChildren().add(child);
			}
			
		}
		
		return returnValue;
	}
	
	protected ICompositeOperatorTreeNode createImplementationCloneIfNecessary(ICompositeOperatorTreeNode opeatorImplmentation)
	{
		if(opeatorImplmentation instanceof ISingleChildTreeNode
				&& opeatorImplmentation.getChildren().size() > 0)
		{
			return ((ISingleChildTreeNode)opeatorImplmentation).createCloneWithoutChildren();
		}
		return opeatorImplmentation;
	}
	
	
	protected ICompositeOperatorTreeNode getApplicatedPositionalOperatorImplementations(Reference reference, HashMap<String,ICompositeOperatorTreeNode> operators)
	{
		ICompositeOperatorTreeNode returnValue = null;
		ICompositeOperatorTreeNode currentNode = null;
		Box currentElement = reference;
		while(currentElement.eContainer() instanceof Box)
		{
			Box parent = (Box)currentElement.eContainer();
			if(parent instanceof ParserRuleOperatorApplication)
			{
				ParserRuleOperatorApplication operatorApplication = (ParserRuleOperatorApplication)parent;
				if(BoxModelOperatorsHelper.isOperatorPositional(operatorApplication.getOperator()))
				{
					ICompositeOperatorTreeNode operatorImplementation = operators.get(operatorApplication.getName()); 
					if(operatorImplementation == null)
					{
						BasicOperatorDefinition operatorDefinition = BoxModelOperatorsHelper.getBasicOperator(operatorApplication.getOperator());
						Object operatorImplementationAsObject;
						try {
							operatorImplementationAsObject = Class.forName(operatorDefinition.getImplementation()).newInstance();
						} catch (Exception e) {
							throw new WrappedException(e);
						}
						if(!(operatorImplementationAsObject instanceof AbstractPositionalOperatorImplementation))
						{
							throw new IllegalStateException(POSITIONAL_EXCEPTION_MESSAGE);
						}
						operatorImplementation = (ICompositeOperatorTreeNode)operatorImplementationAsObject;
						HashMap<String, ParameterResult> parameters = parameterValueFinder.getCurrentParameterValues(operatorApplication);
						((AbstractPositionalOperatorImplementation)operatorImplementation).initialize(parameters);
						operatorImplementation.setName(operatorApplication.getName());
						operators.put(operatorApplication.getName(), operatorImplementation);
					}
					if(currentNode == null)
					{	
						returnValue = operatorImplementation;
						currentNode = operatorImplementation;
					}
					else
					{
						boolean childExists = false;
						List<ICompositeOperatorTreeNode> implementations = new ArrayList<ICompositeOperatorTreeNode>();;
						if(operatorImplementation instanceof ISingleChildTreeNode)
						{
							for(ISingleChildTreeNode clone : ((ISingleChildTreeNode)operatorImplementation).getAllClones())
							{
								implementations.add(clone);
							}
						}
						else
						{
							implementations.add(operatorImplementation);
						}
						for(ICompositeOperatorTreeNode impl : implementations)
						{
							for(IOperatorTreeNode child : impl.getChildren())
							{
								if(currentNode.getName().equals(child.getName()))
								{
									childExists = true;
									break;
								}
							}
						}
						if(!childExists)
						{
							if(operatorImplementation instanceof ISingleChildTreeNode
									&& operatorImplementation.getChildren().size() > 0)
							{
								operatorImplementation = ((ISingleChildTreeNode)operatorImplementation).createCloneWithoutChildren();
							}
							operatorImplementation.getChildren().add(currentNode);
						}
						if(currentNode.getParent() == null) currentNode.setParent(operatorImplementation);
						currentNode = operatorImplementation;
					}
				}
			}
			currentElement = parent;
		}
		return returnValue;
	}
	
	ICompositeOperatorTreeNode getRootOfTree(ICompositeOperatorTreeNode node)
	{
		ICompositeOperatorTreeNode returnValue = node;
		while(returnValue.getParent() !=null)
		{
			returnValue = returnValue.getParent();
		}
		return returnValue;
	}
}
