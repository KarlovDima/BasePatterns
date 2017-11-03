package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Developer {
    List<Developer> developers=new ArrayList<>();

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void removwDeveloper(Developer developer){
        developers.remove(developer);
    }

    @Override
    public void writeCode() {
        for (Developer developer:developers)
            developer.writeCode();
    }
}
