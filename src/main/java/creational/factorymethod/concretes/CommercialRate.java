package creational.factorymethod.concretes;

import creational.factorymethod.Rate;

public class CommercialRate implements Rate {
    @Override
    public double getValue() {
        return 7.5;
    }
}
