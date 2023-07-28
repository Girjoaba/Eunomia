package nl.rug.proof.fol.compiler.manager.components;

/**
 * Represents the evaluation of a proof line.
 */
public class Evaluation {
    private Boolean correct;
    private String message;

    /**
     * Creates a new evaluation which is associated with a proof line.
     * @param correct if the line is correct or not.
     * @param message the message corresponding to the line. Usually used to display error messages.
     */
    public Evaluation(Boolean correct, String message) {
        this.correct = correct;
        this.message = message;
    }

    public Boolean isCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
