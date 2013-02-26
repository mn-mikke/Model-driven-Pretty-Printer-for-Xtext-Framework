
package gpp.boxmodel;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class BoxModelStandaloneSetup extends BoxModelStandaloneSetupGenerated{

	public static void doSetup() {
		new BoxModelStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

