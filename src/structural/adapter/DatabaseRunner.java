package structural.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database=new AdapterDatabaseToJava();

        database.insert();
        database.update();
        database.select();
        database.delete();
    }
}
