package behavioral.mediator.concrete;

import behavioral.mediator.DialogDirector;
import behavioral.mediator.Widget;

public class Button extends Widget {

    public Button(DialogDirector director) {
        super(director);
    }

    public void click() {
        changed();
    }
}
