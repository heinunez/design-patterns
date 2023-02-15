package behavioral.memento.caretaker;

import behavioral.memento.originator.TextWindow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TextEditorTest {

    @Test
    public void shouldUndoTextWhenHitUndo() {
        TextWindow window = new TextWindow();
        TextEditor editor = new TextEditor(window);

        editor.write("Hello");
        editor.write(" World");
        editor.hitSave();

        editor.write("Good bye");
        editor.hitUndo();

        assertEquals("Hello World", editor.getValue());
    }

}