package behavioral.mediator.concrete;

import behavioral.mediator.DialogDirector;
import behavioral.mediator.Widget;

public class ListBox extends Widget {
    public ListBox(DialogDirector director) {
        super(director);
    }

    public String getSelected() {
        return "Arial";
    }
}
