package gpp.boxmodel.operators.utils;

import java.util.List;

import gpp.boxmodel.operators.boxModelOperators.AliasOperatorDefinition;
import gpp.boxmodel.operators.boxModelOperators.BasicOperatorDefinition;
import gpp.boxmodel.operators.boxModelOperators.HighlightOperatorDefinition;
import gpp.boxmodel.operators.boxModelOperators.OperatorDefinition;
import gpp.boxmodel.operators.boxModelOperators.PositionalOperatorDefinition;
import gpp.boxmodel.operators.boxModelOperators.TransformingOperatorDefinition;

public class BoxModelOperatorsHelper {
	public static BasicOperatorDefinition getBasicOperator(OperatorDefinition operatorDefinition)
	{
		if(operatorDefinition instanceof BasicOperatorDefinition)
		{
			return (BasicOperatorDefinition)operatorDefinition;
		}
		else if(operatorDefinition instanceof AliasOperatorDefinition)
		{
			OperatorDefinition referencedOperator = ((AliasOperatorDefinition)operatorDefinition).getOperator();
			if(referencedOperator == null)
			{
				return null;
			}
			return getBasicOperator(referencedOperator);
		}
		else 
		{
			return null;
		}
	}
	
	public static boolean isOperatorHighlight(OperatorDefinition operatorDefinition)
	{
		if(operatorDefinition == null) return false;
		BasicOperatorDefinition basicOperator = getBasicOperator(operatorDefinition);
		if(basicOperator == null) return false;
		return basicOperator instanceof HighlightOperatorDefinition;
	}
	
	public static boolean isOperatorPositional(OperatorDefinition operatorDefinition)
	{
		if(operatorDefinition == null) return false;
		BasicOperatorDefinition basicOperator = getBasicOperator(operatorDefinition);
		if(basicOperator == null) return false;
		return basicOperator instanceof PositionalOperatorDefinition;
	}
	
	public static boolean isOperatorTransforming(OperatorDefinition operatorDefinition)
	{
		if(operatorDefinition == null) return false;
		BasicOperatorDefinition basicOperator = getBasicOperator(operatorDefinition);
		if(basicOperator == null) return false;
		return basicOperator instanceof TransformingOperatorDefinition;
	}
	
	public static OperatorDefinition getPositionalOperator(List<OperatorDefinition> operators)
	{
		for(OperatorDefinition operator : operators)
		{
			if(isOperatorPositional(operator))
			{
				return operator;
			}
		}
		return null;
	}
	
	public static OperatorDefinition getTransformingOperator(List<OperatorDefinition> operators)
	{
		for(OperatorDefinition operator : operators)
		{
			if(isOperatorTransforming(operator))
			{
				return operator;
			}
		}
		return null;
	}
	
	public static OperatorDefinition getHighlightOperator(List<OperatorDefinition> operators)
	{
		for(OperatorDefinition operator : operators)
		{
			if(isOperatorHighlight(operator))
			{
				return operator;
			}
		}
		return null;
	}
	
}
