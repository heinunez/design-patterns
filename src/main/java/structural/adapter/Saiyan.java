package structural.adapter;

import lombok.extern.slf4j.Slf4j;
import structural.adapter.adaptertarget.Warrior;

@Slf4j
public class Saiyan implements Warrior {
    @Override
    public void attack() {
        log.info("Saiyan attack!");
    }
}
