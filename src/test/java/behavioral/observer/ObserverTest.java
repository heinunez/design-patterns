package behavioral.observer;

import behavioral.observer.concretes.AnalogClock;
import behavioral.observer.concretes.ClockTimer;
import behavioral.observer.concretes.DigitalClock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ObserverTest {

    @Test
    public void shouldUpdateWhenTimerTicks() {
        ClockTimer timer = new ClockTimer();
        AnalogClock analog = new AnalogClock(timer);
        DigitalClock digital = new DigitalClock(timer);

        timer.tick();

        assertEquals(1, analog.getUpdates());
        assertEquals(1, digital.getUpdates());

        digital.destroy();
        timer.tick();

        assertEquals(2, analog.getUpdates());
        assertEquals(1, digital.getUpdates());
    }

}