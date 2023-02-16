package behavioral.cor;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class LogHandler {
    public static int DEBUG = 1;
    public static int INFO = 2;
    public static int ERROR = 3;
    private final LogHandler successor;
    private final int level;

    public void logMessage(int level, String message) {

        if (this.level == level)
            write(message);
        else if (successor != null)
            successor.logMessage(level, message);
    }

    public abstract void write(String message);
}
