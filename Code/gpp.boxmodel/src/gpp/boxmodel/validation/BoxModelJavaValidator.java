package gpp.boxmodel.validation;

import java.lang.reflect.Method;
import java.util.List;

import gpp.boxmodel.boxModel.BoxModel;
import gpp.boxmodel.boxModel.BoxModelPackage;
import gpp.boxmodel.boxModel.DefaultTerminalRuleFormatting;
import gpp.boxmodel.boxModel.End;
import gpp.boxmodel.boxModel.ParserRuleFormatting;
import gpp.boxmodel.boxModel.ParserRuleOperatorApplication;
import gpp.boxmodel.boxModel.TerminalRuleFormatting;
import gpp.boxmodel.boxModel.TerminalRuleOperatorApplication;
import gpp.boxmodel.boxModel.XtextFileImport;
import gpp.boxmodel.operators.boxModelOperators.BasicOperatorDefinition;
import gpp.boxmodel.operators.boxModelOperators.OperatorDefinition;
import gpp.boxmodel.operators.utils.BoxModelOperatorsHelper;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.Check;
 

public class BoxModelJavaValidator extends AbstractBoxModelJavaValidator {

	@Check
	public void checkXtextImportUriScheme(XtextFileImport imp) {
		String importUri = imp.getImportURI();
		if (importUri != null)
		{
			if(!importUri.startsWith(IMPORT_URI_PREFIX)) 
			{
				error(IMPORT_URI_PREFIX_ERROR, BoxModelPackage.Literals.XTEXT_FILE_IMPORT__IMPORT_URI);
			}
			else if(!importUri.endsWith(".xtext"))
			{
				error("Import URI should end with \".xtext\" extension.", BoxModelPackage.Literals.XTEXT_FILE_IMPORT__IMPORT_URI);
			}
		}
	}
	
	@Check
	public void checkParserRuleOperatorApplicationByImplementation(ParserRuleOperatorApplication operatorApplication)
	{
		OperatorDefinition operatorDefinition = operatorApplication.getOperator();
		BasicOperatorDefinition basicOperatorDefinition = BoxModelOperatorsHelper.getBasicOperator(operatorDefinition);
		String implementation = basicOperatorDefinition.getImplementation();
		if(implementation != null)
		{
			Class<?> c = null;
			try {
				c = Class.forName(implementation);
			} catch (ClassNotFoundException e) {
				return;
			}
			Object o = null;
			try {
				o = c.newInstance();
			} catch (Exception e) {
				return;
			}
			if(classImplentsInterface(c, "IDeclarativelyDefinedOperatorTreeNode"))
			{
				try {
					Method method = c.getMethod("checkParserRuleOperatorApplication", new Class<?>[]{AbstractDeclarativeValidator.class, ParserRuleOperatorApplication.class});
					method.invoke(o, this, operatorApplication);
				} catch (Exception e) {
					return;
				}
			}
		}
	}
	
	@Check
	public void checkTerminalRuleFormattingOperatorsTypeUniquiness(TerminalRuleFormatting terminalRuleFormatting)
	{
		checkTerminalRuleFormattingOperatorsTypeUniquiness(terminalRuleFormatting.getContent(), BoxModelPackage.Literals.TERMINAL_RULE_FORMATTING__CONTENT);
	}
	
	@Check
	public void checkDefaultTerminalRuleFormattingOperatorsTypeUniquiness(DefaultTerminalRuleFormatting terminalRuleFormatting)
	{
		checkTerminalRuleFormattingOperatorsTypeUniquiness(terminalRuleFormatting.getContent(), BoxModelPackage.Literals.DEFAULT_TERMINAL_RULE_FORMATTING__CONTENT);
	}
	
	private void checkTerminalRuleFormattingOperatorsTypeUniquiness(List<TerminalRuleOperatorApplication> operators, EStructuralFeature featureToCheck)
	{
		if(operators.size() > 1)
		{
			TerminalRuleOperatorApplication first = operators.get(0);
			TerminalRuleOperatorApplication second = operators.get(1);
			OperatorDefinition firstOperatorDefinition = first.getOperator();
			OperatorDefinition secondOperatorDefinition = second.getOperator();
			if(firstOperatorDefinition != null && secondOperatorDefinition != null)
			{
				if(BoxModelOperatorsHelper.isOperatorHighlight(firstOperatorDefinition) && 
				   BoxModelOperatorsHelper.isOperatorHighlight(secondOperatorDefinition))
				{
					error("A terminal rule formatting can contain no more than one highlight operator.", featureToCheck);
				}
				if(BoxModelOperatorsHelper.isOperatorTransforming(firstOperatorDefinition) && 
				   BoxModelOperatorsHelper.isOperatorTransforming(secondOperatorDefinition))
				{
					error("A terminal rule formatting can contain no more than one transforming operator.", featureToCheck);
				}
			}
		}
	}
	
	@Check
	public void checkTerminalRuleOperatorApplicationType(TerminalRuleOperatorApplication operatorApplication)
	{
		OperatorDefinition operatorDefinition = operatorApplication.getOperator();
		if(operatorDefinition != null)
		{
			if(!(BoxModelOperatorsHelper.isOperatorHighlight(operatorDefinition) ||
				BoxModelOperatorsHelper.isOperatorTransforming(operatorDefinition)))
			{
				error("A terminal rule formatting should contain only transforming or highlight operators.", BoxModelPackage.Literals.TERMINAL_RULE_OPERATOR_APPLICATION__OPERATOR);
			}
		}
	}
	
	@Check
	public void checkParserRuleOperatorApplicationType(ParserRuleOperatorApplication operatorApplication)
	{
		OperatorDefinition operatorDefinition = operatorApplication.getOperator();
		if(operatorDefinition != null)
		{
			if(operatorApplication.eContainer() instanceof ParserRuleFormatting)
			{
				if(!(BoxModelOperatorsHelper.isOperatorPositional(operatorDefinition)))
				{
					error("The root of parser rule formatting content should contain only positional operator.", BoxModelPackage.Literals.PARSER_RULE_OPERATOR_APPLICATION__OPERATOR);
				}
			}
			else
			{
				if(!(BoxModelOperatorsHelper.isOperatorHighlight(operatorDefinition) ||
					BoxModelOperatorsHelper.isOperatorPositional(operatorDefinition)))
				{
					error("A parser rule formatting should contain only positional or highlight operators.", BoxModelPackage.Literals.PARSER_RULE_OPERATOR_APPLICATION__OPERATOR);
				}
			}
		}
	}
	
	@Check
	public void checkParserRuleFormmatingElementCount(ParserRuleFormatting parserRuleFormatting)
	{
		if(parserRuleFormatting.getRule() != null)
		{
			ParserRule parserRule = parserRuleFormatting.getRule();
			ElementCounter counter  = new ElementCounter();
			int xtextElementCount = counter.getXtextElementCount(parserRule.getAlternatives());
			int boxModelElement = counter.getBoxModelElementCount(parserRuleFormatting.getContent());
			if(xtextElementCount != boxModelElement)
			{
				error("The parser rule formatting should have the same element count as the referenced parser rule.", BoxModelPackage.Literals.PARSER_RULE_FORMATTING__RULE);
			}
		}
	}
	
	@Check
	void checkParserRuleFormattingCount(BoxModel model)
	{
		Grammar grammar = getXtextModel(model);
		if(grammar != null)
		{
			int parserRuleElementCount = 0;
			for(AbstractRule rule : grammar.getRules())
			{
				if(rule instanceof ParserRule)
				{
					parserRuleElementCount++;
				}
			}
			if(parserRuleElementCount > model.getFormatting().getParserRuleFormatings().size())
			{
				error("Not all parser rules of referenced grammar have a corresponding parser rule formatting.",BoxModelPackage.Literals.BOX_MODEL__END);
			}
		}
	}
	
	Grammar getXtextModel(BoxModel model)
	{
		String grammarUri = model.getXtextFile().getImportURI();
		ResourceSet set = model.eResource().getResourceSet();
		Grammar returnValue = null;
		if(grammarUri != null)
		{
			for(Resource resource : set.getResources())
			{
				if(resource.getURI().toString().equals(grammarUri) && resource.getContents().size() > 0)
				{
					returnValue = (Grammar)resource.getContents().get(0);
					break;
				}
			}
		}
		return returnValue;
	}
	
}
