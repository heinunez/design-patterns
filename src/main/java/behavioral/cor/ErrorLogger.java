package behavioral.cor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ErrorLogger extends LogHandler {
    public ErrorLogger(LogHandler successor, int level) {
        super(successor, level);
    }

    @Override
    public void write(String message) {
        log.info("error: {}", message);
    }
}
