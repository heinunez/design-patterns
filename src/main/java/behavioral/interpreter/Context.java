package behavioral.interpreter;

import behavioral.interpreter.terminal.VariableExp;
import lombok.val;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private final Map<VariableExp, Boolean> variables = new HashMap<>();

    public boolean lookup(Character character) {
        val entry = variables.entrySet().stream()
                .filter(e -> e.getKey().getCharacter().equals(character))
                .findFirst();

        return entry.map(Map.Entry::getValue).orElse(false);
    }

    public void assign(VariableExp var, boolean bool) {
        variables.put(var, bool);
    }
}
