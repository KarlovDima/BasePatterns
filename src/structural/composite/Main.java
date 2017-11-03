package structural.composite;

public class Main {
    public static void main(String[] args) {
        JavaDeveloper firstJavaDeveloper=new JavaDeveloper();
        JavaDeveloper secondJavaDeveloper=new JavaDeveloper();
        CppDeveloper cppDeveloper=new CppDeveloper();

        Team team=new Team();
        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(cppDeveloper);

        team.writeCode();
    }
}
