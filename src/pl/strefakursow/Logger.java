package pl.strefakursow;

public class Logger {

    private static Logger instance;

    public Logger() {
    }

    public static Logger getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void logToConsole() {

    }

    private static class SingletonHolder {
        private static final Logger INSTANCE = new Logger();
    }
}
