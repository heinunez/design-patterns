package creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Shape {

    private String color;

    protected Shape(String color) {
        this.color = color;
    }

    protected Shape(Shape target) {
        color = target.color;
    }

    public abstract Shape clone();
}
