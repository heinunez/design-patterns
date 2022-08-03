package creational.abstractfactory;

import creational.abstractfactory.concretes.logitech.LogitechAccessoryFactory;
import creational.abstractfactory.concretes.logitech.LogitechHeadphone;
import creational.abstractfactory.concretes.logitech.LogitechKeyboard;
import creational.abstractfactory.concretes.razer.RazerAccessoryFactory;
import creational.abstractfactory.concretes.razer.RazerHeadphone;
import creational.abstractfactory.concretes.razer.RazerKeyboard;
import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AbstractFactoryClientTest {

    @Test
    public void givenClientUsesFactoryWhenIsRazerThenAccessoriesWillBeOfTheCorrectBrand() {
        val client = new AbstractFactoryClient(new RazerAccessoryFactory());
        client.useAccessories();
        assertTrue(client.getHeadphone() instanceof RazerHeadphone);
        assertTrue(client.getKeyboard() instanceof RazerKeyboard);
    }

    @Test
    public void givenClientUsesFactoryWhenIsLogitechThenAccessoriesWillBeOfTheCorrectBrand() {
        val client = new AbstractFactoryClient(new LogitechAccessoryFactory());
        client.useAccessories();
        assertTrue(client.getHeadphone() instanceof LogitechHeadphone);
        assertTrue(client.getKeyboard() instanceof LogitechKeyboard);
    }

}