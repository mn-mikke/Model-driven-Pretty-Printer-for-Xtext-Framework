
package gpp.tests.temorary;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TemporaryTestStandaloneSetup extends TemporaryTestStandaloneSetupGenerated{

	public static void doSetup() {
		new TemporaryTestStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

