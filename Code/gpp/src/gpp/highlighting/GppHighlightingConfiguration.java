package gpp.highlighting;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import java.util.HashMap;
import java.util.List;
import com.google.inject.Inject;
import gpp.boxmodel.boxModel.BoxModel;
import gpp.boxmodel.boxModel.DefaultTerminalRuleFormatting;
import gpp.boxmodel.boxModel.KeywordTerminalRuleFormatting;
import gpp.boxmodel.boxModel.ParserRuleOperatorApplication;
import gpp.boxmodel.boxModel.TerminalRuleFormatting;
import gpp.boxmodel.boxModel.TerminalRuleOperatorApplication;
import gpp.boxmodel.operators.boxModelOperators.BasicOperatorDefinition;
import gpp.boxmodel.operators.impl.ParameterResult;
import gpp.boxmodel.operators.utils.BoxModelOperatorsHelper;
import gpp.boxmodel.utils.BoxModelHelper;
import gpp.boxmodel.utils.CurrentParameterValueFinder;
import gpp.boxmodel.utils.IBoxModelProvider;

public class GppHighlightingConfiguration implements IHighlightingConfiguration
{
	private static final String EXCEPTION_MESSAGE = "The implementation of the highlight operator does not implement IHighlightOperatorImplementation interface.";
	
	@Inject
	private IBoxModelProvider boxModelProvider;
	
	private CurrentParameterValueFinder parameterValueFinder = new CurrentParameterValueFinder();
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		BoxModel boxModel = boxModelProvider.getBoxModel();
		addDefaultTerminalRule(boxModel, acceptor);
		addTerminalRules(boxModel, acceptor);
		addKeywordRules(boxModel, acceptor);
		addParserRules(boxModel, acceptor);
	}
	
	protected void addDefaultTerminalRule(BoxModel boxModel, IHighlightingConfigurationAcceptor acceptor)
	{
		DefaultTerminalRuleFormatting defaultTerminalRuleFormatting = boxModel.getFormatting().getDefaultTerminalRuleFormatting();
		Object operatorImplementation = null;
		TerminalRuleOperatorApplication operatorApplication = BoxModelHelper.getHighlightOperatorApplication(defaultTerminalRuleFormatting.getContent());
		if(operatorApplication == null)
		{
			throw new IllegalStateException("The default terminal rule does not contain a highlight operator application.");
		}
		BasicOperatorDefinition basicOperator = BoxModelOperatorsHelper.getBasicOperator(operatorApplication.getOperator());
		try {
			operatorImplementation =  Class.forName(basicOperator.getImplementation()).newInstance();
		} catch (Exception e) {
			throw new WrappedException(e);
		}
		if(!(operatorImplementation instanceof IHighlightOperatorImplementation))
		{
			throw new IllegalStateException(EXCEPTION_MESSAGE);
		}
		IHighlightOperatorImplementation operator = (IHighlightOperatorImplementation)operatorImplementation;
		HashMap<String, ParameterResult> parameters = parameterValueFinder.getCurrentParameterValues(operatorApplication);
		TextStyle operatorTextStyle = operator.getTextStyle(parameters);
		acceptor.acceptDefaultHighlighting(operatorApplication.getName().toLowerCase(), operatorApplication.getName(), operatorTextStyle);
	}
	
	protected void addKeywordRules(BoxModel boxModel, IHighlightingConfigurationAcceptor acceptor)
	{
		List<KeywordTerminalRuleFormatting> terminalRuleFormattings =  boxModel.getFormatting().getKeywordTerminalRuleFormattings();
		for(KeywordTerminalRuleFormatting ruleFormatting : terminalRuleFormattings)
		{
			Object operatorImplementation = null;
			TerminalRuleOperatorApplication operatorApplication = BoxModelHelper.getHighlightOperatorApplication(ruleFormatting.getContent());
			if(operatorApplication == null)
			{
				continue;
			}
			BasicOperatorDefinition basicOperator = BoxModelOperatorsHelper.getBasicOperator(operatorApplication.getOperator());
			try {
				operatorImplementation = Class.forName(basicOperator.getImplementation()).newInstance();
			} catch (Exception e) {
				throw new WrappedException(e);
			}
			if(!(operatorImplementation instanceof IHighlightOperatorImplementation))
			{
				throw new IllegalStateException(EXCEPTION_MESSAGE);
			}
			IHighlightOperatorImplementation operator = (IHighlightOperatorImplementation)operatorImplementation;
			HashMap<String, ParameterResult> parameters = parameterValueFinder.getCurrentParameterValues(operatorApplication);
			TextStyle operatorTextStyle = operator.getTextStyle(parameters);
			acceptor.acceptDefaultHighlighting(operatorApplication.getName().toLowerCase(), operatorApplication.getName(), operatorTextStyle);
		}
	}
	
	protected void addTerminalRules(BoxModel boxModel, IHighlightingConfigurationAcceptor acceptor)
	{
		List<TerminalRuleFormatting> terminalRuleFormattings =  boxModel.getFormatting().getTerminalRuleFormattings();
		for(TerminalRuleFormatting ruleFormatting : terminalRuleFormattings)
		{
			Object operatorImplementation = null;
			TerminalRuleOperatorApplication operatorApplication = BoxModelHelper.getHighlightOperatorApplication(ruleFormatting.getContent());
			if(operatorApplication == null)
			{
				continue;
			}
			BasicOperatorDefinition basicOperator = BoxModelOperatorsHelper.getBasicOperator(operatorApplication.getOperator());
			try {
				operatorImplementation = Class.forName(basicOperator.getImplementation()).newInstance();
			} catch (Exception e) {
				throw new WrappedException(e);
			}
			if(!(operatorImplementation instanceof IHighlightOperatorImplementation))
			{
				throw new IllegalStateException(EXCEPTION_MESSAGE);
			}
			IHighlightOperatorImplementation operator = (IHighlightOperatorImplementation)operatorImplementation;
			HashMap<String, ParameterResult> parameters = parameterValueFinder.getCurrentParameterValues(operatorApplication);
			TextStyle operatorTextStyle = operator.getTextStyle(parameters);
			acceptor.acceptDefaultHighlighting(operatorApplication.getName().toLowerCase(), operatorApplication.getName(), operatorTextStyle);
		}
	}
	
	protected void addParserRules(BoxModel boxModel, IHighlightingConfigurationAcceptor acceptor)
	{
		HighlightOperatorApplicationFinder operatorFinder = new HighlightOperatorApplicationFinder(); 
		List<ParserRuleOperatorApplication> operatorApplications = operatorFinder.getHighlightOperatorsFromParserRules(boxModel);
		for(ParserRuleOperatorApplication operatorApplication : operatorApplications)
		{
			Object operatorImplementation = null;
			BasicOperatorDefinition basicOperator = BoxModelOperatorsHelper.getBasicOperator(operatorApplication.getOperator());
			try {
				operatorImplementation = Class.forName(basicOperator.getImplementation()).newInstance();
			} catch (Exception e) {
				throw new WrappedException(e);
			}
			if(!(operatorImplementation instanceof IHighlightOperatorImplementation))
			{
				throw new IllegalStateException(EXCEPTION_MESSAGE);
			}
			IHighlightOperatorImplementation operator = (IHighlightOperatorImplementation)operatorImplementation;
			HashMap<String, ParameterResult> parameters = parameterValueFinder.getCurrentParameterValues(operatorApplication);
			TextStyle operatorTextStyle = operator.getTextStyle(parameters);
			acceptor.acceptDefaultHighlighting(operatorApplication.getName().toLowerCase(), operatorApplication.getName(), operatorTextStyle);
		}
	}
}