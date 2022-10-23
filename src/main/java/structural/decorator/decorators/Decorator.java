package structural.decorator.decorators;

import lombok.RequiredArgsConstructor;
import structural.decorator.Shape;

@RequiredArgsConstructor
public class Decorator implements Shape {
    private final Shape shape;

    @Override
    public void draw() {
        shape.draw();
    }
}
