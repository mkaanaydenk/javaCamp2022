package loggers;

public class ConsoleLogger implements ILogger {
    @Override
    public void log(String log) {
        System.out.println("Konsola loglandı " + log);
    }
}
