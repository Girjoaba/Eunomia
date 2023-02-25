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
    : ATOM                              # NormalSentence
    | function                          # NormalSentence
    | NEGATION sentence                 # NormalSentence
    | '(' sentence ')'                  # ParenthesesSentence
    | sentence CONJUNCTION sentence     # NormalSentence
    | sentence DISJUNCTION sentence     # NormalSentence
    | sentence IDENTITY sentence        # NormalSentence
    | sentence IMPLICATION sentence     # NormalSentence
    | sentence BICONDITIONAL sentence   # NormalSentence
    | FORALL VARIABLE sentence          # NormalSentence
    | EXISTS VARIABLE sentence          # NormalSentence
    ;

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
    | IDENTITY      'Intro'                                               # IdentityIntro
    | IMPLICATION   'Intro: ' rangeReference                              # ImplicationIntro
    | BICONDITIONAL 'Intro: ' rangeReference ',' rangeReference           # BiconditionalIntro
    ;

elimination
    : NEGATION      'Elim: ' singleReference                                            # NegationElim
    | CONTRADICTION 'Elim: ' singleReference                                            # ContradictionElim
    | CONJUNCTION   'Elim: ' singleReference                                            # ConjunctionElim
    | DISJUNCTION   'Elim: ' singleReference ',' rangeReference ',' rangeReference      # DisjunctionElim
    | IDENTITY      'Elim: ' singleReference ',' singleReference                        # IdentityElim
    | IMPLICATION   'Elim: ' singleReference ',' singleReference                        # ImplicationElim
    | BICONDITIONAL 'Elim: ' singleReference ',' singleReference                        # BiconditionalElim
    ;

singleReference : INT ;
rangeReference  : INT '-' INT ;

    /*
     *  ------------------------------------------------------------------- Lexer Rules Section
     */

VARIABLE : [u-z] ;
CONSTANT : [a-t] ;
ATOM     : [A-Z][a-zA-Z0-9]* ;
function: ATOM '(' (VARIABLE | CONSTANT) ')' ;
forall : FORALL VARIABLE function ;
exists : EXISTS VARIABLE function ;

NEGATION    : '!' ;
CONTRADICTION : '\\perp' ;
CONJUNCTION : '&&' ;
DISJUNCTION : '||' ;
IDENTITY    : '==' ;
IMPLICATION : '->' ;
BICONDITIONAL : '<->' ;
FORALL      : '\\forall' ;
EXISTS      : '\\exists' ;

ASSUME : 'assume' ;
QED    : 'qed' ;

INT      : [1-9][0-9]* ;
NEWLINE  : '\r'? '\n' ;
WS       : [ \t]+ -> skip ;