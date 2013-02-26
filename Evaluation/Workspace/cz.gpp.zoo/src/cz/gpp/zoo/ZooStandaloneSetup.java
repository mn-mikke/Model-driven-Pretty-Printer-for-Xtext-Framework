
package cz.gpp.zoo;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ZooStandaloneSetup extends ZooStandaloneSetupGenerated{

	public static void doSetup() {
		new ZooStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

