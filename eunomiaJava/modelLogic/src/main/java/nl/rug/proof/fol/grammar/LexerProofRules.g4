lexer grammar LexerProofRules;

VARIABLE : [a-z][a-zA-Z0-9_]* ;
CONSTANT : [A-Z][a-zA-Z0-9_]* ;
INT      : [1-9][0-9]+ ;
NEWLINE  : '\r'? '\n' ;
WS       : [ \t]+ -> skip ;

ATOM     : VARIABLE | CONSTANT ;