package creational.builder;

import creational.builder.director.SandwichBuilder;

public class SandwichMachine {
    public Sandwich createSandwich(SandwichBuilder builder){
        builder.buildBread();
        builder.buildFilling();
        builder.buildSpread();
        return builder.getSandwich();
    }
}
