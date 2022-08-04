package creational.builder;

import creational.builder.concretes.HamSandwichBuilder;
import creational.builder.concretes.TurkeySandwichBuilder;
import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SandwichMachineTest {

    @Test
    public void givenMachineWhenCreatesTurkeySandwichThenSandwichIsCorrect() {
        val machine = new SandwichMachine();
        val builder = new TurkeySandwichBuilder();
        val sandwich = machine.createSandwich(builder);
        assertEquals("🍞🦃🍃🍞", sandwich.giveMeAll());
    }

    @Test
    public void givenMachineWhenCreatesHamSandwichThenSandwichIsCorrect() {
        val machine = new SandwichMachine();
        val builder = new HamSandwichBuilder();
        val sandwich = machine.createSandwich(builder);
        assertEquals("🥖🐽🥬🥖", sandwich.giveMeAll());
    }

}