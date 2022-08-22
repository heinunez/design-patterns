package creational.prototype;

import creational.prototype.concretes.Circle;
import creational.prototype.concretes.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ShapeTest {

    @Test
    void givenCircleWhenCloneThenThePrototypeIsClonedCorrectly() {
        Circle redCircle = new Circle("red");
        Circle blueCircle = (Circle) redCircle.clone();
        blueCircle.setColor("blue");

        assertEquals("red", redCircle.getColor());
        assertEquals("blue", blueCircle.getColor());
        assertNotEquals(redCircle, blueCircle);
    }

    @Test
    void givenRectangleWhenCloneThenThePrototypeIsClonedCorrectly() {
        Rectangle redRectangle = new Rectangle("red");
        Rectangle blueRectangle = (Rectangle) redRectangle.clone();
        blueRectangle.setColor("blue");

        assertEquals("red", redRectangle.getColor());
        assertEquals("blue", blueRectangle.getColor());
        assertNotEquals(redRectangle, blueRectangle);
    }

}