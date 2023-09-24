package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String helloMassage;
    private int variable;
    private int age;
    private int size;

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.initializeVariables();

        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Dog: " + dog);
        System.out.println("Cat: " + cat);

        String numbers = helloWorld.getFromOneToTen();
        System.out.println("Even numbers from 1 to 10: " + numbers);
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
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird! "
                + " Your task is to fix the checkstyle in this file.");
        System.out.println(hello);
    }

    private void initializeVariables() {
        helloMassage = "Hello mates!";
        System.out.println(helloMassage);
        variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + " year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
