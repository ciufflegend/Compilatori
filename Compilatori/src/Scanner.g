grammar Scanner;

options {
  language = Java;
  output   = AST;
  k        = 1;
}

@header {
package antlr;
    import util.*;
}

@lexer::header {
package antlr;
}

@members {
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
}

start
@init {
init();
}
  :
  START title author? bar sound*
  ;

sound
  :
  note
  | chord
  | powerchord
  | strumming
  | slideup
  | slidedown
  | hammer
  | pulloff
  | pause
  | pause_g
  | newline
  ;

author
  :
  AUTHOR '(' t=WORD 
                    {
                     principale.writeAuthor($t.getText());
                    }
                    ')'
  ;

bar
  :
  BAR '(' a=INT '/' b=INT 
                          {
                           principale.setBattuta(Integer.valueOf($a.text), Integer.valueOf($b.text));
                           principale.writeBattuta(Integer.valueOf($a.text), Integer.valueOf($b.text));
                           principale.writeBar();
                          }
  ')'
  ;

newline
  :
  NEWLINE 
          {
           principale.newLine();
           //principale.writeBar();
          }
  '()'
  ;

title
  :
  TITLE '(' t=WORD 
                   {
                    principale.writeTitle($t.getText());
                   }
  ')'
  ;

note
  :
  NOTE_D '(' c=INT ',' t=INT ')' 
                                 {
                                  principale.writeNota(Integer.parseInt($c.text), Integer.parseInt($t.text));
                                 }
  ;

chord
  :
  CHORD '(' n=NOTE ')' 
                       {
                        principale.writeChord($n.text);
                       }
  ;

powerchord
  :
  POWERCHORD '(' c=INT ',' t=INT ')' 
                                     {
                                      principale.writePowerchord(Integer.parseInt($c.text), Integer.parseInt($t.text));
                                     }
  ;

strumming
  :
  STRUMMING '(' a=INT ',' b=INT ',' c=INT ',' d=INT ',' e=INT ',' f=INT ')' 
                                                                            {
                                                                             principale.writeStrumming($a.getText().charAt(0), $b.getText().charAt(0), $c.getText().charAt(0),
                                                                             		$d.getText().charAt(0), $e.getText().charAt(0), $f.getText().charAt(0));
                                                                            }
  ;

slideup
  :
  SLIDEUP '(' c=INT ',' t1=INT ',' t2=INT ')' 
                                              {
                                               principale.writeSlideup(Integer.parseInt($c.text), Integer.parseInt($t1.text), Integer.parseInt($t2.text));
                                              }
  ;

slidedown
  :
  SLIDEDOWN '(' c=INT ',' t1=INT ',' t2=INT ')' 
                                                {
                                                 principale.writeSlidedown(Integer.parseInt($c.text), Integer.parseInt($t1.text), Integer.parseInt($t2.text));
                                                }
  ;

hammer
  :
  HAMMER '(' c=INT ',' t1=INT ',' t2=INT ')' 
                                             {
                                              principale.writeHammer(Integer.parseInt($c.text), Integer.parseInt($t1.text), Integer.parseInt($t2.text));
                                             }
  ;

pause
  :
  PAUSE 
        {
         principale.writePause();
        }
  '()'
  ;

pause_g
  :
  PAUSE_G 
          {
           principale.writePauseG();
          }
  '()'
  ;

pulloff
  :
  PULLOFF '(' c=INT ',' t1=INT ',' t2=INT ')' 
                                              {
                                               principale.writePulloff(Integer.parseInt($c.text), Integer.parseInt($t1.text), Integer.parseInt($t2.text));
                                              }
  ;

fragment
DIGIT
  :
  '0'..'9'
  ;

fragment
LETTER
  :
  'a'..'z'|'_'
  ;

INT
  :
  DIGIT+
  | '-'
  ;

WORD
  :
  LETTER*
  ;

NOTE
  :
  'A'..'G'
  ;

NOTE_D
  :
  'NOTE'
  ;

START
  :
  'START'
  ;

BAR
  :
  'BAR'
  ;

CHORD
  :
  'CHORD'
  ;

POWERCHORD
  :
  'POWERCHORD'
  ;

STRUMMING
  :
  'STRUMMING'
  ;

SLIDEUP
  :
  'SLIDEUP'
  ;

SLIDEDOWN
  :
  'SLIDEDOWN'
  ;

HAMMER
  :
  'HAMMER'
  ;

PULLOFF
  :
  'PULLOFF'
  ;

PAUSE
  :
  'PAUSE'
  ;

PAUSE_G
  :
  'PAUSE_G'
  ;

TITLE
  :
  'TITLE'
  ;

NEWLINE
  :
  'LINE'
  ;

AUTHOR
  :
  'AUTHOR'
  ;

STRING_LITERAL
  :
  '\'' .* '\''
  ;

IDENT
  :
  LETTER
  (
    LETTER
    | DIGIT
  )*
  ;

WS
  :
  (
    ' '
    | '\t'
    | '\r'
    | '\n'
  )
  
   {
    skip();
    $channel = HIDDEN;
   }
  ;
