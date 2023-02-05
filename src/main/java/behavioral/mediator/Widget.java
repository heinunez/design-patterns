package behavioral.mediator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Widget {
    private final DialogDirector director;

    public void changed() {
        director.widgetChanged(this);
    }
}
