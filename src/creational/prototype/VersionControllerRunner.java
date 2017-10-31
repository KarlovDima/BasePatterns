package creational.prototype;

public class VersionControllerRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();");

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project masterClone=projectFactory.copyProject();

        System.out.println(master);
        System.out.println(masterClone);

    }
}
