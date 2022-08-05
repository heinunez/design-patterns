package creational.factorymethod.concretes;

import creational.factorymethod.Plan;
import creational.factorymethod.Rate;

public class DomesticPlan extends Plan {
    @Override
    public Rate getRate() {
        return new DomesticRate();
    }
}
