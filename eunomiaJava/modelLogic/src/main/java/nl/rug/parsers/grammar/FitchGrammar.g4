grammar FitchGrammar;

sentence: (contradiction | expression) + justification;

contradiction: 'perp';

expression
    : ATOM
    | expression IDENTITY expression
    | NEGATION expression
    | expression CONJUNCTION expression
    | expression DISJUNCTION expression
    | expression IMPLICATION expression
    | expression BICONDITIONAL expression
    | EXISTENTIAL VARIABLE expression
    | UNIVERSAL VARIABLE expression
    ;

justification: premise | elimination | introduction;

premise: 'premise';
introduction
    : IDENTITY + 'Intro: '
    | NEGATION + 'Intro: ' + multiple_reference
    | CONJUNCTION + 'Intro: ' + single_reference + ',' + single_reference
    | DISJUNCTION + 'Intro: ' + single_reference
    | IMPLICATION + 'Intro: ' + multiple_reference
    | BICONDITIONAL + 'Intro: ' + multiple_reference + ',' + multiple_reference
    | EXISTENTIAL + 'Intro: ' + single_reference
    | UNIVERSAL + 'Intro: ' + multiple_reference;

elimination
    : IDENTITY + 'Elim: ' + single_reference + ',' + single_reference
    | NEGATION + 'Elim: ' + single_reference
    | CONJUNCTION + 'Elim: ' + single_reference
    | DISJUNCTION + 'Elim: ' + single_reference + ',' + multiple_reference + ',' + multiple_reference
    | IMPLICATION + 'Elim: ' + single_reference + ',' + single_reference
    | BICONDITIONAL + 'Elim: ' + single_reference + ',' + single_reference
    | EXISTENTIAL + 'Elim: ' + single_reference + ',' + multiple_reference
    | UNIVERSAL + 'Elim: ' + single_reference;

single_reference: NUMBER;
multiple_reference: NUMBER + '-' + NUMBER;

IDENTITY: '==';
NEGATION: '~';
CONJUNCTION: '&';
DISJUNCTION: '|';
IMPLICATION: '->';
BICONDITIONAL: '<->';
EXISTENTIAL: 'E';
UNIVERSAL: 'A';

ATOM: VARIABLE | CONSTANT;
VARIABLE: [a-z]+;
CONSTANT: [A-Z]+;

NUMBER: [1-9][0-9]*;