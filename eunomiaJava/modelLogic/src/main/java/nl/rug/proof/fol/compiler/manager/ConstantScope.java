package nl.rug.proof.fol.compiler.manager;

import java.util.ArrayList;
import java.util.List;

/**
 * A class for managing the scope of all constants.
 */
public class ConstantScope {

    private final List<ProofConstant> constants = new ArrayList<>();

    /**
     * Add a constant to the scope.
     * @param name the name of the constant.
     * @param level the scope level at which it is added.
     */
    public void addConstant(String name, Integer level) {
        constants.add(new ProofConstant(name, level));
    }

    /**
     * Check if a constant is already defined in the scope.
     * @param name the checked constant.
     * @return true if the constant is already defined, false otherwise.
     */
    public boolean contains(String name) {
        return constants.stream().anyMatch(c -> c.name.equals(name));
    }

    /**
     * Remove all constants defined at a higher level than the given one.
     * @param level the given level.
     */
    public void removeHigherLevelConstants(Integer level) {
        constants.removeIf(c -> c.level > level);
    }

    public void clear() {
        constants.clear();
    }

    /**
     * A record for storing the name and the level of a constant.
     * @param name the name of the constant.
     * @param level the level at which the constant is defined.
     */
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
