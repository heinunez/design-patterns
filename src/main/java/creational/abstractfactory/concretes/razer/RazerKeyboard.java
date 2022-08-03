package creational.abstractfactory.concretes.razer;

import creational.abstractfactory.abstracts.Keyboard;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RazerKeyboard implements Keyboard {
    @Override
    public void type() {
        log.info("👩‍💻👨‍💻");
    }
}
