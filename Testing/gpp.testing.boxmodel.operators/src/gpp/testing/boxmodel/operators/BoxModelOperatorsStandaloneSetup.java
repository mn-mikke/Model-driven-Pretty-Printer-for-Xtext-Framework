
package gpp.testing.boxmodel.operators;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class BoxModelOperatorsStandaloneSetup extends BoxModelOperatorsStandaloneSetupGenerated{

	public static void doSetup() {
		new BoxModelOperatorsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

