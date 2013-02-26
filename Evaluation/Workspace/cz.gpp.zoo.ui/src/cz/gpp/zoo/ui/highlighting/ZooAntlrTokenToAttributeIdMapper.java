package cz.gpp.zoo.ui.highlighting;

import java.util.regex.Pattern;

import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

public class ZooAntlrTokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper
{
	private static final String PATTERN = "(?:^'(\\w[^']*)'$)|(?:^\"(\\w[^\"]*)\")$";
	private static final Pattern QUOTED = Pattern.compile(PATTERN, Pattern.MULTILINE);
	
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if(QUOTED.matcher(tokenName).matches())
		{
			return ZooHighlightingConfiguration.KEYWORD_ID;
		}
		return ZooHighlightingConfiguration.DEFAULT_ID;
	}
}
