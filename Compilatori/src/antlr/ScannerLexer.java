// $ANTLR 3.4 C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g 2016-06-01 08:46:31

package antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ScannerLexer extends Lexer {
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
    public String getGrammarFileName() { return "C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g"; }

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:11:7: ( '(' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:11:9: '('
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:12:7: ( '()' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:12:9: '()'
            {
            match("()"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:13:7: ( ')' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:13:9: ')'
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:14:7: ( ',' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:14:9: ','
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:15:7: ( '/' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:15:9: '/'
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
    // $ANTLR end "T__31"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:184:3: ( '0' .. '9' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:
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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:190:3: ( 'a' .. 'z' | '_' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:
            {
            if ( input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:194:3: ( ( DIGIT )+ | '-' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                alt2=1;
            }
            else if ( (LA2_0=='-') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:195:3: ( DIGIT )+
                    {
                    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:195:3: ( DIGIT )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:
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
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:196:5: '-'
                    {
                    match('-'); 

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
    // $ANTLR end "INT"

    // $ANTLR start "WORD"
    public final void mWORD() throws RecognitionException {
        try {
            int _type = WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:200:3: ( ( LETTER )* )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:201:3: ( LETTER )*
            {
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:201:3: ( LETTER )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:
            	    {
            	    if ( input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    break loop3;
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
    // $ANTLR end "WORD"

    // $ANTLR start "NOTE"
    public final void mNOTE() throws RecognitionException {
        try {
            int _type = NOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:205:3: ( 'A' .. 'G' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:
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

    // $ANTLR start "NOTE_D"
    public final void mNOTE_D() throws RecognitionException {
        try {
            int _type = NOTE_D;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:210:3: ( 'NOTE' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:211:3: 'NOTE'
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
    // $ANTLR end "NOTE_D"

    // $ANTLR start "START"
    public final void mSTART() throws RecognitionException {
        try {
            int _type = START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:215:3: ( 'START' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:216:3: 'START'
            {
            match("START"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "START"

    // $ANTLR start "BAR"
    public final void mBAR() throws RecognitionException {
        try {
            int _type = BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:220:3: ( 'BAR' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:221:3: 'BAR'
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
    // $ANTLR end "BAR"

    // $ANTLR start "CHORD"
    public final void mCHORD() throws RecognitionException {
        try {
            int _type = CHORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:225:3: ( 'CHORD' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:226:3: 'CHORD'
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
    // $ANTLR end "CHORD"

    // $ANTLR start "POWERCHORD"
    public final void mPOWERCHORD() throws RecognitionException {
        try {
            int _type = POWERCHORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:230:3: ( 'POWERCHORD' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:231:3: 'POWERCHORD'
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
    // $ANTLR end "POWERCHORD"

    // $ANTLR start "STRUMMING"
    public final void mSTRUMMING() throws RecognitionException {
        try {
            int _type = STRUMMING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:235:3: ( 'STRUMMING' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:236:3: 'STRUMMING'
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
    // $ANTLR end "STRUMMING"

    // $ANTLR start "SLIDEUP"
    public final void mSLIDEUP() throws RecognitionException {
        try {
            int _type = SLIDEUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:240:3: ( 'SLIDEUP' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:241:3: 'SLIDEUP'
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
    // $ANTLR end "SLIDEUP"

    // $ANTLR start "SLIDEDOWN"
    public final void mSLIDEDOWN() throws RecognitionException {
        try {
            int _type = SLIDEDOWN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:245:3: ( 'SLIDEDOWN' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:246:3: 'SLIDEDOWN'
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
    // $ANTLR end "SLIDEDOWN"

    // $ANTLR start "HAMMER"
    public final void mHAMMER() throws RecognitionException {
        try {
            int _type = HAMMER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:250:3: ( 'HAMMER' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:251:3: 'HAMMER'
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
    // $ANTLR end "HAMMER"

    // $ANTLR start "PULLOFF"
    public final void mPULLOFF() throws RecognitionException {
        try {
            int _type = PULLOFF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:255:3: ( 'PULLOFF' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:256:3: 'PULLOFF'
            {
            match("PULLOFF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PULLOFF"

    // $ANTLR start "PAUSE"
    public final void mPAUSE() throws RecognitionException {
        try {
            int _type = PAUSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:260:3: ( 'PAUSE' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:261:3: 'PAUSE'
            {
            match("PAUSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PAUSE"

    // $ANTLR start "PAUSE_G"
    public final void mPAUSE_G() throws RecognitionException {
        try {
            int _type = PAUSE_G;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:265:3: ( 'PAUSE_G' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:266:3: 'PAUSE_G'
            {
            match("PAUSE_G"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PAUSE_G"

    // $ANTLR start "TITLE"
    public final void mTITLE() throws RecognitionException {
        try {
            int _type = TITLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:270:3: ( 'TITLE' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:271:3: 'TITLE'
            {
            match("TITLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TITLE"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:275:3: ( 'LINE' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:276:3: 'LINE'
            {
            match("LINE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "AUTHOR"
    public final void mAUTHOR() throws RecognitionException {
        try {
            int _type = AUTHOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:280:3: ( 'AUTHOR' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:281:3: 'AUTHOR'
            {
            match("AUTHOR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AUTHOR"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:285:3: ( '\\'' ( . )* '\\'' )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:286:3: '\\'' ( . )* '\\''
            {
            match('\''); 

            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:286:8: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\'') ) {
                    alt4=2;
                }
                else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '&')||(LA4_0 >= '(' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:286:8: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
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

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:290:3: ( LETTER ( LETTER | DIGIT )* )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:291:3: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 


            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:292:3: ( LETTER | DIGIT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:299:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:300:3: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }



                skip();
                _channel = HIDDEN;
               

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
        // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | INT | WORD | NOTE | NOTE_D | START | BAR | CHORD | POWERCHORD | STRUMMING | SLIDEUP | SLIDEDOWN | HAMMER | PULLOFF | PAUSE | PAUSE_G | TITLE | NEWLINE | AUTHOR | STRING_LITERAL | IDENT | WS )
        int alt6=26;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:10: T__27
                {
                mT__27(); 


                }
                break;
            case 2 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:16: T__28
                {
                mT__28(); 


                }
                break;
            case 3 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:22: T__29
                {
                mT__29(); 


                }
                break;
            case 4 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:28: T__30
                {
                mT__30(); 


                }
                break;
            case 5 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:34: T__31
                {
                mT__31(); 


                }
                break;
            case 6 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:40: INT
                {
                mINT(); 


                }
                break;
            case 7 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:44: WORD
                {
                mWORD(); 


                }
                break;
            case 8 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:49: NOTE
                {
                mNOTE(); 


                }
                break;
            case 9 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:54: NOTE_D
                {
                mNOTE_D(); 


                }
                break;
            case 10 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:61: START
                {
                mSTART(); 


                }
                break;
            case 11 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:67: BAR
                {
                mBAR(); 


                }
                break;
            case 12 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:71: CHORD
                {
                mCHORD(); 


                }
                break;
            case 13 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:77: POWERCHORD
                {
                mPOWERCHORD(); 


                }
                break;
            case 14 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:88: STRUMMING
                {
                mSTRUMMING(); 


                }
                break;
            case 15 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:98: SLIDEUP
                {
                mSLIDEUP(); 


                }
                break;
            case 16 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:106: SLIDEDOWN
                {
                mSLIDEDOWN(); 


                }
                break;
            case 17 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:116: HAMMER
                {
                mHAMMER(); 


                }
                break;
            case 18 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:123: PULLOFF
                {
                mPULLOFF(); 


                }
                break;
            case 19 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:131: PAUSE
                {
                mPAUSE(); 


                }
                break;
            case 20 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:137: PAUSE_G
                {
                mPAUSE_G(); 


                }
                break;
            case 21 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:145: TITLE
                {
                mTITLE(); 


                }
                break;
            case 22 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:151: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 23 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:159: AUTHOR
                {
                mAUTHOR(); 


                }
                break;
            case 24 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:166: STRING_LITERAL
                {
                mSTRING_LITERAL(); 


                }
                break;
            case 25 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:181: IDENT
                {
                mIDENT(); 


                }
                break;
            case 26 :
                // C:\\Users\\andre\\git\\TabCoding\\Compilatori\\src\\Scanner.g:1:187: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\7\1\25\4\uffff\1\7\1\uffff\1\21\2\uffff\2\21\11\uffff\1\7\20"+
        "\uffff\1\53\4\uffff";
    static final String DFA6_eofS =
        "\54\uffff";
    static final String DFA6_minS =
        "\1\11\1\51\4\uffff\1\60\1\uffff\1\101\1\uffff\1\114\1\110\1\125"+
        "\1\101\10\uffff\1\60\2\uffff\1\101\1\111\4\uffff\1\125\2\uffff\1"+
        "\104\1\123\2\105\1\104\1\137\4\uffff";
    static final String DFA6_maxS =
        "\1\172\1\51\4\uffff\1\172\1\uffff\1\101\1\uffff\1\124\1\110\2\125"+
        "\10\uffff\1\172\2\uffff\1\122\1\111\4\uffff\1\125\2\uffff\1\104"+
        "\1\123\2\105\1\125\1\137\4\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\uffff\1\11\4\uffff\1\21\1"+
        "\25\1\26\1\10\1\30\1\32\1\2\1\1\1\uffff\1\31\1\13\2\uffff\1\14\1"+
        "\27\1\15\1\22\1\uffff\1\12\1\16\6\uffff\1\17\1\20\1\24\1\23";
    static final String DFA6_specialS =
        "\54\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\23\2\uffff\1\23\22\uffff\1\23\6\uffff\1\22\1\1\1\2\2\uffff"+
            "\1\3\1\5\1\uffff\1\4\12\5\7\uffff\1\14\1\10\1\13\4\21\1\16\3"+
            "\uffff\1\20\1\uffff\1\11\1\uffff\1\15\2\uffff\1\12\1\17\12\uffff"+
            "\1\6\1\uffff\32\6",
            "\1\24",
            "",
            "",
            "",
            "",
            "\12\27\45\uffff\1\26\1\uffff\32\26",
            "",
            "\1\30",
            "",
            "\1\32\7\uffff\1\31",
            "\1\33",
            "\1\34",
            "\1\37\15\uffff\1\35\5\uffff\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\27\45\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\1\40\20\uffff\1\41",
            "\1\42",
            "",
            "",
            "",
            "",
            "\1\43",
            "",
            "",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\51\20\uffff\1\50",
            "\1\52",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | INT | WORD | NOTE | NOTE_D | START | BAR | CHORD | POWERCHORD | STRUMMING | SLIDEUP | SLIDEDOWN | HAMMER | PULLOFF | PAUSE | PAUSE_G | TITLE | NEWLINE | AUTHOR | STRING_LITERAL | IDENT | WS );";
        }
    }
 

}