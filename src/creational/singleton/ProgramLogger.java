package creational.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private String logFile="This is log file. \n\n";

    private ProgramLogger(){

    }

    public static synchronized ProgramLogger getProgramLogger() {
        if(programLogger==null)
            programLogger=new ProgramLogger();
        return programLogger;
    }

    public void addLogInfo(String message){
        logFile+=message+"\n";
    }

    public void showLogFile(){
        System.out.println(logFile);
    }
}
