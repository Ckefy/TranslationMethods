grammar Hello;
root : statement+ ;

statement : func_def | func ;
func_def : NAME '::' NAME ('->' NAME)* NEWLINE ;
func : without | with ;
without : NAME INT (INT)* '=' (NAME | INT) (OPS (NAME | INT))*  NEWLINE ;
with : NAME NAME (NAME)* '|' '(' (NAME | INT) (OPS (NAME | INT))* COMPARE (NAME | INT) ')' '=' (NAME | (NAME '(' (NAME | INT) (OPS (NAME | INT))* ',' (NAME | INT) (OPS (NAME | INT))* ')')) NEWLINE NEWLINE?;

COMPARE : ('==' | '!=' | '<' | '<=' | '>' | '>=') ;
OPS : ('*' | '+' | '-' | '%') ;
NAME : (LETTER | '_') (LETTER | '_' | INT)* ;
LETTER : ('a'..'z'|'A'..'Z') ;
INT : ('0'..'9')+ ;
NEWLINE : '\r'? '\n' ' '* ;
WS : ' '+ -> skip ;