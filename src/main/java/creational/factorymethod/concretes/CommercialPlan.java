package creational.factorymethod.concretes;

import creational.factorymethod.Plan;
import creational.factorymethod.Rate;

public class CommercialPlan extends Plan {
    @Override
    public Rate getRate() {
        return new CommercialRate();
    }
}
