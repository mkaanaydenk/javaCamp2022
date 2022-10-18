package loggers;

public class MailLogger implements ILogger {
    @Override
    public void log(String log) {
        System.out.println("Maile loglandı " + log);
    }
}
