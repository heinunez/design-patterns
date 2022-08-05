package creational.factorymethod;

import lombok.val;

public abstract class Plan {

    public double calculateBill(int units) {
        val rate = getRate();
        return rate.getValue() * units;
    }

    // Factory method
    public abstract Rate getRate();
}
