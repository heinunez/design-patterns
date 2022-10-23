package structural.decorator.decorators;

import lombok.extern.slf4j.Slf4j;
import structural.decorator.Shape;

@Slf4j
public class ScrollDecorator extends Decorator {
    public ScrollDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        log.info("Wow is scrollable!");
        super.draw();
    }
}
