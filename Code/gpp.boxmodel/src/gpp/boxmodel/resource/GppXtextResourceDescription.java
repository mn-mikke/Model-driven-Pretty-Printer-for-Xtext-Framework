package gpp.boxmodel.resource;

import static com.google.common.collect.Lists.newArrayList;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescription;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.util.IResourceScopeCache;

public class GppXtextResourceDescription extends DefaultResourceDescription {

	private IDefaultResourceDescriptionStrategy strategy;
	
	
	private final static Logger log = Logger.getLogger(GppXtextResourceDescription.class);
	
	public GppXtextResourceDescription(Resource resource, IDefaultResourceDescriptionStrategy strategy)
	{
		this(resource, strategy, new IResourceScopeCache.NullImpl());
	}
	
	public GppXtextResourceDescription(Resource resource, IDefaultResourceDescriptionStrategy strategy, IResourceScopeCache cache)
	{
		super(resource, strategy, cache);
		this.strategy = strategy;
	}

	@Override
	protected List<IEObjectDescription> computeExportedObjects() {
		if (!getResource().isLoaded()) {
			try {
				getResource().load(null);
			} catch (IOException e) {
				log.error(e.getMessage(), e);
				return Collections.<IEObjectDescription> emptyList();
			}
		}
		final List<IEObjectDescription> exportedEObjects = newArrayList();
		IAcceptor<IEObjectDescription> acceptor = new IAcceptor<IEObjectDescription>() {
			public void accept(IEObjectDescription eObjectDescription) {
				exportedEObjects.add(eObjectDescription);
			}
		};
		EList<Grammar> usedGrammars = getUsedGramars();
		for(Grammar usedGrammar : usedGrammars)
		{
			TreeIterator<EObject> allProperContents = EcoreUtil.getAllProperContents(usedGrammar, false);
			while (allProperContents.hasNext()) {
				EObject content = allProperContents.next();
				if (!strategy.createEObjectDescriptions(content, acceptor))
					allProperContents.prune();
			}
		}
		return exportedEObjects;
	}
	
	protected EList<Grammar> getUsedGramars()
	{
		EList<Grammar> returnValue = new BasicEList<Grammar>();
		TreeIterator<EObject> allProperContents = EcoreUtil.getAllProperContents(getResource(), false);
		if(allProperContents.hasNext())
		{
			EObject content = allProperContents.next();
			if(content instanceof Grammar)
			{
				returnValue.add((Grammar)content);
				for(int i = 0; i < returnValue.size(); i++)
				{
					Grammar grammar = returnValue.get(i);
					for(Grammar includedGrammar : grammar.getUsedGrammars())
					{
						if(!returnValue.contains(includedGrammar))
						{
							returnValue.add(includedGrammar);
						}
					}
				}
			}
		}
		return returnValue;
	}

}
