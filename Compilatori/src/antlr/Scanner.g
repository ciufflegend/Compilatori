grammar Scanner;

options {
  language = Java;
  k=1;
}

@header{
    package antlr;
 }

@lexer::members{
  
  public void myFunction() {
  }
  public int myVar = 0;
}

@members {
ArrayList<String> listaErrori = new ArrayList<String>();
ArrayList<String> listaWarning = new ArrayList<String>();

Main principale = new Main();
  
  
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
  
  }
  
bar :
'BAR' '(' a=DIGIT 
'/' b=DIGIT{
principale.setBattuta($a,$b);
} ')'
;

note :
//'NOTE' '(' NOTE ')'|
'NOTE' '(' c=CORDA ',' t=TASTO ')'
{
principale.writeNota($c,$t);
}
;
chord:
'CHORD' '(' n=NOTE ')'
{
principale.writeChord($n);
}
;

powerchord:
'POWERCHORD' '(' n=NOTE ')'
{
principale.writePowerchord($n);
}
;

strumming:
'STRUMMING' '('
a=TASTO ',' b=TASTO ','
c=TASTO ',' d=TASTO ','
e=TASTO ',' f=TASTO ')'
{
principale.writeStrumming($a,$b,$c,$d,$e,$f);
}
;

slideup:
'SLIDEUP' '(' c=CORDA ','  t1=TASTO ',' t2=TASTO ')'
//'SLIDEUP' '(' CORDA ','  TASTO ')'
{
principale.writeSlideup($c, $t1, $t2);
}
;

slidedown:
'SLIDEDOWN' '(' c=CORDA ','  t1=TASTO ',' t2=TASTO ')'
//'SLIDEDOWN' '(' CORDA ','  TASTO ')'
{
principale.writeSlidedown($c, $t1 , $t2);
}
;

hammer:
'HAMMER' '(' c=CORDA ','  t1=TASTO ',' t2=TASTO ')'
{
principale.writeHammer($c, $t1, $t2);
}
;

pulloff:
'pulloff' '(' c=CORDA ','  t1=TASTO ',' t2=TASTO ')'
{
principale.writePulloff($c, $t1, $t2);
}
;

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