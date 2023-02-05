package behavioral.mediator.concrete;

import behavioral.mediator.DialogDirector;
import behavioral.mediator.Widget;
import lombok.Getter;
import lombok.Setter;

public class EntryField  extends Widget {

    @Getter
    @Setter
    private String text;
    public EntryField(DialogDirector director) {
        super(director);
    }
}
