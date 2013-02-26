
package it.xtypes;

import it.xtypes.TypeSystemStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TypeSystemStandaloneSetup extends TypeSystemStandaloneSetupGenerated{

	public static void doSetup() {
		new TypeSystemStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

