package loggers;

public class FileLogger implements ILogger {
    @Override
    public void log(String log) {
        System.out.println("Dosyaya loglandı " + log);
    }
}
