package creational.builder.director;

import creational.builder.Sandwich;

public interface SandwichBuilder {
    void buildBread();
    void buildSpread();
    void buildFilling();
    Sandwich getSandwich();
}
