package creational.builder.concretes;

import creational.builder.Sandwich;
import creational.builder.director.SandwichBuilder;

public class TurkeySandwichBuilder implements SandwichBuilder {

    private final Sandwich sandwich;

    public TurkeySandwichBuilder() {
        sandwich = new Sandwich();
    }

    @Override
    public void buildBread() {
        sandwich.setBread("🍞");
    }

    @Override
    public void buildSpread() {
        sandwich.setSpread("🍃");
    }

    @Override
    public void buildFilling() {
        sandwich.setFilling("🦃");
    }

    @Override
    public Sandwich getSandwich() {
        return sandwich;
    }
}
