package nl.rug.proof.fol.compiler.commonStrings;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * A class for tracking the most common error messages.
 */
@SuppressWarnings("CheckStyle")
public class ErrorMessage {
    /**
     * A way to reference an error message for easy access.*/
    public static final String INVALID_REFERENCE
            = "Invalid Reference!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String CONSTANT_ALREADY_EXISTS
            = "Constant already exists!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String VARIABLE_BOUNDED_TWICE
            = "The same variable is bounded twice!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String REITERATION_APPLIED_TO_DIFFERENT_SENTENCES
            = "Reiteration does not match!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String RESULT_NOT_A_CONTRADICTION
            = "Contradiction missing!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String CONTRADICTION_WRONG_INTRODUCTION
            = "Contradiction does not result here! \n (Hint: verify the order of the references)";

    /**
     * A way to reference an error message for easy access.*/
    public static final String NOT_APPLIED_TO_A_CONTRADICTION
            = "A contradiction was not eliminated!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String LINE_IS_NOT_A_NEGATION
            = "Not a negation!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String SUBPROOF_NOT_NEGATED
            = "The sentence was not negated!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String DOES_NOT_END_IN_A_CONTRADICTION
            = "Subproof does not end in a contradiction!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String APPLY_NEGATION_ELIMINATION_TO_DOUBLE_NEGATIONS
            = "Negation elimination was not applied to a double negation!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String SENTENCES_DO_NOT_MATCH
            = "The sentence changed after the removal of the double negation!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String IS_NOT_A_CONJUNCTION
            = "The sentence is not a conjunction!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String CONJUNCTION_CONSTRUCTED_FROM_DIFFERENT_SENTENCES
            = "The sentence is not a conjunction of the references!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String NOT_A_CONJUNCTION
            = "Reference is not a conjunction!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String NOT_PART_OF_A_BINARY_EXPRESSION
            = "The sentence is not part of the conjunction!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String NOT_A_DISJUNCTION
            = "The sentence is not a disjunction!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String PREMISES_DO_NOT_MATCH_ROOT_LINE
            = "Subproof premises do not match with the parts of the disjunction!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String CONCLUSIONS_DO_NOT_MATCH_INFERRED_LINE
            = "The conclusions of the subproofs do not match the sentence!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String NOT_AN_IDENTITY
            = "The sentence is not an identity!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String NOT_EQUAL_LEFT_RIGH_SIDES
            = "The left and right side of the identity are not equal!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String INCORRECT_REPLACEMENT
            = "Replace one variable or constant with the other!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String NOT_AN_IMPLICATION
            = "The sentence is not an implication!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String PREMISE_DOES_NOT_MATCH_IMPLICATION
            = "The premise must be equal to the left-side of the implication!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String CONCLUSION_DOES_NOT_MATCH_IMPLICATION
            = "The conclusion must be equal to the right-side of the implication!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String REFERENCE_DOES_NOT_MATCH_LEFT_IMPLICATION
            = "The left-side of the implication must be referenced!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String REFERENCE_DOES_NOT_MATCH_RIGHT_IMPLICATION
            = "The sentence must be equal to the right-side of the implication!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String NOT_A_BICONDITIONAL
            = "Sentence is not a biconditional!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String FIRST_PREMISE_DOES_NOT_MATCH_SECOND_CONCLUSION
            = "The premise of the first subproof must be the same as the conclusion of the second subproof!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String FIRST_CONCLUSION_DOES_NOT_MATCH_SECOND_PREMISE
            = "The conclusion of the first subproof must be the same as the premise of the second subproof!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String MUST_BE_CONSTRUCTED_FROM_PREMISES_AND_CONCLUSIONS
            = "The sentence must be constructed from the premises and the conclusions of the subproofs!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String INFERRED_LINE_MUST_BE_PART_OF_THE_BICONDITIONAL
            = "The sentence must be part of the biconditional.";

    /**
     * A way to reference an error message for easy access.*/
    public static final String NOT_A_UNIVERSAL_QUANTIFIER
            = "Not a universal quantifier!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String DOES_NOT_FOLLOW_FROM_CONCLUSION
            = "The sentence must be equal to the conclusion of the subproof!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String CONSTANT_IS_NOT_REPLACED_CORRECTLY
            = "The introduced constant is not replaced correctly!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String INCORRECT_QUANTIFIER_REMOVAL
            = "Is not the same as without the quantifier!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String WRONG_VARIABLE_REPLACEMENT
            = "The bounded variable is replaced with something incorrect!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String NOT_AN_EXISTENTIAL_QUANTIFIER
            = "The sentence is not an existential quantifier!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String MULTIPLE_REPALCED_CONSTANTS
            = "More constants were replaced by the existential introduction!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String DOES_NOT_FOLLOW_EXISTENTIAL
            = "The existential sentence does not follow from the reference!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String INFERENCE_DOES_NOT_MATCH_SUBPROOF_CONCLUSION
            = "The sentence is not equal to the conclusion of the subproof!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String NOT_REMOVED_INTRODUCED_CONSTANT
            = "The introduced constant was not removed!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String CONSTANT_DOES_NOT_REPLACE_CORRECTLY_VARIABLE
            = "The introduced constant is not replacing correctly the variable.";

    /**
     * A way to reference an error message for easy access.*/
    public static final String REFERENCE_NOT_PRESENT_IN_DISJUNCTION
            = "Reference not present in the disjunction!";

    /**
     * A way to reference an error message for easy access.*/
    public static final String THE_PREMISE_DOES_NOT_FOLLOW_FROM_EXISTENTIAL
            = "The premise does not follow from the existential!";

    @Contract(pure = true)
    public static @NotNull String GET_NOT_AN_IDENTITY_REFERENCE(String reference) {
            return "Reference " + reference + " is not an identity!";
    }

    @Contract(pure = true)
    public static @NotNull String GET_ERROR_VARIABLE_BOUNDED(String variable) {
        return "Variable " + variable + " is not bounded.";
    }

    @Contract(pure = true)
    public static @NotNull String GET_ERROR_CONSTANT_DEFINED_WRONG(String constant) {
        return "Constant " + constant + " is defined wrong.";
    }

    @Contract(pure = true)
    public static @NotNull String GET_AMBIGUOUS_ERROR(@NotNull String sentence, int startPos, int endPos) {
        String ambiguous = sentence.substring(startPos, endPos);
        return "Ambiguous order of operations: " + ambiguous;
    }

    @Contract(pure = true)
    public static @NotNull String NOT_AN_IMPLICATION_REFERENCE(String reference) {
        return "Reference " + reference + " is not an implication!";
    }

    @Contract(pure = true)
    public static @NotNull String NOT_A_BICONDITIONAL_REFERENCE(String reference) {
        return "Reference " + reference + " is not a biconditional!";
    }

    @Contract(pure = true)
    public static @NotNull String MUST_BE_PART_OF_THE_BICONDITIONAL_REFERENCE(String reference) {
        return "The reference " + reference + " must be part of the biconditional!";
    }

    @Contract(pure = true)
    public static @NotNull String NOT_A_UNIVERSAL_QUANTIFIER_REFERENCE(String reference) {
        return "Reference " + reference + " is not a universal quantifier!";
    }

    @Contract(pure = true)
    public static @NotNull String NOT_AN_EXISTENTIAL_QUANTIFIER_REFERENCE(String reference) {
        return "Reference " + reference + " is not an existential quantifier!";
    }
}
