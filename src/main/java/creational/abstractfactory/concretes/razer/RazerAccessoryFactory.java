package creational.abstractfactory.concretes.razer;

import creational.abstractfactory.abstracts.Headphone;
import creational.abstractfactory.abstracts.Keyboard;
import creational.abstractfactory.abstracts.PCAccessoryFactory;

public class RazerAccessoryFactory implements PCAccessoryFactory {
    @Override
    public Headphone createHeadphone() {
        return new RazerHeadphone();
    }

    @Override
    public Keyboard createKeyboard() {
        return new RazerKeyboard();
    }
}
