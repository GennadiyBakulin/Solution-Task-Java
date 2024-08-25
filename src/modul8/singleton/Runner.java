package modul8.singleton;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getInstanceLogger(LogLevel.DEBUG);
        logger.logInfo("Ошибка Error", LogLevel.ERROR);
        logger.logInfo("Ошибка TRACE", LogLevel.TRACE);
        logger.logInfo("Ошибка DEBUG", LogLevel.DEBUG);
        Logger logger2 = Logger.getInstanceLogger(LogLevel.ERROR);
        logger2.logInfo("Ошибка Error", LogLevel.ERROR);
        logger2.logInfo("Ошибка TRACE", LogLevel.TRACE);
        logger2.logInfo("Ошибка DEBUG", LogLevel.DEBUG);
    }
}
