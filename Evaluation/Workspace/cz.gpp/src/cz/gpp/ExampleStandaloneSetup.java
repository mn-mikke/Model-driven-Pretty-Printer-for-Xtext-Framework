
package cz.gpp;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ExampleStandaloneSetup extends ExampleStandaloneSetupGenerated{

	public static void doSetup() {
		new ExampleStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

