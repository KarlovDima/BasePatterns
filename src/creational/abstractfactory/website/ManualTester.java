package creational.abstractfactory.website;

import creational.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual Tester tests code...");
    }
}
