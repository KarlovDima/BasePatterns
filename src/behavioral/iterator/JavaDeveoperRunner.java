package behavioral.iterator;

public class JavaDeveoperRunner {
    public static void main(String[] args) {
        String[] skills = {"Hibernate", "JavaFX", "Android", "Maven", "Gradle", "SQLite", "MySQL"};

        JavaDevelepor javaDevelepor = new JavaDevelepor("Dima Karlov", skills);

        Iterator iterator = javaDevelepor.getIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
