package nl.rug.proof.fol.compiler.commonStrings;

/**
 * A class for tracking the most common error messages.
 */
@SuppressWarnings("CheckStyle")
public class ErrorMessage {
    public static final String INVALID_REFERENCE
            = "Invalid Reference.";
    public static final String CONSTANT_ALREADY_EXISTS
            = "Constant already exists outside the proof.";
    public static final String VARIABLE_BOUNDED_TWICE
            = "Not allowed to bind the same variable twice.";
    public static final String REITERATION_APPLIED_TO_DIFFERENT_SENTENCES
            = "Reiteration applied to different sentences.";
    public static final String RESULT_NOT_A_CONTRADICTION
            = "Result not a contradiction.";
    public static final String CONTRADICTION_WRONG_INTRODUCTION
            = "Contradiction does not result from the premises." +
            " (maybe justification order is wrong ?)";
    public static final String NOT_APPLIED_TO_A_CONTRADICTION
            = "Contradiction elimination not applied to a contradiction.";
    public static final String LINE_IS_NOT_A_NEGATION
            = "Inferred line is not a negation.";
    public static final String SUBPROOF_NOT_NEGATED
            = "The premise of the subproof is not negated as the result of the negation";
    public static final String DOES_NOT_END_IN_A_CONTRADICTION
            = "Subproofs does not end in a contradiction.";
    public static final String APPLY_NEGATION_ELIMINATION_TO_DOUBLE_NEGATIONS
            = "Can only apply negation elimination to double negations.";
    public static final String SENTENCES_DO_NOT_MATCH
            = "The inferred sentence is not the same as the double negation.";
    public static final String IS_NOT_A_CONJUNCTION
            = "Inferred sentence is not a conjunction.";
    public static final String CONJUCTION_CONSTRUCTED_FROM_DIFFERNET_SENTENCES
            = "Inferred Conjunction not constructed from referred sentences.";
    public static final String NOT_A_CONJUNCTION
            = "Referred line is not a conjunction.";
    public static final String NOT_PART_OF_A_BINARY_EXPRESSION
            = "Not part of a binary expression.";
    public static final String NOT_A_DISJUNCTION
            = "Inferred sentence is not a disjunction.";
    public static final String PREMISES_DO_NOT_MATCH_ROOT_LINE
            = "Subproof premises do not match with the parts of the disjunction.";
    public static final String CONCLUSIONS_DO_NOT_MATCH_INFERRED_LINE
            = "The conclusions of the subproofs do not match with the inferred line.";
    public static final String NOT_AN_IDENTITY
            = "Inferred sentence is not an identity.";
    public static final String NOT_EQUAL_LEFT_RIGH_SIDES
            = "The left and right side of the identity are not equal.";
    public static final String INCORRECT_REPLACEMENT
            = "Replacement was not done correctly.";
    public static final String REPLACED_NOT_IN_CORE
            = "The replaced element is not part of the initial sentence.";
    public static final String NOT_AN_IMPLICATION
            = "Inferred sentence is not an implication.";
    public static final String PREMISE_DOES_NOT_MATCH_IMPLICATION
            = "The left side of the implication does not correspond to the premise of the subproof.";
    public static final String CONCLUSION_DOES_NOT_MATCH_IMPLICATION
            = "The right side of the implication does not correspond to the conclusion of the subproof.";
    public static final String REFERENCE_DOES_NOT_MATCH_LEFT_IMPLICATION
            = "The second referred line does not correspond to the left side of the implication.";
    public static final String REFERENCE_DOES_NOT_MATCH_RIGHT_IMPLICATION
            = "The inferred line does not correspond to the right side of the implication.";
    public static final String NOT_A_BICONDITIONAL
            = "Inferred sentence is not a biconditional.";
    public static final String FIRST_PREMISE_DOES_NOT_MATCH_SECOND_CONCLUSION
            = "The premise of the first subproof must be the same as the conclusion of the second subproof.";
    public static final String FIRST_CONCLUSION_DOES_NOT_MATCH_SECOND_PREMISE
            = "The conclusion of the first subproof must be the same as the premise of the second subproof.";
    public static final String MUST_BE_CONSTRUCTED_FROM_PREMISES_AND_CONCLUSIONS
            = "The inferred line must be constructed from the premises and the conclusions of the subproofs.";
    public static final String MISSING_BICONDITIONAL
            = "A biconditional sentence missing.";
    public static final String REFERENCE_MUST_BE_PART_OF_A_BICONDITIONAL
            = "The second referred line must be part of the biconditional.";
    public static final String INFERRED_LINE_MUST_BE_PART_OF_THE_BICONDITIONAL
            = "The inferred line must be part of the biconditional.";
    public static final String NOT_A_UNIVERSAL_QUANTIFIER
            = "Not a universal quantifier.";
    public static final String DOES_NOT_FOLLOW_FROM_CONCLUSION
            = "The sentence after the subproof does not follow from the conclusion of the subproof.";
    public static final String CONSTANT_IS_NOT_REPLACED_CORRECTLY
            = "The introduced constant is not replaced correctly.";
    public static final String INCORRECT_QUANTIFIER_REMOVAL
            = "The sentence with the quantifier is different from the sentence without the quantifier.";
    public static final String WRONG_VARIABLE_REPLACEMENT
            = "The bounded variable is replaced with something incorrect.";
    public static final String NOT_AN_EXISTENTIAL_QUANTIFIER
            = "The inferred line must be an existential quantifier.";
    public static final String MULTIPLE_REPALCED_CONSTANTS
            = "More constants were replaced by existential introduction.";
    public static final String DOES_NOT_FOLLOW_EXISTENTIAL
            = "The existential sentence does not follow from the reference.";
    public static final String INFERENCE_DOES_NOT_MATCH_SUBPROOF_CONCLUSION
            = "The inferred line is not equal to the conclusion of the subproof.";
    public static final String NOT_REMOVED_INTRODUCED_CONSTANT
            = "The introduced constant was not removed.";

    public static String getErrorVariableNotBounded(String variable) {
        return "Variable " + variable + " is not bounded.";
    }

    public static final String CONSTANT_DOES_NOT_REPLACE_CORRECTLY_VARIABLE
            = "The introduced constant is not replacing correctly the variable.";

    public static String getErrorConstantDefinedWrong(String constant) {
        return "Constant " + constant + " is defined wrong.";
    }
}
