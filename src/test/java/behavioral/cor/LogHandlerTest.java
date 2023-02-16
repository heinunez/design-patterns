package behavioral.cor;

import org.junit.jupiter.api.Test;

class LogHandlerTest {

    @Test
    public void testHandler() {
        LogHandler consoleLogger = new ConsoleLogger(null, LogHandler.DEBUG);
        LogHandler fileLogger = new FileLogger(consoleLogger, LogHandler.INFO);
        LogHandler errorLogger = new ErrorLogger(fileLogger, LogHandler.ERROR);

        errorLogger.logMessage(LogHandler.DEBUG,"hello");
        errorLogger.logMessage(LogHandler.INFO,"hola");
        errorLogger.logMessage(LogHandler.ERROR,"bonjour");
    }
}