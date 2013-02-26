package gpp.tests.operators.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import gpp.tests.operators.services.OperatorsTestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOperatorsTestParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'str'", "'='", "'integer'", "'int'", "'import'", "'.'", "'['", "']'", "':'", "';'", "'pop'", "'poperator'", "'hlop'", "'hloperator'", "'top'", "'toperator'", "'alias'", "'{'", "','", "'}'", "'enum'"
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
    public String getGrammarFileName() { return "../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g"; }



     	private OperatorsTestGrammarAccess grammarAccess;
     	
        public InternalOperatorsTestParser(TokenStream input, OperatorsTestGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "BoxModelOperators";	
       	}
       	
       	@Override
       	protected OperatorsTestGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleBoxModelOperators"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:67:1: entryRuleBoxModelOperators returns [EObject current=null] : iv_ruleBoxModelOperators= ruleBoxModelOperators EOF ;
    public final EObject entryRuleBoxModelOperators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoxModelOperators = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:68:2: (iv_ruleBoxModelOperators= ruleBoxModelOperators EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:69:2: iv_ruleBoxModelOperators= ruleBoxModelOperators EOF
            {
             newCompositeNode(grammarAccess.getBoxModelOperatorsRule()); 
            pushFollow(FOLLOW_ruleBoxModelOperators_in_entryRuleBoxModelOperators75);
            iv_ruleBoxModelOperators=ruleBoxModelOperators();

            state._fsp--;

             current =iv_ruleBoxModelOperators; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoxModelOperators85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoxModelOperators"


    // $ANTLR start "ruleBoxModelOperators"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:76:1: ruleBoxModelOperators returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_operatorDefinitions_1_0= ruleOperatorDefinition ) ) | ( (lv_enumerations_2_0= ruleGlobalEnum ) ) | ( (lv_intConstants_3_0= ruleIntConstant ) ) | ( (lv_stringConstants_4_0= ruleStringConstant ) ) )* ) ;
    public final EObject ruleBoxModelOperators() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_operatorDefinitions_1_0 = null;

        EObject lv_enumerations_2_0 = null;

        EObject lv_intConstants_3_0 = null;

        EObject lv_stringConstants_4_0 = null;


         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_operatorDefinitions_1_0= ruleOperatorDefinition ) ) | ( (lv_enumerations_2_0= ruleGlobalEnum ) ) | ( (lv_intConstants_3_0= ruleIntConstant ) ) | ( (lv_stringConstants_4_0= ruleStringConstant ) ) )* ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_operatorDefinitions_1_0= ruleOperatorDefinition ) ) | ( (lv_enumerations_2_0= ruleGlobalEnum ) ) | ( (lv_intConstants_3_0= ruleIntConstant ) ) | ( (lv_stringConstants_4_0= ruleStringConstant ) ) )* )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_operatorDefinitions_1_0= ruleOperatorDefinition ) ) | ( (lv_enumerations_2_0= ruleGlobalEnum ) ) | ( (lv_intConstants_3_0= ruleIntConstant ) ) | ( (lv_stringConstants_4_0= ruleStringConstant ) ) )* )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_operatorDefinitions_1_0= ruleOperatorDefinition ) ) | ( (lv_enumerations_2_0= ruleGlobalEnum ) ) | ( (lv_intConstants_3_0= ruleIntConstant ) ) | ( (lv_stringConstants_4_0= ruleStringConstant ) ) )*
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBoxModelOperatorsAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleBoxModelOperators131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBoxModelOperatorsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:98:3: ( ( (lv_operatorDefinitions_1_0= ruleOperatorDefinition ) ) | ( (lv_enumerations_2_0= ruleGlobalEnum ) ) | ( (lv_intConstants_3_0= ruleIntConstant ) ) | ( (lv_stringConstants_4_0= ruleStringConstant ) ) )*
            loop2:
            do {
                int alt2=5;
                switch ( input.LA(1) ) {
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                    {
                    alt2=1;
                    }
                    break;
                case 32:
                    {
                    alt2=2;
                    }
                    break;
                case 14:
                case 15:
                    {
                    alt2=3;
                    }
                    break;
                case 11:
                case 12:
                    {
                    alt2=4;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:98:4: ( (lv_operatorDefinitions_1_0= ruleOperatorDefinition ) )
            	    {
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:98:4: ( (lv_operatorDefinitions_1_0= ruleOperatorDefinition ) )
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:99:1: (lv_operatorDefinitions_1_0= ruleOperatorDefinition )
            	    {
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:99:1: (lv_operatorDefinitions_1_0= ruleOperatorDefinition )
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:100:3: lv_operatorDefinitions_1_0= ruleOperatorDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBoxModelOperatorsAccess().getOperatorDefinitionsOperatorDefinitionParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperatorDefinition_in_ruleBoxModelOperators154);
            	    lv_operatorDefinitions_1_0=ruleOperatorDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBoxModelOperatorsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operatorDefinitions",
            	            		lv_operatorDefinitions_1_0, 
            	            		"OperatorDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:117:6: ( (lv_enumerations_2_0= ruleGlobalEnum ) )
            	    {
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:117:6: ( (lv_enumerations_2_0= ruleGlobalEnum ) )
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:118:1: (lv_enumerations_2_0= ruleGlobalEnum )
            	    {
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:118:1: (lv_enumerations_2_0= ruleGlobalEnum )
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:119:3: lv_enumerations_2_0= ruleGlobalEnum
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBoxModelOperatorsAccess().getEnumerationsGlobalEnumParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGlobalEnum_in_ruleBoxModelOperators181);
            	    lv_enumerations_2_0=ruleGlobalEnum();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBoxModelOperatorsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"enumerations",
            	            		lv_enumerations_2_0, 
            	            		"GlobalEnum");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:136:6: ( (lv_intConstants_3_0= ruleIntConstant ) )
            	    {
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:136:6: ( (lv_intConstants_3_0= ruleIntConstant ) )
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:137:1: (lv_intConstants_3_0= ruleIntConstant )
            	    {
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:137:1: (lv_intConstants_3_0= ruleIntConstant )
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:138:3: lv_intConstants_3_0= ruleIntConstant
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBoxModelOperatorsAccess().getIntConstantsIntConstantParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIntConstant_in_ruleBoxModelOperators208);
            	    lv_intConstants_3_0=ruleIntConstant();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBoxModelOperatorsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"intConstants",
            	            		lv_intConstants_3_0, 
            	            		"IntConstant");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:155:6: ( (lv_stringConstants_4_0= ruleStringConstant ) )
            	    {
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:155:6: ( (lv_stringConstants_4_0= ruleStringConstant ) )
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:156:1: (lv_stringConstants_4_0= ruleStringConstant )
            	    {
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:156:1: (lv_stringConstants_4_0= ruleStringConstant )
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:157:3: lv_stringConstants_4_0= ruleStringConstant
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBoxModelOperatorsAccess().getStringConstantsStringConstantParserRuleCall_1_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStringConstant_in_ruleBoxModelOperators235);
            	    lv_stringConstants_4_0=ruleStringConstant();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBoxModelOperatorsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stringConstants",
            	            		lv_stringConstants_4_0, 
            	            		"StringConstant");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoxModelOperators"


    // $ANTLR start "entryRuleStringConstant"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:181:1: entryRuleStringConstant returns [EObject current=null] : iv_ruleStringConstant= ruleStringConstant EOF ;
    public final EObject entryRuleStringConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringConstant = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:182:2: (iv_ruleStringConstant= ruleStringConstant EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:183:2: iv_ruleStringConstant= ruleStringConstant EOF
            {
             newCompositeNode(grammarAccess.getStringConstantRule()); 
            pushFollow(FOLLOW_ruleStringConstant_in_entryRuleStringConstant273);
            iv_ruleStringConstant=ruleStringConstant();

            state._fsp--;

             current =iv_ruleStringConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringConstant283); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringConstant"


    // $ANTLR start "ruleStringConstant"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:190:1: ruleStringConstant returns [EObject current=null] : ( (otherlv_0= 'string' | otherlv_1= 'str' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;

         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:193:28: ( ( (otherlv_0= 'string' | otherlv_1= 'str' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:194:1: ( (otherlv_0= 'string' | otherlv_1= 'str' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:194:1: ( (otherlv_0= 'string' | otherlv_1= 'str' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:194:2: (otherlv_0= 'string' | otherlv_1= 'str' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:194:2: (otherlv_0= 'string' | otherlv_1= 'str' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:194:4: otherlv_0= 'string'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleStringConstant321); 

                        	newLeafNode(otherlv_0, grammarAccess.getStringConstantAccess().getStringKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:199:7: otherlv_1= 'str'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleStringConstant339); 

                        	newLeafNode(otherlv_1, grammarAccess.getStringConstantAccess().getStrKeyword_0_1());
                        

                    }
                    break;

            }

            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:203:2: ( (lv_name_2_0= RULE_ID ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:204:1: (lv_name_2_0= RULE_ID )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:204:1: (lv_name_2_0= RULE_ID )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:205:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringConstant357); 

            			newLeafNode(lv_name_2_0, grammarAccess.getStringConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringConstantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleStringConstant374); 

                	newLeafNode(otherlv_3, grammarAccess.getStringConstantAccess().getEqualsSignKeyword_2());
                
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:225:1: ( (lv_value_4_0= RULE_STRING ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:226:1: (lv_value_4_0= RULE_STRING )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:226:1: (lv_value_4_0= RULE_STRING )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:227:3: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringConstant391); 

            			newLeafNode(lv_value_4_0, grammarAccess.getStringConstantAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringConstantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringConstant"


    // $ANTLR start "entryRuleIntConstant"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:251:1: entryRuleIntConstant returns [EObject current=null] : iv_ruleIntConstant= ruleIntConstant EOF ;
    public final EObject entryRuleIntConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntConstant = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:252:2: (iv_ruleIntConstant= ruleIntConstant EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:253:2: iv_ruleIntConstant= ruleIntConstant EOF
            {
             newCompositeNode(grammarAccess.getIntConstantRule()); 
            pushFollow(FOLLOW_ruleIntConstant_in_entryRuleIntConstant432);
            iv_ruleIntConstant=ruleIntConstant();

            state._fsp--;

             current =iv_ruleIntConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntConstant442); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntConstant"


    // $ANTLR start "ruleIntConstant"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:260:1: ruleIntConstant returns [EObject current=null] : ( (otherlv_0= 'integer' | otherlv_1= 'int' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) ) ) ;
    public final EObject ruleIntConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;

         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:263:28: ( ( (otherlv_0= 'integer' | otherlv_1= 'int' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:264:1: ( (otherlv_0= 'integer' | otherlv_1= 'int' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) ) )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:264:1: ( (otherlv_0= 'integer' | otherlv_1= 'int' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:264:2: (otherlv_0= 'integer' | otherlv_1= 'int' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:264:2: (otherlv_0= 'integer' | otherlv_1= 'int' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:264:4: otherlv_0= 'integer'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleIntConstant480); 

                        	newLeafNode(otherlv_0, grammarAccess.getIntConstantAccess().getIntegerKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:269:7: otherlv_1= 'int'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleIntConstant498); 

                        	newLeafNode(otherlv_1, grammarAccess.getIntConstantAccess().getIntKeyword_0_1());
                        

                    }
                    break;

            }

            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:273:2: ( (lv_name_2_0= RULE_ID ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:274:1: (lv_name_2_0= RULE_ID )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:274:1: (lv_name_2_0= RULE_ID )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:275:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntConstant516); 

            			newLeafNode(lv_name_2_0, grammarAccess.getIntConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntConstantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleIntConstant533); 

                	newLeafNode(otherlv_3, grammarAccess.getIntConstantAccess().getEqualsSignKeyword_2());
                
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:295:1: ( (lv_value_4_0= RULE_INT ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:296:1: (lv_value_4_0= RULE_INT )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:296:1: (lv_value_4_0= RULE_INT )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:297:3: lv_value_4_0= RULE_INT
            {
            lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntConstant550); 

            			newLeafNode(lv_value_4_0, grammarAccess.getIntConstantAccess().getValueINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntConstantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntConstant"


    // $ANTLR start "entryRuleImport"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:321:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:322:2: (iv_ruleImport= ruleImport EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:323:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport591);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport601); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:330:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:333:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:334:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:334:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:334:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleImport638); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:338:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:339:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:339:1: (lv_importURI_1_0= RULE_STRING )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:340:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport655); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleOperatorImplementationString"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:364:1: entryRuleOperatorImplementationString returns [String current=null] : iv_ruleOperatorImplementationString= ruleOperatorImplementationString EOF ;
    public final String entryRuleOperatorImplementationString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperatorImplementationString = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:365:2: (iv_ruleOperatorImplementationString= ruleOperatorImplementationString EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:366:2: iv_ruleOperatorImplementationString= ruleOperatorImplementationString EOF
            {
             newCompositeNode(grammarAccess.getOperatorImplementationStringRule()); 
            pushFollow(FOLLOW_ruleOperatorImplementationString_in_entryRuleOperatorImplementationString697);
            iv_ruleOperatorImplementationString=ruleOperatorImplementationString();

            state._fsp--;

             current =iv_ruleOperatorImplementationString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorImplementationString708); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperatorImplementationString"


    // $ANTLR start "ruleOperatorImplementationString"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:373:1: ruleOperatorImplementationString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleOperatorImplementationString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:376:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:377:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:377:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:377:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperatorImplementationString748); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getOperatorImplementationStringAccess().getIDTerminalRuleCall_0()); 
                
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:384:1: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:385:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FOLLOW_17_in_ruleOperatorImplementationString767); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getOperatorImplementationStringAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperatorImplementationString782); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getOperatorImplementationStringAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperatorImplementationString"


    // $ANTLR start "entryRuleOperatorDefinition"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:405:1: entryRuleOperatorDefinition returns [EObject current=null] : iv_ruleOperatorDefinition= ruleOperatorDefinition EOF ;
    public final EObject entryRuleOperatorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorDefinition = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:406:2: (iv_ruleOperatorDefinition= ruleOperatorDefinition EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:407:2: iv_ruleOperatorDefinition= ruleOperatorDefinition EOF
            {
             newCompositeNode(grammarAccess.getOperatorDefinitionRule()); 
            pushFollow(FOLLOW_ruleOperatorDefinition_in_entryRuleOperatorDefinition829);
            iv_ruleOperatorDefinition=ruleOperatorDefinition();

            state._fsp--;

             current =iv_ruleOperatorDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorDefinition839); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperatorDefinition"


    // $ANTLR start "ruleOperatorDefinition"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:414:1: ruleOperatorDefinition returns [EObject current=null] : (this_BasicOperatorDefinition_0= ruleBasicOperatorDefinition | this_AliasOperatorDefinition_1= ruleAliasOperatorDefinition ) ;
    public final EObject ruleOperatorDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_BasicOperatorDefinition_0 = null;

        EObject this_AliasOperatorDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:417:28: ( (this_BasicOperatorDefinition_0= ruleBasicOperatorDefinition | this_AliasOperatorDefinition_1= ruleAliasOperatorDefinition ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:418:1: (this_BasicOperatorDefinition_0= ruleBasicOperatorDefinition | this_AliasOperatorDefinition_1= ruleAliasOperatorDefinition )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:418:1: (this_BasicOperatorDefinition_0= ruleBasicOperatorDefinition | this_AliasOperatorDefinition_1= ruleAliasOperatorDefinition )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=22 && LA6_0<=27)) ) {
                alt6=1;
            }
            else if ( (LA6_0==28) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:419:5: this_BasicOperatorDefinition_0= ruleBasicOperatorDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getOperatorDefinitionAccess().getBasicOperatorDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBasicOperatorDefinition_in_ruleOperatorDefinition886);
                    this_BasicOperatorDefinition_0=ruleBasicOperatorDefinition();

                    state._fsp--;

                     
                            current = this_BasicOperatorDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:429:5: this_AliasOperatorDefinition_1= ruleAliasOperatorDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getOperatorDefinitionAccess().getAliasOperatorDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAliasOperatorDefinition_in_ruleOperatorDefinition913);
                    this_AliasOperatorDefinition_1=ruleAliasOperatorDefinition();

                    state._fsp--;

                     
                            current = this_AliasOperatorDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperatorDefinition"


    // $ANTLR start "entryRuleBasicOperatorDefinition"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:445:1: entryRuleBasicOperatorDefinition returns [EObject current=null] : iv_ruleBasicOperatorDefinition= ruleBasicOperatorDefinition EOF ;
    public final EObject entryRuleBasicOperatorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicOperatorDefinition = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:446:2: (iv_ruleBasicOperatorDefinition= ruleBasicOperatorDefinition EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:447:2: iv_ruleBasicOperatorDefinition= ruleBasicOperatorDefinition EOF
            {
             newCompositeNode(grammarAccess.getBasicOperatorDefinitionRule()); 
            pushFollow(FOLLOW_ruleBasicOperatorDefinition_in_entryRuleBasicOperatorDefinition948);
            iv_ruleBasicOperatorDefinition=ruleBasicOperatorDefinition();

            state._fsp--;

             current =iv_ruleBasicOperatorDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicOperatorDefinition958); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicOperatorDefinition"


    // $ANTLR start "ruleBasicOperatorDefinition"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:454:1: ruleBasicOperatorDefinition returns [EObject current=null] : ( (this_HighlightOperatorDefinition_0= ruleHighlightOperatorDefinition | this_PositionalOperatorDefinition_1= rulePositionalOperatorDefinition | this_TransformingOperatorDefinition_2= ruleTransformingOperatorDefinition ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_implementation_5_0= ruleOperatorImplementationString ) ) otherlv_6= ']' (otherlv_7= ':' ( (lv_parameters_8_0= ruleParameterDefinition ) )+ )? otherlv_9= ';' ) ;
    public final EObject ruleBasicOperatorDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_HighlightOperatorDefinition_0 = null;

        EObject this_PositionalOperatorDefinition_1 = null;

        EObject this_TransformingOperatorDefinition_2 = null;

        AntlrDatatypeRuleToken lv_implementation_5_0 = null;

        EObject lv_parameters_8_0 = null;


         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:457:28: ( ( (this_HighlightOperatorDefinition_0= ruleHighlightOperatorDefinition | this_PositionalOperatorDefinition_1= rulePositionalOperatorDefinition | this_TransformingOperatorDefinition_2= ruleTransformingOperatorDefinition ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_implementation_5_0= ruleOperatorImplementationString ) ) otherlv_6= ']' (otherlv_7= ':' ( (lv_parameters_8_0= ruleParameterDefinition ) )+ )? otherlv_9= ';' ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:458:1: ( (this_HighlightOperatorDefinition_0= ruleHighlightOperatorDefinition | this_PositionalOperatorDefinition_1= rulePositionalOperatorDefinition | this_TransformingOperatorDefinition_2= ruleTransformingOperatorDefinition ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_implementation_5_0= ruleOperatorImplementationString ) ) otherlv_6= ']' (otherlv_7= ':' ( (lv_parameters_8_0= ruleParameterDefinition ) )+ )? otherlv_9= ';' )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:458:1: ( (this_HighlightOperatorDefinition_0= ruleHighlightOperatorDefinition | this_PositionalOperatorDefinition_1= rulePositionalOperatorDefinition | this_TransformingOperatorDefinition_2= ruleTransformingOperatorDefinition ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_implementation_5_0= ruleOperatorImplementationString ) ) otherlv_6= ']' (otherlv_7= ':' ( (lv_parameters_8_0= ruleParameterDefinition ) )+ )? otherlv_9= ';' )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:458:2: (this_HighlightOperatorDefinition_0= ruleHighlightOperatorDefinition | this_PositionalOperatorDefinition_1= rulePositionalOperatorDefinition | this_TransformingOperatorDefinition_2= ruleTransformingOperatorDefinition ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_implementation_5_0= ruleOperatorImplementationString ) ) otherlv_6= ']' (otherlv_7= ':' ( (lv_parameters_8_0= ruleParameterDefinition ) )+ )? otherlv_9= ';'
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:458:2: (this_HighlightOperatorDefinition_0= ruleHighlightOperatorDefinition | this_PositionalOperatorDefinition_1= rulePositionalOperatorDefinition | this_TransformingOperatorDefinition_2= ruleTransformingOperatorDefinition )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 24:
            case 25:
                {
                alt7=1;
                }
                break;
            case 22:
            case 23:
                {
                alt7=2;
                }
                break;
            case 26:
            case 27:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:459:5: this_HighlightOperatorDefinition_0= ruleHighlightOperatorDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getBasicOperatorDefinitionAccess().getHighlightOperatorDefinitionParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleHighlightOperatorDefinition_in_ruleBasicOperatorDefinition1006);
                    this_HighlightOperatorDefinition_0=ruleHighlightOperatorDefinition();

                    state._fsp--;

                     
                            current = this_HighlightOperatorDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:469:5: this_PositionalOperatorDefinition_1= rulePositionalOperatorDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getBasicOperatorDefinitionAccess().getPositionalOperatorDefinitionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_rulePositionalOperatorDefinition_in_ruleBasicOperatorDefinition1033);
                    this_PositionalOperatorDefinition_1=rulePositionalOperatorDefinition();

                    state._fsp--;

                     
                            current = this_PositionalOperatorDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:479:5: this_TransformingOperatorDefinition_2= ruleTransformingOperatorDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getBasicOperatorDefinitionAccess().getTransformingOperatorDefinitionParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleTransformingOperatorDefinition_in_ruleBasicOperatorDefinition1060);
                    this_TransformingOperatorDefinition_2=ruleTransformingOperatorDefinition();

                    state._fsp--;

                     
                            current = this_TransformingOperatorDefinition_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:487:2: ( (lv_name_3_0= RULE_ID ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:488:1: (lv_name_3_0= RULE_ID )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:488:1: (lv_name_3_0= RULE_ID )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:489:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBasicOperatorDefinition1077); 

            			newLeafNode(lv_name_3_0, grammarAccess.getBasicOperatorDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBasicOperatorDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleBasicOperatorDefinition1094); 

                	newLeafNode(otherlv_4, grammarAccess.getBasicOperatorDefinitionAccess().getLeftSquareBracketKeyword_2());
                
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:509:1: ( (lv_implementation_5_0= ruleOperatorImplementationString ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:510:1: (lv_implementation_5_0= ruleOperatorImplementationString )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:510:1: (lv_implementation_5_0= ruleOperatorImplementationString )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:511:3: lv_implementation_5_0= ruleOperatorImplementationString
            {
             
            	        newCompositeNode(grammarAccess.getBasicOperatorDefinitionAccess().getImplementationOperatorImplementationStringParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleOperatorImplementationString_in_ruleBasicOperatorDefinition1115);
            lv_implementation_5_0=ruleOperatorImplementationString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBasicOperatorDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"implementation",
                    		lv_implementation_5_0, 
                    		"OperatorImplementationString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleBasicOperatorDefinition1127); 

                	newLeafNode(otherlv_6, grammarAccess.getBasicOperatorDefinitionAccess().getRightSquareBracketKeyword_4());
                
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:531:1: (otherlv_7= ':' ( (lv_parameters_8_0= ruleParameterDefinition ) )+ )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:531:3: otherlv_7= ':' ( (lv_parameters_8_0= ruleParameterDefinition ) )+
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleBasicOperatorDefinition1140); 

                        	newLeafNode(otherlv_7, grammarAccess.getBasicOperatorDefinitionAccess().getColonKeyword_5_0());
                        
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:535:1: ( (lv_parameters_8_0= ruleParameterDefinition ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=11 && LA8_0<=12)||(LA8_0>=14 && LA8_0<=15)||LA8_0==29) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:536:1: (lv_parameters_8_0= ruleParameterDefinition )
                    	    {
                    	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:536:1: (lv_parameters_8_0= ruleParameterDefinition )
                    	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:537:3: lv_parameters_8_0= ruleParameterDefinition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBasicOperatorDefinitionAccess().getParametersParameterDefinitionParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameterDefinition_in_ruleBasicOperatorDefinition1161);
                    	    lv_parameters_8_0=ruleParameterDefinition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBasicOperatorDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_8_0, 
                    	            		"ParameterDefinition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleBasicOperatorDefinition1176); 

                	newLeafNode(otherlv_9, grammarAccess.getBasicOperatorDefinitionAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicOperatorDefinition"


    // $ANTLR start "entryRulePositionalOperatorDefinition"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:565:1: entryRulePositionalOperatorDefinition returns [EObject current=null] : iv_rulePositionalOperatorDefinition= rulePositionalOperatorDefinition EOF ;
    public final EObject entryRulePositionalOperatorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionalOperatorDefinition = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:566:2: (iv_rulePositionalOperatorDefinition= rulePositionalOperatorDefinition EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:567:2: iv_rulePositionalOperatorDefinition= rulePositionalOperatorDefinition EOF
            {
             newCompositeNode(grammarAccess.getPositionalOperatorDefinitionRule()); 
            pushFollow(FOLLOW_rulePositionalOperatorDefinition_in_entryRulePositionalOperatorDefinition1212);
            iv_rulePositionalOperatorDefinition=rulePositionalOperatorDefinition();

            state._fsp--;

             current =iv_rulePositionalOperatorDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePositionalOperatorDefinition1222); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePositionalOperatorDefinition"


    // $ANTLR start "rulePositionalOperatorDefinition"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:574:1: rulePositionalOperatorDefinition returns [EObject current=null] : ( () (otherlv_1= 'pop' | otherlv_2= 'poperator' ) ) ;
    public final EObject rulePositionalOperatorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:577:28: ( ( () (otherlv_1= 'pop' | otherlv_2= 'poperator' ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:578:1: ( () (otherlv_1= 'pop' | otherlv_2= 'poperator' ) )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:578:1: ( () (otherlv_1= 'pop' | otherlv_2= 'poperator' ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:578:2: () (otherlv_1= 'pop' | otherlv_2= 'poperator' )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:578:2: ()
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:579:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPositionalOperatorDefinitionAccess().getPositionalOperatorDefinitionAction_0(),
                        current);
                

            }

            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:584:2: (otherlv_1= 'pop' | otherlv_2= 'poperator' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:584:4: otherlv_1= 'pop'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_rulePositionalOperatorDefinition1269); 

                        	newLeafNode(otherlv_1, grammarAccess.getPositionalOperatorDefinitionAccess().getPopKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:589:7: otherlv_2= 'poperator'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_rulePositionalOperatorDefinition1287); 

                        	newLeafNode(otherlv_2, grammarAccess.getPositionalOperatorDefinitionAccess().getPoperatorKeyword_1_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePositionalOperatorDefinition"


    // $ANTLR start "entryRuleHighlightOperatorDefinition"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:601:1: entryRuleHighlightOperatorDefinition returns [EObject current=null] : iv_ruleHighlightOperatorDefinition= ruleHighlightOperatorDefinition EOF ;
    public final EObject entryRuleHighlightOperatorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighlightOperatorDefinition = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:602:2: (iv_ruleHighlightOperatorDefinition= ruleHighlightOperatorDefinition EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:603:2: iv_ruleHighlightOperatorDefinition= ruleHighlightOperatorDefinition EOF
            {
             newCompositeNode(grammarAccess.getHighlightOperatorDefinitionRule()); 
            pushFollow(FOLLOW_ruleHighlightOperatorDefinition_in_entryRuleHighlightOperatorDefinition1324);
            iv_ruleHighlightOperatorDefinition=ruleHighlightOperatorDefinition();

            state._fsp--;

             current =iv_ruleHighlightOperatorDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHighlightOperatorDefinition1334); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHighlightOperatorDefinition"


    // $ANTLR start "ruleHighlightOperatorDefinition"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:610:1: ruleHighlightOperatorDefinition returns [EObject current=null] : ( () (otherlv_1= 'hlop' | otherlv_2= 'hloperator' ) ) ;
    public final EObject ruleHighlightOperatorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:613:28: ( ( () (otherlv_1= 'hlop' | otherlv_2= 'hloperator' ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:614:1: ( () (otherlv_1= 'hlop' | otherlv_2= 'hloperator' ) )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:614:1: ( () (otherlv_1= 'hlop' | otherlv_2= 'hloperator' ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:614:2: () (otherlv_1= 'hlop' | otherlv_2= 'hloperator' )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:614:2: ()
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:615:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHighlightOperatorDefinitionAccess().getHighlightOperatorDefinitionAction_0(),
                        current);
                

            }

            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:620:2: (otherlv_1= 'hlop' | otherlv_2= 'hloperator' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:620:4: otherlv_1= 'hlop'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleHighlightOperatorDefinition1381); 

                        	newLeafNode(otherlv_1, grammarAccess.getHighlightOperatorDefinitionAccess().getHlopKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:625:7: otherlv_2= 'hloperator'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleHighlightOperatorDefinition1399); 

                        	newLeafNode(otherlv_2, grammarAccess.getHighlightOperatorDefinitionAccess().getHloperatorKeyword_1_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHighlightOperatorDefinition"


    // $ANTLR start "entryRuleTransformingOperatorDefinition"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:637:1: entryRuleTransformingOperatorDefinition returns [EObject current=null] : iv_ruleTransformingOperatorDefinition= ruleTransformingOperatorDefinition EOF ;
    public final EObject entryRuleTransformingOperatorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformingOperatorDefinition = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:638:2: (iv_ruleTransformingOperatorDefinition= ruleTransformingOperatorDefinition EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:639:2: iv_ruleTransformingOperatorDefinition= ruleTransformingOperatorDefinition EOF
            {
             newCompositeNode(grammarAccess.getTransformingOperatorDefinitionRule()); 
            pushFollow(FOLLOW_ruleTransformingOperatorDefinition_in_entryRuleTransformingOperatorDefinition1436);
            iv_ruleTransformingOperatorDefinition=ruleTransformingOperatorDefinition();

            state._fsp--;

             current =iv_ruleTransformingOperatorDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransformingOperatorDefinition1446); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransformingOperatorDefinition"


    // $ANTLR start "ruleTransformingOperatorDefinition"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:646:1: ruleTransformingOperatorDefinition returns [EObject current=null] : ( () (otherlv_1= 'top' | otherlv_2= 'toperator' ) ) ;
    public final EObject ruleTransformingOperatorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:649:28: ( ( () (otherlv_1= 'top' | otherlv_2= 'toperator' ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:650:1: ( () (otherlv_1= 'top' | otherlv_2= 'toperator' ) )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:650:1: ( () (otherlv_1= 'top' | otherlv_2= 'toperator' ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:650:2: () (otherlv_1= 'top' | otherlv_2= 'toperator' )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:650:2: ()
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:651:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTransformingOperatorDefinitionAccess().getTransformingOperatorDefinitionAction_0(),
                        current);
                

            }

            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:656:2: (otherlv_1= 'top' | otherlv_2= 'toperator' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==27) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:656:4: otherlv_1= 'top'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleTransformingOperatorDefinition1493); 

                        	newLeafNode(otherlv_1, grammarAccess.getTransformingOperatorDefinitionAccess().getTopKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:661:7: otherlv_2= 'toperator'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleTransformingOperatorDefinition1511); 

                        	newLeafNode(otherlv_2, grammarAccess.getTransformingOperatorDefinitionAccess().getToperatorKeyword_1_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransformingOperatorDefinition"


    // $ANTLR start "entryRuleAliasOperatorDefinition"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:673:1: entryRuleAliasOperatorDefinition returns [EObject current=null] : iv_ruleAliasOperatorDefinition= ruleAliasOperatorDefinition EOF ;
    public final EObject entryRuleAliasOperatorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasOperatorDefinition = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:674:2: (iv_ruleAliasOperatorDefinition= ruleAliasOperatorDefinition EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:675:2: iv_ruleAliasOperatorDefinition= ruleAliasOperatorDefinition EOF
            {
             newCompositeNode(grammarAccess.getAliasOperatorDefinitionRule()); 
            pushFollow(FOLLOW_ruleAliasOperatorDefinition_in_entryRuleAliasOperatorDefinition1548);
            iv_ruleAliasOperatorDefinition=ruleAliasOperatorDefinition();

            state._fsp--;

             current =iv_ruleAliasOperatorDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasOperatorDefinition1558); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAliasOperatorDefinition"


    // $ANTLR start "ruleAliasOperatorDefinition"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:682:1: ruleAliasOperatorDefinition returns [EObject current=null] : (otherlv_0= 'alias' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' (otherlv_5= ':' ( (lv_parameters_6_0= ruleParameterApplication ) )+ )? otherlv_7= ';' ) ;
    public final EObject ruleAliasOperatorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_parameters_6_0 = null;


         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:685:28: ( (otherlv_0= 'alias' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' (otherlv_5= ':' ( (lv_parameters_6_0= ruleParameterApplication ) )+ )? otherlv_7= ';' ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:686:1: (otherlv_0= 'alias' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' (otherlv_5= ':' ( (lv_parameters_6_0= ruleParameterApplication ) )+ )? otherlv_7= ';' )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:686:1: (otherlv_0= 'alias' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' (otherlv_5= ':' ( (lv_parameters_6_0= ruleParameterApplication ) )+ )? otherlv_7= ';' )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:686:3: otherlv_0= 'alias' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' (otherlv_5= ':' ( (lv_parameters_6_0= ruleParameterApplication ) )+ )? otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleAliasOperatorDefinition1595); 

                	newLeafNode(otherlv_0, grammarAccess.getAliasOperatorDefinitionAccess().getAliasKeyword_0());
                
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:690:1: ( (lv_name_1_0= RULE_ID ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:691:1: (lv_name_1_0= RULE_ID )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:691:1: (lv_name_1_0= RULE_ID )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:692:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasOperatorDefinition1612); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAliasOperatorDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAliasOperatorDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleAliasOperatorDefinition1629); 

                	newLeafNode(otherlv_2, grammarAccess.getAliasOperatorDefinitionAccess().getLeftSquareBracketKeyword_2());
                
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:712:1: ( (otherlv_3= RULE_ID ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:713:1: (otherlv_3= RULE_ID )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:713:1: (otherlv_3= RULE_ID )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:714:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAliasOperatorDefinitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasOperatorDefinition1649); 

            		newLeafNode(otherlv_3, grammarAccess.getAliasOperatorDefinitionAccess().getOperatorOperatorDefinitionCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleAliasOperatorDefinition1661); 

                	newLeafNode(otherlv_4, grammarAccess.getAliasOperatorDefinitionAccess().getRightSquareBracketKeyword_4());
                
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:729:1: (otherlv_5= ':' ( (lv_parameters_6_0= ruleParameterApplication ) )+ )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:729:3: otherlv_5= ':' ( (lv_parameters_6_0= ruleParameterApplication ) )+
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleAliasOperatorDefinition1674); 

                        	newLeafNode(otherlv_5, grammarAccess.getAliasOperatorDefinitionAccess().getColonKeyword_5_0());
                        
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:733:1: ( (lv_parameters_6_0= ruleParameterApplication ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:734:1: (lv_parameters_6_0= ruleParameterApplication )
                    	    {
                    	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:734:1: (lv_parameters_6_0= ruleParameterApplication )
                    	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:735:3: lv_parameters_6_0= ruleParameterApplication
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAliasOperatorDefinitionAccess().getParametersParameterApplicationParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameterApplication_in_ruleAliasOperatorDefinition1695);
                    	    lv_parameters_6_0=ruleParameterApplication();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAliasOperatorDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_6_0, 
                    	            		"ParameterApplication");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleAliasOperatorDefinition1710); 

                	newLeafNode(otherlv_7, grammarAccess.getAliasOperatorDefinitionAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAliasOperatorDefinition"


    // $ANTLR start "entryRuleParameterApplication"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:763:1: entryRuleParameterApplication returns [EObject current=null] : iv_ruleParameterApplication= ruleParameterApplication EOF ;
    public final EObject entryRuleParameterApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterApplication = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:764:2: (iv_ruleParameterApplication= ruleParameterApplication EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:765:2: iv_ruleParameterApplication= ruleParameterApplication EOF
            {
             newCompositeNode(grammarAccess.getParameterApplicationRule()); 
            pushFollow(FOLLOW_ruleParameterApplication_in_entryRuleParameterApplication1746);
            iv_ruleParameterApplication=ruleParameterApplication();

            state._fsp--;

             current =iv_ruleParameterApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterApplication1756); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterApplication"


    // $ANTLR start "ruleParameterApplication"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:772:1: ruleParameterApplication returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameterApplicationValue ) ) ) ;
    public final EObject ruleParameterApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:775:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameterApplicationValue ) ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:776:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameterApplicationValue ) ) )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:776:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameterApplicationValue ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:776:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameterApplicationValue ) )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:776:2: ( (otherlv_0= RULE_ID ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:777:1: (otherlv_0= RULE_ID )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:777:1: (otherlv_0= RULE_ID )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:778:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterApplicationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterApplication1801); 

            		newLeafNode(otherlv_0, grammarAccess.getParameterApplicationAccess().getReferencedParameterParameterDefinitionCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleParameterApplication1813); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterApplicationAccess().getEqualsSignKeyword_1());
                
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:793:1: ( (lv_value_2_0= ruleParameterApplicationValue ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:794:1: (lv_value_2_0= ruleParameterApplicationValue )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:794:1: (lv_value_2_0= ruleParameterApplicationValue )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:795:3: lv_value_2_0= ruleParameterApplicationValue
            {
             
            	        newCompositeNode(grammarAccess.getParameterApplicationAccess().getValueParameterApplicationValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterApplicationValue_in_ruleParameterApplication1834);
            lv_value_2_0=ruleParameterApplicationValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterApplicationRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"ParameterApplicationValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterApplication"


    // $ANTLR start "entryRuleParameterDefinition"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:819:1: entryRuleParameterDefinition returns [EObject current=null] : iv_ruleParameterDefinition= ruleParameterDefinition EOF ;
    public final EObject entryRuleParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDefinition = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:820:2: (iv_ruleParameterDefinition= ruleParameterDefinition EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:821:2: iv_ruleParameterDefinition= ruleParameterDefinition EOF
            {
             newCompositeNode(grammarAccess.getParameterDefinitionRule()); 
            pushFollow(FOLLOW_ruleParameterDefinition_in_entryRuleParameterDefinition1870);
            iv_ruleParameterDefinition=ruleParameterDefinition();

            state._fsp--;

             current =iv_ruleParameterDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDefinition1880); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDefinition"


    // $ANTLR start "ruleParameterDefinition"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:828:1: ruleParameterDefinition returns [EObject current=null] : (this_StringParameterDefinition_0= ruleStringParameterDefinition | this_IntParameterDefinition_1= ruleIntParameterDefinition | this_EnumParameterDefinition_2= ruleEnumParameterDefinition ) ;
    public final EObject ruleParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_StringParameterDefinition_0 = null;

        EObject this_IntParameterDefinition_1 = null;

        EObject this_EnumParameterDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:831:28: ( (this_StringParameterDefinition_0= ruleStringParameterDefinition | this_IntParameterDefinition_1= ruleIntParameterDefinition | this_EnumParameterDefinition_2= ruleEnumParameterDefinition ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:832:1: (this_StringParameterDefinition_0= ruleStringParameterDefinition | this_IntParameterDefinition_1= ruleIntParameterDefinition | this_EnumParameterDefinition_2= ruleEnumParameterDefinition )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:832:1: (this_StringParameterDefinition_0= ruleStringParameterDefinition | this_IntParameterDefinition_1= ruleIntParameterDefinition | this_EnumParameterDefinition_2= ruleEnumParameterDefinition )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
                {
                alt15=1;
                }
                break;
            case 14:
            case 15:
                {
                alt15=2;
                }
                break;
            case 29:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:833:5: this_StringParameterDefinition_0= ruleStringParameterDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getParameterDefinitionAccess().getStringParameterDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringParameterDefinition_in_ruleParameterDefinition1927);
                    this_StringParameterDefinition_0=ruleStringParameterDefinition();

                    state._fsp--;

                     
                            current = this_StringParameterDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:843:5: this_IntParameterDefinition_1= ruleIntParameterDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getParameterDefinitionAccess().getIntParameterDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntParameterDefinition_in_ruleParameterDefinition1954);
                    this_IntParameterDefinition_1=ruleIntParameterDefinition();

                    state._fsp--;

                     
                            current = this_IntParameterDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:853:5: this_EnumParameterDefinition_2= ruleEnumParameterDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getParameterDefinitionAccess().getEnumParameterDefinitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEnumParameterDefinition_in_ruleParameterDefinition1981);
                    this_EnumParameterDefinition_2=ruleEnumParameterDefinition();

                    state._fsp--;

                     
                            current = this_EnumParameterDefinition_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDefinition"


    // $ANTLR start "entryRuleStringParameterDefinition"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:869:1: entryRuleStringParameterDefinition returns [EObject current=null] : iv_ruleStringParameterDefinition= ruleStringParameterDefinition EOF ;
    public final EObject entryRuleStringParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringParameterDefinition = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:870:2: (iv_ruleStringParameterDefinition= ruleStringParameterDefinition EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:871:2: iv_ruleStringParameterDefinition= ruleStringParameterDefinition EOF
            {
             newCompositeNode(grammarAccess.getStringParameterDefinitionRule()); 
            pushFollow(FOLLOW_ruleStringParameterDefinition_in_entryRuleStringParameterDefinition2016);
            iv_ruleStringParameterDefinition=ruleStringParameterDefinition();

            state._fsp--;

             current =iv_ruleStringParameterDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringParameterDefinition2026); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringParameterDefinition"


    // $ANTLR start "ruleStringParameterDefinition"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:878:1: ruleStringParameterDefinition returns [EObject current=null] : ( (otherlv_0= 'string' | otherlv_1= 'str' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleStringParameterValue ) ) ) ;
    public final EObject ruleStringParameterDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:881:28: ( ( (otherlv_0= 'string' | otherlv_1= 'str' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleStringParameterValue ) ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:882:1: ( (otherlv_0= 'string' | otherlv_1= 'str' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleStringParameterValue ) ) )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:882:1: ( (otherlv_0= 'string' | otherlv_1= 'str' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleStringParameterValue ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:882:2: (otherlv_0= 'string' | otherlv_1= 'str' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleStringParameterValue ) )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:882:2: (otherlv_0= 'string' | otherlv_1= 'str' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==11) ) {
                alt16=1;
            }
            else if ( (LA16_0==12) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:882:4: otherlv_0= 'string'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleStringParameterDefinition2064); 

                        	newLeafNode(otherlv_0, grammarAccess.getStringParameterDefinitionAccess().getStringKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:887:7: otherlv_1= 'str'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleStringParameterDefinition2082); 

                        	newLeafNode(otherlv_1, grammarAccess.getStringParameterDefinitionAccess().getStrKeyword_0_1());
                        

                    }
                    break;

            }

            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:891:2: ( (lv_name_2_0= RULE_ID ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:892:1: (lv_name_2_0= RULE_ID )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:892:1: (lv_name_2_0= RULE_ID )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:893:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringParameterDefinition2100); 

            			newLeafNode(lv_name_2_0, grammarAccess.getStringParameterDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringParameterDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleStringParameterDefinition2117); 

                	newLeafNode(otherlv_3, grammarAccess.getStringParameterDefinitionAccess().getEqualsSignKeyword_2());
                
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:913:1: ( (lv_value_4_0= ruleStringParameterValue ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:914:1: (lv_value_4_0= ruleStringParameterValue )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:914:1: (lv_value_4_0= ruleStringParameterValue )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:915:3: lv_value_4_0= ruleStringParameterValue
            {
             
            	        newCompositeNode(grammarAccess.getStringParameterDefinitionAccess().getValueStringParameterValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStringParameterValue_in_ruleStringParameterDefinition2138);
            lv_value_4_0=ruleStringParameterValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringParameterDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"StringParameterValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringParameterDefinition"


    // $ANTLR start "entryRuleIntParameterDefinition"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:939:1: entryRuleIntParameterDefinition returns [EObject current=null] : iv_ruleIntParameterDefinition= ruleIntParameterDefinition EOF ;
    public final EObject entryRuleIntParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntParameterDefinition = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:940:2: (iv_ruleIntParameterDefinition= ruleIntParameterDefinition EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:941:2: iv_ruleIntParameterDefinition= ruleIntParameterDefinition EOF
            {
             newCompositeNode(grammarAccess.getIntParameterDefinitionRule()); 
            pushFollow(FOLLOW_ruleIntParameterDefinition_in_entryRuleIntParameterDefinition2174);
            iv_ruleIntParameterDefinition=ruleIntParameterDefinition();

            state._fsp--;

             current =iv_ruleIntParameterDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntParameterDefinition2184); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntParameterDefinition"


    // $ANTLR start "ruleIntParameterDefinition"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:948:1: ruleIntParameterDefinition returns [EObject current=null] : ( (otherlv_0= 'integer' | otherlv_1= 'int' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleIntParameterValue ) ) ) ;
    public final EObject ruleIntParameterDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:951:28: ( ( (otherlv_0= 'integer' | otherlv_1= 'int' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleIntParameterValue ) ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:952:1: ( (otherlv_0= 'integer' | otherlv_1= 'int' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleIntParameterValue ) ) )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:952:1: ( (otherlv_0= 'integer' | otherlv_1= 'int' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleIntParameterValue ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:952:2: (otherlv_0= 'integer' | otherlv_1= 'int' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleIntParameterValue ) )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:952:2: (otherlv_0= 'integer' | otherlv_1= 'int' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            else if ( (LA17_0==15) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:952:4: otherlv_0= 'integer'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleIntParameterDefinition2222); 

                        	newLeafNode(otherlv_0, grammarAccess.getIntParameterDefinitionAccess().getIntegerKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:957:7: otherlv_1= 'int'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleIntParameterDefinition2240); 

                        	newLeafNode(otherlv_1, grammarAccess.getIntParameterDefinitionAccess().getIntKeyword_0_1());
                        

                    }
                    break;

            }

            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:961:2: ( (lv_name_2_0= RULE_ID ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:962:1: (lv_name_2_0= RULE_ID )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:962:1: (lv_name_2_0= RULE_ID )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:963:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntParameterDefinition2258); 

            			newLeafNode(lv_name_2_0, grammarAccess.getIntParameterDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntParameterDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleIntParameterDefinition2275); 

                	newLeafNode(otherlv_3, grammarAccess.getIntParameterDefinitionAccess().getEqualsSignKeyword_2());
                
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:983:1: ( (lv_value_4_0= ruleIntParameterValue ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:984:1: (lv_value_4_0= ruleIntParameterValue )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:984:1: (lv_value_4_0= ruleIntParameterValue )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:985:3: lv_value_4_0= ruleIntParameterValue
            {
             
            	        newCompositeNode(grammarAccess.getIntParameterDefinitionAccess().getValueIntParameterValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleIntParameterValue_in_ruleIntParameterDefinition2296);
            lv_value_4_0=ruleIntParameterValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntParameterDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"IntParameterValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntParameterDefinition"


    // $ANTLR start "entryRuleEnumParameterDefinition"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1009:1: entryRuleEnumParameterDefinition returns [EObject current=null] : iv_ruleEnumParameterDefinition= ruleEnumParameterDefinition EOF ;
    public final EObject entryRuleEnumParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumParameterDefinition = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1010:2: (iv_ruleEnumParameterDefinition= ruleEnumParameterDefinition EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1011:2: iv_ruleEnumParameterDefinition= ruleEnumParameterDefinition EOF
            {
             newCompositeNode(grammarAccess.getEnumParameterDefinitionRule()); 
            pushFollow(FOLLOW_ruleEnumParameterDefinition_in_entryRuleEnumParameterDefinition2332);
            iv_ruleEnumParameterDefinition=ruleEnumParameterDefinition();

            state._fsp--;

             current =iv_ruleEnumParameterDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumParameterDefinition2342); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumParameterDefinition"


    // $ANTLR start "ruleEnumParameterDefinition"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1018:1: ruleEnumParameterDefinition returns [EObject current=null] : (otherlv_0= '{' ( ( ( (lv_alternatives_1_0= ruleEnumAlternative ) ) (otherlv_2= ',' ( (lv_alternatives_3_0= ruleEnumAlternative ) ) )* ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) otherlv_6= ']' ) ) otherlv_7= '}' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ;
    public final EObject ruleEnumParameterDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_alternatives_1_0 = null;

        EObject lv_alternatives_3_0 = null;


         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1021:28: ( (otherlv_0= '{' ( ( ( (lv_alternatives_1_0= ruleEnumAlternative ) ) (otherlv_2= ',' ( (lv_alternatives_3_0= ruleEnumAlternative ) ) )* ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) otherlv_6= ']' ) ) otherlv_7= '}' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1022:1: (otherlv_0= '{' ( ( ( (lv_alternatives_1_0= ruleEnumAlternative ) ) (otherlv_2= ',' ( (lv_alternatives_3_0= ruleEnumAlternative ) ) )* ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) otherlv_6= ']' ) ) otherlv_7= '}' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1022:1: (otherlv_0= '{' ( ( ( (lv_alternatives_1_0= ruleEnumAlternative ) ) (otherlv_2= ',' ( (lv_alternatives_3_0= ruleEnumAlternative ) ) )* ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) otherlv_6= ']' ) ) otherlv_7= '}' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1022:3: otherlv_0= '{' ( ( ( (lv_alternatives_1_0= ruleEnumAlternative ) ) (otherlv_2= ',' ( (lv_alternatives_3_0= ruleEnumAlternative ) ) )* ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) otherlv_6= ']' ) ) otherlv_7= '}' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' ( (otherlv_10= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleEnumParameterDefinition2379); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumParameterDefinitionAccess().getLeftCurlyBracketKeyword_0());
                
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1026:1: ( ( ( (lv_alternatives_1_0= ruleEnumAlternative ) ) (otherlv_2= ',' ( (lv_alternatives_3_0= ruleEnumAlternative ) ) )* ) | (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) otherlv_6= ']' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==18) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1026:2: ( ( (lv_alternatives_1_0= ruleEnumAlternative ) ) (otherlv_2= ',' ( (lv_alternatives_3_0= ruleEnumAlternative ) ) )* )
                    {
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1026:2: ( ( (lv_alternatives_1_0= ruleEnumAlternative ) ) (otherlv_2= ',' ( (lv_alternatives_3_0= ruleEnumAlternative ) ) )* )
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1026:3: ( (lv_alternatives_1_0= ruleEnumAlternative ) ) (otherlv_2= ',' ( (lv_alternatives_3_0= ruleEnumAlternative ) ) )*
                    {
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1026:3: ( (lv_alternatives_1_0= ruleEnumAlternative ) )
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1027:1: (lv_alternatives_1_0= ruleEnumAlternative )
                    {
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1027:1: (lv_alternatives_1_0= ruleEnumAlternative )
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1028:3: lv_alternatives_1_0= ruleEnumAlternative
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumParameterDefinitionAccess().getAlternativesEnumAlternativeParserRuleCall_1_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEnumAlternative_in_ruleEnumParameterDefinition2402);
                    lv_alternatives_1_0=ruleEnumAlternative();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumParameterDefinitionRule());
                    	        }
                           		add(
                           			current, 
                           			"alternatives",
                            		lv_alternatives_1_0, 
                            		"EnumAlternative");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1044:2: (otherlv_2= ',' ( (lv_alternatives_3_0= ruleEnumAlternative ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==30) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1044:4: otherlv_2= ',' ( (lv_alternatives_3_0= ruleEnumAlternative ) )
                    	    {
                    	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleEnumParameterDefinition2415); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getEnumParameterDefinitionAccess().getCommaKeyword_1_0_1_0());
                    	        
                    	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1048:1: ( (lv_alternatives_3_0= ruleEnumAlternative ) )
                    	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1049:1: (lv_alternatives_3_0= ruleEnumAlternative )
                    	    {
                    	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1049:1: (lv_alternatives_3_0= ruleEnumAlternative )
                    	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1050:3: lv_alternatives_3_0= ruleEnumAlternative
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEnumParameterDefinitionAccess().getAlternativesEnumAlternativeParserRuleCall_1_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEnumAlternative_in_ruleEnumParameterDefinition2436);
                    	    lv_alternatives_3_0=ruleEnumAlternative();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEnumParameterDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"alternatives",
                    	            		lv_alternatives_3_0, 
                    	            		"EnumAlternative");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1067:6: (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) otherlv_6= ']' )
                    {
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1067:6: (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) otherlv_6= ']' )
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1067:8: otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleEnumParameterDefinition2458); 

                        	newLeafNode(otherlv_4, grammarAccess.getEnumParameterDefinitionAccess().getLeftSquareBracketKeyword_1_1_0());
                        
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1071:1: ( (otherlv_5= RULE_ID ) )
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1072:1: (otherlv_5= RULE_ID )
                    {
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1072:1: (otherlv_5= RULE_ID )
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1073:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumParameterDefinitionRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumParameterDefinition2478); 

                    		newLeafNode(otherlv_5, grammarAccess.getEnumParameterDefinitionAccess().getEnumerationGlobalEnumCrossReference_1_1_1_0()); 
                    	

                    }


                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleEnumParameterDefinition2490); 

                        	newLeafNode(otherlv_6, grammarAccess.getEnumParameterDefinitionAccess().getRightSquareBracketKeyword_1_1_2());
                        

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleEnumParameterDefinition2504); 

                	newLeafNode(otherlv_7, grammarAccess.getEnumParameterDefinitionAccess().getRightCurlyBracketKeyword_2());
                
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1092:1: ( (lv_name_8_0= RULE_ID ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1093:1: (lv_name_8_0= RULE_ID )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1093:1: (lv_name_8_0= RULE_ID )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1094:3: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumParameterDefinition2521); 

            			newLeafNode(lv_name_8_0, grammarAccess.getEnumParameterDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumParameterDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_8_0, 
                    		"ID");
            	    

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleEnumParameterDefinition2538); 

                	newLeafNode(otherlv_9, grammarAccess.getEnumParameterDefinitionAccess().getEqualsSignKeyword_4());
                
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1114:1: ( (otherlv_10= RULE_ID ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1115:1: (otherlv_10= RULE_ID )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1115:1: (otherlv_10= RULE_ID )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1116:3: otherlv_10= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumParameterDefinitionRule());
            	        }
                    
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumParameterDefinition2558); 

            		newLeafNode(otherlv_10, grammarAccess.getEnumParameterDefinitionAccess().getValueEnumAlternativeCrossReference_5_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumParameterDefinition"


    // $ANTLR start "entryRuleGlobalEnum"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1135:1: entryRuleGlobalEnum returns [EObject current=null] : iv_ruleGlobalEnum= ruleGlobalEnum EOF ;
    public final EObject entryRuleGlobalEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalEnum = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1136:2: (iv_ruleGlobalEnum= ruleGlobalEnum EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1137:2: iv_ruleGlobalEnum= ruleGlobalEnum EOF
            {
             newCompositeNode(grammarAccess.getGlobalEnumRule()); 
            pushFollow(FOLLOW_ruleGlobalEnum_in_entryRuleGlobalEnum2594);
            iv_ruleGlobalEnum=ruleGlobalEnum();

            state._fsp--;

             current =iv_ruleGlobalEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalEnum2604); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalEnum"


    // $ANTLR start "ruleGlobalEnum"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1144:1: ruleGlobalEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_alternatives_4_0= ruleEnumAlternative ) ) (otherlv_5= ',' ( (lv_alternatives_6_0= ruleEnumAlternative ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleGlobalEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_alternatives_4_0 = null;

        EObject lv_alternatives_6_0 = null;


         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1147:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_alternatives_4_0= ruleEnumAlternative ) ) (otherlv_5= ',' ( (lv_alternatives_6_0= ruleEnumAlternative ) ) )* otherlv_7= '}' ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1148:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_alternatives_4_0= ruleEnumAlternative ) ) (otherlv_5= ',' ( (lv_alternatives_6_0= ruleEnumAlternative ) ) )* otherlv_7= '}' )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1148:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_alternatives_4_0= ruleEnumAlternative ) ) (otherlv_5= ',' ( (lv_alternatives_6_0= ruleEnumAlternative ) ) )* otherlv_7= '}' )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1148:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_alternatives_4_0= ruleEnumAlternative ) ) (otherlv_5= ',' ( (lv_alternatives_6_0= ruleEnumAlternative ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleGlobalEnum2641); 

                	newLeafNode(otherlv_0, grammarAccess.getGlobalEnumAccess().getEnumKeyword_0());
                
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1152:1: ( (lv_name_1_0= RULE_ID ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1153:1: (lv_name_1_0= RULE_ID )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1153:1: (lv_name_1_0= RULE_ID )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1154:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlobalEnum2658); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGlobalEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlobalEnumRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleGlobalEnum2675); 

                	newLeafNode(otherlv_2, grammarAccess.getGlobalEnumAccess().getEqualsSignKeyword_2());
                
            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleGlobalEnum2687); 

                	newLeafNode(otherlv_3, grammarAccess.getGlobalEnumAccess().getLeftCurlyBracketKeyword_3());
                
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1178:1: ( (lv_alternatives_4_0= ruleEnumAlternative ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1179:1: (lv_alternatives_4_0= ruleEnumAlternative )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1179:1: (lv_alternatives_4_0= ruleEnumAlternative )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1180:3: lv_alternatives_4_0= ruleEnumAlternative
            {
             
            	        newCompositeNode(grammarAccess.getGlobalEnumAccess().getAlternativesEnumAlternativeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEnumAlternative_in_ruleGlobalEnum2708);
            lv_alternatives_4_0=ruleEnumAlternative();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGlobalEnumRule());
            	        }
                   		add(
                   			current, 
                   			"alternatives",
                    		lv_alternatives_4_0, 
                    		"EnumAlternative");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1196:2: (otherlv_5= ',' ( (lv_alternatives_6_0= ruleEnumAlternative ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1196:4: otherlv_5= ',' ( (lv_alternatives_6_0= ruleEnumAlternative ) )
            	    {
            	    otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleGlobalEnum2721); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGlobalEnumAccess().getCommaKeyword_5_0());
            	        
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1200:1: ( (lv_alternatives_6_0= ruleEnumAlternative ) )
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1201:1: (lv_alternatives_6_0= ruleEnumAlternative )
            	    {
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1201:1: (lv_alternatives_6_0= ruleEnumAlternative )
            	    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1202:3: lv_alternatives_6_0= ruleEnumAlternative
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGlobalEnumAccess().getAlternativesEnumAlternativeParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumAlternative_in_ruleGlobalEnum2742);
            	    lv_alternatives_6_0=ruleEnumAlternative();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGlobalEnumRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"alternatives",
            	            		lv_alternatives_6_0, 
            	            		"EnumAlternative");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleGlobalEnum2756); 

                	newLeafNode(otherlv_7, grammarAccess.getGlobalEnumAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalEnum"


    // $ANTLR start "entryRuleEnumAlternative"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1230:1: entryRuleEnumAlternative returns [EObject current=null] : iv_ruleEnumAlternative= ruleEnumAlternative EOF ;
    public final EObject entryRuleEnumAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumAlternative = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1231:2: (iv_ruleEnumAlternative= ruleEnumAlternative EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1232:2: iv_ruleEnumAlternative= ruleEnumAlternative EOF
            {
             newCompositeNode(grammarAccess.getEnumAlternativeRule()); 
            pushFollow(FOLLOW_ruleEnumAlternative_in_entryRuleEnumAlternative2792);
            iv_ruleEnumAlternative=ruleEnumAlternative();

            state._fsp--;

             current =iv_ruleEnumAlternative; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumAlternative2802); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumAlternative"


    // $ANTLR start "ruleEnumAlternative"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1239:1: ruleEnumAlternative returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumAlternative() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1242:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1243:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1243:1: ( (lv_name_0_0= RULE_ID ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1244:1: (lv_name_0_0= RULE_ID )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1244:1: (lv_name_0_0= RULE_ID )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1245:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumAlternative2843); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEnumAlternativeAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumAlternativeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumAlternative"


    // $ANTLR start "entryRuleStringParameterValue"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1269:1: entryRuleStringParameterValue returns [EObject current=null] : iv_ruleStringParameterValue= ruleStringParameterValue EOF ;
    public final EObject entryRuleStringParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringParameterValue = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1270:2: (iv_ruleStringParameterValue= ruleStringParameterValue EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1271:2: iv_ruleStringParameterValue= ruleStringParameterValue EOF
            {
             newCompositeNode(grammarAccess.getStringParameterValueRule()); 
            pushFollow(FOLLOW_ruleStringParameterValue_in_entryRuleStringParameterValue2883);
            iv_ruleStringParameterValue=ruleStringParameterValue();

            state._fsp--;

             current =iv_ruleStringParameterValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringParameterValue2893); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringParameterValue"


    // $ANTLR start "ruleStringParameterValue"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1278:1: ruleStringParameterValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_StringConstantApplication_1= ruleStringConstantApplication ) ;
    public final EObject ruleStringParameterValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_StringConstantApplication_1 = null;


         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1281:28: ( (this_StringValue_0= ruleStringValue | this_StringConstantApplication_1= ruleStringConstantApplication ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1282:1: (this_StringValue_0= ruleStringValue | this_StringConstantApplication_1= ruleStringConstantApplication )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1282:1: (this_StringValue_0= ruleStringValue | this_StringConstantApplication_1= ruleStringConstantApplication )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1283:5: this_StringValue_0= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getStringParameterValueAccess().getStringValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleStringParameterValue2940);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;

                     
                            current = this_StringValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1293:5: this_StringConstantApplication_1= ruleStringConstantApplication
                    {
                     
                            newCompositeNode(grammarAccess.getStringParameterValueAccess().getStringConstantApplicationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringConstantApplication_in_ruleStringParameterValue2967);
                    this_StringConstantApplication_1=ruleStringConstantApplication();

                    state._fsp--;

                     
                            current = this_StringConstantApplication_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringParameterValue"


    // $ANTLR start "entryRuleParameterApplicationValue"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1309:1: entryRuleParameterApplicationValue returns [EObject current=null] : iv_ruleParameterApplicationValue= ruleParameterApplicationValue EOF ;
    public final EObject entryRuleParameterApplicationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterApplicationValue = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1310:2: (iv_ruleParameterApplicationValue= ruleParameterApplicationValue EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1311:2: iv_ruleParameterApplicationValue= ruleParameterApplicationValue EOF
            {
             newCompositeNode(grammarAccess.getParameterApplicationValueRule()); 
            pushFollow(FOLLOW_ruleParameterApplicationValue_in_entryRuleParameterApplicationValue3002);
            iv_ruleParameterApplicationValue=ruleParameterApplicationValue();

            state._fsp--;

             current =iv_ruleParameterApplicationValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterApplicationValue3012); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterApplicationValue"


    // $ANTLR start "ruleParameterApplicationValue"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1318:1: ruleParameterApplicationValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_ConstantReferenceValue_2= ruleConstantReferenceValue ) ;
    public final EObject ruleParameterApplicationValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_IntValue_1 = null;

        EObject this_ConstantReferenceValue_2 = null;


         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1321:28: ( (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_ConstantReferenceValue_2= ruleConstantReferenceValue ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1322:1: (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_ConstantReferenceValue_2= ruleConstantReferenceValue )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1322:1: (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_ConstantReferenceValue_2= ruleConstantReferenceValue )
            int alt22=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt22=1;
                }
                break;
            case RULE_INT:
                {
                alt22=2;
                }
                break;
            case RULE_ID:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1323:5: this_StringValue_0= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getParameterApplicationValueAccess().getStringValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleParameterApplicationValue3059);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;

                     
                            current = this_StringValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1333:5: this_IntValue_1= ruleIntValue
                    {
                     
                            newCompositeNode(grammarAccess.getParameterApplicationValueAccess().getIntValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntValue_in_ruleParameterApplicationValue3086);
                    this_IntValue_1=ruleIntValue();

                    state._fsp--;

                     
                            current = this_IntValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1343:5: this_ConstantReferenceValue_2= ruleConstantReferenceValue
                    {
                     
                            newCompositeNode(grammarAccess.getParameterApplicationValueAccess().getConstantReferenceValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleConstantReferenceValue_in_ruleParameterApplicationValue3113);
                    this_ConstantReferenceValue_2=ruleConstantReferenceValue();

                    state._fsp--;

                     
                            current = this_ConstantReferenceValue_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterApplicationValue"


    // $ANTLR start "entryRuleConstantReferenceValue"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1359:1: entryRuleConstantReferenceValue returns [EObject current=null] : iv_ruleConstantReferenceValue= ruleConstantReferenceValue EOF ;
    public final EObject entryRuleConstantReferenceValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantReferenceValue = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1360:2: (iv_ruleConstantReferenceValue= ruleConstantReferenceValue EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1361:2: iv_ruleConstantReferenceValue= ruleConstantReferenceValue EOF
            {
             newCompositeNode(grammarAccess.getConstantReferenceValueRule()); 
            pushFollow(FOLLOW_ruleConstantReferenceValue_in_entryRuleConstantReferenceValue3148);
            iv_ruleConstantReferenceValue=ruleConstantReferenceValue();

            state._fsp--;

             current =iv_ruleConstantReferenceValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantReferenceValue3158); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantReferenceValue"


    // $ANTLR start "ruleConstantReferenceValue"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1368:1: ruleConstantReferenceValue returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleConstantReferenceValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1371:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1372:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1372:1: ( (otherlv_0= RULE_ID ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1373:1: (otherlv_0= RULE_ID )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1373:1: (otherlv_0= RULE_ID )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1374:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantReferenceValueRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantReferenceValue3202); 

            		newLeafNode(otherlv_0, grammarAccess.getConstantReferenceValueAccess().getValueConstantCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantReferenceValue"


    // $ANTLR start "entryRuleStringValue"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1395:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1396:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1397:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue3239);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue3249); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1404:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1407:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1408:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1408:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1409:1: (lv_value_0_0= RULE_STRING )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1409:1: (lv_value_0_0= RULE_STRING )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1410:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue3290); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleStringConstantApplication"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1434:1: entryRuleStringConstantApplication returns [EObject current=null] : iv_ruleStringConstantApplication= ruleStringConstantApplication EOF ;
    public final EObject entryRuleStringConstantApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringConstantApplication = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1435:2: (iv_ruleStringConstantApplication= ruleStringConstantApplication EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1436:2: iv_ruleStringConstantApplication= ruleStringConstantApplication EOF
            {
             newCompositeNode(grammarAccess.getStringConstantApplicationRule()); 
            pushFollow(FOLLOW_ruleStringConstantApplication_in_entryRuleStringConstantApplication3330);
            iv_ruleStringConstantApplication=ruleStringConstantApplication();

            state._fsp--;

             current =iv_ruleStringConstantApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringConstantApplication3340); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringConstantApplication"


    // $ANTLR start "ruleStringConstantApplication"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1443:1: ruleStringConstantApplication returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleStringConstantApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1446:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1447:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1447:1: ( (otherlv_0= RULE_ID ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1448:1: (otherlv_0= RULE_ID )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1448:1: (otherlv_0= RULE_ID )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1449:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStringConstantApplicationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringConstantApplication3384); 

            		newLeafNode(otherlv_0, grammarAccess.getStringConstantApplicationAccess().getValueStringConstantCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringConstantApplication"


    // $ANTLR start "entryRuleIntParameterValue"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1468:1: entryRuleIntParameterValue returns [EObject current=null] : iv_ruleIntParameterValue= ruleIntParameterValue EOF ;
    public final EObject entryRuleIntParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntParameterValue = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1469:2: (iv_ruleIntParameterValue= ruleIntParameterValue EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1470:2: iv_ruleIntParameterValue= ruleIntParameterValue EOF
            {
             newCompositeNode(grammarAccess.getIntParameterValueRule()); 
            pushFollow(FOLLOW_ruleIntParameterValue_in_entryRuleIntParameterValue3419);
            iv_ruleIntParameterValue=ruleIntParameterValue();

            state._fsp--;

             current =iv_ruleIntParameterValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntParameterValue3429); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntParameterValue"


    // $ANTLR start "ruleIntParameterValue"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1477:1: ruleIntParameterValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_IntConstantApplication_1= ruleIntConstantApplication ) ;
    public final EObject ruleIntParameterValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_IntConstantApplication_1 = null;


         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1480:28: ( (this_IntValue_0= ruleIntValue | this_IntConstantApplication_1= ruleIntConstantApplication ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1481:1: (this_IntValue_0= ruleIntValue | this_IntConstantApplication_1= ruleIntConstantApplication )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1481:1: (this_IntValue_0= ruleIntValue | this_IntConstantApplication_1= ruleIntConstantApplication )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1482:5: this_IntValue_0= ruleIntValue
                    {
                     
                            newCompositeNode(grammarAccess.getIntParameterValueAccess().getIntValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntValue_in_ruleIntParameterValue3476);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;

                     
                            current = this_IntValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1492:5: this_IntConstantApplication_1= ruleIntConstantApplication
                    {
                     
                            newCompositeNode(grammarAccess.getIntParameterValueAccess().getIntConstantApplicationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntConstantApplication_in_ruleIntParameterValue3503);
                    this_IntConstantApplication_1=ruleIntConstantApplication();

                    state._fsp--;

                     
                            current = this_IntConstantApplication_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntParameterValue"


    // $ANTLR start "entryRuleIntValue"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1508:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1509:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1510:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue3538);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue3548); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1517:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1520:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1521:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1521:1: ( (lv_value_0_0= RULE_INT ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1522:1: (lv_value_0_0= RULE_INT )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1522:1: (lv_value_0_0= RULE_INT )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1523:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue3589); 

            			newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INT");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleIntConstantApplication"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1547:1: entryRuleIntConstantApplication returns [EObject current=null] : iv_ruleIntConstantApplication= ruleIntConstantApplication EOF ;
    public final EObject entryRuleIntConstantApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntConstantApplication = null;


        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1548:2: (iv_ruleIntConstantApplication= ruleIntConstantApplication EOF )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1549:2: iv_ruleIntConstantApplication= ruleIntConstantApplication EOF
            {
             newCompositeNode(grammarAccess.getIntConstantApplicationRule()); 
            pushFollow(FOLLOW_ruleIntConstantApplication_in_entryRuleIntConstantApplication3629);
            iv_ruleIntConstantApplication=ruleIntConstantApplication();

            state._fsp--;

             current =iv_ruleIntConstantApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntConstantApplication3639); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntConstantApplication"


    // $ANTLR start "ruleIntConstantApplication"
    // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1556:1: ruleIntConstantApplication returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleIntConstantApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1559:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1560:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1560:1: ( (otherlv_0= RULE_ID ) )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1561:1: (otherlv_0= RULE_ID )
            {
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1561:1: (otherlv_0= RULE_ID )
            // ../gpp.tests.operators/src-gen/gpp/tests/operators/parser/antlr/internal/InternalOperatorsTest.g:1562:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIntConstantApplicationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntConstantApplication3683); 

            		newLeafNode(otherlv_0, grammarAccess.getIntConstantApplicationAccess().getValueIntConstantCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntConstantApplication"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleBoxModelOperators_in_entryRuleBoxModelOperators75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoxModelOperators85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleBoxModelOperators131 = new BitSet(new long[]{0x000000011FC1D802L});
    public static final BitSet FOLLOW_ruleOperatorDefinition_in_ruleBoxModelOperators154 = new BitSet(new long[]{0x000000011FC0D802L});
    public static final BitSet FOLLOW_ruleGlobalEnum_in_ruleBoxModelOperators181 = new BitSet(new long[]{0x000000011FC0D802L});
    public static final BitSet FOLLOW_ruleIntConstant_in_ruleBoxModelOperators208 = new BitSet(new long[]{0x000000011FC0D802L});
    public static final BitSet FOLLOW_ruleStringConstant_in_ruleBoxModelOperators235 = new BitSet(new long[]{0x000000011FC0D802L});
    public static final BitSet FOLLOW_ruleStringConstant_in_entryRuleStringConstant273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringConstant283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStringConstant321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12_in_ruleStringConstant339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringConstant357 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStringConstant374 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringConstant391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntConstant_in_entryRuleIntConstant432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntConstant442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleIntConstant480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15_in_ruleIntConstant498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntConstant516 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleIntConstant533 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntConstant550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleImport638 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorImplementationString_in_entryRuleOperatorImplementationString697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorImplementationString708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperatorImplementationString748 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleOperatorImplementationString767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperatorImplementationString782 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOperatorDefinition_in_entryRuleOperatorDefinition829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorDefinition839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicOperatorDefinition_in_ruleOperatorDefinition886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasOperatorDefinition_in_ruleOperatorDefinition913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicOperatorDefinition_in_entryRuleBasicOperatorDefinition948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicOperatorDefinition958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHighlightOperatorDefinition_in_ruleBasicOperatorDefinition1006 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePositionalOperatorDefinition_in_ruleBasicOperatorDefinition1033 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTransformingOperatorDefinition_in_ruleBasicOperatorDefinition1060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBasicOperatorDefinition1077 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBasicOperatorDefinition1094 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOperatorImplementationString_in_ruleBasicOperatorDefinition1115 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBasicOperatorDefinition1127 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleBasicOperatorDefinition1140 = new BitSet(new long[]{0x000000002000D800L});
    public static final BitSet FOLLOW_ruleParameterDefinition_in_ruleBasicOperatorDefinition1161 = new BitSet(new long[]{0x000000002020D800L});
    public static final BitSet FOLLOW_21_in_ruleBasicOperatorDefinition1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionalOperatorDefinition_in_entryRulePositionalOperatorDefinition1212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePositionalOperatorDefinition1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePositionalOperatorDefinition1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePositionalOperatorDefinition1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHighlightOperatorDefinition_in_entryRuleHighlightOperatorDefinition1324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHighlightOperatorDefinition1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleHighlightOperatorDefinition1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleHighlightOperatorDefinition1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransformingOperatorDefinition_in_entryRuleTransformingOperatorDefinition1436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransformingOperatorDefinition1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTransformingOperatorDefinition1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleTransformingOperatorDefinition1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasOperatorDefinition_in_entryRuleAliasOperatorDefinition1548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasOperatorDefinition1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAliasOperatorDefinition1595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasOperatorDefinition1612 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAliasOperatorDefinition1629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasOperatorDefinition1649 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAliasOperatorDefinition1661 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleAliasOperatorDefinition1674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterApplication_in_ruleAliasOperatorDefinition1695 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleAliasOperatorDefinition1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterApplication_in_entryRuleParameterApplication1746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterApplication1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterApplication1801 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleParameterApplication1813 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleParameterApplicationValue_in_ruleParameterApplication1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDefinition_in_entryRuleParameterDefinition1870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDefinition1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringParameterDefinition_in_ruleParameterDefinition1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntParameterDefinition_in_ruleParameterDefinition1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumParameterDefinition_in_ruleParameterDefinition1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringParameterDefinition_in_entryRuleStringParameterDefinition2016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringParameterDefinition2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStringParameterDefinition2064 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12_in_ruleStringParameterDefinition2082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringParameterDefinition2100 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStringParameterDefinition2117 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleStringParameterValue_in_ruleStringParameterDefinition2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntParameterDefinition_in_entryRuleIntParameterDefinition2174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntParameterDefinition2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleIntParameterDefinition2222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15_in_ruleIntParameterDefinition2240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntParameterDefinition2258 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleIntParameterDefinition2275 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleIntParameterValue_in_ruleIntParameterDefinition2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumParameterDefinition_in_entryRuleEnumParameterDefinition2332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumParameterDefinition2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleEnumParameterDefinition2379 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleEnumAlternative_in_ruleEnumParameterDefinition2402 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_ruleEnumParameterDefinition2415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumAlternative_in_ruleEnumParameterDefinition2436 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_18_in_ruleEnumParameterDefinition2458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumParameterDefinition2478 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEnumParameterDefinition2490 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEnumParameterDefinition2504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumParameterDefinition2521 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumParameterDefinition2538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumParameterDefinition2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalEnum_in_entryRuleGlobalEnum2594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalEnum2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleGlobalEnum2641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlobalEnum2658 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGlobalEnum2675 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleGlobalEnum2687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumAlternative_in_ruleGlobalEnum2708 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_ruleGlobalEnum2721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumAlternative_in_ruleGlobalEnum2742 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_ruleGlobalEnum2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumAlternative_in_entryRuleEnumAlternative2792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumAlternative2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumAlternative2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringParameterValue_in_entryRuleStringParameterValue2883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringParameterValue2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleStringParameterValue2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstantApplication_in_ruleStringParameterValue2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterApplicationValue_in_entryRuleParameterApplicationValue3002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterApplicationValue3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleParameterApplicationValue3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleParameterApplicationValue3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantReferenceValue_in_ruleParameterApplicationValue3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantReferenceValue_in_entryRuleConstantReferenceValue3148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantReferenceValue3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantReferenceValue3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue3239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstantApplication_in_entryRuleStringConstantApplication3330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringConstantApplication3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringConstantApplication3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntParameterValue_in_entryRuleIntParameterValue3419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntParameterValue3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleIntParameterValue3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntConstantApplication_in_ruleIntParameterValue3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue3538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntConstantApplication_in_entryRuleIntConstantApplication3629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntConstantApplication3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntConstantApplication3683 = new BitSet(new long[]{0x0000000000000002L});

}