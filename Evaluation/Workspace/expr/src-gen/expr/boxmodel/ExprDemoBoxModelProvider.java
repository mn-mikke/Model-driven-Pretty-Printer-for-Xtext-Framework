package expr.boxmodel;

import java.io.File;
import java.io.IOException;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import gpp.boxmodel.utils.IBoxModelProvider;
import gpp.boxmodel.boxModel.BoxModel;
import gpp.boxmodel.boxModel.BoxModelPackage;

@Singleton
public class ExprDemoBoxModelProvider implements IBoxModelProvider
{
	private final static String BOX_MODEL_STORAGE = "/src-gen/expr/boxmodel/ExprDemoBoxModel.xmi";
	
	@Inject
	private Provider<ResourceSet> resourceSetProvider;
	
	private BoxModel boxModel = null;
	
	private String getProjectAbsolutePath()
	{
		 java.security.ProtectionDomain pd = this.getClass().getProtectionDomain();
		 if ( pd == null ) return null;
		 java.security.CodeSource cs = pd.getCodeSource();
		 if ( cs == null ) return null;
		 java.net.URL url = cs.getLocation();
		 if ( url == null ) return null;
		 java.io.File f = new File(url.getFile());
		 return f.getAbsolutePath();
	}

	private BoxModel loadBoxModel()
	{
		// Initialize the model
		BoxModelPackage.eINSTANCE.eClass();
		
		ResourceSet resSet =  resourceSetProvider.get();

		// Get the resource
		URI storageUri = URI.createFileURI(getProjectAbsolutePath().replace('\\','/') + BOX_MODEL_STORAGE);
		Resource resource = resSet.getResource(storageUri, true);
		try {
			resource.load(null);
		} catch (IOException e) {
			throw new WrappedException(e);
		}
		EcoreUtil.resolveAll(resource);
		
		// Get the box model
		BoxModel returnValue = (BoxModel)resource.getContents().get(0);
		return returnValue;
	}

	public BoxModel getBoxModel()
	{
		if(boxModel == null)
		{
			boxModel = loadBoxModel();
		}
		return boxModel;
	}
}
