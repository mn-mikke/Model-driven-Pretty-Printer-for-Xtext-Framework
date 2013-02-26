package cz.gpp.ui.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class ExampleHighlightingConfiguration implements IHighlightingConfiguration{

	public static final String DEFAULT_ID = "default";
	public static final String KEYWORD_ID = "keyword";
	public static final String METHOD_ID = "method";
	public static final String NUMBER_ID = "number";
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor)
	{
		acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Default", defaultTextStyle());
		acceptor.acceptDefaultHighlighting(KEYWORD_ID, "Keyword", keywordTextStyle());
		acceptor.acceptDefaultHighlighting(METHOD_ID, "Method", methodTextStyle());
		acceptor.acceptDefaultHighlighting(NUMBER_ID, "Number", numberTextStyle());
	}
	
	protected TextStyle defaultTextStyle()
	{
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(0, 0, 0));
		return textStyle;
	}

	public TextStyle keywordTextStyle()
	{
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(127, 0, 85));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	public TextStyle methodTextStyle()
	{
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(85, 0, 127));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	} 
	
	public TextStyle numberTextStyle()
	{
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(127, 127, 127));
		return textStyle;
	} 
}
