// $ANTLR 3.4 C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g 2016-06-01 08:46:31

package antlr;
    import util.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ScannerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AUTHOR", "BAR", "CHORD", "DIGIT", "HAMMER", "IDENT", "INT", "LETTER", "NEWLINE", "NOTE", "NOTE_D", "PAUSE", "PAUSE_G", "POWERCHORD", "PULLOFF", "SLIDEDOWN", "SLIDEUP", "START", "STRING_LITERAL", "STRUMMING", "TITLE", "WORD", "WS", "'('", "'()'", "')'", "','", "'/'"
    };

    public static final int EOF=-1;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int AUTHOR=4;
    public static final int BAR=5;
    public static final int CHORD=6;
    public static final int DIGIT=7;
    public static final int HAMMER=8;
    public static final int IDENT=9;
    public static final int INT=10;
    public static final int LETTER=11;
    public static final int NEWLINE=12;
    public static final int NOTE=13;
    public static final int NOTE_D=14;
    public static final int PAUSE=15;
    public static final int PAUSE_G=16;
    public static final int POWERCHORD=17;
    public static final int PULLOFF=18;
    public static final int SLIDEDOWN=19;
    public static final int SLIDEUP=20;
    public static final int START=21;
    public static final int STRING_LITERAL=22;
    public static final int STRUMMING=23;
    public static final int TITLE=24;
    public static final int WORD=25;
    public static final int WS=26;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ScannerParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ScannerParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ScannerParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g"; }


    Main principale;
    ParserEnvironment env;

    public void init() {
    	principale = new Main();
    	env = new ParserEnvironment();
    }

    public String getTranslation() {
    	return env.translation.toString();
    }

    public ArrayList<String> getErrors() {
    	return env.errorList;
    }


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:36:1: start : START title ( author )? bar ( sound )* ;
    public final ScannerParser.start_return start() throws RecognitionException {
        ScannerParser.start_return retval = new ScannerParser.start_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token START1=null;
        ScannerParser.title_return title2 =null;

        ScannerParser.author_return author3 =null;

        ScannerParser.bar_return bar4 =null;

        ScannerParser.sound_return sound5 =null;


        Object START1_tree=null;


        init();

        try {
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:40:3: ( START title ( author )? bar ( sound )* )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:41:3: START title ( author )? bar ( sound )*
            {
            root_0 = (Object)adaptor.nil();


            START1=(Token)match(input,START,FOLLOW_START_in_start81); 
            START1_tree = 
            (Object)adaptor.create(START1)
            ;
            adaptor.addChild(root_0, START1_tree);


            pushFollow(FOLLOW_title_in_start83);
            title2=title();

            state._fsp--;

            adaptor.addChild(root_0, title2.getTree());

            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:41:15: ( author )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==AUTHOR) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:41:15: author
                    {
                    pushFollow(FOLLOW_author_in_start85);
                    author3=author();

                    state._fsp--;

                    adaptor.addChild(root_0, author3.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_bar_in_start88);
            bar4=bar();

            state._fsp--;

            adaptor.addChild(root_0, bar4.getTree());

            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:41:27: ( sound )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CHORD||LA2_0==HAMMER||LA2_0==NEWLINE||(LA2_0 >= NOTE_D && LA2_0 <= SLIDEUP)||LA2_0==STRUMMING) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:41:27: sound
            	    {
            	    pushFollow(FOLLOW_sound_in_start90);
            	    sound5=sound();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sound5.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "start"


    public static class sound_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sound"
    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:44:1: sound : ( note | chord | powerchord | strumming | slideup | slidedown | hammer | pulloff | pause | pause_g | newline );
    public final ScannerParser.sound_return sound() throws RecognitionException {
        ScannerParser.sound_return retval = new ScannerParser.sound_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ScannerParser.note_return note6 =null;

        ScannerParser.chord_return chord7 =null;

        ScannerParser.powerchord_return powerchord8 =null;

        ScannerParser.strumming_return strumming9 =null;

        ScannerParser.slideup_return slideup10 =null;

        ScannerParser.slidedown_return slidedown11 =null;

        ScannerParser.hammer_return hammer12 =null;

        ScannerParser.pulloff_return pulloff13 =null;

        ScannerParser.pause_return pause14 =null;

        ScannerParser.pause_g_return pause_g15 =null;

        ScannerParser.newline_return newline16 =null;



        try {
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:45:3: ( note | chord | powerchord | strumming | slideup | slidedown | hammer | pulloff | pause | pause_g | newline )
            int alt3=11;
            switch ( input.LA(1) ) {
            case NOTE_D:
                {
                alt3=1;
                }
                break;
            case CHORD:
                {
                alt3=2;
                }
                break;
            case POWERCHORD:
                {
                alt3=3;
                }
                break;
            case STRUMMING:
                {
                alt3=4;
                }
                break;
            case SLIDEUP:
                {
                alt3=5;
                }
                break;
            case SLIDEDOWN:
                {
                alt3=6;
                }
                break;
            case HAMMER:
                {
                alt3=7;
                }
                break;
            case PULLOFF:
                {
                alt3=8;
                }
                break;
            case PAUSE:
                {
                alt3=9;
                }
                break;
            case PAUSE_G:
                {
                alt3=10;
                }
                break;
            case NEWLINE:
                {
                alt3=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:46:3: note
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_note_in_sound106);
                    note6=note();

                    state._fsp--;

                    adaptor.addChild(root_0, note6.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:47:5: chord
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_chord_in_sound112);
                    chord7=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord7.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:48:5: powerchord
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_powerchord_in_sound118);
                    powerchord8=powerchord();

                    state._fsp--;

                    adaptor.addChild(root_0, powerchord8.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:49:5: strumming
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_strumming_in_sound124);
                    strumming9=strumming();

                    state._fsp--;

                    adaptor.addChild(root_0, strumming9.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:50:5: slideup
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_slideup_in_sound130);
                    slideup10=slideup();

                    state._fsp--;

                    adaptor.addChild(root_0, slideup10.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:51:5: slidedown
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_slidedown_in_sound136);
                    slidedown11=slidedown();

                    state._fsp--;

                    adaptor.addChild(root_0, slidedown11.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:52:5: hammer
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_hammer_in_sound142);
                    hammer12=hammer();

                    state._fsp--;

                    adaptor.addChild(root_0, hammer12.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:53:5: pulloff
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pulloff_in_sound148);
                    pulloff13=pulloff();

                    state._fsp--;

                    adaptor.addChild(root_0, pulloff13.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:54:5: pause
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pause_in_sound154);
                    pause14=pause();

                    state._fsp--;

                    adaptor.addChild(root_0, pause14.getTree());

                    }
                    break;
                case 10 :
                    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:55:5: pause_g
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pause_g_in_sound160);
                    pause_g15=pause_g();

                    state._fsp--;

                    adaptor.addChild(root_0, pause_g15.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:56:5: newline
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_newline_in_sound166);
                    newline16=newline();

                    state._fsp--;

                    adaptor.addChild(root_0, newline16.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sound"


    public static class author_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "author"
    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:59:1: author : AUTHOR '(' t= WORD ')' ;
    public final ScannerParser.author_return author() throws RecognitionException {
        ScannerParser.author_return retval = new ScannerParser.author_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token t=null;
        Token AUTHOR17=null;
        Token char_literal18=null;
        Token char_literal19=null;

        Object t_tree=null;
        Object AUTHOR17_tree=null;
        Object char_literal18_tree=null;
        Object char_literal19_tree=null;

        try {
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:60:3: ( AUTHOR '(' t= WORD ')' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:61:3: AUTHOR '(' t= WORD ')'
            {
            root_0 = (Object)adaptor.nil();


            AUTHOR17=(Token)match(input,AUTHOR,FOLLOW_AUTHOR_in_author181); 
            AUTHOR17_tree = 
            (Object)adaptor.create(AUTHOR17)
            ;
            adaptor.addChild(root_0, AUTHOR17_tree);


            char_literal18=(Token)match(input,27,FOLLOW_27_in_author183); 
            char_literal18_tree = 
            (Object)adaptor.create(char_literal18)
            ;
            adaptor.addChild(root_0, char_literal18_tree);


            t=(Token)match(input,WORD,FOLLOW_WORD_in_author187); 
            t_tree = 
            (Object)adaptor.create(t)
            ;
            adaptor.addChild(root_0, t_tree);



                                 principale.writeAuthor(t.getText());
                                

            char_literal19=(Token)match(input,29,FOLLOW_29_in_author232); 
            char_literal19_tree = 
            (Object)adaptor.create(char_literal19)
            ;
            adaptor.addChild(root_0, char_literal19_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "author"


    public static class bar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bar"
    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:68:1: bar : BAR '(' a= INT '/' b= INT ')' ;
    public final ScannerParser.bar_return bar() throws RecognitionException {
        ScannerParser.bar_return retval = new ScannerParser.bar_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token a=null;
        Token b=null;
        Token BAR20=null;
        Token char_literal21=null;
        Token char_literal22=null;
        Token char_literal23=null;

        Object a_tree=null;
        Object b_tree=null;
        Object BAR20_tree=null;
        Object char_literal21_tree=null;
        Object char_literal22_tree=null;
        Object char_literal23_tree=null;

        try {
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:69:3: ( BAR '(' a= INT '/' b= INT ')' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:70:3: BAR '(' a= INT '/' b= INT ')'
            {
            root_0 = (Object)adaptor.nil();


            BAR20=(Token)match(input,BAR,FOLLOW_BAR_in_bar247); 
            BAR20_tree = 
            (Object)adaptor.create(BAR20)
            ;
            adaptor.addChild(root_0, BAR20_tree);


            char_literal21=(Token)match(input,27,FOLLOW_27_in_bar249); 
            char_literal21_tree = 
            (Object)adaptor.create(char_literal21)
            ;
            adaptor.addChild(root_0, char_literal21_tree);


            a=(Token)match(input,INT,FOLLOW_INT_in_bar253); 
            a_tree = 
            (Object)adaptor.create(a)
            ;
            adaptor.addChild(root_0, a_tree);


            char_literal22=(Token)match(input,31,FOLLOW_31_in_bar255); 
            char_literal22_tree = 
            (Object)adaptor.create(char_literal22)
            ;
            adaptor.addChild(root_0, char_literal22_tree);


            b=(Token)match(input,INT,FOLLOW_INT_in_bar259); 
            b_tree = 
            (Object)adaptor.create(b)
            ;
            adaptor.addChild(root_0, b_tree);



                                       principale.setBattuta(Integer.valueOf((a!=null?a.getText():null)), Integer.valueOf((b!=null?b.getText():null)));
                                       principale.writeBattuta(Integer.valueOf((a!=null?a.getText():null)), Integer.valueOf((b!=null?b.getText():null)));
                                       principale.writeBar();
                                      

            char_literal23=(Token)match(input,29,FOLLOW_29_in_bar292); 
            char_literal23_tree = 
            (Object)adaptor.create(char_literal23)
            ;
            adaptor.addChild(root_0, char_literal23_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bar"


    public static class newline_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "newline"
    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:79:1: newline : NEWLINE '()' ;
    public final ScannerParser.newline_return newline() throws RecognitionException {
        ScannerParser.newline_return retval = new ScannerParser.newline_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NEWLINE24=null;
        Token string_literal25=null;

        Object NEWLINE24_tree=null;
        Object string_literal25_tree=null;

        try {
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:80:3: ( NEWLINE '()' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:81:3: NEWLINE '()'
            {
            root_0 = (Object)adaptor.nil();


            NEWLINE24=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_newline307); 
            NEWLINE24_tree = 
            (Object)adaptor.create(NEWLINE24)
            ;
            adaptor.addChild(root_0, NEWLINE24_tree);



                       principale.newLine();
                       //principale.writeBar();
                      

            string_literal25=(Token)match(input,28,FOLLOW_28_in_newline324); 
            string_literal25_tree = 
            (Object)adaptor.create(string_literal25)
            ;
            adaptor.addChild(root_0, string_literal25_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "newline"


    public static class title_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "title"
    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:89:1: title : TITLE '(' t= WORD ')' ;
    public final ScannerParser.title_return title() throws RecognitionException {
        ScannerParser.title_return retval = new ScannerParser.title_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token t=null;
        Token TITLE26=null;
        Token char_literal27=null;
        Token char_literal28=null;

        Object t_tree=null;
        Object TITLE26_tree=null;
        Object char_literal27_tree=null;
        Object char_literal28_tree=null;

        try {
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:90:3: ( TITLE '(' t= WORD ')' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:91:3: TITLE '(' t= WORD ')'
            {
            root_0 = (Object)adaptor.nil();


            TITLE26=(Token)match(input,TITLE,FOLLOW_TITLE_in_title339); 
            TITLE26_tree = 
            (Object)adaptor.create(TITLE26)
            ;
            adaptor.addChild(root_0, TITLE26_tree);


            char_literal27=(Token)match(input,27,FOLLOW_27_in_title341); 
            char_literal27_tree = 
            (Object)adaptor.create(char_literal27)
            ;
            adaptor.addChild(root_0, char_literal27_tree);


            t=(Token)match(input,WORD,FOLLOW_WORD_in_title345); 
            t_tree = 
            (Object)adaptor.create(t)
            ;
            adaptor.addChild(root_0, t_tree);



                                principale.writeTitle(t.getText());
                               

            char_literal28=(Token)match(input,29,FOLLOW_29_in_title371); 
            char_literal28_tree = 
            (Object)adaptor.create(char_literal28)
            ;
            adaptor.addChild(root_0, char_literal28_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "title"


    public static class note_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "note"
    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:98:1: note : NOTE_D '(' c= INT ',' t= INT ')' ;
    public final ScannerParser.note_return note() throws RecognitionException {
        ScannerParser.note_return retval = new ScannerParser.note_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token c=null;
        Token t=null;
        Token NOTE_D29=null;
        Token char_literal30=null;
        Token char_literal31=null;
        Token char_literal32=null;

        Object c_tree=null;
        Object t_tree=null;
        Object NOTE_D29_tree=null;
        Object char_literal30_tree=null;
        Object char_literal31_tree=null;
        Object char_literal32_tree=null;

        try {
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:99:3: ( NOTE_D '(' c= INT ',' t= INT ')' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:100:3: NOTE_D '(' c= INT ',' t= INT ')'
            {
            root_0 = (Object)adaptor.nil();


            NOTE_D29=(Token)match(input,NOTE_D,FOLLOW_NOTE_D_in_note386); 
            NOTE_D29_tree = 
            (Object)adaptor.create(NOTE_D29)
            ;
            adaptor.addChild(root_0, NOTE_D29_tree);


            char_literal30=(Token)match(input,27,FOLLOW_27_in_note388); 
            char_literal30_tree = 
            (Object)adaptor.create(char_literal30)
            ;
            adaptor.addChild(root_0, char_literal30_tree);


            c=(Token)match(input,INT,FOLLOW_INT_in_note392); 
            c_tree = 
            (Object)adaptor.create(c)
            ;
            adaptor.addChild(root_0, c_tree);


            char_literal31=(Token)match(input,30,FOLLOW_30_in_note394); 
            char_literal31_tree = 
            (Object)adaptor.create(char_literal31)
            ;
            adaptor.addChild(root_0, char_literal31_tree);


            t=(Token)match(input,INT,FOLLOW_INT_in_note398); 
            t_tree = 
            (Object)adaptor.create(t)
            ;
            adaptor.addChild(root_0, t_tree);


            char_literal32=(Token)match(input,29,FOLLOW_29_in_note400); 
            char_literal32_tree = 
            (Object)adaptor.create(char_literal32)
            ;
            adaptor.addChild(root_0, char_literal32_tree);



                                              principale.writeNota(Integer.parseInt((c!=null?c.getText():null)), Integer.parseInt((t!=null?t.getText():null)));
                                             

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "note"


    public static class chord_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chord"
    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:106:1: chord : CHORD '(' n= NOTE ')' ;
    public final ScannerParser.chord_return chord() throws RecognitionException {
        ScannerParser.chord_return retval = new ScannerParser.chord_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token n=null;
        Token CHORD33=null;
        Token char_literal34=null;
        Token char_literal35=null;

        Object n_tree=null;
        Object CHORD33_tree=null;
        Object char_literal34_tree=null;
        Object char_literal35_tree=null;

        try {
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:107:3: ( CHORD '(' n= NOTE ')' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:108:3: CHORD '(' n= NOTE ')'
            {
            root_0 = (Object)adaptor.nil();


            CHORD33=(Token)match(input,CHORD,FOLLOW_CHORD_in_chord451); 
            CHORD33_tree = 
            (Object)adaptor.create(CHORD33)
            ;
            adaptor.addChild(root_0, CHORD33_tree);


            char_literal34=(Token)match(input,27,FOLLOW_27_in_chord453); 
            char_literal34_tree = 
            (Object)adaptor.create(char_literal34)
            ;
            adaptor.addChild(root_0, char_literal34_tree);


            n=(Token)match(input,NOTE,FOLLOW_NOTE_in_chord457); 
            n_tree = 
            (Object)adaptor.create(n)
            ;
            adaptor.addChild(root_0, n_tree);


            char_literal35=(Token)match(input,29,FOLLOW_29_in_chord459); 
            char_literal35_tree = 
            (Object)adaptor.create(char_literal35)
            ;
            adaptor.addChild(root_0, char_literal35_tree);



                                    principale.writeChord((n!=null?n.getText():null));
                                   

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "chord"


    public static class powerchord_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "powerchord"
    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:114:1: powerchord : POWERCHORD '(' c= INT ',' t= INT ')' ;
    public final ScannerParser.powerchord_return powerchord() throws RecognitionException {
        ScannerParser.powerchord_return retval = new ScannerParser.powerchord_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token c=null;
        Token t=null;
        Token POWERCHORD36=null;
        Token char_literal37=null;
        Token char_literal38=null;
        Token char_literal39=null;

        Object c_tree=null;
        Object t_tree=null;
        Object POWERCHORD36_tree=null;
        Object char_literal37_tree=null;
        Object char_literal38_tree=null;
        Object char_literal39_tree=null;

        try {
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:115:3: ( POWERCHORD '(' c= INT ',' t= INT ')' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:116:3: POWERCHORD '(' c= INT ',' t= INT ')'
            {
            root_0 = (Object)adaptor.nil();


            POWERCHORD36=(Token)match(input,POWERCHORD,FOLLOW_POWERCHORD_in_powerchord500); 
            POWERCHORD36_tree = 
            (Object)adaptor.create(POWERCHORD36)
            ;
            adaptor.addChild(root_0, POWERCHORD36_tree);


            char_literal37=(Token)match(input,27,FOLLOW_27_in_powerchord502); 
            char_literal37_tree = 
            (Object)adaptor.create(char_literal37)
            ;
            adaptor.addChild(root_0, char_literal37_tree);


            c=(Token)match(input,INT,FOLLOW_INT_in_powerchord506); 
            c_tree = 
            (Object)adaptor.create(c)
            ;
            adaptor.addChild(root_0, c_tree);


            char_literal38=(Token)match(input,30,FOLLOW_30_in_powerchord508); 
            char_literal38_tree = 
            (Object)adaptor.create(char_literal38)
            ;
            adaptor.addChild(root_0, char_literal38_tree);


            t=(Token)match(input,INT,FOLLOW_INT_in_powerchord512); 
            t_tree = 
            (Object)adaptor.create(t)
            ;
            adaptor.addChild(root_0, t_tree);


            char_literal39=(Token)match(input,29,FOLLOW_29_in_powerchord514); 
            char_literal39_tree = 
            (Object)adaptor.create(char_literal39)
            ;
            adaptor.addChild(root_0, char_literal39_tree);



                                                  principale.writePowerchord(Integer.parseInt((c!=null?c.getText():null)), Integer.parseInt((t!=null?t.getText():null)));
                                                 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "powerchord"


    public static class strumming_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "strumming"
    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:122:1: strumming : STRUMMING '(' a= INT ',' b= INT ',' c= INT ',' d= INT ',' e= INT ',' f= INT ')' ;
    public final ScannerParser.strumming_return strumming() throws RecognitionException {
        ScannerParser.strumming_return retval = new ScannerParser.strumming_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token a=null;
        Token b=null;
        Token c=null;
        Token d=null;
        Token e=null;
        Token f=null;
        Token STRUMMING40=null;
        Token char_literal41=null;
        Token char_literal42=null;
        Token char_literal43=null;
        Token char_literal44=null;
        Token char_literal45=null;
        Token char_literal46=null;
        Token char_literal47=null;

        Object a_tree=null;
        Object b_tree=null;
        Object c_tree=null;
        Object d_tree=null;
        Object e_tree=null;
        Object f_tree=null;
        Object STRUMMING40_tree=null;
        Object char_literal41_tree=null;
        Object char_literal42_tree=null;
        Object char_literal43_tree=null;
        Object char_literal44_tree=null;
        Object char_literal45_tree=null;
        Object char_literal46_tree=null;
        Object char_literal47_tree=null;

        try {
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:123:3: ( STRUMMING '(' a= INT ',' b= INT ',' c= INT ',' d= INT ',' e= INT ',' f= INT ')' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:124:3: STRUMMING '(' a= INT ',' b= INT ',' c= INT ',' d= INT ',' e= INT ',' f= INT ')'
            {
            root_0 = (Object)adaptor.nil();


            STRUMMING40=(Token)match(input,STRUMMING,FOLLOW_STRUMMING_in_strumming569); 
            STRUMMING40_tree = 
            (Object)adaptor.create(STRUMMING40)
            ;
            adaptor.addChild(root_0, STRUMMING40_tree);


            char_literal41=(Token)match(input,27,FOLLOW_27_in_strumming571); 
            char_literal41_tree = 
            (Object)adaptor.create(char_literal41)
            ;
            adaptor.addChild(root_0, char_literal41_tree);


            a=(Token)match(input,INT,FOLLOW_INT_in_strumming575); 
            a_tree = 
            (Object)adaptor.create(a)
            ;
            adaptor.addChild(root_0, a_tree);


            char_literal42=(Token)match(input,30,FOLLOW_30_in_strumming577); 
            char_literal42_tree = 
            (Object)adaptor.create(char_literal42)
            ;
            adaptor.addChild(root_0, char_literal42_tree);


            b=(Token)match(input,INT,FOLLOW_INT_in_strumming581); 
            b_tree = 
            (Object)adaptor.create(b)
            ;
            adaptor.addChild(root_0, b_tree);


            char_literal43=(Token)match(input,30,FOLLOW_30_in_strumming583); 
            char_literal43_tree = 
            (Object)adaptor.create(char_literal43)
            ;
            adaptor.addChild(root_0, char_literal43_tree);


            c=(Token)match(input,INT,FOLLOW_INT_in_strumming587); 
            c_tree = 
            (Object)adaptor.create(c)
            ;
            adaptor.addChild(root_0, c_tree);


            char_literal44=(Token)match(input,30,FOLLOW_30_in_strumming589); 
            char_literal44_tree = 
            (Object)adaptor.create(char_literal44)
            ;
            adaptor.addChild(root_0, char_literal44_tree);


            d=(Token)match(input,INT,FOLLOW_INT_in_strumming593); 
            d_tree = 
            (Object)adaptor.create(d)
            ;
            adaptor.addChild(root_0, d_tree);


            char_literal45=(Token)match(input,30,FOLLOW_30_in_strumming595); 
            char_literal45_tree = 
            (Object)adaptor.create(char_literal45)
            ;
            adaptor.addChild(root_0, char_literal45_tree);


            e=(Token)match(input,INT,FOLLOW_INT_in_strumming599); 
            e_tree = 
            (Object)adaptor.create(e)
            ;
            adaptor.addChild(root_0, e_tree);


            char_literal46=(Token)match(input,30,FOLLOW_30_in_strumming601); 
            char_literal46_tree = 
            (Object)adaptor.create(char_literal46)
            ;
            adaptor.addChild(root_0, char_literal46_tree);


            f=(Token)match(input,INT,FOLLOW_INT_in_strumming605); 
            f_tree = 
            (Object)adaptor.create(f)
            ;
            adaptor.addChild(root_0, f_tree);


            char_literal47=(Token)match(input,29,FOLLOW_29_in_strumming607); 
            char_literal47_tree = 
            (Object)adaptor.create(char_literal47)
            ;
            adaptor.addChild(root_0, char_literal47_tree);



                                                                                         principale.writeStrumming(a.getText().charAt(0), b.getText().charAt(0), c.getText().charAt(0),
                                                                                         		d.getText().charAt(0), e.getText().charAt(0), f.getText().charAt(0));
                                                                                        

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "strumming"


    public static class slideup_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "slideup"
    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:131:1: slideup : SLIDEUP '(' c= INT ',' t1= INT ',' t2= INT ')' ;
    public final ScannerParser.slideup_return slideup() throws RecognitionException {
        ScannerParser.slideup_return retval = new ScannerParser.slideup_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token c=null;
        Token t1=null;
        Token t2=null;
        Token SLIDEUP48=null;
        Token char_literal49=null;
        Token char_literal50=null;
        Token char_literal51=null;
        Token char_literal52=null;

        Object c_tree=null;
        Object t1_tree=null;
        Object t2_tree=null;
        Object SLIDEUP48_tree=null;
        Object char_literal49_tree=null;
        Object char_literal50_tree=null;
        Object char_literal51_tree=null;
        Object char_literal52_tree=null;

        try {
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:132:3: ( SLIDEUP '(' c= INT ',' t1= INT ',' t2= INT ')' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:133:3: SLIDEUP '(' c= INT ',' t1= INT ',' t2= INT ')'
            {
            root_0 = (Object)adaptor.nil();


            SLIDEUP48=(Token)match(input,SLIDEUP,FOLLOW_SLIDEUP_in_slideup701); 
            SLIDEUP48_tree = 
            (Object)adaptor.create(SLIDEUP48)
            ;
            adaptor.addChild(root_0, SLIDEUP48_tree);


            char_literal49=(Token)match(input,27,FOLLOW_27_in_slideup703); 
            char_literal49_tree = 
            (Object)adaptor.create(char_literal49)
            ;
            adaptor.addChild(root_0, char_literal49_tree);


            c=(Token)match(input,INT,FOLLOW_INT_in_slideup707); 
            c_tree = 
            (Object)adaptor.create(c)
            ;
            adaptor.addChild(root_0, c_tree);


            char_literal50=(Token)match(input,30,FOLLOW_30_in_slideup709); 
            char_literal50_tree = 
            (Object)adaptor.create(char_literal50)
            ;
            adaptor.addChild(root_0, char_literal50_tree);


            t1=(Token)match(input,INT,FOLLOW_INT_in_slideup713); 
            t1_tree = 
            (Object)adaptor.create(t1)
            ;
            adaptor.addChild(root_0, t1_tree);


            char_literal51=(Token)match(input,30,FOLLOW_30_in_slideup715); 
            char_literal51_tree = 
            (Object)adaptor.create(char_literal51)
            ;
            adaptor.addChild(root_0, char_literal51_tree);


            t2=(Token)match(input,INT,FOLLOW_INT_in_slideup719); 
            t2_tree = 
            (Object)adaptor.create(t2)
            ;
            adaptor.addChild(root_0, t2_tree);


            char_literal52=(Token)match(input,29,FOLLOW_29_in_slideup721); 
            char_literal52_tree = 
            (Object)adaptor.create(char_literal52)
            ;
            adaptor.addChild(root_0, char_literal52_tree);



                                                           principale.writeSlideup(Integer.parseInt((c!=null?c.getText():null)), Integer.parseInt((t1!=null?t1.getText():null)), Integer.parseInt((t2!=null?t2.getText():null)));
                                                          

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "slideup"


    public static class slidedown_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "slidedown"
    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:139:1: slidedown : SLIDEDOWN '(' c= INT ',' t1= INT ',' t2= INT ')' ;
    public final ScannerParser.slidedown_return slidedown() throws RecognitionException {
        ScannerParser.slidedown_return retval = new ScannerParser.slidedown_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token c=null;
        Token t1=null;
        Token t2=null;
        Token SLIDEDOWN53=null;
        Token char_literal54=null;
        Token char_literal55=null;
        Token char_literal56=null;
        Token char_literal57=null;

        Object c_tree=null;
        Object t1_tree=null;
        Object t2_tree=null;
        Object SLIDEDOWN53_tree=null;
        Object char_literal54_tree=null;
        Object char_literal55_tree=null;
        Object char_literal56_tree=null;
        Object char_literal57_tree=null;

        try {
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:140:3: ( SLIDEDOWN '(' c= INT ',' t1= INT ',' t2= INT ')' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:141:3: SLIDEDOWN '(' c= INT ',' t1= INT ',' t2= INT ')'
            {
            root_0 = (Object)adaptor.nil();


            SLIDEDOWN53=(Token)match(input,SLIDEDOWN,FOLLOW_SLIDEDOWN_in_slidedown785); 
            SLIDEDOWN53_tree = 
            (Object)adaptor.create(SLIDEDOWN53)
            ;
            adaptor.addChild(root_0, SLIDEDOWN53_tree);


            char_literal54=(Token)match(input,27,FOLLOW_27_in_slidedown787); 
            char_literal54_tree = 
            (Object)adaptor.create(char_literal54)
            ;
            adaptor.addChild(root_0, char_literal54_tree);


            c=(Token)match(input,INT,FOLLOW_INT_in_slidedown791); 
            c_tree = 
            (Object)adaptor.create(c)
            ;
            adaptor.addChild(root_0, c_tree);


            char_literal55=(Token)match(input,30,FOLLOW_30_in_slidedown793); 
            char_literal55_tree = 
            (Object)adaptor.create(char_literal55)
            ;
            adaptor.addChild(root_0, char_literal55_tree);


            t1=(Token)match(input,INT,FOLLOW_INT_in_slidedown797); 
            t1_tree = 
            (Object)adaptor.create(t1)
            ;
            adaptor.addChild(root_0, t1_tree);


            char_literal56=(Token)match(input,30,FOLLOW_30_in_slidedown799); 
            char_literal56_tree = 
            (Object)adaptor.create(char_literal56)
            ;
            adaptor.addChild(root_0, char_literal56_tree);


            t2=(Token)match(input,INT,FOLLOW_INT_in_slidedown803); 
            t2_tree = 
            (Object)adaptor.create(t2)
            ;
            adaptor.addChild(root_0, t2_tree);


            char_literal57=(Token)match(input,29,FOLLOW_29_in_slidedown805); 
            char_literal57_tree = 
            (Object)adaptor.create(char_literal57)
            ;
            adaptor.addChild(root_0, char_literal57_tree);



                                                             principale.writeSlidedown(Integer.parseInt((c!=null?c.getText():null)), Integer.parseInt((t1!=null?t1.getText():null)), Integer.parseInt((t2!=null?t2.getText():null)));
                                                            

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "slidedown"


    public static class hammer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hammer"
    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:147:1: hammer : HAMMER '(' c= INT ',' t1= INT ',' t2= INT ')' ;
    public final ScannerParser.hammer_return hammer() throws RecognitionException {
        ScannerParser.hammer_return retval = new ScannerParser.hammer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token c=null;
        Token t1=null;
        Token t2=null;
        Token HAMMER58=null;
        Token char_literal59=null;
        Token char_literal60=null;
        Token char_literal61=null;
        Token char_literal62=null;

        Object c_tree=null;
        Object t1_tree=null;
        Object t2_tree=null;
        Object HAMMER58_tree=null;
        Object char_literal59_tree=null;
        Object char_literal60_tree=null;
        Object char_literal61_tree=null;
        Object char_literal62_tree=null;

        try {
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:148:3: ( HAMMER '(' c= INT ',' t1= INT ',' t2= INT ')' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:149:3: HAMMER '(' c= INT ',' t1= INT ',' t2= INT ')'
            {
            root_0 = (Object)adaptor.nil();


            HAMMER58=(Token)match(input,HAMMER,FOLLOW_HAMMER_in_hammer871); 
            HAMMER58_tree = 
            (Object)adaptor.create(HAMMER58)
            ;
            adaptor.addChild(root_0, HAMMER58_tree);


            char_literal59=(Token)match(input,27,FOLLOW_27_in_hammer873); 
            char_literal59_tree = 
            (Object)adaptor.create(char_literal59)
            ;
            adaptor.addChild(root_0, char_literal59_tree);


            c=(Token)match(input,INT,FOLLOW_INT_in_hammer877); 
            c_tree = 
            (Object)adaptor.create(c)
            ;
            adaptor.addChild(root_0, c_tree);


            char_literal60=(Token)match(input,30,FOLLOW_30_in_hammer879); 
            char_literal60_tree = 
            (Object)adaptor.create(char_literal60)
            ;
            adaptor.addChild(root_0, char_literal60_tree);


            t1=(Token)match(input,INT,FOLLOW_INT_in_hammer883); 
            t1_tree = 
            (Object)adaptor.create(t1)
            ;
            adaptor.addChild(root_0, t1_tree);


            char_literal61=(Token)match(input,30,FOLLOW_30_in_hammer885); 
            char_literal61_tree = 
            (Object)adaptor.create(char_literal61)
            ;
            adaptor.addChild(root_0, char_literal61_tree);


            t2=(Token)match(input,INT,FOLLOW_INT_in_hammer889); 
            t2_tree = 
            (Object)adaptor.create(t2)
            ;
            adaptor.addChild(root_0, t2_tree);


            char_literal62=(Token)match(input,29,FOLLOW_29_in_hammer891); 
            char_literal62_tree = 
            (Object)adaptor.create(char_literal62)
            ;
            adaptor.addChild(root_0, char_literal62_tree);



                                                          principale.writeHammer(Integer.parseInt((c!=null?c.getText():null)), Integer.parseInt((t1!=null?t1.getText():null)), Integer.parseInt((t2!=null?t2.getText():null)));
                                                         

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hammer"


    public static class pause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pause"
    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:155:1: pause : PAUSE '()' ;
    public final ScannerParser.pause_return pause() throws RecognitionException {
        ScannerParser.pause_return retval = new ScannerParser.pause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PAUSE63=null;
        Token string_literal64=null;

        Object PAUSE63_tree=null;
        Object string_literal64_tree=null;

        try {
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:156:3: ( PAUSE '()' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:157:3: PAUSE '()'
            {
            root_0 = (Object)adaptor.nil();


            PAUSE63=(Token)match(input,PAUSE,FOLLOW_PAUSE_in_pause954); 
            PAUSE63_tree = 
            (Object)adaptor.create(PAUSE63)
            ;
            adaptor.addChild(root_0, PAUSE63_tree);



                     principale.writePause();
                    

            string_literal64=(Token)match(input,28,FOLLOW_28_in_pause969); 
            string_literal64_tree = 
            (Object)adaptor.create(string_literal64)
            ;
            adaptor.addChild(root_0, string_literal64_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pause"


    public static class pause_g_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pause_g"
    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:164:1: pause_g : PAUSE_G '()' ;
    public final ScannerParser.pause_g_return pause_g() throws RecognitionException {
        ScannerParser.pause_g_return retval = new ScannerParser.pause_g_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PAUSE_G65=null;
        Token string_literal66=null;

        Object PAUSE_G65_tree=null;
        Object string_literal66_tree=null;

        try {
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:165:3: ( PAUSE_G '()' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:166:3: PAUSE_G '()'
            {
            root_0 = (Object)adaptor.nil();


            PAUSE_G65=(Token)match(input,PAUSE_G,FOLLOW_PAUSE_G_in_pause_g984); 
            PAUSE_G65_tree = 
            (Object)adaptor.create(PAUSE_G65)
            ;
            adaptor.addChild(root_0, PAUSE_G65_tree);



                       principale.writePauseG();
                      

            string_literal66=(Token)match(input,28,FOLLOW_28_in_pause_g1001); 
            string_literal66_tree = 
            (Object)adaptor.create(string_literal66)
            ;
            adaptor.addChild(root_0, string_literal66_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pause_g"


    public static class pulloff_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pulloff"
    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:173:1: pulloff : PULLOFF '(' c= INT ',' t1= INT ',' t2= INT ')' ;
    public final ScannerParser.pulloff_return pulloff() throws RecognitionException {
        ScannerParser.pulloff_return retval = new ScannerParser.pulloff_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token c=null;
        Token t1=null;
        Token t2=null;
        Token PULLOFF67=null;
        Token char_literal68=null;
        Token char_literal69=null;
        Token char_literal70=null;
        Token char_literal71=null;

        Object c_tree=null;
        Object t1_tree=null;
        Object t2_tree=null;
        Object PULLOFF67_tree=null;
        Object char_literal68_tree=null;
        Object char_literal69_tree=null;
        Object char_literal70_tree=null;
        Object char_literal71_tree=null;

        try {
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:174:3: ( PULLOFF '(' c= INT ',' t1= INT ',' t2= INT ')' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:175:3: PULLOFF '(' c= INT ',' t1= INT ',' t2= INT ')'
            {
            root_0 = (Object)adaptor.nil();


            PULLOFF67=(Token)match(input,PULLOFF,FOLLOW_PULLOFF_in_pulloff1016); 
            PULLOFF67_tree = 
            (Object)adaptor.create(PULLOFF67)
            ;
            adaptor.addChild(root_0, PULLOFF67_tree);


            char_literal68=(Token)match(input,27,FOLLOW_27_in_pulloff1018); 
            char_literal68_tree = 
            (Object)adaptor.create(char_literal68)
            ;
            adaptor.addChild(root_0, char_literal68_tree);


            c=(Token)match(input,INT,FOLLOW_INT_in_pulloff1022); 
            c_tree = 
            (Object)adaptor.create(c)
            ;
            adaptor.addChild(root_0, c_tree);


            char_literal69=(Token)match(input,30,FOLLOW_30_in_pulloff1024); 
            char_literal69_tree = 
            (Object)adaptor.create(char_literal69)
            ;
            adaptor.addChild(root_0, char_literal69_tree);


            t1=(Token)match(input,INT,FOLLOW_INT_in_pulloff1028); 
            t1_tree = 
            (Object)adaptor.create(t1)
            ;
            adaptor.addChild(root_0, t1_tree);


            char_literal70=(Token)match(input,30,FOLLOW_30_in_pulloff1030); 
            char_literal70_tree = 
            (Object)adaptor.create(char_literal70)
            ;
            adaptor.addChild(root_0, char_literal70_tree);


            t2=(Token)match(input,INT,FOLLOW_INT_in_pulloff1034); 
            t2_tree = 
            (Object)adaptor.create(t2)
            ;
            adaptor.addChild(root_0, t2_tree);


            char_literal71=(Token)match(input,29,FOLLOW_29_in_pulloff1036); 
            char_literal71_tree = 
            (Object)adaptor.create(char_literal71)
            ;
            adaptor.addChild(root_0, char_literal71_tree);



                                                           principale.writePulloff(Integer.parseInt((c!=null?c.getText():null)), Integer.parseInt((t1!=null?t1.getText():null)), Integer.parseInt((t2!=null?t2.getText():null)));
                                                          

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pulloff"

    // Delegated rules


 

    public static final BitSet FOLLOW_START_in_start81 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_title_in_start83 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_author_in_start85 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_bar_in_start88 = new BitSet(new long[]{0x00000000009FD142L});
    public static final BitSet FOLLOW_sound_in_start90 = new BitSet(new long[]{0x00000000009FD142L});
    public static final BitSet FOLLOW_note_in_sound106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chord_in_sound112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_powerchord_in_sound118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strumming_in_sound124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slideup_in_sound130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slidedown_in_sound136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hammer_in_sound142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pulloff_in_sound148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pause_in_sound154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pause_g_in_sound160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newline_in_sound166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTHOR_in_author181 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_author183 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_WORD_in_author187 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_author232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BAR_in_bar247 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_bar249 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_bar253 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_bar255 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_bar259 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_bar292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_newline307 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_newline324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TITLE_in_title339 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_title341 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_WORD_in_title345 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_title371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTE_D_in_note386 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_note388 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_note392 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_note394 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_note398 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_note400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHORD_in_chord451 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_chord453 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_NOTE_in_chord457 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_chord459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POWERCHORD_in_powerchord500 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_powerchord502 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_powerchord506 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_powerchord508 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_powerchord512 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_powerchord514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUMMING_in_strumming569 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_strumming571 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_strumming575 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_strumming577 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_strumming581 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_strumming583 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_strumming587 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_strumming589 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_strumming593 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_strumming595 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_strumming599 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_strumming601 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_strumming605 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_strumming607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLIDEUP_in_slideup701 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_slideup703 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_slideup707 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_slideup709 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_slideup713 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_slideup715 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_slideup719 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_slideup721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLIDEDOWN_in_slidedown785 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_slidedown787 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_slidedown791 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_slidedown793 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_slidedown797 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_slidedown799 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_slidedown803 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_slidedown805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HAMMER_in_hammer871 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_hammer873 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_hammer877 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_hammer879 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_hammer883 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_hammer885 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_hammer889 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_hammer891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSE_in_pause954 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_pause969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSE_G_in_pause_g984 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_pause_g1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PULLOFF_in_pulloff1016 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_pulloff1018 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_pulloff1022 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_pulloff1024 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_pulloff1028 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_pulloff1030 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_pulloff1034 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_pulloff1036 = new BitSet(new long[]{0x0000000000000002L});

}