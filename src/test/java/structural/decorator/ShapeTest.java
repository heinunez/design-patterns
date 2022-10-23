package structural.decorator;

import org.junit.jupiter.api.Test;
import structural.decorator.concrete.Rectangle;
import structural.decorator.decorators.BorderDecorator;
import structural.decorator.decorators.ScrollDecorator;

class ShapeTest {

    @Test
    public void testDecorators() {
        Shape rectangle = new Rectangle();
        rectangle.draw();

        Shape rectangleWithBorder = new BorderDecorator(new Rectangle());
        rectangleWithBorder.draw();

        Shape rectangleWithScroll = new ScrollDecorator(new Rectangle());
        rectangleWithScroll.draw();

        Shape rectangleWithDoubleBorder = new BorderDecorator(new BorderDecorator(new Rectangle()));
        rectangleWithDoubleBorder.draw();
    }
}