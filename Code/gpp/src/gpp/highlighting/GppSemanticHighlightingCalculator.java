package gpp.highlighting;

import java.util.HashMap;

import gpp.boxmodel.boxModel.BoxModel;
import gpp.boxmodel.naming.GppXtextQualifiedNameProvider;
import gpp.boxmodel.utils.IBoxModelProvider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import com.google.inject.Inject;

public class GppSemanticHighlightingCalculator implements ISemanticHighlightingCalculator
{
	@Inject
	private IBoxModelProvider boxModelProvider;
	
	private GppXtextQualifiedNameProvider qualifiedNameProvider = new GppXtextQualifiedNameProvider();
	
	private HashMap<QualifiedName,String> formattingMap = new HashMap<QualifiedName, String>();
	
	private boolean initialized = false;
	
	public void initialize()
	{
		if(!initialized)
		{
			HighlightFormattingMapFiller filler = new HighlightFormattingMapFiller();
			BoxModel boxModel = boxModelProvider.getBoxModel();
			filler.initialize(boxModel, qualifiedNameProvider, formattingMap);
			filler.fill();
			initialized = true;
		}
	}
	
	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor)
	{
		 initialize();
		 if (resource == null || resource.getParseResult() == null)
		 {
		     return;
		 }
		 INode root = resource.getParseResult().getRootNode();
		 for(INode node : root.getAsTreeIterable())
		 {
			EObject grammarElement = node.getGrammarElement();
			if(grammarElement != null)
			{
				QualifiedName nodeName = qualifiedNameProvider.getFullyQualifiedName(grammarElement);
				if(formattingMap.containsKey(nodeName))
				{
					acceptor.addPosition(node.getOffset(), node.getLength(), formattingMap.get(nodeName));
				}
			}
		 }
	}

}
