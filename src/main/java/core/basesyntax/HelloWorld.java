package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private static final int MAX_NUMBER = 10;

    private String greeting;
    private int currentYear;
    private int age;
    private int size;

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.initializeVariables();
        helloWorld.sayHello(helloWorld.getFromOneToTen());

        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println(dog);
        System.out.println(cat);
    }

    private String getFromOneToTen() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < MAX_NUMBER; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString().trim();
    }

    private void sayHello(String helloMessage) {
        System.out.println(
                "Hello, Mate! I am happy to see you! This class looks weird!"
                        + " Your task is to fix the checkstyle in this file."
                        + " Your goal is to run `mvn clean package` and receive"
                        + " `BUILD SUCCESS` message."
        );
        System.out.println(helloMessage);
    }

    private void initializeVariables() {
        greeting = "Hello mates!";
        System.out.println(greeting);
        currentYear = LocalDate.now().getYear();
        System.out.println("It is " + currentYear + " year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
