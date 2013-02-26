package gpp.boxmodel.provider;

import gpp.boxmodel.BoxModelStandaloneSetup;
import gpp.boxmodel.utils.BoxModelFromDslProvider;
import gpp.boxmodel.utils.IBoxModelProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.generator.AbstractGeneratorFragment;
import org.eclipse.xtext.generator.BindFactory;
import org.eclipse.xtext.generator.Binding;
import org.eclipse.xtext.generator.Naming;
import com.google.inject.Injector;

public class BoxModelFromDslProviderFragment extends AbstractGeneratorFragment {
	
	private String boxModelFileURI = null;
	
	public void setBoxModelFileURI(String boxModelFileURI)
	{
		this.boxModelFileURI = boxModelFileURI;
	}
	
	@Override
	public void checkConfiguration(Issues issues)
	{
		if(boxModelFileURI == null)
		{
			issues.addError("The 'boxModelFileURI' is mandatory.");
		}
		else
		{
			Injector injector = new BoxModelStandaloneSetup().createInjectorAndDoEMFRegistration();
			BoxModelFromDslProvider boxModelProvider = injector.getInstance(BoxModelFromDslProvider.class);
			boxModelProvider.initialize(boxModelFileURI, issues);
		}
	}
	
	protected List<Object> getParameters(Grammar grammar) {
		List<Object> returnValue = new ArrayList<Object>();
		returnValue.add("/src" + boxModelFileURI.substring("classpath:".length()));
		return returnValue;
	}
	
	@Override
	public Set<Binding> getGuiceBindingsRt(Grammar grammar) {
		return new BindFactory().addTypeToType(IBoxModelProvider.class.getName(), getBoxModelProviderName(grammar, getNaming())).getBindings();
	}

	public static String getPackageName(Grammar grammar, Naming naming)
	{
		String returnValue = naming.basePackageRuntime(grammar) + ".boxmodel";
		return returnValue;
	}

	
	public static String getBoxModelProviderName(Grammar grammar, Naming naming) {
		return getPackageName(grammar, naming) + "." + GrammarUtil.getName(grammar) + "BoxModelFromDslProvider";
	}
	
	@Override
	public String[] getRequiredBundlesRt(Grammar grammar) {
		return new String[] {"gpp.boxmodel"};
	}
}