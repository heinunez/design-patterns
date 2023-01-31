package behavioral.interpreter.terminal;

import behavioral.interpreter.BooleanExp;
import behavioral.interpreter.Context;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class VariableExp implements BooleanExp {
    @Getter
    private final Character character;

    @Override
    public boolean evaluate(Context context) {
        return context.lookup(character);
    }
}
