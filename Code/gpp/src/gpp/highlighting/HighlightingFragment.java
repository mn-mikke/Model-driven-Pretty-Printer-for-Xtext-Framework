package gpp.highlighting;

import java.util.Set;

import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.generator.AbstractGeneratorFragment;
import org.eclipse.xtext.generator.BindFactory;
import org.eclipse.xtext.generator.Binding;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class HighlightingFragment extends AbstractGeneratorFragment {
	
	@Override
	public void generate(Grammar grammar, XpandExecutionContext ctx){}
	
	@Override
	public void addToPluginXmlRt(Grammar grammar, XpandExecutionContext ctx){}
	
	@Override
	public void addToPluginXmlUi(Grammar grammar, XpandExecutionContext ctx){}
	
	@Override
	public void addToStandaloneSetup(Grammar grammar, XpandExecutionContext ctx){}
	
	@Override
	public Set<Binding> getGuiceBindingsUi(Grammar grammar) {
		BindFactory returnValue = new BindFactory();
		returnValue = returnValue.addTypeToType(IHighlightingConfiguration.class.getName(), GppHighlightingConfiguration.class.getName());
		returnValue = returnValue.addTypeToType(AbstractAntlrTokenToAttributeIdMapper.class.getName(), GppAntlrTokenToAttributeIdMapper.class.getName());
		returnValue = returnValue.addTypeToType(ISemanticHighlightingCalculator.class.getName(), GppSemanticHighlightingCalculator.class.getName());
		return returnValue.getBindings();
	}
	
	@Override
	public String[] getRequiredBundlesUi(Grammar grammar) {
		return new String[] { "org.eclipse.xtext.ui", "gpp"};
	}
}
