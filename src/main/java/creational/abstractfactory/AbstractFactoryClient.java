package creational.abstractfactory;

import creational.abstractfactory.abstracts.Headphone;
import creational.abstractfactory.abstracts.Keyboard;
import creational.abstractfactory.abstracts.PCAccessoryFactory;
import lombok.Getter;

@Getter
public class AbstractFactoryClient {
    private final Headphone headphone;
    private final Keyboard  keyboard;

    public AbstractFactoryClient(PCAccessoryFactory factory) {
        this.headphone = factory.createHeadphone();
        this.keyboard = factory.createKeyboard();
    }

    public void useAccessories(){
        headphone.sound();
        keyboard.type();
    }
}
