package creational.prototype.concretes;

import creational.prototype.Shape;

public class Circle extends Shape {
    private Circle(Circle circle) {
        super(circle);
    }
    public Circle(String color) {
        super(color);
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
