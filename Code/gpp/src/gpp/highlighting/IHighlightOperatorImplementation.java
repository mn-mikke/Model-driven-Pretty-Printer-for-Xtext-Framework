package gpp.highlighting;

import gpp.boxmodel.operators.impl.ParameterResult;

import java.util.HashMap;

import org.eclipse.xtext.ui.editor.utils.TextStyle;

public interface IHighlightOperatorImplementation {
	
	public TextStyle getTextStyle(HashMap<String,ParameterResult> parameterApplications);
	
}
