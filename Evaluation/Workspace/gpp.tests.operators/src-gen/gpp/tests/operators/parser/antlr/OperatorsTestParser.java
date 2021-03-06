/*
* generated by Xtext
*/
package gpp.tests.operators.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import gpp.tests.operators.services.OperatorsTestGrammarAccess;

public class OperatorsTestParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private OperatorsTestGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected gpp.tests.operators.parser.antlr.internal.InternalOperatorsTestParser createParser(XtextTokenStream stream) {
		return new gpp.tests.operators.parser.antlr.internal.InternalOperatorsTestParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "BoxModelOperators";
	}
	
	public OperatorsTestGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(OperatorsTestGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
