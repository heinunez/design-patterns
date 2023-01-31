package behavioral.interpreter.nonterminal;

import behavioral.interpreter.BooleanExp;
import behavioral.interpreter.Context;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrExp implements BooleanExp {
    private final BooleanExp leftExp;
    private final BooleanExp rightExp;

    @Override
    public boolean evaluate(Context context) {
        return leftExp.evaluate(context) || rightExp.evaluate(context);
    }
}
