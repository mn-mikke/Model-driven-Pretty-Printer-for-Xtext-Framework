package gpp.common;

import gpp.boxmodel.boxModel.ParserRuleOperatorApplication;
import gpp.boxmodel.operators.boxModelOperators.ParameterApplication;
import gpp.boxmodel.operators.boxModelOperators.ParameterDefinition;

import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public interface IDeclarativelyDefinedOperatorTreeNode {
	void checkParameterDefinition(AbstractDeclarativeValidator validator, ParameterDefinition parameterDefinition);
	
	void checkParameterApplication(AbstractDeclarativeValidator validator, ParameterApplication parameterApplication);
	
	void checkParserRuleOperatorApplicaton(AbstractDeclarativeValidator validator, ParserRuleOperatorApplication operatorApplication);
}
