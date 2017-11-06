package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static Map<String, Developer> developerMap = new HashMap<>();

    public static Developer getDeveloperBySpeciality(String speciality) {
        Developer developer = developerMap.get(speciality);

        if (developer == null)
            switch (speciality) {
                case "java":
                    System.out.println("Hiring java developer...");
                    developer = new JavaDeveloper();
                    developerMap.put(speciality, developer);
                    break;
                case "c++":
                    System.out.println("Hiring C++ developer...");
                    developer = new CppDeveloper();
                    developerMap.put(speciality, developer);
                    break;
            }

        return developer;
    }
}
