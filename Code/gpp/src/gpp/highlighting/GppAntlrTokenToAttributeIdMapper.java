package gpp.highlighting;

import java.util.regex.Pattern;

import gpp.boxmodel.boxModel.BoxModel;
import gpp.boxmodel.boxModel.KeywordTerminalRuleFormatting;
import gpp.boxmodel.boxModel.TerminalRuleFormatting;
import gpp.boxmodel.boxModel.TerminalRuleOperatorApplication;
import gpp.boxmodel.utils.BoxModelHelper;
import gpp.boxmodel.utils.IBoxModelProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class GppAntlrTokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper 
{
	protected static final String[] QUOTES = new String[]{"'", "\""};
	
	@Inject
	private IBoxModelProvider boxModelProvider;
	
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		BoxModel boxModel = boxModelProvider.getBoxModel();
		for(TerminalRuleFormatting formatting : boxModel.getFormatting().getTerminalRuleFormattings())
		{
			if(("RULE_" + formatting.getRule().getName()).equals(tokenName))
			{	
				TerminalRuleOperatorApplication operatorApplication = BoxModelHelper.getHighlightOperatorApplication(formatting.getContent());
				if(operatorApplication != null)
				{
					return operatorApplication.getName().toLowerCase();
				}
			}
		}
		if(tokenName.startsWith(QUOTES[0]) && tokenName.endsWith(QUOTES[0]) || tokenName.startsWith(QUOTES[1]) && tokenName.endsWith(QUOTES[1]))
		{
			String tokenNameWithoutQuotes = tokenName.substring(1, tokenName.length() - 1);
			for(KeywordTerminalRuleFormatting formatting : boxModel.getFormatting().getKeywordTerminalRuleFormattings())
			{
				TerminalRuleOperatorApplication operatorApplication = BoxModelHelper.getHighlightOperatorApplication(formatting.getContent());
				if(operatorApplication == null)
				{
					continue;
				}
				if(Pattern.matches(formatting.getPattern(), tokenNameWithoutQuotes))
				{
					return formatting.getName().toLowerCase();
				}
			}
		}
		return boxModel.getFormatting().getDefaultTerminalRuleFormatting().getName().toLowerCase();
	} 
}
