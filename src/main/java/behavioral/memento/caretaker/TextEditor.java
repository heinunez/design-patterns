package behavioral.memento.caretaker;

import behavioral.memento.TextWindowState;
import behavioral.memento.originator.TextWindow;

public class TextEditor {
    private TextWindow textWindow;
    private TextWindowState savedTextWindow;

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void hitSave() {
        savedTextWindow = textWindow.save();
    }

    public void hitUndo() {
        textWindow.restore(savedTextWindow);
    }

    public void write(String text) {
        textWindow.addText(text);
    }

    public String getValue() {
        return textWindow.getCurrentText();
    }
}
