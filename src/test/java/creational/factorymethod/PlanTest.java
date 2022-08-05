package creational.factorymethod;

import creational.factorymethod.concretes.CommercialPlan;
import creational.factorymethod.concretes.DomesticPlan;
import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlanTest {
    private final int units = 100;

    @Test
    public void givenADomesticPlanWhenCalculateBillThenCalculateCorrectly() {
        Plan plan = new DomesticPlan();
        val bill = plan.calculateBill(units);
        assertEquals(350, bill);
    }

    @Test
    public void givenACommercialPlanWhenCalculateBillThenCalculateCorrectly() {
        Plan plan = new CommercialPlan();
        val bill = plan.calculateBill(units);
        assertEquals(750, bill);
    }

}