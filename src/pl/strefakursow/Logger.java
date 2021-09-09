package pl.strefakursow;

public class Logger {

    private static Logger instance;

    public Logger() {
    }

    public static Logger getInstance() {
        if (Logger.instance==null)
        {
            instance=new Logger();
            return instance;
        }else {
            return instance;
        }
    }

    public void logToConsole(){

    }
}
