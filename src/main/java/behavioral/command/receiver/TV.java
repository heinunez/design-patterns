package behavioral.command.receiver;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TV {
    @Getter
    private boolean on = false;

    public void turnOn() {
        log.info("tv is turning on");
        on = true;
    }
}
