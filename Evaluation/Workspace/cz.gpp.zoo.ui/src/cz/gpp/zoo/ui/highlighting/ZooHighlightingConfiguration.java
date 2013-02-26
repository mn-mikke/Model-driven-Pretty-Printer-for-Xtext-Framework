package cz.gpp.zoo.ui.highlighting;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class ZooHighlightingConfiguration implements IHighlightingConfiguration{
	
	public static final String DEFAULT_ID = "default";
	public static final String KEYWORD_ID = "keyword";
	public static final String HEADER_ID = "header";
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor)
	{
		acceptor.acceptDefaultHighlighting(DEFAULT_ID , "Default", defaultTextStyle());
		acceptor.acceptDefaultHighlighting(KEYWORD_ID, "Keyword", keywordTextStyle());
		acceptor.acceptDefaultHighlighting(HEADER_ID, "Header", headerTextStyle());
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
		textStyle.setColor(new RGB(255, 0, 0));
		return textStyle;
	}
	
	public TextStyle headerTextStyle()
	{
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 0, 255));
		return textStyle;
	}

}
