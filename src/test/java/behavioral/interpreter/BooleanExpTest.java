package behavioral.interpreter;

import behavioral.interpreter.nonterminal.AndExp;
import behavioral.interpreter.nonterminal.OrExp;
import behavioral.interpreter.terminal.VariableExp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BooleanExpTest {

    @Test
    public void simpleAndExpTest() {
        BooleanExp expression;
        Context context = new Context();

        VariableExp x = new VariableExp('X');
        VariableExp y = new VariableExp('Y');

        expression = new AndExp(x, y);

        context.assign(x, true);
        context.assign(y, false);

        assertFalse(expression.evaluate(context), "x && y == false");
    }

    @Test
    public void complexExpTest() {
        BooleanExp expression;
        Context context = new Context();

        VariableExp x = new VariableExp('X');
        VariableExp y = new VariableExp('Y');
        VariableExp z = new VariableExp('Z');

        expression = new OrExp(
                new AndExp(x, y),
                z
        );

        context.assign(x, true);
        context.assign(y, false);
        context.assign(y, true);

        assertTrue(expression.evaluate(context), "(x && y) || z == true");
    }

}