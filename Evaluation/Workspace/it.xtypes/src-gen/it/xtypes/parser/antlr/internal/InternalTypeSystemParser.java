package it.xtypes.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.xtypes.services.TypeSystemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTypeSystemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'typesystem'", "'grammar'", "'genmodel'", "'judgments'", "'end'", "'kind'", "'success'", "'fail'", "'nomatch'", "'binary'", "'axiom'", "'rule'", "'derives'", "'from'", "'('", "')'", "'var'", "'List'", "'['", "']'", "'String'", "'Integer'", "'Object'", "'foreach'", "'as'", "'{'", "'}'", "'forall'", "'in'", "'!'", "'exists'", "'error'", "'empty'", "'env'", "','", "'len'", "'getall'", "'container'", "'null'", "'newname'", "'clone'", "'.'", "'$'", "'|'", "'or'", "'->'", "'<'", "'>'", "'-'", "'~'", "':='", "'='", "'+'", "'!='", "':'"
    };
    public static final int RULE_ID=4;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalTypeSystemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTypeSystemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTypeSystemParser.tokenNames; }
    public String getGrammarFileName() { return "../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private TypeSystemGrammarAccess grammarAccess;
     	
        public InternalTypeSystemParser(TokenStream input, TypeSystemGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "TypeSystemDefinition";	
       	}
       	
       	@Override
       	protected TypeSystemGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTypeSystemDefinition"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:74:1: entryRuleTypeSystemDefinition returns [EObject current=null] : iv_ruleTypeSystemDefinition= ruleTypeSystemDefinition EOF ;
    public final EObject entryRuleTypeSystemDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSystemDefinition = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:75:2: (iv_ruleTypeSystemDefinition= ruleTypeSystemDefinition EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:76:2: iv_ruleTypeSystemDefinition= ruleTypeSystemDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeSystemDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTypeSystemDefinition_in_entryRuleTypeSystemDefinition81);
            iv_ruleTypeSystemDefinition=ruleTypeSystemDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeSystemDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeSystemDefinition91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeSystemDefinition"


    // $ANTLR start "ruleTypeSystemDefinition"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:83:1: ruleTypeSystemDefinition returns [EObject current=null] : ( (otherlv_0= 'typesystem' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'grammar' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= 'genmodel' ( (lv_genModel_5_0= RULE_STRING ) ) )? (otherlv_6= 'judgments' ( (lv_judgmentDescriptions_7_0= ruleJudgmentDescription ) )+ otherlv_8= 'end' )? ( (lv_rules_9_0= ruleRule ) )* ) ;
    public final EObject ruleTypeSystemDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_genModel_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_judgmentDescriptions_7_0 = null;

        EObject lv_rules_9_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:86:28: ( ( (otherlv_0= 'typesystem' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'grammar' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= 'genmodel' ( (lv_genModel_5_0= RULE_STRING ) ) )? (otherlv_6= 'judgments' ( (lv_judgmentDescriptions_7_0= ruleJudgmentDescription ) )+ otherlv_8= 'end' )? ( (lv_rules_9_0= ruleRule ) )* ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:87:1: ( (otherlv_0= 'typesystem' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'grammar' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= 'genmodel' ( (lv_genModel_5_0= RULE_STRING ) ) )? (otherlv_6= 'judgments' ( (lv_judgmentDescriptions_7_0= ruleJudgmentDescription ) )+ otherlv_8= 'end' )? ( (lv_rules_9_0= ruleRule ) )* )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:87:1: ( (otherlv_0= 'typesystem' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'grammar' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= 'genmodel' ( (lv_genModel_5_0= RULE_STRING ) ) )? (otherlv_6= 'judgments' ( (lv_judgmentDescriptions_7_0= ruleJudgmentDescription ) )+ otherlv_8= 'end' )? ( (lv_rules_9_0= ruleRule ) )* )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:87:2: (otherlv_0= 'typesystem' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'grammar' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= 'genmodel' ( (lv_genModel_5_0= RULE_STRING ) ) )? (otherlv_6= 'judgments' ( (lv_judgmentDescriptions_7_0= ruleJudgmentDescription ) )+ otherlv_8= 'end' )? ( (lv_rules_9_0= ruleRule ) )*
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:87:2: (otherlv_0= 'typesystem' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:87:4: otherlv_0= 'typesystem' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleTypeSystemDefinition129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getTypeSystemDefinitionAccess().getTypesystemKeyword_0_0());
                          
                    }
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:91:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:92:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:92:1: (lv_name_1_0= RULE_ID )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:93:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeSystemDefinition146); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getTypeSystemDefinitionAccess().getNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeSystemDefinitionRule());
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
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleTypeSystemDefinition165); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypeSystemDefinitionAccess().getGrammarKeyword_1());
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:113:1: ( (otherlv_3= RULE_STRING ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:114:1: (otherlv_3= RULE_STRING )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:114:1: (otherlv_3= RULE_STRING )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:115:3: otherlv_3= RULE_STRING
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeSystemDefinitionRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeSystemDefinition189); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getTypeSystemDefinitionAccess().getEPackageEPackageCrossReference_2_0()); 
              	
            }

            }


            }

            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:129:2: (otherlv_4= 'genmodel' ( (lv_genModel_5_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:129:4: otherlv_4= 'genmodel' ( (lv_genModel_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleTypeSystemDefinition202); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTypeSystemDefinitionAccess().getGenmodelKeyword_3_0());
                          
                    }
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:133:1: ( (lv_genModel_5_0= RULE_STRING ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:134:1: (lv_genModel_5_0= RULE_STRING )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:134:1: (lv_genModel_5_0= RULE_STRING )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:135:3: lv_genModel_5_0= RULE_STRING
                    {
                    lv_genModel_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeSystemDefinition219); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_genModel_5_0, grammarAccess.getTypeSystemDefinitionAccess().getGenModelSTRINGTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeSystemDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"genModel",
                              		lv_genModel_5_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:151:4: (otherlv_6= 'judgments' ( (lv_judgmentDescriptions_7_0= ruleJudgmentDescription ) )+ otherlv_8= 'end' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:151:6: otherlv_6= 'judgments' ( (lv_judgmentDescriptions_7_0= ruleJudgmentDescription ) )+ otherlv_8= 'end'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleTypeSystemDefinition239); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTypeSystemDefinitionAccess().getJudgmentsKeyword_4_0());
                          
                    }
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:155:1: ( (lv_judgmentDescriptions_7_0= ruleJudgmentDescription ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_STRING) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:156:1: (lv_judgmentDescriptions_7_0= ruleJudgmentDescription )
                    	    {
                    	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:156:1: (lv_judgmentDescriptions_7_0= ruleJudgmentDescription )
                    	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:157:3: lv_judgmentDescriptions_7_0= ruleJudgmentDescription
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeSystemDefinitionAccess().getJudgmentDescriptionsJudgmentDescriptionParserRuleCall_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJudgmentDescription_in_ruleTypeSystemDefinition260);
                    	    lv_judgmentDescriptions_7_0=ruleJudgmentDescription();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTypeSystemDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"judgmentDescriptions",
                    	              		lv_judgmentDescriptions_7_0, 
                    	              		"JudgmentDescription");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleTypeSystemDefinition273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTypeSystemDefinitionAccess().getEndKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:177:3: ( (lv_rules_9_0= ruleRule ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=21 && LA5_0<=22)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:178:1: (lv_rules_9_0= ruleRule )
            	    {
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:178:1: (lv_rules_9_0= ruleRule )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:179:3: lv_rules_9_0= ruleRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypeSystemDefinitionAccess().getRulesRuleParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRule_in_ruleTypeSystemDefinition296);
            	    lv_rules_9_0=ruleRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTypeSystemDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"rules",
            	              		lv_rules_9_0, 
            	              		"Rule");
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeSystemDefinition"


    // $ANTLR start "entryRuleJudgmentDescription"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:203:1: entryRuleJudgmentDescription returns [EObject current=null] : iv_ruleJudgmentDescription= ruleJudgmentDescription EOF ;
    public final EObject entryRuleJudgmentDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJudgmentDescription = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5()
        		);
        	
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:209:2: (iv_ruleJudgmentDescription= ruleJudgmentDescription EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:210:2: iv_ruleJudgmentDescription= ruleJudgmentDescription EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJudgmentDescriptionRule()); 
            }
            pushFollow(FOLLOW_ruleJudgmentDescription_in_entryRuleJudgmentDescription339);
            iv_ruleJudgmentDescription=ruleJudgmentDescription();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJudgmentDescription; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJudgmentDescription349); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleJudgmentDescription"


    // $ANTLR start "ruleJudgmentDescription"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:220:1: ruleJudgmentDescription returns [EObject current=null] : ( ( (lv_judgmentsymbol_0_0= RULE_STRING ) ) ( (lv_relation_1_0= RULE_STRING ) ) otherlv_2= 'kind' ruleEqualsOp ( (lv_kind_4_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_binary_15_0= 'binary' ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleJudgmentDescription() throws RecognitionException {
        EObject current = null;

        Token lv_judgmentsymbol_0_0=null;
        Token lv_relation_1_0=null;
        Token otherlv_2=null;
        Token lv_kind_4_0=null;
        Token otherlv_6=null;
        Token lv_success_8_0=null;
        Token otherlv_9=null;
        Token lv_fail_11_0=null;
        Token otherlv_12=null;
        Token lv_nomatch_14_0=null;
        Token lv_binary_15_0=null;

         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5()
        		);
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:226:28: ( ( ( (lv_judgmentsymbol_0_0= RULE_STRING ) ) ( (lv_relation_1_0= RULE_STRING ) ) otherlv_2= 'kind' ruleEqualsOp ( (lv_kind_4_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_binary_15_0= 'binary' ) ) ) ) ) )* ) ) ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:227:1: ( ( (lv_judgmentsymbol_0_0= RULE_STRING ) ) ( (lv_relation_1_0= RULE_STRING ) ) otherlv_2= 'kind' ruleEqualsOp ( (lv_kind_4_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_binary_15_0= 'binary' ) ) ) ) ) )* ) ) ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:227:1: ( ( (lv_judgmentsymbol_0_0= RULE_STRING ) ) ( (lv_relation_1_0= RULE_STRING ) ) otherlv_2= 'kind' ruleEqualsOp ( (lv_kind_4_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_binary_15_0= 'binary' ) ) ) ) ) )* ) ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:227:2: ( (lv_judgmentsymbol_0_0= RULE_STRING ) ) ( (lv_relation_1_0= RULE_STRING ) ) otherlv_2= 'kind' ruleEqualsOp ( (lv_kind_4_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_binary_15_0= 'binary' ) ) ) ) ) )* ) ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:227:2: ( (lv_judgmentsymbol_0_0= RULE_STRING ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:228:1: (lv_judgmentsymbol_0_0= RULE_STRING )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:228:1: (lv_judgmentsymbol_0_0= RULE_STRING )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:229:3: lv_judgmentsymbol_0_0= RULE_STRING
            {
            lv_judgmentsymbol_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJudgmentDescription395); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_judgmentsymbol_0_0, grammarAccess.getJudgmentDescriptionAccess().getJudgmentsymbolSTRINGTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getJudgmentDescriptionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"judgmentsymbol",
                      		lv_judgmentsymbol_0_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:245:2: ( (lv_relation_1_0= RULE_STRING ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:246:1: (lv_relation_1_0= RULE_STRING )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:246:1: (lv_relation_1_0= RULE_STRING )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:247:3: lv_relation_1_0= RULE_STRING
            {
            lv_relation_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJudgmentDescription417); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_relation_1_0, grammarAccess.getJudgmentDescriptionAccess().getRelationSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getJudgmentDescriptionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"relation",
                      		lv_relation_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleJudgmentDescription434); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getJudgmentDescriptionAccess().getKindKeyword_2());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getJudgmentDescriptionAccess().getEqualsOpParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_ruleEqualsOp_in_ruleJudgmentDescription453);
            ruleEqualsOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:278:1: ( (lv_kind_4_0= RULE_STRING ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:279:1: (lv_kind_4_0= RULE_STRING )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:279:1: (lv_kind_4_0= RULE_STRING )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:280:3: lv_kind_4_0= RULE_STRING
            {
            lv_kind_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJudgmentDescription469); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_kind_4_0, grammarAccess.getJudgmentDescriptionAccess().getKindSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getJudgmentDescriptionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"kind",
                      		lv_kind_4_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:296:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_binary_15_0= 'binary' ) ) ) ) ) )* ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:298:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_binary_15_0= 'binary' ) ) ) ) ) )* ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:298:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_binary_15_0= 'binary' ) ) ) ) ) )* ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:299:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_binary_15_0= 'binary' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5());
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:302:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_binary_15_0= 'binary' ) ) ) ) ) )* )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:303:3: ( ({...}? => ( ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_binary_15_0= 'binary' ) ) ) ) ) )*
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:303:3: ( ({...}? => ( ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_binary_15_0= 'binary' ) ) ) ) ) )*
            loop6:
            do {
                int alt6=5;
                int LA6_0 = input.LA(1);

                if ( LA6_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 0) ) {
                    alt6=1;
                }
                else if ( LA6_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 1) ) {
                    alt6=2;
                }
                else if ( LA6_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 2) ) {
                    alt6=3;
                }
                else if ( LA6_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 3) ) {
                    alt6=4;
                }


                switch (alt6) {
            	case 1 :
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:305:4: ({...}? => ( ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:305:4: ({...}? => ( ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) ) ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:306:5: {...}? => ( ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleJudgmentDescription", "getUnorderedGroupHelper().canSelect(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:306:116: ( ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:307:6: ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 0);
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:310:6: ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:310:7: {...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleJudgmentDescription", "true");
            	    }
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:310:16: (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:310:18: otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleJudgmentDescription532); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getJudgmentDescriptionAccess().getSuccessKeyword_5_0_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getJudgmentDescriptionAccess().getEqualsOpParserRuleCall_5_0_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleEqualsOp_in_ruleJudgmentDescription551);
            	    ruleEqualsOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:325:1: ( (lv_success_8_0= RULE_STRING ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:326:1: (lv_success_8_0= RULE_STRING )
            	    {
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:326:1: (lv_success_8_0= RULE_STRING )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:327:3: lv_success_8_0= RULE_STRING
            	    {
            	    lv_success_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJudgmentDescription567); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_success_8_0, grammarAccess.getJudgmentDescriptionAccess().getSuccessSTRINGTerminalRuleCall_5_0_2_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getJudgmentDescriptionRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"success",
            	              		lv_success_8_0, 
            	              		"STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:350:4: ({...}? => ( ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:350:4: ({...}? => ( ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) ) ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:351:5: {...}? => ( ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleJudgmentDescription", "getUnorderedGroupHelper().canSelect(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:351:116: ( ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:352:6: ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 1);
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:355:6: ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:355:7: {...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleJudgmentDescription", "true");
            	    }
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:355:16: (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:355:18: otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleJudgmentDescription640); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getJudgmentDescriptionAccess().getFailKeyword_5_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getJudgmentDescriptionAccess().getEqualsOpParserRuleCall_5_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleEqualsOp_in_ruleJudgmentDescription659);
            	    ruleEqualsOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:370:1: ( (lv_fail_11_0= RULE_STRING ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:371:1: (lv_fail_11_0= RULE_STRING )
            	    {
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:371:1: (lv_fail_11_0= RULE_STRING )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:372:3: lv_fail_11_0= RULE_STRING
            	    {
            	    lv_fail_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJudgmentDescription675); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_fail_11_0, grammarAccess.getJudgmentDescriptionAccess().getFailSTRINGTerminalRuleCall_5_1_2_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getJudgmentDescriptionRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"fail",
            	              		lv_fail_11_0, 
            	              		"STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:395:4: ({...}? => ( ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:395:4: ({...}? => ( ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) ) ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:396:5: {...}? => ( ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleJudgmentDescription", "getUnorderedGroupHelper().canSelect(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:396:116: ( ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:397:6: ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 2);
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:400:6: ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:400:7: {...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleJudgmentDescription", "true");
            	    }
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:400:16: (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:400:18: otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) )
            	    {
            	    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleJudgmentDescription748); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getJudgmentDescriptionAccess().getNomatchKeyword_5_2_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getJudgmentDescriptionAccess().getEqualsOpParserRuleCall_5_2_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleEqualsOp_in_ruleJudgmentDescription767);
            	    ruleEqualsOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:415:1: ( (lv_nomatch_14_0= RULE_STRING ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:416:1: (lv_nomatch_14_0= RULE_STRING )
            	    {
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:416:1: (lv_nomatch_14_0= RULE_STRING )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:417:3: lv_nomatch_14_0= RULE_STRING
            	    {
            	    lv_nomatch_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJudgmentDescription783); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_nomatch_14_0, grammarAccess.getJudgmentDescriptionAccess().getNomatchSTRINGTerminalRuleCall_5_2_2_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getJudgmentDescriptionRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"nomatch",
            	              		lv_nomatch_14_0, 
            	              		"STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:440:4: ({...}? => ( ({...}? => ( (lv_binary_15_0= 'binary' ) ) ) ) )
            	    {
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:440:4: ({...}? => ( ({...}? => ( (lv_binary_15_0= 'binary' ) ) ) ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:441:5: {...}? => ( ({...}? => ( (lv_binary_15_0= 'binary' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleJudgmentDescription", "getUnorderedGroupHelper().canSelect(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:441:116: ( ({...}? => ( (lv_binary_15_0= 'binary' ) ) ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:442:6: ({...}? => ( (lv_binary_15_0= 'binary' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 3);
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:445:6: ({...}? => ( (lv_binary_15_0= 'binary' ) ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:445:7: {...}? => ( (lv_binary_15_0= 'binary' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleJudgmentDescription", "true");
            	    }
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:445:16: ( (lv_binary_15_0= 'binary' ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:446:1: (lv_binary_15_0= 'binary' )
            	    {
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:446:1: (lv_binary_15_0= 'binary' )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:447:3: lv_binary_15_0= 'binary'
            	    {
            	    lv_binary_15_0=(Token)match(input,20,FOLLOW_20_in_ruleJudgmentDescription861); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_binary_15_0, grammarAccess.getJudgmentDescriptionAccess().getBinaryBinaryKeyword_5_3_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getJudgmentDescriptionRule());
            	      	        }
            	             		setWithLastConsumed(current, "binary", true, "binary");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5());

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleJudgmentDescription"


    // $ANTLR start "entryRuleRule"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:485:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:486:2: (iv_ruleRule= ruleRule EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:487:2: iv_ruleRule= ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule954);
            iv_ruleRule=ruleRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule964); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:494:1: ruleRule returns [EObject current=null] : (this_Axiom_0= ruleAxiom | this_RuleWithPremises_1= ruleRuleWithPremises ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject this_Axiom_0 = null;

        EObject this_RuleWithPremises_1 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:497:28: ( (this_Axiom_0= ruleAxiom | this_RuleWithPremises_1= ruleRuleWithPremises ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:498:1: (this_Axiom_0= ruleAxiom | this_RuleWithPremises_1= ruleRuleWithPremises )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:498:1: (this_Axiom_0= ruleAxiom | this_RuleWithPremises_1= ruleRuleWithPremises )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:499:2: this_Axiom_0= ruleAxiom
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRuleAccess().getAxiomParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAxiom_in_ruleRule1014);
                    this_Axiom_0=ruleAxiom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Axiom_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:512:2: this_RuleWithPremises_1= ruleRuleWithPremises
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRuleAccess().getRuleWithPremisesParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRuleWithPremises_in_ruleRule1044);
                    this_RuleWithPremises_1=ruleRuleWithPremises();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RuleWithPremises_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleAxiom"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:531:1: entryRuleAxiom returns [EObject current=null] : iv_ruleAxiom= ruleAxiom EOF ;
    public final EObject entryRuleAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxiom = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:532:2: (iv_ruleAxiom= ruleAxiom EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:533:2: iv_ruleAxiom= ruleAxiom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAxiomRule()); 
            }
            pushFollow(FOLLOW_ruleAxiom_in_entryRuleAxiom1079);
            iv_ruleAxiom=ruleAxiom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAxiom; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAxiom1089); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAxiom"


    // $ANTLR start "ruleAxiom"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:540:1: ruleAxiom returns [EObject current=null] : (otherlv_0= 'axiom' ( (lv_name_1_0= RULE_ID ) ) ( (lv_typejudgment_2_0= ruleTypingJudgmentWithEnvironment ) ) ) ;
    public final EObject ruleAxiom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_typejudgment_2_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:543:28: ( (otherlv_0= 'axiom' ( (lv_name_1_0= RULE_ID ) ) ( (lv_typejudgment_2_0= ruleTypingJudgmentWithEnvironment ) ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:544:1: (otherlv_0= 'axiom' ( (lv_name_1_0= RULE_ID ) ) ( (lv_typejudgment_2_0= ruleTypingJudgmentWithEnvironment ) ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:544:1: (otherlv_0= 'axiom' ( (lv_name_1_0= RULE_ID ) ) ( (lv_typejudgment_2_0= ruleTypingJudgmentWithEnvironment ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:544:3: otherlv_0= 'axiom' ( (lv_name_1_0= RULE_ID ) ) ( (lv_typejudgment_2_0= ruleTypingJudgmentWithEnvironment ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleAxiom1126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAxiomAccess().getAxiomKeyword_0());
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:548:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:549:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:549:1: (lv_name_1_0= RULE_ID )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:550:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAxiom1143); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getAxiomAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAxiomRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:566:2: ( (lv_typejudgment_2_0= ruleTypingJudgmentWithEnvironment ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:567:1: (lv_typejudgment_2_0= ruleTypingJudgmentWithEnvironment )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:567:1: (lv_typejudgment_2_0= ruleTypingJudgmentWithEnvironment )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:568:3: lv_typejudgment_2_0= ruleTypingJudgmentWithEnvironment
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAxiomAccess().getTypejudgmentTypingJudgmentWithEnvironmentParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypingJudgmentWithEnvironment_in_ruleAxiom1169);
            lv_typejudgment_2_0=ruleTypingJudgmentWithEnvironment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAxiomRule());
              	        }
                     		set(
                     			current, 
                     			"typejudgment",
                      		lv_typejudgment_2_0, 
                      		"TypingJudgmentWithEnvironment");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAxiom"


    // $ANTLR start "entryRuleRuleWithPremises"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:592:1: entryRuleRuleWithPremises returns [EObject current=null] : iv_ruleRuleWithPremises= ruleRuleWithPremises EOF ;
    public final EObject entryRuleRuleWithPremises() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleWithPremises = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:593:2: (iv_ruleRuleWithPremises= ruleRuleWithPremises EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:594:2: iv_ruleRuleWithPremises= ruleRuleWithPremises EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleWithPremisesRule()); 
            }
            pushFollow(FOLLOW_ruleRuleWithPremises_in_entryRuleRuleWithPremises1205);
            iv_ruleRuleWithPremises=ruleRuleWithPremises();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleWithPremises; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleWithPremises1215); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRuleWithPremises"


    // $ANTLR start "ruleRuleWithPremises"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:601:1: ruleRuleWithPremises returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'derives' ( (lv_typejudgment_3_0= ruleTypingJudgmentWithEnvironment ) ) otherlv_4= 'from' ( (lv_premises_5_0= ruleTypingJudgment ) )+ ) ;
    public final EObject ruleRuleWithPremises() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typejudgment_3_0 = null;

        EObject lv_premises_5_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:604:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'derives' ( (lv_typejudgment_3_0= ruleTypingJudgmentWithEnvironment ) ) otherlv_4= 'from' ( (lv_premises_5_0= ruleTypingJudgment ) )+ ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:605:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'derives' ( (lv_typejudgment_3_0= ruleTypingJudgmentWithEnvironment ) ) otherlv_4= 'from' ( (lv_premises_5_0= ruleTypingJudgment ) )+ )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:605:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'derives' ( (lv_typejudgment_3_0= ruleTypingJudgmentWithEnvironment ) ) otherlv_4= 'from' ( (lv_premises_5_0= ruleTypingJudgment ) )+ )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:605:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'derives' ( (lv_typejudgment_3_0= ruleTypingJudgmentWithEnvironment ) ) otherlv_4= 'from' ( (lv_premises_5_0= ruleTypingJudgment ) )+
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleRuleWithPremises1252); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRuleWithPremisesAccess().getRuleKeyword_0());
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:609:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:610:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:610:1: (lv_name_1_0= RULE_ID )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:611:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleWithPremises1269); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getRuleWithPremisesAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRuleWithPremisesRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleRuleWithPremises1286); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRuleWithPremisesAccess().getDerivesKeyword_2());
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:631:1: ( (lv_typejudgment_3_0= ruleTypingJudgmentWithEnvironment ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:632:1: (lv_typejudgment_3_0= ruleTypingJudgmentWithEnvironment )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:632:1: (lv_typejudgment_3_0= ruleTypingJudgmentWithEnvironment )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:633:3: lv_typejudgment_3_0= ruleTypingJudgmentWithEnvironment
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRuleWithPremisesAccess().getTypejudgmentTypingJudgmentWithEnvironmentParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypingJudgmentWithEnvironment_in_ruleRuleWithPremises1307);
            lv_typejudgment_3_0=ruleTypingJudgmentWithEnvironment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRuleWithPremisesRule());
              	        }
                     		set(
                     			current, 
                     			"typejudgment",
                      		lv_typejudgment_3_0, 
                      		"TypingJudgmentWithEnvironment");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleRuleWithPremises1319); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRuleWithPremisesAccess().getFromKeyword_4());
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:653:1: ( (lv_premises_5_0= ruleTypingJudgment ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_INT)||(LA8_0>=17 && LA8_0<=18)||LA8_0==25||LA8_0==27||LA8_0==34||LA8_0==38||(LA8_0>=40 && LA8_0<=41)||(LA8_0>=43 && LA8_0<=44)||(LA8_0>=46 && LA8_0<=51)||LA8_0==53) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:654:1: (lv_premises_5_0= ruleTypingJudgment )
            	    {
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:654:1: (lv_premises_5_0= ruleTypingJudgment )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:655:3: lv_premises_5_0= ruleTypingJudgment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRuleWithPremisesAccess().getPremisesTypingJudgmentParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTypingJudgment_in_ruleRuleWithPremises1340);
            	    lv_premises_5_0=ruleTypingJudgment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRuleWithPremisesRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"premises",
            	              		lv_premises_5_0, 
            	              		"TypingJudgment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRuleWithPremises"


    // $ANTLR start "entryRuleTypingJudgment"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:679:1: entryRuleTypingJudgment returns [EObject current=null] : iv_ruleTypingJudgment= ruleTypingJudgment EOF ;
    public final EObject entryRuleTypingJudgment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypingJudgment = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:680:2: (iv_ruleTypingJudgment= ruleTypingJudgment EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:681:2: iv_ruleTypingJudgment= ruleTypingJudgment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypingJudgmentRule()); 
            }
            pushFollow(FOLLOW_ruleTypingJudgment_in_entryRuleTypingJudgment1377);
            iv_ruleTypingJudgment=ruleTypingJudgment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypingJudgment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypingJudgment1387); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypingJudgment"


    // $ANTLR start "ruleTypingJudgment"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:688:1: ruleTypingJudgment returns [EObject current=null] : (this_Quantification_0= ruleQuantification | this_VariableDeclarationWithType_1= ruleVariableDeclarationWithType | this_OrTypingJudgment_2= ruleOrTypingJudgment | this_StandardOperation_3= ruleStandardOperation | this_TypingJudgmentWithEnvironment_4= ruleTypingJudgmentWithEnvironment ) ;
    public final EObject ruleTypingJudgment() throws RecognitionException {
        EObject current = null;

        EObject this_Quantification_0 = null;

        EObject this_VariableDeclarationWithType_1 = null;

        EObject this_OrTypingJudgment_2 = null;

        EObject this_StandardOperation_3 = null;

        EObject this_TypingJudgmentWithEnvironment_4 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:691:28: ( (this_Quantification_0= ruleQuantification | this_VariableDeclarationWithType_1= ruleVariableDeclarationWithType | this_OrTypingJudgment_2= ruleOrTypingJudgment | this_StandardOperation_3= ruleStandardOperation | this_TypingJudgmentWithEnvironment_4= ruleTypingJudgmentWithEnvironment ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:692:1: (this_Quantification_0= ruleQuantification | this_VariableDeclarationWithType_1= ruleVariableDeclarationWithType | this_OrTypingJudgment_2= ruleOrTypingJudgment | this_StandardOperation_3= ruleStandardOperation | this_TypingJudgmentWithEnvironment_4= ruleTypingJudgmentWithEnvironment )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:692:1: (this_Quantification_0= ruleQuantification | this_VariableDeclarationWithType_1= ruleVariableDeclarationWithType | this_OrTypingJudgment_2= ruleOrTypingJudgment | this_StandardOperation_3= ruleStandardOperation | this_TypingJudgmentWithEnvironment_4= ruleTypingJudgmentWithEnvironment )
            int alt9=5;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:693:2: this_Quantification_0= ruleQuantification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypingJudgmentAccess().getQuantificationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQuantification_in_ruleTypingJudgment1437);
                    this_Quantification_0=ruleQuantification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Quantification_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:706:2: this_VariableDeclarationWithType_1= ruleVariableDeclarationWithType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypingJudgmentAccess().getVariableDeclarationWithTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclarationWithType_in_ruleTypingJudgment1467);
                    this_VariableDeclarationWithType_1=ruleVariableDeclarationWithType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDeclarationWithType_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:719:2: this_OrTypingJudgment_2= ruleOrTypingJudgment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypingJudgmentAccess().getOrTypingJudgmentParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOrTypingJudgment_in_ruleTypingJudgment1497);
                    this_OrTypingJudgment_2=ruleOrTypingJudgment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OrTypingJudgment_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:732:2: this_StandardOperation_3= ruleStandardOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypingJudgmentAccess().getStandardOperationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStandardOperation_in_ruleTypingJudgment1527);
                    this_StandardOperation_3=ruleStandardOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StandardOperation_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:745:2: this_TypingJudgmentWithEnvironment_4= ruleTypingJudgmentWithEnvironment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypingJudgmentAccess().getTypingJudgmentWithEnvironmentParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypingJudgmentWithEnvironment_in_ruleTypingJudgment1557);
                    this_TypingJudgmentWithEnvironment_4=ruleTypingJudgmentWithEnvironment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypingJudgmentWithEnvironment_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypingJudgment"


    // $ANTLR start "entryRuleOrTypingJudgment"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:764:1: entryRuleOrTypingJudgment returns [EObject current=null] : iv_ruleOrTypingJudgment= ruleOrTypingJudgment EOF ;
    public final EObject entryRuleOrTypingJudgment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrTypingJudgment = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:765:2: (iv_ruleOrTypingJudgment= ruleOrTypingJudgment EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:766:2: iv_ruleOrTypingJudgment= ruleOrTypingJudgment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrTypingJudgmentRule()); 
            }
            pushFollow(FOLLOW_ruleOrTypingJudgment_in_entryRuleOrTypingJudgment1592);
            iv_ruleOrTypingJudgment=ruleOrTypingJudgment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrTypingJudgment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrTypingJudgment1602); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrTypingJudgment"


    // $ANTLR start "ruleOrTypingJudgment"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:773:1: ruleOrTypingJudgment returns [EObject current=null] : (otherlv_0= '(' ( (lv_branches_1_0= ruleOrBranch ) ) ( ruleOrSeparator ( (lv_branches_3_0= ruleOrBranch ) ) )+ otherlv_4= ')' ( (lv_error_5_0= ruleErrorSpecification ) )? ) ;
    public final EObject ruleOrTypingJudgment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_branches_1_0 = null;

        EObject lv_branches_3_0 = null;

        EObject lv_error_5_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:776:28: ( (otherlv_0= '(' ( (lv_branches_1_0= ruleOrBranch ) ) ( ruleOrSeparator ( (lv_branches_3_0= ruleOrBranch ) ) )+ otherlv_4= ')' ( (lv_error_5_0= ruleErrorSpecification ) )? ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:777:1: (otherlv_0= '(' ( (lv_branches_1_0= ruleOrBranch ) ) ( ruleOrSeparator ( (lv_branches_3_0= ruleOrBranch ) ) )+ otherlv_4= ')' ( (lv_error_5_0= ruleErrorSpecification ) )? )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:777:1: (otherlv_0= '(' ( (lv_branches_1_0= ruleOrBranch ) ) ( ruleOrSeparator ( (lv_branches_3_0= ruleOrBranch ) ) )+ otherlv_4= ')' ( (lv_error_5_0= ruleErrorSpecification ) )? )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:777:3: otherlv_0= '(' ( (lv_branches_1_0= ruleOrBranch ) ) ( ruleOrSeparator ( (lv_branches_3_0= ruleOrBranch ) ) )+ otherlv_4= ')' ( (lv_error_5_0= ruleErrorSpecification ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleOrTypingJudgment1639); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOrTypingJudgmentAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:781:1: ( (lv_branches_1_0= ruleOrBranch ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:782:1: (lv_branches_1_0= ruleOrBranch )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:782:1: (lv_branches_1_0= ruleOrBranch )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:783:3: lv_branches_1_0= ruleOrBranch
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrTypingJudgmentAccess().getBranchesOrBranchParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrBranch_in_ruleOrTypingJudgment1660);
            lv_branches_1_0=ruleOrBranch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOrTypingJudgmentRule());
              	        }
                     		add(
                     			current, 
                     			"branches",
                      		lv_branches_1_0, 
                      		"OrBranch");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:799:2: ( ruleOrSeparator ( (lv_branches_3_0= ruleOrBranch ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=54 && LA10_0<=55)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:800:2: ruleOrSeparator ( (lv_branches_3_0= ruleOrBranch ) )
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getOrTypingJudgmentAccess().getOrSeparatorParserRuleCall_2_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOrSeparator_in_ruleOrTypingJudgment1680);
            	    ruleOrSeparator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:810:1: ( (lv_branches_3_0= ruleOrBranch ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:811:1: (lv_branches_3_0= ruleOrBranch )
            	    {
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:811:1: (lv_branches_3_0= ruleOrBranch )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:812:3: lv_branches_3_0= ruleOrBranch
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrTypingJudgmentAccess().getBranchesOrBranchParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrBranch_in_ruleOrTypingJudgment1700);
            	    lv_branches_3_0=ruleOrBranch();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrTypingJudgmentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"branches",
            	              		lv_branches_3_0, 
            	              		"OrBranch");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleOrTypingJudgment1714); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getOrTypingJudgmentAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:832:1: ( (lv_error_5_0= ruleErrorSpecification ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:833:1: (lv_error_5_0= ruleErrorSpecification )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:833:1: (lv_error_5_0= ruleErrorSpecification )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:834:3: lv_error_5_0= ruleErrorSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrTypingJudgmentAccess().getErrorErrorSpecificationParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleErrorSpecification_in_ruleOrTypingJudgment1735);
                    lv_error_5_0=ruleErrorSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOrTypingJudgmentRule());
                      	        }
                             		set(
                             			current, 
                             			"error",
                              		lv_error_5_0, 
                              		"ErrorSpecification");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOrTypingJudgment"


    // $ANTLR start "entryRuleOrBranch"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:858:1: entryRuleOrBranch returns [EObject current=null] : iv_ruleOrBranch= ruleOrBranch EOF ;
    public final EObject entryRuleOrBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrBranch = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:859:2: (iv_ruleOrBranch= ruleOrBranch EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:860:2: iv_ruleOrBranch= ruleOrBranch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrBranchRule()); 
            }
            pushFollow(FOLLOW_ruleOrBranch_in_entryRuleOrBranch1772);
            iv_ruleOrBranch=ruleOrBranch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrBranch; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrBranch1782); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrBranch"


    // $ANTLR start "ruleOrBranch"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:867:1: ruleOrBranch returns [EObject current=null] : ( (lv_judgments_0_0= ruleTypingJudgment ) )+ ;
    public final EObject ruleOrBranch() throws RecognitionException {
        EObject current = null;

        EObject lv_judgments_0_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:870:28: ( ( (lv_judgments_0_0= ruleTypingJudgment ) )+ )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:871:1: ( (lv_judgments_0_0= ruleTypingJudgment ) )+
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:871:1: ( (lv_judgments_0_0= ruleTypingJudgment ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_INT)||(LA12_0>=17 && LA12_0<=18)||LA12_0==25||LA12_0==27||LA12_0==34||LA12_0==38||(LA12_0>=40 && LA12_0<=41)||(LA12_0>=43 && LA12_0<=44)||(LA12_0>=46 && LA12_0<=51)||LA12_0==53) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:872:1: (lv_judgments_0_0= ruleTypingJudgment )
            	    {
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:872:1: (lv_judgments_0_0= ruleTypingJudgment )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:873:3: lv_judgments_0_0= ruleTypingJudgment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrBranchAccess().getJudgmentsTypingJudgmentParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTypingJudgment_in_ruleOrBranch1827);
            	    lv_judgments_0_0=ruleTypingJudgment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrBranchRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"judgments",
            	              		lv_judgments_0_0, 
            	              		"TypingJudgment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOrBranch"


    // $ANTLR start "entryRuleVariableDeclarationWithType"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:899:1: entryRuleVariableDeclarationWithType returns [EObject current=null] : iv_ruleVariableDeclarationWithType= ruleVariableDeclarationWithType EOF ;
    public final EObject entryRuleVariableDeclarationWithType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarationWithType = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:900:2: (iv_ruleVariableDeclarationWithType= ruleVariableDeclarationWithType EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:901:2: iv_ruleVariableDeclarationWithType= ruleVariableDeclarationWithType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationWithTypeRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclarationWithType_in_entryRuleVariableDeclarationWithType1865);
            iv_ruleVariableDeclarationWithType=ruleVariableDeclarationWithType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclarationWithType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclarationWithType1875); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableDeclarationWithType"


    // $ANTLR start "ruleVariableDeclarationWithType"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:908:1: ruleVariableDeclarationWithType returns [EObject current=null] : (otherlv_0= 'var' ( (lv_expressionType_1_0= ruleExpressionType ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_op_3_0= ruleAssignOp ) ) ( (lv_right_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVariableDeclarationWithType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        EObject lv_expressionType_1_0 = null;

        AntlrDatatypeRuleToken lv_op_3_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:911:28: ( (otherlv_0= 'var' ( (lv_expressionType_1_0= ruleExpressionType ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_op_3_0= ruleAssignOp ) ) ( (lv_right_4_0= ruleExpression ) ) )? ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:912:1: (otherlv_0= 'var' ( (lv_expressionType_1_0= ruleExpressionType ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_op_3_0= ruleAssignOp ) ) ( (lv_right_4_0= ruleExpression ) ) )? )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:912:1: (otherlv_0= 'var' ( (lv_expressionType_1_0= ruleExpressionType ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_op_3_0= ruleAssignOp ) ) ( (lv_right_4_0= ruleExpression ) ) )? )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:912:3: otherlv_0= 'var' ( (lv_expressionType_1_0= ruleExpressionType ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_op_3_0= ruleAssignOp ) ) ( (lv_right_4_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleVariableDeclarationWithType1912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationWithTypeAccess().getVarKeyword_0());
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:916:1: ( (lv_expressionType_1_0= ruleExpressionType ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:917:1: (lv_expressionType_1_0= ruleExpressionType )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:917:1: (lv_expressionType_1_0= ruleExpressionType )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:918:3: lv_expressionType_1_0= ruleExpressionType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationWithTypeAccess().getExpressionTypeExpressionTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpressionType_in_ruleVariableDeclarationWithType1933);
            lv_expressionType_1_0=ruleExpressionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDeclarationWithTypeRule());
              	        }
                     		set(
                     			current, 
                     			"expressionType",
                      		lv_expressionType_1_0, 
                      		"ExpressionType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:934:2: ( (lv_name_2_0= RULE_ID ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:935:1: (lv_name_2_0= RULE_ID )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:935:1: (lv_name_2_0= RULE_ID )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:936:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclarationWithType1950); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getVariableDeclarationWithTypeAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDeclarationWithTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:952:2: ( ( (lv_op_3_0= ruleAssignOp ) ) ( (lv_right_4_0= ruleExpression ) ) )?
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:952:3: ( (lv_op_3_0= ruleAssignOp ) ) ( (lv_right_4_0= ruleExpression ) )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:952:3: ( (lv_op_3_0= ruleAssignOp ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:953:1: (lv_op_3_0= ruleAssignOp )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:953:1: (lv_op_3_0= ruleAssignOp )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:954:3: lv_op_3_0= ruleAssignOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationWithTypeAccess().getOpAssignOpParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignOp_in_ruleVariableDeclarationWithType1977);
                    lv_op_3_0=ruleAssignOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationWithTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_3_0, 
                              		"AssignOp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:970:2: ( (lv_right_4_0= ruleExpression ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:971:1: (lv_right_4_0= ruleExpression )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:971:1: (lv_right_4_0= ruleExpression )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:972:3: lv_right_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationWithTypeAccess().getRightExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDeclarationWithType1998);
                    lv_right_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationWithTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_4_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariableDeclarationWithType"


    // $ANTLR start "entryRuleExpressionType"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:996:1: entryRuleExpressionType returns [EObject current=null] : iv_ruleExpressionType= ruleExpressionType EOF ;
    public final EObject entryRuleExpressionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionType = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:997:2: (iv_ruleExpressionType= ruleExpressionType EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:998:2: iv_ruleExpressionType= ruleExpressionType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionTypeRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionType_in_entryRuleExpressionType2036);
            iv_ruleExpressionType=ruleExpressionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionType2046); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionType"


    // $ANTLR start "ruleExpressionType"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1005:1: ruleExpressionType returns [EObject current=null] : (this_CollectionType_0= ruleCollectionType | this_EClassifierType_1= ruleEClassifierType | this_BasicType_2= ruleBasicType ) ;
    public final EObject ruleExpressionType() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionType_0 = null;

        EObject this_EClassifierType_1 = null;

        EObject this_BasicType_2 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1008:28: ( (this_CollectionType_0= ruleCollectionType | this_EClassifierType_1= ruleEClassifierType | this_BasicType_2= ruleBasicType ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1009:1: (this_CollectionType_0= ruleCollectionType | this_EClassifierType_1= ruleEClassifierType | this_BasicType_2= ruleBasicType )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1009:1: (this_CollectionType_0= ruleCollectionType | this_EClassifierType_1= ruleEClassifierType | this_BasicType_2= ruleBasicType )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt14=1;
                }
                break;
            case RULE_ID:
                {
                alt14=2;
                }
                break;
            case 31:
            case 32:
            case 33:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1010:2: this_CollectionType_0= ruleCollectionType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionTypeAccess().getCollectionTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCollectionType_in_ruleExpressionType2096);
                    this_CollectionType_0=ruleCollectionType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CollectionType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1023:2: this_EClassifierType_1= ruleEClassifierType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionTypeAccess().getEClassifierTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEClassifierType_in_ruleExpressionType2126);
                    this_EClassifierType_1=ruleEClassifierType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EClassifierType_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1036:2: this_BasicType_2= ruleBasicType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionTypeAccess().getBasicTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBasicType_in_ruleExpressionType2156);
                    this_BasicType_2=ruleBasicType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BasicType_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpressionType"


    // $ANTLR start "entryRuleCollectionType"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1055:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1056:2: (iv_ruleCollectionType= ruleCollectionType EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1057:2: iv_ruleCollectionType= ruleCollectionType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeRule()); 
            }
            pushFollow(FOLLOW_ruleCollectionType_in_entryRuleCollectionType2191);
            iv_ruleCollectionType=ruleCollectionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionType2201); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionType"


    // $ANTLR start "ruleCollectionType"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1064:1: ruleCollectionType returns [EObject current=null] : ( ( (lv_collection_0_0= 'List' ) ) otherlv_1= '[' ( (lv_type_2_0= ruleExpressionType ) ) otherlv_3= ']' ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        Token lv_collection_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1067:28: ( ( ( (lv_collection_0_0= 'List' ) ) otherlv_1= '[' ( (lv_type_2_0= ruleExpressionType ) ) otherlv_3= ']' ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1068:1: ( ( (lv_collection_0_0= 'List' ) ) otherlv_1= '[' ( (lv_type_2_0= ruleExpressionType ) ) otherlv_3= ']' )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1068:1: ( ( (lv_collection_0_0= 'List' ) ) otherlv_1= '[' ( (lv_type_2_0= ruleExpressionType ) ) otherlv_3= ']' )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1068:2: ( (lv_collection_0_0= 'List' ) ) otherlv_1= '[' ( (lv_type_2_0= ruleExpressionType ) ) otherlv_3= ']'
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1068:2: ( (lv_collection_0_0= 'List' ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1069:1: (lv_collection_0_0= 'List' )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1069:1: (lv_collection_0_0= 'List' )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1070:3: lv_collection_0_0= 'List'
            {
            lv_collection_0_0=(Token)match(input,28,FOLLOW_28_in_ruleCollectionType2244); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_collection_0_0, grammarAccess.getCollectionTypeAccess().getCollectionListKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCollectionTypeRule());
              	        }
                     		setWithLastConsumed(current, "collection", lv_collection_0_0, "List");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleCollectionType2269); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionTypeAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1087:1: ( (lv_type_2_0= ruleExpressionType ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1088:1: (lv_type_2_0= ruleExpressionType )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1088:1: (lv_type_2_0= ruleExpressionType )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1089:3: lv_type_2_0= ruleExpressionType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionTypeAccess().getTypeExpressionTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpressionType_in_ruleCollectionType2290);
            lv_type_2_0=ruleExpressionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCollectionTypeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"ExpressionType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleCollectionType2302); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCollectionTypeAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCollectionType"


    // $ANTLR start "entryRuleEClassifierType"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1117:1: entryRuleEClassifierType returns [EObject current=null] : iv_ruleEClassifierType= ruleEClassifierType EOF ;
    public final EObject entryRuleEClassifierType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClassifierType = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1118:2: (iv_ruleEClassifierType= ruleEClassifierType EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1119:2: iv_ruleEClassifierType= ruleEClassifierType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEClassifierTypeRule()); 
            }
            pushFollow(FOLLOW_ruleEClassifierType_in_entryRuleEClassifierType2338);
            iv_ruleEClassifierType=ruleEClassifierType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEClassifierType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEClassifierType2348); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEClassifierType"


    // $ANTLR start "ruleEClassifierType"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1126:1: ruleEClassifierType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEClassifierType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1129:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1130:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1130:1: ( (otherlv_0= RULE_ID ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1131:1: (otherlv_0= RULE_ID )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1131:1: (otherlv_0= RULE_ID )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1132:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEClassifierTypeRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEClassifierType2396); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEClassifierTypeAccess().getEclassifierEClassifierCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEClassifierType"


    // $ANTLR start "entryRuleBasicType"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1154:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1155:2: (iv_ruleBasicType= ruleBasicType EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1156:2: iv_ruleBasicType= ruleBasicType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicTypeRule()); 
            }
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType2431);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType2441); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1163:1: ruleBasicType returns [EObject current=null] : ( ( (lv_basic_0_1= 'String' | lv_basic_0_2= 'Integer' | lv_basic_0_3= 'Object' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_basic_0_1=null;
        Token lv_basic_0_2=null;
        Token lv_basic_0_3=null;

         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1166:28: ( ( ( (lv_basic_0_1= 'String' | lv_basic_0_2= 'Integer' | lv_basic_0_3= 'Object' ) ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1167:1: ( ( (lv_basic_0_1= 'String' | lv_basic_0_2= 'Integer' | lv_basic_0_3= 'Object' ) ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1167:1: ( ( (lv_basic_0_1= 'String' | lv_basic_0_2= 'Integer' | lv_basic_0_3= 'Object' ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1168:1: ( (lv_basic_0_1= 'String' | lv_basic_0_2= 'Integer' | lv_basic_0_3= 'Object' ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1168:1: ( (lv_basic_0_1= 'String' | lv_basic_0_2= 'Integer' | lv_basic_0_3= 'Object' ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1169:1: (lv_basic_0_1= 'String' | lv_basic_0_2= 'Integer' | lv_basic_0_3= 'Object' )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1169:1: (lv_basic_0_1= 'String' | lv_basic_0_2= 'Integer' | lv_basic_0_3= 'Object' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt15=1;
                }
                break;
            case 32:
                {
                alt15=2;
                }
                break;
            case 33:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1170:3: lv_basic_0_1= 'String'
                    {
                    lv_basic_0_1=(Token)match(input,31,FOLLOW_31_in_ruleBasicType2485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_basic_0_1, grammarAccess.getBasicTypeAccess().getBasicStringKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBasicTypeRule());
                      	        }
                             		setWithLastConsumed(current, "basic", lv_basic_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1182:8: lv_basic_0_2= 'Integer'
                    {
                    lv_basic_0_2=(Token)match(input,32,FOLLOW_32_in_ruleBasicType2514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_basic_0_2, grammarAccess.getBasicTypeAccess().getBasicIntegerKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBasicTypeRule());
                      	        }
                             		setWithLastConsumed(current, "basic", lv_basic_0_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1194:8: lv_basic_0_3= 'Object'
                    {
                    lv_basic_0_3=(Token)match(input,33,FOLLOW_33_in_ruleBasicType2543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_basic_0_3, grammarAccess.getBasicTypeAccess().getBasicObjectKeyword_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBasicTypeRule());
                      	        }
                             		setWithLastConsumed(current, "basic", lv_basic_0_3, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleVariableSimpleDeclaration"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1217:1: entryRuleVariableSimpleDeclaration returns [EObject current=null] : iv_ruleVariableSimpleDeclaration= ruleVariableSimpleDeclaration EOF ;
    public final EObject entryRuleVariableSimpleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableSimpleDeclaration = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1218:2: (iv_ruleVariableSimpleDeclaration= ruleVariableSimpleDeclaration EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1219:2: iv_ruleVariableSimpleDeclaration= ruleVariableSimpleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableSimpleDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableSimpleDeclaration_in_entryRuleVariableSimpleDeclaration2594);
            iv_ruleVariableSimpleDeclaration=ruleVariableSimpleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableSimpleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableSimpleDeclaration2604); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableSimpleDeclaration"


    // $ANTLR start "ruleVariableSimpleDeclaration"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1226:1: ruleVariableSimpleDeclaration returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableSimpleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1229:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1230:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1230:1: ( (lv_name_0_0= RULE_ID ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1231:1: (lv_name_0_0= RULE_ID )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1231:1: (lv_name_0_0= RULE_ID )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1232:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableSimpleDeclaration2645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getVariableSimpleDeclarationAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableSimpleDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariableSimpleDeclaration"


    // $ANTLR start "entryRuleQuantification"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1256:1: entryRuleQuantification returns [EObject current=null] : iv_ruleQuantification= ruleQuantification EOF ;
    public final EObject entryRuleQuantification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantification = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1257:2: (iv_ruleQuantification= ruleQuantification EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1258:2: iv_ruleQuantification= ruleQuantification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuantificationRule()); 
            }
            pushFollow(FOLLOW_ruleQuantification_in_entryRuleQuantification2685);
            iv_ruleQuantification=ruleQuantification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuantification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantification2695); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQuantification"


    // $ANTLR start "ruleQuantification"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1265:1: ruleQuantification returns [EObject current=null] : ( (this_ForEach_0= ruleForEach | this_ForAll_1= ruleForAll | this_Exists_2= ruleExists ) ( (lv_error_3_0= ruleErrorSpecification ) )? ) ;
    public final EObject ruleQuantification() throws RecognitionException {
        EObject current = null;

        EObject this_ForEach_0 = null;

        EObject this_ForAll_1 = null;

        EObject this_Exists_2 = null;

        EObject lv_error_3_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1268:28: ( ( (this_ForEach_0= ruleForEach | this_ForAll_1= ruleForAll | this_Exists_2= ruleExists ) ( (lv_error_3_0= ruleErrorSpecification ) )? ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1269:1: ( (this_ForEach_0= ruleForEach | this_ForAll_1= ruleForAll | this_Exists_2= ruleExists ) ( (lv_error_3_0= ruleErrorSpecification ) )? )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1269:1: ( (this_ForEach_0= ruleForEach | this_ForAll_1= ruleForAll | this_Exists_2= ruleExists ) ( (lv_error_3_0= ruleErrorSpecification ) )? )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1269:2: (this_ForEach_0= ruleForEach | this_ForAll_1= ruleForAll | this_Exists_2= ruleExists ) ( (lv_error_3_0= ruleErrorSpecification ) )?
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1269:2: (this_ForEach_0= ruleForEach | this_ForAll_1= ruleForAll | this_Exists_2= ruleExists )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt16=1;
                }
                break;
            case 38:
                {
                alt16=2;
                }
                break;
            case 40:
            case 41:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1270:2: this_ForEach_0= ruleForEach
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuantificationAccess().getForEachParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleForEach_in_ruleQuantification2746);
                    this_ForEach_0=ruleForEach();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ForEach_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1283:2: this_ForAll_1= ruleForAll
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuantificationAccess().getForAllParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleForAll_in_ruleQuantification2776);
                    this_ForAll_1=ruleForAll();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ForAll_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1296:2: this_Exists_2= ruleExists
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuantificationAccess().getExistsParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExists_in_ruleQuantification2806);
                    this_Exists_2=ruleExists();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Exists_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1307:2: ( (lv_error_3_0= ruleErrorSpecification ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==42) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1308:1: (lv_error_3_0= ruleErrorSpecification )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1308:1: (lv_error_3_0= ruleErrorSpecification )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1309:3: lv_error_3_0= ruleErrorSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQuantificationAccess().getErrorErrorSpecificationParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleErrorSpecification_in_ruleQuantification2827);
                    lv_error_3_0=ruleErrorSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getQuantificationRule());
                      	        }
                             		set(
                             			current, 
                             			"error",
                              		lv_error_3_0, 
                              		"ErrorSpecification");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQuantification"


    // $ANTLR start "entryRuleForEach"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1333:1: entryRuleForEach returns [EObject current=null] : iv_ruleForEach= ruleForEach EOF ;
    public final EObject entryRuleForEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEach = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1334:2: (iv_ruleForEach= ruleForEach EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1335:2: iv_ruleForEach= ruleForEach EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForEachRule()); 
            }
            pushFollow(FOLLOW_ruleForEach_in_entryRuleForEach2864);
            iv_ruleForEach=ruleForEach();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForEach; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForEach2874); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForEach"


    // $ANTLR start "ruleForEach"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1342:1: ruleForEach returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'as' ( (lv_variable_3_0= ruleVariableSimpleDeclaration ) ) otherlv_4= '{' ( (lv_judgments_5_0= ruleTypingJudgment ) )+ otherlv_6= '}' ) ;
    public final EObject ruleForEach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_1_0 = null;

        EObject lv_variable_3_0 = null;

        EObject lv_judgments_5_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1345:28: ( (otherlv_0= 'foreach' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'as' ( (lv_variable_3_0= ruleVariableSimpleDeclaration ) ) otherlv_4= '{' ( (lv_judgments_5_0= ruleTypingJudgment ) )+ otherlv_6= '}' ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1346:1: (otherlv_0= 'foreach' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'as' ( (lv_variable_3_0= ruleVariableSimpleDeclaration ) ) otherlv_4= '{' ( (lv_judgments_5_0= ruleTypingJudgment ) )+ otherlv_6= '}' )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1346:1: (otherlv_0= 'foreach' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'as' ( (lv_variable_3_0= ruleVariableSimpleDeclaration ) ) otherlv_4= '{' ( (lv_judgments_5_0= ruleTypingJudgment ) )+ otherlv_6= '}' )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1346:3: otherlv_0= 'foreach' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'as' ( (lv_variable_3_0= ruleVariableSimpleDeclaration ) ) otherlv_4= '{' ( (lv_judgments_5_0= ruleTypingJudgment ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleForEach2911); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForEachAccess().getForeachKeyword_0());
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1350:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1351:1: (lv_expression_1_0= ruleExpression )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1351:1: (lv_expression_1_0= ruleExpression )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1352:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForEachAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleForEach2932);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForEachRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleForEach2944); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getForEachAccess().getAsKeyword_2());
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1372:1: ( (lv_variable_3_0= ruleVariableSimpleDeclaration ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1373:1: (lv_variable_3_0= ruleVariableSimpleDeclaration )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1373:1: (lv_variable_3_0= ruleVariableSimpleDeclaration )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1374:3: lv_variable_3_0= ruleVariableSimpleDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForEachAccess().getVariableVariableSimpleDeclarationParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableSimpleDeclaration_in_ruleForEach2965);
            lv_variable_3_0=ruleVariableSimpleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForEachRule());
              	        }
                     		set(
                     			current, 
                     			"variable",
                      		lv_variable_3_0, 
                      		"VariableSimpleDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleForEach2977); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1394:1: ( (lv_judgments_5_0= ruleTypingJudgment ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_INT)||(LA18_0>=17 && LA18_0<=18)||LA18_0==25||LA18_0==27||LA18_0==34||LA18_0==38||(LA18_0>=40 && LA18_0<=41)||(LA18_0>=43 && LA18_0<=44)||(LA18_0>=46 && LA18_0<=51)||LA18_0==53) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1395:1: (lv_judgments_5_0= ruleTypingJudgment )
            	    {
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1395:1: (lv_judgments_5_0= ruleTypingJudgment )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1396:3: lv_judgments_5_0= ruleTypingJudgment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getForEachAccess().getJudgmentsTypingJudgmentParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTypingJudgment_in_ruleForEach2998);
            	    lv_judgments_5_0=ruleTypingJudgment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getForEachRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"judgments",
            	              		lv_judgments_5_0, 
            	              		"TypingJudgment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleForEach3011); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleForEach"


    // $ANTLR start "entryRuleForAll"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1424:1: entryRuleForAll returns [EObject current=null] : iv_ruleForAll= ruleForAll EOF ;
    public final EObject entryRuleForAll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForAll = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1425:2: (iv_ruleForAll= ruleForAll EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1426:2: iv_ruleForAll= ruleForAll EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForAllRule()); 
            }
            pushFollow(FOLLOW_ruleForAll_in_entryRuleForAll3047);
            iv_ruleForAll=ruleForAll();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForAll; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForAll3057); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForAll"


    // $ANTLR start "ruleForAll"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1433:1: ruleForAll returns [EObject current=null] : (otherlv_0= 'forall' ( (lv_variable_1_0= ruleVariableSimpleDeclaration ) ) otherlv_2= 'in' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '{' ( (lv_judgments_5_0= ruleTypingJudgment ) )+ otherlv_6= '}' ) ;
    public final EObject ruleForAll() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_variable_1_0 = null;

        EObject lv_expression_3_0 = null;

        EObject lv_judgments_5_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1436:28: ( (otherlv_0= 'forall' ( (lv_variable_1_0= ruleVariableSimpleDeclaration ) ) otherlv_2= 'in' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '{' ( (lv_judgments_5_0= ruleTypingJudgment ) )+ otherlv_6= '}' ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1437:1: (otherlv_0= 'forall' ( (lv_variable_1_0= ruleVariableSimpleDeclaration ) ) otherlv_2= 'in' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '{' ( (lv_judgments_5_0= ruleTypingJudgment ) )+ otherlv_6= '}' )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1437:1: (otherlv_0= 'forall' ( (lv_variable_1_0= ruleVariableSimpleDeclaration ) ) otherlv_2= 'in' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '{' ( (lv_judgments_5_0= ruleTypingJudgment ) )+ otherlv_6= '}' )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1437:3: otherlv_0= 'forall' ( (lv_variable_1_0= ruleVariableSimpleDeclaration ) ) otherlv_2= 'in' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '{' ( (lv_judgments_5_0= ruleTypingJudgment ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleForAll3094); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForAllAccess().getForallKeyword_0());
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1441:1: ( (lv_variable_1_0= ruleVariableSimpleDeclaration ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1442:1: (lv_variable_1_0= ruleVariableSimpleDeclaration )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1442:1: (lv_variable_1_0= ruleVariableSimpleDeclaration )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1443:3: lv_variable_1_0= ruleVariableSimpleDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAllAccess().getVariableVariableSimpleDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableSimpleDeclaration_in_ruleForAll3115);
            lv_variable_1_0=ruleVariableSimpleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForAllRule());
              	        }
                     		set(
                     			current, 
                     			"variable",
                      		lv_variable_1_0, 
                      		"VariableSimpleDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleForAll3127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getForAllAccess().getInKeyword_2());
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1463:1: ( (lv_expression_3_0= ruleExpression ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1464:1: (lv_expression_3_0= ruleExpression )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1464:1: (lv_expression_3_0= ruleExpression )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1465:3: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAllAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleForAll3148);
            lv_expression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForAllRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleForAll3160); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getForAllAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1485:1: ( (lv_judgments_5_0= ruleTypingJudgment ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_INT)||(LA19_0>=17 && LA19_0<=18)||LA19_0==25||LA19_0==27||LA19_0==34||LA19_0==38||(LA19_0>=40 && LA19_0<=41)||(LA19_0>=43 && LA19_0<=44)||(LA19_0>=46 && LA19_0<=51)||LA19_0==53) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1486:1: (lv_judgments_5_0= ruleTypingJudgment )
            	    {
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1486:1: (lv_judgments_5_0= ruleTypingJudgment )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1487:3: lv_judgments_5_0= ruleTypingJudgment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getForAllAccess().getJudgmentsTypingJudgmentParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTypingJudgment_in_ruleForAll3181);
            	    lv_judgments_5_0=ruleTypingJudgment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getForAllRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"judgments",
            	              		lv_judgments_5_0, 
            	              		"TypingJudgment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleForAll3194); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getForAllAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleForAll"


    // $ANTLR start "entryRuleExists"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1515:1: entryRuleExists returns [EObject current=null] : iv_ruleExists= ruleExists EOF ;
    public final EObject entryRuleExists() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExists = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1516:2: (iv_ruleExists= ruleExists EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1517:2: iv_ruleExists= ruleExists EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExistsRule()); 
            }
            pushFollow(FOLLOW_ruleExists_in_entryRuleExists3230);
            iv_ruleExists=ruleExists();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExists; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExists3240); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExists"


    // $ANTLR start "ruleExists"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1524:1: ruleExists returns [EObject current=null] : ( ( (lv_not_0_0= '!' ) )? otherlv_1= 'exists' ( (lv_variable_2_0= ruleVariableSimpleDeclaration ) ) otherlv_3= 'in' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= '{' ( (lv_judgments_6_0= ruleTypingJudgment ) )+ otherlv_7= '}' ) ;
    public final EObject ruleExists() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_variable_2_0 = null;

        EObject lv_expression_4_0 = null;

        EObject lv_judgments_6_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1527:28: ( ( ( (lv_not_0_0= '!' ) )? otherlv_1= 'exists' ( (lv_variable_2_0= ruleVariableSimpleDeclaration ) ) otherlv_3= 'in' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= '{' ( (lv_judgments_6_0= ruleTypingJudgment ) )+ otherlv_7= '}' ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1528:1: ( ( (lv_not_0_0= '!' ) )? otherlv_1= 'exists' ( (lv_variable_2_0= ruleVariableSimpleDeclaration ) ) otherlv_3= 'in' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= '{' ( (lv_judgments_6_0= ruleTypingJudgment ) )+ otherlv_7= '}' )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1528:1: ( ( (lv_not_0_0= '!' ) )? otherlv_1= 'exists' ( (lv_variable_2_0= ruleVariableSimpleDeclaration ) ) otherlv_3= 'in' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= '{' ( (lv_judgments_6_0= ruleTypingJudgment ) )+ otherlv_7= '}' )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1528:2: ( (lv_not_0_0= '!' ) )? otherlv_1= 'exists' ( (lv_variable_2_0= ruleVariableSimpleDeclaration ) ) otherlv_3= 'in' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= '{' ( (lv_judgments_6_0= ruleTypingJudgment ) )+ otherlv_7= '}'
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1528:2: ( (lv_not_0_0= '!' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1529:1: (lv_not_0_0= '!' )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1529:1: (lv_not_0_0= '!' )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1530:3: lv_not_0_0= '!'
                    {
                    lv_not_0_0=(Token)match(input,40,FOLLOW_40_in_ruleExists3283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_not_0_0, grammarAccess.getExistsAccess().getNotExclamationMarkKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExistsRule());
                      	        }
                             		setWithLastConsumed(current, "not", true, "!");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleExists3309); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExistsAccess().getExistsKeyword_1());
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1547:1: ( (lv_variable_2_0= ruleVariableSimpleDeclaration ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1548:1: (lv_variable_2_0= ruleVariableSimpleDeclaration )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1548:1: (lv_variable_2_0= ruleVariableSimpleDeclaration )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1549:3: lv_variable_2_0= ruleVariableSimpleDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExistsAccess().getVariableVariableSimpleDeclarationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableSimpleDeclaration_in_ruleExists3330);
            lv_variable_2_0=ruleVariableSimpleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExistsRule());
              	        }
                     		set(
                     			current, 
                     			"variable",
                      		lv_variable_2_0, 
                      		"VariableSimpleDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleExists3342); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExistsAccess().getInKeyword_3());
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1569:1: ( (lv_expression_4_0= ruleExpression ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1570:1: (lv_expression_4_0= ruleExpression )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1570:1: (lv_expression_4_0= ruleExpression )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1571:3: lv_expression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExistsAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExists3363);
            lv_expression_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExistsRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleExists3375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getExistsAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1591:1: ( (lv_judgments_6_0= ruleTypingJudgment ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_INT)||(LA21_0>=17 && LA21_0<=18)||LA21_0==25||LA21_0==27||LA21_0==34||LA21_0==38||(LA21_0>=40 && LA21_0<=41)||(LA21_0>=43 && LA21_0<=44)||(LA21_0>=46 && LA21_0<=51)||LA21_0==53) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1592:1: (lv_judgments_6_0= ruleTypingJudgment )
            	    {
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1592:1: (lv_judgments_6_0= ruleTypingJudgment )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1593:3: lv_judgments_6_0= ruleTypingJudgment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExistsAccess().getJudgmentsTypingJudgmentParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTypingJudgment_in_ruleExists3396);
            	    lv_judgments_6_0=ruleTypingJudgment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExistsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"judgments",
            	              		lv_judgments_6_0, 
            	              		"TypingJudgment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_7=(Token)match(input,37,FOLLOW_37_in_ruleExists3409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getExistsAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExists"


    // $ANTLR start "entryRuleStandardOperation"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1621:1: entryRuleStandardOperation returns [EObject current=null] : iv_ruleStandardOperation= ruleStandardOperation EOF ;
    public final EObject entryRuleStandardOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardOperation = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1622:2: (iv_ruleStandardOperation= ruleStandardOperation EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1623:2: iv_ruleStandardOperation= ruleStandardOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStandardOperationRule()); 
            }
            pushFollow(FOLLOW_ruleStandardOperation_in_entryRuleStandardOperation3445);
            iv_ruleStandardOperation=ruleStandardOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStandardOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStandardOperation3455); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStandardOperation"


    // $ANTLR start "ruleStandardOperation"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1630:1: ruleStandardOperation returns [EObject current=null] : (this_EnvironmentOperation_0= ruleEnvironmentOperation | this_ListOperation_1= ruleListOperation | this_Assignment_2= ruleAssignment | this_Equals_3= ruleEquals | this_Fail_4= ruleFail | this_Success_5= ruleSuccess ) ;
    public final EObject ruleStandardOperation() throws RecognitionException {
        EObject current = null;

        EObject this_EnvironmentOperation_0 = null;

        EObject this_ListOperation_1 = null;

        EObject this_Assignment_2 = null;

        EObject this_Equals_3 = null;

        EObject this_Fail_4 = null;

        EObject this_Success_5 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1633:28: ( (this_EnvironmentOperation_0= ruleEnvironmentOperation | this_ListOperation_1= ruleListOperation | this_Assignment_2= ruleAssignment | this_Equals_3= ruleEquals | this_Fail_4= ruleFail | this_Success_5= ruleSuccess ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1634:1: (this_EnvironmentOperation_0= ruleEnvironmentOperation | this_ListOperation_1= ruleListOperation | this_Assignment_2= ruleAssignment | this_Equals_3= ruleEquals | this_Fail_4= ruleFail | this_Success_5= ruleSuccess )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1634:1: (this_EnvironmentOperation_0= ruleEnvironmentOperation | this_ListOperation_1= ruleListOperation | this_Assignment_2= ruleAssignment | this_Equals_3= ruleEquals | this_Fail_4= ruleFail | this_Success_5= ruleSuccess )
            int alt22=6;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1635:2: this_EnvironmentOperation_0= ruleEnvironmentOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStandardOperationAccess().getEnvironmentOperationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnvironmentOperation_in_ruleStandardOperation3505);
                    this_EnvironmentOperation_0=ruleEnvironmentOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnvironmentOperation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1648:2: this_ListOperation_1= ruleListOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStandardOperationAccess().getListOperationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleListOperation_in_ruleStandardOperation3535);
                    this_ListOperation_1=ruleListOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ListOperation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1661:2: this_Assignment_2= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStandardOperationAccess().getAssignmentParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleStandardOperation3565);
                    this_Assignment_2=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Assignment_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1674:2: this_Equals_3= ruleEquals
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStandardOperationAccess().getEqualsParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEquals_in_ruleStandardOperation3595);
                    this_Equals_3=ruleEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Equals_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1687:2: this_Fail_4= ruleFail
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStandardOperationAccess().getFailParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFail_in_ruleStandardOperation3625);
                    this_Fail_4=ruleFail();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Fail_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1700:2: this_Success_5= ruleSuccess
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStandardOperationAccess().getSuccessParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSuccess_in_ruleStandardOperation3655);
                    this_Success_5=ruleSuccess();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Success_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStandardOperation"


    // $ANTLR start "entryRuleEnvironmentOperation"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1719:1: entryRuleEnvironmentOperation returns [EObject current=null] : iv_ruleEnvironmentOperation= ruleEnvironmentOperation EOF ;
    public final EObject entryRuleEnvironmentOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentOperation = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1720:2: (iv_ruleEnvironmentOperation= ruleEnvironmentOperation EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1721:2: iv_ruleEnvironmentOperation= ruleEnvironmentOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvironmentOperationRule()); 
            }
            pushFollow(FOLLOW_ruleEnvironmentOperation_in_entryRuleEnvironmentOperation3690);
            iv_ruleEnvironmentOperation=ruleEnvironmentOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvironmentOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnvironmentOperation3700); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnvironmentOperation"


    // $ANTLR start "ruleEnvironmentOperation"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1728:1: ruleEnvironmentOperation returns [EObject current=null] : ( ( () ( (lv_left_1_0= ruleEnvironmentId ) ) ruleAssignOp ( (lv_right_3_0= ruleEnvironment ) ) ) | ( () ( (lv_left_5_0= ruleEnvironmentId ) ) rulePlusOp ruleEqualsOp ( (lv_right_8_0= ruleEnvironmentStatement ) ) ) | ( () ( (lv_left_10_0= ruleEnvironmentId ) ) ruleMinusOp ruleEqualsOp ( (lv_right_13_0= ruleTypingStatementExpression ) ) ) ) ;
    public final EObject ruleEnvironmentOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_left_5_0 = null;

        EObject lv_right_8_0 = null;

        EObject lv_left_10_0 = null;

        EObject lv_right_13_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1731:28: ( ( ( () ( (lv_left_1_0= ruleEnvironmentId ) ) ruleAssignOp ( (lv_right_3_0= ruleEnvironment ) ) ) | ( () ( (lv_left_5_0= ruleEnvironmentId ) ) rulePlusOp ruleEqualsOp ( (lv_right_8_0= ruleEnvironmentStatement ) ) ) | ( () ( (lv_left_10_0= ruleEnvironmentId ) ) ruleMinusOp ruleEqualsOp ( (lv_right_13_0= ruleTypingStatementExpression ) ) ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1732:1: ( ( () ( (lv_left_1_0= ruleEnvironmentId ) ) ruleAssignOp ( (lv_right_3_0= ruleEnvironment ) ) ) | ( () ( (lv_left_5_0= ruleEnvironmentId ) ) rulePlusOp ruleEqualsOp ( (lv_right_8_0= ruleEnvironmentStatement ) ) ) | ( () ( (lv_left_10_0= ruleEnvironmentId ) ) ruleMinusOp ruleEqualsOp ( (lv_right_13_0= ruleTypingStatementExpression ) ) ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1732:1: ( ( () ( (lv_left_1_0= ruleEnvironmentId ) ) ruleAssignOp ( (lv_right_3_0= ruleEnvironment ) ) ) | ( () ( (lv_left_5_0= ruleEnvironmentId ) ) rulePlusOp ruleEqualsOp ( (lv_right_8_0= ruleEnvironmentStatement ) ) ) | ( () ( (lv_left_10_0= ruleEnvironmentId ) ) ruleMinusOp ruleEqualsOp ( (lv_right_13_0= ruleTypingStatementExpression ) ) ) )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 63:
                    {
                    alt23=2;
                    }
                    break;
                case 59:
                    {
                    alt23=3;
                    }
                    break;
                case 61:
                    {
                    alt23=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1732:2: ( () ( (lv_left_1_0= ruleEnvironmentId ) ) ruleAssignOp ( (lv_right_3_0= ruleEnvironment ) ) )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1732:2: ( () ( (lv_left_1_0= ruleEnvironmentId ) ) ruleAssignOp ( (lv_right_3_0= ruleEnvironment ) ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1732:3: () ( (lv_left_1_0= ruleEnvironmentId ) ) ruleAssignOp ( (lv_right_3_0= ruleEnvironment ) )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1732:3: ()
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1733:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getEnvironmentOperationAccess().getEnvironmentAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1741:2: ( (lv_left_1_0= ruleEnvironmentId ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1742:1: (lv_left_1_0= ruleEnvironmentId )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1742:1: (lv_left_1_0= ruleEnvironmentId )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1743:3: lv_left_1_0= ruleEnvironmentId
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnvironmentOperationAccess().getLeftEnvironmentIdParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEnvironmentId_in_ruleEnvironmentOperation3759);
                    lv_left_1_0=ruleEnvironmentId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEnvironmentOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"left",
                              		lv_left_1_0, 
                              		"EnvironmentId");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnvironmentOperationAccess().getAssignOpParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignOp_in_ruleEnvironmentOperation3778);
                    ruleAssignOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1770:1: ( (lv_right_3_0= ruleEnvironment ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1771:1: (lv_right_3_0= ruleEnvironment )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1771:1: (lv_right_3_0= ruleEnvironment )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1772:3: lv_right_3_0= ruleEnvironment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnvironmentOperationAccess().getRightEnvironmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEnvironment_in_ruleEnvironmentOperation3798);
                    lv_right_3_0=ruleEnvironment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEnvironmentOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"Environment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1789:6: ( () ( (lv_left_5_0= ruleEnvironmentId ) ) rulePlusOp ruleEqualsOp ( (lv_right_8_0= ruleEnvironmentStatement ) ) )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1789:6: ( () ( (lv_left_5_0= ruleEnvironmentId ) ) rulePlusOp ruleEqualsOp ( (lv_right_8_0= ruleEnvironmentStatement ) ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1789:7: () ( (lv_left_5_0= ruleEnvironmentId ) ) rulePlusOp ruleEqualsOp ( (lv_right_8_0= ruleEnvironmentStatement ) )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1789:7: ()
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1790:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getEnvironmentOperationAccess().getEnvironmentIncrementAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1798:2: ( (lv_left_5_0= ruleEnvironmentId ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1799:1: (lv_left_5_0= ruleEnvironmentId )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1799:1: (lv_left_5_0= ruleEnvironmentId )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1800:3: lv_left_5_0= ruleEnvironmentId
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnvironmentOperationAccess().getLeftEnvironmentIdParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEnvironmentId_in_ruleEnvironmentOperation3839);
                    lv_left_5_0=ruleEnvironmentId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEnvironmentOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"left",
                              		lv_left_5_0, 
                              		"EnvironmentId");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnvironmentOperationAccess().getPlusOpParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulePlusOp_in_ruleEnvironmentOperation3858);
                    rulePlusOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnvironmentOperationAccess().getEqualsOpParserRuleCall_1_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEqualsOp_in_ruleEnvironmentOperation3876);
                    ruleEqualsOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1838:1: ( (lv_right_8_0= ruleEnvironmentStatement ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1839:1: (lv_right_8_0= ruleEnvironmentStatement )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1839:1: (lv_right_8_0= ruleEnvironmentStatement )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1840:3: lv_right_8_0= ruleEnvironmentStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnvironmentOperationAccess().getRightEnvironmentStatementParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEnvironmentStatement_in_ruleEnvironmentOperation3896);
                    lv_right_8_0=ruleEnvironmentStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEnvironmentOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_8_0, 
                              		"EnvironmentStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1857:6: ( () ( (lv_left_10_0= ruleEnvironmentId ) ) ruleMinusOp ruleEqualsOp ( (lv_right_13_0= ruleTypingStatementExpression ) ) )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1857:6: ( () ( (lv_left_10_0= ruleEnvironmentId ) ) ruleMinusOp ruleEqualsOp ( (lv_right_13_0= ruleTypingStatementExpression ) ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1857:7: () ( (lv_left_10_0= ruleEnvironmentId ) ) ruleMinusOp ruleEqualsOp ( (lv_right_13_0= ruleTypingStatementExpression ) )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1857:7: ()
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1858:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getEnvironmentOperationAccess().getEnvironmentDecrementAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1866:2: ( (lv_left_10_0= ruleEnvironmentId ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1867:1: (lv_left_10_0= ruleEnvironmentId )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1867:1: (lv_left_10_0= ruleEnvironmentId )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1868:3: lv_left_10_0= ruleEnvironmentId
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnvironmentOperationAccess().getLeftEnvironmentIdParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEnvironmentId_in_ruleEnvironmentOperation3937);
                    lv_left_10_0=ruleEnvironmentId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEnvironmentOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"left",
                              		lv_left_10_0, 
                              		"EnvironmentId");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnvironmentOperationAccess().getMinusOpParserRuleCall_2_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinusOp_in_ruleEnvironmentOperation3956);
                    ruleMinusOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnvironmentOperationAccess().getEqualsOpParserRuleCall_2_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEqualsOp_in_ruleEnvironmentOperation3974);
                    ruleEqualsOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1906:1: ( (lv_right_13_0= ruleTypingStatementExpression ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1907:1: (lv_right_13_0= ruleTypingStatementExpression )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1907:1: (lv_right_13_0= ruleTypingStatementExpression )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1908:3: lv_right_13_0= ruleTypingStatementExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnvironmentOperationAccess().getRightTypingStatementExpressionParserRuleCall_2_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypingStatementExpression_in_ruleEnvironmentOperation3994);
                    lv_right_13_0=ruleTypingStatementExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEnvironmentOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_13_0, 
                              		"TypingStatementExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEnvironmentOperation"


    // $ANTLR start "entryRuleListOperation"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1932:1: entryRuleListOperation returns [EObject current=null] : iv_ruleListOperation= ruleListOperation EOF ;
    public final EObject entryRuleListOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOperation = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1933:2: (iv_ruleListOperation= ruleListOperation EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1934:2: iv_ruleListOperation= ruleListOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListOperationRule()); 
            }
            pushFollow(FOLLOW_ruleListOperation_in_entryRuleListOperation4031);
            iv_ruleListOperation=ruleListOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleListOperation4041); if (state.failed) return current;

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
    // $ANTLR end "entryRuleListOperation"


    // $ANTLR start "ruleListOperation"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1941:1: ruleListOperation returns [EObject current=null] : ( ( () ( (lv_left_1_0= ruleExpression ) ) rulePlusOp ruleEqualsOp ( (lv_right_4_0= ruleExpression ) ) ) | ( () ( (lv_left_6_0= ruleExpression ) ) ruleMinusOp ruleEqualsOp ( (lv_right_9_0= ruleExpression ) ) ) ) ;
    public final EObject ruleListOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_left_1_0 = null;

        EObject lv_right_4_0 = null;

        EObject lv_left_6_0 = null;

        EObject lv_right_9_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1944:28: ( ( ( () ( (lv_left_1_0= ruleExpression ) ) rulePlusOp ruleEqualsOp ( (lv_right_4_0= ruleExpression ) ) ) | ( () ( (lv_left_6_0= ruleExpression ) ) ruleMinusOp ruleEqualsOp ( (lv_right_9_0= ruleExpression ) ) ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1945:1: ( ( () ( (lv_left_1_0= ruleExpression ) ) rulePlusOp ruleEqualsOp ( (lv_right_4_0= ruleExpression ) ) ) | ( () ( (lv_left_6_0= ruleExpression ) ) ruleMinusOp ruleEqualsOp ( (lv_right_9_0= ruleExpression ) ) ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1945:1: ( ( () ( (lv_left_1_0= ruleExpression ) ) rulePlusOp ruleEqualsOp ( (lv_right_4_0= ruleExpression ) ) ) | ( () ( (lv_left_6_0= ruleExpression ) ) ruleMinusOp ruleEqualsOp ( (lv_right_9_0= ruleExpression ) ) ) )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1945:2: ( () ( (lv_left_1_0= ruleExpression ) ) rulePlusOp ruleEqualsOp ( (lv_right_4_0= ruleExpression ) ) )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1945:2: ( () ( (lv_left_1_0= ruleExpression ) ) rulePlusOp ruleEqualsOp ( (lv_right_4_0= ruleExpression ) ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1945:3: () ( (lv_left_1_0= ruleExpression ) ) rulePlusOp ruleEqualsOp ( (lv_right_4_0= ruleExpression ) )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1945:3: ()
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1946:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getListOperationAccess().getListIncrementAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1954:2: ( (lv_left_1_0= ruleExpression ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1955:1: (lv_left_1_0= ruleExpression )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1955:1: (lv_left_1_0= ruleExpression )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1956:3: lv_left_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListOperationAccess().getLeftExpressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleListOperation4100);
                    lv_left_1_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"left",
                              		lv_left_1_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getListOperationAccess().getPlusOpParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulePlusOp_in_ruleListOperation4119);
                    rulePlusOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getListOperationAccess().getEqualsOpParserRuleCall_0_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEqualsOp_in_ruleListOperation4137);
                    ruleEqualsOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1994:1: ( (lv_right_4_0= ruleExpression ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1995:1: (lv_right_4_0= ruleExpression )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1995:1: (lv_right_4_0= ruleExpression )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1996:3: lv_right_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListOperationAccess().getRightExpressionParserRuleCall_0_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleListOperation4157);
                    lv_right_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_4_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2013:6: ( () ( (lv_left_6_0= ruleExpression ) ) ruleMinusOp ruleEqualsOp ( (lv_right_9_0= ruleExpression ) ) )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2013:6: ( () ( (lv_left_6_0= ruleExpression ) ) ruleMinusOp ruleEqualsOp ( (lv_right_9_0= ruleExpression ) ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2013:7: () ( (lv_left_6_0= ruleExpression ) ) ruleMinusOp ruleEqualsOp ( (lv_right_9_0= ruleExpression ) )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2013:7: ()
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2014:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getListOperationAccess().getListDecrementAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2022:2: ( (lv_left_6_0= ruleExpression ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2023:1: (lv_left_6_0= ruleExpression )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2023:1: (lv_left_6_0= ruleExpression )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2024:3: lv_left_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListOperationAccess().getLeftExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleListOperation4198);
                    lv_left_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"left",
                              		lv_left_6_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getListOperationAccess().getMinusOpParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinusOp_in_ruleListOperation4217);
                    ruleMinusOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getListOperationAccess().getEqualsOpParserRuleCall_1_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEqualsOp_in_ruleListOperation4235);
                    ruleEqualsOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2062:1: ( (lv_right_9_0= ruleExpression ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2063:1: (lv_right_9_0= ruleExpression )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2063:1: (lv_right_9_0= ruleExpression )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2064:3: lv_right_9_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListOperationAccess().getRightExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleListOperation4255);
                    lv_right_9_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_9_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleListOperation"


    // $ANTLR start "entryRuleAssignment"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2088:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2089:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2090:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment4292);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment4302); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2097:1: ruleAssignment returns [EObject current=null] : ( ( (lv_left_0_0= ruleExpression ) ) ruleAssignOp ( (lv_right_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2100:28: ( ( ( (lv_left_0_0= ruleExpression ) ) ruleAssignOp ( (lv_right_2_0= ruleExpression ) ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2101:1: ( ( (lv_left_0_0= ruleExpression ) ) ruleAssignOp ( (lv_right_2_0= ruleExpression ) ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2101:1: ( ( (lv_left_0_0= ruleExpression ) ) ruleAssignOp ( (lv_right_2_0= ruleExpression ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2101:2: ( (lv_left_0_0= ruleExpression ) ) ruleAssignOp ( (lv_right_2_0= ruleExpression ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2101:2: ( (lv_left_0_0= ruleExpression ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2102:1: (lv_left_0_0= ruleExpression )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2102:1: (lv_left_0_0= ruleExpression )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2103:3: lv_left_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getLeftExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment4348);
            lv_left_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentAccess().getAssignOpParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignOp_in_ruleAssignment4367);
            ruleAssignOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2130:1: ( (lv_right_2_0= ruleExpression ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2131:1: (lv_right_2_0= ruleExpression )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2131:1: (lv_right_2_0= ruleExpression )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2132:3: lv_right_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getRightExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment4387);
            lv_right_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleEquals"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2156:1: entryRuleEquals returns [EObject current=null] : iv_ruleEquals= ruleEquals EOF ;
    public final EObject entryRuleEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquals = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2157:2: (iv_ruleEquals= ruleEquals EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2158:2: iv_ruleEquals= ruleEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsRule()); 
            }
            pushFollow(FOLLOW_ruleEquals_in_entryRuleEquals4423);
            iv_ruleEquals=ruleEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquals; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquals4433); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEquals"


    // $ANTLR start "ruleEquals"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2165:1: ruleEquals returns [EObject current=null] : ( ( (lv_left_0_0= ruleExpression ) ) ( ( (lv_op_1_1= ruleEqualsOp | lv_op_1_2= ruleNotEqualsOp ) ) ) ( (lv_right_2_0= ruleExpression ) ) ( (lv_error_3_0= ruleErrorSpecification ) )? ) ;
    public final EObject ruleEquals() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_1 = null;

        AntlrDatatypeRuleToken lv_op_1_2 = null;

        EObject lv_right_2_0 = null;

        EObject lv_error_3_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2168:28: ( ( ( (lv_left_0_0= ruleExpression ) ) ( ( (lv_op_1_1= ruleEqualsOp | lv_op_1_2= ruleNotEqualsOp ) ) ) ( (lv_right_2_0= ruleExpression ) ) ( (lv_error_3_0= ruleErrorSpecification ) )? ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2169:1: ( ( (lv_left_0_0= ruleExpression ) ) ( ( (lv_op_1_1= ruleEqualsOp | lv_op_1_2= ruleNotEqualsOp ) ) ) ( (lv_right_2_0= ruleExpression ) ) ( (lv_error_3_0= ruleErrorSpecification ) )? )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2169:1: ( ( (lv_left_0_0= ruleExpression ) ) ( ( (lv_op_1_1= ruleEqualsOp | lv_op_1_2= ruleNotEqualsOp ) ) ) ( (lv_right_2_0= ruleExpression ) ) ( (lv_error_3_0= ruleErrorSpecification ) )? )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2169:2: ( (lv_left_0_0= ruleExpression ) ) ( ( (lv_op_1_1= ruleEqualsOp | lv_op_1_2= ruleNotEqualsOp ) ) ) ( (lv_right_2_0= ruleExpression ) ) ( (lv_error_3_0= ruleErrorSpecification ) )?
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2169:2: ( (lv_left_0_0= ruleExpression ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2170:1: (lv_left_0_0= ruleExpression )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2170:1: (lv_left_0_0= ruleExpression )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2171:3: lv_left_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEqualsAccess().getLeftExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleEquals4479);
            lv_left_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEqualsRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2187:2: ( ( (lv_op_1_1= ruleEqualsOp | lv_op_1_2= ruleNotEqualsOp ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2188:1: ( (lv_op_1_1= ruleEqualsOp | lv_op_1_2= ruleNotEqualsOp ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2188:1: ( (lv_op_1_1= ruleEqualsOp | lv_op_1_2= ruleNotEqualsOp ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2189:1: (lv_op_1_1= ruleEqualsOp | lv_op_1_2= ruleNotEqualsOp )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2189:1: (lv_op_1_1= ruleEqualsOp | lv_op_1_2= ruleNotEqualsOp )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==62) ) {
                alt25=1;
            }
            else if ( (LA25_0==64) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2190:3: lv_op_1_1= ruleEqualsOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEqualsAccess().getOpEqualsOpParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEqualsOp_in_ruleEquals4502);
                    lv_op_1_1=ruleEqualsOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEqualsRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_1_1, 
                              		"EqualsOp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2205:8: lv_op_1_2= ruleNotEqualsOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEqualsAccess().getOpNotEqualsOpParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotEqualsOp_in_ruleEquals4521);
                    lv_op_1_2=ruleNotEqualsOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEqualsRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_1_2, 
                              		"NotEqualsOp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2223:2: ( (lv_right_2_0= ruleExpression ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2224:1: (lv_right_2_0= ruleExpression )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2224:1: (lv_right_2_0= ruleExpression )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2225:3: lv_right_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEqualsAccess().getRightExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleEquals4545);
            lv_right_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEqualsRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2241:2: ( (lv_error_3_0= ruleErrorSpecification ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2242:1: (lv_error_3_0= ruleErrorSpecification )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2242:1: (lv_error_3_0= ruleErrorSpecification )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2243:3: lv_error_3_0= ruleErrorSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEqualsAccess().getErrorErrorSpecificationParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleErrorSpecification_in_ruleEquals4566);
                    lv_error_3_0=ruleErrorSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEqualsRule());
                      	        }
                             		set(
                             			current, 
                             			"error",
                              		lv_error_3_0, 
                              		"ErrorSpecification");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEquals"


    // $ANTLR start "entryRuleFail"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2267:1: entryRuleFail returns [EObject current=null] : iv_ruleFail= ruleFail EOF ;
    public final EObject entryRuleFail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFail = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2268:2: (iv_ruleFail= ruleFail EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2269:2: iv_ruleFail= ruleFail EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFailRule()); 
            }
            pushFollow(FOLLOW_ruleFail_in_entryRuleFail4603);
            iv_ruleFail=ruleFail();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFail; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFail4613); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFail"


    // $ANTLR start "ruleFail"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2276:1: ruleFail returns [EObject current=null] : ( () otherlv_1= 'fail' ( (lv_error_2_0= ruleErrorSpecification ) )? ) ;
    public final EObject ruleFail() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_error_2_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2279:28: ( ( () otherlv_1= 'fail' ( (lv_error_2_0= ruleErrorSpecification ) )? ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2280:1: ( () otherlv_1= 'fail' ( (lv_error_2_0= ruleErrorSpecification ) )? )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2280:1: ( () otherlv_1= 'fail' ( (lv_error_2_0= ruleErrorSpecification ) )? )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2280:2: () otherlv_1= 'fail' ( (lv_error_2_0= ruleErrorSpecification ) )?
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2280:2: ()
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2281:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFailAccess().getFailAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleFail4662); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFailAccess().getFailKeyword_1());
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2293:1: ( (lv_error_2_0= ruleErrorSpecification ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2294:1: (lv_error_2_0= ruleErrorSpecification )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2294:1: (lv_error_2_0= ruleErrorSpecification )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2295:3: lv_error_2_0= ruleErrorSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFailAccess().getErrorErrorSpecificationParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleErrorSpecification_in_ruleFail4683);
                    lv_error_2_0=ruleErrorSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFailRule());
                      	        }
                             		set(
                             			current, 
                             			"error",
                              		lv_error_2_0, 
                              		"ErrorSpecification");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFail"


    // $ANTLR start "entryRuleSuccess"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2319:1: entryRuleSuccess returns [EObject current=null] : iv_ruleSuccess= ruleSuccess EOF ;
    public final EObject entryRuleSuccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuccess = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2320:2: (iv_ruleSuccess= ruleSuccess EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2321:2: iv_ruleSuccess= ruleSuccess EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuccessRule()); 
            }
            pushFollow(FOLLOW_ruleSuccess_in_entryRuleSuccess4720);
            iv_ruleSuccess=ruleSuccess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuccess; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuccess4730); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSuccess"


    // $ANTLR start "ruleSuccess"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2328:1: ruleSuccess returns [EObject current=null] : ( () otherlv_1= 'success' ) ;
    public final EObject ruleSuccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2331:28: ( ( () otherlv_1= 'success' ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2332:1: ( () otherlv_1= 'success' )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2332:1: ( () otherlv_1= 'success' )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2332:2: () otherlv_1= 'success'
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2332:2: ()
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2333:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSuccessAccess().getSuccessAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleSuccess4779); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSuccessAccess().getSuccessKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSuccess"


    // $ANTLR start "entryRuleTypingJudgmentWithEnvironment"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2353:1: entryRuleTypingJudgmentWithEnvironment returns [EObject current=null] : iv_ruleTypingJudgmentWithEnvironment= ruleTypingJudgmentWithEnvironment EOF ;
    public final EObject entryRuleTypingJudgmentWithEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypingJudgmentWithEnvironment = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2354:2: (iv_ruleTypingJudgmentWithEnvironment= ruleTypingJudgmentWithEnvironment EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2355:2: iv_ruleTypingJudgmentWithEnvironment= ruleTypingJudgmentWithEnvironment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypingJudgmentWithEnvironmentRule()); 
            }
            pushFollow(FOLLOW_ruleTypingJudgmentWithEnvironment_in_entryRuleTypingJudgmentWithEnvironment4815);
            iv_ruleTypingJudgmentWithEnvironment=ruleTypingJudgmentWithEnvironment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypingJudgmentWithEnvironment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypingJudgmentWithEnvironment4825); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypingJudgmentWithEnvironment"


    // $ANTLR start "ruleTypingJudgmentWithEnvironment"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2362:1: ruleTypingJudgmentWithEnvironment returns [EObject current=null] : ( ( (lv_environment_0_0= ruleEnvironment ) ) ( (lv_typejudgmentsymbol_1_0= ruleTypeJudgmentSymbol ) ) ( (lv_typingstatement_2_0= ruleTypingStatement ) ) ( (lv_error_3_0= ruleErrorSpecification ) )? ) ;
    public final EObject ruleTypingJudgmentWithEnvironment() throws RecognitionException {
        EObject current = null;

        EObject lv_environment_0_0 = null;

        AntlrDatatypeRuleToken lv_typejudgmentsymbol_1_0 = null;

        EObject lv_typingstatement_2_0 = null;

        EObject lv_error_3_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2365:28: ( ( ( (lv_environment_0_0= ruleEnvironment ) ) ( (lv_typejudgmentsymbol_1_0= ruleTypeJudgmentSymbol ) ) ( (lv_typingstatement_2_0= ruleTypingStatement ) ) ( (lv_error_3_0= ruleErrorSpecification ) )? ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2366:1: ( ( (lv_environment_0_0= ruleEnvironment ) ) ( (lv_typejudgmentsymbol_1_0= ruleTypeJudgmentSymbol ) ) ( (lv_typingstatement_2_0= ruleTypingStatement ) ) ( (lv_error_3_0= ruleErrorSpecification ) )? )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2366:1: ( ( (lv_environment_0_0= ruleEnvironment ) ) ( (lv_typejudgmentsymbol_1_0= ruleTypeJudgmentSymbol ) ) ( (lv_typingstatement_2_0= ruleTypingStatement ) ) ( (lv_error_3_0= ruleErrorSpecification ) )? )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2366:2: ( (lv_environment_0_0= ruleEnvironment ) ) ( (lv_typejudgmentsymbol_1_0= ruleTypeJudgmentSymbol ) ) ( (lv_typingstatement_2_0= ruleTypingStatement ) ) ( (lv_error_3_0= ruleErrorSpecification ) )?
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2366:2: ( (lv_environment_0_0= ruleEnvironment ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2367:1: (lv_environment_0_0= ruleEnvironment )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2367:1: (lv_environment_0_0= ruleEnvironment )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2368:3: lv_environment_0_0= ruleEnvironment
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypingJudgmentWithEnvironmentAccess().getEnvironmentEnvironmentParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEnvironment_in_ruleTypingJudgmentWithEnvironment4871);
            lv_environment_0_0=ruleEnvironment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypingJudgmentWithEnvironmentRule());
              	        }
                     		set(
                     			current, 
                     			"environment",
                      		lv_environment_0_0, 
                      		"Environment");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2384:2: ( (lv_typejudgmentsymbol_1_0= ruleTypeJudgmentSymbol ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2385:1: (lv_typejudgmentsymbol_1_0= ruleTypeJudgmentSymbol )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2385:1: (lv_typejudgmentsymbol_1_0= ruleTypeJudgmentSymbol )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2386:3: lv_typejudgmentsymbol_1_0= ruleTypeJudgmentSymbol
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypingJudgmentWithEnvironmentAccess().getTypejudgmentsymbolTypeJudgmentSymbolParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeJudgmentSymbol_in_ruleTypingJudgmentWithEnvironment4892);
            lv_typejudgmentsymbol_1_0=ruleTypeJudgmentSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypingJudgmentWithEnvironmentRule());
              	        }
                     		set(
                     			current, 
                     			"typejudgmentsymbol",
                      		lv_typejudgmentsymbol_1_0, 
                      		"TypeJudgmentSymbol");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2402:2: ( (lv_typingstatement_2_0= ruleTypingStatement ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2403:1: (lv_typingstatement_2_0= ruleTypingStatement )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2403:1: (lv_typingstatement_2_0= ruleTypingStatement )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2404:3: lv_typingstatement_2_0= ruleTypingStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypingJudgmentWithEnvironmentAccess().getTypingstatementTypingStatementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypingStatement_in_ruleTypingJudgmentWithEnvironment4913);
            lv_typingstatement_2_0=ruleTypingStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypingJudgmentWithEnvironmentRule());
              	        }
                     		set(
                     			current, 
                     			"typingstatement",
                      		lv_typingstatement_2_0, 
                      		"TypingStatement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2420:2: ( (lv_error_3_0= ruleErrorSpecification ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2421:1: (lv_error_3_0= ruleErrorSpecification )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2421:1: (lv_error_3_0= ruleErrorSpecification )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2422:3: lv_error_3_0= ruleErrorSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypingJudgmentWithEnvironmentAccess().getErrorErrorSpecificationParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleErrorSpecification_in_ruleTypingJudgmentWithEnvironment4934);
                    lv_error_3_0=ruleErrorSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypingJudgmentWithEnvironmentRule());
                      	        }
                             		set(
                             			current, 
                             			"error",
                              		lv_error_3_0, 
                              		"ErrorSpecification");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypingJudgmentWithEnvironment"


    // $ANTLR start "entryRuleErrorSpecification"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2446:1: entryRuleErrorSpecification returns [EObject current=null] : iv_ruleErrorSpecification= ruleErrorSpecification EOF ;
    public final EObject entryRuleErrorSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorSpecification = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2447:2: (iv_ruleErrorSpecification= ruleErrorSpecification EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2448:2: iv_ruleErrorSpecification= ruleErrorSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getErrorSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleErrorSpecification_in_entryRuleErrorSpecification4971);
            iv_ruleErrorSpecification=ruleErrorSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleErrorSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleErrorSpecification4981); if (state.failed) return current;

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
    // $ANTLR end "entryRuleErrorSpecification"


    // $ANTLR start "ruleErrorSpecification"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2455:1: ruleErrorSpecification returns [EObject current=null] : (otherlv_0= 'error' ruleEqualsOp ( (lv_failureError_2_0= ruleFailureError ) ) ) ;
    public final EObject ruleErrorSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_failureError_2_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2458:28: ( (otherlv_0= 'error' ruleEqualsOp ( (lv_failureError_2_0= ruleFailureError ) ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2459:1: (otherlv_0= 'error' ruleEqualsOp ( (lv_failureError_2_0= ruleFailureError ) ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2459:1: (otherlv_0= 'error' ruleEqualsOp ( (lv_failureError_2_0= ruleFailureError ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2459:3: otherlv_0= 'error' ruleEqualsOp ( (lv_failureError_2_0= ruleFailureError ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleErrorSpecification5018); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getErrorSpecificationAccess().getErrorKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getErrorSpecificationAccess().getEqualsOpParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleEqualsOp_in_ruleErrorSpecification5037);
            ruleEqualsOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2474:1: ( (lv_failureError_2_0= ruleFailureError ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2475:1: (lv_failureError_2_0= ruleFailureError )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2475:1: (lv_failureError_2_0= ruleFailureError )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2476:3: lv_failureError_2_0= ruleFailureError
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getErrorSpecificationAccess().getFailureErrorFailureErrorParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFailureError_in_ruleErrorSpecification5057);
            lv_failureError_2_0=ruleFailureError();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getErrorSpecificationRule());
              	        }
                     		set(
                     			current, 
                     			"failureError",
                      		lv_failureError_2_0, 
                      		"FailureError");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleErrorSpecification"


    // $ANTLR start "entryRuleFailureError"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2500:1: entryRuleFailureError returns [EObject current=null] : iv_ruleFailureError= ruleFailureError EOF ;
    public final EObject entryRuleFailureError() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFailureError = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2501:2: (iv_ruleFailureError= ruleFailureError EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2502:2: iv_ruleFailureError= ruleFailureError EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFailureErrorRule()); 
            }
            pushFollow(FOLLOW_ruleFailureError_in_entryRuleFailureError5093);
            iv_ruleFailureError=ruleFailureError();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFailureError; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFailureError5103); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFailureError"


    // $ANTLR start "ruleFailureError"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2509:1: ruleFailureError returns [EObject current=null] : (this_TerminalError_0= ruleTerminalError ( () ( (lv_op_2_0= rulePlusOp ) ) ( (lv_right_3_0= ruleFailureError ) ) )* ) ;
    public final EObject ruleFailureError() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalError_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2512:28: ( (this_TerminalError_0= ruleTerminalError ( () ( (lv_op_2_0= rulePlusOp ) ) ( (lv_right_3_0= ruleFailureError ) ) )* ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2513:1: (this_TerminalError_0= ruleTerminalError ( () ( (lv_op_2_0= rulePlusOp ) ) ( (lv_right_3_0= ruleFailureError ) ) )* )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2513:1: (this_TerminalError_0= ruleTerminalError ( () ( (lv_op_2_0= rulePlusOp ) ) ( (lv_right_3_0= ruleFailureError ) ) )* )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2514:2: this_TerminalError_0= ruleTerminalError ( () ( (lv_op_2_0= rulePlusOp ) ) ( (lv_right_3_0= ruleFailureError ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFailureErrorAccess().getTerminalErrorParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTerminalError_in_ruleFailureError5153);
            this_TerminalError_0=ruleTerminalError();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TerminalError_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2525:1: ( () ( (lv_op_2_0= rulePlusOp ) ) ( (lv_right_3_0= ruleFailureError ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==63) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred43_InternalTypeSystem()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2525:2: () ( (lv_op_2_0= rulePlusOp ) ) ( (lv_right_3_0= ruleFailureError ) )
            	    {
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2525:2: ()
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2526:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFailureErrorAccess().getComposedErrorLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2534:2: ( (lv_op_2_0= rulePlusOp ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2535:1: (lv_op_2_0= rulePlusOp )
            	    {
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2535:1: (lv_op_2_0= rulePlusOp )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2536:3: lv_op_2_0= rulePlusOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFailureErrorAccess().getOpPlusOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePlusOp_in_ruleFailureError5186);
            	    lv_op_2_0=rulePlusOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFailureErrorRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"op",
            	              		lv_op_2_0, 
            	              		"PlusOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2552:2: ( (lv_right_3_0= ruleFailureError ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2553:1: (lv_right_3_0= ruleFailureError )
            	    {
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2553:1: (lv_right_3_0= ruleFailureError )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2554:3: lv_right_3_0= ruleFailureError
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFailureErrorAccess().getRightFailureErrorParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFailureError_in_ruleFailureError5207);
            	    lv_right_3_0=ruleFailureError();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFailureErrorRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"FailureError");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFailureError"


    // $ANTLR start "entryRuleTerminalError"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2578:1: entryRuleTerminalError returns [EObject current=null] : iv_ruleTerminalError= ruleTerminalError EOF ;
    public final EObject entryRuleTerminalError() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalError = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2579:2: (iv_ruleTerminalError= ruleTerminalError EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2580:2: iv_ruleTerminalError= ruleTerminalError EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalErrorRule()); 
            }
            pushFollow(FOLLOW_ruleTerminalError_in_entryRuleTerminalError5245);
            iv_ruleTerminalError=ruleTerminalError();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalError; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalError5255); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTerminalError"


    // $ANTLR start "ruleTerminalError"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2587:1: ruleTerminalError returns [EObject current=null] : ( ( () ( (lv_errString_1_0= RULE_STRING ) ) ) | ( () ( (lv_expression_3_0= ruleExpression ) ) ) ) ;
    public final EObject ruleTerminalError() throws RecognitionException {
        EObject current = null;

        Token lv_errString_1_0=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2590:28: ( ( ( () ( (lv_errString_1_0= RULE_STRING ) ) ) | ( () ( (lv_expression_3_0= ruleExpression ) ) ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2591:1: ( ( () ( (lv_errString_1_0= RULE_STRING ) ) ) | ( () ( (lv_expression_3_0= ruleExpression ) ) ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2591:1: ( ( () ( (lv_errString_1_0= RULE_STRING ) ) ) | ( () ( (lv_expression_3_0= ruleExpression ) ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                int LA30_1 = input.LA(2);

                if ( (synpred44_InternalTypeSystem()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA30_0==RULE_INT||LA30_0==25||LA30_0==27||LA30_0==44||(LA30_0>=46 && LA30_0<=51)||LA30_0==53) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2591:2: ( () ( (lv_errString_1_0= RULE_STRING ) ) )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2591:2: ( () ( (lv_errString_1_0= RULE_STRING ) ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2591:3: () ( (lv_errString_1_0= RULE_STRING ) )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2591:3: ()
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2592:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTerminalErrorAccess().getErrorStringAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2600:2: ( (lv_errString_1_0= RULE_STRING ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2601:1: (lv_errString_1_0= RULE_STRING )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2601:1: (lv_errString_1_0= RULE_STRING )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2602:3: lv_errString_1_0= RULE_STRING
                    {
                    lv_errString_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerminalError5310); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_errString_1_0, grammarAccess.getTerminalErrorAccess().getErrStringSTRINGTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTerminalErrorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"errString",
                              		lv_errString_1_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2619:6: ( () ( (lv_expression_3_0= ruleExpression ) ) )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2619:6: ( () ( (lv_expression_3_0= ruleExpression ) ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2619:7: () ( (lv_expression_3_0= ruleExpression ) )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2619:7: ()
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2620:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTerminalErrorAccess().getErrorExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2628:2: ( (lv_expression_3_0= ruleExpression ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2629:1: (lv_expression_3_0= ruleExpression )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2629:1: (lv_expression_3_0= ruleExpression )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2630:3: lv_expression_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTerminalErrorAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalError5356);
                    lv_expression_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTerminalErrorRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTerminalError"


    // $ANTLR start "entryRuleTypingStatement"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2654:1: entryRuleTypingStatement returns [EObject current=null] : iv_ruleTypingStatement= ruleTypingStatement EOF ;
    public final EObject entryRuleTypingStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypingStatement = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2655:2: (iv_ruleTypingStatement= ruleTypingStatement EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2656:2: iv_ruleTypingStatement= ruleTypingStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypingStatementRule()); 
            }
            pushFollow(FOLLOW_ruleTypingStatement_in_entryRuleTypingStatement5393);
            iv_ruleTypingStatement=ruleTypingStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypingStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypingStatement5403); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypingStatement"


    // $ANTLR start "ruleTypingStatement"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2663:1: ruleTypingStatement returns [EObject current=null] : ( ( (lv_left_0_0= ruleTypingStatementExpression ) ) ( (lv_relation_1_0= ruleTypeRelation ) ) ( (lv_right_2_0= ruleTypingStatementExpression ) ) ) ;
    public final EObject ruleTypingStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_relation_1_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2666:28: ( ( ( (lv_left_0_0= ruleTypingStatementExpression ) ) ( (lv_relation_1_0= ruleTypeRelation ) ) ( (lv_right_2_0= ruleTypingStatementExpression ) ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2667:1: ( ( (lv_left_0_0= ruleTypingStatementExpression ) ) ( (lv_relation_1_0= ruleTypeRelation ) ) ( (lv_right_2_0= ruleTypingStatementExpression ) ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2667:1: ( ( (lv_left_0_0= ruleTypingStatementExpression ) ) ( (lv_relation_1_0= ruleTypeRelation ) ) ( (lv_right_2_0= ruleTypingStatementExpression ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2667:2: ( (lv_left_0_0= ruleTypingStatementExpression ) ) ( (lv_relation_1_0= ruleTypeRelation ) ) ( (lv_right_2_0= ruleTypingStatementExpression ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2667:2: ( (lv_left_0_0= ruleTypingStatementExpression ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2668:1: (lv_left_0_0= ruleTypingStatementExpression )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2668:1: (lv_left_0_0= ruleTypingStatementExpression )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2669:3: lv_left_0_0= ruleTypingStatementExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypingStatementAccess().getLeftTypingStatementExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypingStatementExpression_in_ruleTypingStatement5449);
            lv_left_0_0=ruleTypingStatementExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypingStatementRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"TypingStatementExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2685:2: ( (lv_relation_1_0= ruleTypeRelation ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2686:1: (lv_relation_1_0= ruleTypeRelation )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2686:1: (lv_relation_1_0= ruleTypeRelation )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2687:3: lv_relation_1_0= ruleTypeRelation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypingStatementAccess().getRelationTypeRelationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeRelation_in_ruleTypingStatement5470);
            lv_relation_1_0=ruleTypeRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypingStatementRule());
              	        }
                     		set(
                     			current, 
                     			"relation",
                      		lv_relation_1_0, 
                      		"TypeRelation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2703:2: ( (lv_right_2_0= ruleTypingStatementExpression ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2704:1: (lv_right_2_0= ruleTypingStatementExpression )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2704:1: (lv_right_2_0= ruleTypingStatementExpression )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2705:3: lv_right_2_0= ruleTypingStatementExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypingStatementAccess().getRightTypingStatementExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypingStatementExpression_in_ruleTypingStatement5491);
            lv_right_2_0=ruleTypingStatementExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypingStatementRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_2_0, 
                      		"TypingStatementExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypingStatement"


    // $ANTLR start "entryRuleTypingStatementExpression"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2729:1: entryRuleTypingStatementExpression returns [EObject current=null] : iv_ruleTypingStatementExpression= ruleTypingStatementExpression EOF ;
    public final EObject entryRuleTypingStatementExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypingStatementExpression = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2730:2: (iv_ruleTypingStatementExpression= ruleTypingStatementExpression EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2731:2: iv_ruleTypingStatementExpression= ruleTypingStatementExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypingStatementExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTypingStatementExpression_in_entryRuleTypingStatementExpression5527);
            iv_ruleTypingStatementExpression=ruleTypingStatementExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypingStatementExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypingStatementExpression5537); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypingStatementExpression"


    // $ANTLR start "ruleTypingStatementExpression"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2738:1: ruleTypingStatementExpression returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleTypingStatementExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2741:28: (this_Expression_0= ruleExpression )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2743:2: this_Expression_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypingStatementExpressionAccess().getExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleTypingStatementExpression5586);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypingStatementExpression"


    // $ANTLR start "entryRuleEnvironment"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2762:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2763:2: (iv_ruleEnvironment= ruleEnvironment EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2764:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvironmentRule()); 
            }
            pushFollow(FOLLOW_ruleEnvironment_in_entryRuleEnvironment5620);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvironment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnvironment5630); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2771:1: ruleEnvironment returns [EObject current=null] : (this_TerminalEnvironment_0= ruleTerminalEnvironment ( () ( (lv_op_2_0= ruleEnvironmentComposition ) ) ( (lv_subEnvironment_3_0= ruleEnvironment ) ) )* ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalEnvironment_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_subEnvironment_3_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2774:28: ( (this_TerminalEnvironment_0= ruleTerminalEnvironment ( () ( (lv_op_2_0= ruleEnvironmentComposition ) ) ( (lv_subEnvironment_3_0= ruleEnvironment ) ) )* ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2775:1: (this_TerminalEnvironment_0= ruleTerminalEnvironment ( () ( (lv_op_2_0= ruleEnvironmentComposition ) ) ( (lv_subEnvironment_3_0= ruleEnvironment ) ) )* )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2775:1: (this_TerminalEnvironment_0= ruleTerminalEnvironment ( () ( (lv_op_2_0= ruleEnvironmentComposition ) ) ( (lv_subEnvironment_3_0= ruleEnvironment ) ) )* )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2776:2: this_TerminalEnvironment_0= ruleTerminalEnvironment ( () ( (lv_op_2_0= ruleEnvironmentComposition ) ) ( (lv_subEnvironment_3_0= ruleEnvironment ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEnvironmentAccess().getTerminalEnvironmentParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTerminalEnvironment_in_ruleEnvironment5680);
            this_TerminalEnvironment_0=ruleTerminalEnvironment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TerminalEnvironment_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2787:1: ( () ( (lv_op_2_0= ruleEnvironmentComposition ) ) ( (lv_subEnvironment_3_0= ruleEnvironment ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==45) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred45_InternalTypeSystem()) ) {
                        alt31=1;
                    }


                }
                else if ( (LA31_0==65) ) {
                    int LA31_3 = input.LA(2);

                    if ( (synpred45_InternalTypeSystem()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2787:2: () ( (lv_op_2_0= ruleEnvironmentComposition ) ) ( (lv_subEnvironment_3_0= ruleEnvironment ) )
            	    {
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2787:2: ()
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2788:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getEnvironmentAccess().getEnvironmentCompositionCurrentEnvironmentAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2796:2: ( (lv_op_2_0= ruleEnvironmentComposition ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2797:1: (lv_op_2_0= ruleEnvironmentComposition )
            	    {
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2797:1: (lv_op_2_0= ruleEnvironmentComposition )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2798:3: lv_op_2_0= ruleEnvironmentComposition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnvironmentAccess().getOpEnvironmentCompositionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnvironmentComposition_in_ruleEnvironment5713);
            	    lv_op_2_0=ruleEnvironmentComposition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"op",
            	              		lv_op_2_0, 
            	              		"EnvironmentComposition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2814:2: ( (lv_subEnvironment_3_0= ruleEnvironment ) )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2815:1: (lv_subEnvironment_3_0= ruleEnvironment )
            	    {
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2815:1: (lv_subEnvironment_3_0= ruleEnvironment )
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2816:3: lv_subEnvironment_3_0= ruleEnvironment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnvironmentAccess().getSubEnvironmentEnvironmentParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnvironment_in_ruleEnvironment5734);
            	    lv_subEnvironment_3_0=ruleEnvironment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"subEnvironment",
            	              		lv_subEnvironment_3_0, 
            	              		"Environment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleTerminalEnvironment"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2840:1: entryRuleTerminalEnvironment returns [EObject current=null] : iv_ruleTerminalEnvironment= ruleTerminalEnvironment EOF ;
    public final EObject entryRuleTerminalEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalEnvironment = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2841:2: (iv_ruleTerminalEnvironment= ruleTerminalEnvironment EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2842:2: iv_ruleTerminalEnvironment= ruleTerminalEnvironment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalEnvironmentRule()); 
            }
            pushFollow(FOLLOW_ruleTerminalEnvironment_in_entryRuleTerminalEnvironment5772);
            iv_ruleTerminalEnvironment=ruleTerminalEnvironment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalEnvironment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalEnvironment5782); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTerminalEnvironment"


    // $ANTLR start "ruleTerminalEnvironment"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2849:1: ruleTerminalEnvironment returns [EObject current=null] : (this_EnvironmentId_0= ruleEnvironmentId | this_EnvironmentStatement_1= ruleEnvironmentStatement | this_EmptyEnvironment_2= ruleEmptyEnvironment ) ;
    public final EObject ruleTerminalEnvironment() throws RecognitionException {
        EObject current = null;

        EObject this_EnvironmentId_0 = null;

        EObject this_EnvironmentStatement_1 = null;

        EObject this_EmptyEnvironment_2 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2852:28: ( (this_EnvironmentId_0= ruleEnvironmentId | this_EnvironmentStatement_1= ruleEnvironmentStatement | this_EmptyEnvironment_2= ruleEmptyEnvironment ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2853:1: (this_EnvironmentId_0= ruleEnvironmentId | this_EnvironmentStatement_1= ruleEnvironmentStatement | this_EmptyEnvironment_2= ruleEmptyEnvironment )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2853:1: (this_EnvironmentId_0= ruleEnvironmentId | this_EnvironmentStatement_1= ruleEnvironmentStatement | this_EmptyEnvironment_2= ruleEmptyEnvironment )
            int alt32=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt32=1;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 25:
            case 27:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
                {
                alt32=2;
                }
                break;
            case 43:
                {
                alt32=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2854:2: this_EnvironmentId_0= ruleEnvironmentId
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTerminalEnvironmentAccess().getEnvironmentIdParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnvironmentId_in_ruleTerminalEnvironment5832);
                    this_EnvironmentId_0=ruleEnvironmentId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnvironmentId_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2867:2: this_EnvironmentStatement_1= ruleEnvironmentStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTerminalEnvironmentAccess().getEnvironmentStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnvironmentStatement_in_ruleTerminalEnvironment5862);
                    this_EnvironmentStatement_1=ruleEnvironmentStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnvironmentStatement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2880:2: this_EmptyEnvironment_2= ruleEmptyEnvironment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTerminalEnvironmentAccess().getEmptyEnvironmentParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEmptyEnvironment_in_ruleTerminalEnvironment5892);
                    this_EmptyEnvironment_2=ruleEmptyEnvironment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EmptyEnvironment_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTerminalEnvironment"


    // $ANTLR start "entryRuleEnvironmentId"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2899:1: entryRuleEnvironmentId returns [EObject current=null] : iv_ruleEnvironmentId= ruleEnvironmentId EOF ;
    public final EObject entryRuleEnvironmentId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentId = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2900:2: (iv_ruleEnvironmentId= ruleEnvironmentId EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2901:2: iv_ruleEnvironmentId= ruleEnvironmentId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvironmentIdRule()); 
            }
            pushFollow(FOLLOW_ruleEnvironmentId_in_entryRuleEnvironmentId5927);
            iv_ruleEnvironmentId=ruleEnvironmentId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvironmentId; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnvironmentId5937); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnvironmentId"


    // $ANTLR start "ruleEnvironmentId"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2908:1: ruleEnvironmentId returns [EObject current=null] : ( (lv_environmentId_0_0= RULE_ID ) ) ;
    public final EObject ruleEnvironmentId() throws RecognitionException {
        EObject current = null;

        Token lv_environmentId_0_0=null;

         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2911:28: ( ( (lv_environmentId_0_0= RULE_ID ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2912:1: ( (lv_environmentId_0_0= RULE_ID ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2912:1: ( (lv_environmentId_0_0= RULE_ID ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2913:1: (lv_environmentId_0_0= RULE_ID )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2913:1: (lv_environmentId_0_0= RULE_ID )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2914:3: lv_environmentId_0_0= RULE_ID
            {
            lv_environmentId_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnvironmentId5978); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_environmentId_0_0, grammarAccess.getEnvironmentIdAccess().getEnvironmentIdIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnvironmentIdRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"environmentId",
                      		lv_environmentId_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEnvironmentId"


    // $ANTLR start "entryRuleEnvironmentStatement"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2938:1: entryRuleEnvironmentStatement returns [EObject current=null] : iv_ruleEnvironmentStatement= ruleEnvironmentStatement EOF ;
    public final EObject entryRuleEnvironmentStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentStatement = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2939:2: (iv_ruleEnvironmentStatement= ruleEnvironmentStatement EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2940:2: iv_ruleEnvironmentStatement= ruleEnvironmentStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvironmentStatementRule()); 
            }
            pushFollow(FOLLOW_ruleEnvironmentStatement_in_entryRuleEnvironmentStatement6018);
            iv_ruleEnvironmentStatement=ruleEnvironmentStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvironmentStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnvironmentStatement6028); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnvironmentStatement"


    // $ANTLR start "ruleEnvironmentStatement"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2947:1: ruleEnvironmentStatement returns [EObject current=null] : ( ( (lv_left_0_0= ruleTypingStatementExpression ) ) ( (lv_relation_1_0= ruleMappingRelation ) ) ( (lv_right_2_0= ruleTypingStatementExpression ) ) ) ;
    public final EObject ruleEnvironmentStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_relation_1_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2950:28: ( ( ( (lv_left_0_0= ruleTypingStatementExpression ) ) ( (lv_relation_1_0= ruleMappingRelation ) ) ( (lv_right_2_0= ruleTypingStatementExpression ) ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2951:1: ( ( (lv_left_0_0= ruleTypingStatementExpression ) ) ( (lv_relation_1_0= ruleMappingRelation ) ) ( (lv_right_2_0= ruleTypingStatementExpression ) ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2951:1: ( ( (lv_left_0_0= ruleTypingStatementExpression ) ) ( (lv_relation_1_0= ruleMappingRelation ) ) ( (lv_right_2_0= ruleTypingStatementExpression ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2951:2: ( (lv_left_0_0= ruleTypingStatementExpression ) ) ( (lv_relation_1_0= ruleMappingRelation ) ) ( (lv_right_2_0= ruleTypingStatementExpression ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2951:2: ( (lv_left_0_0= ruleTypingStatementExpression ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2952:1: (lv_left_0_0= ruleTypingStatementExpression )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2952:1: (lv_left_0_0= ruleTypingStatementExpression )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2953:3: lv_left_0_0= ruleTypingStatementExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnvironmentStatementAccess().getLeftTypingStatementExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypingStatementExpression_in_ruleEnvironmentStatement6074);
            lv_left_0_0=ruleTypingStatementExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnvironmentStatementRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"TypingStatementExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2969:2: ( (lv_relation_1_0= ruleMappingRelation ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2970:1: (lv_relation_1_0= ruleMappingRelation )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2970:1: (lv_relation_1_0= ruleMappingRelation )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2971:3: lv_relation_1_0= ruleMappingRelation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnvironmentStatementAccess().getRelationMappingRelationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMappingRelation_in_ruleEnvironmentStatement6095);
            lv_relation_1_0=ruleMappingRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnvironmentStatementRule());
              	        }
                     		set(
                     			current, 
                     			"relation",
                      		lv_relation_1_0, 
                      		"MappingRelation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2987:2: ( (lv_right_2_0= ruleTypingStatementExpression ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2988:1: (lv_right_2_0= ruleTypingStatementExpression )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2988:1: (lv_right_2_0= ruleTypingStatementExpression )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2989:3: lv_right_2_0= ruleTypingStatementExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnvironmentStatementAccess().getRightTypingStatementExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypingStatementExpression_in_ruleEnvironmentStatement6116);
            lv_right_2_0=ruleTypingStatementExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnvironmentStatementRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_2_0, 
                      		"TypingStatementExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEnvironmentStatement"


    // $ANTLR start "entryRuleEmptyEnvironment"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3013:1: entryRuleEmptyEnvironment returns [EObject current=null] : iv_ruleEmptyEnvironment= ruleEmptyEnvironment EOF ;
    public final EObject entryRuleEmptyEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyEnvironment = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3014:2: (iv_ruleEmptyEnvironment= ruleEmptyEnvironment EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3015:2: iv_ruleEmptyEnvironment= ruleEmptyEnvironment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmptyEnvironmentRule()); 
            }
            pushFollow(FOLLOW_ruleEmptyEnvironment_in_entryRuleEmptyEnvironment6152);
            iv_ruleEmptyEnvironment=ruleEmptyEnvironment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmptyEnvironment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyEnvironment6162); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEmptyEnvironment"


    // $ANTLR start "ruleEmptyEnvironment"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3022:1: ruleEmptyEnvironment returns [EObject current=null] : ( (lv_empty_0_0= 'empty' ) ) ;
    public final EObject ruleEmptyEnvironment() throws RecognitionException {
        EObject current = null;

        Token lv_empty_0_0=null;

         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3025:28: ( ( (lv_empty_0_0= 'empty' ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3026:1: ( (lv_empty_0_0= 'empty' ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3026:1: ( (lv_empty_0_0= 'empty' ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3027:1: (lv_empty_0_0= 'empty' )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3027:1: (lv_empty_0_0= 'empty' )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3028:3: lv_empty_0_0= 'empty'
            {
            lv_empty_0_0=(Token)match(input,43,FOLLOW_43_in_ruleEmptyEnvironment6204); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_empty_0_0, grammarAccess.getEmptyEnvironmentAccess().getEmptyEmptyKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEmptyEnvironmentRule());
              	        }
                     		setWithLastConsumed(current, "empty", lv_empty_0_0, "empty");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEmptyEnvironment"


    // $ANTLR start "entryRuleExpression"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3049:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3050:2: (iv_ruleExpression= ruleExpression EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3051:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6252);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6262); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3058:1: ruleExpression returns [EObject current=null] : (this_VariableDeclarationWithType_0= ruleVariableDeclarationWithType | ( () otherlv_2= 'env' otherlv_3= '(' ( (lv_envId_4_0= ruleEnvironmentId ) ) otherlv_5= ',' ( (lv_argument_6_0= ruleExpression ) ) otherlv_7= ')' ) | ( () otherlv_9= 'len' otherlv_10= '(' ( (lv_argument_11_0= ruleExpression ) ) otherlv_12= ')' ) | ( () otherlv_14= 'getall' otherlv_15= '(' ( (lv_expression_16_0= ruleExpression ) ) otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) otherlv_21= ')' ) | ( () otherlv_23= 'container' otherlv_24= '(' ( (lv_argument_25_0= ruleExpression ) ) otherlv_26= ')' ) | ( () otherlv_28= '(' ( (lv_type_29_0= ruleExpressionType ) ) otherlv_30= ')' ( (lv_expression_31_0= ruleExpression ) ) ) | ( () otherlv_33= 'null' ) | ( () otherlv_35= 'newname' otherlv_36= '(' ( (lv_argument_37_0= RULE_STRING ) ) otherlv_38= ')' ) | ( () otherlv_40= 'clone' otherlv_41= '(' ( (lv_argument_42_0= ruleExpression ) ) otherlv_43= ')' ) | (this_TerminalExpression_44= ruleTerminalExpression ( () ( (lv_op_46_0= '.' ) ) ( (lv_subExpression_47_0= ruleSubExpression ) ) )* ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token lv_argument_37_0=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token lv_op_46_0=null;
        EObject this_VariableDeclarationWithType_0 = null;

        EObject lv_envId_4_0 = null;

        EObject lv_argument_6_0 = null;

        EObject lv_argument_11_0 = null;

        EObject lv_expression_16_0 = null;

        EObject lv_argument_25_0 = null;

        EObject lv_type_29_0 = null;

        EObject lv_expression_31_0 = null;

        EObject lv_argument_42_0 = null;

        EObject this_TerminalExpression_44 = null;

        EObject lv_subExpression_47_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3061:28: ( (this_VariableDeclarationWithType_0= ruleVariableDeclarationWithType | ( () otherlv_2= 'env' otherlv_3= '(' ( (lv_envId_4_0= ruleEnvironmentId ) ) otherlv_5= ',' ( (lv_argument_6_0= ruleExpression ) ) otherlv_7= ')' ) | ( () otherlv_9= 'len' otherlv_10= '(' ( (lv_argument_11_0= ruleExpression ) ) otherlv_12= ')' ) | ( () otherlv_14= 'getall' otherlv_15= '(' ( (lv_expression_16_0= ruleExpression ) ) otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) otherlv_21= ')' ) | ( () otherlv_23= 'container' otherlv_24= '(' ( (lv_argument_25_0= ruleExpression ) ) otherlv_26= ')' ) | ( () otherlv_28= '(' ( (lv_type_29_0= ruleExpressionType ) ) otherlv_30= ')' ( (lv_expression_31_0= ruleExpression ) ) ) | ( () otherlv_33= 'null' ) | ( () otherlv_35= 'newname' otherlv_36= '(' ( (lv_argument_37_0= RULE_STRING ) ) otherlv_38= ')' ) | ( () otherlv_40= 'clone' otherlv_41= '(' ( (lv_argument_42_0= ruleExpression ) ) otherlv_43= ')' ) | (this_TerminalExpression_44= ruleTerminalExpression ( () ( (lv_op_46_0= '.' ) ) ( (lv_subExpression_47_0= ruleSubExpression ) ) )* ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3062:1: (this_VariableDeclarationWithType_0= ruleVariableDeclarationWithType | ( () otherlv_2= 'env' otherlv_3= '(' ( (lv_envId_4_0= ruleEnvironmentId ) ) otherlv_5= ',' ( (lv_argument_6_0= ruleExpression ) ) otherlv_7= ')' ) | ( () otherlv_9= 'len' otherlv_10= '(' ( (lv_argument_11_0= ruleExpression ) ) otherlv_12= ')' ) | ( () otherlv_14= 'getall' otherlv_15= '(' ( (lv_expression_16_0= ruleExpression ) ) otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) otherlv_21= ')' ) | ( () otherlv_23= 'container' otherlv_24= '(' ( (lv_argument_25_0= ruleExpression ) ) otherlv_26= ')' ) | ( () otherlv_28= '(' ( (lv_type_29_0= ruleExpressionType ) ) otherlv_30= ')' ( (lv_expression_31_0= ruleExpression ) ) ) | ( () otherlv_33= 'null' ) | ( () otherlv_35= 'newname' otherlv_36= '(' ( (lv_argument_37_0= RULE_STRING ) ) otherlv_38= ')' ) | ( () otherlv_40= 'clone' otherlv_41= '(' ( (lv_argument_42_0= ruleExpression ) ) otherlv_43= ')' ) | (this_TerminalExpression_44= ruleTerminalExpression ( () ( (lv_op_46_0= '.' ) ) ( (lv_subExpression_47_0= ruleSubExpression ) ) )* ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3062:1: (this_VariableDeclarationWithType_0= ruleVariableDeclarationWithType | ( () otherlv_2= 'env' otherlv_3= '(' ( (lv_envId_4_0= ruleEnvironmentId ) ) otherlv_5= ',' ( (lv_argument_6_0= ruleExpression ) ) otherlv_7= ')' ) | ( () otherlv_9= 'len' otherlv_10= '(' ( (lv_argument_11_0= ruleExpression ) ) otherlv_12= ')' ) | ( () otherlv_14= 'getall' otherlv_15= '(' ( (lv_expression_16_0= ruleExpression ) ) otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) otherlv_21= ')' ) | ( () otherlv_23= 'container' otherlv_24= '(' ( (lv_argument_25_0= ruleExpression ) ) otherlv_26= ')' ) | ( () otherlv_28= '(' ( (lv_type_29_0= ruleExpressionType ) ) otherlv_30= ')' ( (lv_expression_31_0= ruleExpression ) ) ) | ( () otherlv_33= 'null' ) | ( () otherlv_35= 'newname' otherlv_36= '(' ( (lv_argument_37_0= RULE_STRING ) ) otherlv_38= ')' ) | ( () otherlv_40= 'clone' otherlv_41= '(' ( (lv_argument_42_0= ruleExpression ) ) otherlv_43= ')' ) | (this_TerminalExpression_44= ruleTerminalExpression ( () ( (lv_op_46_0= '.' ) ) ( (lv_subExpression_47_0= ruleSubExpression ) ) )* ) )
            int alt34=10;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt34=1;
                }
                break;
            case 44:
                {
                alt34=2;
                }
                break;
            case 46:
                {
                alt34=3;
                }
                break;
            case 47:
                {
                alt34=4;
                }
                break;
            case 48:
                {
                alt34=5;
                }
                break;
            case 25:
                {
                alt34=6;
                }
                break;
            case 49:
                {
                alt34=7;
                }
                break;
            case 50:
                {
                alt34=8;
                }
                break;
            case 51:
                {
                alt34=9;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 53:
                {
                alt34=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3063:2: this_VariableDeclarationWithType_0= ruleVariableDeclarationWithType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getVariableDeclarationWithTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclarationWithType_in_ruleExpression6312);
                    this_VariableDeclarationWithType_0=ruleVariableDeclarationWithType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDeclarationWithType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3075:6: ( () otherlv_2= 'env' otherlv_3= '(' ( (lv_envId_4_0= ruleEnvironmentId ) ) otherlv_5= ',' ( (lv_argument_6_0= ruleExpression ) ) otherlv_7= ')' )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3075:6: ( () otherlv_2= 'env' otherlv_3= '(' ( (lv_envId_4_0= ruleEnvironmentId ) ) otherlv_5= ',' ( (lv_argument_6_0= ruleExpression ) ) otherlv_7= ')' )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3075:7: () otherlv_2= 'env' otherlv_3= '(' ( (lv_envId_4_0= ruleEnvironmentId ) ) otherlv_5= ',' ( (lv_argument_6_0= ruleExpression ) ) otherlv_7= ')'
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3075:7: ()
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3076:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionAccess().getEnvironmentAccessAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleExpression6342); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getEnvKeyword_1_1());
                          
                    }
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleExpression6354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1_2());
                          
                    }
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3092:1: ( (lv_envId_4_0= ruleEnvironmentId ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3093:1: (lv_envId_4_0= ruleEnvironmentId )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3093:1: (lv_envId_4_0= ruleEnvironmentId )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3094:3: lv_envId_4_0= ruleEnvironmentId
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getEnvIdEnvironmentIdParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEnvironmentId_in_ruleExpression6375);
                    lv_envId_4_0=ruleEnvironmentId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"envId",
                              		lv_envId_4_0, 
                              		"EnvironmentId");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleExpression6387); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getCommaKeyword_1_4());
                          
                    }
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3114:1: ( (lv_argument_6_0= ruleExpression ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3115:1: (lv_argument_6_0= ruleExpression )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3115:1: (lv_argument_6_0= ruleExpression )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3116:3: lv_argument_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getArgumentExpressionParserRuleCall_1_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression6408);
                    lv_argument_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"argument",
                              		lv_argument_6_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleExpression6420); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_1_6());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3137:6: ( () otherlv_9= 'len' otherlv_10= '(' ( (lv_argument_11_0= ruleExpression ) ) otherlv_12= ')' )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3137:6: ( () otherlv_9= 'len' otherlv_10= '(' ( (lv_argument_11_0= ruleExpression ) ) otherlv_12= ')' )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3137:7: () otherlv_9= 'len' otherlv_10= '(' ( (lv_argument_11_0= ruleExpression ) ) otherlv_12= ')'
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3137:7: ()
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3138:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionAccess().getLengthAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleExpression6452); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getExpressionAccess().getLenKeyword_2_1());
                          
                    }
                    otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleExpression6464); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_2_2());
                          
                    }
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3154:1: ( (lv_argument_11_0= ruleExpression ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3155:1: (lv_argument_11_0= ruleExpression )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3155:1: (lv_argument_11_0= ruleExpression )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3156:3: lv_argument_11_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getArgumentExpressionParserRuleCall_2_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression6485);
                    lv_argument_11_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"argument",
                              		lv_argument_11_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,26,FOLLOW_26_in_ruleExpression6497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_2_4());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3177:6: ( () otherlv_14= 'getall' otherlv_15= '(' ( (lv_expression_16_0= ruleExpression ) ) otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) otherlv_21= ')' )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3177:6: ( () otherlv_14= 'getall' otherlv_15= '(' ( (lv_expression_16_0= ruleExpression ) ) otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) otherlv_21= ')' )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3177:7: () otherlv_14= 'getall' otherlv_15= '(' ( (lv_expression_16_0= ruleExpression ) ) otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) otherlv_21= ')'
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3177:7: ()
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3178:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionAccess().getGetAllAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_14=(Token)match(input,47,FOLLOW_47_in_ruleExpression6529); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getExpressionAccess().getGetallKeyword_3_1());
                          
                    }
                    otherlv_15=(Token)match(input,25,FOLLOW_25_in_ruleExpression6541); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_3_2());
                          
                    }
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3194:1: ( (lv_expression_16_0= ruleExpression ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3195:1: (lv_expression_16_0= ruleExpression )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3195:1: (lv_expression_16_0= ruleExpression )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3196:3: lv_expression_16_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpressionParserRuleCall_3_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression6562);
                    lv_expression_16_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_16_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,45,FOLLOW_45_in_ruleExpression6574); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getExpressionAccess().getCommaKeyword_3_4());
                          
                    }
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3216:1: ( (otherlv_18= RULE_ID ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3217:1: (otherlv_18= RULE_ID )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3217:1: (otherlv_18= RULE_ID )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3218:3: otherlv_18= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                              
                    }
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression6598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_18, grammarAccess.getExpressionAccess().getMainfeatureEStructuralFeatureCrossReference_3_5_0()); 
                      	
                    }

                    }


                    }

                    otherlv_19=(Token)match(input,45,FOLLOW_45_in_ruleExpression6610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getExpressionAccess().getCommaKeyword_3_6());
                          
                    }
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3236:1: ( (otherlv_20= RULE_ID ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3237:1: (otherlv_20= RULE_ID )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3237:1: (otherlv_20= RULE_ID )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3238:3: otherlv_20= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                              
                    }
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression6634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_20, grammarAccess.getExpressionAccess().getExtendfeatureEStructuralFeatureCrossReference_3_7_0()); 
                      	
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,26,FOLLOW_26_in_ruleExpression6646); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_3_8());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3257:6: ( () otherlv_23= 'container' otherlv_24= '(' ( (lv_argument_25_0= ruleExpression ) ) otherlv_26= ')' )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3257:6: ( () otherlv_23= 'container' otherlv_24= '(' ( (lv_argument_25_0= ruleExpression ) ) otherlv_26= ')' )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3257:7: () otherlv_23= 'container' otherlv_24= '(' ( (lv_argument_25_0= ruleExpression ) ) otherlv_26= ')'
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3257:7: ()
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3258:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionAccess().getContainerAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_23=(Token)match(input,48,FOLLOW_48_in_ruleExpression6678); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getExpressionAccess().getContainerKeyword_4_1());
                          
                    }
                    otherlv_24=(Token)match(input,25,FOLLOW_25_in_ruleExpression6690); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_4_2());
                          
                    }
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3274:1: ( (lv_argument_25_0= ruleExpression ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3275:1: (lv_argument_25_0= ruleExpression )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3275:1: (lv_argument_25_0= ruleExpression )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3276:3: lv_argument_25_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getArgumentExpressionParserRuleCall_4_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression6711);
                    lv_argument_25_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"argument",
                              		lv_argument_25_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_26=(Token)match(input,26,FOLLOW_26_in_ruleExpression6723); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_4_4());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3297:6: ( () otherlv_28= '(' ( (lv_type_29_0= ruleExpressionType ) ) otherlv_30= ')' ( (lv_expression_31_0= ruleExpression ) ) )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3297:6: ( () otherlv_28= '(' ( (lv_type_29_0= ruleExpressionType ) ) otherlv_30= ')' ( (lv_expression_31_0= ruleExpression ) ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3297:7: () otherlv_28= '(' ( (lv_type_29_0= ruleExpressionType ) ) otherlv_30= ')' ( (lv_expression_31_0= ruleExpression ) )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3297:7: ()
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3298:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionAccess().getCastToAction_5_0(),
                                  current);
                          
                    }

                    }

                    otherlv_28=(Token)match(input,25,FOLLOW_25_in_ruleExpression6755); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_28, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_5_1());
                          
                    }
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3310:1: ( (lv_type_29_0= ruleExpressionType ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3311:1: (lv_type_29_0= ruleExpressionType )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3311:1: (lv_type_29_0= ruleExpressionType )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3312:3: lv_type_29_0= ruleExpressionType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getTypeExpressionTypeParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpressionType_in_ruleExpression6776);
                    lv_type_29_0=ruleExpressionType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_29_0, 
                              		"ExpressionType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_30=(Token)match(input,26,FOLLOW_26_in_ruleExpression6788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_5_3());
                          
                    }
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3332:1: ( (lv_expression_31_0= ruleExpression ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3333:1: (lv_expression_31_0= ruleExpression )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3333:1: (lv_expression_31_0= ruleExpression )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3334:3: lv_expression_31_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpressionParserRuleCall_5_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression6809);
                    lv_expression_31_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_31_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3351:6: ( () otherlv_33= 'null' )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3351:6: ( () otherlv_33= 'null' )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3351:7: () otherlv_33= 'null'
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3351:7: ()
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3352:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionAccess().getNullAction_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_33=(Token)match(input,49,FOLLOW_49_in_ruleExpression6841); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_33, grammarAccess.getExpressionAccess().getNullKeyword_6_1());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3365:6: ( () otherlv_35= 'newname' otherlv_36= '(' ( (lv_argument_37_0= RULE_STRING ) ) otherlv_38= ')' )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3365:6: ( () otherlv_35= 'newname' otherlv_36= '(' ( (lv_argument_37_0= RULE_STRING ) ) otherlv_38= ')' )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3365:7: () otherlv_35= 'newname' otherlv_36= '(' ( (lv_argument_37_0= RULE_STRING ) ) otherlv_38= ')'
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3365:7: ()
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3366:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionAccess().getNewNameAction_7_0(),
                                  current);
                          
                    }

                    }

                    otherlv_35=(Token)match(input,50,FOLLOW_50_in_ruleExpression6873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getExpressionAccess().getNewnameKeyword_7_1());
                          
                    }
                    otherlv_36=(Token)match(input,25,FOLLOW_25_in_ruleExpression6885); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_36, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_7_2());
                          
                    }
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3382:1: ( (lv_argument_37_0= RULE_STRING ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3383:1: (lv_argument_37_0= RULE_STRING )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3383:1: (lv_argument_37_0= RULE_STRING )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3384:3: lv_argument_37_0= RULE_STRING
                    {
                    lv_argument_37_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExpression6902); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_argument_37_0, grammarAccess.getExpressionAccess().getArgumentSTRINGTerminalRuleCall_7_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"argument",
                              		lv_argument_37_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    otherlv_38=(Token)match(input,26,FOLLOW_26_in_ruleExpression6919); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_38, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_7_4());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3405:6: ( () otherlv_40= 'clone' otherlv_41= '(' ( (lv_argument_42_0= ruleExpression ) ) otherlv_43= ')' )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3405:6: ( () otherlv_40= 'clone' otherlv_41= '(' ( (lv_argument_42_0= ruleExpression ) ) otherlv_43= ')' )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3405:7: () otherlv_40= 'clone' otherlv_41= '(' ( (lv_argument_42_0= ruleExpression ) ) otherlv_43= ')'
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3405:7: ()
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3406:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionAccess().getCloneAction_8_0(),
                                  current);
                          
                    }

                    }

                    otherlv_40=(Token)match(input,51,FOLLOW_51_in_ruleExpression6951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_40, grammarAccess.getExpressionAccess().getCloneKeyword_8_1());
                          
                    }
                    otherlv_41=(Token)match(input,25,FOLLOW_25_in_ruleExpression6963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_41, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_8_2());
                          
                    }
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3422:1: ( (lv_argument_42_0= ruleExpression ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3423:1: (lv_argument_42_0= ruleExpression )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3423:1: (lv_argument_42_0= ruleExpression )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3424:3: lv_argument_42_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getArgumentExpressionParserRuleCall_8_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression6984);
                    lv_argument_42_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"argument",
                              		lv_argument_42_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_43=(Token)match(input,26,FOLLOW_26_in_ruleExpression6996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_43, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_8_4());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3445:6: (this_TerminalExpression_44= ruleTerminalExpression ( () ( (lv_op_46_0= '.' ) ) ( (lv_subExpression_47_0= ruleSubExpression ) ) )* )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3445:6: (this_TerminalExpression_44= ruleTerminalExpression ( () ( (lv_op_46_0= '.' ) ) ( (lv_subExpression_47_0= ruleSubExpression ) ) )* )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3446:2: this_TerminalExpression_44= ruleTerminalExpression ( () ( (lv_op_46_0= '.' ) ) ( (lv_subExpression_47_0= ruleSubExpression ) ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_9_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTerminalExpression_in_ruleExpression7029);
                    this_TerminalExpression_44=ruleTerminalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TerminalExpression_44; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3457:1: ( () ( (lv_op_46_0= '.' ) ) ( (lv_subExpression_47_0= ruleSubExpression ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==52) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3457:2: () ( (lv_op_46_0= '.' ) ) ( (lv_subExpression_47_0= ruleSubExpression ) )
                    	    {
                    	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3457:2: ()
                    	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3458:2: 
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	  /* */ 
                    	      	
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getExpressionAccess().getCompoundExpressionMainExpressionAction_9_1_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3466:2: ( (lv_op_46_0= '.' ) )
                    	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3467:1: (lv_op_46_0= '.' )
                    	    {
                    	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3467:1: (lv_op_46_0= '.' )
                    	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3468:3: lv_op_46_0= '.'
                    	    {
                    	    lv_op_46_0=(Token)match(input,52,FOLLOW_52_in_ruleExpression7059); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              newLeafNode(lv_op_46_0, grammarAccess.getExpressionAccess().getOpFullStopKeyword_9_1_1_0());
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getExpressionRule());
                    	      	        }
                    	             		setWithLastConsumed(current, "op", lv_op_46_0, ".");
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3481:2: ( (lv_subExpression_47_0= ruleSubExpression ) )
                    	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3482:1: (lv_subExpression_47_0= ruleSubExpression )
                    	    {
                    	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3482:1: (lv_subExpression_47_0= ruleSubExpression )
                    	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3483:3: lv_subExpression_47_0= ruleSubExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpressionAccess().getSubExpressionSubExpressionParserRuleCall_9_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSubExpression_in_ruleExpression7093);
                    	    lv_subExpression_47_0=ruleSubExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"subExpression",
                    	              		lv_subExpression_47_0, 
                    	              		"SubExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3507:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3508:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3509:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression7132);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression7142); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3516:1: ruleTerminalExpression returns [EObject current=null] : (this_StringConstant_0= ruleStringConstant | this_IntegerConstant_1= ruleIntegerConstant | this_VariableAccess_2= ruleVariableAccess ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StringConstant_0 = null;

        EObject this_IntegerConstant_1 = null;

        EObject this_VariableAccess_2 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3519:28: ( (this_StringConstant_0= ruleStringConstant | this_IntegerConstant_1= ruleIntegerConstant | this_VariableAccess_2= ruleVariableAccess ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3520:1: (this_StringConstant_0= ruleStringConstant | this_IntegerConstant_1= ruleIntegerConstant | this_VariableAccess_2= ruleVariableAccess )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3520:1: (this_StringConstant_0= ruleStringConstant | this_IntegerConstant_1= ruleIntegerConstant | this_VariableAccess_2= ruleVariableAccess )
            int alt35=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt35=1;
                }
                break;
            case RULE_INT:
                {
                alt35=2;
                }
                break;
            case 53:
                {
                alt35=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3521:2: this_StringConstant_0= ruleStringConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTerminalExpressionAccess().getStringConstantParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringConstant_in_ruleTerminalExpression7192);
                    this_StringConstant_0=ruleStringConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringConstant_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3534:2: this_IntegerConstant_1= ruleIntegerConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTerminalExpressionAccess().getIntegerConstantParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerConstant_in_ruleTerminalExpression7222);
                    this_IntegerConstant_1=ruleIntegerConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerConstant_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3547:2: this_VariableAccess_2= ruleVariableAccess
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTerminalExpressionAccess().getVariableAccessParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableAccess_in_ruleTerminalExpression7252);
                    this_VariableAccess_2=ruleVariableAccess();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableAccess_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleStringConstant"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3566:1: entryRuleStringConstant returns [EObject current=null] : iv_ruleStringConstant= ruleStringConstant EOF ;
    public final EObject entryRuleStringConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringConstant = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3567:2: (iv_ruleStringConstant= ruleStringConstant EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3568:2: iv_ruleStringConstant= ruleStringConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringConstantRule()); 
            }
            pushFollow(FOLLOW_ruleStringConstant_in_entryRuleStringConstant7287);
            iv_ruleStringConstant=ruleStringConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringConstant7297); if (state.failed) return current;

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
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3575:1: ruleStringConstant returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3578:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3579:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3579:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3580:1: (lv_value_0_0= RULE_STRING )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3580:1: (lv_value_0_0= RULE_STRING )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3581:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringConstant7338); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringConstantAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringConstantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStringConstant"


    // $ANTLR start "entryRuleIntegerConstant"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3605:1: entryRuleIntegerConstant returns [EObject current=null] : iv_ruleIntegerConstant= ruleIntegerConstant EOF ;
    public final EObject entryRuleIntegerConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerConstant = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3606:2: (iv_ruleIntegerConstant= ruleIntegerConstant EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3607:2: iv_ruleIntegerConstant= ruleIntegerConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerConstantRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerConstant_in_entryRuleIntegerConstant7378);
            iv_ruleIntegerConstant=ruleIntegerConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerConstant7388); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerConstant"


    // $ANTLR start "ruleIntegerConstant"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3614:1: ruleIntegerConstant returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3617:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3618:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3618:1: ( (lv_value_0_0= RULE_INT ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3619:1: (lv_value_0_0= RULE_INT )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3619:1: (lv_value_0_0= RULE_INT )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3620:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerConstant7429); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getIntegerConstantAccess().getValueINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntegerConstantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"INT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIntegerConstant"


    // $ANTLR start "entryRuleVariableAccess"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3644:1: entryRuleVariableAccess returns [EObject current=null] : iv_ruleVariableAccess= ruleVariableAccess EOF ;
    public final EObject entryRuleVariableAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAccess = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3645:2: (iv_ruleVariableAccess= ruleVariableAccess EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3646:2: iv_ruleVariableAccess= ruleVariableAccess EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableAccessRule()); 
            }
            pushFollow(FOLLOW_ruleVariableAccess_in_entryRuleVariableAccess7469);
            iv_ruleVariableAccess=ruleVariableAccess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableAccess; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAccess7479); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableAccess"


    // $ANTLR start "ruleVariableAccess"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3653:1: ruleVariableAccess returns [EObject current=null] : (this_VariableReference_0= ruleVariableReference | this_IndexedVariable_1= ruleIndexedVariable ) ;
    public final EObject ruleVariableAccess() throws RecognitionException {
        EObject current = null;

        EObject this_VariableReference_0 = null;

        EObject this_IndexedVariable_1 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3656:28: ( (this_VariableReference_0= ruleVariableReference | this_IndexedVariable_1= ruleIndexedVariable ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3657:1: (this_VariableReference_0= ruleVariableReference | this_IndexedVariable_1= ruleIndexedVariable )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3657:1: (this_VariableReference_0= ruleVariableReference | this_IndexedVariable_1= ruleIndexedVariable )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==53) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==RULE_ID) ) {
                    int LA36_2 = input.LA(3);

                    if ( (LA36_2==EOF||(LA36_2>=RULE_ID && LA36_2<=RULE_INT)||(LA36_2>=17 && LA36_2<=18)||(LA36_2>=21 && LA36_2<=22)||(LA36_2>=24 && LA36_2<=27)||LA36_2==30||(LA36_2>=34 && LA36_2<=38)||(LA36_2>=40 && LA36_2<=65)) ) {
                        alt36=1;
                    }
                    else if ( (LA36_2==29) ) {
                        alt36=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3658:2: this_VariableReference_0= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccessAccess().getVariableReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_ruleVariableAccess7529);
                    this_VariableReference_0=ruleVariableReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3671:2: this_IndexedVariable_1= ruleIndexedVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccessAccess().getIndexedVariableParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIndexedVariable_in_ruleVariableAccess7559);
                    this_IndexedVariable_1=ruleIndexedVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IndexedVariable_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariableAccess"


    // $ANTLR start "entryRuleVariableReference"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3690:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3691:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3692:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference7594);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference7604); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3699:1: ruleVariableReference returns [EObject current=null] : (otherlv_0= '$' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3702:28: ( (otherlv_0= '$' ( (otherlv_1= RULE_ID ) ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3703:1: (otherlv_0= '$' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3703:1: (otherlv_0= '$' ( (otherlv_1= RULE_ID ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3703:3: otherlv_0= '$' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleVariableReference7641); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVariableReferenceAccess().getDollarSignKeyword_0());
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3707:1: ( (otherlv_1= RULE_ID ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3708:1: (otherlv_1= RULE_ID )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3708:1: (otherlv_1= RULE_ID )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3709:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableReferenceRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableReference7665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getVariableReferenceAccess().getVarRefVariableDeclarationCrossReference_1_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleIndexedVariable"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3731:1: entryRuleIndexedVariable returns [EObject current=null] : iv_ruleIndexedVariable= ruleIndexedVariable EOF ;
    public final EObject entryRuleIndexedVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedVariable = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3732:2: (iv_ruleIndexedVariable= ruleIndexedVariable EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3733:2: iv_ruleIndexedVariable= ruleIndexedVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexedVariableRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedVariable_in_entryRuleIndexedVariable7701);
            iv_ruleIndexedVariable=ruleIndexedVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexedVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedVariable7711); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIndexedVariable"


    // $ANTLR start "ruleIndexedVariable"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3740:1: ruleIndexedVariable returns [EObject current=null] : (otherlv_0= '$' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_index_3_0= ruleArrayIndex ) ) otherlv_4= ']' ) ;
    public final EObject ruleIndexedVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_index_3_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3743:28: ( (otherlv_0= '$' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_index_3_0= ruleArrayIndex ) ) otherlv_4= ']' ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3744:1: (otherlv_0= '$' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_index_3_0= ruleArrayIndex ) ) otherlv_4= ']' )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3744:1: (otherlv_0= '$' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_index_3_0= ruleArrayIndex ) ) otherlv_4= ']' )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3744:3: otherlv_0= '$' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_index_3_0= ruleArrayIndex ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleIndexedVariable7748); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIndexedVariableAccess().getDollarSignKeyword_0());
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3748:1: ( (otherlv_1= RULE_ID ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3749:1: (otherlv_1= RULE_ID )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3749:1: (otherlv_1= RULE_ID )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3750:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIndexedVariableRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexedVariable7772); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getIndexedVariableAccess().getVarRefVariableDeclarationCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleIndexedVariable7784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIndexedVariableAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3768:1: ( (lv_index_3_0= ruleArrayIndex ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3769:1: (lv_index_3_0= ruleArrayIndex )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3769:1: (lv_index_3_0= ruleArrayIndex )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3770:3: lv_index_3_0= ruleArrayIndex
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIndexedVariableAccess().getIndexArrayIndexParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArrayIndex_in_ruleIndexedVariable7805);
            lv_index_3_0=ruleArrayIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIndexedVariableRule());
              	        }
                     		set(
                     			current, 
                     			"index",
                      		lv_index_3_0, 
                      		"ArrayIndex");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleIndexedVariable7817); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getIndexedVariableAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIndexedVariable"


    // $ANTLR start "entryRuleSubExpression"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3798:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3799:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3800:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSubExpression_in_entryRuleSubExpression7853);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubExpression7863); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubExpression"


    // $ANTLR start "ruleSubExpression"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3807:1: ruleSubExpression returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_index_3_0= ruleArrayIndex ) ) otherlv_4= ']' ) | ( () ( (otherlv_6= RULE_ID ) ) ) ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_index_3_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3810:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_index_3_0= ruleArrayIndex ) ) otherlv_4= ']' ) | ( () ( (otherlv_6= RULE_ID ) ) ) ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3811:1: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_index_3_0= ruleArrayIndex ) ) otherlv_4= ']' ) | ( () ( (otherlv_6= RULE_ID ) ) ) )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3811:1: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_index_3_0= ruleArrayIndex ) ) otherlv_4= ']' ) | ( () ( (otherlv_6= RULE_ID ) ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==29) ) {
                    alt37=1;
                }
                else if ( (LA37_1==EOF||(LA37_1>=RULE_ID && LA37_1<=RULE_INT)||(LA37_1>=17 && LA37_1<=18)||(LA37_1>=21 && LA37_1<=22)||(LA37_1>=24 && LA37_1<=27)||LA37_1==30||(LA37_1>=34 && LA37_1<=38)||(LA37_1>=40 && LA37_1<=65)) ) {
                    alt37=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3811:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_index_3_0= ruleArrayIndex ) ) otherlv_4= ']' )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3811:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_index_3_0= ruleArrayIndex ) ) otherlv_4= ']' )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3811:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_index_3_0= ruleArrayIndex ) ) otherlv_4= ']'
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3811:3: ()
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3812:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSubExpressionAccess().getIndexedAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3820:2: ( (otherlv_1= RULE_ID ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3821:1: (otherlv_1= RULE_ID )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3821:1: (otherlv_1= RULE_ID )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3822:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSubExpressionRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubExpression7925); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getSubExpressionAccess().getFeatureENamedElementCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleSubExpression7937); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSubExpressionAccess().getLeftSquareBracketKeyword_0_2());
                          
                    }
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3840:1: ( (lv_index_3_0= ruleArrayIndex ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3841:1: (lv_index_3_0= ruleArrayIndex )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3841:1: (lv_index_3_0= ruleArrayIndex )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3842:3: lv_index_3_0= ruleArrayIndex
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getIndexArrayIndexParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArrayIndex_in_ruleSubExpression7958);
                    lv_index_3_0=ruleArrayIndex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"index",
                              		lv_index_3_0, 
                              		"ArrayIndex");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleSubExpression7970); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSubExpressionAccess().getRightSquareBracketKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3863:6: ( () ( (otherlv_6= RULE_ID ) ) )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3863:6: ( () ( (otherlv_6= RULE_ID ) ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3863:7: () ( (otherlv_6= RULE_ID ) )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3863:7: ()
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3864:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSubExpressionAccess().getFeatureAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3872:2: ( (otherlv_6= RULE_ID ) )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3873:1: (otherlv_6= RULE_ID )
                    {
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3873:1: (otherlv_6= RULE_ID )
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3874:3: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSubExpressionRule());
                      	        }
                              
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubExpression8014); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_6, grammarAccess.getSubExpressionAccess().getFeatureENamedElementCrossReference_1_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleArrayIndex"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3896:1: entryRuleArrayIndex returns [EObject current=null] : iv_ruleArrayIndex= ruleArrayIndex EOF ;
    public final EObject entryRuleArrayIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayIndex = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3897:2: (iv_ruleArrayIndex= ruleArrayIndex EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3898:2: iv_ruleArrayIndex= ruleArrayIndex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayIndexRule()); 
            }
            pushFollow(FOLLOW_ruleArrayIndex_in_entryRuleArrayIndex8051);
            iv_ruleArrayIndex=ruleArrayIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayIndex; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayIndex8061); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayIndex"


    // $ANTLR start "ruleArrayIndex"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3905:1: ruleArrayIndex returns [EObject current=null] : (this_IntegerConstant_0= ruleIntegerConstant | this_Expression_1= ruleExpression ) ;
    public final EObject ruleArrayIndex() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerConstant_0 = null;

        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3908:28: ( (this_IntegerConstant_0= ruleIntegerConstant | this_Expression_1= ruleExpression ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3909:1: (this_IntegerConstant_0= ruleIntegerConstant | this_Expression_1= ruleExpression )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3909:1: (this_IntegerConstant_0= ruleIntegerConstant | this_Expression_1= ruleExpression )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                int LA38_1 = input.LA(2);

                if ( (synpred62_InternalTypeSystem()) ) {
                    alt38=1;
                }
                else if ( (true) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA38_0==RULE_STRING||LA38_0==25||LA38_0==27||LA38_0==44||(LA38_0>=46 && LA38_0<=51)||LA38_0==53) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3910:2: this_IntegerConstant_0= ruleIntegerConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArrayIndexAccess().getIntegerConstantParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerConstant_in_ruleArrayIndex8111);
                    this_IntegerConstant_0=ruleIntegerConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerConstant_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3923:2: this_Expression_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArrayIndexAccess().getExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleArrayIndex8141);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArrayIndex"


    // $ANTLR start "entryRuleAlternative"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3942:1: entryRuleAlternative returns [String current=null] : iv_ruleAlternative= ruleAlternative EOF ;
    public final String entryRuleAlternative() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAlternative = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3943:2: (iv_ruleAlternative= ruleAlternative EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3944:2: iv_ruleAlternative= ruleAlternative EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlternativeRule()); 
            }
            pushFollow(FOLLOW_ruleAlternative_in_entryRuleAlternative8177);
            iv_ruleAlternative=ruleAlternative();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlternative.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternative8188); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAlternative"


    // $ANTLR start "ruleAlternative"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3951:1: ruleAlternative returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '|' ;
    public final AntlrDatatypeRuleToken ruleAlternative() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3954:28: (kw= '|' )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3956:2: kw= '|'
            {
            kw=(Token)match(input,54,FOLLOW_54_in_ruleAlternative8225); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getAlternativeAccess().getVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAlternative"


    // $ANTLR start "entryRuleOrSeparator"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3969:1: entryRuleOrSeparator returns [String current=null] : iv_ruleOrSeparator= ruleOrSeparator EOF ;
    public final String entryRuleOrSeparator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrSeparator = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3970:2: (iv_ruleOrSeparator= ruleOrSeparator EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3971:2: iv_ruleOrSeparator= ruleOrSeparator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrSeparatorRule()); 
            }
            pushFollow(FOLLOW_ruleOrSeparator_in_entryRuleOrSeparator8265);
            iv_ruleOrSeparator=ruleOrSeparator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrSeparator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrSeparator8276); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrSeparator"


    // $ANTLR start "ruleOrSeparator"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3978:1: ruleOrSeparator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Alternative_0= ruleAlternative | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleOrSeparator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Alternative_0 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3981:28: ( (this_Alternative_0= ruleAlternative | kw= 'or' ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3982:1: (this_Alternative_0= ruleAlternative | kw= 'or' )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3982:1: (this_Alternative_0= ruleAlternative | kw= 'or' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==54) ) {
                alt39=1;
            }
            else if ( (LA39_0==55) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3983:5: this_Alternative_0= ruleAlternative
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOrSeparatorAccess().getAlternativeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlternative_in_ruleOrSeparator8323);
                    this_Alternative_0=ruleAlternative();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Alternative_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3995:2: kw= 'or'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleOrSeparator8347); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOrSeparatorAccess().getOrKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOrSeparator"


    // $ANTLR start "entryRuleMappingRelation"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4008:1: entryRuleMappingRelation returns [String current=null] : iv_ruleMappingRelation= ruleMappingRelation EOF ;
    public final String entryRuleMappingRelation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMappingRelation = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4009:2: (iv_ruleMappingRelation= ruleMappingRelation EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4010:2: iv_ruleMappingRelation= ruleMappingRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingRelationRule()); 
            }
            pushFollow(FOLLOW_ruleMappingRelation_in_entryRuleMappingRelation8388);
            iv_ruleMappingRelation=ruleMappingRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingRelation.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingRelation8399); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMappingRelation"


    // $ANTLR start "ruleMappingRelation"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4017:1: ruleMappingRelation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '->' ;
    public final AntlrDatatypeRuleToken ruleMappingRelation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4020:28: (kw= '->' )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4022:2: kw= '->'
            {
            kw=(Token)match(input,56,FOLLOW_56_in_ruleMappingRelation8436); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getMappingRelationAccess().getHyphenMinusGreaterThanSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMappingRelation"


    // $ANTLR start "entryRuleTypeRelation"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4035:1: entryRuleTypeRelation returns [String current=null] : iv_ruleTypeRelation= ruleTypeRelation EOF ;
    public final String entryRuleTypeRelation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeRelation = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4036:2: (iv_ruleTypeRelation= ruleTypeRelation EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4037:2: iv_ruleTypeRelation= ruleTypeRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRelationRule()); 
            }
            pushFollow(FOLLOW_ruleTypeRelation_in_entryRuleTypeRelation8476);
            iv_ruleTypeRelation=ruleTypeRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeRelation.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRelation8487); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeRelation"


    // $ANTLR start "ruleTypeRelation"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4044:1: ruleTypeRelation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AssignOp_0= ruleAssignOp | this_EqualsOp_1= ruleEqualsOp | kw= '<' | kw= '>' | kw= '!' | kw= '-' | this_Colon_6= ruleColon | kw= '~' )+ ;
    public final AntlrDatatypeRuleToken ruleTypeRelation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AssignOp_0 = null;

        AntlrDatatypeRuleToken this_EqualsOp_1 = null;

        AntlrDatatypeRuleToken this_Colon_6 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4047:28: ( (this_AssignOp_0= ruleAssignOp | this_EqualsOp_1= ruleEqualsOp | kw= '<' | kw= '>' | kw= '!' | kw= '-' | this_Colon_6= ruleColon | kw= '~' )+ )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4048:1: (this_AssignOp_0= ruleAssignOp | this_EqualsOp_1= ruleEqualsOp | kw= '<' | kw= '>' | kw= '!' | kw= '-' | this_Colon_6= ruleColon | kw= '~' )+
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4048:1: (this_AssignOp_0= ruleAssignOp | this_EqualsOp_1= ruleEqualsOp | kw= '<' | kw= '>' | kw= '!' | kw= '-' | this_Colon_6= ruleColon | kw= '~' )+
            int cnt40=0;
            loop40:
            do {
                int alt40=9;
                switch ( input.LA(1) ) {
                case 61:
                    {
                    alt40=1;
                    }
                    break;
                case 62:
                    {
                    alt40=2;
                    }
                    break;
                case 57:
                    {
                    alt40=3;
                    }
                    break;
                case 58:
                    {
                    alt40=4;
                    }
                    break;
                case 40:
                    {
                    alt40=5;
                    }
                    break;
                case 59:
                    {
                    alt40=6;
                    }
                    break;
                case 65:
                    {
                    alt40=7;
                    }
                    break;
                case 60:
                    {
                    alt40=8;
                    }
                    break;

                }

                switch (alt40) {
            	case 1 :
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4049:5: this_AssignOp_0= ruleAssignOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getTypeRelationAccess().getAssignOpParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleAssignOp_in_ruleTypeRelation8534);
            	    this_AssignOp_0=ruleAssignOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_AssignOp_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4061:5: this_EqualsOp_1= ruleEqualsOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getTypeRelationAccess().getEqualsOpParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleEqualsOp_in_ruleTypeRelation8567);
            	    this_EqualsOp_1=ruleEqualsOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_EqualsOp_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4073:2: kw= '<'
            	    {
            	    kw=(Token)match(input,57,FOLLOW_57_in_ruleTypeRelation8591); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getTypeRelationAccess().getLessThanSignKeyword_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4080:2: kw= '>'
            	    {
            	    kw=(Token)match(input,58,FOLLOW_58_in_ruleTypeRelation8610); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getTypeRelationAccess().getGreaterThanSignKeyword_3()); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4087:2: kw= '!'
            	    {
            	    kw=(Token)match(input,40,FOLLOW_40_in_ruleTypeRelation8629); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getTypeRelationAccess().getExclamationMarkKeyword_4()); 
            	          
            	    }

            	    }
            	    break;
            	case 6 :
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4094:2: kw= '-'
            	    {
            	    kw=(Token)match(input,59,FOLLOW_59_in_ruleTypeRelation8648); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getTypeRelationAccess().getHyphenMinusKeyword_5()); 
            	          
            	    }

            	    }
            	    break;
            	case 7 :
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4101:5: this_Colon_6= ruleColon
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getTypeRelationAccess().getColonParserRuleCall_6()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleColon_in_ruleTypeRelation8676);
            	    this_Colon_6=ruleColon();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Colon_6);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;
            	case 8 :
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4113:2: kw= '~'
            	    {
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleTypeRelation8700); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getTypeRelationAccess().getTildeKeyword_7()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeRelation"


    // $ANTLR start "entryRuleTypeJudgmentSymbol"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4126:1: entryRuleTypeJudgmentSymbol returns [String current=null] : iv_ruleTypeJudgmentSymbol= ruleTypeJudgmentSymbol EOF ;
    public final String entryRuleTypeJudgmentSymbol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeJudgmentSymbol = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4127:2: (iv_ruleTypeJudgmentSymbol= ruleTypeJudgmentSymbol EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4128:2: iv_ruleTypeJudgmentSymbol= ruleTypeJudgmentSymbol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeJudgmentSymbolRule()); 
            }
            pushFollow(FOLLOW_ruleTypeJudgmentSymbol_in_entryRuleTypeJudgmentSymbol8742);
            iv_ruleTypeJudgmentSymbol=ruleTypeJudgmentSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeJudgmentSymbol.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeJudgmentSymbol8753); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeJudgmentSymbol"


    // $ANTLR start "ruleTypeJudgmentSymbol"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4135:1: ruleTypeJudgmentSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Alternative_0= ruleAlternative )+ this_TypeRelation_1= ruleTypeRelation ) ;
    public final AntlrDatatypeRuleToken ruleTypeJudgmentSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Alternative_0 = null;

        AntlrDatatypeRuleToken this_TypeRelation_1 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4138:28: ( ( (this_Alternative_0= ruleAlternative )+ this_TypeRelation_1= ruleTypeRelation ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4139:1: ( (this_Alternative_0= ruleAlternative )+ this_TypeRelation_1= ruleTypeRelation )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4139:1: ( (this_Alternative_0= ruleAlternative )+ this_TypeRelation_1= ruleTypeRelation )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4139:2: (this_Alternative_0= ruleAlternative )+ this_TypeRelation_1= ruleTypeRelation
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4139:2: (this_Alternative_0= ruleAlternative )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==54) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4140:5: this_Alternative_0= ruleAlternative
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getTypeJudgmentSymbolAccess().getAlternativeParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleAlternative_in_ruleTypeJudgmentSymbol8801);
            	    this_Alternative_0=ruleAlternative();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Alternative_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypeJudgmentSymbolAccess().getTypeRelationParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleTypeRelation_in_ruleTypeJudgmentSymbol8830);
            this_TypeRelation_1=ruleTypeRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_TypeRelation_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeJudgmentSymbol"


    // $ANTLR start "entryRuleAssignOp"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4169:1: entryRuleAssignOp returns [String current=null] : iv_ruleAssignOp= ruleAssignOp EOF ;
    public final String entryRuleAssignOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAssignOp = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4170:2: (iv_ruleAssignOp= ruleAssignOp EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4171:2: iv_ruleAssignOp= ruleAssignOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignOpRule()); 
            }
            pushFollow(FOLLOW_ruleAssignOp_in_entryRuleAssignOp8876);
            iv_ruleAssignOp=ruleAssignOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignOp8887); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignOp"


    // $ANTLR start "ruleAssignOp"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4178:1: ruleAssignOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleAssignOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4181:28: (kw= ':=' )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4183:2: kw= ':='
            {
            kw=(Token)match(input,61,FOLLOW_61_in_ruleAssignOp8924); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getAssignOpAccess().getColonEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssignOp"


    // $ANTLR start "entryRuleEqualsOp"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4196:1: entryRuleEqualsOp returns [String current=null] : iv_ruleEqualsOp= ruleEqualsOp EOF ;
    public final String entryRuleEqualsOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqualsOp = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4197:2: (iv_ruleEqualsOp= ruleEqualsOp EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4198:2: iv_ruleEqualsOp= ruleEqualsOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsOpRule()); 
            }
            pushFollow(FOLLOW_ruleEqualsOp_in_entryRuleEqualsOp8964);
            iv_ruleEqualsOp=ruleEqualsOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualsOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualsOp8975); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEqualsOp"


    // $ANTLR start "ruleEqualsOp"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4205:1: ruleEqualsOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleEqualsOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4208:28: (kw= '=' )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4210:2: kw= '='
            {
            kw=(Token)match(input,62,FOLLOW_62_in_ruleEqualsOp9012); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getEqualsOpAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEqualsOp"


    // $ANTLR start "entryRulePlusOp"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4223:1: entryRulePlusOp returns [String current=null] : iv_rulePlusOp= rulePlusOp EOF ;
    public final String entryRulePlusOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusOp = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4224:2: (iv_rulePlusOp= rulePlusOp EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4225:2: iv_rulePlusOp= rulePlusOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusOpRule()); 
            }
            pushFollow(FOLLOW_rulePlusOp_in_entryRulePlusOp9052);
            iv_rulePlusOp=rulePlusOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOp9063); if (state.failed) return current;

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
    // $ANTLR end "entryRulePlusOp"


    // $ANTLR start "rulePlusOp"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4232:1: rulePlusOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+' ;
    public final AntlrDatatypeRuleToken rulePlusOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4235:28: (kw= '+' )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4237:2: kw= '+'
            {
            kw=(Token)match(input,63,FOLLOW_63_in_rulePlusOp9100); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPlusOpAccess().getPlusSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePlusOp"


    // $ANTLR start "entryRuleMinusOp"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4250:1: entryRuleMinusOp returns [String current=null] : iv_ruleMinusOp= ruleMinusOp EOF ;
    public final String entryRuleMinusOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMinusOp = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4251:2: (iv_ruleMinusOp= ruleMinusOp EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4252:2: iv_ruleMinusOp= ruleMinusOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinusOpRule()); 
            }
            pushFollow(FOLLOW_ruleMinusOp_in_entryRuleMinusOp9140);
            iv_ruleMinusOp=ruleMinusOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinusOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinusOp9151); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMinusOp"


    // $ANTLR start "ruleMinusOp"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4259:1: ruleMinusOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken ruleMinusOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4262:28: (kw= '-' )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4264:2: kw= '-'
            {
            kw=(Token)match(input,59,FOLLOW_59_in_ruleMinusOp9188); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getMinusOpAccess().getHyphenMinusKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMinusOp"


    // $ANTLR start "entryRuleNotEqualsOp"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4277:1: entryRuleNotEqualsOp returns [String current=null] : iv_ruleNotEqualsOp= ruleNotEqualsOp EOF ;
    public final String entryRuleNotEqualsOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNotEqualsOp = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4278:2: (iv_ruleNotEqualsOp= ruleNotEqualsOp EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4279:2: iv_ruleNotEqualsOp= ruleNotEqualsOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotEqualsOpRule()); 
            }
            pushFollow(FOLLOW_ruleNotEqualsOp_in_entryRuleNotEqualsOp9228);
            iv_ruleNotEqualsOp=ruleNotEqualsOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotEqualsOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqualsOp9239); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotEqualsOp"


    // $ANTLR start "ruleNotEqualsOp"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4286:1: ruleNotEqualsOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '!=' ;
    public final AntlrDatatypeRuleToken ruleNotEqualsOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4289:28: (kw= '!=' )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4291:2: kw= '!='
            {
            kw=(Token)match(input,64,FOLLOW_64_in_ruleNotEqualsOp9276); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getNotEqualsOpAccess().getExclamationMarkEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNotEqualsOp"


    // $ANTLR start "entryRuleComma"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4304:1: entryRuleComma returns [String current=null] : iv_ruleComma= ruleComma EOF ;
    public final String entryRuleComma() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComma = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4305:2: (iv_ruleComma= ruleComma EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4306:2: iv_ruleComma= ruleComma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommaRule()); 
            }
            pushFollow(FOLLOW_ruleComma_in_entryRuleComma9316);
            iv_ruleComma=ruleComma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComma.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComma9327); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComma"


    // $ANTLR start "ruleComma"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4313:1: ruleComma returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ',' ;
    public final AntlrDatatypeRuleToken ruleComma() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4316:28: (kw= ',' )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4318:2: kw= ','
            {
            kw=(Token)match(input,45,FOLLOW_45_in_ruleComma9364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getCommaAccess().getCommaKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleComma"


    // $ANTLR start "entryRuleListComposition"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4331:1: entryRuleListComposition returns [String current=null] : iv_ruleListComposition= ruleListComposition EOF ;
    public final String entryRuleListComposition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleListComposition = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4332:2: (iv_ruleListComposition= ruleListComposition EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4333:2: iv_ruleListComposition= ruleListComposition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListCompositionRule()); 
            }
            pushFollow(FOLLOW_ruleListComposition_in_entryRuleListComposition9404);
            iv_ruleListComposition=ruleListComposition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListComposition.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleListComposition9415); if (state.failed) return current;

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
    // $ANTLR end "entryRuleListComposition"


    // $ANTLR start "ruleListComposition"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4340:1: ruleListComposition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Colon_0= ruleColon this_Colon_1= ruleColon ) ;
    public final AntlrDatatypeRuleToken ruleListComposition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Colon_0 = null;

        AntlrDatatypeRuleToken this_Colon_1 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4343:28: ( (this_Colon_0= ruleColon this_Colon_1= ruleColon ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4344:1: (this_Colon_0= ruleColon this_Colon_1= ruleColon )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4344:1: (this_Colon_0= ruleColon this_Colon_1= ruleColon )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4345:5: this_Colon_0= ruleColon this_Colon_1= ruleColon
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getListCompositionAccess().getColonParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleColon_in_ruleListComposition9462);
            this_Colon_0=ruleColon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Colon_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getListCompositionAccess().getColonParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleColon_in_ruleListComposition9489);
            this_Colon_1=ruleColon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Colon_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleListComposition"


    // $ANTLR start "entryRuleColon"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4374:1: entryRuleColon returns [String current=null] : iv_ruleColon= ruleColon EOF ;
    public final String entryRuleColon() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColon = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4375:2: (iv_ruleColon= ruleColon EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4376:2: iv_ruleColon= ruleColon EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColonRule()); 
            }
            pushFollow(FOLLOW_ruleColon_in_entryRuleColon9535);
            iv_ruleColon=ruleColon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColon.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColon9546); if (state.failed) return current;

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
    // $ANTLR end "entryRuleColon"


    // $ANTLR start "ruleColon"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4383:1: ruleColon returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':' ;
    public final AntlrDatatypeRuleToken ruleColon() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4386:28: (kw= ':' )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4388:2: kw= ':'
            {
            kw=(Token)match(input,65,FOLLOW_65_in_ruleColon9583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getColonAccess().getColonKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleColon"


    // $ANTLR start "entryRuleEnvironmentComposition"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4401:1: entryRuleEnvironmentComposition returns [String current=null] : iv_ruleEnvironmentComposition= ruleEnvironmentComposition EOF ;
    public final String entryRuleEnvironmentComposition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnvironmentComposition = null;


        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4402:2: (iv_ruleEnvironmentComposition= ruleEnvironmentComposition EOF )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4403:2: iv_ruleEnvironmentComposition= ruleEnvironmentComposition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvironmentCompositionRule()); 
            }
            pushFollow(FOLLOW_ruleEnvironmentComposition_in_entryRuleEnvironmentComposition9623);
            iv_ruleEnvironmentComposition=ruleEnvironmentComposition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvironmentComposition.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnvironmentComposition9634); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnvironmentComposition"


    // $ANTLR start "ruleEnvironmentComposition"
    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4410:1: ruleEnvironmentComposition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Comma_0= ruleComma | this_ListComposition_1= ruleListComposition ) ;
    public final AntlrDatatypeRuleToken ruleEnvironmentComposition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Comma_0 = null;

        AntlrDatatypeRuleToken this_ListComposition_1 = null;


         enterRule(); 
            
        try {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4413:28: ( (this_Comma_0= ruleComma | this_ListComposition_1= ruleListComposition ) )
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4414:1: (this_Comma_0= ruleComma | this_ListComposition_1= ruleListComposition )
            {
            // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4414:1: (this_Comma_0= ruleComma | this_ListComposition_1= ruleListComposition )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==45) ) {
                alt42=1;
            }
            else if ( (LA42_0==65) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4415:5: this_Comma_0= ruleComma
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnvironmentCompositionAccess().getCommaParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComma_in_ruleEnvironmentComposition9681);
                    this_Comma_0=ruleComma();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Comma_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:4427:5: this_ListComposition_1= ruleListComposition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnvironmentCompositionAccess().getListCompositionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleListComposition_in_ruleEnvironmentComposition9714);
                    this_ListComposition_1=ruleListComposition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ListComposition_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEnvironmentComposition"

    // $ANTLR start synpred6_InternalTypeSystem
    public final void synpred6_InternalTypeSystem_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        Token lv_success_8_0=null;

        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:305:4: ( ({...}? => ( ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) ) ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:305:4: ({...}? => ( ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) ) ) )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:305:4: ({...}? => ( ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:306:5: {...}? => ( ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred6_InternalTypeSystem", "getUnorderedGroupHelper().canSelect(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 0)");
        }
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:306:116: ( ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:307:6: ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 0);
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:310:6: ({...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:310:7: {...}? => (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred6_InternalTypeSystem", "true");
        }
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:310:16: (otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:310:18: otherlv_6= 'success' ruleEqualsOp ( (lv_success_8_0= RULE_STRING ) )
        {
        otherlv_6=(Token)match(input,17,FOLLOW_17_in_synpred6_InternalTypeSystem532); if (state.failed) return ;
        pushFollow(FOLLOW_ruleEqualsOp_in_synpred6_InternalTypeSystem551);
        ruleEqualsOp();

        state._fsp--;
        if (state.failed) return ;
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:325:1: ( (lv_success_8_0= RULE_STRING ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:326:1: (lv_success_8_0= RULE_STRING )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:326:1: (lv_success_8_0= RULE_STRING )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:327:3: lv_success_8_0= RULE_STRING
        {
        lv_success_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred6_InternalTypeSystem567); if (state.failed) return ;

        }


        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalTypeSystem

    // $ANTLR start synpred7_InternalTypeSystem
    public final void synpred7_InternalTypeSystem_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        Token lv_fail_11_0=null;

        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:350:4: ( ({...}? => ( ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) ) ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:350:4: ({...}? => ( ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) ) ) )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:350:4: ({...}? => ( ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:351:5: {...}? => ( ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred7_InternalTypeSystem", "getUnorderedGroupHelper().canSelect(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 1)");
        }
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:351:116: ( ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:352:6: ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 1);
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:355:6: ({...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:355:7: {...}? => (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred7_InternalTypeSystem", "true");
        }
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:355:16: (otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:355:18: otherlv_9= 'fail' ruleEqualsOp ( (lv_fail_11_0= RULE_STRING ) )
        {
        otherlv_9=(Token)match(input,18,FOLLOW_18_in_synpred7_InternalTypeSystem640); if (state.failed) return ;
        pushFollow(FOLLOW_ruleEqualsOp_in_synpred7_InternalTypeSystem659);
        ruleEqualsOp();

        state._fsp--;
        if (state.failed) return ;
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:370:1: ( (lv_fail_11_0= RULE_STRING ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:371:1: (lv_fail_11_0= RULE_STRING )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:371:1: (lv_fail_11_0= RULE_STRING )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:372:3: lv_fail_11_0= RULE_STRING
        {
        lv_fail_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred7_InternalTypeSystem675); if (state.failed) return ;

        }


        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalTypeSystem

    // $ANTLR start synpred8_InternalTypeSystem
    public final void synpred8_InternalTypeSystem_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        Token lv_nomatch_14_0=null;

        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:395:4: ( ({...}? => ( ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) ) ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:395:4: ({...}? => ( ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) ) ) )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:395:4: ({...}? => ( ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:396:5: {...}? => ( ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred8_InternalTypeSystem", "getUnorderedGroupHelper().canSelect(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 2)");
        }
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:396:116: ( ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:397:6: ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 2);
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:400:6: ({...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:400:7: {...}? => (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred8_InternalTypeSystem", "true");
        }
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:400:16: (otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:400:18: otherlv_12= 'nomatch' ruleEqualsOp ( (lv_nomatch_14_0= RULE_STRING ) )
        {
        otherlv_12=(Token)match(input,19,FOLLOW_19_in_synpred8_InternalTypeSystem748); if (state.failed) return ;
        pushFollow(FOLLOW_ruleEqualsOp_in_synpred8_InternalTypeSystem767);
        ruleEqualsOp();

        state._fsp--;
        if (state.failed) return ;
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:415:1: ( (lv_nomatch_14_0= RULE_STRING ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:416:1: (lv_nomatch_14_0= RULE_STRING )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:416:1: (lv_nomatch_14_0= RULE_STRING )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:417:3: lv_nomatch_14_0= RULE_STRING
        {
        lv_nomatch_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred8_InternalTypeSystem783); if (state.failed) return ;

        }


        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalTypeSystem

    // $ANTLR start synpred9_InternalTypeSystem
    public final void synpred9_InternalTypeSystem_fragment() throws RecognitionException {   
        Token lv_binary_15_0=null;

        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:440:4: ( ({...}? => ( ({...}? => ( (lv_binary_15_0= 'binary' ) ) ) ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:440:4: ({...}? => ( ({...}? => ( (lv_binary_15_0= 'binary' ) ) ) ) )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:440:4: ({...}? => ( ({...}? => ( (lv_binary_15_0= 'binary' ) ) ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:441:5: {...}? => ( ({...}? => ( (lv_binary_15_0= 'binary' ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred9_InternalTypeSystem", "getUnorderedGroupHelper().canSelect(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 3)");
        }
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:441:116: ( ({...}? => ( (lv_binary_15_0= 'binary' ) ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:442:6: ({...}? => ( (lv_binary_15_0= 'binary' ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getJudgmentDescriptionAccess().getUnorderedGroup_5(), 3);
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:445:6: ({...}? => ( (lv_binary_15_0= 'binary' ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:445:7: {...}? => ( (lv_binary_15_0= 'binary' ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred9_InternalTypeSystem", "true");
        }
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:445:16: ( (lv_binary_15_0= 'binary' ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:446:1: (lv_binary_15_0= 'binary' )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:446:1: (lv_binary_15_0= 'binary' )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:447:3: lv_binary_15_0= 'binary'
        {
        lv_binary_15_0=(Token)match(input,20,FOLLOW_20_in_synpred9_InternalTypeSystem861); if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalTypeSystem

    // $ANTLR start synpred13_InternalTypeSystem
    public final void synpred13_InternalTypeSystem_fragment() throws RecognitionException {   
        EObject this_VariableDeclarationWithType_1 = null;


        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:706:2: (this_VariableDeclarationWithType_1= ruleVariableDeclarationWithType )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:706:2: this_VariableDeclarationWithType_1= ruleVariableDeclarationWithType
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleVariableDeclarationWithType_in_synpred13_InternalTypeSystem1467);
        this_VariableDeclarationWithType_1=ruleVariableDeclarationWithType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalTypeSystem

    // $ANTLR start synpred14_InternalTypeSystem
    public final void synpred14_InternalTypeSystem_fragment() throws RecognitionException {   
        EObject this_OrTypingJudgment_2 = null;


        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:719:2: (this_OrTypingJudgment_2= ruleOrTypingJudgment )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:719:2: this_OrTypingJudgment_2= ruleOrTypingJudgment
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleOrTypingJudgment_in_synpred14_InternalTypeSystem1497);
        this_OrTypingJudgment_2=ruleOrTypingJudgment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalTypeSystem

    // $ANTLR start synpred15_InternalTypeSystem
    public final void synpred15_InternalTypeSystem_fragment() throws RecognitionException {   
        EObject this_StandardOperation_3 = null;


        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:732:2: (this_StandardOperation_3= ruleStandardOperation )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:732:2: this_StandardOperation_3= ruleStandardOperation
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleStandardOperation_in_synpred15_InternalTypeSystem1527);
        this_StandardOperation_3=ruleStandardOperation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalTypeSystem

    // $ANTLR start synpred19_InternalTypeSystem
    public final void synpred19_InternalTypeSystem_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_op_3_0 = null;

        EObject lv_right_4_0 = null;


        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:952:3: ( ( (lv_op_3_0= ruleAssignOp ) ) ( (lv_right_4_0= ruleExpression ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:952:3: ( (lv_op_3_0= ruleAssignOp ) ) ( (lv_right_4_0= ruleExpression ) )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:952:3: ( (lv_op_3_0= ruleAssignOp ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:953:1: (lv_op_3_0= ruleAssignOp )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:953:1: (lv_op_3_0= ruleAssignOp )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:954:3: lv_op_3_0= ruleAssignOp
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getVariableDeclarationWithTypeAccess().getOpAssignOpParserRuleCall_3_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleAssignOp_in_synpred19_InternalTypeSystem1977);
        lv_op_3_0=ruleAssignOp();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:970:2: ( (lv_right_4_0= ruleExpression ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:971:1: (lv_right_4_0= ruleExpression )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:971:1: (lv_right_4_0= ruleExpression )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:972:3: lv_right_4_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getVariableDeclarationWithTypeAccess().getRightExpressionParserRuleCall_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred19_InternalTypeSystem1998);
        lv_right_4_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19_InternalTypeSystem

    // $ANTLR start synpred32_InternalTypeSystem
    public final void synpred32_InternalTypeSystem_fragment() throws RecognitionException {   
        EObject this_ListOperation_1 = null;


        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1648:2: (this_ListOperation_1= ruleListOperation )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1648:2: this_ListOperation_1= ruleListOperation
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleListOperation_in_synpred32_InternalTypeSystem3535);
        this_ListOperation_1=ruleListOperation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalTypeSystem

    // $ANTLR start synpred33_InternalTypeSystem
    public final void synpred33_InternalTypeSystem_fragment() throws RecognitionException {   
        EObject this_Assignment_2 = null;


        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1661:2: (this_Assignment_2= ruleAssignment )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1661:2: this_Assignment_2= ruleAssignment
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleAssignment_in_synpred33_InternalTypeSystem3565);
        this_Assignment_2=ruleAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalTypeSystem

    // $ANTLR start synpred34_InternalTypeSystem
    public final void synpred34_InternalTypeSystem_fragment() throws RecognitionException {   
        EObject this_Equals_3 = null;


        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1674:2: (this_Equals_3= ruleEquals )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1674:2: this_Equals_3= ruleEquals
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleEquals_in_synpred34_InternalTypeSystem3595);
        this_Equals_3=ruleEquals();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalTypeSystem

    // $ANTLR start synpred38_InternalTypeSystem
    public final void synpred38_InternalTypeSystem_fragment() throws RecognitionException {   
        EObject lv_left_1_0 = null;

        EObject lv_right_4_0 = null;


        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1945:2: ( ( () ( (lv_left_1_0= ruleExpression ) ) rulePlusOp ruleEqualsOp ( (lv_right_4_0= ruleExpression ) ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1945:2: ( () ( (lv_left_1_0= ruleExpression ) ) rulePlusOp ruleEqualsOp ( (lv_right_4_0= ruleExpression ) ) )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1945:2: ( () ( (lv_left_1_0= ruleExpression ) ) rulePlusOp ruleEqualsOp ( (lv_right_4_0= ruleExpression ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1945:3: () ( (lv_left_1_0= ruleExpression ) ) rulePlusOp ruleEqualsOp ( (lv_right_4_0= ruleExpression ) )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1945:3: ()
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1946:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1954:2: ( (lv_left_1_0= ruleExpression ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1955:1: (lv_left_1_0= ruleExpression )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1955:1: (lv_left_1_0= ruleExpression )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1956:3: lv_left_1_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getListOperationAccess().getLeftExpressionParserRuleCall_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred38_InternalTypeSystem4100);
        lv_left_1_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_rulePlusOp_in_synpred38_InternalTypeSystem4119);
        rulePlusOp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_ruleEqualsOp_in_synpred38_InternalTypeSystem4137);
        ruleEqualsOp();

        state._fsp--;
        if (state.failed) return ;
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1994:1: ( (lv_right_4_0= ruleExpression ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1995:1: (lv_right_4_0= ruleExpression )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1995:1: (lv_right_4_0= ruleExpression )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:1996:3: lv_right_4_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getListOperationAccess().getRightExpressionParserRuleCall_0_4_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred38_InternalTypeSystem4157);
        lv_right_4_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred38_InternalTypeSystem

    // $ANTLR start synpred43_InternalTypeSystem
    public final void synpred43_InternalTypeSystem_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2525:2: ( () ( (lv_op_2_0= rulePlusOp ) ) ( (lv_right_3_0= ruleFailureError ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2525:2: () ( (lv_op_2_0= rulePlusOp ) ) ( (lv_right_3_0= ruleFailureError ) )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2525:2: ()
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2526:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2534:2: ( (lv_op_2_0= rulePlusOp ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2535:1: (lv_op_2_0= rulePlusOp )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2535:1: (lv_op_2_0= rulePlusOp )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2536:3: lv_op_2_0= rulePlusOp
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getFailureErrorAccess().getOpPlusOpParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_rulePlusOp_in_synpred43_InternalTypeSystem5186);
        lv_op_2_0=rulePlusOp();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2552:2: ( (lv_right_3_0= ruleFailureError ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2553:1: (lv_right_3_0= ruleFailureError )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2553:1: (lv_right_3_0= ruleFailureError )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2554:3: lv_right_3_0= ruleFailureError
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getFailureErrorAccess().getRightFailureErrorParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleFailureError_in_synpred43_InternalTypeSystem5207);
        lv_right_3_0=ruleFailureError();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred43_InternalTypeSystem

    // $ANTLR start synpred44_InternalTypeSystem
    public final void synpred44_InternalTypeSystem_fragment() throws RecognitionException {   
        Token lv_errString_1_0=null;

        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2591:2: ( ( () ( (lv_errString_1_0= RULE_STRING ) ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2591:2: ( () ( (lv_errString_1_0= RULE_STRING ) ) )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2591:2: ( () ( (lv_errString_1_0= RULE_STRING ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2591:3: () ( (lv_errString_1_0= RULE_STRING ) )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2591:3: ()
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2592:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2600:2: ( (lv_errString_1_0= RULE_STRING ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2601:1: (lv_errString_1_0= RULE_STRING )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2601:1: (lv_errString_1_0= RULE_STRING )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2602:3: lv_errString_1_0= RULE_STRING
        {
        lv_errString_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred44_InternalTypeSystem5310); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred44_InternalTypeSystem

    // $ANTLR start synpred45_InternalTypeSystem
    public final void synpred45_InternalTypeSystem_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_subEnvironment_3_0 = null;


        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2787:2: ( () ( (lv_op_2_0= ruleEnvironmentComposition ) ) ( (lv_subEnvironment_3_0= ruleEnvironment ) ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2787:2: () ( (lv_op_2_0= ruleEnvironmentComposition ) ) ( (lv_subEnvironment_3_0= ruleEnvironment ) )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2787:2: ()
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2788:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2796:2: ( (lv_op_2_0= ruleEnvironmentComposition ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2797:1: (lv_op_2_0= ruleEnvironmentComposition )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2797:1: (lv_op_2_0= ruleEnvironmentComposition )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2798:3: lv_op_2_0= ruleEnvironmentComposition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getEnvironmentAccess().getOpEnvironmentCompositionParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEnvironmentComposition_in_synpred45_InternalTypeSystem5713);
        lv_op_2_0=ruleEnvironmentComposition();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2814:2: ( (lv_subEnvironment_3_0= ruleEnvironment ) )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2815:1: (lv_subEnvironment_3_0= ruleEnvironment )
        {
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2815:1: (lv_subEnvironment_3_0= ruleEnvironment )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:2816:3: lv_subEnvironment_3_0= ruleEnvironment
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getEnvironmentAccess().getSubEnvironmentEnvironmentParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEnvironment_in_synpred45_InternalTypeSystem5734);
        lv_subEnvironment_3_0=ruleEnvironment();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred45_InternalTypeSystem

    // $ANTLR start synpred62_InternalTypeSystem
    public final void synpred62_InternalTypeSystem_fragment() throws RecognitionException {   
        EObject this_IntegerConstant_0 = null;


        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3910:2: (this_IntegerConstant_0= ruleIntegerConstant )
        // ../it.xtypes/src-gen/it/xtypes/parser/antlr/internal/InternalTypeSystem.g:3910:2: this_IntegerConstant_0= ruleIntegerConstant
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleIntegerConstant_in_synpred62_InternalTypeSystem8111);
        this_IntegerConstant_0=ruleIntegerConstant();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalTypeSystem

    // Delegated rules

    public final boolean synpred33_InternalTypeSystem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalTypeSystem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalTypeSystem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalTypeSystem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalTypeSystem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalTypeSystem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalTypeSystem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalTypeSystem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalTypeSystem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalTypeSystem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_InternalTypeSystem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalTypeSystem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalTypeSystem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalTypeSystem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalTypeSystem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalTypeSystem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalTypeSystem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalTypeSystem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalTypeSystem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalTypeSystem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalTypeSystem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalTypeSystem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalTypeSystem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalTypeSystem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalTypeSystem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalTypeSystem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalTypeSystem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalTypeSystem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalTypeSystem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalTypeSystem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalTypeSystem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalTypeSystem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA9_eotS =
        "\27\uffff";
    static final String DFA9_eofS =
        "\27\uffff";
    static final String DFA9_minS =
        "\1\4\4\uffff\15\0\5\uffff";
    static final String DFA9_maxS =
        "\1\65\4\uffff\15\0\5\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\20\uffff\1\4\1\uffff\1\5\1\2\1\3";
    static final String DFA9_specialS =
        "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\5\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\7\1\17\1\20\12\uffff\2\22\6\uffff\1\6\1\uffff\1\5\6\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\2\1\1\uffff\1\24\1\10\1\uffff\1\11"+
            "\1\12\1\13\1\14\1\15\1\16\1\uffff\1\21",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "692:1: (this_Quantification_0= ruleQuantification | this_VariableDeclarationWithType_1= ruleVariableDeclarationWithType | this_OrTypingJudgment_2= ruleOrTypingJudgment | this_StandardOperation_3= ruleStandardOperation | this_TypingJudgmentWithEnvironment_4= ruleTypingJudgmentWithEnvironment )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalTypeSystem()) ) {s = 21;}

                        else if ( (synpred15_InternalTypeSystem()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalTypeSystem()) ) {s = 22;}

                        else if ( (synpred15_InternalTypeSystem()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalTypeSystem()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index9_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_8 = input.LA(1);

                         
                        int index9_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalTypeSystem()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index9_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_9 = input.LA(1);

                         
                        int index9_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalTypeSystem()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index9_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_10 = input.LA(1);

                         
                        int index9_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalTypeSystem()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index9_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_11 = input.LA(1);

                         
                        int index9_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalTypeSystem()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index9_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA9_12 = input.LA(1);

                         
                        int index9_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalTypeSystem()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index9_12);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA9_13 = input.LA(1);

                         
                        int index9_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalTypeSystem()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index9_13);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA9_14 = input.LA(1);

                         
                        int index9_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalTypeSystem()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index9_14);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA9_15 = input.LA(1);

                         
                        int index9_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalTypeSystem()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index9_15);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA9_16 = input.LA(1);

                         
                        int index9_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalTypeSystem()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index9_16);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA9_17 = input.LA(1);

                         
                        int index9_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalTypeSystem()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index9_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA13_eotS =
        "\55\uffff";
    static final String DFA13_eofS =
        "\1\2\54\uffff";
    static final String DFA13_minS =
        "\1\4\1\0\53\uffff";
    static final String DFA13_maxS =
        "\1\101\1\0\53\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\51\uffff\1\1";
    static final String DFA13_specialS =
        "\1\uffff\1\0\53\uffff}>";
    static final String[] DFA13_transitionS = {
            "\3\2\12\uffff\2\2\2\uffff\2\2\1\uffff\4\2\2\uffff\1\2\3\uffff"+
            "\5\2\1\uffff\14\2\1\uffff\10\2\1\1\4\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "952:2: ( ( (lv_op_3_0= ruleAssignOp ) ) ( (lv_right_4_0= ruleExpression ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_1 = input.LA(1);

                         
                        int index13_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalTypeSystem()) ) {s = 44;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index13_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA22_eotS =
        "\23\uffff";
    static final String DFA22_eofS =
        "\23\uffff";
    static final String DFA22_minS =
        "\1\4\1\uffff\14\0\5\uffff";
    static final String DFA22_maxS =
        "\1\65\1\uffff\14\0\5\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\14\uffff\1\5\1\6\1\2\1\3\1\4";
    static final String DFA22_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\5"+
        "\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\1\13\1\14\12\uffff\1\17\1\16\6\uffff\1\7\1\uffff\1\2\20"+
            "\uffff\1\3\1\uffff\1\4\1\5\1\6\1\10\1\11\1\12\1\uffff\1\15",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1634:1: (this_EnvironmentOperation_0= ruleEnvironmentOperation | this_ListOperation_1= ruleListOperation | this_Assignment_2= ruleAssignment | this_Equals_3= ruleEquals | this_Fail_4= ruleFail | this_Success_5= ruleSuccess )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_2 = input.LA(1);

                         
                        int index22_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalTypeSystem()) ) {s = 16;}

                        else if ( (synpred33_InternalTypeSystem()) ) {s = 17;}

                        else if ( (synpred34_InternalTypeSystem()) ) {s = 18;}

                         
                        input.seek(index22_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_3 = input.LA(1);

                         
                        int index22_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalTypeSystem()) ) {s = 16;}

                        else if ( (synpred33_InternalTypeSystem()) ) {s = 17;}

                        else if ( (synpred34_InternalTypeSystem()) ) {s = 18;}

                         
                        input.seek(index22_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_4 = input.LA(1);

                         
                        int index22_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalTypeSystem()) ) {s = 16;}

                        else if ( (synpred33_InternalTypeSystem()) ) {s = 17;}

                        else if ( (synpred34_InternalTypeSystem()) ) {s = 18;}

                         
                        input.seek(index22_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_5 = input.LA(1);

                         
                        int index22_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalTypeSystem()) ) {s = 16;}

                        else if ( (synpred33_InternalTypeSystem()) ) {s = 17;}

                        else if ( (synpred34_InternalTypeSystem()) ) {s = 18;}

                         
                        input.seek(index22_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_6 = input.LA(1);

                         
                        int index22_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalTypeSystem()) ) {s = 16;}

                        else if ( (synpred33_InternalTypeSystem()) ) {s = 17;}

                        else if ( (synpred34_InternalTypeSystem()) ) {s = 18;}

                         
                        input.seek(index22_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_7 = input.LA(1);

                         
                        int index22_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalTypeSystem()) ) {s = 16;}

                        else if ( (synpred33_InternalTypeSystem()) ) {s = 17;}

                        else if ( (synpred34_InternalTypeSystem()) ) {s = 18;}

                         
                        input.seek(index22_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_8 = input.LA(1);

                         
                        int index22_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalTypeSystem()) ) {s = 16;}

                        else if ( (synpred33_InternalTypeSystem()) ) {s = 17;}

                        else if ( (synpred34_InternalTypeSystem()) ) {s = 18;}

                         
                        input.seek(index22_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA22_9 = input.LA(1);

                         
                        int index22_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalTypeSystem()) ) {s = 16;}

                        else if ( (synpred33_InternalTypeSystem()) ) {s = 17;}

                        else if ( (synpred34_InternalTypeSystem()) ) {s = 18;}

                         
                        input.seek(index22_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA22_10 = input.LA(1);

                         
                        int index22_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalTypeSystem()) ) {s = 16;}

                        else if ( (synpred33_InternalTypeSystem()) ) {s = 17;}

                        else if ( (synpred34_InternalTypeSystem()) ) {s = 18;}

                         
                        input.seek(index22_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA22_11 = input.LA(1);

                         
                        int index22_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalTypeSystem()) ) {s = 16;}

                        else if ( (synpred33_InternalTypeSystem()) ) {s = 17;}

                        else if ( (synpred34_InternalTypeSystem()) ) {s = 18;}

                         
                        input.seek(index22_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA22_12 = input.LA(1);

                         
                        int index22_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalTypeSystem()) ) {s = 16;}

                        else if ( (synpred33_InternalTypeSystem()) ) {s = 17;}

                        else if ( (synpred34_InternalTypeSystem()) ) {s = 18;}

                         
                        input.seek(index22_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA22_13 = input.LA(1);

                         
                        int index22_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalTypeSystem()) ) {s = 16;}

                        else if ( (synpred33_InternalTypeSystem()) ) {s = 17;}

                        else if ( (synpred34_InternalTypeSystem()) ) {s = 18;}

                         
                        input.seek(index22_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA24_eotS =
        "\17\uffff";
    static final String DFA24_eofS =
        "\17\uffff";
    static final String DFA24_minS =
        "\1\5\14\0\2\uffff";
    static final String DFA24_maxS =
        "\1\65\14\0\2\uffff";
    static final String DFA24_acceptS =
        "\15\uffff\1\1\1\2";
    static final String DFA24_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2"+
        "\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\12\1\13\22\uffff\1\6\1\uffff\1\1\20\uffff\1\2\1\uffff\1"+
            "\3\1\4\1\5\1\7\1\10\1\11\1\uffff\1\14",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1945:1: ( ( () ( (lv_left_1_0= ruleExpression ) ) rulePlusOp ruleEqualsOp ( (lv_right_4_0= ruleExpression ) ) ) | ( () ( (lv_left_6_0= ruleExpression ) ) ruleMinusOp ruleEqualsOp ( (lv_right_9_0= ruleExpression ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_1 = input.LA(1);

                         
                        int index24_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalTypeSystem()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_2 = input.LA(1);

                         
                        int index24_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalTypeSystem()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_3 = input.LA(1);

                         
                        int index24_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalTypeSystem()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA24_4 = input.LA(1);

                         
                        int index24_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalTypeSystem()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA24_5 = input.LA(1);

                         
                        int index24_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalTypeSystem()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA24_6 = input.LA(1);

                         
                        int index24_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalTypeSystem()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA24_7 = input.LA(1);

                         
                        int index24_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalTypeSystem()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA24_8 = input.LA(1);

                         
                        int index24_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalTypeSystem()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA24_9 = input.LA(1);

                         
                        int index24_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalTypeSystem()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA24_10 = input.LA(1);

                         
                        int index24_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalTypeSystem()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA24_11 = input.LA(1);

                         
                        int index24_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalTypeSystem()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA24_12 = input.LA(1);

                         
                        int index24_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalTypeSystem()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleTypeSystemDefinition_in_entryRuleTypeSystemDefinition81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeSystemDefinition91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleTypeSystemDefinition129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeSystemDefinition146 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTypeSystemDefinition165 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeSystemDefinition189 = new BitSet(new long[]{0x0000000000606002L});
    public static final BitSet FOLLOW_13_in_ruleTypeSystemDefinition202 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeSystemDefinition219 = new BitSet(new long[]{0x0000000000604002L});
    public static final BitSet FOLLOW_14_in_ruleTypeSystemDefinition239 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJudgmentDescription_in_ruleTypeSystemDefinition260 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_15_in_ruleTypeSystemDefinition273 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleRule_in_ruleTypeSystemDefinition296 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleJudgmentDescription_in_entryRuleJudgmentDescription339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJudgmentDescription349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJudgmentDescription395 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJudgmentDescription417 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleJudgmentDescription434 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleEqualsOp_in_ruleJudgmentDescription453 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJudgmentDescription469 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_17_in_ruleJudgmentDescription532 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleEqualsOp_in_ruleJudgmentDescription551 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJudgmentDescription567 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_18_in_ruleJudgmentDescription640 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleEqualsOp_in_ruleJudgmentDescription659 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJudgmentDescription675 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_19_in_ruleJudgmentDescription748 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleEqualsOp_in_ruleJudgmentDescription767 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJudgmentDescription783 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_20_in_ruleJudgmentDescription861 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAxiom_in_ruleRule1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleWithPremises_in_ruleRule1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAxiom_in_entryRuleAxiom1079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAxiom1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAxiom1126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAxiom1143 = new BitSet(new long[]{0x002FD8000A000070L});
    public static final BitSet FOLLOW_ruleTypingJudgmentWithEnvironment_in_ruleAxiom1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleWithPremises_in_entryRuleRuleWithPremises1205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleWithPremises1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleRuleWithPremises1252 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleWithPremises1269 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRuleWithPremises1286 = new BitSet(new long[]{0x002FD8000A000070L});
    public static final BitSet FOLLOW_ruleTypingJudgmentWithEnvironment_in_ruleRuleWithPremises1307 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleRuleWithPremises1319 = new BitSet(new long[]{0x002FDB440A060070L});
    public static final BitSet FOLLOW_ruleTypingJudgment_in_ruleRuleWithPremises1340 = new BitSet(new long[]{0x002FDB440A060072L});
    public static final BitSet FOLLOW_ruleTypingJudgment_in_entryRuleTypingJudgment1377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypingJudgment1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantification_in_ruleTypingJudgment1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclarationWithType_in_ruleTypingJudgment1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrTypingJudgment_in_ruleTypingJudgment1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardOperation_in_ruleTypingJudgment1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypingJudgmentWithEnvironment_in_ruleTypingJudgment1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrTypingJudgment_in_entryRuleOrTypingJudgment1592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrTypingJudgment1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOrTypingJudgment1639 = new BitSet(new long[]{0x002FDB440A060070L});
    public static final BitSet FOLLOW_ruleOrBranch_in_ruleOrTypingJudgment1660 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_ruleOrSeparator_in_ruleOrTypingJudgment1680 = new BitSet(new long[]{0x002FDB440A060070L});
    public static final BitSet FOLLOW_ruleOrBranch_in_ruleOrTypingJudgment1700 = new BitSet(new long[]{0x00C0000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOrTypingJudgment1714 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleErrorSpecification_in_ruleOrTypingJudgment1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrBranch_in_entryRuleOrBranch1772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrBranch1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypingJudgment_in_ruleOrBranch1827 = new BitSet(new long[]{0x002FDB440A060072L});
    public static final BitSet FOLLOW_ruleVariableDeclarationWithType_in_entryRuleVariableDeclarationWithType1865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclarationWithType1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleVariableDeclarationWithType1912 = new BitSet(new long[]{0x0000000390000010L});
    public static final BitSet FOLLOW_ruleExpressionType_in_ruleVariableDeclarationWithType1933 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclarationWithType1950 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleAssignOp_in_ruleVariableDeclarationWithType1977 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDeclarationWithType1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionType_in_entryRuleExpressionType2036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionType2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_in_ruleExpressionType2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEClassifierType_in_ruleExpressionType2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleExpressionType2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_in_entryRuleCollectionType2191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionType2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleCollectionType2244 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCollectionType2269 = new BitSet(new long[]{0x0000000390000010L});
    public static final BitSet FOLLOW_ruleExpressionType_in_ruleCollectionType2290 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCollectionType2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEClassifierType_in_entryRuleEClassifierType2338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEClassifierType2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEClassifierType2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType2431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleBasicType2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBasicType2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBasicType2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableSimpleDeclaration_in_entryRuleVariableSimpleDeclaration2594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableSimpleDeclaration2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableSimpleDeclaration2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantification_in_entryRuleQuantification2685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantification2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForEach_in_ruleQuantification2746 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleForAll_in_ruleQuantification2776 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleExists_in_ruleQuantification2806 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleErrorSpecification_in_ruleQuantification2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForEach_in_entryRuleForEach2864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForEach2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleForEach2911 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForEach2932 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleForEach2944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableSimpleDeclaration_in_ruleForEach2965 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleForEach2977 = new BitSet(new long[]{0x002FDB440A060070L});
    public static final BitSet FOLLOW_ruleTypingJudgment_in_ruleForEach2998 = new BitSet(new long[]{0x002FDB640A060070L});
    public static final BitSet FOLLOW_37_in_ruleForEach3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForAll_in_entryRuleForAll3047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForAll3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleForAll3094 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableSimpleDeclaration_in_ruleForAll3115 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleForAll3127 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForAll3148 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleForAll3160 = new BitSet(new long[]{0x002FDB440A060070L});
    public static final BitSet FOLLOW_ruleTypingJudgment_in_ruleForAll3181 = new BitSet(new long[]{0x002FDB640A060070L});
    public static final BitSet FOLLOW_37_in_ruleForAll3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExists_in_entryRuleExists3230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExists3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleExists3283 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleExists3309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableSimpleDeclaration_in_ruleExists3330 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleExists3342 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExists3363 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleExists3375 = new BitSet(new long[]{0x002FDB440A060070L});
    public static final BitSet FOLLOW_ruleTypingJudgment_in_ruleExists3396 = new BitSet(new long[]{0x002FDB640A060070L});
    public static final BitSet FOLLOW_37_in_ruleExists3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardOperation_in_entryRuleStandardOperation3445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStandardOperation3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironmentOperation_in_ruleStandardOperation3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListOperation_in_ruleStandardOperation3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleStandardOperation3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquals_in_ruleStandardOperation3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFail_in_ruleStandardOperation3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuccess_in_ruleStandardOperation3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironmentOperation_in_entryRuleEnvironmentOperation3690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnvironmentOperation3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironmentId_in_ruleEnvironmentOperation3759 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ruleAssignOp_in_ruleEnvironmentOperation3778 = new BitSet(new long[]{0x002FD8000A000070L});
    public static final BitSet FOLLOW_ruleEnvironment_in_ruleEnvironmentOperation3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironmentId_in_ruleEnvironmentOperation3839 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rulePlusOp_in_ruleEnvironmentOperation3858 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleEqualsOp_in_ruleEnvironmentOperation3876 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleEnvironmentStatement_in_ruleEnvironmentOperation3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironmentId_in_ruleEnvironmentOperation3937 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ruleMinusOp_in_ruleEnvironmentOperation3956 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleEqualsOp_in_ruleEnvironmentOperation3974 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleTypingStatementExpression_in_ruleEnvironmentOperation3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListOperation_in_entryRuleListOperation4031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListOperation4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleListOperation4100 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rulePlusOp_in_ruleListOperation4119 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleEqualsOp_in_ruleListOperation4137 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleListOperation4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleListOperation4198 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ruleMinusOp_in_ruleListOperation4217 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleEqualsOp_in_ruleListOperation4235 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleListOperation4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment4292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment4348 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ruleAssignOp_in_ruleAssignment4367 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquals_in_entryRuleEquals4423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquals4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEquals4479 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleEqualsOp_in_ruleEquals4502 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleNotEqualsOp_in_ruleEquals4521 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEquals4545 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleErrorSpecification_in_ruleEquals4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFail_in_entryRuleFail4603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFail4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleFail4662 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleErrorSpecification_in_ruleFail4683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuccess_in_entryRuleSuccess4720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuccess4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSuccess4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypingJudgmentWithEnvironment_in_entryRuleTypingJudgmentWithEnvironment4815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypingJudgmentWithEnvironment4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironment_in_ruleTypingJudgmentWithEnvironment4871 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ruleTypeJudgmentSymbol_in_ruleTypingJudgmentWithEnvironment4892 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleTypingStatement_in_ruleTypingJudgmentWithEnvironment4913 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleErrorSpecification_in_ruleTypingJudgmentWithEnvironment4934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleErrorSpecification_in_entryRuleErrorSpecification4971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleErrorSpecification4981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleErrorSpecification5018 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleEqualsOp_in_ruleErrorSpecification5037 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleFailureError_in_ruleErrorSpecification5057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFailureError_in_entryRuleFailureError5093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFailureError5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalError_in_ruleFailureError5153 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_rulePlusOp_in_ruleFailureError5186 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleFailureError_in_ruleFailureError5207 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalError_in_entryRuleTerminalError5245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalError5255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerminalError5310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalError5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypingStatement_in_entryRuleTypingStatement5393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypingStatement5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypingStatementExpression_in_ruleTypingStatement5449 = new BitSet(new long[]{0x7E00010000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRelation_in_ruleTypingStatement5470 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleTypingStatementExpression_in_ruleTypingStatement5491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypingStatementExpression_in_entryRuleTypingStatementExpression5527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypingStatementExpression5537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTypingStatementExpression5586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironment_in_entryRuleEnvironment5620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnvironment5630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalEnvironment_in_ruleEnvironment5680 = new BitSet(new long[]{0x0000200000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironmentComposition_in_ruleEnvironment5713 = new BitSet(new long[]{0x002FD8000A000070L});
    public static final BitSet FOLLOW_ruleEnvironment_in_ruleEnvironment5734 = new BitSet(new long[]{0x0000200000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalEnvironment_in_entryRuleTerminalEnvironment5772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalEnvironment5782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironmentId_in_ruleTerminalEnvironment5832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironmentStatement_in_ruleTerminalEnvironment5862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyEnvironment_in_ruleTerminalEnvironment5892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironmentId_in_entryRuleEnvironmentId5927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnvironmentId5937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnvironmentId5978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironmentStatement_in_entryRuleEnvironmentStatement6018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnvironmentStatement6028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypingStatementExpression_in_ruleEnvironmentStatement6074 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleMappingRelation_in_ruleEnvironmentStatement6095 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleTypingStatementExpression_in_ruleEnvironmentStatement6116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyEnvironment_in_entryRuleEmptyEnvironment6152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyEnvironment6162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEmptyEnvironment6204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclarationWithType_in_ruleExpression6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleExpression6342 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleExpression6354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnvironmentId_in_ruleExpression6375 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleExpression6387 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression6408 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleExpression6420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleExpression6452 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleExpression6464 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression6485 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleExpression6497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleExpression6529 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleExpression6541 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression6562 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleExpression6574 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression6598 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleExpression6610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression6634 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleExpression6646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleExpression6678 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleExpression6690 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression6711 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleExpression6723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleExpression6755 = new BitSet(new long[]{0x0000000390000010L});
    public static final BitSet FOLLOW_ruleExpressionType_in_ruleExpression6776 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleExpression6788 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression6809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleExpression6841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleExpression6873 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleExpression6885 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExpression6902 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleExpression6919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleExpression6951 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleExpression6963 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression6984 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleExpression6996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleExpression7029 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleExpression7059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSubExpression_in_ruleExpression7093 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression7132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression7142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstant_in_ruleTerminalExpression7192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerConstant_in_ruleTerminalExpression7222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAccess_in_ruleTerminalExpression7252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstant_in_entryRuleStringConstant7287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringConstant7297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringConstant7338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerConstant_in_entryRuleIntegerConstant7378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerConstant7388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerConstant7429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAccess_in_entryRuleVariableAccess7469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAccess7479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleVariableAccess7529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedVariable_in_ruleVariableAccess7559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference7594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference7604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleVariableReference7641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference7665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedVariable_in_entryRuleIndexedVariable7701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedVariable7711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleIndexedVariable7748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexedVariable7772 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleIndexedVariable7784 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleArrayIndex_in_ruleIndexedVariable7805 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleIndexedVariable7817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression7853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression7863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubExpression7925 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSubExpression7937 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleArrayIndex_in_ruleSubExpression7958 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSubExpression7970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubExpression8014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayIndex_in_entryRuleArrayIndex8051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayIndex8061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerConstant_in_ruleArrayIndex8111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayIndex8141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_entryRuleAlternative8177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternative8188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAlternative8225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrSeparator_in_entryRuleOrSeparator8265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrSeparator8276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_ruleOrSeparator8323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleOrSeparator8347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingRelation_in_entryRuleMappingRelation8388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingRelation8399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleMappingRelation8436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRelation_in_entryRuleTypeRelation8476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRelation8487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignOp_in_ruleTypeRelation8534 = new BitSet(new long[]{0x7E00010000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOp_in_ruleTypeRelation8567 = new BitSet(new long[]{0x7E00010000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleTypeRelation8591 = new BitSet(new long[]{0x7E00010000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleTypeRelation8610 = new BitSet(new long[]{0x7E00010000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleTypeRelation8629 = new BitSet(new long[]{0x7E00010000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTypeRelation8648 = new BitSet(new long[]{0x7E00010000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColon_in_ruleTypeRelation8676 = new BitSet(new long[]{0x7E00010000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleTypeRelation8700 = new BitSet(new long[]{0x7E00010000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeJudgmentSymbol_in_entryRuleTypeJudgmentSymbol8742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeJudgmentSymbol8753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_ruleTypeJudgmentSymbol8801 = new BitSet(new long[]{0x7E40010000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRelation_in_ruleTypeJudgmentSymbol8830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignOp_in_entryRuleAssignOp8876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignOp8887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleAssignOp8924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOp_in_entryRuleEqualsOp8964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualsOp8975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleEqualsOp9012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOp_in_entryRulePlusOp9052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOp9063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePlusOp9100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinusOp_in_entryRuleMinusOp9140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinusOp9151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleMinusOp9188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualsOp_in_entryRuleNotEqualsOp9228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqualsOp9239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleNotEqualsOp9276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComma_in_entryRuleComma9316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComma9327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleComma9364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListComposition_in_entryRuleListComposition9404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListComposition9415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColon_in_ruleListComposition9462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColon_in_ruleListComposition9489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColon_in_entryRuleColon9535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColon9546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleColon9583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironmentComposition_in_entryRuleEnvironmentComposition9623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnvironmentComposition9634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComma_in_ruleEnvironmentComposition9681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListComposition_in_ruleEnvironmentComposition9714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred6_InternalTypeSystem532 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleEqualsOp_in_synpred6_InternalTypeSystem551 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred6_InternalTypeSystem567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred7_InternalTypeSystem640 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleEqualsOp_in_synpred7_InternalTypeSystem659 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred7_InternalTypeSystem675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred8_InternalTypeSystem748 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleEqualsOp_in_synpred8_InternalTypeSystem767 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred8_InternalTypeSystem783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_synpred9_InternalTypeSystem861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclarationWithType_in_synpred13_InternalTypeSystem1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrTypingJudgment_in_synpred14_InternalTypeSystem1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardOperation_in_synpred15_InternalTypeSystem1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignOp_in_synpred19_InternalTypeSystem1977 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred19_InternalTypeSystem1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListOperation_in_synpred32_InternalTypeSystem3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_synpred33_InternalTypeSystem3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquals_in_synpred34_InternalTypeSystem3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred38_InternalTypeSystem4100 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rulePlusOp_in_synpred38_InternalTypeSystem4119 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleEqualsOp_in_synpred38_InternalTypeSystem4137 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred38_InternalTypeSystem4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOp_in_synpred43_InternalTypeSystem5186 = new BitSet(new long[]{0x002FD0000A000060L});
    public static final BitSet FOLLOW_ruleFailureError_in_synpred43_InternalTypeSystem5207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred44_InternalTypeSystem5310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironmentComposition_in_synpred45_InternalTypeSystem5713 = new BitSet(new long[]{0x002FD8000A000070L});
    public static final BitSet FOLLOW_ruleEnvironment_in_synpred45_InternalTypeSystem5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerConstant_in_synpred62_InternalTypeSystem8111 = new BitSet(new long[]{0x0000000000000002L});

}
