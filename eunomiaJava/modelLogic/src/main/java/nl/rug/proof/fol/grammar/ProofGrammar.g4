grammar ProofGrammar;
import LexerProofRules;

proof : premiseLine* (proofLine | subproof)* conclusionLine EOF ;   // The proof is the whole thing we evaluate
subproof : assume (subproof | proofLine)* qed ;                     // It can contain different subproofs in order to prove different things

assume : ASSUME NEWLINE premiseLine ;       // Each subproof starts with an assumption
qed    : conclusionLine QED NEWLINE ;                  // Each subproof ends with a QED (those we use in our larger proof)

    /* A proof line has the form:
     *      k. A ^ B  ^Intro: i, j
     * It contains a line number, a sentence and a justification.
     */

premiseLine    : proofLineNum premiseInference NEWLINE ; // Premise lines are the lines that are assumed to be true
proofLine      : proofLineNum inference NEWLINE ;
conclusionLine : proofLineNum inference NEWLINE ;

proofLineNum : INT'.' ;             // The proof line number acts as a reference to our proof line

premiseInference
    : contradiction + ' premise'       # PremiseContradictionInfer
    | sentence + ' premise'            # PremiseSentenceInfer
    ;

inference
    : contradiction + justification  # ContradictionInfer
    | sentence + justification       # SentenceInfer
    ;


    /*
     * ------------------------------------------------------------- Sentence Section
     */

contradiction : CONTRADICTION;
sentence
    : atom                                        # Atomic
    | NEGATION sentence                           # Negation
    | sentence CONJUNCTION sentence               # Conjunction
    | sentence DISJUNCTION sentence               # Disjunction
    ;

atom  : VARIABLE | CONSTANT ;

    /*
     *  ------------------------------------------------------------- Justifications Section
     */
justification
    : reiteration        # ReitJust
    | elimination        # ElimJust
    | introduction       # IntroJust
    ;

reiteration : 'Reit: ' singleReference ;

introduction
    : NEGATION      'Intro: ' rangeReference                              # NegationIntro
    | CONTRADICTION 'Intro: ' singleReference ',' singleReference         # ContradictionIntro
    | CONJUNCTION   'Intro: ' singleReference ',' singleReference         # ConjunctionIntro
    | DISJUNCTION   'Intro: ' singleReference                             # DisjunctionIntro
    ;

elimination
    : NEGATION      'Elim: ' singleReference                                            # NegationElim
    | CONTRADICTION 'Elim: ' singleReference                                            # ContradictionElim
    | CONJUNCTION + 'Elim: ' singleReference                                            # ConjunctionElim
    | DISJUNCTION + 'Elim: ' singleReference ',' rangeReference ',' rangeReference      # DisjunctionElim
    ;

singleReference : INT ;
rangeReference  : INT '-' INT ;

    /*
     *  ------------------------------------------------------------------- Lexer Rules Section
     */

NEGATION    : '!' ;
CONTRADICTION : '\\perp' ;
CONJUNCTION : '&&' ;
DISJUNCTION : '||' ;

ASSUME : 'assume' ;
QED    : 'qed' ;

VARIABLE : [a-z][a-zA-Z0-9_]* ;
CONSTANT : [A-Z][a-zA-Z0-9_]* ;
INT      : [1-9][0-9]* ;
NEWLINE  : '\r'? '\n' ;
WS       : [ \t]+ -> skip ;