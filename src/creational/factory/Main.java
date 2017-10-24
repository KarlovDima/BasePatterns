package creational.factory;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactoryBySpeciality("c++");
        Developer developer=developerFactory.createDeveloper();

        developer.writeCode();
    }

    private static DeveloperFactory createDeveloperFactoryBySpeciality(String speciality) {
        switch (speciality) {
            case "java":
                return new JavaDeveloperFactory();
            case "c++":
                return new CppDeveloperFactory();
            default:
                throw new RuntimeException(speciality + " is unknown speciality");
        }
    }
}
