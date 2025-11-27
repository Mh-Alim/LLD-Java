package StrategyPattern;

interface LogginStrategy {
    void logging(String message);
}

class LogConsole implements  LogginStrategy{
    @Override
    public void logging(String message) {
        System.out.println("[CONSOLE]: " + message);
    }
}

class LogDB implements  LogginStrategy{
    @Override
    public void logging(String message) {
        System.out.println("[DATEBASE]: " + message);
    }
}

class LogCloudwatch implements  LogginStrategy{
    @Override
    public void logging(String message) {
        System.out.println("[CLOUDWATCH]: " + message);
    }
}
class Logger{
    private LogginStrategy logginStrategy;
    public Logger(LogginStrategy logginStrategy){
        this.logginStrategy = logginStrategy;
    }

    void logging(String message) {
        logginStrategy.logging(message);
    }
}
public class loggerStrategy {
    public static  void main(String args[]) {
        Logger cloudwatchLogger = new Logger(new LogCloudwatch());
        cloudwatchLogger.logging("Production logs");

        Logger consoleLogger = new Logger(new LogConsole());
        consoleLogger.logging("Development logs");

        Logger dbLogger = new Logger(new LogDB());
        dbLogger.logging("Save data to db");
    }
}
