package gpp.tests.operators.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import gpp.tests.operators.services.OperatorsTestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOperatorsTestParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'str'", "'integer'", "'int'", "'pop'", "'poperator'", "'hlop'", "'hloperator'", "'top'", "'toperator'", "'='", "'import'", "'.'", "'['", "']'", "';'", "':'", "'alias'", "'{'", "'}'", "','", "'enum'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalOperatorsTestParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOperatorsTestParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOperatorsTestParser.tokenNames; }
    public String getGrammarFileName() { return "../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g"; }


     
     	private OperatorsTestGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(OperatorsTestGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleBoxModelOperators"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:60:1: entryRuleBoxModelOperators : ruleBoxModelOperators EOF ;
    public final void entryRuleBoxModelOperators() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:61:1: ( ruleBoxModelOperators EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:62:1: ruleBoxModelOperators EOF
            {
             before(grammarAccess.getBoxModelOperatorsRule()); 
            pushFollow(FOLLOW_ruleBoxModelOperators_in_entryRuleBoxModelOperators61);
            ruleBoxModelOperators();

            state._fsp--;

             after(grammarAccess.getBoxModelOperatorsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoxModelOperators68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoxModelOperators"


    // $ANTLR start "ruleBoxModelOperators"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:69:1: ruleBoxModelOperators : ( ( rule__BoxModelOperators__Group__0 ) ) ;
    public final void ruleBoxModelOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:73:2: ( ( ( rule__BoxModelOperators__Group__0 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:74:1: ( ( rule__BoxModelOperators__Group__0 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:74:1: ( ( rule__BoxModelOperators__Group__0 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:75:1: ( rule__BoxModelOperators__Group__0 )
            {
             before(grammarAccess.getBoxModelOperatorsAccess().getGroup()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:76:1: ( rule__BoxModelOperators__Group__0 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:76:2: rule__BoxModelOperators__Group__0
            {
            pushFollow(FOLLOW_rule__BoxModelOperators__Group__0_in_ruleBoxModelOperators94);
            rule__BoxModelOperators__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoxModelOperatorsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoxModelOperators"


    // $ANTLR start "entryRuleStringConstant"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:88:1: entryRuleStringConstant : ruleStringConstant EOF ;
    public final void entryRuleStringConstant() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:89:1: ( ruleStringConstant EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:90:1: ruleStringConstant EOF
            {
             before(grammarAccess.getStringConstantRule()); 
            pushFollow(FOLLOW_ruleStringConstant_in_entryRuleStringConstant121);
            ruleStringConstant();

            state._fsp--;

             after(grammarAccess.getStringConstantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringConstant128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringConstant"


    // $ANTLR start "ruleStringConstant"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:97:1: ruleStringConstant : ( ( rule__StringConstant__Group__0 ) ) ;
    public final void ruleStringConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:101:2: ( ( ( rule__StringConstant__Group__0 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:102:1: ( ( rule__StringConstant__Group__0 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:102:1: ( ( rule__StringConstant__Group__0 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:103:1: ( rule__StringConstant__Group__0 )
            {
             before(grammarAccess.getStringConstantAccess().getGroup()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:104:1: ( rule__StringConstant__Group__0 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:104:2: rule__StringConstant__Group__0
            {
            pushFollow(FOLLOW_rule__StringConstant__Group__0_in_ruleStringConstant154);
            rule__StringConstant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringConstant"


    // $ANTLR start "entryRuleIntConstant"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:116:1: entryRuleIntConstant : ruleIntConstant EOF ;
    public final void entryRuleIntConstant() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:117:1: ( ruleIntConstant EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:118:1: ruleIntConstant EOF
            {
             before(grammarAccess.getIntConstantRule()); 
            pushFollow(FOLLOW_ruleIntConstant_in_entryRuleIntConstant181);
            ruleIntConstant();

            state._fsp--;

             after(grammarAccess.getIntConstantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntConstant188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntConstant"


    // $ANTLR start "ruleIntConstant"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:125:1: ruleIntConstant : ( ( rule__IntConstant__Group__0 ) ) ;
    public final void ruleIntConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:129:2: ( ( ( rule__IntConstant__Group__0 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:130:1: ( ( rule__IntConstant__Group__0 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:130:1: ( ( rule__IntConstant__Group__0 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:131:1: ( rule__IntConstant__Group__0 )
            {
             before(grammarAccess.getIntConstantAccess().getGroup()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:132:1: ( rule__IntConstant__Group__0 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:132:2: rule__IntConstant__Group__0
            {
            pushFollow(FOLLOW_rule__IntConstant__Group__0_in_ruleIntConstant214);
            rule__IntConstant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntConstant"


    // $ANTLR start "entryRuleImport"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:144:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:145:1: ( ruleImport EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:146:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport241);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:153:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:157:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:158:1: ( ( rule__Import__Group__0 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:158:1: ( ( rule__Import__Group__0 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:159:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:160:1: ( rule__Import__Group__0 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:160:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport274);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleOperatorImplementationString"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:172:1: entryRuleOperatorImplementationString : ruleOperatorImplementationString EOF ;
    public final void entryRuleOperatorImplementationString() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:173:1: ( ruleOperatorImplementationString EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:174:1: ruleOperatorImplementationString EOF
            {
             before(grammarAccess.getOperatorImplementationStringRule()); 
            pushFollow(FOLLOW_ruleOperatorImplementationString_in_entryRuleOperatorImplementationString301);
            ruleOperatorImplementationString();

            state._fsp--;

             after(grammarAccess.getOperatorImplementationStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorImplementationString308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperatorImplementationString"


    // $ANTLR start "ruleOperatorImplementationString"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:181:1: ruleOperatorImplementationString : ( ( rule__OperatorImplementationString__Group__0 ) ) ;
    public final void ruleOperatorImplementationString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:185:2: ( ( ( rule__OperatorImplementationString__Group__0 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:186:1: ( ( rule__OperatorImplementationString__Group__0 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:186:1: ( ( rule__OperatorImplementationString__Group__0 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:187:1: ( rule__OperatorImplementationString__Group__0 )
            {
             before(grammarAccess.getOperatorImplementationStringAccess().getGroup()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:188:1: ( rule__OperatorImplementationString__Group__0 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:188:2: rule__OperatorImplementationString__Group__0
            {
            pushFollow(FOLLOW_rule__OperatorImplementationString__Group__0_in_ruleOperatorImplementationString334);
            rule__OperatorImplementationString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperatorImplementationStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperatorImplementationString"


    // $ANTLR start "entryRuleOperatorDefinition"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:200:1: entryRuleOperatorDefinition : ruleOperatorDefinition EOF ;
    public final void entryRuleOperatorDefinition() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:201:1: ( ruleOperatorDefinition EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:202:1: ruleOperatorDefinition EOF
            {
             before(grammarAccess.getOperatorDefinitionRule()); 
            pushFollow(FOLLOW_ruleOperatorDefinition_in_entryRuleOperatorDefinition361);
            ruleOperatorDefinition();

            state._fsp--;

             after(grammarAccess.getOperatorDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorDefinition368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperatorDefinition"


    // $ANTLR start "ruleOperatorDefinition"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:209:1: ruleOperatorDefinition : ( ( rule__OperatorDefinition__Alternatives ) ) ;
    public final void ruleOperatorDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:213:2: ( ( ( rule__OperatorDefinition__Alternatives ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:214:1: ( ( rule__OperatorDefinition__Alternatives ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:214:1: ( ( rule__OperatorDefinition__Alternatives ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:215:1: ( rule__OperatorDefinition__Alternatives )
            {
             before(grammarAccess.getOperatorDefinitionAccess().getAlternatives()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:216:1: ( rule__OperatorDefinition__Alternatives )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:216:2: rule__OperatorDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__OperatorDefinition__Alternatives_in_ruleOperatorDefinition394);
            rule__OperatorDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperatorDefinition"


    // $ANTLR start "entryRuleBasicOperatorDefinition"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:228:1: entryRuleBasicOperatorDefinition : ruleBasicOperatorDefinition EOF ;
    public final void entryRuleBasicOperatorDefinition() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:229:1: ( ruleBasicOperatorDefinition EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:230:1: ruleBasicOperatorDefinition EOF
            {
             before(grammarAccess.getBasicOperatorDefinitionRule()); 
            pushFollow(FOLLOW_ruleBasicOperatorDefinition_in_entryRuleBasicOperatorDefinition421);
            ruleBasicOperatorDefinition();

            state._fsp--;

             after(grammarAccess.getBasicOperatorDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicOperatorDefinition428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicOperatorDefinition"


    // $ANTLR start "ruleBasicOperatorDefinition"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:237:1: ruleBasicOperatorDefinition : ( ( rule__BasicOperatorDefinition__Group__0 ) ) ;
    public final void ruleBasicOperatorDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:241:2: ( ( ( rule__BasicOperatorDefinition__Group__0 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:242:1: ( ( rule__BasicOperatorDefinition__Group__0 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:242:1: ( ( rule__BasicOperatorDefinition__Group__0 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:243:1: ( rule__BasicOperatorDefinition__Group__0 )
            {
             before(grammarAccess.getBasicOperatorDefinitionAccess().getGroup()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:244:1: ( rule__BasicOperatorDefinition__Group__0 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:244:2: rule__BasicOperatorDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__BasicOperatorDefinition__Group__0_in_ruleBasicOperatorDefinition454);
            rule__BasicOperatorDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasicOperatorDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicOperatorDefinition"


    // $ANTLR start "entryRulePositionalOperatorDefinition"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:256:1: entryRulePositionalOperatorDefinition : rulePositionalOperatorDefinition EOF ;
    public final void entryRulePositionalOperatorDefinition() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:257:1: ( rulePositionalOperatorDefinition EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:258:1: rulePositionalOperatorDefinition EOF
            {
             before(grammarAccess.getPositionalOperatorDefinitionRule()); 
            pushFollow(FOLLOW_rulePositionalOperatorDefinition_in_entryRulePositionalOperatorDefinition481);
            rulePositionalOperatorDefinition();

            state._fsp--;

             after(grammarAccess.getPositionalOperatorDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePositionalOperatorDefinition488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePositionalOperatorDefinition"


    // $ANTLR start "rulePositionalOperatorDefinition"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:265:1: rulePositionalOperatorDefinition : ( ( rule__PositionalOperatorDefinition__Group__0 ) ) ;
    public final void rulePositionalOperatorDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:269:2: ( ( ( rule__PositionalOperatorDefinition__Group__0 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:270:1: ( ( rule__PositionalOperatorDefinition__Group__0 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:270:1: ( ( rule__PositionalOperatorDefinition__Group__0 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:271:1: ( rule__PositionalOperatorDefinition__Group__0 )
            {
             before(grammarAccess.getPositionalOperatorDefinitionAccess().getGroup()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:272:1: ( rule__PositionalOperatorDefinition__Group__0 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:272:2: rule__PositionalOperatorDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__PositionalOperatorDefinition__Group__0_in_rulePositionalOperatorDefinition514);
            rule__PositionalOperatorDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPositionalOperatorDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePositionalOperatorDefinition"


    // $ANTLR start "entryRuleHighlightOperatorDefinition"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:284:1: entryRuleHighlightOperatorDefinition : ruleHighlightOperatorDefinition EOF ;
    public final void entryRuleHighlightOperatorDefinition() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:285:1: ( ruleHighlightOperatorDefinition EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:286:1: ruleHighlightOperatorDefinition EOF
            {
             before(grammarAccess.getHighlightOperatorDefinitionRule()); 
            pushFollow(FOLLOW_ruleHighlightOperatorDefinition_in_entryRuleHighlightOperatorDefinition541);
            ruleHighlightOperatorDefinition();

            state._fsp--;

             after(grammarAccess.getHighlightOperatorDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHighlightOperatorDefinition548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHighlightOperatorDefinition"


    // $ANTLR start "ruleHighlightOperatorDefinition"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:293:1: ruleHighlightOperatorDefinition : ( ( rule__HighlightOperatorDefinition__Group__0 ) ) ;
    public final void ruleHighlightOperatorDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:297:2: ( ( ( rule__HighlightOperatorDefinition__Group__0 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:298:1: ( ( rule__HighlightOperatorDefinition__Group__0 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:298:1: ( ( rule__HighlightOperatorDefinition__Group__0 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:299:1: ( rule__HighlightOperatorDefinition__Group__0 )
            {
             before(grammarAccess.getHighlightOperatorDefinitionAccess().getGroup()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:300:1: ( rule__HighlightOperatorDefinition__Group__0 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:300:2: rule__HighlightOperatorDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__HighlightOperatorDefinition__Group__0_in_ruleHighlightOperatorDefinition574);
            rule__HighlightOperatorDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHighlightOperatorDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHighlightOperatorDefinition"


    // $ANTLR start "entryRuleTransformingOperatorDefinition"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:312:1: entryRuleTransformingOperatorDefinition : ruleTransformingOperatorDefinition EOF ;
    public final void entryRuleTransformingOperatorDefinition() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:313:1: ( ruleTransformingOperatorDefinition EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:314:1: ruleTransformingOperatorDefinition EOF
            {
             before(grammarAccess.getTransformingOperatorDefinitionRule()); 
            pushFollow(FOLLOW_ruleTransformingOperatorDefinition_in_entryRuleTransformingOperatorDefinition601);
            ruleTransformingOperatorDefinition();

            state._fsp--;

             after(grammarAccess.getTransformingOperatorDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransformingOperatorDefinition608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransformingOperatorDefinition"


    // $ANTLR start "ruleTransformingOperatorDefinition"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:321:1: ruleTransformingOperatorDefinition : ( ( rule__TransformingOperatorDefinition__Group__0 ) ) ;
    public final void ruleTransformingOperatorDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:325:2: ( ( ( rule__TransformingOperatorDefinition__Group__0 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:326:1: ( ( rule__TransformingOperatorDefinition__Group__0 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:326:1: ( ( rule__TransformingOperatorDefinition__Group__0 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:327:1: ( rule__TransformingOperatorDefinition__Group__0 )
            {
             before(grammarAccess.getTransformingOperatorDefinitionAccess().getGroup()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:328:1: ( rule__TransformingOperatorDefinition__Group__0 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:328:2: rule__TransformingOperatorDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TransformingOperatorDefinition__Group__0_in_ruleTransformingOperatorDefinition634);
            rule__TransformingOperatorDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransformingOperatorDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransformingOperatorDefinition"


    // $ANTLR start "entryRuleAliasOperatorDefinition"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:340:1: entryRuleAliasOperatorDefinition : ruleAliasOperatorDefinition EOF ;
    public final void entryRuleAliasOperatorDefinition() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:341:1: ( ruleAliasOperatorDefinition EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:342:1: ruleAliasOperatorDefinition EOF
            {
             before(grammarAccess.getAliasOperatorDefinitionRule()); 
            pushFollow(FOLLOW_ruleAliasOperatorDefinition_in_entryRuleAliasOperatorDefinition661);
            ruleAliasOperatorDefinition();

            state._fsp--;

             after(grammarAccess.getAliasOperatorDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasOperatorDefinition668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAliasOperatorDefinition"


    // $ANTLR start "ruleAliasOperatorDefinition"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:349:1: ruleAliasOperatorDefinition : ( ( rule__AliasOperatorDefinition__Group__0 ) ) ;
    public final void ruleAliasOperatorDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:353:2: ( ( ( rule__AliasOperatorDefinition__Group__0 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:354:1: ( ( rule__AliasOperatorDefinition__Group__0 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:354:1: ( ( rule__AliasOperatorDefinition__Group__0 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:355:1: ( rule__AliasOperatorDefinition__Group__0 )
            {
             before(grammarAccess.getAliasOperatorDefinitionAccess().getGroup()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:356:1: ( rule__AliasOperatorDefinition__Group__0 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:356:2: rule__AliasOperatorDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__AliasOperatorDefinition__Group__0_in_ruleAliasOperatorDefinition694);
            rule__AliasOperatorDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAliasOperatorDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAliasOperatorDefinition"


    // $ANTLR start "entryRuleParameterApplication"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:368:1: entryRuleParameterApplication : ruleParameterApplication EOF ;
    public final void entryRuleParameterApplication() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:369:1: ( ruleParameterApplication EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:370:1: ruleParameterApplication EOF
            {
             before(grammarAccess.getParameterApplicationRule()); 
            pushFollow(FOLLOW_ruleParameterApplication_in_entryRuleParameterApplication721);
            ruleParameterApplication();

            state._fsp--;

             after(grammarAccess.getParameterApplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterApplication728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterApplication"


    // $ANTLR start "ruleParameterApplication"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:377:1: ruleParameterApplication : ( ( rule__ParameterApplication__Group__0 ) ) ;
    public final void ruleParameterApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:381:2: ( ( ( rule__ParameterApplication__Group__0 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:382:1: ( ( rule__ParameterApplication__Group__0 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:382:1: ( ( rule__ParameterApplication__Group__0 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:383:1: ( rule__ParameterApplication__Group__0 )
            {
             before(grammarAccess.getParameterApplicationAccess().getGroup()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:384:1: ( rule__ParameterApplication__Group__0 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:384:2: rule__ParameterApplication__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterApplication__Group__0_in_ruleParameterApplication754);
            rule__ParameterApplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterApplication"


    // $ANTLR start "entryRuleParameterDefinition"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:396:1: entryRuleParameterDefinition : ruleParameterDefinition EOF ;
    public final void entryRuleParameterDefinition() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:397:1: ( ruleParameterDefinition EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:398:1: ruleParameterDefinition EOF
            {
             before(grammarAccess.getParameterDefinitionRule()); 
            pushFollow(FOLLOW_ruleParameterDefinition_in_entryRuleParameterDefinition781);
            ruleParameterDefinition();

            state._fsp--;

             after(grammarAccess.getParameterDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDefinition788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterDefinition"


    // $ANTLR start "ruleParameterDefinition"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:405:1: ruleParameterDefinition : ( ( rule__ParameterDefinition__Alternatives ) ) ;
    public final void ruleParameterDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:409:2: ( ( ( rule__ParameterDefinition__Alternatives ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:410:1: ( ( rule__ParameterDefinition__Alternatives ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:410:1: ( ( rule__ParameterDefinition__Alternatives ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:411:1: ( rule__ParameterDefinition__Alternatives )
            {
             before(grammarAccess.getParameterDefinitionAccess().getAlternatives()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:412:1: ( rule__ParameterDefinition__Alternatives )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:412:2: rule__ParameterDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__ParameterDefinition__Alternatives_in_ruleParameterDefinition814);
            rule__ParameterDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterDefinition"


    // $ANTLR start "entryRuleStringParameterDefinition"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:424:1: entryRuleStringParameterDefinition : ruleStringParameterDefinition EOF ;
    public final void entryRuleStringParameterDefinition() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:425:1: ( ruleStringParameterDefinition EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:426:1: ruleStringParameterDefinition EOF
            {
             before(grammarAccess.getStringParameterDefinitionRule()); 
            pushFollow(FOLLOW_ruleStringParameterDefinition_in_entryRuleStringParameterDefinition841);
            ruleStringParameterDefinition();

            state._fsp--;

             after(grammarAccess.getStringParameterDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringParameterDefinition848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringParameterDefinition"


    // $ANTLR start "ruleStringParameterDefinition"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:433:1: ruleStringParameterDefinition : ( ( rule__StringParameterDefinition__Group__0 ) ) ;
    public final void ruleStringParameterDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:437:2: ( ( ( rule__StringParameterDefinition__Group__0 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:438:1: ( ( rule__StringParameterDefinition__Group__0 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:438:1: ( ( rule__StringParameterDefinition__Group__0 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:439:1: ( rule__StringParameterDefinition__Group__0 )
            {
             before(grammarAccess.getStringParameterDefinitionAccess().getGroup()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:440:1: ( rule__StringParameterDefinition__Group__0 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:440:2: rule__StringParameterDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__StringParameterDefinition__Group__0_in_ruleStringParameterDefinition874);
            rule__StringParameterDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringParameterDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringParameterDefinition"


    // $ANTLR start "entryRuleIntParameterDefinition"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:452:1: entryRuleIntParameterDefinition : ruleIntParameterDefinition EOF ;
    public final void entryRuleIntParameterDefinition() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:453:1: ( ruleIntParameterDefinition EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:454:1: ruleIntParameterDefinition EOF
            {
             before(grammarAccess.getIntParameterDefinitionRule()); 
            pushFollow(FOLLOW_ruleIntParameterDefinition_in_entryRuleIntParameterDefinition901);
            ruleIntParameterDefinition();

            state._fsp--;

             after(grammarAccess.getIntParameterDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntParameterDefinition908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntParameterDefinition"


    // $ANTLR start "ruleIntParameterDefinition"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:461:1: ruleIntParameterDefinition : ( ( rule__IntParameterDefinition__Group__0 ) ) ;
    public final void ruleIntParameterDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:465:2: ( ( ( rule__IntParameterDefinition__Group__0 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:466:1: ( ( rule__IntParameterDefinition__Group__0 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:466:1: ( ( rule__IntParameterDefinition__Group__0 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:467:1: ( rule__IntParameterDefinition__Group__0 )
            {
             before(grammarAccess.getIntParameterDefinitionAccess().getGroup()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:468:1: ( rule__IntParameterDefinition__Group__0 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:468:2: rule__IntParameterDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__IntParameterDefinition__Group__0_in_ruleIntParameterDefinition934);
            rule__IntParameterDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntParameterDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntParameterDefinition"


    // $ANTLR start "entryRuleEnumParameterDefinition"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:480:1: entryRuleEnumParameterDefinition : ruleEnumParameterDefinition EOF ;
    public final void entryRuleEnumParameterDefinition() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:481:1: ( ruleEnumParameterDefinition EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:482:1: ruleEnumParameterDefinition EOF
            {
             before(grammarAccess.getEnumParameterDefinitionRule()); 
            pushFollow(FOLLOW_ruleEnumParameterDefinition_in_entryRuleEnumParameterDefinition961);
            ruleEnumParameterDefinition();

            state._fsp--;

             after(grammarAccess.getEnumParameterDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumParameterDefinition968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumParameterDefinition"


    // $ANTLR start "ruleEnumParameterDefinition"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:489:1: ruleEnumParameterDefinition : ( ( rule__EnumParameterDefinition__Group__0 ) ) ;
    public final void ruleEnumParameterDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:493:2: ( ( ( rule__EnumParameterDefinition__Group__0 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:494:1: ( ( rule__EnumParameterDefinition__Group__0 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:494:1: ( ( rule__EnumParameterDefinition__Group__0 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:495:1: ( rule__EnumParameterDefinition__Group__0 )
            {
             before(grammarAccess.getEnumParameterDefinitionAccess().getGroup()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:496:1: ( rule__EnumParameterDefinition__Group__0 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:496:2: rule__EnumParameterDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group__0_in_ruleEnumParameterDefinition994);
            rule__EnumParameterDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumParameterDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumParameterDefinition"


    // $ANTLR start "entryRuleGlobalEnum"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:508:1: entryRuleGlobalEnum : ruleGlobalEnum EOF ;
    public final void entryRuleGlobalEnum() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:509:1: ( ruleGlobalEnum EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:510:1: ruleGlobalEnum EOF
            {
             before(grammarAccess.getGlobalEnumRule()); 
            pushFollow(FOLLOW_ruleGlobalEnum_in_entryRuleGlobalEnum1021);
            ruleGlobalEnum();

            state._fsp--;

             after(grammarAccess.getGlobalEnumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalEnum1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobalEnum"


    // $ANTLR start "ruleGlobalEnum"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:517:1: ruleGlobalEnum : ( ( rule__GlobalEnum__Group__0 ) ) ;
    public final void ruleGlobalEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:521:2: ( ( ( rule__GlobalEnum__Group__0 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:522:1: ( ( rule__GlobalEnum__Group__0 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:522:1: ( ( rule__GlobalEnum__Group__0 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:523:1: ( rule__GlobalEnum__Group__0 )
            {
             before(grammarAccess.getGlobalEnumAccess().getGroup()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:524:1: ( rule__GlobalEnum__Group__0 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:524:2: rule__GlobalEnum__Group__0
            {
            pushFollow(FOLLOW_rule__GlobalEnum__Group__0_in_ruleGlobalEnum1054);
            rule__GlobalEnum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalEnumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalEnum"


    // $ANTLR start "entryRuleEnumAlternative"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:536:1: entryRuleEnumAlternative : ruleEnumAlternative EOF ;
    public final void entryRuleEnumAlternative() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:537:1: ( ruleEnumAlternative EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:538:1: ruleEnumAlternative EOF
            {
             before(grammarAccess.getEnumAlternativeRule()); 
            pushFollow(FOLLOW_ruleEnumAlternative_in_entryRuleEnumAlternative1081);
            ruleEnumAlternative();

            state._fsp--;

             after(grammarAccess.getEnumAlternativeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumAlternative1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumAlternative"


    // $ANTLR start "ruleEnumAlternative"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:545:1: ruleEnumAlternative : ( ( rule__EnumAlternative__NameAssignment ) ) ;
    public final void ruleEnumAlternative() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:549:2: ( ( ( rule__EnumAlternative__NameAssignment ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:550:1: ( ( rule__EnumAlternative__NameAssignment ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:550:1: ( ( rule__EnumAlternative__NameAssignment ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:551:1: ( rule__EnumAlternative__NameAssignment )
            {
             before(grammarAccess.getEnumAlternativeAccess().getNameAssignment()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:552:1: ( rule__EnumAlternative__NameAssignment )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:552:2: rule__EnumAlternative__NameAssignment
            {
            pushFollow(FOLLOW_rule__EnumAlternative__NameAssignment_in_ruleEnumAlternative1114);
            rule__EnumAlternative__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnumAlternativeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumAlternative"


    // $ANTLR start "entryRuleStringParameterValue"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:564:1: entryRuleStringParameterValue : ruleStringParameterValue EOF ;
    public final void entryRuleStringParameterValue() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:565:1: ( ruleStringParameterValue EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:566:1: ruleStringParameterValue EOF
            {
             before(grammarAccess.getStringParameterValueRule()); 
            pushFollow(FOLLOW_ruleStringParameterValue_in_entryRuleStringParameterValue1141);
            ruleStringParameterValue();

            state._fsp--;

             after(grammarAccess.getStringParameterValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringParameterValue1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringParameterValue"


    // $ANTLR start "ruleStringParameterValue"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:573:1: ruleStringParameterValue : ( ( rule__StringParameterValue__Alternatives ) ) ;
    public final void ruleStringParameterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:577:2: ( ( ( rule__StringParameterValue__Alternatives ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:578:1: ( ( rule__StringParameterValue__Alternatives ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:578:1: ( ( rule__StringParameterValue__Alternatives ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:579:1: ( rule__StringParameterValue__Alternatives )
            {
             before(grammarAccess.getStringParameterValueAccess().getAlternatives()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:580:1: ( rule__StringParameterValue__Alternatives )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:580:2: rule__StringParameterValue__Alternatives
            {
            pushFollow(FOLLOW_rule__StringParameterValue__Alternatives_in_ruleStringParameterValue1174);
            rule__StringParameterValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStringParameterValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringParameterValue"


    // $ANTLR start "entryRuleParameterApplicationValue"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:592:1: entryRuleParameterApplicationValue : ruleParameterApplicationValue EOF ;
    public final void entryRuleParameterApplicationValue() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:593:1: ( ruleParameterApplicationValue EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:594:1: ruleParameterApplicationValue EOF
            {
             before(grammarAccess.getParameterApplicationValueRule()); 
            pushFollow(FOLLOW_ruleParameterApplicationValue_in_entryRuleParameterApplicationValue1201);
            ruleParameterApplicationValue();

            state._fsp--;

             after(grammarAccess.getParameterApplicationValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterApplicationValue1208); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterApplicationValue"


    // $ANTLR start "ruleParameterApplicationValue"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:601:1: ruleParameterApplicationValue : ( ( rule__ParameterApplicationValue__Alternatives ) ) ;
    public final void ruleParameterApplicationValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:605:2: ( ( ( rule__ParameterApplicationValue__Alternatives ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:606:1: ( ( rule__ParameterApplicationValue__Alternatives ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:606:1: ( ( rule__ParameterApplicationValue__Alternatives ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:607:1: ( rule__ParameterApplicationValue__Alternatives )
            {
             before(grammarAccess.getParameterApplicationValueAccess().getAlternatives()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:608:1: ( rule__ParameterApplicationValue__Alternatives )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:608:2: rule__ParameterApplicationValue__Alternatives
            {
            pushFollow(FOLLOW_rule__ParameterApplicationValue__Alternatives_in_ruleParameterApplicationValue1234);
            rule__ParameterApplicationValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterApplicationValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterApplicationValue"


    // $ANTLR start "entryRuleConstantReferenceValue"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:620:1: entryRuleConstantReferenceValue : ruleConstantReferenceValue EOF ;
    public final void entryRuleConstantReferenceValue() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:621:1: ( ruleConstantReferenceValue EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:622:1: ruleConstantReferenceValue EOF
            {
             before(grammarAccess.getConstantReferenceValueRule()); 
            pushFollow(FOLLOW_ruleConstantReferenceValue_in_entryRuleConstantReferenceValue1261);
            ruleConstantReferenceValue();

            state._fsp--;

             after(grammarAccess.getConstantReferenceValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantReferenceValue1268); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstantReferenceValue"


    // $ANTLR start "ruleConstantReferenceValue"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:629:1: ruleConstantReferenceValue : ( ( rule__ConstantReferenceValue__ValueAssignment ) ) ;
    public final void ruleConstantReferenceValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:633:2: ( ( ( rule__ConstantReferenceValue__ValueAssignment ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:634:1: ( ( rule__ConstantReferenceValue__ValueAssignment ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:634:1: ( ( rule__ConstantReferenceValue__ValueAssignment ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:635:1: ( rule__ConstantReferenceValue__ValueAssignment )
            {
             before(grammarAccess.getConstantReferenceValueAccess().getValueAssignment()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:636:1: ( rule__ConstantReferenceValue__ValueAssignment )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:636:2: rule__ConstantReferenceValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__ConstantReferenceValue__ValueAssignment_in_ruleConstantReferenceValue1294);
            rule__ConstantReferenceValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConstantReferenceValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstantReferenceValue"


    // $ANTLR start "entryRuleStringValue"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:650:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:651:1: ( ruleStringValue EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:652:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1323);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1330); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:659:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:663:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:664:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:664:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:665:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:666:1: ( rule__StringValue__ValueAssignment )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:666:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue1356);
            rule__StringValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleStringConstantApplication"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:678:1: entryRuleStringConstantApplication : ruleStringConstantApplication EOF ;
    public final void entryRuleStringConstantApplication() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:679:1: ( ruleStringConstantApplication EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:680:1: ruleStringConstantApplication EOF
            {
             before(grammarAccess.getStringConstantApplicationRule()); 
            pushFollow(FOLLOW_ruleStringConstantApplication_in_entryRuleStringConstantApplication1383);
            ruleStringConstantApplication();

            state._fsp--;

             after(grammarAccess.getStringConstantApplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringConstantApplication1390); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringConstantApplication"


    // $ANTLR start "ruleStringConstantApplication"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:687:1: ruleStringConstantApplication : ( ( rule__StringConstantApplication__ValueAssignment ) ) ;
    public final void ruleStringConstantApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:691:2: ( ( ( rule__StringConstantApplication__ValueAssignment ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:692:1: ( ( rule__StringConstantApplication__ValueAssignment ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:692:1: ( ( rule__StringConstantApplication__ValueAssignment ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:693:1: ( rule__StringConstantApplication__ValueAssignment )
            {
             before(grammarAccess.getStringConstantApplicationAccess().getValueAssignment()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:694:1: ( rule__StringConstantApplication__ValueAssignment )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:694:2: rule__StringConstantApplication__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringConstantApplication__ValueAssignment_in_ruleStringConstantApplication1416);
            rule__StringConstantApplication__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringConstantApplicationAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringConstantApplication"


    // $ANTLR start "entryRuleIntParameterValue"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:706:1: entryRuleIntParameterValue : ruleIntParameterValue EOF ;
    public final void entryRuleIntParameterValue() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:707:1: ( ruleIntParameterValue EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:708:1: ruleIntParameterValue EOF
            {
             before(grammarAccess.getIntParameterValueRule()); 
            pushFollow(FOLLOW_ruleIntParameterValue_in_entryRuleIntParameterValue1443);
            ruleIntParameterValue();

            state._fsp--;

             after(grammarAccess.getIntParameterValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntParameterValue1450); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntParameterValue"


    // $ANTLR start "ruleIntParameterValue"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:715:1: ruleIntParameterValue : ( ( rule__IntParameterValue__Alternatives ) ) ;
    public final void ruleIntParameterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:719:2: ( ( ( rule__IntParameterValue__Alternatives ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:720:1: ( ( rule__IntParameterValue__Alternatives ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:720:1: ( ( rule__IntParameterValue__Alternatives ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:721:1: ( rule__IntParameterValue__Alternatives )
            {
             before(grammarAccess.getIntParameterValueAccess().getAlternatives()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:722:1: ( rule__IntParameterValue__Alternatives )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:722:2: rule__IntParameterValue__Alternatives
            {
            pushFollow(FOLLOW_rule__IntParameterValue__Alternatives_in_ruleIntParameterValue1476);
            rule__IntParameterValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntParameterValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntParameterValue"


    // $ANTLR start "entryRuleIntValue"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:734:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:735:1: ( ruleIntValue EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:736:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue1503);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getIntValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue1510); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:743:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:747:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:748:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:748:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:749:1: ( rule__IntValue__ValueAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:750:1: ( rule__IntValue__ValueAssignment )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:750:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue1536);
            rule__IntValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleIntConstantApplication"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:762:1: entryRuleIntConstantApplication : ruleIntConstantApplication EOF ;
    public final void entryRuleIntConstantApplication() throws RecognitionException {
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:763:1: ( ruleIntConstantApplication EOF )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:764:1: ruleIntConstantApplication EOF
            {
             before(grammarAccess.getIntConstantApplicationRule()); 
            pushFollow(FOLLOW_ruleIntConstantApplication_in_entryRuleIntConstantApplication1563);
            ruleIntConstantApplication();

            state._fsp--;

             after(grammarAccess.getIntConstantApplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntConstantApplication1570); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntConstantApplication"


    // $ANTLR start "ruleIntConstantApplication"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:771:1: ruleIntConstantApplication : ( ( rule__IntConstantApplication__ValueAssignment ) ) ;
    public final void ruleIntConstantApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:775:2: ( ( ( rule__IntConstantApplication__ValueAssignment ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:776:1: ( ( rule__IntConstantApplication__ValueAssignment ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:776:1: ( ( rule__IntConstantApplication__ValueAssignment ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:777:1: ( rule__IntConstantApplication__ValueAssignment )
            {
             before(grammarAccess.getIntConstantApplicationAccess().getValueAssignment()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:778:1: ( rule__IntConstantApplication__ValueAssignment )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:778:2: rule__IntConstantApplication__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntConstantApplication__ValueAssignment_in_ruleIntConstantApplication1596);
            rule__IntConstantApplication__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntConstantApplicationAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntConstantApplication"


    // $ANTLR start "rule__BoxModelOperators__Alternatives_1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:790:1: rule__BoxModelOperators__Alternatives_1 : ( ( ( rule__BoxModelOperators__OperatorDefinitionsAssignment_1_0 ) ) | ( ( rule__BoxModelOperators__EnumerationsAssignment_1_1 ) ) | ( ( rule__BoxModelOperators__IntConstantsAssignment_1_2 ) ) | ( ( rule__BoxModelOperators__StringConstantsAssignment_1_3 ) ) );
    public final void rule__BoxModelOperators__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:794:1: ( ( ( rule__BoxModelOperators__OperatorDefinitionsAssignment_1_0 ) ) | ( ( rule__BoxModelOperators__EnumerationsAssignment_1_1 ) ) | ( ( rule__BoxModelOperators__IntConstantsAssignment_1_2 ) ) | ( ( rule__BoxModelOperators__StringConstantsAssignment_1_3 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 28:
                {
                alt1=1;
                }
                break;
            case 32:
                {
                alt1=2;
                }
                break;
            case 13:
            case 14:
                {
                alt1=3;
                }
                break;
            case 11:
            case 12:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:795:1: ( ( rule__BoxModelOperators__OperatorDefinitionsAssignment_1_0 ) )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:795:1: ( ( rule__BoxModelOperators__OperatorDefinitionsAssignment_1_0 ) )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:796:1: ( rule__BoxModelOperators__OperatorDefinitionsAssignment_1_0 )
                    {
                     before(grammarAccess.getBoxModelOperatorsAccess().getOperatorDefinitionsAssignment_1_0()); 
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:797:1: ( rule__BoxModelOperators__OperatorDefinitionsAssignment_1_0 )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:797:2: rule__BoxModelOperators__OperatorDefinitionsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__BoxModelOperators__OperatorDefinitionsAssignment_1_0_in_rule__BoxModelOperators__Alternatives_11632);
                    rule__BoxModelOperators__OperatorDefinitionsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBoxModelOperatorsAccess().getOperatorDefinitionsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:801:6: ( ( rule__BoxModelOperators__EnumerationsAssignment_1_1 ) )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:801:6: ( ( rule__BoxModelOperators__EnumerationsAssignment_1_1 ) )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:802:1: ( rule__BoxModelOperators__EnumerationsAssignment_1_1 )
                    {
                     before(grammarAccess.getBoxModelOperatorsAccess().getEnumerationsAssignment_1_1()); 
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:803:1: ( rule__BoxModelOperators__EnumerationsAssignment_1_1 )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:803:2: rule__BoxModelOperators__EnumerationsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__BoxModelOperators__EnumerationsAssignment_1_1_in_rule__BoxModelOperators__Alternatives_11650);
                    rule__BoxModelOperators__EnumerationsAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBoxModelOperatorsAccess().getEnumerationsAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:807:6: ( ( rule__BoxModelOperators__IntConstantsAssignment_1_2 ) )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:807:6: ( ( rule__BoxModelOperators__IntConstantsAssignment_1_2 ) )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:808:1: ( rule__BoxModelOperators__IntConstantsAssignment_1_2 )
                    {
                     before(grammarAccess.getBoxModelOperatorsAccess().getIntConstantsAssignment_1_2()); 
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:809:1: ( rule__BoxModelOperators__IntConstantsAssignment_1_2 )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:809:2: rule__BoxModelOperators__IntConstantsAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__BoxModelOperators__IntConstantsAssignment_1_2_in_rule__BoxModelOperators__Alternatives_11668);
                    rule__BoxModelOperators__IntConstantsAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getBoxModelOperatorsAccess().getIntConstantsAssignment_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:813:6: ( ( rule__BoxModelOperators__StringConstantsAssignment_1_3 ) )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:813:6: ( ( rule__BoxModelOperators__StringConstantsAssignment_1_3 ) )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:814:1: ( rule__BoxModelOperators__StringConstantsAssignment_1_3 )
                    {
                     before(grammarAccess.getBoxModelOperatorsAccess().getStringConstantsAssignment_1_3()); 
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:815:1: ( rule__BoxModelOperators__StringConstantsAssignment_1_3 )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:815:2: rule__BoxModelOperators__StringConstantsAssignment_1_3
                    {
                    pushFollow(FOLLOW_rule__BoxModelOperators__StringConstantsAssignment_1_3_in_rule__BoxModelOperators__Alternatives_11686);
                    rule__BoxModelOperators__StringConstantsAssignment_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getBoxModelOperatorsAccess().getStringConstantsAssignment_1_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxModelOperators__Alternatives_1"


    // $ANTLR start "rule__StringConstant__Alternatives_0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:824:1: rule__StringConstant__Alternatives_0 : ( ( 'string' ) | ( 'str' ) );
    public final void rule__StringConstant__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:828:1: ( ( 'string' ) | ( 'str' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:829:1: ( 'string' )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:829:1: ( 'string' )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:830:1: 'string'
                    {
                     before(grammarAccess.getStringConstantAccess().getStringKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__StringConstant__Alternatives_01720); 
                     after(grammarAccess.getStringConstantAccess().getStringKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:837:6: ( 'str' )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:837:6: ( 'str' )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:838:1: 'str'
                    {
                     before(grammarAccess.getStringConstantAccess().getStrKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__StringConstant__Alternatives_01740); 
                     after(grammarAccess.getStringConstantAccess().getStrKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstant__Alternatives_0"


    // $ANTLR start "rule__IntConstant__Alternatives_0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:850:1: rule__IntConstant__Alternatives_0 : ( ( 'integer' ) | ( 'int' ) );
    public final void rule__IntConstant__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:854:1: ( ( 'integer' ) | ( 'int' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:855:1: ( 'integer' )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:855:1: ( 'integer' )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:856:1: 'integer'
                    {
                     before(grammarAccess.getIntConstantAccess().getIntegerKeyword_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__IntConstant__Alternatives_01775); 
                     after(grammarAccess.getIntConstantAccess().getIntegerKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:863:6: ( 'int' )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:863:6: ( 'int' )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:864:1: 'int'
                    {
                     before(grammarAccess.getIntConstantAccess().getIntKeyword_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__IntConstant__Alternatives_01795); 
                     after(grammarAccess.getIntConstantAccess().getIntKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntConstant__Alternatives_0"


    // $ANTLR start "rule__OperatorDefinition__Alternatives"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:876:1: rule__OperatorDefinition__Alternatives : ( ( ruleBasicOperatorDefinition ) | ( ruleAliasOperatorDefinition ) );
    public final void rule__OperatorDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:880:1: ( ( ruleBasicOperatorDefinition ) | ( ruleAliasOperatorDefinition ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=15 && LA4_0<=20)) ) {
                alt4=1;
            }
            else if ( (LA4_0==28) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:881:1: ( ruleBasicOperatorDefinition )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:881:1: ( ruleBasicOperatorDefinition )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:882:1: ruleBasicOperatorDefinition
                    {
                     before(grammarAccess.getOperatorDefinitionAccess().getBasicOperatorDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBasicOperatorDefinition_in_rule__OperatorDefinition__Alternatives1829);
                    ruleBasicOperatorDefinition();

                    state._fsp--;

                     after(grammarAccess.getOperatorDefinitionAccess().getBasicOperatorDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:887:6: ( ruleAliasOperatorDefinition )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:887:6: ( ruleAliasOperatorDefinition )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:888:1: ruleAliasOperatorDefinition
                    {
                     before(grammarAccess.getOperatorDefinitionAccess().getAliasOperatorDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAliasOperatorDefinition_in_rule__OperatorDefinition__Alternatives1846);
                    ruleAliasOperatorDefinition();

                    state._fsp--;

                     after(grammarAccess.getOperatorDefinitionAccess().getAliasOperatorDefinitionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatorDefinition__Alternatives"


    // $ANTLR start "rule__BasicOperatorDefinition__Alternatives_0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:898:1: rule__BasicOperatorDefinition__Alternatives_0 : ( ( ruleHighlightOperatorDefinition ) | ( rulePositionalOperatorDefinition ) | ( ruleTransformingOperatorDefinition ) );
    public final void rule__BasicOperatorDefinition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:902:1: ( ( ruleHighlightOperatorDefinition ) | ( rulePositionalOperatorDefinition ) | ( ruleTransformingOperatorDefinition ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 17:
            case 18:
                {
                alt5=1;
                }
                break;
            case 15:
            case 16:
                {
                alt5=2;
                }
                break;
            case 19:
            case 20:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:903:1: ( ruleHighlightOperatorDefinition )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:903:1: ( ruleHighlightOperatorDefinition )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:904:1: ruleHighlightOperatorDefinition
                    {
                     before(grammarAccess.getBasicOperatorDefinitionAccess().getHighlightOperatorDefinitionParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleHighlightOperatorDefinition_in_rule__BasicOperatorDefinition__Alternatives_01878);
                    ruleHighlightOperatorDefinition();

                    state._fsp--;

                     after(grammarAccess.getBasicOperatorDefinitionAccess().getHighlightOperatorDefinitionParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:909:6: ( rulePositionalOperatorDefinition )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:909:6: ( rulePositionalOperatorDefinition )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:910:1: rulePositionalOperatorDefinition
                    {
                     before(grammarAccess.getBasicOperatorDefinitionAccess().getPositionalOperatorDefinitionParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_rulePositionalOperatorDefinition_in_rule__BasicOperatorDefinition__Alternatives_01895);
                    rulePositionalOperatorDefinition();

                    state._fsp--;

                     after(grammarAccess.getBasicOperatorDefinitionAccess().getPositionalOperatorDefinitionParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:915:6: ( ruleTransformingOperatorDefinition )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:915:6: ( ruleTransformingOperatorDefinition )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:916:1: ruleTransformingOperatorDefinition
                    {
                     before(grammarAccess.getBasicOperatorDefinitionAccess().getTransformingOperatorDefinitionParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleTransformingOperatorDefinition_in_rule__BasicOperatorDefinition__Alternatives_01912);
                    ruleTransformingOperatorDefinition();

                    state._fsp--;

                     after(grammarAccess.getBasicOperatorDefinitionAccess().getTransformingOperatorDefinitionParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicOperatorDefinition__Alternatives_0"


    // $ANTLR start "rule__PositionalOperatorDefinition__Alternatives_1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:926:1: rule__PositionalOperatorDefinition__Alternatives_1 : ( ( 'pop' ) | ( 'poperator' ) );
    public final void rule__PositionalOperatorDefinition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:930:1: ( ( 'pop' ) | ( 'poperator' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:931:1: ( 'pop' )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:931:1: ( 'pop' )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:932:1: 'pop'
                    {
                     before(grammarAccess.getPositionalOperatorDefinitionAccess().getPopKeyword_1_0()); 
                    match(input,15,FOLLOW_15_in_rule__PositionalOperatorDefinition__Alternatives_11945); 
                     after(grammarAccess.getPositionalOperatorDefinitionAccess().getPopKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:939:6: ( 'poperator' )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:939:6: ( 'poperator' )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:940:1: 'poperator'
                    {
                     before(grammarAccess.getPositionalOperatorDefinitionAccess().getPoperatorKeyword_1_1()); 
                    match(input,16,FOLLOW_16_in_rule__PositionalOperatorDefinition__Alternatives_11965); 
                     after(grammarAccess.getPositionalOperatorDefinitionAccess().getPoperatorKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionalOperatorDefinition__Alternatives_1"


    // $ANTLR start "rule__HighlightOperatorDefinition__Alternatives_1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:952:1: rule__HighlightOperatorDefinition__Alternatives_1 : ( ( 'hlop' ) | ( 'hloperator' ) );
    public final void rule__HighlightOperatorDefinition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:956:1: ( ( 'hlop' ) | ( 'hloperator' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:957:1: ( 'hlop' )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:957:1: ( 'hlop' )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:958:1: 'hlop'
                    {
                     before(grammarAccess.getHighlightOperatorDefinitionAccess().getHlopKeyword_1_0()); 
                    match(input,17,FOLLOW_17_in_rule__HighlightOperatorDefinition__Alternatives_12000); 
                     after(grammarAccess.getHighlightOperatorDefinitionAccess().getHlopKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:965:6: ( 'hloperator' )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:965:6: ( 'hloperator' )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:966:1: 'hloperator'
                    {
                     before(grammarAccess.getHighlightOperatorDefinitionAccess().getHloperatorKeyword_1_1()); 
                    match(input,18,FOLLOW_18_in_rule__HighlightOperatorDefinition__Alternatives_12020); 
                     after(grammarAccess.getHighlightOperatorDefinitionAccess().getHloperatorKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighlightOperatorDefinition__Alternatives_1"


    // $ANTLR start "rule__TransformingOperatorDefinition__Alternatives_1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:978:1: rule__TransformingOperatorDefinition__Alternatives_1 : ( ( 'top' ) | ( 'toperator' ) );
    public final void rule__TransformingOperatorDefinition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:982:1: ( ( 'top' ) | ( 'toperator' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:983:1: ( 'top' )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:983:1: ( 'top' )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:984:1: 'top'
                    {
                     before(grammarAccess.getTransformingOperatorDefinitionAccess().getTopKeyword_1_0()); 
                    match(input,19,FOLLOW_19_in_rule__TransformingOperatorDefinition__Alternatives_12055); 
                     after(grammarAccess.getTransformingOperatorDefinitionAccess().getTopKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:991:6: ( 'toperator' )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:991:6: ( 'toperator' )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:992:1: 'toperator'
                    {
                     before(grammarAccess.getTransformingOperatorDefinitionAccess().getToperatorKeyword_1_1()); 
                    match(input,20,FOLLOW_20_in_rule__TransformingOperatorDefinition__Alternatives_12075); 
                     after(grammarAccess.getTransformingOperatorDefinitionAccess().getToperatorKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformingOperatorDefinition__Alternatives_1"


    // $ANTLR start "rule__ParameterDefinition__Alternatives"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1004:1: rule__ParameterDefinition__Alternatives : ( ( ruleStringParameterDefinition ) | ( ruleIntParameterDefinition ) | ( ruleEnumParameterDefinition ) );
    public final void rule__ParameterDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1008:1: ( ( ruleStringParameterDefinition ) | ( ruleIntParameterDefinition ) | ( ruleEnumParameterDefinition ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
                {
                alt9=1;
                }
                break;
            case 13:
            case 14:
                {
                alt9=2;
                }
                break;
            case 29:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1009:1: ( ruleStringParameterDefinition )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1009:1: ( ruleStringParameterDefinition )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1010:1: ruleStringParameterDefinition
                    {
                     before(grammarAccess.getParameterDefinitionAccess().getStringParameterDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringParameterDefinition_in_rule__ParameterDefinition__Alternatives2109);
                    ruleStringParameterDefinition();

                    state._fsp--;

                     after(grammarAccess.getParameterDefinitionAccess().getStringParameterDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1015:6: ( ruleIntParameterDefinition )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1015:6: ( ruleIntParameterDefinition )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1016:1: ruleIntParameterDefinition
                    {
                     before(grammarAccess.getParameterDefinitionAccess().getIntParameterDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntParameterDefinition_in_rule__ParameterDefinition__Alternatives2126);
                    ruleIntParameterDefinition();

                    state._fsp--;

                     after(grammarAccess.getParameterDefinitionAccess().getIntParameterDefinitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1021:6: ( ruleEnumParameterDefinition )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1021:6: ( ruleEnumParameterDefinition )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1022:1: ruleEnumParameterDefinition
                    {
                     before(grammarAccess.getParameterDefinitionAccess().getEnumParameterDefinitionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnumParameterDefinition_in_rule__ParameterDefinition__Alternatives2143);
                    ruleEnumParameterDefinition();

                    state._fsp--;

                     after(grammarAccess.getParameterDefinitionAccess().getEnumParameterDefinitionParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDefinition__Alternatives"


    // $ANTLR start "rule__StringParameterDefinition__Alternatives_0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1032:1: rule__StringParameterDefinition__Alternatives_0 : ( ( 'string' ) | ( 'str' ) );
    public final void rule__StringParameterDefinition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1036:1: ( ( 'string' ) | ( 'str' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            else if ( (LA10_0==12) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1037:1: ( 'string' )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1037:1: ( 'string' )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1038:1: 'string'
                    {
                     before(grammarAccess.getStringParameterDefinitionAccess().getStringKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__StringParameterDefinition__Alternatives_02176); 
                     after(grammarAccess.getStringParameterDefinitionAccess().getStringKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1045:6: ( 'str' )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1045:6: ( 'str' )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1046:1: 'str'
                    {
                     before(grammarAccess.getStringParameterDefinitionAccess().getStrKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__StringParameterDefinition__Alternatives_02196); 
                     after(grammarAccess.getStringParameterDefinitionAccess().getStrKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParameterDefinition__Alternatives_0"


    // $ANTLR start "rule__IntParameterDefinition__Alternatives_0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1058:1: rule__IntParameterDefinition__Alternatives_0 : ( ( 'integer' ) | ( 'int' ) );
    public final void rule__IntParameterDefinition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1062:1: ( ( 'integer' ) | ( 'int' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            else if ( (LA11_0==14) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1063:1: ( 'integer' )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1063:1: ( 'integer' )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1064:1: 'integer'
                    {
                     before(grammarAccess.getIntParameterDefinitionAccess().getIntegerKeyword_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__IntParameterDefinition__Alternatives_02231); 
                     after(grammarAccess.getIntParameterDefinitionAccess().getIntegerKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1071:6: ( 'int' )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1071:6: ( 'int' )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1072:1: 'int'
                    {
                     before(grammarAccess.getIntParameterDefinitionAccess().getIntKeyword_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__IntParameterDefinition__Alternatives_02251); 
                     after(grammarAccess.getIntParameterDefinitionAccess().getIntKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntParameterDefinition__Alternatives_0"


    // $ANTLR start "rule__EnumParameterDefinition__Alternatives_1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1084:1: rule__EnumParameterDefinition__Alternatives_1 : ( ( ( rule__EnumParameterDefinition__Group_1_0__0 ) ) | ( ( rule__EnumParameterDefinition__Group_1_1__0 ) ) );
    public final void rule__EnumParameterDefinition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1088:1: ( ( ( rule__EnumParameterDefinition__Group_1_0__0 ) ) | ( ( rule__EnumParameterDefinition__Group_1_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1089:1: ( ( rule__EnumParameterDefinition__Group_1_0__0 ) )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1089:1: ( ( rule__EnumParameterDefinition__Group_1_0__0 ) )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1090:1: ( rule__EnumParameterDefinition__Group_1_0__0 )
                    {
                     before(grammarAccess.getEnumParameterDefinitionAccess().getGroup_1_0()); 
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1091:1: ( rule__EnumParameterDefinition__Group_1_0__0 )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1091:2: rule__EnumParameterDefinition__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__EnumParameterDefinition__Group_1_0__0_in_rule__EnumParameterDefinition__Alternatives_12285);
                    rule__EnumParameterDefinition__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnumParameterDefinitionAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1095:6: ( ( rule__EnumParameterDefinition__Group_1_1__0 ) )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1095:6: ( ( rule__EnumParameterDefinition__Group_1_1__0 ) )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1096:1: ( rule__EnumParameterDefinition__Group_1_1__0 )
                    {
                     before(grammarAccess.getEnumParameterDefinitionAccess().getGroup_1_1()); 
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1097:1: ( rule__EnumParameterDefinition__Group_1_1__0 )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1097:2: rule__EnumParameterDefinition__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__EnumParameterDefinition__Group_1_1__0_in_rule__EnumParameterDefinition__Alternatives_12303);
                    rule__EnumParameterDefinition__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnumParameterDefinitionAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Alternatives_1"


    // $ANTLR start "rule__StringParameterValue__Alternatives"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1106:1: rule__StringParameterValue__Alternatives : ( ( ruleStringValue ) | ( ruleStringConstantApplication ) );
    public final void rule__StringParameterValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1110:1: ( ( ruleStringValue ) | ( ruleStringConstantApplication ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1111:1: ( ruleStringValue )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1111:1: ( ruleStringValue )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1112:1: ruleStringValue
                    {
                     before(grammarAccess.getStringParameterValueAccess().getStringValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__StringParameterValue__Alternatives2336);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getStringParameterValueAccess().getStringValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1117:6: ( ruleStringConstantApplication )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1117:6: ( ruleStringConstantApplication )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1118:1: ruleStringConstantApplication
                    {
                     before(grammarAccess.getStringParameterValueAccess().getStringConstantApplicationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringConstantApplication_in_rule__StringParameterValue__Alternatives2353);
                    ruleStringConstantApplication();

                    state._fsp--;

                     after(grammarAccess.getStringParameterValueAccess().getStringConstantApplicationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParameterValue__Alternatives"


    // $ANTLR start "rule__ParameterApplicationValue__Alternatives"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1128:1: rule__ParameterApplicationValue__Alternatives : ( ( ruleStringValue ) | ( ruleIntValue ) | ( ruleConstantReferenceValue ) );
    public final void rule__ParameterApplicationValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1132:1: ( ( ruleStringValue ) | ( ruleIntValue ) | ( ruleConstantReferenceValue ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt14=1;
                }
                break;
            case RULE_INT:
                {
                alt14=2;
                }
                break;
            case RULE_ID:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1133:1: ( ruleStringValue )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1133:1: ( ruleStringValue )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1134:1: ruleStringValue
                    {
                     before(grammarAccess.getParameterApplicationValueAccess().getStringValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__ParameterApplicationValue__Alternatives2385);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getParameterApplicationValueAccess().getStringValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1139:6: ( ruleIntValue )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1139:6: ( ruleIntValue )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1140:1: ruleIntValue
                    {
                     before(grammarAccess.getParameterApplicationValueAccess().getIntValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntValue_in_rule__ParameterApplicationValue__Alternatives2402);
                    ruleIntValue();

                    state._fsp--;

                     after(grammarAccess.getParameterApplicationValueAccess().getIntValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1145:6: ( ruleConstantReferenceValue )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1145:6: ( ruleConstantReferenceValue )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1146:1: ruleConstantReferenceValue
                    {
                     before(grammarAccess.getParameterApplicationValueAccess().getConstantReferenceValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleConstantReferenceValue_in_rule__ParameterApplicationValue__Alternatives2419);
                    ruleConstantReferenceValue();

                    state._fsp--;

                     after(grammarAccess.getParameterApplicationValueAccess().getConstantReferenceValueParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterApplicationValue__Alternatives"


    // $ANTLR start "rule__IntParameterValue__Alternatives"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1157:1: rule__IntParameterValue__Alternatives : ( ( ruleIntValue ) | ( ruleIntConstantApplication ) );
    public final void rule__IntParameterValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1161:1: ( ( ruleIntValue ) | ( ruleIntConstantApplication ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1162:1: ( ruleIntValue )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1162:1: ( ruleIntValue )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1163:1: ruleIntValue
                    {
                     before(grammarAccess.getIntParameterValueAccess().getIntValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntValue_in_rule__IntParameterValue__Alternatives2452);
                    ruleIntValue();

                    state._fsp--;

                     after(grammarAccess.getIntParameterValueAccess().getIntValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1168:6: ( ruleIntConstantApplication )
                    {
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1168:6: ( ruleIntConstantApplication )
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1169:1: ruleIntConstantApplication
                    {
                     before(grammarAccess.getIntParameterValueAccess().getIntConstantApplicationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntConstantApplication_in_rule__IntParameterValue__Alternatives2469);
                    ruleIntConstantApplication();

                    state._fsp--;

                     after(grammarAccess.getIntParameterValueAccess().getIntConstantApplicationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntParameterValue__Alternatives"


    // $ANTLR start "rule__BoxModelOperators__Group__0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1181:1: rule__BoxModelOperators__Group__0 : rule__BoxModelOperators__Group__0__Impl rule__BoxModelOperators__Group__1 ;
    public final void rule__BoxModelOperators__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1185:1: ( rule__BoxModelOperators__Group__0__Impl rule__BoxModelOperators__Group__1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1186:2: rule__BoxModelOperators__Group__0__Impl rule__BoxModelOperators__Group__1
            {
            pushFollow(FOLLOW_rule__BoxModelOperators__Group__0__Impl_in_rule__BoxModelOperators__Group__02499);
            rule__BoxModelOperators__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoxModelOperators__Group__1_in_rule__BoxModelOperators__Group__02502);
            rule__BoxModelOperators__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxModelOperators__Group__0"


    // $ANTLR start "rule__BoxModelOperators__Group__0__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1193:1: rule__BoxModelOperators__Group__0__Impl : ( ( rule__BoxModelOperators__ImportsAssignment_0 )* ) ;
    public final void rule__BoxModelOperators__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1197:1: ( ( ( rule__BoxModelOperators__ImportsAssignment_0 )* ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1198:1: ( ( rule__BoxModelOperators__ImportsAssignment_0 )* )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1198:1: ( ( rule__BoxModelOperators__ImportsAssignment_0 )* )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1199:1: ( rule__BoxModelOperators__ImportsAssignment_0 )*
            {
             before(grammarAccess.getBoxModelOperatorsAccess().getImportsAssignment_0()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1200:1: ( rule__BoxModelOperators__ImportsAssignment_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1200:2: rule__BoxModelOperators__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__BoxModelOperators__ImportsAssignment_0_in_rule__BoxModelOperators__Group__0__Impl2529);
            	    rule__BoxModelOperators__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getBoxModelOperatorsAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxModelOperators__Group__0__Impl"


    // $ANTLR start "rule__BoxModelOperators__Group__1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1210:1: rule__BoxModelOperators__Group__1 : rule__BoxModelOperators__Group__1__Impl ;
    public final void rule__BoxModelOperators__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1214:1: ( rule__BoxModelOperators__Group__1__Impl )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1215:2: rule__BoxModelOperators__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BoxModelOperators__Group__1__Impl_in_rule__BoxModelOperators__Group__12560);
            rule__BoxModelOperators__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxModelOperators__Group__1"


    // $ANTLR start "rule__BoxModelOperators__Group__1__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1221:1: rule__BoxModelOperators__Group__1__Impl : ( ( rule__BoxModelOperators__Alternatives_1 )* ) ;
    public final void rule__BoxModelOperators__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1225:1: ( ( ( rule__BoxModelOperators__Alternatives_1 )* ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1226:1: ( ( rule__BoxModelOperators__Alternatives_1 )* )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1226:1: ( ( rule__BoxModelOperators__Alternatives_1 )* )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1227:1: ( rule__BoxModelOperators__Alternatives_1 )*
            {
             before(grammarAccess.getBoxModelOperatorsAccess().getAlternatives_1()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1228:1: ( rule__BoxModelOperators__Alternatives_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=11 && LA17_0<=20)||LA17_0==28||LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1228:2: rule__BoxModelOperators__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__BoxModelOperators__Alternatives_1_in_rule__BoxModelOperators__Group__1__Impl2587);
            	    rule__BoxModelOperators__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getBoxModelOperatorsAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxModelOperators__Group__1__Impl"


    // $ANTLR start "rule__StringConstant__Group__0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1242:1: rule__StringConstant__Group__0 : rule__StringConstant__Group__0__Impl rule__StringConstant__Group__1 ;
    public final void rule__StringConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1246:1: ( rule__StringConstant__Group__0__Impl rule__StringConstant__Group__1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1247:2: rule__StringConstant__Group__0__Impl rule__StringConstant__Group__1
            {
            pushFollow(FOLLOW_rule__StringConstant__Group__0__Impl_in_rule__StringConstant__Group__02622);
            rule__StringConstant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringConstant__Group__1_in_rule__StringConstant__Group__02625);
            rule__StringConstant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstant__Group__0"


    // $ANTLR start "rule__StringConstant__Group__0__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1254:1: rule__StringConstant__Group__0__Impl : ( ( rule__StringConstant__Alternatives_0 ) ) ;
    public final void rule__StringConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1258:1: ( ( ( rule__StringConstant__Alternatives_0 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1259:1: ( ( rule__StringConstant__Alternatives_0 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1259:1: ( ( rule__StringConstant__Alternatives_0 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1260:1: ( rule__StringConstant__Alternatives_0 )
            {
             before(grammarAccess.getStringConstantAccess().getAlternatives_0()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1261:1: ( rule__StringConstant__Alternatives_0 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1261:2: rule__StringConstant__Alternatives_0
            {
            pushFollow(FOLLOW_rule__StringConstant__Alternatives_0_in_rule__StringConstant__Group__0__Impl2652);
            rule__StringConstant__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getStringConstantAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstant__Group__0__Impl"


    // $ANTLR start "rule__StringConstant__Group__1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1271:1: rule__StringConstant__Group__1 : rule__StringConstant__Group__1__Impl rule__StringConstant__Group__2 ;
    public final void rule__StringConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1275:1: ( rule__StringConstant__Group__1__Impl rule__StringConstant__Group__2 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1276:2: rule__StringConstant__Group__1__Impl rule__StringConstant__Group__2
            {
            pushFollow(FOLLOW_rule__StringConstant__Group__1__Impl_in_rule__StringConstant__Group__12682);
            rule__StringConstant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringConstant__Group__2_in_rule__StringConstant__Group__12685);
            rule__StringConstant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstant__Group__1"


    // $ANTLR start "rule__StringConstant__Group__1__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1283:1: rule__StringConstant__Group__1__Impl : ( ( rule__StringConstant__NameAssignment_1 ) ) ;
    public final void rule__StringConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1287:1: ( ( ( rule__StringConstant__NameAssignment_1 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1288:1: ( ( rule__StringConstant__NameAssignment_1 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1288:1: ( ( rule__StringConstant__NameAssignment_1 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1289:1: ( rule__StringConstant__NameAssignment_1 )
            {
             before(grammarAccess.getStringConstantAccess().getNameAssignment_1()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1290:1: ( rule__StringConstant__NameAssignment_1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1290:2: rule__StringConstant__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StringConstant__NameAssignment_1_in_rule__StringConstant__Group__1__Impl2712);
            rule__StringConstant__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringConstantAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstant__Group__1__Impl"


    // $ANTLR start "rule__StringConstant__Group__2"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1300:1: rule__StringConstant__Group__2 : rule__StringConstant__Group__2__Impl rule__StringConstant__Group__3 ;
    public final void rule__StringConstant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1304:1: ( rule__StringConstant__Group__2__Impl rule__StringConstant__Group__3 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1305:2: rule__StringConstant__Group__2__Impl rule__StringConstant__Group__3
            {
            pushFollow(FOLLOW_rule__StringConstant__Group__2__Impl_in_rule__StringConstant__Group__22742);
            rule__StringConstant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringConstant__Group__3_in_rule__StringConstant__Group__22745);
            rule__StringConstant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstant__Group__2"


    // $ANTLR start "rule__StringConstant__Group__2__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1312:1: rule__StringConstant__Group__2__Impl : ( '=' ) ;
    public final void rule__StringConstant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1316:1: ( ( '=' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1317:1: ( '=' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1317:1: ( '=' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1318:1: '='
            {
             before(grammarAccess.getStringConstantAccess().getEqualsSignKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__StringConstant__Group__2__Impl2773); 
             after(grammarAccess.getStringConstantAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstant__Group__2__Impl"


    // $ANTLR start "rule__StringConstant__Group__3"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1331:1: rule__StringConstant__Group__3 : rule__StringConstant__Group__3__Impl ;
    public final void rule__StringConstant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1335:1: ( rule__StringConstant__Group__3__Impl )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1336:2: rule__StringConstant__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StringConstant__Group__3__Impl_in_rule__StringConstant__Group__32804);
            rule__StringConstant__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstant__Group__3"


    // $ANTLR start "rule__StringConstant__Group__3__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1342:1: rule__StringConstant__Group__3__Impl : ( ( rule__StringConstant__ValueAssignment_3 ) ) ;
    public final void rule__StringConstant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1346:1: ( ( ( rule__StringConstant__ValueAssignment_3 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1347:1: ( ( rule__StringConstant__ValueAssignment_3 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1347:1: ( ( rule__StringConstant__ValueAssignment_3 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1348:1: ( rule__StringConstant__ValueAssignment_3 )
            {
             before(grammarAccess.getStringConstantAccess().getValueAssignment_3()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1349:1: ( rule__StringConstant__ValueAssignment_3 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1349:2: rule__StringConstant__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__StringConstant__ValueAssignment_3_in_rule__StringConstant__Group__3__Impl2831);
            rule__StringConstant__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStringConstantAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstant__Group__3__Impl"


    // $ANTLR start "rule__IntConstant__Group__0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1367:1: rule__IntConstant__Group__0 : rule__IntConstant__Group__0__Impl rule__IntConstant__Group__1 ;
    public final void rule__IntConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1371:1: ( rule__IntConstant__Group__0__Impl rule__IntConstant__Group__1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1372:2: rule__IntConstant__Group__0__Impl rule__IntConstant__Group__1
            {
            pushFollow(FOLLOW_rule__IntConstant__Group__0__Impl_in_rule__IntConstant__Group__02869);
            rule__IntConstant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntConstant__Group__1_in_rule__IntConstant__Group__02872);
            rule__IntConstant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntConstant__Group__0"


    // $ANTLR start "rule__IntConstant__Group__0__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1379:1: rule__IntConstant__Group__0__Impl : ( ( rule__IntConstant__Alternatives_0 ) ) ;
    public final void rule__IntConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1383:1: ( ( ( rule__IntConstant__Alternatives_0 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1384:1: ( ( rule__IntConstant__Alternatives_0 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1384:1: ( ( rule__IntConstant__Alternatives_0 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1385:1: ( rule__IntConstant__Alternatives_0 )
            {
             before(grammarAccess.getIntConstantAccess().getAlternatives_0()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1386:1: ( rule__IntConstant__Alternatives_0 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1386:2: rule__IntConstant__Alternatives_0
            {
            pushFollow(FOLLOW_rule__IntConstant__Alternatives_0_in_rule__IntConstant__Group__0__Impl2899);
            rule__IntConstant__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getIntConstantAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntConstant__Group__0__Impl"


    // $ANTLR start "rule__IntConstant__Group__1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1396:1: rule__IntConstant__Group__1 : rule__IntConstant__Group__1__Impl rule__IntConstant__Group__2 ;
    public final void rule__IntConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1400:1: ( rule__IntConstant__Group__1__Impl rule__IntConstant__Group__2 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1401:2: rule__IntConstant__Group__1__Impl rule__IntConstant__Group__2
            {
            pushFollow(FOLLOW_rule__IntConstant__Group__1__Impl_in_rule__IntConstant__Group__12929);
            rule__IntConstant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntConstant__Group__2_in_rule__IntConstant__Group__12932);
            rule__IntConstant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntConstant__Group__1"


    // $ANTLR start "rule__IntConstant__Group__1__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1408:1: rule__IntConstant__Group__1__Impl : ( ( rule__IntConstant__NameAssignment_1 ) ) ;
    public final void rule__IntConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1412:1: ( ( ( rule__IntConstant__NameAssignment_1 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1413:1: ( ( rule__IntConstant__NameAssignment_1 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1413:1: ( ( rule__IntConstant__NameAssignment_1 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1414:1: ( rule__IntConstant__NameAssignment_1 )
            {
             before(grammarAccess.getIntConstantAccess().getNameAssignment_1()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1415:1: ( rule__IntConstant__NameAssignment_1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1415:2: rule__IntConstant__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__IntConstant__NameAssignment_1_in_rule__IntConstant__Group__1__Impl2959);
            rule__IntConstant__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntConstantAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntConstant__Group__1__Impl"


    // $ANTLR start "rule__IntConstant__Group__2"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1425:1: rule__IntConstant__Group__2 : rule__IntConstant__Group__2__Impl rule__IntConstant__Group__3 ;
    public final void rule__IntConstant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1429:1: ( rule__IntConstant__Group__2__Impl rule__IntConstant__Group__3 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1430:2: rule__IntConstant__Group__2__Impl rule__IntConstant__Group__3
            {
            pushFollow(FOLLOW_rule__IntConstant__Group__2__Impl_in_rule__IntConstant__Group__22989);
            rule__IntConstant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntConstant__Group__3_in_rule__IntConstant__Group__22992);
            rule__IntConstant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntConstant__Group__2"


    // $ANTLR start "rule__IntConstant__Group__2__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1437:1: rule__IntConstant__Group__2__Impl : ( '=' ) ;
    public final void rule__IntConstant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1441:1: ( ( '=' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1442:1: ( '=' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1442:1: ( '=' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1443:1: '='
            {
             before(grammarAccess.getIntConstantAccess().getEqualsSignKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__IntConstant__Group__2__Impl3020); 
             after(grammarAccess.getIntConstantAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntConstant__Group__2__Impl"


    // $ANTLR start "rule__IntConstant__Group__3"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1456:1: rule__IntConstant__Group__3 : rule__IntConstant__Group__3__Impl ;
    public final void rule__IntConstant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1460:1: ( rule__IntConstant__Group__3__Impl )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1461:2: rule__IntConstant__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__IntConstant__Group__3__Impl_in_rule__IntConstant__Group__33051);
            rule__IntConstant__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntConstant__Group__3"


    // $ANTLR start "rule__IntConstant__Group__3__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1467:1: rule__IntConstant__Group__3__Impl : ( ( rule__IntConstant__ValueAssignment_3 ) ) ;
    public final void rule__IntConstant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1471:1: ( ( ( rule__IntConstant__ValueAssignment_3 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1472:1: ( ( rule__IntConstant__ValueAssignment_3 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1472:1: ( ( rule__IntConstant__ValueAssignment_3 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1473:1: ( rule__IntConstant__ValueAssignment_3 )
            {
             before(grammarAccess.getIntConstantAccess().getValueAssignment_3()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1474:1: ( rule__IntConstant__ValueAssignment_3 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1474:2: rule__IntConstant__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__IntConstant__ValueAssignment_3_in_rule__IntConstant__Group__3__Impl3078);
            rule__IntConstant__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIntConstantAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntConstant__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1492:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1496:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1497:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03116);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03119);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1504:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1508:1: ( ( 'import' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1509:1: ( 'import' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1509:1: ( 'import' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1510:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Import__Group__0__Impl3147); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1523:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1527:1: ( rule__Import__Group__1__Impl )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1528:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13178);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1534:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1538:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1539:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1539:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1540:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1541:1: ( rule__Import__ImportURIAssignment_1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1541:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl3205);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__OperatorImplementationString__Group__0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1555:1: rule__OperatorImplementationString__Group__0 : rule__OperatorImplementationString__Group__0__Impl rule__OperatorImplementationString__Group__1 ;
    public final void rule__OperatorImplementationString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1559:1: ( rule__OperatorImplementationString__Group__0__Impl rule__OperatorImplementationString__Group__1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1560:2: rule__OperatorImplementationString__Group__0__Impl rule__OperatorImplementationString__Group__1
            {
            pushFollow(FOLLOW_rule__OperatorImplementationString__Group__0__Impl_in_rule__OperatorImplementationString__Group__03239);
            rule__OperatorImplementationString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperatorImplementationString__Group__1_in_rule__OperatorImplementationString__Group__03242);
            rule__OperatorImplementationString__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatorImplementationString__Group__0"


    // $ANTLR start "rule__OperatorImplementationString__Group__0__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1567:1: rule__OperatorImplementationString__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__OperatorImplementationString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1571:1: ( ( RULE_ID ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1572:1: ( RULE_ID )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1572:1: ( RULE_ID )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1573:1: RULE_ID
            {
             before(grammarAccess.getOperatorImplementationStringAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OperatorImplementationString__Group__0__Impl3269); 
             after(grammarAccess.getOperatorImplementationStringAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatorImplementationString__Group__0__Impl"


    // $ANTLR start "rule__OperatorImplementationString__Group__1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1584:1: rule__OperatorImplementationString__Group__1 : rule__OperatorImplementationString__Group__1__Impl ;
    public final void rule__OperatorImplementationString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1588:1: ( rule__OperatorImplementationString__Group__1__Impl )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1589:2: rule__OperatorImplementationString__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OperatorImplementationString__Group__1__Impl_in_rule__OperatorImplementationString__Group__13298);
            rule__OperatorImplementationString__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatorImplementationString__Group__1"


    // $ANTLR start "rule__OperatorImplementationString__Group__1__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1595:1: rule__OperatorImplementationString__Group__1__Impl : ( ( rule__OperatorImplementationString__Group_1__0 )* ) ;
    public final void rule__OperatorImplementationString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1599:1: ( ( ( rule__OperatorImplementationString__Group_1__0 )* ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1600:1: ( ( rule__OperatorImplementationString__Group_1__0 )* )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1600:1: ( ( rule__OperatorImplementationString__Group_1__0 )* )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1601:1: ( rule__OperatorImplementationString__Group_1__0 )*
            {
             before(grammarAccess.getOperatorImplementationStringAccess().getGroup_1()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1602:1: ( rule__OperatorImplementationString__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1602:2: rule__OperatorImplementationString__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OperatorImplementationString__Group_1__0_in_rule__OperatorImplementationString__Group__1__Impl3325);
            	    rule__OperatorImplementationString__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getOperatorImplementationStringAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatorImplementationString__Group__1__Impl"


    // $ANTLR start "rule__OperatorImplementationString__Group_1__0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1616:1: rule__OperatorImplementationString__Group_1__0 : rule__OperatorImplementationString__Group_1__0__Impl rule__OperatorImplementationString__Group_1__1 ;
    public final void rule__OperatorImplementationString__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1620:1: ( rule__OperatorImplementationString__Group_1__0__Impl rule__OperatorImplementationString__Group_1__1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1621:2: rule__OperatorImplementationString__Group_1__0__Impl rule__OperatorImplementationString__Group_1__1
            {
            pushFollow(FOLLOW_rule__OperatorImplementationString__Group_1__0__Impl_in_rule__OperatorImplementationString__Group_1__03360);
            rule__OperatorImplementationString__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperatorImplementationString__Group_1__1_in_rule__OperatorImplementationString__Group_1__03363);
            rule__OperatorImplementationString__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatorImplementationString__Group_1__0"


    // $ANTLR start "rule__OperatorImplementationString__Group_1__0__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1628:1: rule__OperatorImplementationString__Group_1__0__Impl : ( '.' ) ;
    public final void rule__OperatorImplementationString__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1632:1: ( ( '.' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1633:1: ( '.' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1633:1: ( '.' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1634:1: '.'
            {
             before(grammarAccess.getOperatorImplementationStringAccess().getFullStopKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__OperatorImplementationString__Group_1__0__Impl3391); 
             after(grammarAccess.getOperatorImplementationStringAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatorImplementationString__Group_1__0__Impl"


    // $ANTLR start "rule__OperatorImplementationString__Group_1__1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1647:1: rule__OperatorImplementationString__Group_1__1 : rule__OperatorImplementationString__Group_1__1__Impl ;
    public final void rule__OperatorImplementationString__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1651:1: ( rule__OperatorImplementationString__Group_1__1__Impl )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1652:2: rule__OperatorImplementationString__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__OperatorImplementationString__Group_1__1__Impl_in_rule__OperatorImplementationString__Group_1__13422);
            rule__OperatorImplementationString__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatorImplementationString__Group_1__1"


    // $ANTLR start "rule__OperatorImplementationString__Group_1__1__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1658:1: rule__OperatorImplementationString__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__OperatorImplementationString__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1662:1: ( ( RULE_ID ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1663:1: ( RULE_ID )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1663:1: ( RULE_ID )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1664:1: RULE_ID
            {
             before(grammarAccess.getOperatorImplementationStringAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OperatorImplementationString__Group_1__1__Impl3449); 
             after(grammarAccess.getOperatorImplementationStringAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatorImplementationString__Group_1__1__Impl"


    // $ANTLR start "rule__BasicOperatorDefinition__Group__0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1679:1: rule__BasicOperatorDefinition__Group__0 : rule__BasicOperatorDefinition__Group__0__Impl rule__BasicOperatorDefinition__Group__1 ;
    public final void rule__BasicOperatorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1683:1: ( rule__BasicOperatorDefinition__Group__0__Impl rule__BasicOperatorDefinition__Group__1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1684:2: rule__BasicOperatorDefinition__Group__0__Impl rule__BasicOperatorDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__BasicOperatorDefinition__Group__0__Impl_in_rule__BasicOperatorDefinition__Group__03482);
            rule__BasicOperatorDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicOperatorDefinition__Group__1_in_rule__BasicOperatorDefinition__Group__03485);
            rule__BasicOperatorDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicOperatorDefinition__Group__0"


    // $ANTLR start "rule__BasicOperatorDefinition__Group__0__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1691:1: rule__BasicOperatorDefinition__Group__0__Impl : ( ( rule__BasicOperatorDefinition__Alternatives_0 ) ) ;
    public final void rule__BasicOperatorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1695:1: ( ( ( rule__BasicOperatorDefinition__Alternatives_0 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1696:1: ( ( rule__BasicOperatorDefinition__Alternatives_0 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1696:1: ( ( rule__BasicOperatorDefinition__Alternatives_0 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1697:1: ( rule__BasicOperatorDefinition__Alternatives_0 )
            {
             before(grammarAccess.getBasicOperatorDefinitionAccess().getAlternatives_0()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1698:1: ( rule__BasicOperatorDefinition__Alternatives_0 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1698:2: rule__BasicOperatorDefinition__Alternatives_0
            {
            pushFollow(FOLLOW_rule__BasicOperatorDefinition__Alternatives_0_in_rule__BasicOperatorDefinition__Group__0__Impl3512);
            rule__BasicOperatorDefinition__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicOperatorDefinitionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicOperatorDefinition__Group__0__Impl"


    // $ANTLR start "rule__BasicOperatorDefinition__Group__1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1708:1: rule__BasicOperatorDefinition__Group__1 : rule__BasicOperatorDefinition__Group__1__Impl rule__BasicOperatorDefinition__Group__2 ;
    public final void rule__BasicOperatorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1712:1: ( rule__BasicOperatorDefinition__Group__1__Impl rule__BasicOperatorDefinition__Group__2 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1713:2: rule__BasicOperatorDefinition__Group__1__Impl rule__BasicOperatorDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__BasicOperatorDefinition__Group__1__Impl_in_rule__BasicOperatorDefinition__Group__13542);
            rule__BasicOperatorDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicOperatorDefinition__Group__2_in_rule__BasicOperatorDefinition__Group__13545);
            rule__BasicOperatorDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicOperatorDefinition__Group__1"


    // $ANTLR start "rule__BasicOperatorDefinition__Group__1__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1720:1: rule__BasicOperatorDefinition__Group__1__Impl : ( ( rule__BasicOperatorDefinition__NameAssignment_1 ) ) ;
    public final void rule__BasicOperatorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1724:1: ( ( ( rule__BasicOperatorDefinition__NameAssignment_1 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1725:1: ( ( rule__BasicOperatorDefinition__NameAssignment_1 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1725:1: ( ( rule__BasicOperatorDefinition__NameAssignment_1 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1726:1: ( rule__BasicOperatorDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getBasicOperatorDefinitionAccess().getNameAssignment_1()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1727:1: ( rule__BasicOperatorDefinition__NameAssignment_1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1727:2: rule__BasicOperatorDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BasicOperatorDefinition__NameAssignment_1_in_rule__BasicOperatorDefinition__Group__1__Impl3572);
            rule__BasicOperatorDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicOperatorDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicOperatorDefinition__Group__1__Impl"


    // $ANTLR start "rule__BasicOperatorDefinition__Group__2"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1737:1: rule__BasicOperatorDefinition__Group__2 : rule__BasicOperatorDefinition__Group__2__Impl rule__BasicOperatorDefinition__Group__3 ;
    public final void rule__BasicOperatorDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1741:1: ( rule__BasicOperatorDefinition__Group__2__Impl rule__BasicOperatorDefinition__Group__3 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1742:2: rule__BasicOperatorDefinition__Group__2__Impl rule__BasicOperatorDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__BasicOperatorDefinition__Group__2__Impl_in_rule__BasicOperatorDefinition__Group__23602);
            rule__BasicOperatorDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicOperatorDefinition__Group__3_in_rule__BasicOperatorDefinition__Group__23605);
            rule__BasicOperatorDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicOperatorDefinition__Group__2"


    // $ANTLR start "rule__BasicOperatorDefinition__Group__2__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1749:1: rule__BasicOperatorDefinition__Group__2__Impl : ( '[' ) ;
    public final void rule__BasicOperatorDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1753:1: ( ( '[' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1754:1: ( '[' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1754:1: ( '[' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1755:1: '['
            {
             before(grammarAccess.getBasicOperatorDefinitionAccess().getLeftSquareBracketKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__BasicOperatorDefinition__Group__2__Impl3633); 
             after(grammarAccess.getBasicOperatorDefinitionAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicOperatorDefinition__Group__2__Impl"


    // $ANTLR start "rule__BasicOperatorDefinition__Group__3"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1768:1: rule__BasicOperatorDefinition__Group__3 : rule__BasicOperatorDefinition__Group__3__Impl rule__BasicOperatorDefinition__Group__4 ;
    public final void rule__BasicOperatorDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1772:1: ( rule__BasicOperatorDefinition__Group__3__Impl rule__BasicOperatorDefinition__Group__4 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1773:2: rule__BasicOperatorDefinition__Group__3__Impl rule__BasicOperatorDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__BasicOperatorDefinition__Group__3__Impl_in_rule__BasicOperatorDefinition__Group__33664);
            rule__BasicOperatorDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicOperatorDefinition__Group__4_in_rule__BasicOperatorDefinition__Group__33667);
            rule__BasicOperatorDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicOperatorDefinition__Group__3"


    // $ANTLR start "rule__BasicOperatorDefinition__Group__3__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1780:1: rule__BasicOperatorDefinition__Group__3__Impl : ( ( rule__BasicOperatorDefinition__ImplementationAssignment_3 ) ) ;
    public final void rule__BasicOperatorDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1784:1: ( ( ( rule__BasicOperatorDefinition__ImplementationAssignment_3 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1785:1: ( ( rule__BasicOperatorDefinition__ImplementationAssignment_3 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1785:1: ( ( rule__BasicOperatorDefinition__ImplementationAssignment_3 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1786:1: ( rule__BasicOperatorDefinition__ImplementationAssignment_3 )
            {
             before(grammarAccess.getBasicOperatorDefinitionAccess().getImplementationAssignment_3()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1787:1: ( rule__BasicOperatorDefinition__ImplementationAssignment_3 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1787:2: rule__BasicOperatorDefinition__ImplementationAssignment_3
            {
            pushFollow(FOLLOW_rule__BasicOperatorDefinition__ImplementationAssignment_3_in_rule__BasicOperatorDefinition__Group__3__Impl3694);
            rule__BasicOperatorDefinition__ImplementationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBasicOperatorDefinitionAccess().getImplementationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicOperatorDefinition__Group__3__Impl"


    // $ANTLR start "rule__BasicOperatorDefinition__Group__4"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1797:1: rule__BasicOperatorDefinition__Group__4 : rule__BasicOperatorDefinition__Group__4__Impl rule__BasicOperatorDefinition__Group__5 ;
    public final void rule__BasicOperatorDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1801:1: ( rule__BasicOperatorDefinition__Group__4__Impl rule__BasicOperatorDefinition__Group__5 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1802:2: rule__BasicOperatorDefinition__Group__4__Impl rule__BasicOperatorDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__BasicOperatorDefinition__Group__4__Impl_in_rule__BasicOperatorDefinition__Group__43724);
            rule__BasicOperatorDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicOperatorDefinition__Group__5_in_rule__BasicOperatorDefinition__Group__43727);
            rule__BasicOperatorDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicOperatorDefinition__Group__4"


    // $ANTLR start "rule__BasicOperatorDefinition__Group__4__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1809:1: rule__BasicOperatorDefinition__Group__4__Impl : ( ']' ) ;
    public final void rule__BasicOperatorDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1813:1: ( ( ']' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1814:1: ( ']' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1814:1: ( ']' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1815:1: ']'
            {
             before(grammarAccess.getBasicOperatorDefinitionAccess().getRightSquareBracketKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__BasicOperatorDefinition__Group__4__Impl3755); 
             after(grammarAccess.getBasicOperatorDefinitionAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicOperatorDefinition__Group__4__Impl"


    // $ANTLR start "rule__BasicOperatorDefinition__Group__5"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1828:1: rule__BasicOperatorDefinition__Group__5 : rule__BasicOperatorDefinition__Group__5__Impl rule__BasicOperatorDefinition__Group__6 ;
    public final void rule__BasicOperatorDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1832:1: ( rule__BasicOperatorDefinition__Group__5__Impl rule__BasicOperatorDefinition__Group__6 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1833:2: rule__BasicOperatorDefinition__Group__5__Impl rule__BasicOperatorDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__BasicOperatorDefinition__Group__5__Impl_in_rule__BasicOperatorDefinition__Group__53786);
            rule__BasicOperatorDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicOperatorDefinition__Group__6_in_rule__BasicOperatorDefinition__Group__53789);
            rule__BasicOperatorDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicOperatorDefinition__Group__5"


    // $ANTLR start "rule__BasicOperatorDefinition__Group__5__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1840:1: rule__BasicOperatorDefinition__Group__5__Impl : ( ( rule__BasicOperatorDefinition__Group_5__0 )? ) ;
    public final void rule__BasicOperatorDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1844:1: ( ( ( rule__BasicOperatorDefinition__Group_5__0 )? ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1845:1: ( ( rule__BasicOperatorDefinition__Group_5__0 )? )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1845:1: ( ( rule__BasicOperatorDefinition__Group_5__0 )? )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1846:1: ( rule__BasicOperatorDefinition__Group_5__0 )?
            {
             before(grammarAccess.getBasicOperatorDefinitionAccess().getGroup_5()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1847:1: ( rule__BasicOperatorDefinition__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1847:2: rule__BasicOperatorDefinition__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__BasicOperatorDefinition__Group_5__0_in_rule__BasicOperatorDefinition__Group__5__Impl3816);
                    rule__BasicOperatorDefinition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicOperatorDefinitionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicOperatorDefinition__Group__5__Impl"


    // $ANTLR start "rule__BasicOperatorDefinition__Group__6"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1857:1: rule__BasicOperatorDefinition__Group__6 : rule__BasicOperatorDefinition__Group__6__Impl ;
    public final void rule__BasicOperatorDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1861:1: ( rule__BasicOperatorDefinition__Group__6__Impl )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1862:2: rule__BasicOperatorDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__BasicOperatorDefinition__Group__6__Impl_in_rule__BasicOperatorDefinition__Group__63847);
            rule__BasicOperatorDefinition__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicOperatorDefinition__Group__6"


    // $ANTLR start "rule__BasicOperatorDefinition__Group__6__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1868:1: rule__BasicOperatorDefinition__Group__6__Impl : ( ';' ) ;
    public final void rule__BasicOperatorDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1872:1: ( ( ';' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1873:1: ( ';' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1873:1: ( ';' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1874:1: ';'
            {
             before(grammarAccess.getBasicOperatorDefinitionAccess().getSemicolonKeyword_6()); 
            match(input,26,FOLLOW_26_in_rule__BasicOperatorDefinition__Group__6__Impl3875); 
             after(grammarAccess.getBasicOperatorDefinitionAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicOperatorDefinition__Group__6__Impl"


    // $ANTLR start "rule__BasicOperatorDefinition__Group_5__0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1901:1: rule__BasicOperatorDefinition__Group_5__0 : rule__BasicOperatorDefinition__Group_5__0__Impl rule__BasicOperatorDefinition__Group_5__1 ;
    public final void rule__BasicOperatorDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1905:1: ( rule__BasicOperatorDefinition__Group_5__0__Impl rule__BasicOperatorDefinition__Group_5__1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1906:2: rule__BasicOperatorDefinition__Group_5__0__Impl rule__BasicOperatorDefinition__Group_5__1
            {
            pushFollow(FOLLOW_rule__BasicOperatorDefinition__Group_5__0__Impl_in_rule__BasicOperatorDefinition__Group_5__03920);
            rule__BasicOperatorDefinition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicOperatorDefinition__Group_5__1_in_rule__BasicOperatorDefinition__Group_5__03923);
            rule__BasicOperatorDefinition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicOperatorDefinition__Group_5__0"


    // $ANTLR start "rule__BasicOperatorDefinition__Group_5__0__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1913:1: rule__BasicOperatorDefinition__Group_5__0__Impl : ( ':' ) ;
    public final void rule__BasicOperatorDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1917:1: ( ( ':' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1918:1: ( ':' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1918:1: ( ':' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1919:1: ':'
            {
             before(grammarAccess.getBasicOperatorDefinitionAccess().getColonKeyword_5_0()); 
            match(input,27,FOLLOW_27_in_rule__BasicOperatorDefinition__Group_5__0__Impl3951); 
             after(grammarAccess.getBasicOperatorDefinitionAccess().getColonKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicOperatorDefinition__Group_5__0__Impl"


    // $ANTLR start "rule__BasicOperatorDefinition__Group_5__1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1932:1: rule__BasicOperatorDefinition__Group_5__1 : rule__BasicOperatorDefinition__Group_5__1__Impl ;
    public final void rule__BasicOperatorDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1936:1: ( rule__BasicOperatorDefinition__Group_5__1__Impl )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1937:2: rule__BasicOperatorDefinition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicOperatorDefinition__Group_5__1__Impl_in_rule__BasicOperatorDefinition__Group_5__13982);
            rule__BasicOperatorDefinition__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicOperatorDefinition__Group_5__1"


    // $ANTLR start "rule__BasicOperatorDefinition__Group_5__1__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1943:1: rule__BasicOperatorDefinition__Group_5__1__Impl : ( ( ( rule__BasicOperatorDefinition__ParametersAssignment_5_1 ) ) ( ( rule__BasicOperatorDefinition__ParametersAssignment_5_1 )* ) ) ;
    public final void rule__BasicOperatorDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1947:1: ( ( ( ( rule__BasicOperatorDefinition__ParametersAssignment_5_1 ) ) ( ( rule__BasicOperatorDefinition__ParametersAssignment_5_1 )* ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1948:1: ( ( ( rule__BasicOperatorDefinition__ParametersAssignment_5_1 ) ) ( ( rule__BasicOperatorDefinition__ParametersAssignment_5_1 )* ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1948:1: ( ( ( rule__BasicOperatorDefinition__ParametersAssignment_5_1 ) ) ( ( rule__BasicOperatorDefinition__ParametersAssignment_5_1 )* ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1949:1: ( ( rule__BasicOperatorDefinition__ParametersAssignment_5_1 ) ) ( ( rule__BasicOperatorDefinition__ParametersAssignment_5_1 )* )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1949:1: ( ( rule__BasicOperatorDefinition__ParametersAssignment_5_1 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1950:1: ( rule__BasicOperatorDefinition__ParametersAssignment_5_1 )
            {
             before(grammarAccess.getBasicOperatorDefinitionAccess().getParametersAssignment_5_1()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1951:1: ( rule__BasicOperatorDefinition__ParametersAssignment_5_1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1951:2: rule__BasicOperatorDefinition__ParametersAssignment_5_1
            {
            pushFollow(FOLLOW_rule__BasicOperatorDefinition__ParametersAssignment_5_1_in_rule__BasicOperatorDefinition__Group_5__1__Impl4011);
            rule__BasicOperatorDefinition__ParametersAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicOperatorDefinitionAccess().getParametersAssignment_5_1()); 

            }

            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1954:1: ( ( rule__BasicOperatorDefinition__ParametersAssignment_5_1 )* )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1955:1: ( rule__BasicOperatorDefinition__ParametersAssignment_5_1 )*
            {
             before(grammarAccess.getBasicOperatorDefinitionAccess().getParametersAssignment_5_1()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1956:1: ( rule__BasicOperatorDefinition__ParametersAssignment_5_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=11 && LA20_0<=14)||LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1956:2: rule__BasicOperatorDefinition__ParametersAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__BasicOperatorDefinition__ParametersAssignment_5_1_in_rule__BasicOperatorDefinition__Group_5__1__Impl4023);
            	    rule__BasicOperatorDefinition__ParametersAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getBasicOperatorDefinitionAccess().getParametersAssignment_5_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicOperatorDefinition__Group_5__1__Impl"


    // $ANTLR start "rule__PositionalOperatorDefinition__Group__0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1971:1: rule__PositionalOperatorDefinition__Group__0 : rule__PositionalOperatorDefinition__Group__0__Impl rule__PositionalOperatorDefinition__Group__1 ;
    public final void rule__PositionalOperatorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1975:1: ( rule__PositionalOperatorDefinition__Group__0__Impl rule__PositionalOperatorDefinition__Group__1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1976:2: rule__PositionalOperatorDefinition__Group__0__Impl rule__PositionalOperatorDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__PositionalOperatorDefinition__Group__0__Impl_in_rule__PositionalOperatorDefinition__Group__04060);
            rule__PositionalOperatorDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PositionalOperatorDefinition__Group__1_in_rule__PositionalOperatorDefinition__Group__04063);
            rule__PositionalOperatorDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionalOperatorDefinition__Group__0"


    // $ANTLR start "rule__PositionalOperatorDefinition__Group__0__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1983:1: rule__PositionalOperatorDefinition__Group__0__Impl : ( () ) ;
    public final void rule__PositionalOperatorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1987:1: ( ( () ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1988:1: ( () )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1988:1: ( () )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1989:1: ()
            {
             before(grammarAccess.getPositionalOperatorDefinitionAccess().getPositionalOperatorDefinitionAction_0()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1990:1: ()
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:1992:1: 
            {
            }

             after(grammarAccess.getPositionalOperatorDefinitionAccess().getPositionalOperatorDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionalOperatorDefinition__Group__0__Impl"


    // $ANTLR start "rule__PositionalOperatorDefinition__Group__1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2002:1: rule__PositionalOperatorDefinition__Group__1 : rule__PositionalOperatorDefinition__Group__1__Impl ;
    public final void rule__PositionalOperatorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2006:1: ( rule__PositionalOperatorDefinition__Group__1__Impl )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2007:2: rule__PositionalOperatorDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PositionalOperatorDefinition__Group__1__Impl_in_rule__PositionalOperatorDefinition__Group__14121);
            rule__PositionalOperatorDefinition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionalOperatorDefinition__Group__1"


    // $ANTLR start "rule__PositionalOperatorDefinition__Group__1__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2013:1: rule__PositionalOperatorDefinition__Group__1__Impl : ( ( rule__PositionalOperatorDefinition__Alternatives_1 ) ) ;
    public final void rule__PositionalOperatorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2017:1: ( ( ( rule__PositionalOperatorDefinition__Alternatives_1 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2018:1: ( ( rule__PositionalOperatorDefinition__Alternatives_1 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2018:1: ( ( rule__PositionalOperatorDefinition__Alternatives_1 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2019:1: ( rule__PositionalOperatorDefinition__Alternatives_1 )
            {
             before(grammarAccess.getPositionalOperatorDefinitionAccess().getAlternatives_1()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2020:1: ( rule__PositionalOperatorDefinition__Alternatives_1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2020:2: rule__PositionalOperatorDefinition__Alternatives_1
            {
            pushFollow(FOLLOW_rule__PositionalOperatorDefinition__Alternatives_1_in_rule__PositionalOperatorDefinition__Group__1__Impl4148);
            rule__PositionalOperatorDefinition__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPositionalOperatorDefinitionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionalOperatorDefinition__Group__1__Impl"


    // $ANTLR start "rule__HighlightOperatorDefinition__Group__0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2034:1: rule__HighlightOperatorDefinition__Group__0 : rule__HighlightOperatorDefinition__Group__0__Impl rule__HighlightOperatorDefinition__Group__1 ;
    public final void rule__HighlightOperatorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2038:1: ( rule__HighlightOperatorDefinition__Group__0__Impl rule__HighlightOperatorDefinition__Group__1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2039:2: rule__HighlightOperatorDefinition__Group__0__Impl rule__HighlightOperatorDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__HighlightOperatorDefinition__Group__0__Impl_in_rule__HighlightOperatorDefinition__Group__04182);
            rule__HighlightOperatorDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HighlightOperatorDefinition__Group__1_in_rule__HighlightOperatorDefinition__Group__04185);
            rule__HighlightOperatorDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighlightOperatorDefinition__Group__0"


    // $ANTLR start "rule__HighlightOperatorDefinition__Group__0__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2046:1: rule__HighlightOperatorDefinition__Group__0__Impl : ( () ) ;
    public final void rule__HighlightOperatorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2050:1: ( ( () ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2051:1: ( () )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2051:1: ( () )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2052:1: ()
            {
             before(grammarAccess.getHighlightOperatorDefinitionAccess().getHighlightOperatorDefinitionAction_0()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2053:1: ()
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2055:1: 
            {
            }

             after(grammarAccess.getHighlightOperatorDefinitionAccess().getHighlightOperatorDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighlightOperatorDefinition__Group__0__Impl"


    // $ANTLR start "rule__HighlightOperatorDefinition__Group__1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2065:1: rule__HighlightOperatorDefinition__Group__1 : rule__HighlightOperatorDefinition__Group__1__Impl ;
    public final void rule__HighlightOperatorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2069:1: ( rule__HighlightOperatorDefinition__Group__1__Impl )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2070:2: rule__HighlightOperatorDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__HighlightOperatorDefinition__Group__1__Impl_in_rule__HighlightOperatorDefinition__Group__14243);
            rule__HighlightOperatorDefinition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighlightOperatorDefinition__Group__1"


    // $ANTLR start "rule__HighlightOperatorDefinition__Group__1__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2076:1: rule__HighlightOperatorDefinition__Group__1__Impl : ( ( rule__HighlightOperatorDefinition__Alternatives_1 ) ) ;
    public final void rule__HighlightOperatorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2080:1: ( ( ( rule__HighlightOperatorDefinition__Alternatives_1 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2081:1: ( ( rule__HighlightOperatorDefinition__Alternatives_1 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2081:1: ( ( rule__HighlightOperatorDefinition__Alternatives_1 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2082:1: ( rule__HighlightOperatorDefinition__Alternatives_1 )
            {
             before(grammarAccess.getHighlightOperatorDefinitionAccess().getAlternatives_1()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2083:1: ( rule__HighlightOperatorDefinition__Alternatives_1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2083:2: rule__HighlightOperatorDefinition__Alternatives_1
            {
            pushFollow(FOLLOW_rule__HighlightOperatorDefinition__Alternatives_1_in_rule__HighlightOperatorDefinition__Group__1__Impl4270);
            rule__HighlightOperatorDefinition__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getHighlightOperatorDefinitionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighlightOperatorDefinition__Group__1__Impl"


    // $ANTLR start "rule__TransformingOperatorDefinition__Group__0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2097:1: rule__TransformingOperatorDefinition__Group__0 : rule__TransformingOperatorDefinition__Group__0__Impl rule__TransformingOperatorDefinition__Group__1 ;
    public final void rule__TransformingOperatorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2101:1: ( rule__TransformingOperatorDefinition__Group__0__Impl rule__TransformingOperatorDefinition__Group__1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2102:2: rule__TransformingOperatorDefinition__Group__0__Impl rule__TransformingOperatorDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TransformingOperatorDefinition__Group__0__Impl_in_rule__TransformingOperatorDefinition__Group__04304);
            rule__TransformingOperatorDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TransformingOperatorDefinition__Group__1_in_rule__TransformingOperatorDefinition__Group__04307);
            rule__TransformingOperatorDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformingOperatorDefinition__Group__0"


    // $ANTLR start "rule__TransformingOperatorDefinition__Group__0__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2109:1: rule__TransformingOperatorDefinition__Group__0__Impl : ( () ) ;
    public final void rule__TransformingOperatorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2113:1: ( ( () ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2114:1: ( () )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2114:1: ( () )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2115:1: ()
            {
             before(grammarAccess.getTransformingOperatorDefinitionAccess().getTransformingOperatorDefinitionAction_0()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2116:1: ()
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2118:1: 
            {
            }

             after(grammarAccess.getTransformingOperatorDefinitionAccess().getTransformingOperatorDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformingOperatorDefinition__Group__0__Impl"


    // $ANTLR start "rule__TransformingOperatorDefinition__Group__1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2128:1: rule__TransformingOperatorDefinition__Group__1 : rule__TransformingOperatorDefinition__Group__1__Impl ;
    public final void rule__TransformingOperatorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2132:1: ( rule__TransformingOperatorDefinition__Group__1__Impl )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2133:2: rule__TransformingOperatorDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TransformingOperatorDefinition__Group__1__Impl_in_rule__TransformingOperatorDefinition__Group__14365);
            rule__TransformingOperatorDefinition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformingOperatorDefinition__Group__1"


    // $ANTLR start "rule__TransformingOperatorDefinition__Group__1__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2139:1: rule__TransformingOperatorDefinition__Group__1__Impl : ( ( rule__TransformingOperatorDefinition__Alternatives_1 ) ) ;
    public final void rule__TransformingOperatorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2143:1: ( ( ( rule__TransformingOperatorDefinition__Alternatives_1 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2144:1: ( ( rule__TransformingOperatorDefinition__Alternatives_1 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2144:1: ( ( rule__TransformingOperatorDefinition__Alternatives_1 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2145:1: ( rule__TransformingOperatorDefinition__Alternatives_1 )
            {
             before(grammarAccess.getTransformingOperatorDefinitionAccess().getAlternatives_1()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2146:1: ( rule__TransformingOperatorDefinition__Alternatives_1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2146:2: rule__TransformingOperatorDefinition__Alternatives_1
            {
            pushFollow(FOLLOW_rule__TransformingOperatorDefinition__Alternatives_1_in_rule__TransformingOperatorDefinition__Group__1__Impl4392);
            rule__TransformingOperatorDefinition__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTransformingOperatorDefinitionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformingOperatorDefinition__Group__1__Impl"


    // $ANTLR start "rule__AliasOperatorDefinition__Group__0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2160:1: rule__AliasOperatorDefinition__Group__0 : rule__AliasOperatorDefinition__Group__0__Impl rule__AliasOperatorDefinition__Group__1 ;
    public final void rule__AliasOperatorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2164:1: ( rule__AliasOperatorDefinition__Group__0__Impl rule__AliasOperatorDefinition__Group__1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2165:2: rule__AliasOperatorDefinition__Group__0__Impl rule__AliasOperatorDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__AliasOperatorDefinition__Group__0__Impl_in_rule__AliasOperatorDefinition__Group__04426);
            rule__AliasOperatorDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AliasOperatorDefinition__Group__1_in_rule__AliasOperatorDefinition__Group__04429);
            rule__AliasOperatorDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasOperatorDefinition__Group__0"


    // $ANTLR start "rule__AliasOperatorDefinition__Group__0__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2172:1: rule__AliasOperatorDefinition__Group__0__Impl : ( 'alias' ) ;
    public final void rule__AliasOperatorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2176:1: ( ( 'alias' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2177:1: ( 'alias' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2177:1: ( 'alias' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2178:1: 'alias'
            {
             before(grammarAccess.getAliasOperatorDefinitionAccess().getAliasKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__AliasOperatorDefinition__Group__0__Impl4457); 
             after(grammarAccess.getAliasOperatorDefinitionAccess().getAliasKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasOperatorDefinition__Group__0__Impl"


    // $ANTLR start "rule__AliasOperatorDefinition__Group__1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2191:1: rule__AliasOperatorDefinition__Group__1 : rule__AliasOperatorDefinition__Group__1__Impl rule__AliasOperatorDefinition__Group__2 ;
    public final void rule__AliasOperatorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2195:1: ( rule__AliasOperatorDefinition__Group__1__Impl rule__AliasOperatorDefinition__Group__2 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2196:2: rule__AliasOperatorDefinition__Group__1__Impl rule__AliasOperatorDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__AliasOperatorDefinition__Group__1__Impl_in_rule__AliasOperatorDefinition__Group__14488);
            rule__AliasOperatorDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AliasOperatorDefinition__Group__2_in_rule__AliasOperatorDefinition__Group__14491);
            rule__AliasOperatorDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasOperatorDefinition__Group__1"


    // $ANTLR start "rule__AliasOperatorDefinition__Group__1__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2203:1: rule__AliasOperatorDefinition__Group__1__Impl : ( ( rule__AliasOperatorDefinition__NameAssignment_1 ) ) ;
    public final void rule__AliasOperatorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2207:1: ( ( ( rule__AliasOperatorDefinition__NameAssignment_1 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2208:1: ( ( rule__AliasOperatorDefinition__NameAssignment_1 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2208:1: ( ( rule__AliasOperatorDefinition__NameAssignment_1 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2209:1: ( rule__AliasOperatorDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getAliasOperatorDefinitionAccess().getNameAssignment_1()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2210:1: ( rule__AliasOperatorDefinition__NameAssignment_1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2210:2: rule__AliasOperatorDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AliasOperatorDefinition__NameAssignment_1_in_rule__AliasOperatorDefinition__Group__1__Impl4518);
            rule__AliasOperatorDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAliasOperatorDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasOperatorDefinition__Group__1__Impl"


    // $ANTLR start "rule__AliasOperatorDefinition__Group__2"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2220:1: rule__AliasOperatorDefinition__Group__2 : rule__AliasOperatorDefinition__Group__2__Impl rule__AliasOperatorDefinition__Group__3 ;
    public final void rule__AliasOperatorDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2224:1: ( rule__AliasOperatorDefinition__Group__2__Impl rule__AliasOperatorDefinition__Group__3 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2225:2: rule__AliasOperatorDefinition__Group__2__Impl rule__AliasOperatorDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__AliasOperatorDefinition__Group__2__Impl_in_rule__AliasOperatorDefinition__Group__24548);
            rule__AliasOperatorDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AliasOperatorDefinition__Group__3_in_rule__AliasOperatorDefinition__Group__24551);
            rule__AliasOperatorDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasOperatorDefinition__Group__2"


    // $ANTLR start "rule__AliasOperatorDefinition__Group__2__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2232:1: rule__AliasOperatorDefinition__Group__2__Impl : ( '[' ) ;
    public final void rule__AliasOperatorDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2236:1: ( ( '[' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2237:1: ( '[' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2237:1: ( '[' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2238:1: '['
            {
             before(grammarAccess.getAliasOperatorDefinitionAccess().getLeftSquareBracketKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__AliasOperatorDefinition__Group__2__Impl4579); 
             after(grammarAccess.getAliasOperatorDefinitionAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasOperatorDefinition__Group__2__Impl"


    // $ANTLR start "rule__AliasOperatorDefinition__Group__3"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2251:1: rule__AliasOperatorDefinition__Group__3 : rule__AliasOperatorDefinition__Group__3__Impl rule__AliasOperatorDefinition__Group__4 ;
    public final void rule__AliasOperatorDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2255:1: ( rule__AliasOperatorDefinition__Group__3__Impl rule__AliasOperatorDefinition__Group__4 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2256:2: rule__AliasOperatorDefinition__Group__3__Impl rule__AliasOperatorDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__AliasOperatorDefinition__Group__3__Impl_in_rule__AliasOperatorDefinition__Group__34610);
            rule__AliasOperatorDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AliasOperatorDefinition__Group__4_in_rule__AliasOperatorDefinition__Group__34613);
            rule__AliasOperatorDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasOperatorDefinition__Group__3"


    // $ANTLR start "rule__AliasOperatorDefinition__Group__3__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2263:1: rule__AliasOperatorDefinition__Group__3__Impl : ( ( rule__AliasOperatorDefinition__OperatorAssignment_3 ) ) ;
    public final void rule__AliasOperatorDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2267:1: ( ( ( rule__AliasOperatorDefinition__OperatorAssignment_3 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2268:1: ( ( rule__AliasOperatorDefinition__OperatorAssignment_3 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2268:1: ( ( rule__AliasOperatorDefinition__OperatorAssignment_3 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2269:1: ( rule__AliasOperatorDefinition__OperatorAssignment_3 )
            {
             before(grammarAccess.getAliasOperatorDefinitionAccess().getOperatorAssignment_3()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2270:1: ( rule__AliasOperatorDefinition__OperatorAssignment_3 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2270:2: rule__AliasOperatorDefinition__OperatorAssignment_3
            {
            pushFollow(FOLLOW_rule__AliasOperatorDefinition__OperatorAssignment_3_in_rule__AliasOperatorDefinition__Group__3__Impl4640);
            rule__AliasOperatorDefinition__OperatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAliasOperatorDefinitionAccess().getOperatorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasOperatorDefinition__Group__3__Impl"


    // $ANTLR start "rule__AliasOperatorDefinition__Group__4"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2280:1: rule__AliasOperatorDefinition__Group__4 : rule__AliasOperatorDefinition__Group__4__Impl rule__AliasOperatorDefinition__Group__5 ;
    public final void rule__AliasOperatorDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2284:1: ( rule__AliasOperatorDefinition__Group__4__Impl rule__AliasOperatorDefinition__Group__5 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2285:2: rule__AliasOperatorDefinition__Group__4__Impl rule__AliasOperatorDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__AliasOperatorDefinition__Group__4__Impl_in_rule__AliasOperatorDefinition__Group__44670);
            rule__AliasOperatorDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AliasOperatorDefinition__Group__5_in_rule__AliasOperatorDefinition__Group__44673);
            rule__AliasOperatorDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasOperatorDefinition__Group__4"


    // $ANTLR start "rule__AliasOperatorDefinition__Group__4__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2292:1: rule__AliasOperatorDefinition__Group__4__Impl : ( ']' ) ;
    public final void rule__AliasOperatorDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2296:1: ( ( ']' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2297:1: ( ']' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2297:1: ( ']' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2298:1: ']'
            {
             before(grammarAccess.getAliasOperatorDefinitionAccess().getRightSquareBracketKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__AliasOperatorDefinition__Group__4__Impl4701); 
             after(grammarAccess.getAliasOperatorDefinitionAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasOperatorDefinition__Group__4__Impl"


    // $ANTLR start "rule__AliasOperatorDefinition__Group__5"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2311:1: rule__AliasOperatorDefinition__Group__5 : rule__AliasOperatorDefinition__Group__5__Impl rule__AliasOperatorDefinition__Group__6 ;
    public final void rule__AliasOperatorDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2315:1: ( rule__AliasOperatorDefinition__Group__5__Impl rule__AliasOperatorDefinition__Group__6 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2316:2: rule__AliasOperatorDefinition__Group__5__Impl rule__AliasOperatorDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__AliasOperatorDefinition__Group__5__Impl_in_rule__AliasOperatorDefinition__Group__54732);
            rule__AliasOperatorDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AliasOperatorDefinition__Group__6_in_rule__AliasOperatorDefinition__Group__54735);
            rule__AliasOperatorDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasOperatorDefinition__Group__5"


    // $ANTLR start "rule__AliasOperatorDefinition__Group__5__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2323:1: rule__AliasOperatorDefinition__Group__5__Impl : ( ( rule__AliasOperatorDefinition__Group_5__0 )? ) ;
    public final void rule__AliasOperatorDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2327:1: ( ( ( rule__AliasOperatorDefinition__Group_5__0 )? ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2328:1: ( ( rule__AliasOperatorDefinition__Group_5__0 )? )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2328:1: ( ( rule__AliasOperatorDefinition__Group_5__0 )? )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2329:1: ( rule__AliasOperatorDefinition__Group_5__0 )?
            {
             before(grammarAccess.getAliasOperatorDefinitionAccess().getGroup_5()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2330:1: ( rule__AliasOperatorDefinition__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2330:2: rule__AliasOperatorDefinition__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__AliasOperatorDefinition__Group_5__0_in_rule__AliasOperatorDefinition__Group__5__Impl4762);
                    rule__AliasOperatorDefinition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAliasOperatorDefinitionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasOperatorDefinition__Group__5__Impl"


    // $ANTLR start "rule__AliasOperatorDefinition__Group__6"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2340:1: rule__AliasOperatorDefinition__Group__6 : rule__AliasOperatorDefinition__Group__6__Impl ;
    public final void rule__AliasOperatorDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2344:1: ( rule__AliasOperatorDefinition__Group__6__Impl )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2345:2: rule__AliasOperatorDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__AliasOperatorDefinition__Group__6__Impl_in_rule__AliasOperatorDefinition__Group__64793);
            rule__AliasOperatorDefinition__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasOperatorDefinition__Group__6"


    // $ANTLR start "rule__AliasOperatorDefinition__Group__6__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2351:1: rule__AliasOperatorDefinition__Group__6__Impl : ( ';' ) ;
    public final void rule__AliasOperatorDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2355:1: ( ( ';' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2356:1: ( ';' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2356:1: ( ';' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2357:1: ';'
            {
             before(grammarAccess.getAliasOperatorDefinitionAccess().getSemicolonKeyword_6()); 
            match(input,26,FOLLOW_26_in_rule__AliasOperatorDefinition__Group__6__Impl4821); 
             after(grammarAccess.getAliasOperatorDefinitionAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasOperatorDefinition__Group__6__Impl"


    // $ANTLR start "rule__AliasOperatorDefinition__Group_5__0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2384:1: rule__AliasOperatorDefinition__Group_5__0 : rule__AliasOperatorDefinition__Group_5__0__Impl rule__AliasOperatorDefinition__Group_5__1 ;
    public final void rule__AliasOperatorDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2388:1: ( rule__AliasOperatorDefinition__Group_5__0__Impl rule__AliasOperatorDefinition__Group_5__1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2389:2: rule__AliasOperatorDefinition__Group_5__0__Impl rule__AliasOperatorDefinition__Group_5__1
            {
            pushFollow(FOLLOW_rule__AliasOperatorDefinition__Group_5__0__Impl_in_rule__AliasOperatorDefinition__Group_5__04866);
            rule__AliasOperatorDefinition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AliasOperatorDefinition__Group_5__1_in_rule__AliasOperatorDefinition__Group_5__04869);
            rule__AliasOperatorDefinition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasOperatorDefinition__Group_5__0"


    // $ANTLR start "rule__AliasOperatorDefinition__Group_5__0__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2396:1: rule__AliasOperatorDefinition__Group_5__0__Impl : ( ':' ) ;
    public final void rule__AliasOperatorDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2400:1: ( ( ':' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2401:1: ( ':' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2401:1: ( ':' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2402:1: ':'
            {
             before(grammarAccess.getAliasOperatorDefinitionAccess().getColonKeyword_5_0()); 
            match(input,27,FOLLOW_27_in_rule__AliasOperatorDefinition__Group_5__0__Impl4897); 
             after(grammarAccess.getAliasOperatorDefinitionAccess().getColonKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasOperatorDefinition__Group_5__0__Impl"


    // $ANTLR start "rule__AliasOperatorDefinition__Group_5__1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2415:1: rule__AliasOperatorDefinition__Group_5__1 : rule__AliasOperatorDefinition__Group_5__1__Impl ;
    public final void rule__AliasOperatorDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2419:1: ( rule__AliasOperatorDefinition__Group_5__1__Impl )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2420:2: rule__AliasOperatorDefinition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__AliasOperatorDefinition__Group_5__1__Impl_in_rule__AliasOperatorDefinition__Group_5__14928);
            rule__AliasOperatorDefinition__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasOperatorDefinition__Group_5__1"


    // $ANTLR start "rule__AliasOperatorDefinition__Group_5__1__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2426:1: rule__AliasOperatorDefinition__Group_5__1__Impl : ( ( ( rule__AliasOperatorDefinition__ParametersAssignment_5_1 ) ) ( ( rule__AliasOperatorDefinition__ParametersAssignment_5_1 )* ) ) ;
    public final void rule__AliasOperatorDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2430:1: ( ( ( ( rule__AliasOperatorDefinition__ParametersAssignment_5_1 ) ) ( ( rule__AliasOperatorDefinition__ParametersAssignment_5_1 )* ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2431:1: ( ( ( rule__AliasOperatorDefinition__ParametersAssignment_5_1 ) ) ( ( rule__AliasOperatorDefinition__ParametersAssignment_5_1 )* ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2431:1: ( ( ( rule__AliasOperatorDefinition__ParametersAssignment_5_1 ) ) ( ( rule__AliasOperatorDefinition__ParametersAssignment_5_1 )* ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2432:1: ( ( rule__AliasOperatorDefinition__ParametersAssignment_5_1 ) ) ( ( rule__AliasOperatorDefinition__ParametersAssignment_5_1 )* )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2432:1: ( ( rule__AliasOperatorDefinition__ParametersAssignment_5_1 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2433:1: ( rule__AliasOperatorDefinition__ParametersAssignment_5_1 )
            {
             before(grammarAccess.getAliasOperatorDefinitionAccess().getParametersAssignment_5_1()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2434:1: ( rule__AliasOperatorDefinition__ParametersAssignment_5_1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2434:2: rule__AliasOperatorDefinition__ParametersAssignment_5_1
            {
            pushFollow(FOLLOW_rule__AliasOperatorDefinition__ParametersAssignment_5_1_in_rule__AliasOperatorDefinition__Group_5__1__Impl4957);
            rule__AliasOperatorDefinition__ParametersAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAliasOperatorDefinitionAccess().getParametersAssignment_5_1()); 

            }

            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2437:1: ( ( rule__AliasOperatorDefinition__ParametersAssignment_5_1 )* )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2438:1: ( rule__AliasOperatorDefinition__ParametersAssignment_5_1 )*
            {
             before(grammarAccess.getAliasOperatorDefinitionAccess().getParametersAssignment_5_1()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2439:1: ( rule__AliasOperatorDefinition__ParametersAssignment_5_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2439:2: rule__AliasOperatorDefinition__ParametersAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__AliasOperatorDefinition__ParametersAssignment_5_1_in_rule__AliasOperatorDefinition__Group_5__1__Impl4969);
            	    rule__AliasOperatorDefinition__ParametersAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getAliasOperatorDefinitionAccess().getParametersAssignment_5_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasOperatorDefinition__Group_5__1__Impl"


    // $ANTLR start "rule__ParameterApplication__Group__0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2454:1: rule__ParameterApplication__Group__0 : rule__ParameterApplication__Group__0__Impl rule__ParameterApplication__Group__1 ;
    public final void rule__ParameterApplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2458:1: ( rule__ParameterApplication__Group__0__Impl rule__ParameterApplication__Group__1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2459:2: rule__ParameterApplication__Group__0__Impl rule__ParameterApplication__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterApplication__Group__0__Impl_in_rule__ParameterApplication__Group__05006);
            rule__ParameterApplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterApplication__Group__1_in_rule__ParameterApplication__Group__05009);
            rule__ParameterApplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterApplication__Group__0"


    // $ANTLR start "rule__ParameterApplication__Group__0__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2466:1: rule__ParameterApplication__Group__0__Impl : ( ( rule__ParameterApplication__ReferencedParameterAssignment_0 ) ) ;
    public final void rule__ParameterApplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2470:1: ( ( ( rule__ParameterApplication__ReferencedParameterAssignment_0 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2471:1: ( ( rule__ParameterApplication__ReferencedParameterAssignment_0 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2471:1: ( ( rule__ParameterApplication__ReferencedParameterAssignment_0 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2472:1: ( rule__ParameterApplication__ReferencedParameterAssignment_0 )
            {
             before(grammarAccess.getParameterApplicationAccess().getReferencedParameterAssignment_0()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2473:1: ( rule__ParameterApplication__ReferencedParameterAssignment_0 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2473:2: rule__ParameterApplication__ReferencedParameterAssignment_0
            {
            pushFollow(FOLLOW_rule__ParameterApplication__ReferencedParameterAssignment_0_in_rule__ParameterApplication__Group__0__Impl5036);
            rule__ParameterApplication__ReferencedParameterAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterApplicationAccess().getReferencedParameterAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterApplication__Group__0__Impl"


    // $ANTLR start "rule__ParameterApplication__Group__1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2483:1: rule__ParameterApplication__Group__1 : rule__ParameterApplication__Group__1__Impl rule__ParameterApplication__Group__2 ;
    public final void rule__ParameterApplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2487:1: ( rule__ParameterApplication__Group__1__Impl rule__ParameterApplication__Group__2 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2488:2: rule__ParameterApplication__Group__1__Impl rule__ParameterApplication__Group__2
            {
            pushFollow(FOLLOW_rule__ParameterApplication__Group__1__Impl_in_rule__ParameterApplication__Group__15066);
            rule__ParameterApplication__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterApplication__Group__2_in_rule__ParameterApplication__Group__15069);
            rule__ParameterApplication__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterApplication__Group__1"


    // $ANTLR start "rule__ParameterApplication__Group__1__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2495:1: rule__ParameterApplication__Group__1__Impl : ( '=' ) ;
    public final void rule__ParameterApplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2499:1: ( ( '=' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2500:1: ( '=' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2500:1: ( '=' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2501:1: '='
            {
             before(grammarAccess.getParameterApplicationAccess().getEqualsSignKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__ParameterApplication__Group__1__Impl5097); 
             after(grammarAccess.getParameterApplicationAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterApplication__Group__1__Impl"


    // $ANTLR start "rule__ParameterApplication__Group__2"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2514:1: rule__ParameterApplication__Group__2 : rule__ParameterApplication__Group__2__Impl ;
    public final void rule__ParameterApplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2518:1: ( rule__ParameterApplication__Group__2__Impl )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2519:2: rule__ParameterApplication__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParameterApplication__Group__2__Impl_in_rule__ParameterApplication__Group__25128);
            rule__ParameterApplication__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterApplication__Group__2"


    // $ANTLR start "rule__ParameterApplication__Group__2__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2525:1: rule__ParameterApplication__Group__2__Impl : ( ( rule__ParameterApplication__ValueAssignment_2 ) ) ;
    public final void rule__ParameterApplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2529:1: ( ( ( rule__ParameterApplication__ValueAssignment_2 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2530:1: ( ( rule__ParameterApplication__ValueAssignment_2 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2530:1: ( ( rule__ParameterApplication__ValueAssignment_2 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2531:1: ( rule__ParameterApplication__ValueAssignment_2 )
            {
             before(grammarAccess.getParameterApplicationAccess().getValueAssignment_2()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2532:1: ( rule__ParameterApplication__ValueAssignment_2 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2532:2: rule__ParameterApplication__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__ParameterApplication__ValueAssignment_2_in_rule__ParameterApplication__Group__2__Impl5155);
            rule__ParameterApplication__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterApplicationAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterApplication__Group__2__Impl"


    // $ANTLR start "rule__StringParameterDefinition__Group__0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2548:1: rule__StringParameterDefinition__Group__0 : rule__StringParameterDefinition__Group__0__Impl rule__StringParameterDefinition__Group__1 ;
    public final void rule__StringParameterDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2552:1: ( rule__StringParameterDefinition__Group__0__Impl rule__StringParameterDefinition__Group__1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2553:2: rule__StringParameterDefinition__Group__0__Impl rule__StringParameterDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__StringParameterDefinition__Group__0__Impl_in_rule__StringParameterDefinition__Group__05191);
            rule__StringParameterDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringParameterDefinition__Group__1_in_rule__StringParameterDefinition__Group__05194);
            rule__StringParameterDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParameterDefinition__Group__0"


    // $ANTLR start "rule__StringParameterDefinition__Group__0__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2560:1: rule__StringParameterDefinition__Group__0__Impl : ( ( rule__StringParameterDefinition__Alternatives_0 ) ) ;
    public final void rule__StringParameterDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2564:1: ( ( ( rule__StringParameterDefinition__Alternatives_0 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2565:1: ( ( rule__StringParameterDefinition__Alternatives_0 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2565:1: ( ( rule__StringParameterDefinition__Alternatives_0 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2566:1: ( rule__StringParameterDefinition__Alternatives_0 )
            {
             before(grammarAccess.getStringParameterDefinitionAccess().getAlternatives_0()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2567:1: ( rule__StringParameterDefinition__Alternatives_0 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2567:2: rule__StringParameterDefinition__Alternatives_0
            {
            pushFollow(FOLLOW_rule__StringParameterDefinition__Alternatives_0_in_rule__StringParameterDefinition__Group__0__Impl5221);
            rule__StringParameterDefinition__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getStringParameterDefinitionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParameterDefinition__Group__0__Impl"


    // $ANTLR start "rule__StringParameterDefinition__Group__1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2577:1: rule__StringParameterDefinition__Group__1 : rule__StringParameterDefinition__Group__1__Impl rule__StringParameterDefinition__Group__2 ;
    public final void rule__StringParameterDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2581:1: ( rule__StringParameterDefinition__Group__1__Impl rule__StringParameterDefinition__Group__2 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2582:2: rule__StringParameterDefinition__Group__1__Impl rule__StringParameterDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__StringParameterDefinition__Group__1__Impl_in_rule__StringParameterDefinition__Group__15251);
            rule__StringParameterDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringParameterDefinition__Group__2_in_rule__StringParameterDefinition__Group__15254);
            rule__StringParameterDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParameterDefinition__Group__1"


    // $ANTLR start "rule__StringParameterDefinition__Group__1__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2589:1: rule__StringParameterDefinition__Group__1__Impl : ( ( rule__StringParameterDefinition__NameAssignment_1 ) ) ;
    public final void rule__StringParameterDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2593:1: ( ( ( rule__StringParameterDefinition__NameAssignment_1 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2594:1: ( ( rule__StringParameterDefinition__NameAssignment_1 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2594:1: ( ( rule__StringParameterDefinition__NameAssignment_1 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2595:1: ( rule__StringParameterDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getStringParameterDefinitionAccess().getNameAssignment_1()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2596:1: ( rule__StringParameterDefinition__NameAssignment_1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2596:2: rule__StringParameterDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StringParameterDefinition__NameAssignment_1_in_rule__StringParameterDefinition__Group__1__Impl5281);
            rule__StringParameterDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringParameterDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParameterDefinition__Group__1__Impl"


    // $ANTLR start "rule__StringParameterDefinition__Group__2"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2606:1: rule__StringParameterDefinition__Group__2 : rule__StringParameterDefinition__Group__2__Impl rule__StringParameterDefinition__Group__3 ;
    public final void rule__StringParameterDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2610:1: ( rule__StringParameterDefinition__Group__2__Impl rule__StringParameterDefinition__Group__3 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2611:2: rule__StringParameterDefinition__Group__2__Impl rule__StringParameterDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__StringParameterDefinition__Group__2__Impl_in_rule__StringParameterDefinition__Group__25311);
            rule__StringParameterDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringParameterDefinition__Group__3_in_rule__StringParameterDefinition__Group__25314);
            rule__StringParameterDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParameterDefinition__Group__2"


    // $ANTLR start "rule__StringParameterDefinition__Group__2__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2618:1: rule__StringParameterDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__StringParameterDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2622:1: ( ( '=' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2623:1: ( '=' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2623:1: ( '=' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2624:1: '='
            {
             before(grammarAccess.getStringParameterDefinitionAccess().getEqualsSignKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__StringParameterDefinition__Group__2__Impl5342); 
             after(grammarAccess.getStringParameterDefinitionAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParameterDefinition__Group__2__Impl"


    // $ANTLR start "rule__StringParameterDefinition__Group__3"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2637:1: rule__StringParameterDefinition__Group__3 : rule__StringParameterDefinition__Group__3__Impl ;
    public final void rule__StringParameterDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2641:1: ( rule__StringParameterDefinition__Group__3__Impl )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2642:2: rule__StringParameterDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StringParameterDefinition__Group__3__Impl_in_rule__StringParameterDefinition__Group__35373);
            rule__StringParameterDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParameterDefinition__Group__3"


    // $ANTLR start "rule__StringParameterDefinition__Group__3__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2648:1: rule__StringParameterDefinition__Group__3__Impl : ( ( rule__StringParameterDefinition__ValueAssignment_3 ) ) ;
    public final void rule__StringParameterDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2652:1: ( ( ( rule__StringParameterDefinition__ValueAssignment_3 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2653:1: ( ( rule__StringParameterDefinition__ValueAssignment_3 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2653:1: ( ( rule__StringParameterDefinition__ValueAssignment_3 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2654:1: ( rule__StringParameterDefinition__ValueAssignment_3 )
            {
             before(grammarAccess.getStringParameterDefinitionAccess().getValueAssignment_3()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2655:1: ( rule__StringParameterDefinition__ValueAssignment_3 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2655:2: rule__StringParameterDefinition__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__StringParameterDefinition__ValueAssignment_3_in_rule__StringParameterDefinition__Group__3__Impl5400);
            rule__StringParameterDefinition__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStringParameterDefinitionAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParameterDefinition__Group__3__Impl"


    // $ANTLR start "rule__IntParameterDefinition__Group__0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2673:1: rule__IntParameterDefinition__Group__0 : rule__IntParameterDefinition__Group__0__Impl rule__IntParameterDefinition__Group__1 ;
    public final void rule__IntParameterDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2677:1: ( rule__IntParameterDefinition__Group__0__Impl rule__IntParameterDefinition__Group__1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2678:2: rule__IntParameterDefinition__Group__0__Impl rule__IntParameterDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__IntParameterDefinition__Group__0__Impl_in_rule__IntParameterDefinition__Group__05438);
            rule__IntParameterDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntParameterDefinition__Group__1_in_rule__IntParameterDefinition__Group__05441);
            rule__IntParameterDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntParameterDefinition__Group__0"


    // $ANTLR start "rule__IntParameterDefinition__Group__0__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2685:1: rule__IntParameterDefinition__Group__0__Impl : ( ( rule__IntParameterDefinition__Alternatives_0 ) ) ;
    public final void rule__IntParameterDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2689:1: ( ( ( rule__IntParameterDefinition__Alternatives_0 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2690:1: ( ( rule__IntParameterDefinition__Alternatives_0 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2690:1: ( ( rule__IntParameterDefinition__Alternatives_0 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2691:1: ( rule__IntParameterDefinition__Alternatives_0 )
            {
             before(grammarAccess.getIntParameterDefinitionAccess().getAlternatives_0()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2692:1: ( rule__IntParameterDefinition__Alternatives_0 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2692:2: rule__IntParameterDefinition__Alternatives_0
            {
            pushFollow(FOLLOW_rule__IntParameterDefinition__Alternatives_0_in_rule__IntParameterDefinition__Group__0__Impl5468);
            rule__IntParameterDefinition__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getIntParameterDefinitionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntParameterDefinition__Group__0__Impl"


    // $ANTLR start "rule__IntParameterDefinition__Group__1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2702:1: rule__IntParameterDefinition__Group__1 : rule__IntParameterDefinition__Group__1__Impl rule__IntParameterDefinition__Group__2 ;
    public final void rule__IntParameterDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2706:1: ( rule__IntParameterDefinition__Group__1__Impl rule__IntParameterDefinition__Group__2 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2707:2: rule__IntParameterDefinition__Group__1__Impl rule__IntParameterDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__IntParameterDefinition__Group__1__Impl_in_rule__IntParameterDefinition__Group__15498);
            rule__IntParameterDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntParameterDefinition__Group__2_in_rule__IntParameterDefinition__Group__15501);
            rule__IntParameterDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntParameterDefinition__Group__1"


    // $ANTLR start "rule__IntParameterDefinition__Group__1__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2714:1: rule__IntParameterDefinition__Group__1__Impl : ( ( rule__IntParameterDefinition__NameAssignment_1 ) ) ;
    public final void rule__IntParameterDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2718:1: ( ( ( rule__IntParameterDefinition__NameAssignment_1 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2719:1: ( ( rule__IntParameterDefinition__NameAssignment_1 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2719:1: ( ( rule__IntParameterDefinition__NameAssignment_1 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2720:1: ( rule__IntParameterDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getIntParameterDefinitionAccess().getNameAssignment_1()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2721:1: ( rule__IntParameterDefinition__NameAssignment_1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2721:2: rule__IntParameterDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__IntParameterDefinition__NameAssignment_1_in_rule__IntParameterDefinition__Group__1__Impl5528);
            rule__IntParameterDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntParameterDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntParameterDefinition__Group__1__Impl"


    // $ANTLR start "rule__IntParameterDefinition__Group__2"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2731:1: rule__IntParameterDefinition__Group__2 : rule__IntParameterDefinition__Group__2__Impl rule__IntParameterDefinition__Group__3 ;
    public final void rule__IntParameterDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2735:1: ( rule__IntParameterDefinition__Group__2__Impl rule__IntParameterDefinition__Group__3 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2736:2: rule__IntParameterDefinition__Group__2__Impl rule__IntParameterDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__IntParameterDefinition__Group__2__Impl_in_rule__IntParameterDefinition__Group__25558);
            rule__IntParameterDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntParameterDefinition__Group__3_in_rule__IntParameterDefinition__Group__25561);
            rule__IntParameterDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntParameterDefinition__Group__2"


    // $ANTLR start "rule__IntParameterDefinition__Group__2__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2743:1: rule__IntParameterDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__IntParameterDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2747:1: ( ( '=' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2748:1: ( '=' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2748:1: ( '=' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2749:1: '='
            {
             before(grammarAccess.getIntParameterDefinitionAccess().getEqualsSignKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__IntParameterDefinition__Group__2__Impl5589); 
             after(grammarAccess.getIntParameterDefinitionAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntParameterDefinition__Group__2__Impl"


    // $ANTLR start "rule__IntParameterDefinition__Group__3"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2762:1: rule__IntParameterDefinition__Group__3 : rule__IntParameterDefinition__Group__3__Impl ;
    public final void rule__IntParameterDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2766:1: ( rule__IntParameterDefinition__Group__3__Impl )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2767:2: rule__IntParameterDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__IntParameterDefinition__Group__3__Impl_in_rule__IntParameterDefinition__Group__35620);
            rule__IntParameterDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntParameterDefinition__Group__3"


    // $ANTLR start "rule__IntParameterDefinition__Group__3__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2773:1: rule__IntParameterDefinition__Group__3__Impl : ( ( rule__IntParameterDefinition__ValueAssignment_3 ) ) ;
    public final void rule__IntParameterDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2777:1: ( ( ( rule__IntParameterDefinition__ValueAssignment_3 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2778:1: ( ( rule__IntParameterDefinition__ValueAssignment_3 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2778:1: ( ( rule__IntParameterDefinition__ValueAssignment_3 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2779:1: ( rule__IntParameterDefinition__ValueAssignment_3 )
            {
             before(grammarAccess.getIntParameterDefinitionAccess().getValueAssignment_3()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2780:1: ( rule__IntParameterDefinition__ValueAssignment_3 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2780:2: rule__IntParameterDefinition__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__IntParameterDefinition__ValueAssignment_3_in_rule__IntParameterDefinition__Group__3__Impl5647);
            rule__IntParameterDefinition__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIntParameterDefinitionAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntParameterDefinition__Group__3__Impl"


    // $ANTLR start "rule__EnumParameterDefinition__Group__0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2798:1: rule__EnumParameterDefinition__Group__0 : rule__EnumParameterDefinition__Group__0__Impl rule__EnumParameterDefinition__Group__1 ;
    public final void rule__EnumParameterDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2802:1: ( rule__EnumParameterDefinition__Group__0__Impl rule__EnumParameterDefinition__Group__1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2803:2: rule__EnumParameterDefinition__Group__0__Impl rule__EnumParameterDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group__0__Impl_in_rule__EnumParameterDefinition__Group__05685);
            rule__EnumParameterDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group__1_in_rule__EnumParameterDefinition__Group__05688);
            rule__EnumParameterDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group__0"


    // $ANTLR start "rule__EnumParameterDefinition__Group__0__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2810:1: rule__EnumParameterDefinition__Group__0__Impl : ( '{' ) ;
    public final void rule__EnumParameterDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2814:1: ( ( '{' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2815:1: ( '{' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2815:1: ( '{' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2816:1: '{'
            {
             before(grammarAccess.getEnumParameterDefinitionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__EnumParameterDefinition__Group__0__Impl5716); 
             after(grammarAccess.getEnumParameterDefinitionAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group__0__Impl"


    // $ANTLR start "rule__EnumParameterDefinition__Group__1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2829:1: rule__EnumParameterDefinition__Group__1 : rule__EnumParameterDefinition__Group__1__Impl rule__EnumParameterDefinition__Group__2 ;
    public final void rule__EnumParameterDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2833:1: ( rule__EnumParameterDefinition__Group__1__Impl rule__EnumParameterDefinition__Group__2 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2834:2: rule__EnumParameterDefinition__Group__1__Impl rule__EnumParameterDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group__1__Impl_in_rule__EnumParameterDefinition__Group__15747);
            rule__EnumParameterDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group__2_in_rule__EnumParameterDefinition__Group__15750);
            rule__EnumParameterDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group__1"


    // $ANTLR start "rule__EnumParameterDefinition__Group__1__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2841:1: rule__EnumParameterDefinition__Group__1__Impl : ( ( rule__EnumParameterDefinition__Alternatives_1 ) ) ;
    public final void rule__EnumParameterDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2845:1: ( ( ( rule__EnumParameterDefinition__Alternatives_1 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2846:1: ( ( rule__EnumParameterDefinition__Alternatives_1 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2846:1: ( ( rule__EnumParameterDefinition__Alternatives_1 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2847:1: ( rule__EnumParameterDefinition__Alternatives_1 )
            {
             before(grammarAccess.getEnumParameterDefinitionAccess().getAlternatives_1()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2848:1: ( rule__EnumParameterDefinition__Alternatives_1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2848:2: rule__EnumParameterDefinition__Alternatives_1
            {
            pushFollow(FOLLOW_rule__EnumParameterDefinition__Alternatives_1_in_rule__EnumParameterDefinition__Group__1__Impl5777);
            rule__EnumParameterDefinition__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumParameterDefinitionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group__1__Impl"


    // $ANTLR start "rule__EnumParameterDefinition__Group__2"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2858:1: rule__EnumParameterDefinition__Group__2 : rule__EnumParameterDefinition__Group__2__Impl rule__EnumParameterDefinition__Group__3 ;
    public final void rule__EnumParameterDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2862:1: ( rule__EnumParameterDefinition__Group__2__Impl rule__EnumParameterDefinition__Group__3 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2863:2: rule__EnumParameterDefinition__Group__2__Impl rule__EnumParameterDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group__2__Impl_in_rule__EnumParameterDefinition__Group__25807);
            rule__EnumParameterDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group__3_in_rule__EnumParameterDefinition__Group__25810);
            rule__EnumParameterDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group__2"


    // $ANTLR start "rule__EnumParameterDefinition__Group__2__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2870:1: rule__EnumParameterDefinition__Group__2__Impl : ( '}' ) ;
    public final void rule__EnumParameterDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2874:1: ( ( '}' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2875:1: ( '}' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2875:1: ( '}' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2876:1: '}'
            {
             before(grammarAccess.getEnumParameterDefinitionAccess().getRightCurlyBracketKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__EnumParameterDefinition__Group__2__Impl5838); 
             after(grammarAccess.getEnumParameterDefinitionAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group__2__Impl"


    // $ANTLR start "rule__EnumParameterDefinition__Group__3"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2889:1: rule__EnumParameterDefinition__Group__3 : rule__EnumParameterDefinition__Group__3__Impl rule__EnumParameterDefinition__Group__4 ;
    public final void rule__EnumParameterDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2893:1: ( rule__EnumParameterDefinition__Group__3__Impl rule__EnumParameterDefinition__Group__4 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2894:2: rule__EnumParameterDefinition__Group__3__Impl rule__EnumParameterDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group__3__Impl_in_rule__EnumParameterDefinition__Group__35869);
            rule__EnumParameterDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group__4_in_rule__EnumParameterDefinition__Group__35872);
            rule__EnumParameterDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group__3"


    // $ANTLR start "rule__EnumParameterDefinition__Group__3__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2901:1: rule__EnumParameterDefinition__Group__3__Impl : ( ( rule__EnumParameterDefinition__NameAssignment_3 ) ) ;
    public final void rule__EnumParameterDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2905:1: ( ( ( rule__EnumParameterDefinition__NameAssignment_3 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2906:1: ( ( rule__EnumParameterDefinition__NameAssignment_3 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2906:1: ( ( rule__EnumParameterDefinition__NameAssignment_3 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2907:1: ( rule__EnumParameterDefinition__NameAssignment_3 )
            {
             before(grammarAccess.getEnumParameterDefinitionAccess().getNameAssignment_3()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2908:1: ( rule__EnumParameterDefinition__NameAssignment_3 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2908:2: rule__EnumParameterDefinition__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumParameterDefinition__NameAssignment_3_in_rule__EnumParameterDefinition__Group__3__Impl5899);
            rule__EnumParameterDefinition__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumParameterDefinitionAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group__3__Impl"


    // $ANTLR start "rule__EnumParameterDefinition__Group__4"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2918:1: rule__EnumParameterDefinition__Group__4 : rule__EnumParameterDefinition__Group__4__Impl rule__EnumParameterDefinition__Group__5 ;
    public final void rule__EnumParameterDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2922:1: ( rule__EnumParameterDefinition__Group__4__Impl rule__EnumParameterDefinition__Group__5 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2923:2: rule__EnumParameterDefinition__Group__4__Impl rule__EnumParameterDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group__4__Impl_in_rule__EnumParameterDefinition__Group__45929);
            rule__EnumParameterDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group__5_in_rule__EnumParameterDefinition__Group__45932);
            rule__EnumParameterDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group__4"


    // $ANTLR start "rule__EnumParameterDefinition__Group__4__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2930:1: rule__EnumParameterDefinition__Group__4__Impl : ( '=' ) ;
    public final void rule__EnumParameterDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2934:1: ( ( '=' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2935:1: ( '=' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2935:1: ( '=' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2936:1: '='
            {
             before(grammarAccess.getEnumParameterDefinitionAccess().getEqualsSignKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__EnumParameterDefinition__Group__4__Impl5960); 
             after(grammarAccess.getEnumParameterDefinitionAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group__4__Impl"


    // $ANTLR start "rule__EnumParameterDefinition__Group__5"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2949:1: rule__EnumParameterDefinition__Group__5 : rule__EnumParameterDefinition__Group__5__Impl ;
    public final void rule__EnumParameterDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2953:1: ( rule__EnumParameterDefinition__Group__5__Impl )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2954:2: rule__EnumParameterDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group__5__Impl_in_rule__EnumParameterDefinition__Group__55991);
            rule__EnumParameterDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group__5"


    // $ANTLR start "rule__EnumParameterDefinition__Group__5__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2960:1: rule__EnumParameterDefinition__Group__5__Impl : ( ( rule__EnumParameterDefinition__ValueAssignment_5 ) ) ;
    public final void rule__EnumParameterDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2964:1: ( ( ( rule__EnumParameterDefinition__ValueAssignment_5 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2965:1: ( ( rule__EnumParameterDefinition__ValueAssignment_5 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2965:1: ( ( rule__EnumParameterDefinition__ValueAssignment_5 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2966:1: ( rule__EnumParameterDefinition__ValueAssignment_5 )
            {
             before(grammarAccess.getEnumParameterDefinitionAccess().getValueAssignment_5()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2967:1: ( rule__EnumParameterDefinition__ValueAssignment_5 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2967:2: rule__EnumParameterDefinition__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__EnumParameterDefinition__ValueAssignment_5_in_rule__EnumParameterDefinition__Group__5__Impl6018);
            rule__EnumParameterDefinition__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEnumParameterDefinitionAccess().getValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group__5__Impl"


    // $ANTLR start "rule__EnumParameterDefinition__Group_1_0__0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2989:1: rule__EnumParameterDefinition__Group_1_0__0 : rule__EnumParameterDefinition__Group_1_0__0__Impl rule__EnumParameterDefinition__Group_1_0__1 ;
    public final void rule__EnumParameterDefinition__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2993:1: ( rule__EnumParameterDefinition__Group_1_0__0__Impl rule__EnumParameterDefinition__Group_1_0__1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:2994:2: rule__EnumParameterDefinition__Group_1_0__0__Impl rule__EnumParameterDefinition__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group_1_0__0__Impl_in_rule__EnumParameterDefinition__Group_1_0__06060);
            rule__EnumParameterDefinition__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group_1_0__1_in_rule__EnumParameterDefinition__Group_1_0__06063);
            rule__EnumParameterDefinition__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group_1_0__0"


    // $ANTLR start "rule__EnumParameterDefinition__Group_1_0__0__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3001:1: rule__EnumParameterDefinition__Group_1_0__0__Impl : ( ( rule__EnumParameterDefinition__AlternativesAssignment_1_0_0 ) ) ;
    public final void rule__EnumParameterDefinition__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3005:1: ( ( ( rule__EnumParameterDefinition__AlternativesAssignment_1_0_0 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3006:1: ( ( rule__EnumParameterDefinition__AlternativesAssignment_1_0_0 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3006:1: ( ( rule__EnumParameterDefinition__AlternativesAssignment_1_0_0 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3007:1: ( rule__EnumParameterDefinition__AlternativesAssignment_1_0_0 )
            {
             before(grammarAccess.getEnumParameterDefinitionAccess().getAlternativesAssignment_1_0_0()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3008:1: ( rule__EnumParameterDefinition__AlternativesAssignment_1_0_0 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3008:2: rule__EnumParameterDefinition__AlternativesAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__EnumParameterDefinition__AlternativesAssignment_1_0_0_in_rule__EnumParameterDefinition__Group_1_0__0__Impl6090);
            rule__EnumParameterDefinition__AlternativesAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumParameterDefinitionAccess().getAlternativesAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group_1_0__0__Impl"


    // $ANTLR start "rule__EnumParameterDefinition__Group_1_0__1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3018:1: rule__EnumParameterDefinition__Group_1_0__1 : rule__EnumParameterDefinition__Group_1_0__1__Impl ;
    public final void rule__EnumParameterDefinition__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3022:1: ( rule__EnumParameterDefinition__Group_1_0__1__Impl )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3023:2: rule__EnumParameterDefinition__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group_1_0__1__Impl_in_rule__EnumParameterDefinition__Group_1_0__16120);
            rule__EnumParameterDefinition__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group_1_0__1"


    // $ANTLR start "rule__EnumParameterDefinition__Group_1_0__1__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3029:1: rule__EnumParameterDefinition__Group_1_0__1__Impl : ( ( rule__EnumParameterDefinition__Group_1_0_1__0 )* ) ;
    public final void rule__EnumParameterDefinition__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3033:1: ( ( ( rule__EnumParameterDefinition__Group_1_0_1__0 )* ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3034:1: ( ( rule__EnumParameterDefinition__Group_1_0_1__0 )* )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3034:1: ( ( rule__EnumParameterDefinition__Group_1_0_1__0 )* )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3035:1: ( rule__EnumParameterDefinition__Group_1_0_1__0 )*
            {
             before(grammarAccess.getEnumParameterDefinitionAccess().getGroup_1_0_1()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3036:1: ( rule__EnumParameterDefinition__Group_1_0_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==31) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3036:2: rule__EnumParameterDefinition__Group_1_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumParameterDefinition__Group_1_0_1__0_in_rule__EnumParameterDefinition__Group_1_0__1__Impl6147);
            	    rule__EnumParameterDefinition__Group_1_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getEnumParameterDefinitionAccess().getGroup_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group_1_0__1__Impl"


    // $ANTLR start "rule__EnumParameterDefinition__Group_1_0_1__0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3050:1: rule__EnumParameterDefinition__Group_1_0_1__0 : rule__EnumParameterDefinition__Group_1_0_1__0__Impl rule__EnumParameterDefinition__Group_1_0_1__1 ;
    public final void rule__EnumParameterDefinition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3054:1: ( rule__EnumParameterDefinition__Group_1_0_1__0__Impl rule__EnumParameterDefinition__Group_1_0_1__1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3055:2: rule__EnumParameterDefinition__Group_1_0_1__0__Impl rule__EnumParameterDefinition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group_1_0_1__0__Impl_in_rule__EnumParameterDefinition__Group_1_0_1__06182);
            rule__EnumParameterDefinition__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group_1_0_1__1_in_rule__EnumParameterDefinition__Group_1_0_1__06185);
            rule__EnumParameterDefinition__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group_1_0_1__0"


    // $ANTLR start "rule__EnumParameterDefinition__Group_1_0_1__0__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3062:1: rule__EnumParameterDefinition__Group_1_0_1__0__Impl : ( ',' ) ;
    public final void rule__EnumParameterDefinition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3066:1: ( ( ',' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3067:1: ( ',' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3067:1: ( ',' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3068:1: ','
            {
             before(grammarAccess.getEnumParameterDefinitionAccess().getCommaKeyword_1_0_1_0()); 
            match(input,31,FOLLOW_31_in_rule__EnumParameterDefinition__Group_1_0_1__0__Impl6213); 
             after(grammarAccess.getEnumParameterDefinitionAccess().getCommaKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__EnumParameterDefinition__Group_1_0_1__1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3081:1: rule__EnumParameterDefinition__Group_1_0_1__1 : rule__EnumParameterDefinition__Group_1_0_1__1__Impl ;
    public final void rule__EnumParameterDefinition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3085:1: ( rule__EnumParameterDefinition__Group_1_0_1__1__Impl )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3086:2: rule__EnumParameterDefinition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group_1_0_1__1__Impl_in_rule__EnumParameterDefinition__Group_1_0_1__16244);
            rule__EnumParameterDefinition__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group_1_0_1__1"


    // $ANTLR start "rule__EnumParameterDefinition__Group_1_0_1__1__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3092:1: rule__EnumParameterDefinition__Group_1_0_1__1__Impl : ( ( rule__EnumParameterDefinition__AlternativesAssignment_1_0_1_1 ) ) ;
    public final void rule__EnumParameterDefinition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3096:1: ( ( ( rule__EnumParameterDefinition__AlternativesAssignment_1_0_1_1 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3097:1: ( ( rule__EnumParameterDefinition__AlternativesAssignment_1_0_1_1 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3097:1: ( ( rule__EnumParameterDefinition__AlternativesAssignment_1_0_1_1 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3098:1: ( rule__EnumParameterDefinition__AlternativesAssignment_1_0_1_1 )
            {
             before(grammarAccess.getEnumParameterDefinitionAccess().getAlternativesAssignment_1_0_1_1()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3099:1: ( rule__EnumParameterDefinition__AlternativesAssignment_1_0_1_1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3099:2: rule__EnumParameterDefinition__AlternativesAssignment_1_0_1_1
            {
            pushFollow(FOLLOW_rule__EnumParameterDefinition__AlternativesAssignment_1_0_1_1_in_rule__EnumParameterDefinition__Group_1_0_1__1__Impl6271);
            rule__EnumParameterDefinition__AlternativesAssignment_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumParameterDefinitionAccess().getAlternativesAssignment_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__EnumParameterDefinition__Group_1_1__0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3113:1: rule__EnumParameterDefinition__Group_1_1__0 : rule__EnumParameterDefinition__Group_1_1__0__Impl rule__EnumParameterDefinition__Group_1_1__1 ;
    public final void rule__EnumParameterDefinition__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3117:1: ( rule__EnumParameterDefinition__Group_1_1__0__Impl rule__EnumParameterDefinition__Group_1_1__1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3118:2: rule__EnumParameterDefinition__Group_1_1__0__Impl rule__EnumParameterDefinition__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group_1_1__0__Impl_in_rule__EnumParameterDefinition__Group_1_1__06305);
            rule__EnumParameterDefinition__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group_1_1__1_in_rule__EnumParameterDefinition__Group_1_1__06308);
            rule__EnumParameterDefinition__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group_1_1__0"


    // $ANTLR start "rule__EnumParameterDefinition__Group_1_1__0__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3125:1: rule__EnumParameterDefinition__Group_1_1__0__Impl : ( '[' ) ;
    public final void rule__EnumParameterDefinition__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3129:1: ( ( '[' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3130:1: ( '[' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3130:1: ( '[' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3131:1: '['
            {
             before(grammarAccess.getEnumParameterDefinitionAccess().getLeftSquareBracketKeyword_1_1_0()); 
            match(input,24,FOLLOW_24_in_rule__EnumParameterDefinition__Group_1_1__0__Impl6336); 
             after(grammarAccess.getEnumParameterDefinitionAccess().getLeftSquareBracketKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group_1_1__0__Impl"


    // $ANTLR start "rule__EnumParameterDefinition__Group_1_1__1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3144:1: rule__EnumParameterDefinition__Group_1_1__1 : rule__EnumParameterDefinition__Group_1_1__1__Impl rule__EnumParameterDefinition__Group_1_1__2 ;
    public final void rule__EnumParameterDefinition__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3148:1: ( rule__EnumParameterDefinition__Group_1_1__1__Impl rule__EnumParameterDefinition__Group_1_1__2 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3149:2: rule__EnumParameterDefinition__Group_1_1__1__Impl rule__EnumParameterDefinition__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group_1_1__1__Impl_in_rule__EnumParameterDefinition__Group_1_1__16367);
            rule__EnumParameterDefinition__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group_1_1__2_in_rule__EnumParameterDefinition__Group_1_1__16370);
            rule__EnumParameterDefinition__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group_1_1__1"


    // $ANTLR start "rule__EnumParameterDefinition__Group_1_1__1__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3156:1: rule__EnumParameterDefinition__Group_1_1__1__Impl : ( ( rule__EnumParameterDefinition__EnumerationAssignment_1_1_1 ) ) ;
    public final void rule__EnumParameterDefinition__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3160:1: ( ( ( rule__EnumParameterDefinition__EnumerationAssignment_1_1_1 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3161:1: ( ( rule__EnumParameterDefinition__EnumerationAssignment_1_1_1 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3161:1: ( ( rule__EnumParameterDefinition__EnumerationAssignment_1_1_1 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3162:1: ( rule__EnumParameterDefinition__EnumerationAssignment_1_1_1 )
            {
             before(grammarAccess.getEnumParameterDefinitionAccess().getEnumerationAssignment_1_1_1()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3163:1: ( rule__EnumParameterDefinition__EnumerationAssignment_1_1_1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3163:2: rule__EnumParameterDefinition__EnumerationAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__EnumParameterDefinition__EnumerationAssignment_1_1_1_in_rule__EnumParameterDefinition__Group_1_1__1__Impl6397);
            rule__EnumParameterDefinition__EnumerationAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumParameterDefinitionAccess().getEnumerationAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group_1_1__1__Impl"


    // $ANTLR start "rule__EnumParameterDefinition__Group_1_1__2"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3173:1: rule__EnumParameterDefinition__Group_1_1__2 : rule__EnumParameterDefinition__Group_1_1__2__Impl ;
    public final void rule__EnumParameterDefinition__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3177:1: ( rule__EnumParameterDefinition__Group_1_1__2__Impl )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3178:2: rule__EnumParameterDefinition__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__EnumParameterDefinition__Group_1_1__2__Impl_in_rule__EnumParameterDefinition__Group_1_1__26427);
            rule__EnumParameterDefinition__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group_1_1__2"


    // $ANTLR start "rule__EnumParameterDefinition__Group_1_1__2__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3184:1: rule__EnumParameterDefinition__Group_1_1__2__Impl : ( ']' ) ;
    public final void rule__EnumParameterDefinition__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3188:1: ( ( ']' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3189:1: ( ']' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3189:1: ( ']' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3190:1: ']'
            {
             before(grammarAccess.getEnumParameterDefinitionAccess().getRightSquareBracketKeyword_1_1_2()); 
            match(input,25,FOLLOW_25_in_rule__EnumParameterDefinition__Group_1_1__2__Impl6455); 
             after(grammarAccess.getEnumParameterDefinitionAccess().getRightSquareBracketKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__Group_1_1__2__Impl"


    // $ANTLR start "rule__GlobalEnum__Group__0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3209:1: rule__GlobalEnum__Group__0 : rule__GlobalEnum__Group__0__Impl rule__GlobalEnum__Group__1 ;
    public final void rule__GlobalEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3213:1: ( rule__GlobalEnum__Group__0__Impl rule__GlobalEnum__Group__1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3214:2: rule__GlobalEnum__Group__0__Impl rule__GlobalEnum__Group__1
            {
            pushFollow(FOLLOW_rule__GlobalEnum__Group__0__Impl_in_rule__GlobalEnum__Group__06492);
            rule__GlobalEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalEnum__Group__1_in_rule__GlobalEnum__Group__06495);
            rule__GlobalEnum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEnum__Group__0"


    // $ANTLR start "rule__GlobalEnum__Group__0__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3221:1: rule__GlobalEnum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__GlobalEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3225:1: ( ( 'enum' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3226:1: ( 'enum' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3226:1: ( 'enum' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3227:1: 'enum'
            {
             before(grammarAccess.getGlobalEnumAccess().getEnumKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__GlobalEnum__Group__0__Impl6523); 
             after(grammarAccess.getGlobalEnumAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEnum__Group__0__Impl"


    // $ANTLR start "rule__GlobalEnum__Group__1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3240:1: rule__GlobalEnum__Group__1 : rule__GlobalEnum__Group__1__Impl rule__GlobalEnum__Group__2 ;
    public final void rule__GlobalEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3244:1: ( rule__GlobalEnum__Group__1__Impl rule__GlobalEnum__Group__2 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3245:2: rule__GlobalEnum__Group__1__Impl rule__GlobalEnum__Group__2
            {
            pushFollow(FOLLOW_rule__GlobalEnum__Group__1__Impl_in_rule__GlobalEnum__Group__16554);
            rule__GlobalEnum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalEnum__Group__2_in_rule__GlobalEnum__Group__16557);
            rule__GlobalEnum__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEnum__Group__1"


    // $ANTLR start "rule__GlobalEnum__Group__1__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3252:1: rule__GlobalEnum__Group__1__Impl : ( ( rule__GlobalEnum__NameAssignment_1 ) ) ;
    public final void rule__GlobalEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3256:1: ( ( ( rule__GlobalEnum__NameAssignment_1 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3257:1: ( ( rule__GlobalEnum__NameAssignment_1 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3257:1: ( ( rule__GlobalEnum__NameAssignment_1 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3258:1: ( rule__GlobalEnum__NameAssignment_1 )
            {
             before(grammarAccess.getGlobalEnumAccess().getNameAssignment_1()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3259:1: ( rule__GlobalEnum__NameAssignment_1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3259:2: rule__GlobalEnum__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GlobalEnum__NameAssignment_1_in_rule__GlobalEnum__Group__1__Impl6584);
            rule__GlobalEnum__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalEnumAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEnum__Group__1__Impl"


    // $ANTLR start "rule__GlobalEnum__Group__2"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3269:1: rule__GlobalEnum__Group__2 : rule__GlobalEnum__Group__2__Impl rule__GlobalEnum__Group__3 ;
    public final void rule__GlobalEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3273:1: ( rule__GlobalEnum__Group__2__Impl rule__GlobalEnum__Group__3 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3274:2: rule__GlobalEnum__Group__2__Impl rule__GlobalEnum__Group__3
            {
            pushFollow(FOLLOW_rule__GlobalEnum__Group__2__Impl_in_rule__GlobalEnum__Group__26614);
            rule__GlobalEnum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalEnum__Group__3_in_rule__GlobalEnum__Group__26617);
            rule__GlobalEnum__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEnum__Group__2"


    // $ANTLR start "rule__GlobalEnum__Group__2__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3281:1: rule__GlobalEnum__Group__2__Impl : ( '=' ) ;
    public final void rule__GlobalEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3285:1: ( ( '=' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3286:1: ( '=' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3286:1: ( '=' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3287:1: '='
            {
             before(grammarAccess.getGlobalEnumAccess().getEqualsSignKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__GlobalEnum__Group__2__Impl6645); 
             after(grammarAccess.getGlobalEnumAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEnum__Group__2__Impl"


    // $ANTLR start "rule__GlobalEnum__Group__3"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3300:1: rule__GlobalEnum__Group__3 : rule__GlobalEnum__Group__3__Impl rule__GlobalEnum__Group__4 ;
    public final void rule__GlobalEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3304:1: ( rule__GlobalEnum__Group__3__Impl rule__GlobalEnum__Group__4 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3305:2: rule__GlobalEnum__Group__3__Impl rule__GlobalEnum__Group__4
            {
            pushFollow(FOLLOW_rule__GlobalEnum__Group__3__Impl_in_rule__GlobalEnum__Group__36676);
            rule__GlobalEnum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalEnum__Group__4_in_rule__GlobalEnum__Group__36679);
            rule__GlobalEnum__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEnum__Group__3"


    // $ANTLR start "rule__GlobalEnum__Group__3__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3312:1: rule__GlobalEnum__Group__3__Impl : ( '{' ) ;
    public final void rule__GlobalEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3316:1: ( ( '{' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3317:1: ( '{' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3317:1: ( '{' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3318:1: '{'
            {
             before(grammarAccess.getGlobalEnumAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__GlobalEnum__Group__3__Impl6707); 
             after(grammarAccess.getGlobalEnumAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEnum__Group__3__Impl"


    // $ANTLR start "rule__GlobalEnum__Group__4"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3331:1: rule__GlobalEnum__Group__4 : rule__GlobalEnum__Group__4__Impl rule__GlobalEnum__Group__5 ;
    public final void rule__GlobalEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3335:1: ( rule__GlobalEnum__Group__4__Impl rule__GlobalEnum__Group__5 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3336:2: rule__GlobalEnum__Group__4__Impl rule__GlobalEnum__Group__5
            {
            pushFollow(FOLLOW_rule__GlobalEnum__Group__4__Impl_in_rule__GlobalEnum__Group__46738);
            rule__GlobalEnum__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalEnum__Group__5_in_rule__GlobalEnum__Group__46741);
            rule__GlobalEnum__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEnum__Group__4"


    // $ANTLR start "rule__GlobalEnum__Group__4__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3343:1: rule__GlobalEnum__Group__4__Impl : ( ( rule__GlobalEnum__AlternativesAssignment_4 ) ) ;
    public final void rule__GlobalEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3347:1: ( ( ( rule__GlobalEnum__AlternativesAssignment_4 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3348:1: ( ( rule__GlobalEnum__AlternativesAssignment_4 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3348:1: ( ( rule__GlobalEnum__AlternativesAssignment_4 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3349:1: ( rule__GlobalEnum__AlternativesAssignment_4 )
            {
             before(grammarAccess.getGlobalEnumAccess().getAlternativesAssignment_4()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3350:1: ( rule__GlobalEnum__AlternativesAssignment_4 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3350:2: rule__GlobalEnum__AlternativesAssignment_4
            {
            pushFollow(FOLLOW_rule__GlobalEnum__AlternativesAssignment_4_in_rule__GlobalEnum__Group__4__Impl6768);
            rule__GlobalEnum__AlternativesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGlobalEnumAccess().getAlternativesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEnum__Group__4__Impl"


    // $ANTLR start "rule__GlobalEnum__Group__5"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3360:1: rule__GlobalEnum__Group__5 : rule__GlobalEnum__Group__5__Impl rule__GlobalEnum__Group__6 ;
    public final void rule__GlobalEnum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3364:1: ( rule__GlobalEnum__Group__5__Impl rule__GlobalEnum__Group__6 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3365:2: rule__GlobalEnum__Group__5__Impl rule__GlobalEnum__Group__6
            {
            pushFollow(FOLLOW_rule__GlobalEnum__Group__5__Impl_in_rule__GlobalEnum__Group__56798);
            rule__GlobalEnum__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalEnum__Group__6_in_rule__GlobalEnum__Group__56801);
            rule__GlobalEnum__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEnum__Group__5"


    // $ANTLR start "rule__GlobalEnum__Group__5__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3372:1: rule__GlobalEnum__Group__5__Impl : ( ( rule__GlobalEnum__Group_5__0 )* ) ;
    public final void rule__GlobalEnum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3376:1: ( ( ( rule__GlobalEnum__Group_5__0 )* ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3377:1: ( ( rule__GlobalEnum__Group_5__0 )* )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3377:1: ( ( rule__GlobalEnum__Group_5__0 )* )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3378:1: ( rule__GlobalEnum__Group_5__0 )*
            {
             before(grammarAccess.getGlobalEnumAccess().getGroup_5()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3379:1: ( rule__GlobalEnum__Group_5__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3379:2: rule__GlobalEnum__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__GlobalEnum__Group_5__0_in_rule__GlobalEnum__Group__5__Impl6828);
            	    rule__GlobalEnum__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getGlobalEnumAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEnum__Group__5__Impl"


    // $ANTLR start "rule__GlobalEnum__Group__6"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3389:1: rule__GlobalEnum__Group__6 : rule__GlobalEnum__Group__6__Impl ;
    public final void rule__GlobalEnum__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3393:1: ( rule__GlobalEnum__Group__6__Impl )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3394:2: rule__GlobalEnum__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__GlobalEnum__Group__6__Impl_in_rule__GlobalEnum__Group__66859);
            rule__GlobalEnum__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEnum__Group__6"


    // $ANTLR start "rule__GlobalEnum__Group__6__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3400:1: rule__GlobalEnum__Group__6__Impl : ( '}' ) ;
    public final void rule__GlobalEnum__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3404:1: ( ( '}' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3405:1: ( '}' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3405:1: ( '}' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3406:1: '}'
            {
             before(grammarAccess.getGlobalEnumAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__GlobalEnum__Group__6__Impl6887); 
             after(grammarAccess.getGlobalEnumAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEnum__Group__6__Impl"


    // $ANTLR start "rule__GlobalEnum__Group_5__0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3433:1: rule__GlobalEnum__Group_5__0 : rule__GlobalEnum__Group_5__0__Impl rule__GlobalEnum__Group_5__1 ;
    public final void rule__GlobalEnum__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3437:1: ( rule__GlobalEnum__Group_5__0__Impl rule__GlobalEnum__Group_5__1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3438:2: rule__GlobalEnum__Group_5__0__Impl rule__GlobalEnum__Group_5__1
            {
            pushFollow(FOLLOW_rule__GlobalEnum__Group_5__0__Impl_in_rule__GlobalEnum__Group_5__06932);
            rule__GlobalEnum__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalEnum__Group_5__1_in_rule__GlobalEnum__Group_5__06935);
            rule__GlobalEnum__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEnum__Group_5__0"


    // $ANTLR start "rule__GlobalEnum__Group_5__0__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3445:1: rule__GlobalEnum__Group_5__0__Impl : ( ',' ) ;
    public final void rule__GlobalEnum__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3449:1: ( ( ',' ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3450:1: ( ',' )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3450:1: ( ',' )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3451:1: ','
            {
             before(grammarAccess.getGlobalEnumAccess().getCommaKeyword_5_0()); 
            match(input,31,FOLLOW_31_in_rule__GlobalEnum__Group_5__0__Impl6963); 
             after(grammarAccess.getGlobalEnumAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEnum__Group_5__0__Impl"


    // $ANTLR start "rule__GlobalEnum__Group_5__1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3464:1: rule__GlobalEnum__Group_5__1 : rule__GlobalEnum__Group_5__1__Impl ;
    public final void rule__GlobalEnum__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3468:1: ( rule__GlobalEnum__Group_5__1__Impl )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3469:2: rule__GlobalEnum__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__GlobalEnum__Group_5__1__Impl_in_rule__GlobalEnum__Group_5__16994);
            rule__GlobalEnum__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEnum__Group_5__1"


    // $ANTLR start "rule__GlobalEnum__Group_5__1__Impl"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3475:1: rule__GlobalEnum__Group_5__1__Impl : ( ( rule__GlobalEnum__AlternativesAssignment_5_1 ) ) ;
    public final void rule__GlobalEnum__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3479:1: ( ( ( rule__GlobalEnum__AlternativesAssignment_5_1 ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3480:1: ( ( rule__GlobalEnum__AlternativesAssignment_5_1 ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3480:1: ( ( rule__GlobalEnum__AlternativesAssignment_5_1 ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3481:1: ( rule__GlobalEnum__AlternativesAssignment_5_1 )
            {
             before(grammarAccess.getGlobalEnumAccess().getAlternativesAssignment_5_1()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3482:1: ( rule__GlobalEnum__AlternativesAssignment_5_1 )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3482:2: rule__GlobalEnum__AlternativesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__GlobalEnum__AlternativesAssignment_5_1_in_rule__GlobalEnum__Group_5__1__Impl7021);
            rule__GlobalEnum__AlternativesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalEnumAccess().getAlternativesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEnum__Group_5__1__Impl"


    // $ANTLR start "rule__BoxModelOperators__ImportsAssignment_0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3497:1: rule__BoxModelOperators__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__BoxModelOperators__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3501:1: ( ( ruleImport ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3502:1: ( ruleImport )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3502:1: ( ruleImport )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3503:1: ruleImport
            {
             before(grammarAccess.getBoxModelOperatorsAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__BoxModelOperators__ImportsAssignment_07060);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getBoxModelOperatorsAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxModelOperators__ImportsAssignment_0"


    // $ANTLR start "rule__BoxModelOperators__OperatorDefinitionsAssignment_1_0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3512:1: rule__BoxModelOperators__OperatorDefinitionsAssignment_1_0 : ( ruleOperatorDefinition ) ;
    public final void rule__BoxModelOperators__OperatorDefinitionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3516:1: ( ( ruleOperatorDefinition ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3517:1: ( ruleOperatorDefinition )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3517:1: ( ruleOperatorDefinition )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3518:1: ruleOperatorDefinition
            {
             before(grammarAccess.getBoxModelOperatorsAccess().getOperatorDefinitionsOperatorDefinitionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleOperatorDefinition_in_rule__BoxModelOperators__OperatorDefinitionsAssignment_1_07091);
            ruleOperatorDefinition();

            state._fsp--;

             after(grammarAccess.getBoxModelOperatorsAccess().getOperatorDefinitionsOperatorDefinitionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxModelOperators__OperatorDefinitionsAssignment_1_0"


    // $ANTLR start "rule__BoxModelOperators__EnumerationsAssignment_1_1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3527:1: rule__BoxModelOperators__EnumerationsAssignment_1_1 : ( ruleGlobalEnum ) ;
    public final void rule__BoxModelOperators__EnumerationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3531:1: ( ( ruleGlobalEnum ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3532:1: ( ruleGlobalEnum )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3532:1: ( ruleGlobalEnum )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3533:1: ruleGlobalEnum
            {
             before(grammarAccess.getBoxModelOperatorsAccess().getEnumerationsGlobalEnumParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleGlobalEnum_in_rule__BoxModelOperators__EnumerationsAssignment_1_17122);
            ruleGlobalEnum();

            state._fsp--;

             after(grammarAccess.getBoxModelOperatorsAccess().getEnumerationsGlobalEnumParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxModelOperators__EnumerationsAssignment_1_1"


    // $ANTLR start "rule__BoxModelOperators__IntConstantsAssignment_1_2"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3542:1: rule__BoxModelOperators__IntConstantsAssignment_1_2 : ( ruleIntConstant ) ;
    public final void rule__BoxModelOperators__IntConstantsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3546:1: ( ( ruleIntConstant ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3547:1: ( ruleIntConstant )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3547:1: ( ruleIntConstant )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3548:1: ruleIntConstant
            {
             before(grammarAccess.getBoxModelOperatorsAccess().getIntConstantsIntConstantParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleIntConstant_in_rule__BoxModelOperators__IntConstantsAssignment_1_27153);
            ruleIntConstant();

            state._fsp--;

             after(grammarAccess.getBoxModelOperatorsAccess().getIntConstantsIntConstantParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxModelOperators__IntConstantsAssignment_1_2"


    // $ANTLR start "rule__BoxModelOperators__StringConstantsAssignment_1_3"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3557:1: rule__BoxModelOperators__StringConstantsAssignment_1_3 : ( ruleStringConstant ) ;
    public final void rule__BoxModelOperators__StringConstantsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3561:1: ( ( ruleStringConstant ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3562:1: ( ruleStringConstant )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3562:1: ( ruleStringConstant )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3563:1: ruleStringConstant
            {
             before(grammarAccess.getBoxModelOperatorsAccess().getStringConstantsStringConstantParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleStringConstant_in_rule__BoxModelOperators__StringConstantsAssignment_1_37184);
            ruleStringConstant();

            state._fsp--;

             after(grammarAccess.getBoxModelOperatorsAccess().getStringConstantsStringConstantParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxModelOperators__StringConstantsAssignment_1_3"


    // $ANTLR start "rule__StringConstant__NameAssignment_1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3572:1: rule__StringConstant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StringConstant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3576:1: ( ( RULE_ID ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3577:1: ( RULE_ID )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3577:1: ( RULE_ID )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3578:1: RULE_ID
            {
             before(grammarAccess.getStringConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringConstant__NameAssignment_17215); 
             after(grammarAccess.getStringConstantAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstant__NameAssignment_1"


    // $ANTLR start "rule__StringConstant__ValueAssignment_3"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3587:1: rule__StringConstant__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__StringConstant__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3591:1: ( ( RULE_STRING ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3592:1: ( RULE_STRING )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3592:1: ( RULE_STRING )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3593:1: RULE_STRING
            {
             before(grammarAccess.getStringConstantAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringConstant__ValueAssignment_37246); 
             after(grammarAccess.getStringConstantAccess().getValueSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstant__ValueAssignment_3"


    // $ANTLR start "rule__IntConstant__NameAssignment_1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3602:1: rule__IntConstant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IntConstant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3606:1: ( ( RULE_ID ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3607:1: ( RULE_ID )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3607:1: ( RULE_ID )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3608:1: RULE_ID
            {
             before(grammarAccess.getIntConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntConstant__NameAssignment_17277); 
             after(grammarAccess.getIntConstantAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntConstant__NameAssignment_1"


    // $ANTLR start "rule__IntConstant__ValueAssignment_3"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3617:1: rule__IntConstant__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__IntConstant__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3621:1: ( ( RULE_INT ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3622:1: ( RULE_INT )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3622:1: ( RULE_INT )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3623:1: RULE_INT
            {
             before(grammarAccess.getIntConstantAccess().getValueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntConstant__ValueAssignment_37308); 
             after(grammarAccess.getIntConstantAccess().getValueINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntConstant__ValueAssignment_3"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3632:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3636:1: ( ( RULE_STRING ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3637:1: ( RULE_STRING )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3637:1: ( RULE_STRING )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3638:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_17339); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__BasicOperatorDefinition__NameAssignment_1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3647:1: rule__BasicOperatorDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BasicOperatorDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3651:1: ( ( RULE_ID ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3652:1: ( RULE_ID )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3652:1: ( RULE_ID )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3653:1: RULE_ID
            {
             before(grammarAccess.getBasicOperatorDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BasicOperatorDefinition__NameAssignment_17370); 
             after(grammarAccess.getBasicOperatorDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicOperatorDefinition__NameAssignment_1"


    // $ANTLR start "rule__BasicOperatorDefinition__ImplementationAssignment_3"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3662:1: rule__BasicOperatorDefinition__ImplementationAssignment_3 : ( ruleOperatorImplementationString ) ;
    public final void rule__BasicOperatorDefinition__ImplementationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3666:1: ( ( ruleOperatorImplementationString ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3667:1: ( ruleOperatorImplementationString )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3667:1: ( ruleOperatorImplementationString )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3668:1: ruleOperatorImplementationString
            {
             before(grammarAccess.getBasicOperatorDefinitionAccess().getImplementationOperatorImplementationStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleOperatorImplementationString_in_rule__BasicOperatorDefinition__ImplementationAssignment_37401);
            ruleOperatorImplementationString();

            state._fsp--;

             after(grammarAccess.getBasicOperatorDefinitionAccess().getImplementationOperatorImplementationStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicOperatorDefinition__ImplementationAssignment_3"


    // $ANTLR start "rule__BasicOperatorDefinition__ParametersAssignment_5_1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3677:1: rule__BasicOperatorDefinition__ParametersAssignment_5_1 : ( ruleParameterDefinition ) ;
    public final void rule__BasicOperatorDefinition__ParametersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3681:1: ( ( ruleParameterDefinition ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3682:1: ( ruleParameterDefinition )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3682:1: ( ruleParameterDefinition )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3683:1: ruleParameterDefinition
            {
             before(grammarAccess.getBasicOperatorDefinitionAccess().getParametersParameterDefinitionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleParameterDefinition_in_rule__BasicOperatorDefinition__ParametersAssignment_5_17432);
            ruleParameterDefinition();

            state._fsp--;

             after(grammarAccess.getBasicOperatorDefinitionAccess().getParametersParameterDefinitionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicOperatorDefinition__ParametersAssignment_5_1"


    // $ANTLR start "rule__AliasOperatorDefinition__NameAssignment_1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3692:1: rule__AliasOperatorDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AliasOperatorDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3696:1: ( ( RULE_ID ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3697:1: ( RULE_ID )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3697:1: ( RULE_ID )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3698:1: RULE_ID
            {
             before(grammarAccess.getAliasOperatorDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AliasOperatorDefinition__NameAssignment_17463); 
             after(grammarAccess.getAliasOperatorDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasOperatorDefinition__NameAssignment_1"


    // $ANTLR start "rule__AliasOperatorDefinition__OperatorAssignment_3"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3707:1: rule__AliasOperatorDefinition__OperatorAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AliasOperatorDefinition__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3711:1: ( ( ( RULE_ID ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3712:1: ( ( RULE_ID ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3712:1: ( ( RULE_ID ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3713:1: ( RULE_ID )
            {
             before(grammarAccess.getAliasOperatorDefinitionAccess().getOperatorOperatorDefinitionCrossReference_3_0()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3714:1: ( RULE_ID )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3715:1: RULE_ID
            {
             before(grammarAccess.getAliasOperatorDefinitionAccess().getOperatorOperatorDefinitionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AliasOperatorDefinition__OperatorAssignment_37498); 
             after(grammarAccess.getAliasOperatorDefinitionAccess().getOperatorOperatorDefinitionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAliasOperatorDefinitionAccess().getOperatorOperatorDefinitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasOperatorDefinition__OperatorAssignment_3"


    // $ANTLR start "rule__AliasOperatorDefinition__ParametersAssignment_5_1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3726:1: rule__AliasOperatorDefinition__ParametersAssignment_5_1 : ( ruleParameterApplication ) ;
    public final void rule__AliasOperatorDefinition__ParametersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3730:1: ( ( ruleParameterApplication ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3731:1: ( ruleParameterApplication )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3731:1: ( ruleParameterApplication )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3732:1: ruleParameterApplication
            {
             before(grammarAccess.getAliasOperatorDefinitionAccess().getParametersParameterApplicationParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleParameterApplication_in_rule__AliasOperatorDefinition__ParametersAssignment_5_17533);
            ruleParameterApplication();

            state._fsp--;

             after(grammarAccess.getAliasOperatorDefinitionAccess().getParametersParameterApplicationParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasOperatorDefinition__ParametersAssignment_5_1"


    // $ANTLR start "rule__ParameterApplication__ReferencedParameterAssignment_0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3741:1: rule__ParameterApplication__ReferencedParameterAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterApplication__ReferencedParameterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3745:1: ( ( ( RULE_ID ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3746:1: ( ( RULE_ID ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3746:1: ( ( RULE_ID ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3747:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterApplicationAccess().getReferencedParameterParameterDefinitionCrossReference_0_0()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3748:1: ( RULE_ID )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3749:1: RULE_ID
            {
             before(grammarAccess.getParameterApplicationAccess().getReferencedParameterParameterDefinitionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterApplication__ReferencedParameterAssignment_07568); 
             after(grammarAccess.getParameterApplicationAccess().getReferencedParameterParameterDefinitionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getParameterApplicationAccess().getReferencedParameterParameterDefinitionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterApplication__ReferencedParameterAssignment_0"


    // $ANTLR start "rule__ParameterApplication__ValueAssignment_2"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3760:1: rule__ParameterApplication__ValueAssignment_2 : ( ruleParameterApplicationValue ) ;
    public final void rule__ParameterApplication__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3764:1: ( ( ruleParameterApplicationValue ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3765:1: ( ruleParameterApplicationValue )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3765:1: ( ruleParameterApplicationValue )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3766:1: ruleParameterApplicationValue
            {
             before(grammarAccess.getParameterApplicationAccess().getValueParameterApplicationValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleParameterApplicationValue_in_rule__ParameterApplication__ValueAssignment_27603);
            ruleParameterApplicationValue();

            state._fsp--;

             after(grammarAccess.getParameterApplicationAccess().getValueParameterApplicationValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterApplication__ValueAssignment_2"


    // $ANTLR start "rule__StringParameterDefinition__NameAssignment_1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3775:1: rule__StringParameterDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StringParameterDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3779:1: ( ( RULE_ID ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3780:1: ( RULE_ID )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3780:1: ( RULE_ID )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3781:1: RULE_ID
            {
             before(grammarAccess.getStringParameterDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringParameterDefinition__NameAssignment_17634); 
             after(grammarAccess.getStringParameterDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParameterDefinition__NameAssignment_1"


    // $ANTLR start "rule__StringParameterDefinition__ValueAssignment_3"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3790:1: rule__StringParameterDefinition__ValueAssignment_3 : ( ruleStringParameterValue ) ;
    public final void rule__StringParameterDefinition__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3794:1: ( ( ruleStringParameterValue ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3795:1: ( ruleStringParameterValue )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3795:1: ( ruleStringParameterValue )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3796:1: ruleStringParameterValue
            {
             before(grammarAccess.getStringParameterDefinitionAccess().getValueStringParameterValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStringParameterValue_in_rule__StringParameterDefinition__ValueAssignment_37665);
            ruleStringParameterValue();

            state._fsp--;

             after(grammarAccess.getStringParameterDefinitionAccess().getValueStringParameterValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParameterDefinition__ValueAssignment_3"


    // $ANTLR start "rule__IntParameterDefinition__NameAssignment_1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3805:1: rule__IntParameterDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IntParameterDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3809:1: ( ( RULE_ID ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3810:1: ( RULE_ID )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3810:1: ( RULE_ID )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3811:1: RULE_ID
            {
             before(grammarAccess.getIntParameterDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntParameterDefinition__NameAssignment_17696); 
             after(grammarAccess.getIntParameterDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntParameterDefinition__NameAssignment_1"


    // $ANTLR start "rule__IntParameterDefinition__ValueAssignment_3"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3820:1: rule__IntParameterDefinition__ValueAssignment_3 : ( ruleIntParameterValue ) ;
    public final void rule__IntParameterDefinition__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3824:1: ( ( ruleIntParameterValue ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3825:1: ( ruleIntParameterValue )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3825:1: ( ruleIntParameterValue )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3826:1: ruleIntParameterValue
            {
             before(grammarAccess.getIntParameterDefinitionAccess().getValueIntParameterValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleIntParameterValue_in_rule__IntParameterDefinition__ValueAssignment_37727);
            ruleIntParameterValue();

            state._fsp--;

             after(grammarAccess.getIntParameterDefinitionAccess().getValueIntParameterValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntParameterDefinition__ValueAssignment_3"


    // $ANTLR start "rule__EnumParameterDefinition__AlternativesAssignment_1_0_0"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3835:1: rule__EnumParameterDefinition__AlternativesAssignment_1_0_0 : ( ruleEnumAlternative ) ;
    public final void rule__EnumParameterDefinition__AlternativesAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3839:1: ( ( ruleEnumAlternative ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3840:1: ( ruleEnumAlternative )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3840:1: ( ruleEnumAlternative )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3841:1: ruleEnumAlternative
            {
             before(grammarAccess.getEnumParameterDefinitionAccess().getAlternativesEnumAlternativeParserRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_ruleEnumAlternative_in_rule__EnumParameterDefinition__AlternativesAssignment_1_0_07758);
            ruleEnumAlternative();

            state._fsp--;

             after(grammarAccess.getEnumParameterDefinitionAccess().getAlternativesEnumAlternativeParserRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__AlternativesAssignment_1_0_0"


    // $ANTLR start "rule__EnumParameterDefinition__AlternativesAssignment_1_0_1_1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3850:1: rule__EnumParameterDefinition__AlternativesAssignment_1_0_1_1 : ( ruleEnumAlternative ) ;
    public final void rule__EnumParameterDefinition__AlternativesAssignment_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3854:1: ( ( ruleEnumAlternative ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3855:1: ( ruleEnumAlternative )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3855:1: ( ruleEnumAlternative )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3856:1: ruleEnumAlternative
            {
             before(grammarAccess.getEnumParameterDefinitionAccess().getAlternativesEnumAlternativeParserRuleCall_1_0_1_1_0()); 
            pushFollow(FOLLOW_ruleEnumAlternative_in_rule__EnumParameterDefinition__AlternativesAssignment_1_0_1_17789);
            ruleEnumAlternative();

            state._fsp--;

             after(grammarAccess.getEnumParameterDefinitionAccess().getAlternativesEnumAlternativeParserRuleCall_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__AlternativesAssignment_1_0_1_1"


    // $ANTLR start "rule__EnumParameterDefinition__EnumerationAssignment_1_1_1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3865:1: rule__EnumParameterDefinition__EnumerationAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__EnumParameterDefinition__EnumerationAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3869:1: ( ( ( RULE_ID ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3870:1: ( ( RULE_ID ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3870:1: ( ( RULE_ID ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3871:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumParameterDefinitionAccess().getEnumerationGlobalEnumCrossReference_1_1_1_0()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3872:1: ( RULE_ID )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3873:1: RULE_ID
            {
             before(grammarAccess.getEnumParameterDefinitionAccess().getEnumerationGlobalEnumIDTerminalRuleCall_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumParameterDefinition__EnumerationAssignment_1_1_17824); 
             after(grammarAccess.getEnumParameterDefinitionAccess().getEnumerationGlobalEnumIDTerminalRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getEnumParameterDefinitionAccess().getEnumerationGlobalEnumCrossReference_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__EnumerationAssignment_1_1_1"


    // $ANTLR start "rule__EnumParameterDefinition__NameAssignment_3"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3884:1: rule__EnumParameterDefinition__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__EnumParameterDefinition__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3888:1: ( ( RULE_ID ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3889:1: ( RULE_ID )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3889:1: ( RULE_ID )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3890:1: RULE_ID
            {
             before(grammarAccess.getEnumParameterDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumParameterDefinition__NameAssignment_37859); 
             after(grammarAccess.getEnumParameterDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__NameAssignment_3"


    // $ANTLR start "rule__EnumParameterDefinition__ValueAssignment_5"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3899:1: rule__EnumParameterDefinition__ValueAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__EnumParameterDefinition__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3903:1: ( ( ( RULE_ID ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3904:1: ( ( RULE_ID ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3904:1: ( ( RULE_ID ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3905:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumParameterDefinitionAccess().getValueEnumAlternativeCrossReference_5_0()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3906:1: ( RULE_ID )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3907:1: RULE_ID
            {
             before(grammarAccess.getEnumParameterDefinitionAccess().getValueEnumAlternativeIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumParameterDefinition__ValueAssignment_57894); 
             after(grammarAccess.getEnumParameterDefinitionAccess().getValueEnumAlternativeIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getEnumParameterDefinitionAccess().getValueEnumAlternativeCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumParameterDefinition__ValueAssignment_5"


    // $ANTLR start "rule__GlobalEnum__NameAssignment_1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3918:1: rule__GlobalEnum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GlobalEnum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3922:1: ( ( RULE_ID ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3923:1: ( RULE_ID )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3923:1: ( RULE_ID )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3924:1: RULE_ID
            {
             before(grammarAccess.getGlobalEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GlobalEnum__NameAssignment_17929); 
             after(grammarAccess.getGlobalEnumAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEnum__NameAssignment_1"


    // $ANTLR start "rule__GlobalEnum__AlternativesAssignment_4"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3933:1: rule__GlobalEnum__AlternativesAssignment_4 : ( ruleEnumAlternative ) ;
    public final void rule__GlobalEnum__AlternativesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3937:1: ( ( ruleEnumAlternative ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3938:1: ( ruleEnumAlternative )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3938:1: ( ruleEnumAlternative )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3939:1: ruleEnumAlternative
            {
             before(grammarAccess.getGlobalEnumAccess().getAlternativesEnumAlternativeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEnumAlternative_in_rule__GlobalEnum__AlternativesAssignment_47960);
            ruleEnumAlternative();

            state._fsp--;

             after(grammarAccess.getGlobalEnumAccess().getAlternativesEnumAlternativeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEnum__AlternativesAssignment_4"


    // $ANTLR start "rule__GlobalEnum__AlternativesAssignment_5_1"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3948:1: rule__GlobalEnum__AlternativesAssignment_5_1 : ( ruleEnumAlternative ) ;
    public final void rule__GlobalEnum__AlternativesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3952:1: ( ( ruleEnumAlternative ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3953:1: ( ruleEnumAlternative )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3953:1: ( ruleEnumAlternative )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3954:1: ruleEnumAlternative
            {
             before(grammarAccess.getGlobalEnumAccess().getAlternativesEnumAlternativeParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleEnumAlternative_in_rule__GlobalEnum__AlternativesAssignment_5_17991);
            ruleEnumAlternative();

            state._fsp--;

             after(grammarAccess.getGlobalEnumAccess().getAlternativesEnumAlternativeParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEnum__AlternativesAssignment_5_1"


    // $ANTLR start "rule__EnumAlternative__NameAssignment"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3963:1: rule__EnumAlternative__NameAssignment : ( RULE_ID ) ;
    public final void rule__EnumAlternative__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3967:1: ( ( RULE_ID ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3968:1: ( RULE_ID )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3968:1: ( RULE_ID )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3969:1: RULE_ID
            {
             before(grammarAccess.getEnumAlternativeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumAlternative__NameAssignment8022); 
             after(grammarAccess.getEnumAlternativeAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumAlternative__NameAssignment"


    // $ANTLR start "rule__ConstantReferenceValue__ValueAssignment"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3978:1: rule__ConstantReferenceValue__ValueAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ConstantReferenceValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3982:1: ( ( ( RULE_ID ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3983:1: ( ( RULE_ID ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3983:1: ( ( RULE_ID ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3984:1: ( RULE_ID )
            {
             before(grammarAccess.getConstantReferenceValueAccess().getValueConstantCrossReference_0()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3985:1: ( RULE_ID )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3986:1: RULE_ID
            {
             before(grammarAccess.getConstantReferenceValueAccess().getValueConstantIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantReferenceValue__ValueAssignment8057); 
             after(grammarAccess.getConstantReferenceValueAccess().getValueConstantIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getConstantReferenceValueAccess().getValueConstantCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantReferenceValue__ValueAssignment"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:3997:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4001:1: ( ( RULE_STRING ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4002:1: ( RULE_STRING )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4002:1: ( RULE_STRING )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4003:1: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment8092); 
             after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ValueAssignment"


    // $ANTLR start "rule__StringConstantApplication__ValueAssignment"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4012:1: rule__StringConstantApplication__ValueAssignment : ( ( RULE_ID ) ) ;
    public final void rule__StringConstantApplication__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4016:1: ( ( ( RULE_ID ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4017:1: ( ( RULE_ID ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4017:1: ( ( RULE_ID ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4018:1: ( RULE_ID )
            {
             before(grammarAccess.getStringConstantApplicationAccess().getValueStringConstantCrossReference_0()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4019:1: ( RULE_ID )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4020:1: RULE_ID
            {
             before(grammarAccess.getStringConstantApplicationAccess().getValueStringConstantIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringConstantApplication__ValueAssignment8127); 
             after(grammarAccess.getStringConstantApplicationAccess().getValueStringConstantIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getStringConstantApplicationAccess().getValueStringConstantCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstantApplication__ValueAssignment"


    // $ANTLR start "rule__IntValue__ValueAssignment"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4031:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4035:1: ( ( RULE_INT ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4036:1: ( RULE_INT )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4036:1: ( RULE_INT )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4037:1: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment8162); 
             after(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__ValueAssignment"


    // $ANTLR start "rule__IntConstantApplication__ValueAssignment"
    // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4046:1: rule__IntConstantApplication__ValueAssignment : ( ( RULE_ID ) ) ;
    public final void rule__IntConstantApplication__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4050:1: ( ( ( RULE_ID ) ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4051:1: ( ( RULE_ID ) )
            {
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4051:1: ( ( RULE_ID ) )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4052:1: ( RULE_ID )
            {
             before(grammarAccess.getIntConstantApplicationAccess().getValueIntConstantCrossReference_0()); 
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4053:1: ( RULE_ID )
            // ../gpp.tests.operators.ui/src-gen/gpp/tests/operators/ui/contentassist/antlr/internal/InternalOperatorsTest.g:4054:1: RULE_ID
            {
             before(grammarAccess.getIntConstantApplicationAccess().getValueIntConstantIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntConstantApplication__ValueAssignment8197); 
             after(grammarAccess.getIntConstantApplicationAccess().getValueIntConstantIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getIntConstantApplicationAccess().getValueIntConstantCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntConstantApplication__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleBoxModelOperators_in_entryRuleBoxModelOperators61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoxModelOperators68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoxModelOperators__Group__0_in_ruleBoxModelOperators94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstant_in_entryRuleStringConstant121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringConstant128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstant__Group__0_in_ruleStringConstant154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntConstant_in_entryRuleIntConstant181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntConstant188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntConstant__Group__0_in_ruleIntConstant214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorImplementationString_in_entryRuleOperatorImplementationString301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorImplementationString308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorImplementationString__Group__0_in_ruleOperatorImplementationString334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorDefinition_in_entryRuleOperatorDefinition361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorDefinition368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorDefinition__Alternatives_in_ruleOperatorDefinition394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicOperatorDefinition_in_entryRuleBasicOperatorDefinition421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicOperatorDefinition428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__Group__0_in_ruleBasicOperatorDefinition454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionalOperatorDefinition_in_entryRulePositionalOperatorDefinition481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePositionalOperatorDefinition488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PositionalOperatorDefinition__Group__0_in_rulePositionalOperatorDefinition514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHighlightOperatorDefinition_in_entryRuleHighlightOperatorDefinition541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHighlightOperatorDefinition548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HighlightOperatorDefinition__Group__0_in_ruleHighlightOperatorDefinition574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransformingOperatorDefinition_in_entryRuleTransformingOperatorDefinition601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransformingOperatorDefinition608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransformingOperatorDefinition__Group__0_in_ruleTransformingOperatorDefinition634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasOperatorDefinition_in_entryRuleAliasOperatorDefinition661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasOperatorDefinition668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AliasOperatorDefinition__Group__0_in_ruleAliasOperatorDefinition694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterApplication_in_entryRuleParameterApplication721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterApplication728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterApplication__Group__0_in_ruleParameterApplication754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDefinition_in_entryRuleParameterDefinition781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDefinition788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDefinition__Alternatives_in_ruleParameterDefinition814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringParameterDefinition_in_entryRuleStringParameterDefinition841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringParameterDefinition848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringParameterDefinition__Group__0_in_ruleStringParameterDefinition874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntParameterDefinition_in_entryRuleIntParameterDefinition901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntParameterDefinition908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntParameterDefinition__Group__0_in_ruleIntParameterDefinition934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumParameterDefinition_in_entryRuleEnumParameterDefinition961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumParameterDefinition968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group__0_in_ruleEnumParameterDefinition994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalEnum_in_entryRuleGlobalEnum1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalEnum1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalEnum__Group__0_in_ruleGlobalEnum1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumAlternative_in_entryRuleEnumAlternative1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumAlternative1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumAlternative__NameAssignment_in_ruleEnumAlternative1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringParameterValue_in_entryRuleStringParameterValue1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringParameterValue1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringParameterValue__Alternatives_in_ruleStringParameterValue1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterApplicationValue_in_entryRuleParameterApplicationValue1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterApplicationValue1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterApplicationValue__Alternatives_in_ruleParameterApplicationValue1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantReferenceValue_in_entryRuleConstantReferenceValue1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantReferenceValue1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantReferenceValue__ValueAssignment_in_ruleConstantReferenceValue1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstantApplication_in_entryRuleStringConstantApplication1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringConstantApplication1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstantApplication__ValueAssignment_in_ruleStringConstantApplication1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntParameterValue_in_entryRuleIntParameterValue1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntParameterValue1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntParameterValue__Alternatives_in_ruleIntParameterValue1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntConstantApplication_in_entryRuleIntConstantApplication1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntConstantApplication1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntConstantApplication__ValueAssignment_in_ruleIntConstantApplication1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoxModelOperators__OperatorDefinitionsAssignment_1_0_in_rule__BoxModelOperators__Alternatives_11632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoxModelOperators__EnumerationsAssignment_1_1_in_rule__BoxModelOperators__Alternatives_11650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoxModelOperators__IntConstantsAssignment_1_2_in_rule__BoxModelOperators__Alternatives_11668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoxModelOperators__StringConstantsAssignment_1_3_in_rule__BoxModelOperators__Alternatives_11686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__StringConstant__Alternatives_01720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__StringConstant__Alternatives_01740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__IntConstant__Alternatives_01775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__IntConstant__Alternatives_01795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicOperatorDefinition_in_rule__OperatorDefinition__Alternatives1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasOperatorDefinition_in_rule__OperatorDefinition__Alternatives1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHighlightOperatorDefinition_in_rule__BasicOperatorDefinition__Alternatives_01878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionalOperatorDefinition_in_rule__BasicOperatorDefinition__Alternatives_01895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransformingOperatorDefinition_in_rule__BasicOperatorDefinition__Alternatives_01912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PositionalOperatorDefinition__Alternatives_11945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PositionalOperatorDefinition__Alternatives_11965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__HighlightOperatorDefinition__Alternatives_12000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__HighlightOperatorDefinition__Alternatives_12020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TransformingOperatorDefinition__Alternatives_12055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TransformingOperatorDefinition__Alternatives_12075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringParameterDefinition_in_rule__ParameterDefinition__Alternatives2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntParameterDefinition_in_rule__ParameterDefinition__Alternatives2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumParameterDefinition_in_rule__ParameterDefinition__Alternatives2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__StringParameterDefinition__Alternatives_02176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__StringParameterDefinition__Alternatives_02196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__IntParameterDefinition__Alternatives_02231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__IntParameterDefinition__Alternatives_02251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group_1_0__0_in_rule__EnumParameterDefinition__Alternatives_12285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group_1_1__0_in_rule__EnumParameterDefinition__Alternatives_12303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__StringParameterValue__Alternatives2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstantApplication_in_rule__StringParameterValue__Alternatives2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__ParameterApplicationValue__Alternatives2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__ParameterApplicationValue__Alternatives2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantReferenceValue_in_rule__ParameterApplicationValue__Alternatives2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__IntParameterValue__Alternatives2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntConstantApplication_in_rule__IntParameterValue__Alternatives2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoxModelOperators__Group__0__Impl_in_rule__BoxModelOperators__Group__02499 = new BitSet(new long[]{0x00000001101FF800L});
    public static final BitSet FOLLOW_rule__BoxModelOperators__Group__1_in_rule__BoxModelOperators__Group__02502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoxModelOperators__ImportsAssignment_0_in_rule__BoxModelOperators__Group__0__Impl2529 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__BoxModelOperators__Group__1__Impl_in_rule__BoxModelOperators__Group__12560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoxModelOperators__Alternatives_1_in_rule__BoxModelOperators__Group__1__Impl2587 = new BitSet(new long[]{0x00000001101FF802L});
    public static final BitSet FOLLOW_rule__StringConstant__Group__0__Impl_in_rule__StringConstant__Group__02622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringConstant__Group__1_in_rule__StringConstant__Group__02625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstant__Alternatives_0_in_rule__StringConstant__Group__0__Impl2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstant__Group__1__Impl_in_rule__StringConstant__Group__12682 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__StringConstant__Group__2_in_rule__StringConstant__Group__12685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstant__NameAssignment_1_in_rule__StringConstant__Group__1__Impl2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstant__Group__2__Impl_in_rule__StringConstant__Group__22742 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringConstant__Group__3_in_rule__StringConstant__Group__22745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StringConstant__Group__2__Impl2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstant__Group__3__Impl_in_rule__StringConstant__Group__32804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstant__ValueAssignment_3_in_rule__StringConstant__Group__3__Impl2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntConstant__Group__0__Impl_in_rule__IntConstant__Group__02869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IntConstant__Group__1_in_rule__IntConstant__Group__02872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntConstant__Alternatives_0_in_rule__IntConstant__Group__0__Impl2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntConstant__Group__1__Impl_in_rule__IntConstant__Group__12929 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__IntConstant__Group__2_in_rule__IntConstant__Group__12932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntConstant__NameAssignment_1_in_rule__IntConstant__Group__1__Impl2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntConstant__Group__2__Impl_in_rule__IntConstant__Group__22989 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntConstant__Group__3_in_rule__IntConstant__Group__22992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__IntConstant__Group__2__Impl3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntConstant__Group__3__Impl_in_rule__IntConstant__Group__33051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntConstant__ValueAssignment_3_in_rule__IntConstant__Group__3__Impl3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03116 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Import__Group__0__Impl3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorImplementationString__Group__0__Impl_in_rule__OperatorImplementationString__Group__03239 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__OperatorImplementationString__Group__1_in_rule__OperatorImplementationString__Group__03242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OperatorImplementationString__Group__0__Impl3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorImplementationString__Group__1__Impl_in_rule__OperatorImplementationString__Group__13298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorImplementationString__Group_1__0_in_rule__OperatorImplementationString__Group__1__Impl3325 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__OperatorImplementationString__Group_1__0__Impl_in_rule__OperatorImplementationString__Group_1__03360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OperatorImplementationString__Group_1__1_in_rule__OperatorImplementationString__Group_1__03363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__OperatorImplementationString__Group_1__0__Impl3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorImplementationString__Group_1__1__Impl_in_rule__OperatorImplementationString__Group_1__13422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OperatorImplementationString__Group_1__1__Impl3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__Group__0__Impl_in_rule__BasicOperatorDefinition__Group__03482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__Group__1_in_rule__BasicOperatorDefinition__Group__03485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__Alternatives_0_in_rule__BasicOperatorDefinition__Group__0__Impl3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__Group__1__Impl_in_rule__BasicOperatorDefinition__Group__13542 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__Group__2_in_rule__BasicOperatorDefinition__Group__13545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__NameAssignment_1_in_rule__BasicOperatorDefinition__Group__1__Impl3572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__Group__2__Impl_in_rule__BasicOperatorDefinition__Group__23602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__Group__3_in_rule__BasicOperatorDefinition__Group__23605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BasicOperatorDefinition__Group__2__Impl3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__Group__3__Impl_in_rule__BasicOperatorDefinition__Group__33664 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__Group__4_in_rule__BasicOperatorDefinition__Group__33667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__ImplementationAssignment_3_in_rule__BasicOperatorDefinition__Group__3__Impl3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__Group__4__Impl_in_rule__BasicOperatorDefinition__Group__43724 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__Group__5_in_rule__BasicOperatorDefinition__Group__43727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BasicOperatorDefinition__Group__4__Impl3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__Group__5__Impl_in_rule__BasicOperatorDefinition__Group__53786 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__Group__6_in_rule__BasicOperatorDefinition__Group__53789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__Group_5__0_in_rule__BasicOperatorDefinition__Group__5__Impl3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__Group__6__Impl_in_rule__BasicOperatorDefinition__Group__63847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BasicOperatorDefinition__Group__6__Impl3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__Group_5__0__Impl_in_rule__BasicOperatorDefinition__Group_5__03920 = new BitSet(new long[]{0x0000000020007800L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__Group_5__1_in_rule__BasicOperatorDefinition__Group_5__03923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BasicOperatorDefinition__Group_5__0__Impl3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__Group_5__1__Impl_in_rule__BasicOperatorDefinition__Group_5__13982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__ParametersAssignment_5_1_in_rule__BasicOperatorDefinition__Group_5__1__Impl4011 = new BitSet(new long[]{0x0000000020007802L});
    public static final BitSet FOLLOW_rule__BasicOperatorDefinition__ParametersAssignment_5_1_in_rule__BasicOperatorDefinition__Group_5__1__Impl4023 = new BitSet(new long[]{0x0000000020007802L});
    public static final BitSet FOLLOW_rule__PositionalOperatorDefinition__Group__0__Impl_in_rule__PositionalOperatorDefinition__Group__04060 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__PositionalOperatorDefinition__Group__1_in_rule__PositionalOperatorDefinition__Group__04063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PositionalOperatorDefinition__Group__1__Impl_in_rule__PositionalOperatorDefinition__Group__14121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PositionalOperatorDefinition__Alternatives_1_in_rule__PositionalOperatorDefinition__Group__1__Impl4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HighlightOperatorDefinition__Group__0__Impl_in_rule__HighlightOperatorDefinition__Group__04182 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__HighlightOperatorDefinition__Group__1_in_rule__HighlightOperatorDefinition__Group__04185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HighlightOperatorDefinition__Group__1__Impl_in_rule__HighlightOperatorDefinition__Group__14243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HighlightOperatorDefinition__Alternatives_1_in_rule__HighlightOperatorDefinition__Group__1__Impl4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransformingOperatorDefinition__Group__0__Impl_in_rule__TransformingOperatorDefinition__Group__04304 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_rule__TransformingOperatorDefinition__Group__1_in_rule__TransformingOperatorDefinition__Group__04307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransformingOperatorDefinition__Group__1__Impl_in_rule__TransformingOperatorDefinition__Group__14365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransformingOperatorDefinition__Alternatives_1_in_rule__TransformingOperatorDefinition__Group__1__Impl4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AliasOperatorDefinition__Group__0__Impl_in_rule__AliasOperatorDefinition__Group__04426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AliasOperatorDefinition__Group__1_in_rule__AliasOperatorDefinition__Group__04429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AliasOperatorDefinition__Group__0__Impl4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AliasOperatorDefinition__Group__1__Impl_in_rule__AliasOperatorDefinition__Group__14488 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__AliasOperatorDefinition__Group__2_in_rule__AliasOperatorDefinition__Group__14491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AliasOperatorDefinition__NameAssignment_1_in_rule__AliasOperatorDefinition__Group__1__Impl4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AliasOperatorDefinition__Group__2__Impl_in_rule__AliasOperatorDefinition__Group__24548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AliasOperatorDefinition__Group__3_in_rule__AliasOperatorDefinition__Group__24551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__AliasOperatorDefinition__Group__2__Impl4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AliasOperatorDefinition__Group__3__Impl_in_rule__AliasOperatorDefinition__Group__34610 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__AliasOperatorDefinition__Group__4_in_rule__AliasOperatorDefinition__Group__34613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AliasOperatorDefinition__OperatorAssignment_3_in_rule__AliasOperatorDefinition__Group__3__Impl4640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AliasOperatorDefinition__Group__4__Impl_in_rule__AliasOperatorDefinition__Group__44670 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__AliasOperatorDefinition__Group__5_in_rule__AliasOperatorDefinition__Group__44673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__AliasOperatorDefinition__Group__4__Impl4701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AliasOperatorDefinition__Group__5__Impl_in_rule__AliasOperatorDefinition__Group__54732 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__AliasOperatorDefinition__Group__6_in_rule__AliasOperatorDefinition__Group__54735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AliasOperatorDefinition__Group_5__0_in_rule__AliasOperatorDefinition__Group__5__Impl4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AliasOperatorDefinition__Group__6__Impl_in_rule__AliasOperatorDefinition__Group__64793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__AliasOperatorDefinition__Group__6__Impl4821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AliasOperatorDefinition__Group_5__0__Impl_in_rule__AliasOperatorDefinition__Group_5__04866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AliasOperatorDefinition__Group_5__1_in_rule__AliasOperatorDefinition__Group_5__04869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__AliasOperatorDefinition__Group_5__0__Impl4897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AliasOperatorDefinition__Group_5__1__Impl_in_rule__AliasOperatorDefinition__Group_5__14928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AliasOperatorDefinition__ParametersAssignment_5_1_in_rule__AliasOperatorDefinition__Group_5__1__Impl4957 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__AliasOperatorDefinition__ParametersAssignment_5_1_in_rule__AliasOperatorDefinition__Group_5__1__Impl4969 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ParameterApplication__Group__0__Impl_in_rule__ParameterApplication__Group__05006 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ParameterApplication__Group__1_in_rule__ParameterApplication__Group__05009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterApplication__ReferencedParameterAssignment_0_in_rule__ParameterApplication__Group__0__Impl5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterApplication__Group__1__Impl_in_rule__ParameterApplication__Group__15066 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__ParameterApplication__Group__2_in_rule__ParameterApplication__Group__15069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ParameterApplication__Group__1__Impl5097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterApplication__Group__2__Impl_in_rule__ParameterApplication__Group__25128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterApplication__ValueAssignment_2_in_rule__ParameterApplication__Group__2__Impl5155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringParameterDefinition__Group__0__Impl_in_rule__StringParameterDefinition__Group__05191 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringParameterDefinition__Group__1_in_rule__StringParameterDefinition__Group__05194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringParameterDefinition__Alternatives_0_in_rule__StringParameterDefinition__Group__0__Impl5221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringParameterDefinition__Group__1__Impl_in_rule__StringParameterDefinition__Group__15251 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__StringParameterDefinition__Group__2_in_rule__StringParameterDefinition__Group__15254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringParameterDefinition__NameAssignment_1_in_rule__StringParameterDefinition__Group__1__Impl5281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringParameterDefinition__Group__2__Impl_in_rule__StringParameterDefinition__Group__25311 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__StringParameterDefinition__Group__3_in_rule__StringParameterDefinition__Group__25314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StringParameterDefinition__Group__2__Impl5342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringParameterDefinition__Group__3__Impl_in_rule__StringParameterDefinition__Group__35373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringParameterDefinition__ValueAssignment_3_in_rule__StringParameterDefinition__Group__3__Impl5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntParameterDefinition__Group__0__Impl_in_rule__IntParameterDefinition__Group__05438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IntParameterDefinition__Group__1_in_rule__IntParameterDefinition__Group__05441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntParameterDefinition__Alternatives_0_in_rule__IntParameterDefinition__Group__0__Impl5468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntParameterDefinition__Group__1__Impl_in_rule__IntParameterDefinition__Group__15498 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__IntParameterDefinition__Group__2_in_rule__IntParameterDefinition__Group__15501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntParameterDefinition__NameAssignment_1_in_rule__IntParameterDefinition__Group__1__Impl5528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntParameterDefinition__Group__2__Impl_in_rule__IntParameterDefinition__Group__25558 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__IntParameterDefinition__Group__3_in_rule__IntParameterDefinition__Group__25561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__IntParameterDefinition__Group__2__Impl5589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntParameterDefinition__Group__3__Impl_in_rule__IntParameterDefinition__Group__35620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntParameterDefinition__ValueAssignment_3_in_rule__IntParameterDefinition__Group__3__Impl5647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group__0__Impl_in_rule__EnumParameterDefinition__Group__05685 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group__1_in_rule__EnumParameterDefinition__Group__05688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EnumParameterDefinition__Group__0__Impl5716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group__1__Impl_in_rule__EnumParameterDefinition__Group__15747 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group__2_in_rule__EnumParameterDefinition__Group__15750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Alternatives_1_in_rule__EnumParameterDefinition__Group__1__Impl5777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group__2__Impl_in_rule__EnumParameterDefinition__Group__25807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group__3_in_rule__EnumParameterDefinition__Group__25810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EnumParameterDefinition__Group__2__Impl5838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group__3__Impl_in_rule__EnumParameterDefinition__Group__35869 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group__4_in_rule__EnumParameterDefinition__Group__35872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__NameAssignment_3_in_rule__EnumParameterDefinition__Group__3__Impl5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group__4__Impl_in_rule__EnumParameterDefinition__Group__45929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group__5_in_rule__EnumParameterDefinition__Group__45932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumParameterDefinition__Group__4__Impl5960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group__5__Impl_in_rule__EnumParameterDefinition__Group__55991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__ValueAssignment_5_in_rule__EnumParameterDefinition__Group__5__Impl6018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group_1_0__0__Impl_in_rule__EnumParameterDefinition__Group_1_0__06060 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group_1_0__1_in_rule__EnumParameterDefinition__Group_1_0__06063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__AlternativesAssignment_1_0_0_in_rule__EnumParameterDefinition__Group_1_0__0__Impl6090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group_1_0__1__Impl_in_rule__EnumParameterDefinition__Group_1_0__16120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group_1_0_1__0_in_rule__EnumParameterDefinition__Group_1_0__1__Impl6147 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group_1_0_1__0__Impl_in_rule__EnumParameterDefinition__Group_1_0_1__06182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group_1_0_1__1_in_rule__EnumParameterDefinition__Group_1_0_1__06185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EnumParameterDefinition__Group_1_0_1__0__Impl6213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group_1_0_1__1__Impl_in_rule__EnumParameterDefinition__Group_1_0_1__16244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__AlternativesAssignment_1_0_1_1_in_rule__EnumParameterDefinition__Group_1_0_1__1__Impl6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group_1_1__0__Impl_in_rule__EnumParameterDefinition__Group_1_1__06305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group_1_1__1_in_rule__EnumParameterDefinition__Group_1_1__06308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EnumParameterDefinition__Group_1_1__0__Impl6336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group_1_1__1__Impl_in_rule__EnumParameterDefinition__Group_1_1__16367 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group_1_1__2_in_rule__EnumParameterDefinition__Group_1_1__16370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__EnumerationAssignment_1_1_1_in_rule__EnumParameterDefinition__Group_1_1__1__Impl6397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumParameterDefinition__Group_1_1__2__Impl_in_rule__EnumParameterDefinition__Group_1_1__26427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EnumParameterDefinition__Group_1_1__2__Impl6455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalEnum__Group__0__Impl_in_rule__GlobalEnum__Group__06492 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GlobalEnum__Group__1_in_rule__GlobalEnum__Group__06495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__GlobalEnum__Group__0__Impl6523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalEnum__Group__1__Impl_in_rule__GlobalEnum__Group__16554 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__GlobalEnum__Group__2_in_rule__GlobalEnum__Group__16557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalEnum__NameAssignment_1_in_rule__GlobalEnum__Group__1__Impl6584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalEnum__Group__2__Impl_in_rule__GlobalEnum__Group__26614 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__GlobalEnum__Group__3_in_rule__GlobalEnum__Group__26617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__GlobalEnum__Group__2__Impl6645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalEnum__Group__3__Impl_in_rule__GlobalEnum__Group__36676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GlobalEnum__Group__4_in_rule__GlobalEnum__Group__36679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__GlobalEnum__Group__3__Impl6707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalEnum__Group__4__Impl_in_rule__GlobalEnum__Group__46738 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__GlobalEnum__Group__5_in_rule__GlobalEnum__Group__46741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalEnum__AlternativesAssignment_4_in_rule__GlobalEnum__Group__4__Impl6768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalEnum__Group__5__Impl_in_rule__GlobalEnum__Group__56798 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__GlobalEnum__Group__6_in_rule__GlobalEnum__Group__56801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalEnum__Group_5__0_in_rule__GlobalEnum__Group__5__Impl6828 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__GlobalEnum__Group__6__Impl_in_rule__GlobalEnum__Group__66859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__GlobalEnum__Group__6__Impl6887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalEnum__Group_5__0__Impl_in_rule__GlobalEnum__Group_5__06932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GlobalEnum__Group_5__1_in_rule__GlobalEnum__Group_5__06935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__GlobalEnum__Group_5__0__Impl6963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalEnum__Group_5__1__Impl_in_rule__GlobalEnum__Group_5__16994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalEnum__AlternativesAssignment_5_1_in_rule__GlobalEnum__Group_5__1__Impl7021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__BoxModelOperators__ImportsAssignment_07060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorDefinition_in_rule__BoxModelOperators__OperatorDefinitionsAssignment_1_07091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalEnum_in_rule__BoxModelOperators__EnumerationsAssignment_1_17122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntConstant_in_rule__BoxModelOperators__IntConstantsAssignment_1_27153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstant_in_rule__BoxModelOperators__StringConstantsAssignment_1_37184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringConstant__NameAssignment_17215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringConstant__ValueAssignment_37246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntConstant__NameAssignment_17277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntConstant__ValueAssignment_37308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_17339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BasicOperatorDefinition__NameAssignment_17370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorImplementationString_in_rule__BasicOperatorDefinition__ImplementationAssignment_37401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDefinition_in_rule__BasicOperatorDefinition__ParametersAssignment_5_17432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AliasOperatorDefinition__NameAssignment_17463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AliasOperatorDefinition__OperatorAssignment_37498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterApplication_in_rule__AliasOperatorDefinition__ParametersAssignment_5_17533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterApplication__ReferencedParameterAssignment_07568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterApplicationValue_in_rule__ParameterApplication__ValueAssignment_27603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringParameterDefinition__NameAssignment_17634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringParameterValue_in_rule__StringParameterDefinition__ValueAssignment_37665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntParameterDefinition__NameAssignment_17696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntParameterValue_in_rule__IntParameterDefinition__ValueAssignment_37727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumAlternative_in_rule__EnumParameterDefinition__AlternativesAssignment_1_0_07758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumAlternative_in_rule__EnumParameterDefinition__AlternativesAssignment_1_0_1_17789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumParameterDefinition__EnumerationAssignment_1_1_17824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumParameterDefinition__NameAssignment_37859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumParameterDefinition__ValueAssignment_57894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GlobalEnum__NameAssignment_17929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumAlternative_in_rule__GlobalEnum__AlternativesAssignment_47960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumAlternative_in_rule__GlobalEnum__AlternativesAssignment_5_17991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumAlternative__NameAssignment8022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantReferenceValue__ValueAssignment8057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment8092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringConstantApplication__ValueAssignment8127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment8162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntConstantApplication__ValueAssignment8197 = new BitSet(new long[]{0x0000000000000002L});

}