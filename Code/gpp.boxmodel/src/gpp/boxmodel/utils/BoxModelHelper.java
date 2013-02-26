package gpp.boxmodel.utils;

import java.util.List;

import gpp.boxmodel.boxModel.TerminalRuleOperatorApplication;
import gpp.boxmodel.operators.utils.BoxModelOperatorsHelper;

public class BoxModelHelper {
	public static TerminalRuleOperatorApplication getHighlightOperatorApplication(List<TerminalRuleOperatorApplication> terminalRuleOperatorApplications)
	{
		for(TerminalRuleOperatorApplication operatorApplication : terminalRuleOperatorApplications)
		{
			if(BoxModelOperatorsHelper.isOperatorHighlight(operatorApplication.getOperator()))
			{
				return operatorApplication;
			}
		}
		return null;
	}
	
	public static TerminalRuleOperatorApplication getTransformingOperatorApplication(List<TerminalRuleOperatorApplication> terminalRuleOperatorApplications)
	{
		for(TerminalRuleOperatorApplication operatorApplication : terminalRuleOperatorApplications)
		{
			if(BoxModelOperatorsHelper.isOperatorTransforming(operatorApplication.getOperator()))
			{
				return operatorApplication;
			}
		}
		return null;
	}
	
	public static TerminalRuleOperatorApplication getPositionalOperatorApplication(List<TerminalRuleOperatorApplication> terminalRuleOperatorApplications)
	{
		for(TerminalRuleOperatorApplication operatorApplication : terminalRuleOperatorApplications)
		{
			if(BoxModelOperatorsHelper.isOperatorPositional(operatorApplication.getOperator()))
			{
				return operatorApplication;
			}
		}
		return null;
	}
}
