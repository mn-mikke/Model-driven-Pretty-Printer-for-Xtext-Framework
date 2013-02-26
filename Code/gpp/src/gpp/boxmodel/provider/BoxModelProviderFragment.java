package gpp.boxmodel.provider;

import gpp.boxmodel.BoxModelStandaloneSetup;
import gpp.boxmodel.boxModel.BoxModel;
import gpp.boxmodel.utils.BoxModelFromDslProvider;
import gpp.boxmodel.utils.IBoxModelProvider;

import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.generator.AbstractGeneratorFragment;
import org.eclipse.xtext.generator.BindFactory;
import org.eclipse.xtext.generator.Binding;
import org.eclipse.xtext.generator.Generator;
import org.eclipse.xtext.generator.Naming;

import com.google.inject.Injector;

public class BoxModelProviderFragment extends AbstractGeneratorFragment {
	
	private String boxModelFileURI = null;
	
	BoxModelFromDslProvider boxModelProvider = null;
	
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
			boxModelProvider = injector.getInstance(BoxModelFromDslProvider.class);
			boxModelProvider.initialize(boxModelFileURI, issues);
		}
	}		
	
	@Override
	public void generate(Grammar grammar, XpandExecutionContext ctx) {
		super.generate(grammar, ctx);
		saveBoxModel(grammar,ctx);
	}
	
	private void saveBoxModel(Grammar grammar, XpandExecutionContext ctx)
	{
		String srcGenPath = ctx.getOutput().getOutlet(Generator.SRC_GEN).getPath() + "/" + getPackageName(grammar, getNaming()).replace('.', '/') + "/" + getBoxModelStorageName(grammar, getNaming());
		ResourceSet  boxModelResourceSet = boxModelProvider.getResourceSet();
		BoxModel boxModel = boxModelProvider.getBoxModel();
		Resource resource = boxModelResourceSet.createResource(URI.createURI(srcGenPath));
		resource.getContents().add(boxModel);
		try
		{	
			URIConverter uriConverter = URIConverter.INSTANCE;
			uriConverter.getURIMap().put(URI.createURI("platform:/resource/"),URI.createURI("platform:/plugin/"));
			ResourceEntityHandlerWithUriConvertor resourceEntityHandler = new ResourceEntityHandlerWithUriConvertor("_", uriConverter);		
			HashMap<Object,Object> options = new HashMap<Object, Object>(1);
			options.put(XMIResource.OPTION_RESOURCE_ENTITY_HANDLER, resourceEntityHandler);
			resource.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Set<Binding> getGuiceBindingsRt(Grammar grammar) {
		return new BindFactory().addTypeToType(IBoxModelProvider.class.getName(), getBoxModelProviderName(grammar, getNaming())).getBindings();
	}

	public static String getPackageName(Grammar grammar, Naming naming)
	{
		return naming.basePackageRuntime(grammar) + ".boxmodel";
	}
	
	private static String getBoxModelStorageName(Grammar grammar, Naming naming)
	{
		return GrammarUtil.getName(grammar) + "BoxModel.xmi";
	}
	
	public static String getBoxModelStoragePath(Grammar grammar, Naming naming)
	{
		return "/src-gen/" + getPackageName(grammar, naming).replace('.', '/') + "/" + getBoxModelStorageName(grammar, naming);
	}
	
	public static String getBoxModelProviderName(Grammar grammar, Naming naming) {
		return getPackageName(grammar, naming) + "." + GrammarUtil.getName(grammar) + "BoxModelProvider";
	}
}