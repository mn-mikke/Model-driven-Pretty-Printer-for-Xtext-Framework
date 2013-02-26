package gpp.boxmodel.defaultboxmodel;

import org.eclipse.emf.common.util.*;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.TerminalRule;

class Xtext2BoxModelTransformationHelper {
	static public EList<Grammar> getCorrespondingGrammars(Grammar grammar)
	{
		EList<Grammar> returnValue = new BasicEList<Grammar>();
		returnValue.add(grammar);
		int i = 0;
		while(i < returnValue.size())
		{
			Grammar tempGrammar = returnValue.get(i);
			for(Grammar relatedGrammar : tempGrammar.getUsedGrammars())
			{
				if(!returnValue.contains(relatedGrammar))
				{
					returnValue.add(relatedGrammar);
				}
			}
			i=i+1;
		}
		return returnValue;
	}
	
	static public  EList<TerminalRule> getTerminalRules(EList<Grammar> grammars)
	{
		EList<TerminalRule> returnValue = new BasicEList<TerminalRule>();
		for(Grammar grammar : grammars)
		{
			for(AbstractRule rule : grammar.getRules())
			{
				if(rule instanceof TerminalRule && !returnValue.contains(rule))
				{
					returnValue.add((TerminalRule)rule);
				}
			}			
		}
		return returnValue;
	}
	
	static public EList<ParserRule> getParserRules(EList<Grammar> grammars)
	{
		EList<ParserRule> returnValue = new BasicEList<ParserRule>();
		for(Grammar grammar : grammars)
		{
			for(AbstractRule rule : grammar.getRules())
			{
				if(rule instanceof ParserRule && !returnValue.contains(rule))
				{
					returnValue.add((ParserRule)rule);
				}
			}			
		}
		return returnValue;
	}
}
