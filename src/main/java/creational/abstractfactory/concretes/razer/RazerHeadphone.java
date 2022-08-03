package creational.abstractfactory.concretes.razer;

import creational.abstractfactory.abstracts.Headphone;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RazerHeadphone implements Headphone {
    @Override
    public void sound() {
        log.info("🎷🎺🎸");
    }
}
