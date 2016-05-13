// $ANTLR 3.4 C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g 2016-05-13 11:02:08

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



    // $ANTLR start "bar"
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:22:1: bar : 'BAR' '(' DIGIT '/' DIGIT ')' ;
    public final void bar() throws RecognitionException {
        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:22:5: ( 'BAR' '(' DIGIT '/' DIGIT ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:23:1: 'BAR' '(' DIGIT '/' DIGIT ')'
            {
            match(input,17,FOLLOW_17_in_bar47); 

            match(input,13,FOLLOW_13_in_bar49); 

            match(input,DIGIT,FOLLOW_DIGIT_in_bar51); 

            match(input,16,FOLLOW_16_in_bar53); 

            match(input,DIGIT,FOLLOW_DIGIT_in_bar55); 

            match(input,14,FOLLOW_14_in_bar57); 

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
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:26:1: note : 'NOTE' '(' CORDA ',' TASTO ')' ;
    public final void note() throws RecognitionException {
        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:26:6: ( 'NOTE' '(' CORDA ',' TASTO ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:28:1: 'NOTE' '(' CORDA ',' TASTO ')'
            {
            match(input,20,FOLLOW_20_in_note67); 

            match(input,13,FOLLOW_13_in_note69); 

            match(input,CORDA,FOLLOW_CORDA_in_note71); 

            match(input,15,FOLLOW_15_in_note73); 

            match(input,TASTO,FOLLOW_TASTO_in_note75); 

            match(input,14,FOLLOW_14_in_note77); 

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
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:31:1: chord : 'CHORD' '(' NOTE ')' ;
    public final void chord() throws RecognitionException {
        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:31:7: ( 'CHORD' '(' NOTE ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:32:1: 'CHORD' '(' NOTE ')'
            {
            match(input,18,FOLLOW_18_in_chord86); 

            match(input,13,FOLLOW_13_in_chord88); 

            match(input,NOTE,FOLLOW_NOTE_in_chord90); 

            match(input,14,FOLLOW_14_in_chord92); 

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
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:35:1: powerchord : 'POWERCHORD' '(' NOTE ')' ;
    public final void powerchord() throws RecognitionException {
        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:35:11: ( 'POWERCHORD' '(' NOTE ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:36:1: 'POWERCHORD' '(' NOTE ')'
            {
            match(input,21,FOLLOW_21_in_powerchord100); 

            match(input,13,FOLLOW_13_in_powerchord102); 

            match(input,NOTE,FOLLOW_NOTE_in_powerchord104); 

            match(input,14,FOLLOW_14_in_powerchord106); 

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
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:39:1: strumming : 'STRUMMING' '(' TASTO ',' TASTO ',' TASTO ',' TASTO ',' TASTO ',' TASTO ')' ;
    public final void strumming() throws RecognitionException {
        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:39:10: ( 'STRUMMING' '(' TASTO ',' TASTO ',' TASTO ',' TASTO ',' TASTO ',' TASTO ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:40:1: 'STRUMMING' '(' TASTO ',' TASTO ',' TASTO ',' TASTO ',' TASTO ',' TASTO ')'
            {
            match(input,24,FOLLOW_24_in_strumming114); 

            match(input,13,FOLLOW_13_in_strumming116); 

            match(input,TASTO,FOLLOW_TASTO_in_strumming118); 

            match(input,15,FOLLOW_15_in_strumming120); 

            match(input,TASTO,FOLLOW_TASTO_in_strumming122); 

            match(input,15,FOLLOW_15_in_strumming124); 

            match(input,TASTO,FOLLOW_TASTO_in_strumming126); 

            match(input,15,FOLLOW_15_in_strumming128); 

            match(input,TASTO,FOLLOW_TASTO_in_strumming130); 

            match(input,15,FOLLOW_15_in_strumming132); 

            match(input,TASTO,FOLLOW_TASTO_in_strumming134); 

            match(input,15,FOLLOW_15_in_strumming136); 

            match(input,TASTO,FOLLOW_TASTO_in_strumming138); 

            match(input,14,FOLLOW_14_in_strumming140); 

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
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:43:1: slideup : ( 'SLIDEUP' '(' CORDA ',' TASTO ',' TASTO ')' |);
    public final void slideup() throws RecognitionException {
        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:43:8: ( 'SLIDEUP' '(' CORDA ',' TASTO ',' TASTO ')' |)
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==EOF) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:44:1: 'SLIDEUP' '(' CORDA ',' TASTO ',' TASTO ')'
                    {
                    match(input,23,FOLLOW_23_in_slideup148); 

                    match(input,13,FOLLOW_13_in_slideup150); 

                    match(input,CORDA,FOLLOW_CORDA_in_slideup152); 

                    match(input,15,FOLLOW_15_in_slideup154); 

                    match(input,TASTO,FOLLOW_TASTO_in_slideup157); 

                    match(input,15,FOLLOW_15_in_slideup159); 

                    match(input,TASTO,FOLLOW_TASTO_in_slideup161); 

                    match(input,14,FOLLOW_14_in_slideup163); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:46:45: 
                    {
                    }
                    break;

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
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:48:1: slidedown : ( 'SLIDEDOWN' '(' CORDA ',' TASTO ',' TASTO ')' |);
    public final void slidedown() throws RecognitionException {
        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:48:10: ( 'SLIDEDOWN' '(' CORDA ',' TASTO ',' TASTO ')' |)
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:49:1: 'SLIDEDOWN' '(' CORDA ',' TASTO ',' TASTO ')'
                    {
                    match(input,22,FOLLOW_22_in_slidedown173); 

                    match(input,13,FOLLOW_13_in_slidedown175); 

                    match(input,CORDA,FOLLOW_CORDA_in_slidedown177); 

                    match(input,15,FOLLOW_15_in_slidedown179); 

                    match(input,TASTO,FOLLOW_TASTO_in_slidedown182); 

                    match(input,15,FOLLOW_15_in_slidedown184); 

                    match(input,TASTO,FOLLOW_TASTO_in_slidedown186); 

                    match(input,14,FOLLOW_14_in_slidedown188); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:51:47: 
                    {
                    }
                    break;

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
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:53:1: hammer : 'HAMMER' '(' CORDA ',' TASTO ',' TASTO ')' ;
    public final void hammer() throws RecognitionException {
        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:53:7: ( 'HAMMER' '(' CORDA ',' TASTO ',' TASTO ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:54:1: 'HAMMER' '(' CORDA ',' TASTO ',' TASTO ')'
            {
            match(input,19,FOLLOW_19_in_hammer198); 

            match(input,13,FOLLOW_13_in_hammer200); 

            match(input,CORDA,FOLLOW_CORDA_in_hammer202); 

            match(input,15,FOLLOW_15_in_hammer204); 

            match(input,TASTO,FOLLOW_TASTO_in_hammer207); 

            match(input,15,FOLLOW_15_in_hammer209); 

            match(input,TASTO,FOLLOW_TASTO_in_hammer211); 

            match(input,14,FOLLOW_14_in_hammer213); 

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
    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:57:1: pulloff : 'pulloff' '(' CORDA ',' TASTO ',' TASTO ')' ;
    public final void pulloff() throws RecognitionException {
        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:57:8: ( 'pulloff' '(' CORDA ',' TASTO ',' TASTO ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:58:1: 'pulloff' '(' CORDA ',' TASTO ',' TASTO ')'
            {
            match(input,25,FOLLOW_25_in_pulloff221); 

            match(input,13,FOLLOW_13_in_pulloff223); 

            match(input,CORDA,FOLLOW_CORDA_in_pulloff225); 

            match(input,15,FOLLOW_15_in_pulloff227); 

            match(input,TASTO,FOLLOW_TASTO_in_pulloff230); 

            match(input,15,FOLLOW_15_in_pulloff232); 

            match(input,TASTO,FOLLOW_TASTO_in_pulloff234); 

            match(input,14,FOLLOW_14_in_pulloff236); 

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


 

    public static final BitSet FOLLOW_17_in_bar47 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_bar49 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DIGIT_in_bar51 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_bar53 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DIGIT_in_bar55 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_bar57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_note67 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_note69 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CORDA_in_note71 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_note73 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_note75 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_note77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_chord86 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_chord88 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NOTE_in_chord90 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_chord92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_powerchord100 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_powerchord102 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NOTE_in_powerchord104 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_powerchord106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_strumming114 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_strumming116 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_strumming118 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_strumming120 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_strumming122 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_strumming124 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_strumming126 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_strumming128 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_strumming130 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_strumming132 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_strumming134 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_strumming136 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_strumming138 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_strumming140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_slideup148 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_slideup150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CORDA_in_slideup152 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_slideup154 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_slideup157 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_slideup159 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_slideup161 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_slideup163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_slidedown173 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_slidedown175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CORDA_in_slidedown177 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_slidedown179 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_slidedown182 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_slidedown184 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_slidedown186 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_slidedown188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_hammer198 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_hammer200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CORDA_in_hammer202 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_hammer204 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_hammer207 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_hammer209 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_hammer211 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_hammer213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_pulloff221 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_pulloff223 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CORDA_in_pulloff225 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_pulloff227 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_pulloff230 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_pulloff232 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TASTO_in_pulloff234 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_pulloff236 = new BitSet(new long[]{0x0000000000000002L});

}