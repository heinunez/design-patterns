package behavioral.cor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConsoleLogger extends LogHandler {

    public ConsoleLogger(LogHandler successor, int level) {
        super(successor, level);
    }

    @Override
    public void write(String message) {
        log.info("console: {}", message);
    }
}
