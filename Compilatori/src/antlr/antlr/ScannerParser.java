// $ANTLR 3.4 C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g 2016-05-16 17:30:10

    package antlr.antlr;
 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ScannerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CORDA", "DIGIT", "IDENT", "INTEGER", "LETTER", "NOTE", "STRING_LITERAL", "TASTO", "WS", "'('", "')'", "','", "'/'", "'BAR'", "'CHORD'", "'HAMMER'", "'NOTE'", "'POWERCHORD'", "'SLIDEDOWN'", "'SLIDEUP'", "'STRUMMING'", "'pulloff'"
    };

    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int CORDA=4;
    public static final int DIGIT=5;
    public static final int IDENT=6;
    public static final int INTEGER=7;
    public static final int LETTER=8;
    public static final int NOTE=9;
    public static final int STRING_LITERAL=10;
    public static final int TASTO=11;
    public static final int WS=12;

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

    public String[] getTokenNames() { return ScannerParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g"; }


    ArrayList<String> listaErrori = new ArrayList<String>();
    ArrayList<String> listaWarning = new ArrayList<String>();

    Main principale= new Main();
      
      
      public ArrayList<String> getListaErrori(){
      return listaErrori;
      }
      
      public int getNumeroErrori(){
      return listaErrori.size();
      }
      
     public ArrayList<String> getListaWarning(){
      return listaWarning;
      }
      
      public int getNumeroWarning(){
      return listaWarning.size();
      }
      
      


    // $ANTLR start "bar"
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:44:1: bar : 'BAR' '(' a= DIGIT '/' b= DIGIT ')' ;
    public final void bar() throws RecognitionException {
        Token a=null;
        Token b=null;

        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:44:5: ( 'BAR' '(' a= DIGIT '/' b= DIGIT ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:45:1: 'BAR' '(' a= DIGIT '/' b= DIGIT ')'
            {
            match(input,17,FOLLOW_17_in_bar52); 

            match(input,13,FOLLOW_13_in_bar54); 

            a=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_bar58); 

            match(input,16,FOLLOW_16_in_bar61); 

            b=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_bar65); 


            principale.setBattuta(Integer.parseInt(a.getText()),Integer.parseInt(b.getText()));


            match(input,14,FOLLOW_14_in_bar68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bar"



    // $ANTLR start "note"
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:51:1: note : 'NOTE' '(' c= CORDA ',' t= TASTO ')' ;
    public final void note() throws RecognitionException {
        Token c=null;
        Token t=null;

        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:51:6: ( 'NOTE' '(' c= CORDA ',' t= TASTO ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:53:1: 'NOTE' '(' c= CORDA ',' t= TASTO ')'
            {
            match(input,20,FOLLOW_20_in_note78); 

            match(input,13,FOLLOW_13_in_note80); 

            c=(Token)match(input,CORDA,FOLLOW_CORDA_in_note84); 

            match(input,15,FOLLOW_15_in_note86); 

            t=(Token)match(input,TASTO,FOLLOW_TASTO_in_note90); 

            match(input,14,FOLLOW_14_in_note92); 


            principale.writeNota(Integer.parseInt(c.getText()),Integer.parseInt(t.getText()));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "note"



    // $ANTLR start "chord"
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:58:1: chord : 'CHORD' '(' n= NOTE ')' ;
    public final void chord() throws RecognitionException {
        Token n=null;

        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:58:6: ( 'CHORD' '(' n= NOTE ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:59:1: 'CHORD' '(' n= NOTE ')'
            {
            match(input,18,FOLLOW_18_in_chord101); 

            match(input,13,FOLLOW_13_in_chord103); 

            n=(Token)match(input,NOTE,FOLLOW_NOTE_in_chord107); 

            match(input,14,FOLLOW_14_in_chord109); 


            principale.writeChord(n.getText().charAt(0));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "chord"



    // $ANTLR start "powerchord"
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:65:1: powerchord : 'POWERCHORD' '(' n= NOTE ')' ;
    public final void powerchord() throws RecognitionException {
        Token n=null;

        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:65:11: ( 'POWERCHORD' '(' n= NOTE ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:66:1: 'POWERCHORD' '(' n= NOTE ')'
            {
            match(input,21,FOLLOW_21_in_powerchord119); 

            match(input,13,FOLLOW_13_in_powerchord121); 

            n=(Token)match(input,NOTE,FOLLOW_NOTE_in_powerchord125); 

            match(input,14,FOLLOW_14_in_powerchord127); 


            principale.writePowerchord(n.getText().charAt(0));
;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "powerchord"



    // $ANTLR start "strumming"
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:72:1: strumming : 'STRUMMING' '(' a= TASTO ',' b= TASTO ',' c= TASTO ',' d= TASTO ',' e= TASTO ',' f= TASTO ')' ;
    public final void strumming() throws RecognitionException {
        Token a=null;
        Token b=null;
        Token c=null;
        Token d=null;
        Token e=null;
        Token f=null;

        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:72:10: ( 'STRUMMING' '(' a= TASTO ',' b= TASTO ',' c= TASTO ',' d= TASTO ',' e= TASTO ',' f= TASTO ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:73:1: 'STRUMMING' '(' a= TASTO ',' b= TASTO ',' c= TASTO ',' d= TASTO ',' e= TASTO ',' f= TASTO ')'
            {
            match(input,24,FOLLOW_24_in_strumming137); 

            match(input,13,FOLLOW_13_in_strumming139); 

            a=(Token)match(input,TASTO,FOLLOW_TASTO_in_strumming143); 

            match(input,15,FOLLOW_15_in_strumming145); 

            b=(Token)match(input,TASTO,FOLLOW_TASTO_in_strumming149); 

            match(input,15,FOLLOW_15_in_strumming151); 

            c=(Token)match(input,TASTO,FOLLOW_TASTO_in_strumming155); 

            match(input,15,FOLLOW_15_in_strumming157); 

            d=(Token)match(input,TASTO,FOLLOW_TASTO_in_strumming161); 

            match(input,15,FOLLOW_15_in_strumming163); 

            e=(Token)match(input,TASTO,FOLLOW_TASTO_in_strumming167); 

            match(input,15,FOLLOW_15_in_strumming169); 

            f=(Token)match(input,TASTO,FOLLOW_TASTO_in_strumming173); 

            match(input,14,FOLLOW_14_in_strumming175); 


            principale.writeStrumming(a.getText().charAt(0),b.getText().charAt(0),c.getText().charAt(0),d.getText().charAt(0),e.getText().charAt(0),f.getText().charAt(0));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "strumming"



    // $ANTLR start "slideup"
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:82:1: slideup : 'SLIDEUP' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')' ;
    public final void slideup() throws RecognitionException {
        Token c=null;
        Token t1=null;
        Token t2=null;

        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:82:8: ( 'SLIDEUP' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:83:1: 'SLIDEUP' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')'
            {
            match(input,23,FOLLOW_23_in_slideup185); 

            match(input,13,FOLLOW_13_in_slideup187); 

            c=(Token)match(input,CORDA,FOLLOW_CORDA_in_slideup191); 

            match(input,15,FOLLOW_15_in_slideup193); 

            t1=(Token)match(input,TASTO,FOLLOW_TASTO_in_slideup198); 

            match(input,15,FOLLOW_15_in_slideup200); 

            t2=(Token)match(input,TASTO,FOLLOW_TASTO_in_slideup204); 

            match(input,14,FOLLOW_14_in_slideup206); 


            principale.writeSlideup(Integer.parseInt(c.getText()), t1.getText().charAt(0), t2.getText().charAt(0));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "slideup"



    // $ANTLR start "slidedown"
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:90:1: slidedown : 'SLIDEDOWN' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')' ;
    public final void slidedown() throws RecognitionException {
        Token c=null;
        Token t1=null;
        Token t2=null;

        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:90:10: ( 'SLIDEDOWN' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:91:1: 'SLIDEDOWN' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')'
            {
            match(input,22,FOLLOW_22_in_slidedown217); 

            match(input,13,FOLLOW_13_in_slidedown219); 

            c=(Token)match(input,CORDA,FOLLOW_CORDA_in_slidedown223); 

            match(input,15,FOLLOW_15_in_slidedown225); 

            t1=(Token)match(input,TASTO,FOLLOW_TASTO_in_slidedown230); 

            match(input,15,FOLLOW_15_in_slidedown232); 

            t2=(Token)match(input,TASTO,FOLLOW_TASTO_in_slidedown236); 

            match(input,14,FOLLOW_14_in_slidedown238); 


            principale.writeSlidedown(Integer.parseInt(c.getText()), t1.getText().charAt(0), t2.getText().charAt(0));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "slidedown"



    // $ANTLR start "hammer"
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:98:1: hammer : 'HAMMER' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')' ;
    public final void hammer() throws RecognitionException {
        Token c=null;
        Token t1=null;
        Token t2=null;

        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:98:7: ( 'HAMMER' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:99:1: 'HAMMER' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')'
            {
            match(input,19,FOLLOW_19_in_hammer249); 

            match(input,13,FOLLOW_13_in_hammer251); 

            c=(Token)match(input,CORDA,FOLLOW_CORDA_in_hammer255); 

            match(input,15,FOLLOW_15_in_hammer257); 

            t1=(Token)match(input,TASTO,FOLLOW_TASTO_in_hammer262); 

            match(input,15,FOLLOW_15_in_hammer264); 

            t2=(Token)match(input,TASTO,FOLLOW_TASTO_in_hammer268); 

            match(input,14,FOLLOW_14_in_hammer270); 


            principale.writeHammer(Integer.parseInt(c.getText()), t1.getText().charAt(0), t2.getText().charAt(0));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "hammer"



    // $ANTLR start "pulloff"
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:105:1: pulloff : 'pulloff' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')' ;
    public final void pulloff() throws RecognitionException {
        Token c=null;
        Token t1=null;
        Token t2=null;

        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:105:8: ( 'pulloff' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:106:1: 'pulloff' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')'
            {
            match(input,25,FOLLOW_25_in_pulloff280); 

            match(input,13,FOLLOW_13_in_pulloff282); 

            c=(Token)match(input,CORDA,FOLLOW_CORDA_in_pulloff286); 

            match(input,15,FOLLOW_15_in_pulloff288); 

            t1=(Token)match(input,TASTO,FOLLOW_TASTO_in_pulloff293); 

            match(input,15,FOLLOW_15_in_pulloff295); 

            t2=(Token)match(input,TASTO,FOLLOW_TASTO_in_pulloff299); 

            match(input,14,FOLLOW_14_in_pulloff301); 


            principale.writePulloff(Integer.parseInt(c.getText()),Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText()));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "pulloff"

    // Delegated rules


 

    public static final BitSet FOLLOW_17_in_bar52 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_bar54 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DIGIT_in_bar58 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_bar61 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DIGIT_in_bar65 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_bar68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_note78 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_note80 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CORDA_in_note84 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_note86 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_note90 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_note92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_chord101 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_chord103 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NOTE_in_chord107 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_chord109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_powerchord119 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_powerchord121 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NOTE_in_powerchord125 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_powerchord127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_strumming137 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_strumming139 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_strumming143 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_strumming145 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_strumming149 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_strumming151 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_strumming155 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_strumming157 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_strumming161 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_strumming163 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_strumming167 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_strumming169 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_strumming173 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_strumming175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_slideup185 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_slideup187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CORDA_in_slideup191 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_slideup193 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_slideup198 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_slideup200 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_slideup204 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_slideup206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_slidedown217 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_slidedown219 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CORDA_in_slidedown223 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_slidedown225 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_slidedown230 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_slidedown232 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_slidedown236 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_slidedown238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_hammer249 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_hammer251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CORDA_in_hammer255 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_hammer257 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_hammer262 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_hammer264 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_hammer268 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_hammer270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_pulloff280 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_pulloff282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CORDA_in_pulloff286 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_pulloff288 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_pulloff293 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_pulloff295 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_pulloff299 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_pulloff301 = new BitSet(new long[]{0x0000000000000002L});

}