package org.example.qcm.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.qcm.dsl.services.QcmDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQcmDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'questionnaire'", "'{'", "'melange'", "'='", "'}'", "'question'", "'type'", "'SIMPLE'", "'MULTIPLE'", "'difficulte'", "'etiquettes'", "','", "'correcte'", "'true'", "'false'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalQcmDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQcmDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQcmDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQcmDsl.g"; }



     	private QcmDslGrammarAccess grammarAccess;

        public InternalQcmDslParser(TokenStream input, QcmDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Questionnaire";
       	}

       	@Override
       	protected QcmDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleQuestionnaire"
    // InternalQcmDsl.g:64:1: entryRuleQuestionnaire returns [EObject current=null] : iv_ruleQuestionnaire= ruleQuestionnaire EOF ;
    public final EObject entryRuleQuestionnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionnaire = null;


        try {
            // InternalQcmDsl.g:64:54: (iv_ruleQuestionnaire= ruleQuestionnaire EOF )
            // InternalQcmDsl.g:65:2: iv_ruleQuestionnaire= ruleQuestionnaire EOF
            {
             newCompositeNode(grammarAccess.getQuestionnaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestionnaire=ruleQuestionnaire();

            state._fsp--;

             current =iv_ruleQuestionnaire; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuestionnaire"


    // $ANTLR start "ruleQuestionnaire"
    // InternalQcmDsl.g:71:1: ruleQuestionnaire returns [EObject current=null] : (otherlv_0= 'questionnaire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'melange' otherlv_4= '=' ( (lv_melange_5_0= ruleBOOLEAN ) ) )? ( (lv_questions_6_0= ruleQuestion ) )* otherlv_7= '}' ) ;
    public final EObject ruleQuestionnaire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_melange_5_0 = null;

        EObject lv_questions_6_0 = null;



        	enterRule();

        try {
            // InternalQcmDsl.g:77:2: ( (otherlv_0= 'questionnaire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'melange' otherlv_4= '=' ( (lv_melange_5_0= ruleBOOLEAN ) ) )? ( (lv_questions_6_0= ruleQuestion ) )* otherlv_7= '}' ) )
            // InternalQcmDsl.g:78:2: (otherlv_0= 'questionnaire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'melange' otherlv_4= '=' ( (lv_melange_5_0= ruleBOOLEAN ) ) )? ( (lv_questions_6_0= ruleQuestion ) )* otherlv_7= '}' )
            {
            // InternalQcmDsl.g:78:2: (otherlv_0= 'questionnaire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'melange' otherlv_4= '=' ( (lv_melange_5_0= ruleBOOLEAN ) ) )? ( (lv_questions_6_0= ruleQuestion ) )* otherlv_7= '}' )
            // InternalQcmDsl.g:79:3: otherlv_0= 'questionnaire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'melange' otherlv_4= '=' ( (lv_melange_5_0= ruleBOOLEAN ) ) )? ( (lv_questions_6_0= ruleQuestion ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0());
            		
            // InternalQcmDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQcmDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQcmDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalQcmDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getQuestionnaireAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionnaireRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQcmDsl.g:105:3: (otherlv_3= 'melange' otherlv_4= '=' ( (lv_melange_5_0= ruleBOOLEAN ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalQcmDsl.g:106:4: otherlv_3= 'melange' otherlv_4= '=' ( (lv_melange_5_0= ruleBOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getQuestionnaireAccess().getMelangeKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getQuestionnaireAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalQcmDsl.g:114:4: ( (lv_melange_5_0= ruleBOOLEAN ) )
                    // InternalQcmDsl.g:115:5: (lv_melange_5_0= ruleBOOLEAN )
                    {
                    // InternalQcmDsl.g:115:5: (lv_melange_5_0= ruleBOOLEAN )
                    // InternalQcmDsl.g:116:6: lv_melange_5_0= ruleBOOLEAN
                    {

                    						newCompositeNode(grammarAccess.getQuestionnaireAccess().getMelangeBOOLEANParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_melange_5_0=ruleBOOLEAN();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
                    						}
                    						set(
                    							current,
                    							"melange",
                    							lv_melange_5_0,
                    							"org.example.qcm.dsl.QcmDsl.BOOLEAN");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQcmDsl.g:134:3: ( (lv_questions_6_0= ruleQuestion ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalQcmDsl.g:135:4: (lv_questions_6_0= ruleQuestion )
            	    {
            	    // InternalQcmDsl.g:135:4: (lv_questions_6_0= ruleQuestion )
            	    // InternalQcmDsl.g:136:5: lv_questions_6_0= ruleQuestion
            	    {

            	    					newCompositeNode(grammarAccess.getQuestionnaireAccess().getQuestionsQuestionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_questions_6_0=ruleQuestion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
            	    					}
            	    					add(
            	    						current,
            	    						"questions",
            	    						lv_questions_6_0,
            	    						"org.example.qcm.dsl.QcmDsl.Question");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleQuestionnaire"


    // $ANTLR start "entryRuleQuestion"
    // InternalQcmDsl.g:161:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalQcmDsl.g:161:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalQcmDsl.g:162:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalQcmDsl.g:168:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'question' ( (lv_texte_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( ( (lv_type_5_1= 'SIMPLE' | lv_type_5_2= 'MULTIPLE' ) ) ) otherlv_6= 'difficulte' otherlv_7= '=' ( (lv_difficulte_8_0= RULE_INT ) ) ( (lv_propositions_9_0= ruleProposition ) )+ (otherlv_10= 'etiquettes' otherlv_11= '=' ( (lv_etiquettes_12_0= ruleEtiquette ) ) (otherlv_13= ',' ( (lv_etiquettes_14_0= ruleEtiquette ) ) )* )? otherlv_15= '}' ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_texte_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_type_5_1=null;
        Token lv_type_5_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_difficulte_8_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_propositions_9_0 = null;

        EObject lv_etiquettes_12_0 = null;

        EObject lv_etiquettes_14_0 = null;



        	enterRule();

        try {
            // InternalQcmDsl.g:174:2: ( (otherlv_0= 'question' ( (lv_texte_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( ( (lv_type_5_1= 'SIMPLE' | lv_type_5_2= 'MULTIPLE' ) ) ) otherlv_6= 'difficulte' otherlv_7= '=' ( (lv_difficulte_8_0= RULE_INT ) ) ( (lv_propositions_9_0= ruleProposition ) )+ (otherlv_10= 'etiquettes' otherlv_11= '=' ( (lv_etiquettes_12_0= ruleEtiquette ) ) (otherlv_13= ',' ( (lv_etiquettes_14_0= ruleEtiquette ) ) )* )? otherlv_15= '}' ) )
            // InternalQcmDsl.g:175:2: (otherlv_0= 'question' ( (lv_texte_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( ( (lv_type_5_1= 'SIMPLE' | lv_type_5_2= 'MULTIPLE' ) ) ) otherlv_6= 'difficulte' otherlv_7= '=' ( (lv_difficulte_8_0= RULE_INT ) ) ( (lv_propositions_9_0= ruleProposition ) )+ (otherlv_10= 'etiquettes' otherlv_11= '=' ( (lv_etiquettes_12_0= ruleEtiquette ) ) (otherlv_13= ',' ( (lv_etiquettes_14_0= ruleEtiquette ) ) )* )? otherlv_15= '}' )
            {
            // InternalQcmDsl.g:175:2: (otherlv_0= 'question' ( (lv_texte_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( ( (lv_type_5_1= 'SIMPLE' | lv_type_5_2= 'MULTIPLE' ) ) ) otherlv_6= 'difficulte' otherlv_7= '=' ( (lv_difficulte_8_0= RULE_INT ) ) ( (lv_propositions_9_0= ruleProposition ) )+ (otherlv_10= 'etiquettes' otherlv_11= '=' ( (lv_etiquettes_12_0= ruleEtiquette ) ) (otherlv_13= ',' ( (lv_etiquettes_14_0= ruleEtiquette ) ) )* )? otherlv_15= '}' )
            // InternalQcmDsl.g:176:3: otherlv_0= 'question' ( (lv_texte_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( ( (lv_type_5_1= 'SIMPLE' | lv_type_5_2= 'MULTIPLE' ) ) ) otherlv_6= 'difficulte' otherlv_7= '=' ( (lv_difficulte_8_0= RULE_INT ) ) ( (lv_propositions_9_0= ruleProposition ) )+ (otherlv_10= 'etiquettes' otherlv_11= '=' ( (lv_etiquettes_12_0= ruleEtiquette ) ) (otherlv_13= ',' ( (lv_etiquettes_14_0= ruleEtiquette ) ) )* )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
            		
            // InternalQcmDsl.g:180:3: ( (lv_texte_1_0= RULE_STRING ) )
            // InternalQcmDsl.g:181:4: (lv_texte_1_0= RULE_STRING )
            {
            // InternalQcmDsl.g:181:4: (lv_texte_1_0= RULE_STRING )
            // InternalQcmDsl.g:182:5: lv_texte_1_0= RULE_STRING
            {
            lv_texte_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_texte_1_0, grammarAccess.getQuestionAccess().getTexteSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"texte",
            						lv_texte_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getQuestionAccess().getEqualsSignKeyword_4());
            		
            // InternalQcmDsl.g:210:3: ( ( (lv_type_5_1= 'SIMPLE' | lv_type_5_2= 'MULTIPLE' ) ) )
            // InternalQcmDsl.g:211:4: ( (lv_type_5_1= 'SIMPLE' | lv_type_5_2= 'MULTIPLE' ) )
            {
            // InternalQcmDsl.g:211:4: ( (lv_type_5_1= 'SIMPLE' | lv_type_5_2= 'MULTIPLE' ) )
            // InternalQcmDsl.g:212:5: (lv_type_5_1= 'SIMPLE' | lv_type_5_2= 'MULTIPLE' )
            {
            // InternalQcmDsl.g:212:5: (lv_type_5_1= 'SIMPLE' | lv_type_5_2= 'MULTIPLE' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQcmDsl.g:213:6: lv_type_5_1= 'SIMPLE'
                    {
                    lv_type_5_1=(Token)match(input,18,FOLLOW_12); 

                    						newLeafNode(lv_type_5_1, grammarAccess.getQuestionAccess().getTypeSIMPLEKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuestionRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_5_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalQcmDsl.g:224:6: lv_type_5_2= 'MULTIPLE'
                    {
                    lv_type_5_2=(Token)match(input,19,FOLLOW_12); 

                    						newLeafNode(lv_type_5_2, grammarAccess.getQuestionAccess().getTypeMULTIPLEKeyword_5_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuestionRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_5_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getQuestionAccess().getDifficulteKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getQuestionAccess().getEqualsSignKeyword_7());
            		
            // InternalQcmDsl.g:245:3: ( (lv_difficulte_8_0= RULE_INT ) )
            // InternalQcmDsl.g:246:4: (lv_difficulte_8_0= RULE_INT )
            {
            // InternalQcmDsl.g:246:4: (lv_difficulte_8_0= RULE_INT )
            // InternalQcmDsl.g:247:5: lv_difficulte_8_0= RULE_INT
            {
            lv_difficulte_8_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_difficulte_8_0, grammarAccess.getQuestionAccess().getDifficulteINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"difficulte",
            						lv_difficulte_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalQcmDsl.g:263:3: ( (lv_propositions_9_0= ruleProposition ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalQcmDsl.g:264:4: (lv_propositions_9_0= ruleProposition )
            	    {
            	    // InternalQcmDsl.g:264:4: (lv_propositions_9_0= ruleProposition )
            	    // InternalQcmDsl.g:265:5: lv_propositions_9_0= ruleProposition
            	    {

            	    					newCompositeNode(grammarAccess.getQuestionAccess().getPropositionsPropositionParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_propositions_9_0=ruleProposition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"propositions",
            	    						lv_propositions_9_0,
            	    						"org.example.qcm.dsl.QcmDsl.Proposition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // InternalQcmDsl.g:282:3: (otherlv_10= 'etiquettes' otherlv_11= '=' ( (lv_etiquettes_12_0= ruleEtiquette ) ) (otherlv_13= ',' ( (lv_etiquettes_14_0= ruleEtiquette ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalQcmDsl.g:283:4: otherlv_10= 'etiquettes' otherlv_11= '=' ( (lv_etiquettes_12_0= ruleEtiquette ) ) (otherlv_13= ',' ( (lv_etiquettes_14_0= ruleEtiquette ) ) )*
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getQuestionAccess().getEtiquettesKeyword_10_0());
                    			
                    otherlv_11=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getQuestionAccess().getEqualsSignKeyword_10_1());
                    			
                    // InternalQcmDsl.g:291:4: ( (lv_etiquettes_12_0= ruleEtiquette ) )
                    // InternalQcmDsl.g:292:5: (lv_etiquettes_12_0= ruleEtiquette )
                    {
                    // InternalQcmDsl.g:292:5: (lv_etiquettes_12_0= ruleEtiquette )
                    // InternalQcmDsl.g:293:6: lv_etiquettes_12_0= ruleEtiquette
                    {

                    						newCompositeNode(grammarAccess.getQuestionAccess().getEtiquettesEtiquetteParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_etiquettes_12_0=ruleEtiquette();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionRule());
                    						}
                    						add(
                    							current,
                    							"etiquettes",
                    							lv_etiquettes_12_0,
                    							"org.example.qcm.dsl.QcmDsl.Etiquette");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQcmDsl.g:310:4: (otherlv_13= ',' ( (lv_etiquettes_14_0= ruleEtiquette ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==22) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalQcmDsl.g:311:5: otherlv_13= ',' ( (lv_etiquettes_14_0= ruleEtiquette ) )
                    	    {
                    	    otherlv_13=(Token)match(input,22,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getQuestionAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalQcmDsl.g:315:5: ( (lv_etiquettes_14_0= ruleEtiquette ) )
                    	    // InternalQcmDsl.g:316:6: (lv_etiquettes_14_0= ruleEtiquette )
                    	    {
                    	    // InternalQcmDsl.g:316:6: (lv_etiquettes_14_0= ruleEtiquette )
                    	    // InternalQcmDsl.g:317:7: lv_etiquettes_14_0= ruleEtiquette
                    	    {

                    	    							newCompositeNode(grammarAccess.getQuestionAccess().getEtiquettesEtiquetteParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_etiquettes_14_0=ruleEtiquette();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getQuestionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"etiquettes",
                    	    								lv_etiquettes_14_0,
                    	    								"org.example.qcm.dsl.QcmDsl.Etiquette");
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

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleProposition"
    // InternalQcmDsl.g:344:1: entryRuleProposition returns [EObject current=null] : iv_ruleProposition= ruleProposition EOF ;
    public final EObject entryRuleProposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposition = null;


        try {
            // InternalQcmDsl.g:344:52: (iv_ruleProposition= ruleProposition EOF )
            // InternalQcmDsl.g:345:2: iv_ruleProposition= ruleProposition EOF
            {
             newCompositeNode(grammarAccess.getPropositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProposition=ruleProposition();

            state._fsp--;

             current =iv_ruleProposition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProposition"


    // $ANTLR start "ruleProposition"
    // InternalQcmDsl.g:351:1: ruleProposition returns [EObject current=null] : ( ( (lv_texte_0_0= RULE_STRING ) ) (otherlv_1= 'correcte' otherlv_2= '=' ( (lv_estCorrecte_3_0= ruleBOOLEAN ) ) )? ) ;
    public final EObject ruleProposition() throws RecognitionException {
        EObject current = null;

        Token lv_texte_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_estCorrecte_3_0 = null;



        	enterRule();

        try {
            // InternalQcmDsl.g:357:2: ( ( ( (lv_texte_0_0= RULE_STRING ) ) (otherlv_1= 'correcte' otherlv_2= '=' ( (lv_estCorrecte_3_0= ruleBOOLEAN ) ) )? ) )
            // InternalQcmDsl.g:358:2: ( ( (lv_texte_0_0= RULE_STRING ) ) (otherlv_1= 'correcte' otherlv_2= '=' ( (lv_estCorrecte_3_0= ruleBOOLEAN ) ) )? )
            {
            // InternalQcmDsl.g:358:2: ( ( (lv_texte_0_0= RULE_STRING ) ) (otherlv_1= 'correcte' otherlv_2= '=' ( (lv_estCorrecte_3_0= ruleBOOLEAN ) ) )? )
            // InternalQcmDsl.g:359:3: ( (lv_texte_0_0= RULE_STRING ) ) (otherlv_1= 'correcte' otherlv_2= '=' ( (lv_estCorrecte_3_0= ruleBOOLEAN ) ) )?
            {
            // InternalQcmDsl.g:359:3: ( (lv_texte_0_0= RULE_STRING ) )
            // InternalQcmDsl.g:360:4: (lv_texte_0_0= RULE_STRING )
            {
            // InternalQcmDsl.g:360:4: (lv_texte_0_0= RULE_STRING )
            // InternalQcmDsl.g:361:5: lv_texte_0_0= RULE_STRING
            {
            lv_texte_0_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_texte_0_0, grammarAccess.getPropositionAccess().getTexteSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"texte",
            						lv_texte_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalQcmDsl.g:377:3: (otherlv_1= 'correcte' otherlv_2= '=' ( (lv_estCorrecte_3_0= ruleBOOLEAN ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalQcmDsl.g:378:4: otherlv_1= 'correcte' otherlv_2= '=' ( (lv_estCorrecte_3_0= ruleBOOLEAN ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getPropositionAccess().getCorrecteKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getPropositionAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalQcmDsl.g:386:4: ( (lv_estCorrecte_3_0= ruleBOOLEAN ) )
                    // InternalQcmDsl.g:387:5: (lv_estCorrecte_3_0= ruleBOOLEAN )
                    {
                    // InternalQcmDsl.g:387:5: (lv_estCorrecte_3_0= ruleBOOLEAN )
                    // InternalQcmDsl.g:388:6: lv_estCorrecte_3_0= ruleBOOLEAN
                    {

                    						newCompositeNode(grammarAccess.getPropositionAccess().getEstCorrecteBOOLEANParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_estCorrecte_3_0=ruleBOOLEAN();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropositionRule());
                    						}
                    						set(
                    							current,
                    							"estCorrecte",
                    							lv_estCorrecte_3_0,
                    							"org.example.qcm.dsl.QcmDsl.BOOLEAN");
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
    // $ANTLR end "ruleProposition"


    // $ANTLR start "entryRuleEtiquette"
    // InternalQcmDsl.g:410:1: entryRuleEtiquette returns [EObject current=null] : iv_ruleEtiquette= ruleEtiquette EOF ;
    public final EObject entryRuleEtiquette() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEtiquette = null;


        try {
            // InternalQcmDsl.g:410:50: (iv_ruleEtiquette= ruleEtiquette EOF )
            // InternalQcmDsl.g:411:2: iv_ruleEtiquette= ruleEtiquette EOF
            {
             newCompositeNode(grammarAccess.getEtiquetteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEtiquette=ruleEtiquette();

            state._fsp--;

             current =iv_ruleEtiquette; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEtiquette"


    // $ANTLR start "ruleEtiquette"
    // InternalQcmDsl.g:417:1: ruleEtiquette returns [EObject current=null] : ( (lv_nom_0_0= RULE_ID ) ) ;
    public final EObject ruleEtiquette() throws RecognitionException {
        EObject current = null;

        Token lv_nom_0_0=null;


        	enterRule();

        try {
            // InternalQcmDsl.g:423:2: ( ( (lv_nom_0_0= RULE_ID ) ) )
            // InternalQcmDsl.g:424:2: ( (lv_nom_0_0= RULE_ID ) )
            {
            // InternalQcmDsl.g:424:2: ( (lv_nom_0_0= RULE_ID ) )
            // InternalQcmDsl.g:425:3: (lv_nom_0_0= RULE_ID )
            {
            // InternalQcmDsl.g:425:3: (lv_nom_0_0= RULE_ID )
            // InternalQcmDsl.g:426:4: lv_nom_0_0= RULE_ID
            {
            lv_nom_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_nom_0_0, grammarAccess.getEtiquetteAccess().getNomIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEtiquetteRule());
            				}
            				setWithLastConsumed(
            					current,
            					"nom",
            					lv_nom_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleEtiquette"


    // $ANTLR start "entryRuleBOOLEAN"
    // InternalQcmDsl.g:445:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // InternalQcmDsl.g:445:47: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalQcmDsl.g:446:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
             newCompositeNode(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;

             current =iv_ruleBOOLEAN.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // InternalQcmDsl.g:452:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalQcmDsl.g:458:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalQcmDsl.g:459:2: (kw= 'true' | kw= 'false' )
            {
            // InternalQcmDsl.g:459:2: (kw= 'true' | kw= 'false' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalQcmDsl.g:460:3: kw= 'true'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQcmDsl.g:466:3: kw= 'false'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleBOOLEAN"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000208020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});

}