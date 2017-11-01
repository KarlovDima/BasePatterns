package structural.adapter;

public class AdapterDatabaseToJava extends JavaApplication implements Database {
    @Override
    public void insert() {
        createObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void delete() {
        removeObject();
    }
}
