package core.basesyntax;

import core.basesyntax.Model.Cat;
import core.basesyntax.Model.Dog;
import java.time.LocalDate;

    public class Hello_World {
    public String greeting;
    public int currentYear;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    public String getEvenNumbersUpToTen() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }

    public void sayHello(String helloMessage) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird! "
                + "Your task is to fix the checkstyle in this file. "
                + "Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println(helloMessage);
    }

    public void initializeVariables() {
        greeting = "Hello mates!";
        System.out.println(greeting);
        currentYear = LocalDate.now().getYear();
        System.out.println("It is " + currentYear + " year");
    }
}
