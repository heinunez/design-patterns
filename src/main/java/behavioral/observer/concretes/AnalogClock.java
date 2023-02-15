package behavioral.observer.concretes;

import behavioral.observer.Observer;
import behavioral.observer.Subject;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AnalogClock implements Observer {

    private final ClockTimer subject;

    @Getter
    private int updates = 0;

    public AnalogClock(ClockTimer subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public void destroy() {
        this.subject.detach(this);
    }

    @Override
    public void update(Subject subject) {
        updates++;
        log.info("🕑 {}", subject.getCurrentTime());
    }
}
