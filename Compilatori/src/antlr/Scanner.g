grammar Scanner;

options {
  language = Java;
}

@header{
    package antlr;
 }

@lexer::members{
  
  public void myFunction() {
  }
  public int myVar = 0;
}

DIGIT : '0'..'9';
TASTO : '1'* DIGIT|
'2'('0'..'4'); //range 0..24

fragment LETTER : 'a'..'z'|'A'..'Z' ;
fragment CORDA : '1'..'6';
NOTE : 'A'..'G';


STRING_LITERAL : '\''.*'\'';
INTEGER : DIGIT+ ;
IDENT : LETTER(LETTER | DIGIT)* ;

WS : (' ' | '\t' | '\n' | '\r' | '\f')+  {$channel=HIDDEN;};


bar :
'BAR' '(' DIGIT '/' DIGIT ')'
;

note :
'NOTE' '(' NOTE ')'|
'NOTE' '(' CORDA ',' TASTO ')'
;

chord :
'CHORD' '(' NOTE ')'
;

powerchord:
'POWERCHORD' '(' NOTE ')'
;

strumming:
'STRUMMING' '(' TASTO ',' TASTO ',' TASTO ',' TASTO ',' TASTO ',' TASTO ')'
;

slideup:
'SLIDEUP' '(' CORDA ','  TASTO ',' TASTO ')'|
'SLIDEUP' '(' CORDA ','  TASTO ')'
;

slidedown:
'SLIDEDOWN' '(' CORDA ','  TASTO ',' TASTO ')'|
'SLIDEDOWN' '(' CORDA ','  TASTO ')'
;

hammer:
'HAMMER' '(' CORDA ','  TASTO ',' TASTO ')'
;

pulloff:
'pulloff' '(' CORDA ','  TASTO ',' TASTO ')'
;