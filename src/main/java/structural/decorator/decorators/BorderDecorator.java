package structural.decorator.decorators;

import lombok.extern.slf4j.Slf4j;
import structural.decorator.Shape;

@Slf4j
public class BorderDecorator extends Decorator {
    public BorderDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        log.info("This is a border!");
        super.draw();
        log.info("This is a border!");
    }
}
