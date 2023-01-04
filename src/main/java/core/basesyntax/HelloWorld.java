package core.basesyntax;

import core.basesyntax.Model.Cat;
import core.basesyntax.Model.Dog;

import java.time.LocalDate;

public class HelloWorld {
    private void initializeVariables() {
        int variable = LocalDate.now().getYear();
        int age = 25;
        int size = 42;
        System.out.println("Hello mates!");
        System.out.println("It is " + variable + " year");
        System.out.println("I'm " + age);
        System.out.println("The size is " + size);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        new HelloWorld().sayHello("hello");
    }

    private String getFromOneToTen() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }

    private void sayHello(String hello) {
        System.out.println("Hello, Mate! I am happy to see you! "
                + "This class looks weird! Your task is to fix the checkstyle "
                + "in this file. Your goal is to run `mvn clean package` and receive "
                + "`BUILD SUCCESS` message " + hello);
    }
}
