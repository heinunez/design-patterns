package behavioral.observer.concretes;

import behavioral.observer.Subject;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClockTimer extends Subject {

    @Getter
    private String currentTime = "00:00:00";

    public void tick() {
        currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        notifyObservers();
    }
}
