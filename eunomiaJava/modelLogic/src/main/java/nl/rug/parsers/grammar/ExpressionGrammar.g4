grammar ExpressionGrammar;

expr
    : ATOM
    | expr AND expr
    ;

AND : 'and' | '&&' ;

ATOM : CONST | VAR;

CONST : [a-z_] + [a-zA-Z0-9_]*;

VAR: [A-Z_] + [a-zA-Z0-9_]*;