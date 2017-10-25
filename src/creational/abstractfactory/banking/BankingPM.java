package creational.abstractfactory.banking;

import creational.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Project manager manages banking project...");
    }
}
