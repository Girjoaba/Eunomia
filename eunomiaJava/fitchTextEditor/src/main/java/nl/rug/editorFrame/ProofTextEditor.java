package nl.rug.editorFrame;

public interface ProofTextEditor {

    public String getProofText();

    public void clearErrors();

    public void addLineError(String error);
}
