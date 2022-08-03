package creational.abstractfactory.concretes.logitech;

import creational.abstractfactory.abstracts.Headphone;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogitechHeadphone implements Headphone {
    @Override
    public void sound() {
        log.info("🎷🎺🎸");
    }
}
