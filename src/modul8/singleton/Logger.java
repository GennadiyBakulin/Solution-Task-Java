package modul8.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class Logger {
    private static Logger instance;
    private final LogLevel logLevel;

    private Logger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public static Logger getInstanceLogger(LogLevel level) {
        if (instance == null) {
            instance = new Logger(level);
        }
        return instance;
    }

    public void logInfo(String messageError, LogLevel levelError) throws IOException {
        if (this.logLevel.ordinal() <= levelError.ordinal()) {
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
