grammar Hello;
root : statement+ ;

//fac :: Integer -> Integer
//fac 0 = 1
//fac n | n > 0 = n * fac(n - 1)

statement : func_def | func ;
func_def : NAME '::' NAME ('->' NAME)* NEWLINE ;
func : without | with ;
//if without guards then it should contain only numbers
without : NAME INT (INT)* '=' (NAME | INT) (OPS (NAME | INT))*  NEWLINE ;
with : NAME NAME (NAME)* '|' '(' (NAME | INT) (OPS (NAME | INT))* COMPARE (NAME | INT) ')' '=' (NAME | (NAME '(' (NAME | INT) (OPS (NAME | INT))* ',' (NAME | INT) (OPS (NAME | INT))* ')')) NEWLINE NEWLINE?;


//fac n d | (n % d == 0) = (n == d)
//fac n d | (n % d > 0) = fac (n d+1)

COMPARE : ('==' | '!=' | '<' | '<=' | '>' | '>=') ;
OPS : ('*' | '+' | '-' | '%') ;
NAME : (LETTER | '_') (LETTER | '_' | INT)* ;
LETTER : ('a'..'z'|'A'..'Z') ;
INT : ('0'..'9')+ ;
NEWLINE : '\r'? '\n' ' '* ;
WS : ' '+ -> skip ;