package nl.rug.proof.fol.compiler.manager;

import java.util.ArrayList;
import java.util.List;

public class ConstantScope {

    private final List<ProofConstant> constants = new ArrayList<>();

    public void addConstant(String name, Integer level) {
        constants.add(new ProofConstant(name, level));
    }

    public boolean contains(String name) {
        return constants.stream().anyMatch(c -> c.name.equals(name));
    }

    public void removeConstant(String name) {
        constants.removeIf(c -> c.name.equals(name));
    }

    public void removeHigherLevelConstants(Integer level) {
        constants.removeIf(c -> c.level > level);
    }

    private record ProofConstant(String name, Integer level) {

        private ProofConstant {
            if (name == null || level == null) {
                throw new IllegalArgumentException("Name and level cannot be null");
            }
            if (!name.matches("[a-t][a-z]*")) {
                throw new IllegalArgumentException("Constants are defined from a to t.");
            }

        }
    }
}
