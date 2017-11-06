package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProgramRunner {
    public static void main(String[] args) {
        List<Developer> developers = new ArrayList<>();

        developers.add(DeveloperFactory.getDeveloperBySpeciality("java"));
        developers.add(DeveloperFactory.getDeveloperBySpeciality("java"));
        developers.add(DeveloperFactory.getDeveloperBySpeciality("java"));
        developers.add(DeveloperFactory.getDeveloperBySpeciality("java"));
        developers.add(DeveloperFactory.getDeveloperBySpeciality("java"));
        developers.add(DeveloperFactory.getDeveloperBySpeciality("java"));

        developers.add(DeveloperFactory.getDeveloperBySpeciality("c++"));
        developers.add(DeveloperFactory.getDeveloperBySpeciality("c++"));
        developers.add(DeveloperFactory.getDeveloperBySpeciality("c++"));
        developers.add(DeveloperFactory.getDeveloperBySpeciality("c++"));
        developers.add(DeveloperFactory.getDeveloperBySpeciality("c++"));
        developers.add(DeveloperFactory.getDeveloperBySpeciality("c++"));

        for (Developer developer : developers)
            developer.writeCode();
    }
}
