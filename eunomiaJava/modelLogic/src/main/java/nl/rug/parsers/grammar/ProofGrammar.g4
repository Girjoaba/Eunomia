grammar ProofGrammar;
import LexerProofRules;

proof : (proofLine | subproof)* EOF;                // The proof is the whole thing we evaluate
subproof : assume (subproof | proofLine)* qed ;     // It can contain different subproofs in order to prove different things

assume : ASSUME NEWLINE proofLine ;       // Each subproof starts with an assumption
qed    : proofLine QED ;                  // Each subproof ends with a QED (those we use in our larger proof)

    /* A proof line has the form:
     *      k. A ^ B  ^Intro: i, j
     * It contains a line number, a sentence and a justification.
     */
proofLine    : proofLineNum inference NEWLINE
             | NEWLINE
             ;
proofLineNum : INT'.' ;             // The proof line number acts as a reference to our proof line

inference    : (contradiction | sentence) + justification ;


    /*
     * ------------------------------------------------------------- Sentence Section
     */

contradiction : 'perp';
sentence
    : atom
    | sentence CONJUNCTION sentence
    ;

atom  : VARIABLE | CONSTANT ;


    /*
     *  ------------------------------------------------------------- Justifications Section
     */
justification : premise | elimination | introduction ;
premise : 'premise' ;

introduction
    : CONJUNCTION 'Intro: ' INT ',' INT
    ;

elimination
    : CONJUNCTION + 'Elim: ' INT
    ;


    /*
     *  ------------------------------------------------------------------- Lexer Rules Section
     */

CONJUNCTION : '&' | '&&' | '^' ;

ASSUME : 'assume' ;
QED    : 'qed' ;

VARIABLE : [a-z][a-zA-Z0-9_]* ;
CONSTANT : [A-Z][a-zA-Z0-9_]* ;
INT      : [1-9][0-9]* ;
NEWLINE  : '\r'? '\n' ;
WS       : [ \t]+ -> skip ;