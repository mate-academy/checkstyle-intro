package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private static final int MAX_AGE = 25;
    private static final int MAX_SIZE = 45;

    private String greeting;
    private int variable;
    private int age;
    private int size;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    private String getFromOneToTen() {
        String result = "";

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result = result + i + " ";
            }
        }
        return result;
    }

    private void greetings(String hello) {
        System.out.println("Hello, Mate! I am happy to see you! "
                + "This class looks weird! Your task is to fix the checkstyle in this file."
                + " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` "
                + "message");
        System.out.println(hello);
    }

    private void initializeVariables() {
        greeting = "Hello mates!";
        System.out.println(greeting);

        variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + " year");

        age = MAX_AGE;
        System.out.println("I'm " + age);

        size = MAX_SIZE;
        System.out.println("The size is " + size);
    }
}
