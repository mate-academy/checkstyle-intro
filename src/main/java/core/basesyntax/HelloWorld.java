package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String message;
    private int currentYear;
    private int age;
    private int size;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    private String getEvenNumbersUpToTen() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" ");

            }

        }

        return result.toString().trim();

    }

    private void sayHello(String greeting) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks much better now!");
        System.out.println(greeting);

    }

    private void initializeVariables() {
        message = "Hello mates!";
        System.out.println(message);
        currentYear = LocalDate.now().getYear();
        System.out.println("It is " + currentYear + " year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }

}

