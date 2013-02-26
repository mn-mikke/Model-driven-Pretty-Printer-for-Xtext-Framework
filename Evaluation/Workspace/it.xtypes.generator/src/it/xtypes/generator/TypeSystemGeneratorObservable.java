/**
 * 
 */
package it.xtypes.generator;

import java.util.Observable;

/**
 * @author Lorenzo Bettini
 * 
 */
public class TypeSystemGeneratorObservable extends Observable {

	public void nowGenerating(String string) {
		setChanged();
		notifyObservers(string);
	}

}
