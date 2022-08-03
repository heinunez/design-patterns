package creational.abstractfactory.concretes.logitech;

import creational.abstractfactory.abstracts.Headphone;
import creational.abstractfactory.abstracts.Keyboard;
import creational.abstractfactory.abstracts.PCAccessoryFactory;

public class LogitechAccessoryFactory implements PCAccessoryFactory {
    @Override
    public Headphone createHeadphone() {
        return new LogitechHeadphone();
    }

    @Override
    public Keyboard createKeyboard() {
        return new LogitechKeyboard();
    }
}
