package creational.factorymethod.concretes;

import creational.factorymethod.Rate;

public class DomesticRate implements Rate {
    @Override
    public double getValue() {
        return 3.5;
    }
}
