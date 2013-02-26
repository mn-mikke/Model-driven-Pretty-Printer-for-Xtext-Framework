package gpp.boxmodel.scoping;

import com.google.inject.ImplementedBy;

@ImplementedBy(GppCrossReferenceStringCleaner.class)
public interface ICrossReferenceStringCleaner {
	String clean(String crossReferenceString);
}
