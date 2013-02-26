package expr.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import expr.services.ExprDemoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExprDemoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'tested'", "'model'", "'using'", "'.'", "'*'", "'function'", "'('", "','", "')'", "'{'", "'}'", "'return'", "';'", "'assert'", "'is'", "':'", "'enum'", "'readonly'", "'var'", "'='", "'array'", "'['", "']'", "'int'", "'bool'", "'float'", "'string'", "'calc'", "'=='", "'+'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int RULE_NUMBER=5;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalExprDemoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExprDemoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExprDemoParser.tokenNames; }
    public String getGrammarFileName() { return "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g"; }



     	private ExprDemoGrammarAccess grammarAccess;
     	
        public InternalExprDemoParser(TokenStream input, ExprDemoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ExprDemoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_isTested_0_0= 'tested' ) )? otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) ( (lv_usings_3_0= ruleUsing ) )* ( ( (lv_elements_4_0= ruleElement ) ) | ( (lv_functions_5_0= ruleFunctionDeclaration ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_isTested_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_usings_3_0 = null;

        EObject lv_elements_4_0 = null;

        EObject lv_functions_5_0 = null;


         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:79:28: ( ( ( (lv_isTested_0_0= 'tested' ) )? otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) ( (lv_usings_3_0= ruleUsing ) )* ( ( (lv_elements_4_0= ruleElement ) ) | ( (lv_functions_5_0= ruleFunctionDeclaration ) ) )* ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:80:1: ( ( (lv_isTested_0_0= 'tested' ) )? otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) ( (lv_usings_3_0= ruleUsing ) )* ( ( (lv_elements_4_0= ruleElement ) ) | ( (lv_functions_5_0= ruleFunctionDeclaration ) ) )* )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:80:1: ( ( (lv_isTested_0_0= 'tested' ) )? otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) ( (lv_usings_3_0= ruleUsing ) )* ( ( (lv_elements_4_0= ruleElement ) ) | ( (lv_functions_5_0= ruleFunctionDeclaration ) ) )* )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:80:2: ( (lv_isTested_0_0= 'tested' ) )? otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) ( (lv_usings_3_0= ruleUsing ) )* ( ( (lv_elements_4_0= ruleElement ) ) | ( (lv_functions_5_0= ruleFunctionDeclaration ) ) )*
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:80:2: ( (lv_isTested_0_0= 'tested' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:81:1: (lv_isTested_0_0= 'tested' )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:81:1: (lv_isTested_0_0= 'tested' )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:82:3: lv_isTested_0_0= 'tested'
                    {
                    lv_isTested_0_0=(Token)match(input,12,FOLLOW_12_in_ruleModel128); 

                            newLeafNode(lv_isTested_0_0, grammarAccess.getModelAccess().getIsTestedTestedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelRule());
                    	        }
                           		setWithLastConsumed(current, "isTested", true, "tested");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleModel154); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:99:1: ( (lv_name_2_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:100:1: (lv_name_2_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:100:1: (lv_name_2_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:101:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel171); 

            			newLeafNode(lv_name_2_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:117:2: ( (lv_usings_3_0= ruleUsing ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:118:1: (lv_usings_3_0= ruleUsing )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:118:1: (lv_usings_3_0= ruleUsing )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:119:3: lv_usings_3_0= ruleUsing
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getUsingsUsingParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUsing_in_ruleModel197);
            	    lv_usings_3_0=ruleUsing();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"usings",
            	            		lv_usings_3_0, 
            	            		"Using");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:135:3: ( ( (lv_elements_4_0= ruleElement ) ) | ( (lv_functions_5_0= ruleFunctionDeclaration ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23||LA3_0==25||(LA3_0>=28 && LA3_0<=30)||LA3_0==39) ) {
                    alt3=1;
                }
                else if ( (LA3_0==17) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:135:4: ( (lv_elements_4_0= ruleElement ) )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:135:4: ( (lv_elements_4_0= ruleElement ) )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:136:1: (lv_elements_4_0= ruleElement )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:136:1: (lv_elements_4_0= ruleElement )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:137:3: lv_elements_4_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_ruleModel220);
            	    lv_elements_4_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:154:6: ( (lv_functions_5_0= ruleFunctionDeclaration ) )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:154:6: ( (lv_functions_5_0= ruleFunctionDeclaration ) )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:155:1: (lv_functions_5_0= ruleFunctionDeclaration )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:155:1: (lv_functions_5_0= ruleFunctionDeclaration )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:156:3: lv_functions_5_0= ruleFunctionDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getFunctionsFunctionDeclarationParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionDeclaration_in_ruleModel247);
            	    lv_functions_5_0=ruleFunctionDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"functions",
            	            		lv_functions_5_0, 
            	            		"FunctionDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleUsing"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:180:1: entryRuleUsing returns [EObject current=null] : iv_ruleUsing= ruleUsing EOF ;
    public final EObject entryRuleUsing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsing = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:181:2: (iv_ruleUsing= ruleUsing EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:182:2: iv_ruleUsing= ruleUsing EOF
            {
             newCompositeNode(grammarAccess.getUsingRule()); 
            pushFollow(FOLLOW_ruleUsing_in_entryRuleUsing285);
            iv_ruleUsing=ruleUsing();

            state._fsp--;

             current =iv_ruleUsing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsing295); 

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
    // $ANTLR end "entryRuleUsing"


    // $ANTLR start "ruleUsing"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:189:1: ruleUsing returns [EObject current=null] : (otherlv_0= 'using' ( (lv_importedNamespace_1_0= ruleImportID ) ) ) ;
    public final EObject ruleUsing() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:192:28: ( (otherlv_0= 'using' ( (lv_importedNamespace_1_0= ruleImportID ) ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:193:1: (otherlv_0= 'using' ( (lv_importedNamespace_1_0= ruleImportID ) ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:193:1: (otherlv_0= 'using' ( (lv_importedNamespace_1_0= ruleImportID ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:193:3: otherlv_0= 'using' ( (lv_importedNamespace_1_0= ruleImportID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleUsing332); 

                	newLeafNode(otherlv_0, grammarAccess.getUsingAccess().getUsingKeyword_0());
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:197:1: ( (lv_importedNamespace_1_0= ruleImportID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:198:1: (lv_importedNamespace_1_0= ruleImportID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:198:1: (lv_importedNamespace_1_0= ruleImportID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:199:3: lv_importedNamespace_1_0= ruleImportID
            {
             
            	        newCompositeNode(grammarAccess.getUsingAccess().getImportedNamespaceImportIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleImportID_in_ruleUsing353);
            lv_importedNamespace_1_0=ruleImportID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUsingRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"ImportID");
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
    // $ANTLR end "ruleUsing"


    // $ANTLR start "entryRuleImportID"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:223:1: entryRuleImportID returns [String current=null] : iv_ruleImportID= ruleImportID EOF ;
    public final String entryRuleImportID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportID = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:224:2: (iv_ruleImportID= ruleImportID EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:225:2: iv_ruleImportID= ruleImportID EOF
            {
             newCompositeNode(grammarAccess.getImportIDRule()); 
            pushFollow(FOLLOW_ruleImportID_in_entryRuleImportID390);
            iv_ruleImportID=ruleImportID();

            state._fsp--;

             current =iv_ruleImportID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportID401); 

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
    // $ANTLR end "entryRuleImportID"


    // $ANTLR start "ruleImportID"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:232:1: ruleImportID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' kw= '*' ) ) ;
    public final AntlrDatatypeRuleToken ruleImportID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:235:28: ( (this_ID_0= RULE_ID (kw= '.' kw= '*' ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:236:1: (this_ID_0= RULE_ID (kw= '.' kw= '*' ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:236:1: (this_ID_0= RULE_ID (kw= '.' kw= '*' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:236:6: this_ID_0= RULE_ID (kw= '.' kw= '*' )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImportID441); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getImportIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:243:1: (kw= '.' kw= '*' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:244:2: kw= '.' kw= '*'
            {
            kw=(Token)match(input,15,FOLLOW_15_in_ruleImportID460); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getImportIDAccess().getFullStopKeyword_1_0()); 
                
            kw=(Token)match(input,16,FOLLOW_16_in_ruleImportID473); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getImportIDAccess().getAsteriskKeyword_1_1()); 
                

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
    // $ANTLR end "ruleImportID"


    // $ANTLR start "entryRuleElement"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:263:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:264:2: (iv_ruleElement= ruleElement EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:265:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement514);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement524); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:272:1: ruleElement returns [EObject current=null] : (this_VarDecl_0= ruleVarDecl | this_Formula_1= ruleFormula | this_EnumDecl_2= ruleEnumDecl | this_Assert_3= ruleAssert | this_Return_4= ruleReturn ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_VarDecl_0 = null;

        EObject this_Formula_1 = null;

        EObject this_EnumDecl_2 = null;

        EObject this_Assert_3 = null;

        EObject this_Return_4 = null;


         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:275:28: ( (this_VarDecl_0= ruleVarDecl | this_Formula_1= ruleFormula | this_EnumDecl_2= ruleEnumDecl | this_Assert_3= ruleAssert | this_Return_4= ruleReturn ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:276:1: (this_VarDecl_0= ruleVarDecl | this_Formula_1= ruleFormula | this_EnumDecl_2= ruleEnumDecl | this_Assert_3= ruleAssert | this_Return_4= ruleReturn )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:276:1: (this_VarDecl_0= ruleVarDecl | this_Formula_1= ruleFormula | this_EnumDecl_2= ruleEnumDecl | this_Assert_3= ruleAssert | this_Return_4= ruleReturn )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 29:
            case 30:
                {
                alt4=1;
                }
                break;
            case 39:
                {
                alt4=2;
                }
                break;
            case 28:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            case 23:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:277:5: this_VarDecl_0= ruleVarDecl
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getVarDeclParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVarDecl_in_ruleElement571);
                    this_VarDecl_0=ruleVarDecl();

                    state._fsp--;

                     
                            current = this_VarDecl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:287:5: this_Formula_1= ruleFormula
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getFormulaParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFormula_in_ruleElement598);
                    this_Formula_1=ruleFormula();

                    state._fsp--;

                     
                            current = this_Formula_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:297:5: this_EnumDecl_2= ruleEnumDecl
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getEnumDeclParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEnumDecl_in_ruleElement625);
                    this_EnumDecl_2=ruleEnumDecl();

                    state._fsp--;

                     
                            current = this_EnumDecl_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:307:5: this_Assert_3= ruleAssert
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getAssertParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAssert_in_ruleElement652);
                    this_Assert_3=ruleAssert();

                    state._fsp--;

                     
                            current = this_Assert_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:317:5: this_Return_4= ruleReturn
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getReturnParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleReturn_in_ruleElement679);
                    this_Return_4=ruleReturn();

                    state._fsp--;

                     
                            current = this_Return_4; 
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:333:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:334:2: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:335:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            pushFollow(FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration714);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;

             current =iv_ruleFunctionDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclaration724); 

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
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:342:1: ruleFunctionDeclaration returns [EObject current=null] : ( () otherlv_1= 'function' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_elements_10_0= ruleElement ) )* otherlv_11= '}' ) ;
    public final EObject ruleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_type_2_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_params_7_0 = null;

        EObject lv_elements_10_0 = null;


         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:345:28: ( ( () otherlv_1= 'function' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_elements_10_0= ruleElement ) )* otherlv_11= '}' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:346:1: ( () otherlv_1= 'function' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_elements_10_0= ruleElement ) )* otherlv_11= '}' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:346:1: ( () otherlv_1= 'function' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_elements_10_0= ruleElement ) )* otherlv_11= '}' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:346:2: () otherlv_1= 'function' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_elements_10_0= ruleElement ) )* otherlv_11= '}'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:346:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:347:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFunctionDeclarationAccess().getFunctionDeclarationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleFunctionDeclaration770); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_1());
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:356:1: ( (lv_type_2_0= ruleType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:357:1: (lv_type_2_0= ruleType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:357:1: (lv_type_2_0= ruleType )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:358:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleFunctionDeclaration791);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:374:2: ( (lv_name_3_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:375:1: (lv_name_3_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:375:1: (lv_name_3_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:376:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDeclaration808); 

            			newLeafNode(lv_name_3_0, grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleFunctionDeclaration825); 

                	newLeafNode(otherlv_4, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_4());
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:396:1: ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==32||(LA6_0>=35 && LA6_0<=38)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:396:2: ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )*
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:396:2: ( (lv_params_5_0= ruleParameter ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:397:1: (lv_params_5_0= ruleParameter )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:397:1: (lv_params_5_0= ruleParameter )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:398:3: lv_params_5_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParamsParameterParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionDeclaration847);
                    lv_params_5_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_5_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:414:2: (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==19) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:414:4: otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleFunctionDeclaration860); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_5_1_0());
                    	        
                    	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:418:1: ( (lv_params_7_0= ruleParameter ) )
                    	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:419:1: (lv_params_7_0= ruleParameter )
                    	    {
                    	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:419:1: (lv_params_7_0= ruleParameter )
                    	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:420:3: lv_params_7_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParamsParameterParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionDeclaration881);
                    	    lv_params_7_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_7_0, 
                    	            		"Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleFunctionDeclaration897); 

                	newLeafNode(otherlv_8, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_6());
                
            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleFunctionDeclaration909); 

                	newLeafNode(otherlv_9, grammarAccess.getFunctionDeclarationAccess().getLeftCurlyBracketKeyword_7());
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:444:1: ( (lv_elements_10_0= ruleElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23||LA7_0==25||(LA7_0>=28 && LA7_0<=30)||LA7_0==39) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:445:1: (lv_elements_10_0= ruleElement )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:445:1: (lv_elements_10_0= ruleElement )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:446:3: lv_elements_10_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getElementsElementParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_ruleFunctionDeclaration930);
            	    lv_elements_10_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_10_0, 
            	            		"Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleFunctionDeclaration943); 

                	newLeafNode(otherlv_11, grammarAccess.getFunctionDeclarationAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleReturn"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:474:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:475:2: (iv_ruleReturn= ruleReturn EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:476:2: iv_ruleReturn= ruleReturn EOF
            {
             newCompositeNode(grammarAccess.getReturnRule()); 
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn979);
            iv_ruleReturn=ruleReturn();

            state._fsp--;

             current =iv_ruleReturn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn989); 

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
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:483:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'return' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:486:28: ( (otherlv_0= 'return' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:487:1: (otherlv_0= 'return' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:487:1: (otherlv_0= 'return' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:487:3: otherlv_0= 'return' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleReturn1026); 

                	newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnKeyword_0());
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:491:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:492:1: (lv_expr_1_0= ruleExpr )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:492:1: (lv_expr_1_0= ruleExpr )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:493:3: lv_expr_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getReturnAccess().getExprExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleReturn1047);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReturnRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleReturn1059); 

                	newLeafNode(otherlv_2, grammarAccess.getReturnAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleParameter"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:521:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:522:2: (iv_ruleParameter= ruleParameter EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:523:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1095);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1105); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:530:1: ruleParameter returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:533:28: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:534:1: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:534:1: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:534:2: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:534:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:535:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterAccess().getParameterAction_0(),
                        current);
                

            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:540:2: ( (lv_type_1_0= ruleType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:541:1: (lv_type_1_0= ruleType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:541:1: (lv_type_1_0= ruleType )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:542:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleParameter1160);
            lv_type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:558:2: ( (lv_name_2_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:559:1: (lv_name_2_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:559:1: (lv_name_2_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:560:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1177); 

            			newLeafNode(lv_name_2_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleAssert"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:584:1: entryRuleAssert returns [EObject current=null] : iv_ruleAssert= ruleAssert EOF ;
    public final EObject entryRuleAssert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssert = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:585:2: (iv_ruleAssert= ruleAssert EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:586:2: iv_ruleAssert= ruleAssert EOF
            {
             newCompositeNode(grammarAccess.getAssertRule()); 
            pushFollow(FOLLOW_ruleAssert_in_entryRuleAssert1218);
            iv_ruleAssert=ruleAssert();

            state._fsp--;

             current =iv_ruleAssert; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssert1228); 

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
    // $ANTLR end "entryRuleAssert"


    // $ANTLR start "ruleAssert"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:593:1: ruleAssert returns [EObject current=null] : (otherlv_0= 'assert' ( (lv_actual_1_0= ruleExpr ) ) otherlv_2= 'is' ( (lv_expected_3_0= ruleExpr ) ) (otherlv_4= ':' ( (lv_msg_5_0= ruleExpr ) ) )? ) ;
    public final EObject ruleAssert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_actual_1_0 = null;

        EObject lv_expected_3_0 = null;

        EObject lv_msg_5_0 = null;


         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:596:28: ( (otherlv_0= 'assert' ( (lv_actual_1_0= ruleExpr ) ) otherlv_2= 'is' ( (lv_expected_3_0= ruleExpr ) ) (otherlv_4= ':' ( (lv_msg_5_0= ruleExpr ) ) )? ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:597:1: (otherlv_0= 'assert' ( (lv_actual_1_0= ruleExpr ) ) otherlv_2= 'is' ( (lv_expected_3_0= ruleExpr ) ) (otherlv_4= ':' ( (lv_msg_5_0= ruleExpr ) ) )? )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:597:1: (otherlv_0= 'assert' ( (lv_actual_1_0= ruleExpr ) ) otherlv_2= 'is' ( (lv_expected_3_0= ruleExpr ) ) (otherlv_4= ':' ( (lv_msg_5_0= ruleExpr ) ) )? )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:597:3: otherlv_0= 'assert' ( (lv_actual_1_0= ruleExpr ) ) otherlv_2= 'is' ( (lv_expected_3_0= ruleExpr ) ) (otherlv_4= ':' ( (lv_msg_5_0= ruleExpr ) ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleAssert1265); 

                	newLeafNode(otherlv_0, grammarAccess.getAssertAccess().getAssertKeyword_0());
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:601:1: ( (lv_actual_1_0= ruleExpr ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:602:1: (lv_actual_1_0= ruleExpr )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:602:1: (lv_actual_1_0= ruleExpr )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:603:3: lv_actual_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getAssertAccess().getActualExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleAssert1286);
            lv_actual_1_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertRule());
            	        }
                   		set(
                   			current, 
                   			"actual",
                    		lv_actual_1_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleAssert1298); 

                	newLeafNode(otherlv_2, grammarAccess.getAssertAccess().getIsKeyword_2());
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:623:1: ( (lv_expected_3_0= ruleExpr ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:624:1: (lv_expected_3_0= ruleExpr )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:624:1: (lv_expected_3_0= ruleExpr )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:625:3: lv_expected_3_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getAssertAccess().getExpectedExprParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleAssert1319);
            lv_expected_3_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertRule());
            	        }
                   		set(
                   			current, 
                   			"expected",
                    		lv_expected_3_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:641:2: (otherlv_4= ':' ( (lv_msg_5_0= ruleExpr ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:641:4: otherlv_4= ':' ( (lv_msg_5_0= ruleExpr ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleAssert1332); 

                        	newLeafNode(otherlv_4, grammarAccess.getAssertAccess().getColonKeyword_4_0());
                        
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:645:1: ( (lv_msg_5_0= ruleExpr ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:646:1: (lv_msg_5_0= ruleExpr )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:646:1: (lv_msg_5_0= ruleExpr )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:647:3: lv_msg_5_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertAccess().getMsgExprParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleAssert1353);
                    lv_msg_5_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertRule());
                    	        }
                           		set(
                           			current, 
                           			"msg",
                            		lv_msg_5_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleAssert"


    // $ANTLR start "entryRuleEnumDecl"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:671:1: entryRuleEnumDecl returns [EObject current=null] : iv_ruleEnumDecl= ruleEnumDecl EOF ;
    public final EObject entryRuleEnumDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDecl = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:672:2: (iv_ruleEnumDecl= ruleEnumDecl EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:673:2: iv_ruleEnumDecl= ruleEnumDecl EOF
            {
             newCompositeNode(grammarAccess.getEnumDeclRule()); 
            pushFollow(FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl1391);
            iv_ruleEnumDecl=ruleEnumDecl();

            state._fsp--;

             current =iv_ruleEnumDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDecl1401); 

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
    // $ANTLR end "entryRuleEnumDecl"


    // $ANTLR start "ruleEnumDecl"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:680:1: ruleEnumDecl returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* otherlv_4= '}' ) ;
    public final EObject ruleEnumDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_literals_3_0 = null;


         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:683:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* otherlv_4= '}' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:684:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* otherlv_4= '}' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:684:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* otherlv_4= '}' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:684:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleEnumDecl1438); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumDeclAccess().getEnumKeyword_0());
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:688:1: ( (lv_name_1_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:689:1: (lv_name_1_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:689:1: (lv_name_1_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:690:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDecl1455); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleEnumDecl1472); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumDeclAccess().getLeftCurlyBracketKeyword_2());
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:710:1: ( (lv_literals_3_0= ruleEnumLiteral ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:711:1: (lv_literals_3_0= ruleEnumLiteral )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:711:1: (lv_literals_3_0= ruleEnumLiteral )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:712:3: lv_literals_3_0= ruleEnumLiteral
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumDeclAccess().getLiteralsEnumLiteralParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumLiteral_in_ruleEnumDecl1493);
            	    lv_literals_3_0=ruleEnumLiteral();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"literals",
            	            		lv_literals_3_0, 
            	            		"EnumLiteral");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleEnumDecl1506); 

                	newLeafNode(otherlv_4, grammarAccess.getEnumDeclAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleEnumDecl"


    // $ANTLR start "entryRuleEnumLiteral"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:740:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:741:2: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:742:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral1542);
            iv_ruleEnumLiteral=ruleEnumLiteral();

            state._fsp--;

             current =iv_ruleEnumLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLiteral1552); 

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
    // $ANTLR end "entryRuleEnumLiteral"


    // $ANTLR start "ruleEnumLiteral"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:749:1: ruleEnumLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:752:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:753:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:753:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:753:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:753:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:754:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0(),
                        current);
                

            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:759:2: ( (lv_name_1_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:760:1: (lv_name_1_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:760:1: (lv_name_1_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:761:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumLiteral1603); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleEnumLiteral"


    // $ANTLR start "entryRuleVarDecl"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:785:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:786:2: (iv_ruleVarDecl= ruleVarDecl EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:787:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             newCompositeNode(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl1644);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;

             current =iv_ruleVarDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl1654); 

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
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:794:1: ruleVarDecl returns [EObject current=null] : ( () ( (lv_readonly_1_0= 'readonly' ) )? otherlv_2= 'var' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_init_6_0= ruleExpr ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_readonly_1_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_type_3_0 = null;

        EObject lv_init_6_0 = null;


         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:797:28: ( ( () ( (lv_readonly_1_0= 'readonly' ) )? otherlv_2= 'var' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_init_6_0= ruleExpr ) ) )? otherlv_7= ';' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:798:1: ( () ( (lv_readonly_1_0= 'readonly' ) )? otherlv_2= 'var' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_init_6_0= ruleExpr ) ) )? otherlv_7= ';' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:798:1: ( () ( (lv_readonly_1_0= 'readonly' ) )? otherlv_2= 'var' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_init_6_0= ruleExpr ) ) )? otherlv_7= ';' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:798:2: () ( (lv_readonly_1_0= 'readonly' ) )? otherlv_2= 'var' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_init_6_0= ruleExpr ) ) )? otherlv_7= ';'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:798:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:799:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVarDeclAccess().getVarDeclAction_0(),
                        current);
                

            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:804:2: ( (lv_readonly_1_0= 'readonly' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:805:1: (lv_readonly_1_0= 'readonly' )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:805:1: (lv_readonly_1_0= 'readonly' )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:806:3: lv_readonly_1_0= 'readonly'
                    {
                    lv_readonly_1_0=(Token)match(input,29,FOLLOW_29_in_ruleVarDecl1706); 

                            newLeafNode(lv_readonly_1_0, grammarAccess.getVarDeclAccess().getReadonlyReadonlyKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVarDeclRule());
                    	        }
                           		setWithLastConsumed(current, "readonly", true, "readonly");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleVarDecl1732); 

                	newLeafNode(otherlv_2, grammarAccess.getVarDeclAccess().getVarKeyword_2());
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:823:1: ( (lv_type_3_0= ruleType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:824:1: (lv_type_3_0= ruleType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:824:1: (lv_type_3_0= ruleType )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:825:3: lv_type_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getVarDeclAccess().getTypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVarDecl1753);
            lv_type_3_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVarDeclRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:841:2: ( (lv_name_4_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:842:1: (lv_name_4_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:842:1: (lv_name_4_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:843:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDecl1770); 

            			newLeafNode(lv_name_4_0, grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVarDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:859:2: (otherlv_5= '=' ( (lv_init_6_0= ruleExpr ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:859:4: otherlv_5= '=' ( (lv_init_6_0= ruleExpr ) )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleVarDecl1788); 

                        	newLeafNode(otherlv_5, grammarAccess.getVarDeclAccess().getEqualsSignKeyword_5_0());
                        
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:863:1: ( (lv_init_6_0= ruleExpr ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:864:1: (lv_init_6_0= ruleExpr )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:864:1: (lv_init_6_0= ruleExpr )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:865:3: lv_init_6_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getVarDeclAccess().getInitExprParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleVarDecl1809);
                    lv_init_6_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVarDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"init",
                            		lv_init_6_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleVarDecl1823); 

                	newLeafNode(otherlv_7, grammarAccess.getVarDeclAccess().getSemicolonKeyword_6());
                

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
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleType"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:893:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:894:2: (iv_ruleType= ruleType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:895:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1859);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1869); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:902:1: ruleType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_ArrayType_1= ruleArrayType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_ArrayType_1 = null;


         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:905:28: ( (this_PrimitiveType_0= rulePrimitiveType | this_ArrayType_1= ruleArrayType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:906:1: (this_PrimitiveType_0= rulePrimitiveType | this_ArrayType_1= ruleArrayType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:906:1: (this_PrimitiveType_0= rulePrimitiveType | this_ArrayType_1= ruleArrayType )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||(LA12_0>=35 && LA12_0<=38)) ) {
                alt12=1;
            }
            else if ( (LA12_0==32) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:907:5: this_PrimitiveType_0= rulePrimitiveType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleType1916);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;

                     
                            current = this_PrimitiveType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:917:5: this_ArrayType_1= ruleArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getArrayTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleArrayType_in_ruleType1943);
                    this_ArrayType_1=ruleArrayType();

                    state._fsp--;

                     
                            current = this_ArrayType_1; 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePrimitiveType"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:933:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:934:2: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:935:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType1978);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType1988); 

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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:942:1: rulePrimitiveType returns [EObject current=null] : (this_IntType_0= ruleIntType | this_BoolType_1= ruleBoolType | this_FloatType_2= ruleFloatType | this_EnumType_3= ruleEnumType | this_StringType_4= ruleStringType ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject this_IntType_0 = null;

        EObject this_BoolType_1 = null;

        EObject this_FloatType_2 = null;

        EObject this_EnumType_3 = null;

        EObject this_StringType_4 = null;


         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:945:28: ( (this_IntType_0= ruleIntType | this_BoolType_1= ruleBoolType | this_FloatType_2= ruleFloatType | this_EnumType_3= ruleEnumType | this_StringType_4= ruleStringType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:946:1: (this_IntType_0= ruleIntType | this_BoolType_1= ruleBoolType | this_FloatType_2= ruleFloatType | this_EnumType_3= ruleEnumType | this_StringType_4= ruleStringType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:946:1: (this_IntType_0= ruleIntType | this_BoolType_1= ruleBoolType | this_FloatType_2= ruleFloatType | this_EnumType_3= ruleEnumType | this_StringType_4= ruleStringType )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt13=1;
                }
                break;
            case 36:
                {
                alt13=2;
                }
                break;
            case 37:
                {
                alt13=3;
                }
                break;
            case RULE_ID:
                {
                alt13=4;
                }
                break;
            case 38:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:947:5: this_IntType_0= ruleIntType
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getIntTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntType_in_rulePrimitiveType2035);
                    this_IntType_0=ruleIntType();

                    state._fsp--;

                     
                            current = this_IntType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:957:5: this_BoolType_1= ruleBoolType
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getBoolTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBoolType_in_rulePrimitiveType2062);
                    this_BoolType_1=ruleBoolType();

                    state._fsp--;

                     
                            current = this_BoolType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:967:5: this_FloatType_2= ruleFloatType
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getFloatTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFloatType_in_rulePrimitiveType2089);
                    this_FloatType_2=ruleFloatType();

                    state._fsp--;

                     
                            current = this_FloatType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:977:5: this_EnumType_3= ruleEnumType
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getEnumTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleEnumType_in_rulePrimitiveType2116);
                    this_EnumType_3=ruleEnumType();

                    state._fsp--;

                     
                            current = this_EnumType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:987:5: this_StringType_4= ruleStringType
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getStringTypeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_rulePrimitiveType2143);
                    this_StringType_4=ruleStringType();

                    state._fsp--;

                     
                            current = this_StringType_4; 
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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleArrayType"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1003:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1004:2: (iv_ruleArrayType= ruleArrayType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1005:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType2178);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType2188); 

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
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1012:1: ruleArrayType returns [EObject current=null] : ( () otherlv_1= 'array' otherlv_2= '[' ( (lv_baseType_3_0= ruleType ) ) otherlv_4= ']' ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_baseType_3_0 = null;


         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1015:28: ( ( () otherlv_1= 'array' otherlv_2= '[' ( (lv_baseType_3_0= ruleType ) ) otherlv_4= ']' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1016:1: ( () otherlv_1= 'array' otherlv_2= '[' ( (lv_baseType_3_0= ruleType ) ) otherlv_4= ']' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1016:1: ( () otherlv_1= 'array' otherlv_2= '[' ( (lv_baseType_3_0= ruleType ) ) otherlv_4= ']' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1016:2: () otherlv_1= 'array' otherlv_2= '[' ( (lv_baseType_3_0= ruleType ) ) otherlv_4= ']'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1016:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1017:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArrayTypeAccess().getArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleArrayType2234); 

                	newLeafNode(otherlv_1, grammarAccess.getArrayTypeAccess().getArrayKeyword_1());
                
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleArrayType2246); 

                	newLeafNode(otherlv_2, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_2());
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1030:1: ( (lv_baseType_3_0= ruleType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1031:1: (lv_baseType_3_0= ruleType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1031:1: (lv_baseType_3_0= ruleType )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1032:3: lv_baseType_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getArrayTypeAccess().getBaseTypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleArrayType2267);
            lv_baseType_3_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArrayTypeRule());
            	        }
                   		set(
                   			current, 
                   			"baseType",
                    		lv_baseType_3_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleArrayType2279); 

                	newLeafNode(otherlv_4, grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleEnumType"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1060:1: entryRuleEnumType returns [EObject current=null] : iv_ruleEnumType= ruleEnumType EOF ;
    public final EObject entryRuleEnumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1061:2: (iv_ruleEnumType= ruleEnumType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1062:2: iv_ruleEnumType= ruleEnumType EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType2315);
            iv_ruleEnumType=ruleEnumType();

            state._fsp--;

             current =iv_ruleEnumType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType2325); 

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
    // $ANTLR end "entryRuleEnumType"


    // $ANTLR start "ruleEnumType"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1069:1: ruleEnumType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEnumType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1072:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1073:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1073:1: ( (otherlv_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1074:1: (otherlv_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1074:1: (otherlv_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1075:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumType2369); 

            		newLeafNode(otherlv_0, grammarAccess.getEnumTypeAccess().getEnumRefEnumDeclCrossReference_0()); 
            	

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
    // $ANTLR end "ruleEnumType"


    // $ANTLR start "entryRuleIntType"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1094:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1095:2: (iv_ruleIntType= ruleIntType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1096:2: iv_ruleIntType= ruleIntType EOF
            {
             newCompositeNode(grammarAccess.getIntTypeRule()); 
            pushFollow(FOLLOW_ruleIntType_in_entryRuleIntType2404);
            iv_ruleIntType=ruleIntType();

            state._fsp--;

             current =iv_ruleIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntType2414); 

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
    // $ANTLR end "entryRuleIntType"


    // $ANTLR start "ruleIntType"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1103:1: ruleIntType returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1106:28: ( ( () otherlv_1= 'int' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1107:1: ( () otherlv_1= 'int' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1107:1: ( () otherlv_1= 'int' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1107:2: () otherlv_1= 'int'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1107:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1108:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntTypeAccess().getIntTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleIntType2460); 

                	newLeafNode(otherlv_1, grammarAccess.getIntTypeAccess().getIntKeyword_1());
                

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
    // $ANTLR end "ruleIntType"


    // $ANTLR start "entryRuleBoolType"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1125:1: entryRuleBoolType returns [EObject current=null] : iv_ruleBoolType= ruleBoolType EOF ;
    public final EObject entryRuleBoolType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1126:2: (iv_ruleBoolType= ruleBoolType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1127:2: iv_ruleBoolType= ruleBoolType EOF
            {
             newCompositeNode(grammarAccess.getBoolTypeRule()); 
            pushFollow(FOLLOW_ruleBoolType_in_entryRuleBoolType2496);
            iv_ruleBoolType=ruleBoolType();

            state._fsp--;

             current =iv_ruleBoolType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolType2506); 

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
    // $ANTLR end "entryRuleBoolType"


    // $ANTLR start "ruleBoolType"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1134:1: ruleBoolType returns [EObject current=null] : ( () otherlv_1= 'bool' ) ;
    public final EObject ruleBoolType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1137:28: ( ( () otherlv_1= 'bool' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1138:1: ( () otherlv_1= 'bool' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1138:1: ( () otherlv_1= 'bool' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1138:2: () otherlv_1= 'bool'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1138:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1139:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBoolTypeAccess().getBoolTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleBoolType2552); 

                	newLeafNode(otherlv_1, grammarAccess.getBoolTypeAccess().getBoolKeyword_1());
                

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
    // $ANTLR end "ruleBoolType"


    // $ANTLR start "entryRuleFloatType"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1156:1: entryRuleFloatType returns [EObject current=null] : iv_ruleFloatType= ruleFloatType EOF ;
    public final EObject entryRuleFloatType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1157:2: (iv_ruleFloatType= ruleFloatType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1158:2: iv_ruleFloatType= ruleFloatType EOF
            {
             newCompositeNode(grammarAccess.getFloatTypeRule()); 
            pushFollow(FOLLOW_ruleFloatType_in_entryRuleFloatType2588);
            iv_ruleFloatType=ruleFloatType();

            state._fsp--;

             current =iv_ruleFloatType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatType2598); 

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
    // $ANTLR end "entryRuleFloatType"


    // $ANTLR start "ruleFloatType"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1165:1: ruleFloatType returns [EObject current=null] : ( () otherlv_1= 'float' ) ;
    public final EObject ruleFloatType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1168:28: ( ( () otherlv_1= 'float' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1169:1: ( () otherlv_1= 'float' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1169:1: ( () otherlv_1= 'float' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1169:2: () otherlv_1= 'float'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1169:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1170:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFloatTypeAccess().getFloatTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleFloatType2644); 

                	newLeafNode(otherlv_1, grammarAccess.getFloatTypeAccess().getFloatKeyword_1());
                

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
    // $ANTLR end "ruleFloatType"


    // $ANTLR start "entryRuleStringType"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1187:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1188:2: (iv_ruleStringType= ruleStringType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1189:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType2680);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType2690); 

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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1196:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1199:28: ( ( () otherlv_1= 'string' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1200:1: ( () otherlv_1= 'string' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1200:1: ( () otherlv_1= 'string' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1200:2: () otherlv_1= 'string'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1200:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1201:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleStringType2736); 

                	newLeafNode(otherlv_1, grammarAccess.getStringTypeAccess().getStringKeyword_1());
                

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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleFormula"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1218:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1219:2: (iv_ruleFormula= ruleFormula EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1220:2: iv_ruleFormula= ruleFormula EOF
            {
             newCompositeNode(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_ruleFormula_in_entryRuleFormula2772);
            iv_ruleFormula=ruleFormula();

            state._fsp--;

             current =iv_ruleFormula; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormula2782); 

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
    // $ANTLR end "entryRuleFormula"


    // $ANTLR start "ruleFormula"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1227:1: ruleFormula returns [EObject current=null] : ( () otherlv_1= 'calc' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ';' ) ;
    public final EObject ruleFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_2_0 = null;

        EObject lv_expr_5_0 = null;


         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1230:28: ( ( () otherlv_1= 'calc' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ';' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1231:1: ( () otherlv_1= 'calc' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ';' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1231:1: ( () otherlv_1= 'calc' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ';' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1231:2: () otherlv_1= 'calc' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ';'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1231:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1232:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFormulaAccess().getFormulaAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleFormula2828); 

                	newLeafNode(otherlv_1, grammarAccess.getFormulaAccess().getCalcKeyword_1());
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1241:1: ( (lv_type_2_0= ruleType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1242:1: (lv_type_2_0= ruleType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1242:1: (lv_type_2_0= ruleType )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1243:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getFormulaAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleFormula2849);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormulaRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1259:2: ( (lv_name_3_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1260:1: (lv_name_3_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1260:1: (lv_name_3_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1261:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormula2866); 

            			newLeafNode(lv_name_3_0, grammarAccess.getFormulaAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFormulaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleFormula2883); 

                	newLeafNode(otherlv_4, grammarAccess.getFormulaAccess().getEqualsSignKeyword_4());
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1281:1: ( (lv_expr_5_0= ruleExpr ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1282:1: (lv_expr_5_0= ruleExpr )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1282:1: (lv_expr_5_0= ruleExpr )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1283:3: lv_expr_5_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getFormulaAccess().getExprExprParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleFormula2904);
            lv_expr_5_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormulaRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_5_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleFormula2916); 

                	newLeafNode(otherlv_6, grammarAccess.getFormulaAccess().getSemicolonKeyword_6());
                

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
    // $ANTLR end "ruleFormula"


    // $ANTLR start "entryRuleExpr"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1311:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1312:2: (iv_ruleExpr= ruleExpr EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1313:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr2952);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr2962); 

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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1320:1: ruleExpr returns [EObject current=null] : this_Comparison_0= ruleComparison ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;


         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1323:28: (this_Comparison_0= ruleComparison )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1325:5: this_Comparison_0= ruleComparison
            {
             
                    newCompositeNode(grammarAccess.getExprAccess().getComparisonParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleComparison_in_ruleExpr3008);
            this_Comparison_0=ruleComparison();

            state._fsp--;

             
                    current = this_Comparison_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleComparison"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1341:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1342:2: (iv_ruleComparison= ruleComparison EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1343:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison3042);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison3052); 

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1350:1: ruleComparison returns [EObject current=null] : (this_Addition_0= ruleAddition ( () otherlv_2= '==' ( (lv_right_3_0= ruleAddition ) ) )? ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Addition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1353:28: ( (this_Addition_0= ruleAddition ( () otherlv_2= '==' ( (lv_right_3_0= ruleAddition ) ) )? ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1354:1: (this_Addition_0= ruleAddition ( () otherlv_2= '==' ( (lv_right_3_0= ruleAddition ) ) )? )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1354:1: (this_Addition_0= ruleAddition ( () otherlv_2= '==' ( (lv_right_3_0= ruleAddition ) ) )? )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1355:5: this_Addition_0= ruleAddition ( () otherlv_2= '==' ( (lv_right_3_0= ruleAddition ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getComparisonAccess().getAdditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAddition_in_ruleComparison3099);
            this_Addition_0=ruleAddition();

            state._fsp--;

             
                    current = this_Addition_0; 
                    afterParserOrEnumRuleCall();
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1363:1: ( () otherlv_2= '==' ( (lv_right_3_0= ruleAddition ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==40) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1363:2: () otherlv_2= '==' ( (lv_right_3_0= ruleAddition ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1363:2: ()
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1364:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleComparison3120); 

                        	newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_1());
                        
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1373:1: ( (lv_right_3_0= ruleAddition ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1374:1: (lv_right_3_0= ruleAddition )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1374:1: (lv_right_3_0= ruleAddition )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1375:3: lv_right_3_0= ruleAddition
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonAccess().getRightAdditionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddition_in_ruleComparison3141);
                    lv_right_3_0=ruleAddition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"Addition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleAddition"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1399:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1400:2: (iv_ruleAddition= ruleAddition EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1401:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition3179);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition3189); 

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1408:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1411:28: ( (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1412:1: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1412:1: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1413:5: this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition3236);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;

             
                    current = this_Multiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1421:1: ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==41) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1421:2: () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1421:2: ()
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1422:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAdditionAccess().getPlusLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleAddition3257); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1431:1: ( (lv_right_3_0= ruleMultiplication ) )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1432:1: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1432:1: (lv_right_3_0= ruleMultiplication )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1433:3: lv_right_3_0= ruleMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition3278);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Multiplication");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1457:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1458:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1459:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication3316);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication3326); 

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1466:1: ruleMultiplication returns [EObject current=null] : (this_PostfixOperators_0= rulePostfixOperators ( () otherlv_2= '*' ( (lv_right_3_0= rulePostfixOperators ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PostfixOperators_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1469:28: ( (this_PostfixOperators_0= rulePostfixOperators ( () otherlv_2= '*' ( (lv_right_3_0= rulePostfixOperators ) ) )* ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1470:1: (this_PostfixOperators_0= rulePostfixOperators ( () otherlv_2= '*' ( (lv_right_3_0= rulePostfixOperators ) ) )* )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1470:1: (this_PostfixOperators_0= rulePostfixOperators ( () otherlv_2= '*' ( (lv_right_3_0= rulePostfixOperators ) ) )* )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1471:5: this_PostfixOperators_0= rulePostfixOperators ( () otherlv_2= '*' ( (lv_right_3_0= rulePostfixOperators ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicationAccess().getPostfixOperatorsParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePostfixOperators_in_ruleMultiplication3373);
            this_PostfixOperators_0=rulePostfixOperators();

            state._fsp--;

             
                    current = this_PostfixOperators_0; 
                    afterParserOrEnumRuleCall();
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1479:1: ( () otherlv_2= '*' ( (lv_right_3_0= rulePostfixOperators ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1479:2: () otherlv_2= '*' ( (lv_right_3_0= rulePostfixOperators ) )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1479:2: ()
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1480:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleMultiplication3394); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1());
            	        
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1489:1: ( (lv_right_3_0= rulePostfixOperators ) )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1490:1: (lv_right_3_0= rulePostfixOperators )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1490:1: (lv_right_3_0= rulePostfixOperators )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1491:3: lv_right_3_0= rulePostfixOperators
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPostfixOperatorsParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePostfixOperators_in_ruleMultiplication3415);
            	    lv_right_3_0=rulePostfixOperators();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"PostfixOperators");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePostfixOperators"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1515:1: entryRulePostfixOperators returns [EObject current=null] : iv_rulePostfixOperators= rulePostfixOperators EOF ;
    public final EObject entryRulePostfixOperators() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixOperators = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1516:2: (iv_rulePostfixOperators= rulePostfixOperators EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1517:2: iv_rulePostfixOperators= rulePostfixOperators EOF
            {
             newCompositeNode(grammarAccess.getPostfixOperatorsRule()); 
            pushFollow(FOLLOW_rulePostfixOperators_in_entryRulePostfixOperators3453);
            iv_rulePostfixOperators=rulePostfixOperators();

            state._fsp--;

             current =iv_rulePostfixOperators; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePostfixOperators3463); 

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
    // $ANTLR end "entryRulePostfixOperators"


    // $ANTLR start "rulePostfixOperators"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1524:1: rulePostfixOperators returns [EObject current=null] : (this_Atomic_0= ruleAtomic ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpr ) ) otherlv_4= ']' )? ) ;
    public final EObject rulePostfixOperators() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Atomic_0 = null;

        EObject lv_index_3_0 = null;


         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1527:28: ( (this_Atomic_0= ruleAtomic ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpr ) ) otherlv_4= ']' )? ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1528:1: (this_Atomic_0= ruleAtomic ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpr ) ) otherlv_4= ']' )? )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1528:1: (this_Atomic_0= ruleAtomic ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpr ) ) otherlv_4= ']' )? )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1529:5: this_Atomic_0= ruleAtomic ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpr ) ) otherlv_4= ']' )?
            {
             
                    newCompositeNode(grammarAccess.getPostfixOperatorsAccess().getAtomicParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAtomic_in_rulePostfixOperators3510);
            this_Atomic_0=ruleAtomic();

            state._fsp--;

             
                    current = this_Atomic_0; 
                    afterParserOrEnumRuleCall();
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1537:1: ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpr ) ) otherlv_4= ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1537:2: () otherlv_2= '[' ( (lv_index_3_0= ruleExpr ) ) otherlv_4= ']'
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1537:2: ()
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1538:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getPostfixOperatorsAccess().getArrayAccessExprAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_rulePostfixOperators3531); 

                        	newLeafNode(otherlv_2, grammarAccess.getPostfixOperatorsAccess().getLeftSquareBracketKeyword_1_1());
                        
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1547:1: ( (lv_index_3_0= ruleExpr ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1548:1: (lv_index_3_0= ruleExpr )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1548:1: (lv_index_3_0= ruleExpr )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1549:3: lv_index_3_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getPostfixOperatorsAccess().getIndexExprParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_rulePostfixOperators3552);
                    lv_index_3_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPostfixOperatorsRule());
                    	        }
                           		set(
                           			current, 
                           			"index",
                            		lv_index_3_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_rulePostfixOperators3564); 

                        	newLeafNode(otherlv_4, grammarAccess.getPostfixOperatorsAccess().getRightSquareBracketKeyword_1_3());
                        

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
    // $ANTLR end "rulePostfixOperators"


    // $ANTLR start "entryRuleAtomic"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1577:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1578:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1579:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic3602);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic3612); 

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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1586:1: ruleAtomic returns [EObject current=null] : ( ( () ( ( ruleQID ) ) (otherlv_2= '(' ( (lv_actuals_3_0= ruleExpr ) )? (otherlv_4= ',' ( (lv_actuals_5_0= ruleExpr ) ) )* otherlv_6= ')' )? ) | ( () ( (lv_value_8_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_10_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_value_8_0=null;
        Token lv_value_10_0=null;
        EObject lv_actuals_3_0 = null;

        EObject lv_actuals_5_0 = null;


         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1589:28: ( ( ( () ( ( ruleQID ) ) (otherlv_2= '(' ( (lv_actuals_3_0= ruleExpr ) )? (otherlv_4= ',' ( (lv_actuals_5_0= ruleExpr ) ) )* otherlv_6= ')' )? ) | ( () ( (lv_value_8_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_10_0= RULE_STRING ) ) ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1590:1: ( ( () ( ( ruleQID ) ) (otherlv_2= '(' ( (lv_actuals_3_0= ruleExpr ) )? (otherlv_4= ',' ( (lv_actuals_5_0= ruleExpr ) ) )* otherlv_6= ')' )? ) | ( () ( (lv_value_8_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_10_0= RULE_STRING ) ) ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1590:1: ( ( () ( ( ruleQID ) ) (otherlv_2= '(' ( (lv_actuals_3_0= ruleExpr ) )? (otherlv_4= ',' ( (lv_actuals_5_0= ruleExpr ) ) )* otherlv_6= ')' )? ) | ( () ( (lv_value_8_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_10_0= RULE_STRING ) ) ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt21=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt21=2;
                }
                break;
            case RULE_STRING:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1590:2: ( () ( ( ruleQID ) ) (otherlv_2= '(' ( (lv_actuals_3_0= ruleExpr ) )? (otherlv_4= ',' ( (lv_actuals_5_0= ruleExpr ) ) )* otherlv_6= ')' )? )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1590:2: ( () ( ( ruleQID ) ) (otherlv_2= '(' ( (lv_actuals_3_0= ruleExpr ) )? (otherlv_4= ',' ( (lv_actuals_5_0= ruleExpr ) ) )* otherlv_6= ')' )? )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1590:3: () ( ( ruleQID ) ) (otherlv_2= '(' ( (lv_actuals_3_0= ruleExpr ) )? (otherlv_4= ',' ( (lv_actuals_5_0= ruleExpr ) ) )* otherlv_6= ')' )?
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1590:3: ()
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1591:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getSymbolRefAction_0_0(),
                                current);
                        

                    }

                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1596:2: ( ( ruleQID ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1597:1: ( ruleQID )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1597:1: ( ruleQID )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1598:3: ruleQID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAtomicAccess().getSymbolSymbolCrossReference_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQID_in_ruleAtomic3670);
                    ruleQID();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1611:2: (otherlv_2= '(' ( (lv_actuals_3_0= ruleExpr ) )? (otherlv_4= ',' ( (lv_actuals_5_0= ruleExpr ) ) )* otherlv_6= ')' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==18) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1611:4: otherlv_2= '(' ( (lv_actuals_3_0= ruleExpr ) )? (otherlv_4= ',' ( (lv_actuals_5_0= ruleExpr ) ) )* otherlv_6= ')'
                            {
                            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleAtomic3683); 

                                	newLeafNode(otherlv_2, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_2_0());
                                
                            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1615:1: ( (lv_actuals_3_0= ruleExpr ) )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)) ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1616:1: (lv_actuals_3_0= ruleExpr )
                                    {
                                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1616:1: (lv_actuals_3_0= ruleExpr )
                                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1617:3: lv_actuals_3_0= ruleExpr
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getAtomicAccess().getActualsExprParserRuleCall_0_2_1_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomic3704);
                                    lv_actuals_3_0=ruleExpr();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getAtomicRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"actuals",
                                            		lv_actuals_3_0, 
                                            		"Expr");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }
                                    break;

                            }

                            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1633:3: (otherlv_4= ',' ( (lv_actuals_5_0= ruleExpr ) ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==19) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1633:5: otherlv_4= ',' ( (lv_actuals_5_0= ruleExpr ) )
                            	    {
                            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleAtomic3718); 

                            	        	newLeafNode(otherlv_4, grammarAccess.getAtomicAccess().getCommaKeyword_0_2_2_0());
                            	        
                            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1637:1: ( (lv_actuals_5_0= ruleExpr ) )
                            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1638:1: (lv_actuals_5_0= ruleExpr )
                            	    {
                            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1638:1: (lv_actuals_5_0= ruleExpr )
                            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1639:3: lv_actuals_5_0= ruleExpr
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getAtomicAccess().getActualsExprParserRuleCall_0_2_2_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleExpr_in_ruleAtomic3739);
                            	    lv_actuals_5_0=ruleExpr();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getAtomicRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"actuals",
                            	            		lv_actuals_5_0, 
                            	            		"Expr");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop19;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleAtomic3753); 

                                	newLeafNode(otherlv_6, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2_3());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1660:6: ( () ( (lv_value_8_0= RULE_NUMBER ) ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1660:6: ( () ( (lv_value_8_0= RULE_NUMBER ) ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1660:7: () ( (lv_value_8_0= RULE_NUMBER ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1660:7: ()
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1661:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getNumberLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1666:2: ( (lv_value_8_0= RULE_NUMBER ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1667:1: (lv_value_8_0= RULE_NUMBER )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1667:1: (lv_value_8_0= RULE_NUMBER )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1668:3: lv_value_8_0= RULE_NUMBER
                    {
                    lv_value_8_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAtomic3789); 

                    			newLeafNode(lv_value_8_0, grammarAccess.getAtomicAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_8_0, 
                            		"NUMBER");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1685:6: ( () ( (lv_value_10_0= RULE_STRING ) ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1685:6: ( () ( (lv_value_10_0= RULE_STRING ) ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1685:7: () ( (lv_value_10_0= RULE_STRING ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1685:7: ()
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1686:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getStringLiteralAction_2_0(),
                                current);
                        

                    }

                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1691:2: ( (lv_value_10_0= RULE_STRING ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1692:1: (lv_value_10_0= RULE_STRING )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1692:1: (lv_value_10_0= RULE_STRING )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1693:3: lv_value_10_0= RULE_STRING
                    {
                    lv_value_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomic3828); 

                    			newLeafNode(lv_value_10_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_10_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleQID"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1717:1: entryRuleQID returns [String current=null] : iv_ruleQID= ruleQID EOF ;
    public final String entryRuleQID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQID = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1718:2: (iv_ruleQID= ruleQID EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1719:2: iv_ruleQID= ruleQID EOF
            {
             newCompositeNode(grammarAccess.getQIDRule()); 
            pushFollow(FOLLOW_ruleQID_in_entryRuleQID3871);
            iv_ruleQID=ruleQID();

            state._fsp--;

             current =iv_ruleQID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQID3882); 

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
    // $ANTLR end "entryRuleQID"


    // $ANTLR start "ruleQID"
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1726:1: ruleQID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1729:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1730:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1730:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1730:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQID3922); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1737:1: (kw= '.' this_ID_2= RULE_ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==15) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1738:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleQID3941); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQIDAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQID3956); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleQID"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModel128 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModel154 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel171 = new BitSet(new long[]{0x0000008072824002L});
    public static final BitSet FOLLOW_ruleUsing_in_ruleModel197 = new BitSet(new long[]{0x0000008072824002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleModel220 = new BitSet(new long[]{0x0000008072820002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_ruleModel247 = new BitSet(new long[]{0x0000008072820002L});
    public static final BitSet FOLLOW_ruleUsing_in_entryRuleUsing285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsing295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleUsing332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleImportID_in_ruleUsing353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportID_in_entryRuleImportID390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportID401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImportID441 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImportID460 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleImportID473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_ruleElement571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_ruleElement598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_ruleElement625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssert_in_ruleElement652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_ruleElement679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleFunctionDeclaration770 = new BitSet(new long[]{0x0000007900000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleFunctionDeclaration791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDeclaration808 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionDeclaration825 = new BitSet(new long[]{0x0000007900100010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionDeclaration847 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionDeclaration860 = new BitSet(new long[]{0x0000007900000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionDeclaration881 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionDeclaration897 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionDeclaration909 = new BitSet(new long[]{0x0000008072C00000L});
    public static final BitSet FOLLOW_ruleElement_in_ruleFunctionDeclaration930 = new BitSet(new long[]{0x0000008072C00000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionDeclaration943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleReturn1026 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleReturn1047 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleReturn1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameter1160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssert_in_entryRuleAssert1218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssert1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleAssert1265 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAssert1286 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAssert1298 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAssert1319 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleAssert1332 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAssert1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl1391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDecl1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEnumDecl1438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDecl1455 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleEnumDecl1472 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_ruleEnumDecl1493 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_ruleEnumDecl1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral1542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteral1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumLiteral1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl1644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleVarDecl1706 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleVarDecl1732 = new BitSet(new long[]{0x0000007900000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleVarDecl1753 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDecl1770 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_31_in_ruleVarDecl1788 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleVarDecl1809 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleVarDecl1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleType1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_ruleType1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType1978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_rulePrimitiveType2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolType_in_rulePrimitiveType2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_rulePrimitiveType2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rulePrimitiveType2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rulePrimitiveType2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType2178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleArrayType2234 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleArrayType2246 = new BitSet(new long[]{0x0000007900000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleArrayType2267 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleArrayType2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType2315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumType2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_entryRuleIntType2404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntType2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleIntType2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolType_in_entryRuleBoolType2496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolType2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBoolType2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_entryRuleFloatType2588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatType2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleFloatType2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType2680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleStringType2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_entryRuleFormula2772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormula2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleFormula2828 = new BitSet(new long[]{0x0000007900000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleFormula2849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormula2866 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFormula2883 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleFormula2904 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFormula2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr2952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleExpr3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison3042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleComparison3099 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleComparison3120 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleComparison3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition3179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition3236 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleAddition3257 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition3278 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication3316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_ruleMultiplication3373 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleMultiplication3394 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_ruleMultiplication3415 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_entryRulePostfixOperators3453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostfixOperators3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePostfixOperators3510 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_rulePostfixOperators3531 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_rulePostfixOperators3552 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePostfixOperators3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic3602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_ruleAtomic3670 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleAtomic3683 = new BitSet(new long[]{0x0000000000180070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomic3704 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleAtomic3718 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomic3739 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleAtomic3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAtomic3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomic3828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_entryRuleQID3871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQID3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQID3922 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQID3941 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQID3956 = new BitSet(new long[]{0x0000000000008002L});

}