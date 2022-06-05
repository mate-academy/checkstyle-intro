package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        getFromOneToTen();
        initializeVariables();
    }

    private static String getFromOneToTen() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }

    private static void sayHello(String hello) {
        System.out.println(hello + " I am happy to see you!\n"
                            + "This class looks weird! Your task is to fix "
                            + "the checkstyle in this file.\n"
                            + "Your goal is to run `mvn clean package` and receive "
                            + "`BUILD SUCCESS` message");
    }

    private static void initializeVariables() {
        String greeting = "Hello mates!";

        sayHello(greeting);
        int year = LocalDate.now().getYear();
        System.out.println("It is " + year + " year");
        int age = 25;
        System.out.println("I'm " + age);
        int size = 42;
        System.out.println("Size of foot is " + size);
    }
}
