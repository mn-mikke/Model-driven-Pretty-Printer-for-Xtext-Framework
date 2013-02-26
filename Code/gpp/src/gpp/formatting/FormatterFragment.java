package gpp.formatting;

import java.util.Set;

import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.formatting.INodeModelFormatter;
import org.eclipse.xtext.generator.AbstractGeneratorFragment;
import org.eclipse.xtext.generator.BindFactory;
import org.eclipse.xtext.generator.Binding;

public class FormatterFragment extends AbstractGeneratorFragment {
	
	@Override
	public void generate(Grammar grammar, XpandExecutionContext ctx){}
	
	@Override
	public void addToPluginXmlRt(Grammar grammar, XpandExecutionContext ctx){}
	
	@Override
	public void addToPluginXmlUi(Grammar grammar, XpandExecutionContext ctx){}
	
	@Override
	public void addToStandaloneSetup(Grammar grammar, XpandExecutionContext ctx){}
	
	@Override
	public Set<Binding> getGuiceBindingsRt(Grammar grammar) {
		return new BindFactory().addTypeToType(INodeModelFormatter.class.getName(), GppNodeModelFormatter.class.getName()).getBindings();
	}
	
	@Override
	public String[] getRequiredBundlesRt(Grammar grammar) {
		return new String[] {"gpp"};
	}

}
