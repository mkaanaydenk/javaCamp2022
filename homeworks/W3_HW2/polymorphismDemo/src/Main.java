public class Main {
    public static void main(String[] args) {

       /* BaseLogger[] baseLoggers = new BaseLogger[]{new EmailLogger(), new DatabaseLogger(), new FileLogger(),new ConsoleLogger()};
        for (BaseLogger loggers : baseLoggers) {
            loggers.Log("loglandı");
        }*/

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
