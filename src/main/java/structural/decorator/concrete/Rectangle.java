package structural.decorator.concrete;

import lombok.extern.slf4j.Slf4j;
import structural.decorator.Shape;

@Slf4j
public class Rectangle implements Shape {
    @Override
    public void draw() {
        log.info("Draw a Rectangle");
    }
}
