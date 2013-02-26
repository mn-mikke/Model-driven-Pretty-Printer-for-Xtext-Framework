package gpp.highlighting;

import gpp.boxmodel.boxModel.ParserRuleOperatorApplication;
import gpp.boxmodel.operators.boxModelOperators.ParameterApplication;
import gpp.boxmodel.operators.boxModelOperators.ParameterDefinition;
import gpp.boxmodel.operators.impl.EnumParameterResult;
import gpp.boxmodel.operators.impl.IntParameterResult;
import gpp.boxmodel.operators.impl.ParameterEnumValues;
import gpp.boxmodel.operators.impl.ParameterResult;
import gpp.boxmodel.operators.impl.StringParameterResult;
import gpp.common.IDeclarativelyDefinedOperatorTreeNode;

import java.util.HashMap;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class DefaultHighlightOperatorImplementation implements IHighlightOperatorImplementation, IDeclarativelyDefinedOperatorTreeNode {

	private static final int DEFAULT_STYLE = SWT.NORMAL;
	private static final String DEFAULT_FONT = "Consolas";
	private static final int DEFAULT_HEIGHT = 10;
	private static final String DEFAULT_COLOR = "#ffffff";
	private static final String DEFAULT_BGCOLOR = "#000000"; 
	
	private static final String FONT_PARAMETER_NAME = "f";
	private static final String ITALIC_PARAMETER_NAME = "i";
	private static final String BOLD_PARAMETER_NAME = "w";
	private static final String COLOR_PARAMETER_NAME = "c";
	private static final String BGCOLOR_PARAMETER_NAME = "b";
	private static final String HEIGHT_PARAMETER_NAME = "h";
	

	
	private RGB getRgb(String value)
	{
		int r = Integer.parseInt(value.substring(1, 3), 16); 
		int g = Integer.parseInt(value.substring(3, 5), 16); 
		int b = Integer.parseInt(value.substring(5, 7), 16); 
		return new RGB(r, g, b);
	}
	
	@Override
	public TextStyle getTextStyle(HashMap<String, ParameterResult> parameters) {
		int style = DEFAULT_STYLE;
		String font = DEFAULT_FONT;
		int height = DEFAULT_HEIGHT;
		String color = DEFAULT_COLOR;
		String bgColor = DEFAULT_BGCOLOR;
		
		if(parameters.containsKey(FONT_PARAMETER_NAME))
		{
			ParameterResult parameter = parameters.get(FONT_PARAMETER_NAME);
			if(!(parameter instanceof StringParameterResult))
			{
				throw new IllegalStateException(String.format("The parameter %s has not string value.",parameter.getParameterName()));
			}
			StringParameterResult stringParameter = (StringParameterResult)parameter;
			font = stringParameter.getValue();
		}
		
		if(parameters.containsKey(COLOR_PARAMETER_NAME))
		{
			ParameterResult parameter = parameters.get(COLOR_PARAMETER_NAME);
			if(!(parameter instanceof StringParameterResult))
			{
				throw new IllegalStateException(String.format("The parameter %s has not string value.",parameter.getParameterName()));
			}
			StringParameterResult stringParameter = (StringParameterResult)parameter;
			color = stringParameter.getValue();
		}
		
		if(parameters.containsKey(BGCOLOR_PARAMETER_NAME))
		{
			ParameterResult parameter = parameters.get(BGCOLOR_PARAMETER_NAME);
			if(!(parameter instanceof StringParameterResult))
			{
				throw new IllegalStateException(String.format("The parameter %s has not string value.",parameter.getParameterName()));
			}
			StringParameterResult stringParameter = (StringParameterResult)parameter;
			bgColor = stringParameter.getValue();
		}

		if(parameters.containsKey(HEIGHT_PARAMETER_NAME))
		{
			ParameterResult parameter = parameters.get(HEIGHT_PARAMETER_NAME);
			if(!(parameter instanceof IntParameterResult))
			{
				throw new IllegalStateException(String.format("The parameter %s has not integer value.",parameter.getParameterName()));
			}
			IntParameterResult intParameter = (IntParameterResult)parameter;
			int value = intParameter.getValue();
			if(value < 1)
			{
				throw new IllegalStateException(String.format("The value of the parameter %s is less than 1.", parameter.getParameterName()));
			}
			height = value;
		}
		
		if(parameters.containsKey(ITALIC_PARAMETER_NAME))
		{
			ParameterResult parameter = parameters.get(ITALIC_PARAMETER_NAME);
			if(!(parameter instanceof EnumParameterResult))
			{
				throw new IllegalStateException(String.format("The parameter %s has not enum value.", parameter.getParameterName()));
			}
			EnumParameterResult enumParameter = (EnumParameterResult)parameter;
			if(enumParameter.getValue().getName().equals(ParameterEnumValues.ITALIC_OPTION_ITALIC))
			{
				style |= SWT.ITALIC;
			}
			else if(enumParameter.getValue().getName().equals(ParameterEnumValues.ITALIC_OPTION_NORMAL))
			{
				style |= SWT.NORMAL;
			}
			else
			{
				throw new IllegalStateException(String.format("Value of parameter %s is not supported.", parameter.getParameterName()));
			}
		}
		
		if(parameters.containsKey(BOLD_PARAMETER_NAME))
		{
			ParameterResult parameter = parameters.get(BOLD_PARAMETER_NAME);
			if(!(parameter instanceof EnumParameterResult))
			{
				throw new IllegalStateException(String.format("The parameter %s has not enum value.", parameter.getParameterName()));
			}
			EnumParameterResult enumParameter = (EnumParameterResult)parameter;
			if(enumParameter.getValue().getName().equals(ParameterEnumValues.BOLD_OPTION_BOLD))
			{
				style |= SWT.BOLD;
			}
			else if(enumParameter.getValue().getName().equals(ParameterEnumValues.BOLD_OPTION_NORMAL))
			{
				style |= SWT.NORMAL;
			}
			else
			{
				throw new IllegalStateException(String.format("Value of parameter %s is not supported.", parameter.getParameterName()));
			}
		}
		
		TextStyle returnValue = new TextStyle();
		returnValue.setFontData(new FontData(font, height, style));
		returnValue.setColor(getRgb(color));
		returnValue.setBackgroundColor(getRgb(bgColor));
		return returnValue;
	}

	@Override
	public void checkParameterDefinition(
			AbstractDeclarativeValidator validator,
			ParameterDefinition parameterDefinition) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkParameterApplication(
			AbstractDeclarativeValidator validator,
			ParameterApplication parameterApplication) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkParserRuleOperatorApplicaton(
			AbstractDeclarativeValidator validator,
			ParserRuleOperatorApplication operatorApplication) {
		// TODO Auto-generated method stub
		
	}

}
