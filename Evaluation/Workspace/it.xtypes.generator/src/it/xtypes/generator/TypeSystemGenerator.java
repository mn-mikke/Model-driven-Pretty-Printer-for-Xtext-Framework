/**
 * 
 */
package it.xtypes.generator;

import it.xtypes.generator.util.TypeSystemGeneratorJavaExtensions;
import it.xtypes.generator.util.TypeSystemLoader;
import it.xtypes.typesystem.TypeSystemDefinition;

import java.io.FileNotFoundException;

import org.eclipse.emf.mwe.utils.DirectoryCleaner;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.JavaBeautifier;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;

/**
 * To run the xpand based generator programmatically
 * 
 * @author Lorenzo Bettini
 * 
 */
public class TypeSystemGenerator {

	protected String templatePath = "xtypes::templates::Start::main";

	public void addPlatformUri(String uri) {
		StandaloneSetup standalone = new StandaloneSetup();
		standalone.setPlatformUri(uri);
	}

	public void generate(String outputFolder,
			TypeSystemDefinition... typeSystemDefinitions) {
		for (TypeSystemDefinition typeSystemDefinition : typeSystemDefinitions) {
			generate(outputFolder, typeSystemDefinition);
		}
	}

	public void generate(String outputFolder, String... typeSystemFiles) {
		for (String typeSystemFile : typeSystemFiles) {
			generate(outputFolder, typeSystemFile);
		}
	}

	public void generate(String outputFolder, String typeSystemFile) {
		TypeSystemDefinition typeSystemDefinition = loadFromFile(typeSystemFile);
		generate(outputFolder, typeSystemDefinition);
	}

	public TypeSystemDefinition loadFromFile(String typeSystemFile) {
		TypeSystemDefinition typeSystemDefinition = TypeSystemLoader
				.loadFromFile(typeSystemFile);
		return typeSystemDefinition;
	}

	public void generate(String outputFolder,
			TypeSystemDefinition typeSystemDefinition) {
		cleanPreviousOutputFolder(outputFolder, typeSystemDefinition);

		OutputImpl output = createOutput(outputFolder);

		XpandExecutionContextImpl execCtx = createXpandExecutionContext(output);

		XpandFacade facade = XpandFacade.create(execCtx);
		facade.evaluate(templatePath, typeSystemDefinition);
	}

	public void cleanPreviousOutputFolder(String outputFolder,
			TypeSystemDefinition typeSystemDefinition) {
		String folderToClean = TypeSystemGeneratorJavaExtensions
				.getGeneratedTypesystemPackage(typeSystemDefinition);
		folderToClean = TypeSystemGeneratorJavaExtensions
				.packageToDir(folderToClean);
		folderToClean = outputFolder + "/" + folderToClean;
		cleanOutputFolder(folderToClean);
	}

	public void cleanOutputFolder(String outputFolder) {
		try {
			new DirectoryCleaner().cleanFolder(outputFolder);
		} catch (FileNotFoundException e) {
			// ignore it
		}
	}

	protected XpandExecutionContextImpl createXpandExecutionContext(
			OutputImpl output) {
		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(
				output, null);

		/*
		 * EmfRegistryMetaModel metamodel = new EmfRegistryMetaModel() {
		 * 
		 * @Override protected EPackage[] allPackages() { return new EPackage[]
		 * { TypesystemPackage.eINSTANCE, EcorePackage.eINSTANCE }; } };
		 * execCtx.registerMetaModel(metamodel);
		 */

		// execCtx.registerMetaModel(new
		// EmfMetaModel(TypesystemPackage.eINSTANCE));
		execCtx.registerMetaModel(new JavaBeansMetaModel());
		return execCtx;
	}

	protected OutputImpl createOutput(String outputFolder) {
		OutputImpl output = new OutputImpl();
		Outlet outlet = new Outlet(outputFolder);
		outlet.setOverwrite(true);
		outlet.addPostprocessor(new JavaBeautifier());
		output.addOutlet(outlet);
		return output;
	}

}
