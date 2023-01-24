package behavioral.cop;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileLogger extends LogHandler {
    public FileLogger(LogHandler successor, int level) {
        super(successor, level);
    }

    @Override
    public void write(String message) {
        log.info("file: {}", message);
    }
}
