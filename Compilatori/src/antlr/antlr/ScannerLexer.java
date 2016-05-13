package antlr.antlr;

// $ANTLR 3.4 C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\antlr\\Scanner.g 2016-05-13 11:02:08

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ScannerLexer extends Lexer {
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

      
      public void myFunction() {
      }
      public int myVar = 0;


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ScannerLexer() {} 
    public ScannerLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ScannerLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:14:7: ( '(' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:14:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:15:7: ( ')' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:15:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:16:7: ( ',' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:17:7: ( '/' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:17:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:18:7: ( 'BAR' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:18:9: 'BAR'
            {
            match("BAR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:19:7: ( 'CHORD' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:19:9: 'CHORD'
            {
            match("CHORD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:20:7: ( 'HAMMER' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:20:9: 'HAMMER'
            {
            match("HAMMER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:21:7: ( 'NOTE' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:21:9: 'NOTE'
            {
            match("NOTE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:22:7: ( 'POWERCHORD' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:22:9: 'POWERCHORD'
            {
            match("POWERCHORD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:23:7: ( 'SLIDEDOWN' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:23:9: 'SLIDEDOWN'
            {
            match("SLIDEDOWN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:24:7: ( 'SLIDEUP' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:24:9: 'SLIDEUP'
            {
            match("SLIDEUP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:25:7: ( 'STRUMMING' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:25:9: 'STRUMMING'
            {
            match("STRUMMING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:26:7: ( 'pulloff' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:26:9: 'pulloff'
            {
            match("pulloff"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:61:7: ( '0' .. '9' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "TASTO"
    public final void mTASTO() throws RecognitionException {
        try {
            int _type = TASTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:62:7: ( ( '1' )* DIGIT | '2' ( '0' .. '4' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= '0' && LA2_0 <= '1')||(LA2_0 >= '3' && LA2_0 <= '9')) ) {
                alt2=1;
            }
            else if ( (LA2_0=='2') ) {
                int LA2_2 = input.LA(2);

                if ( ((LA2_2 >= '0' && LA2_2 <= '4')) ) {
                    alt2=2;
                }
                else {
                    alt2=1;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:62:9: ( '1' )* DIGIT
                    {
                    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:62:9: ( '1' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='1') ) {
                            int LA1_1 = input.LA(2);

                            if ( ((LA1_1 >= '0' && LA1_1 <= '9')) ) {
                                alt1=1;
                            }


                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:62:9: '1'
                    	    {
                    	    match('1'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    mDIGIT(); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:63:1: '2' ( '0' .. '4' )
                    {
                    match('2'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '4') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TASTO"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:65:17: ( 'a' .. 'z' | 'A' .. 'Z' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "CORDA"
    public final void mCORDA() throws RecognitionException {
        try {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:66:16: ( '1' .. '6' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:
            {
            if ( (input.LA(1) >= '1' && input.LA(1) <= '6') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CORDA"

    // $ANTLR start "NOTE"
    public final void mNOTE() throws RecognitionException {
        try {
            int _type = NOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:67:6: ( 'A' .. 'G' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'G') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTE"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:70:16: ( '\\'' ( . )* '\\'' )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:70:18: '\\'' ( . )* '\\''
            {
            match('\''); 

            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:70:22: ( . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\'') ) {
                    alt3=2;
                }
                else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '&')||(LA3_0 >= '(' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:70:22: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:71:9: ( ( DIGIT )+ )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:71:11: ( DIGIT )+
            {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:71:11: ( DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:72:7: ( LETTER ( LETTER | DIGIT )* )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:72:9: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 


            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:72:15: ( LETTER | DIGIT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:74:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:74:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:74:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||(LA6_0 >= '\f' && LA6_0 <= '\r')||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | DIGIT | TASTO | NOTE | STRING_LITERAL | INTEGER | IDENT | WS )
        int alt7=20;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:1:10: T__13
                {
                mT__13(); 


                }
                break;
            case 2 :
                // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:1:16: T__14
                {
                mT__14(); 


                }
                break;
            case 3 :
                // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:1:22: T__15
                {
                mT__15(); 


                }
                break;
            case 4 :
                // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:1:28: T__16
                {
                mT__16(); 


                }
                break;
            case 5 :
                // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:1:34: T__17
                {
                mT__17(); 


                }
                break;
            case 6 :
                // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:1:40: T__18
                {
                mT__18(); 


                }
                break;
            case 7 :
                // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:1:46: T__19
                {
                mT__19(); 


                }
                break;
            case 8 :
                // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:1:52: T__20
                {
                mT__20(); 


                }
                break;
            case 9 :
                // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:1:58: T__21
                {
                mT__21(); 


                }
                break;
            case 10 :
                // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:1:64: T__22
                {
                mT__22(); 


                }
                break;
            case 11 :
                // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:1:70: T__23
                {
                mT__23(); 


                }
                break;
            case 12 :
                // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:1:76: T__24
                {
                mT__24(); 


                }
                break;
            case 13 :
                // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:1:82: T__25
                {
                mT__25(); 


                }
                break;
            case 14 :
                // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:1:88: DIGIT
                {
                mDIGIT(); 


                }
                break;
            case 15 :
                // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:1:94: TASTO
                {
                mTASTO(); 


                }
                break;
            case 16 :
                // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:1:100: NOTE
                {
                mNOTE(); 


                }
                break;
            case 17 :
                // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:1:105: STRING_LITERAL
                {
                mSTRING_LITERAL(); 


                }
                break;
            case 18 :
                // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:1:120: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 19 :
                // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:1:128: IDENT
                {
                mIDENT(); 


                }
                break;
            case 20 :
                // C:\\Users\\ciuff\\git\\Compilatori\\Compilatori\\src\\antlr\\Scanner.g:1:134: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\5\uffff\2\24\5\21\3\34\1\24\3\uffff\1\21\1\uffff\7\21\1\uffff\3"+
        "\51\1\uffff\1\52\7\21\2\uffff\2\21\1\64\4\21\1\71\1\21\1\uffff\4"+
        "\21\1\uffff\1\100\5\21\1\uffff\2\21\1\110\1\21\1\112\2\21\1\uffff"+
        "\1\21\1\uffff\1\21\1\117\1\120\1\121\3\uffff";
    static final String DFA7_eofS =
        "\122\uffff";
    static final String DFA7_minS =
        "\1\11\4\uffff\2\60\1\101\2\117\1\114\1\165\4\60\3\uffff\1\122\1"+
        "\uffff\1\117\1\115\1\124\1\127\1\111\1\122\1\154\1\uffff\3\60\1"+
        "\uffff\1\60\1\122\1\115\2\105\1\104\1\125\1\154\2\uffff\1\104\1"+
        "\105\1\60\1\122\1\105\1\115\1\157\1\60\1\122\1\uffff\1\103\1\104"+
        "\1\115\1\146\1\uffff\1\60\1\110\1\117\1\120\1\111\1\146\1\uffff"+
        "\1\117\1\127\1\60\1\116\1\60\1\122\1\116\1\uffff\1\107\1\uffff\1"+
        "\104\3\60\3\uffff";
    static final String DFA7_maxS =
        "\1\172\4\uffff\2\172\1\101\2\117\1\124\1\165\3\71\1\172\3\uffff"+
        "\1\122\1\uffff\1\117\1\115\1\124\1\127\1\111\1\122\1\154\1\uffff"+
        "\3\71\1\uffff\1\172\1\122\1\115\2\105\1\104\1\125\1\154\2\uffff"+
        "\1\104\1\105\1\172\1\122\1\105\1\115\1\157\1\172\1\122\1\uffff\1"+
        "\103\1\125\1\115\1\146\1\uffff\1\172\1\110\1\117\1\120\1\111\1\146"+
        "\1\uffff\1\117\1\127\1\172\1\116\1\172\1\122\1\116\1\uffff\1\107"+
        "\1\uffff\1\104\3\172\3\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\13\uffff\1\21\1\23\1\24\1\uffff\1\20\7"+
        "\uffff\1\16\3\uffff\1\22\10\uffff\1\17\1\5\11\uffff\1\10\4\uffff"+
        "\1\6\6\uffff\1\7\7\uffff\1\13\1\uffff\1\15\4\uffff\1\12\1\14\1\11";
    static final String DFA7_specialS =
        "\122\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\22\1\uffff\2\22\22\uffff\1\22\6\uffff\1\20\1\1\1\2\2\uffff"+
            "\1\3\2\uffff\1\4\1\16\1\14\1\15\7\16\7\uffff\1\17\1\5\1\6\4"+
            "\17\1\7\5\21\1\10\1\21\1\11\2\21\1\12\7\21\6\uffff\17\21\1\13"+
            "\12\21",
            "",
            "",
            "",
            "",
            "\12\21\7\uffff\1\23\31\21\6\uffff\32\21",
            "\12\21\7\uffff\7\21\1\25\22\21\6\uffff\32\21",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31\7\uffff\1\32",
            "\1\33",
            "\1\36\1\35\10\36",
            "\5\37\5\40",
            "\12\40",
            "\12\21\7\uffff\32\21\6\uffff\32\21",
            "",
            "",
            "",
            "\1\41",
            "",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "",
            "\1\36\1\35\10\36",
            "\12\40",
            "\12\40",
            "",
            "\12\21\7\uffff\32\21\6\uffff\32\21",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "\1\62",
            "\1\63",
            "\12\21\7\uffff\32\21\6\uffff\32\21",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\12\21\7\uffff\32\21\6\uffff\32\21",
            "\1\72",
            "",
            "\1\73",
            "\1\74\20\uffff\1\75",
            "\1\76",
            "\1\77",
            "",
            "\12\21\7\uffff\32\21\6\uffff\32\21",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "\12\21\7\uffff\32\21\6\uffff\32\21",
            "\1\111",
            "\12\21\7\uffff\32\21\6\uffff\32\21",
            "\1\113",
            "\1\114",
            "",
            "\1\115",
            "",
            "\1\116",
            "\12\21\7\uffff\32\21\6\uffff\32\21",
            "\12\21\7\uffff\32\21\6\uffff\32\21",
            "\12\21\7\uffff\32\21\6\uffff\32\21",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | DIGIT | TASTO | NOTE | STRING_LITERAL | INTEGER | IDENT | WS );";
        }
    }
 

}