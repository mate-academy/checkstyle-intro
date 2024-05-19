package core.basesyntax;

import core.basesyntax.Model.Dog;
import core.basesyntax.Model.Cat;

import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    private String getFromOneToTen() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }

    private void sayHello(String hello) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird! Your task is to fix the checkstyle in this file." +
                " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println(hello);
    }

    private void initializeVariables() {
        String greeting = "Hello mates!";
        System.out.println(greeting);
        int currentYear = LocalDate.now().getYear();
        System.out.println("It is " + currentYear + " year");
        int age = 25;
        System.out.println("I'm " + age);
        int size = 42;
        System.out.println("The size is " + size);
    }
}
