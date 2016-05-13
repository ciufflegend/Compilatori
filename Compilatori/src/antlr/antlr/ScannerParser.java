// $ANTLR 3.4 C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g 2016-05-13 15:54:43

    package antlr;
 

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

    String path;
    Main principale;

    public void init(){
      principale = new Main();
      }
      
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
      
      public void setOutputPath(String p){
      this.path =p;
      }
      
      


    // $ANTLR start "bar"
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:52:1: bar : 'BAR' '(' a= DIGIT '/' b= DIGIT ')' ;
    public final void bar() throws RecognitionException {
        Token a=null;
        Token b=null;

        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:52:5: ( 'BAR' '(' a= DIGIT '/' b= DIGIT ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:53:1: 'BAR' '(' a= DIGIT '/' b= DIGIT ')'
            {
            match(input,17,FOLLOW_17_in_bar52); 

            match(input,13,FOLLOW_13_in_bar54); 

            a=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_bar58); 

            a=a;




            match(input,16,FOLLOW_16_in_bar62); 

            b=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_bar66); 


            b=b;
            principale.setBattuta(a,b);



            match(input,14,FOLLOW_14_in_bar69); 

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
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:64:1: note : 'NOTE' '(' c= CORDA ',' t= TASTO ')' ;
    public final void note() throws RecognitionException {
        Token c=null;
        Token t=null;

        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:64:6: ( 'NOTE' '(' c= CORDA ',' t= TASTO ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:66:1: 'NOTE' '(' c= CORDA ',' t= TASTO ')'
            {
            match(input,20,FOLLOW_20_in_note79); 

            match(input,13,FOLLOW_13_in_note81); 

            c=(Token)match(input,CORDA,FOLLOW_CORDA_in_note85); 

            match(input,15,FOLLOW_15_in_note87); 

            t=(Token)match(input,TASTO,FOLLOW_TASTO_in_note91); 

            match(input,14,FOLLOW_14_in_note93); 


            principale.writeNota(c,t);


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
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:72:1: chord : 'CHORD' '(' n= NOTE ')' ;
    public final void chord() throws RecognitionException {
        Token n=null;

        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:72:7: ( 'CHORD' '(' n= NOTE ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:73:1: 'CHORD' '(' n= NOTE ')'
            {
            match(input,18,FOLLOW_18_in_chord104); 

            match(input,13,FOLLOW_13_in_chord106); 

            n=(Token)match(input,NOTE,FOLLOW_NOTE_in_chord110); 

            match(input,14,FOLLOW_14_in_chord112); 


            principale.writeChord(n);


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
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:79:1: powerchord : 'POWERCHORD' '(' n= NOTE ')' ;
    public final void powerchord() throws RecognitionException {
        Token n=null;

        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:79:11: ( 'POWERCHORD' '(' n= NOTE ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:80:1: 'POWERCHORD' '(' n= NOTE ')'
            {
            match(input,21,FOLLOW_21_in_powerchord122); 

            match(input,13,FOLLOW_13_in_powerchord124); 

            n=(Token)match(input,NOTE,FOLLOW_NOTE_in_powerchord128); 

            match(input,14,FOLLOW_14_in_powerchord130); 


            principale.writePowerchord(n);


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
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:86:1: strumming : 'STRUMMING' '(' a= TASTO ',' b= TASTO ',' c= TASTO ',' d= TASTO ',' e= TASTO ',' f= TASTO ')' ;
    public final void strumming() throws RecognitionException {
        Token a=null;
        Token b=null;
        Token c=null;
        Token d=null;
        Token e=null;
        Token f=null;

        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:86:10: ( 'STRUMMING' '(' a= TASTO ',' b= TASTO ',' c= TASTO ',' d= TASTO ',' e= TASTO ',' f= TASTO ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:87:1: 'STRUMMING' '(' a= TASTO ',' b= TASTO ',' c= TASTO ',' d= TASTO ',' e= TASTO ',' f= TASTO ')'
            {
            match(input,24,FOLLOW_24_in_strumming140); 

            match(input,13,FOLLOW_13_in_strumming142); 

            a=(Token)match(input,TASTO,FOLLOW_TASTO_in_strumming146); 

            match(input,15,FOLLOW_15_in_strumming148); 

            b=(Token)match(input,TASTO,FOLLOW_TASTO_in_strumming152); 

            match(input,15,FOLLOW_15_in_strumming154); 

            c=(Token)match(input,TASTO,FOLLOW_TASTO_in_strumming158); 

            match(input,15,FOLLOW_15_in_strumming160); 

            d=(Token)match(input,TASTO,FOLLOW_TASTO_in_strumming164); 

            match(input,15,FOLLOW_15_in_strumming166); 

            e=(Token)match(input,TASTO,FOLLOW_TASTO_in_strumming170); 

            match(input,15,FOLLOW_15_in_strumming172); 

            f=(Token)match(input,TASTO,FOLLOW_TASTO_in_strumming176); 

            match(input,14,FOLLOW_14_in_strumming178); 


            principale.writeStrumming(a,b,c,d,e,f);


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
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:96:1: slideup : 'SLIDEUP' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')' ;
    public final void slideup() throws RecognitionException {
        Token c=null;
        Token t1=null;
        Token t2=null;

        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:96:8: ( 'SLIDEUP' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:97:1: 'SLIDEUP' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')'
            {
            match(input,23,FOLLOW_23_in_slideup188); 

            match(input,13,FOLLOW_13_in_slideup190); 

            c=(Token)match(input,CORDA,FOLLOW_CORDA_in_slideup194); 

            match(input,15,FOLLOW_15_in_slideup196); 

            t1=(Token)match(input,TASTO,FOLLOW_TASTO_in_slideup201); 

            match(input,15,FOLLOW_15_in_slideup203); 

            t2=(Token)match(input,TASTO,FOLLOW_TASTO_in_slideup207); 

            match(input,14,FOLLOW_14_in_slideup209); 


            principale.writeSlideup(c, t1, t2);


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
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:104:1: slidedown : 'SLIDEDOWN' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')' ;
    public final void slidedown() throws RecognitionException {
        Token c=null;
        Token t1=null;
        Token t2=null;

        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:104:10: ( 'SLIDEDOWN' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:105:1: 'SLIDEDOWN' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')'
            {
            match(input,22,FOLLOW_22_in_slidedown220); 

            match(input,13,FOLLOW_13_in_slidedown222); 

            c=(Token)match(input,CORDA,FOLLOW_CORDA_in_slidedown226); 

            match(input,15,FOLLOW_15_in_slidedown228); 

            t1=(Token)match(input,TASTO,FOLLOW_TASTO_in_slidedown233); 

            match(input,15,FOLLOW_15_in_slidedown235); 

            t2=(Token)match(input,TASTO,FOLLOW_TASTO_in_slidedown239); 

            match(input,14,FOLLOW_14_in_slidedown241); 


            principale.writeSlideDown(c, t1 , t2);


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
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:112:1: hammer : 'HAMMER' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')' ;
    public final void hammer() throws RecognitionException {
        Token c=null;
        Token t1=null;
        Token t2=null;

        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:112:7: ( 'HAMMER' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:113:1: 'HAMMER' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')'
            {
            match(input,19,FOLLOW_19_in_hammer252); 

            match(input,13,FOLLOW_13_in_hammer254); 

            c=(Token)match(input,CORDA,FOLLOW_CORDA_in_hammer258); 

            match(input,15,FOLLOW_15_in_hammer260); 

            t1=(Token)match(input,TASTO,FOLLOW_TASTO_in_hammer265); 

            match(input,15,FOLLOW_15_in_hammer267); 

            t2=(Token)match(input,TASTO,FOLLOW_TASTO_in_hammer271); 

            match(input,14,FOLLOW_14_in_hammer273); 


            principale.writeHammer(c, t1, t2);


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
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:119:1: pulloff : 'pulloff' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')' ;
    public final void pulloff() throws RecognitionException {
        Token c=null;
        Token t1=null;
        Token t2=null;

        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:119:8: ( 'pulloff' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:120:1: 'pulloff' '(' c= CORDA ',' t1= TASTO ',' t2= TASTO ')'
            {
            match(input,25,FOLLOW_25_in_pulloff283); 

            match(input,13,FOLLOW_13_in_pulloff285); 

            c=(Token)match(input,CORDA,FOLLOW_CORDA_in_pulloff289); 

            match(input,15,FOLLOW_15_in_pulloff291); 

            t1=(Token)match(input,TASTO,FOLLOW_TASTO_in_pulloff296); 

            match(input,15,FOLLOW_15_in_pulloff298); 

            t2=(Token)match(input,TASTO,FOLLOW_TASTO_in_pulloff302); 

            match(input,14,FOLLOW_14_in_pulloff304); 


            principale.writePulloff(c, t1, t2);


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
    public static final BitSet FOLLOW_16_in_bar62 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DIGIT_in_bar66 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_bar69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_note79 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_note81 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CORDA_in_note85 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_note87 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_note91 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_note93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_chord104 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_chord106 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NOTE_in_chord110 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_chord112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_powerchord122 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_powerchord124 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NOTE_in_powerchord128 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_powerchord130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_strumming140 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_strumming142 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_strumming146 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_strumming148 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_strumming152 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_strumming154 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_strumming158 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_strumming160 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_strumming164 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_strumming166 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_strumming170 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_strumming172 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_strumming176 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_strumming178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_slideup188 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_slideup190 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CORDA_in_slideup194 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_slideup196 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_slideup201 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_slideup203 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_slideup207 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_slideup209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_slidedown220 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_slidedown222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CORDA_in_slidedown226 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_slidedown228 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_slidedown233 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_slidedown235 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_slidedown239 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_slidedown241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_hammer252 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_hammer254 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CORDA_in_hammer258 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_hammer260 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_hammer265 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_hammer267 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_hammer271 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_hammer273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_pulloff283 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_pulloff285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CORDA_in_pulloff289 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_pulloff291 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_pulloff296 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_pulloff298 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_pulloff302 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_pulloff304 = new BitSet(new long[]{0x0000000000000002L});

}