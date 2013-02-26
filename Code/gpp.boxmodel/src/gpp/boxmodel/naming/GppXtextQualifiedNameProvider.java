package gpp.boxmodel.naming;

import gpp.boxmodel.utils.XtextGrammarElementDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.CompoundElement;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.Strings;
import com.google.inject.Inject;

public class GppXtextQualifiedNameProvider extends IQualifiedNameProvider.AbstractImpl {
	
	
	private IStringRepresentationProvider stringRepresentationProvider = new GppXtextStringRepresentationProvider();
	
	@Inject
	private IQualifiedNameConverter converter = new IQualifiedNameConverter.DefaultImpl();
	
	@Inject
	//private IResourceScopeCache cache = IResourceScopeCache.NullImpl.INSTANCE;
	
	public QualifiedName getFullyQualifiedName(final EObject obj)
	{
		return getFullyQualifiedName(obj, false);
	}

	public QualifiedName getFullyQualifiedName(final EObject obj, boolean isParent) {
		//return cache.get(Tuples.pair(obj, "fqn"), obj.eResource(), new Provider<QualifiedName>(){

			//public QualifiedName get() {
				EObject temp = obj;
				// The Grammar object has no name
				String name = stringRepresentationProvider.getStringRepresentation(obj);
				if(isParent)
				{
					if(obj.eClass().getName().equals(XtextGrammarElementDefinitions.ASSIGNMENT))
					{
						name = ":";
					}
					if(obj instanceof CompoundElement && getCountOfNonActionElements((CompoundElement)obj) > 1)
					{
						if(obj.eClass().getName().equals(XtextGrammarElementDefinitions.ALTERNATIVES))
						{
							name = "|";
						}
						if(obj.eClass().getName().equals(XtextGrammarElementDefinitions.UNORDERED_GROUP))
						{
							name = "&";
						}
						if(obj.eClass().getName().equals(XtextGrammarElementDefinitions.GROUP))
						{
							name = " ";
						}
					}
				}
				if(name == null)
				{
					name = "";
				}
				List<String> segments = new ArrayList<String>(2);
				segments.add(name);
				int orderNumber = getOrderNumber(obj);
				if(orderNumber >= 0)
				{
					if(name.length() > 0)
					{
						segments.add(name);
						name = "." + name;
					}
					name = String.valueOf(orderNumber) + name;
					segments.set(0, String.valueOf(orderNumber));
				}
				if(Strings.isEmpty(name))
				{
					return null;
				}
				QualifiedName qualifiedName = QualifiedName.create(segments.toArray(new String[]{}));
				while (temp.eContainer() != null) {
					temp = temp.eContainer();
					QualifiedName parentsQualifiedName = getFullyQualifiedName(temp,true);
					if (parentsQualifiedName != null)
						return parentsQualifiedName.append(qualifiedName);
				}
				return qualifiedName;
			//}
		//});
	}

	
	protected int getOrderNumber(final EObject obj)
	{
		if(obj.eContainer() == null || !(obj.eContainer() instanceof CompoundElement))
		{

			return -1;
		}
		if(getCountOfNonActionElements((CompoundElement)obj.eContainer()) < 2)
		{
			return -1;
		}
		CompoundElement container = (CompoundElement)obj.eContainer();
		int returnValue = -1;
		for(EObject element : container.getElements())
		{
			if(!(element instanceof Action))
			{
				returnValue++;
			}
			if(element.equals(obj))
			{
				return returnValue;
			}
		}
		return -1;
	}
	
	protected int getCountOfNonActionElements(CompoundElement compoundElement)
	{
		int returnValue = 0;
		for(AbstractElement element: compoundElement.getElements())
		{
			if(!element.eClass().getName().equals(XtextGrammarElementDefinitions.ACTION))
			{
				returnValue++;
			}
		}
		return returnValue;
	}
	
	protected IQualifiedNameConverter getConverter() {
		return converter;
	}
}
