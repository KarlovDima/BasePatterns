package creational.singleton;

public class Main {
    public static void main(String[] args) {
        ProgramLogger programLogger = ProgramLogger.getProgramLogger();

        programLogger.addLogInfo("First log...");
        programLogger.addLogInfo("Second log...");
        programLogger.addLogInfo("Third log...");

        programLogger.showLogFile();
    }
}
