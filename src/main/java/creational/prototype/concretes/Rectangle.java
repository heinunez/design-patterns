package creational.prototype.concretes;

import creational.prototype.Shape;

public class Rectangle extends Shape {
    private Rectangle(Rectangle rectangle) {
        super(rectangle);
    }

    public Rectangle(String color) {
        super(color);
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
