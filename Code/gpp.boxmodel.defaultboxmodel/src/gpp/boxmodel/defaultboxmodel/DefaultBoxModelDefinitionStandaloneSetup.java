
package gpp.boxmodel.defaultboxmodel;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DefaultBoxModelDefinitionStandaloneSetup extends DefaultBoxModelDefinitionStandaloneSetupGenerated{

	public static void doSetup() {
		new DefaultBoxModelDefinitionStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

