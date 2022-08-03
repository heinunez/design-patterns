package creational.abstractfactory.concretes.logitech;

import creational.abstractfactory.abstracts.Keyboard;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogitechKeyboard implements Keyboard {
    @Override
    public void type() {
      log.info("👩‍💻👨‍💻");
    }
}
