package structural.facade;

public class Workflow {
    BugTracker bugTracker=new BugTracker();
    Developer developer= new Developer();
    Job job=new Job();

    public void solveProbliems(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
