package modul8.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class Logger {
    private static Logger logger;
    private static LogLevel logLevel;

    private Logger() {
    }

    public static Logger getInstanceLogger(LogLevel level) {
        if (logger == null) {
            logger = new Logger();
        }
        logLevel = level;
        return logger;
    }

    public static LogLevel getLogLevel() {
        return logLevel;
    }

    public void logInfo(String messageError, LogLevel levelError) throws IOException {
        if (Logger.logLevel.ordinal() <= levelError.ordinal()) {
            try (FileWriter fw = new FileWriter("logInfo.txt", true)) {
                fw.write(String.join(" ",
                        LocalDate.now().toString(),
                        LocalTime.now().toString(),
                        levelError.toString(),
                        messageError) + "\n");
                fw.flush();
            }
        }
    }
}
