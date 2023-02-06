package nl.rug.proof.fol.compiler;


public class Evaluation {
    private Boolean correct;
    private String message;

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
