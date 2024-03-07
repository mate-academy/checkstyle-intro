package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private static final String MESSAGE = "Hello mates!";
    private static final int AGE = 25;
    private static final int SIZE = 42;
    private static final int variable = LocalDate.now().getYear();

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
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird!"
                + " Your task is to fix the checkstyle in this file."
                + " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println(hello);
    }

    private void initializeVariables() {
        System.out.println(MESSAGE);
        System.out.println("It is " + variable + "year");
        System.out.println("I'm " + AGE);
        System.out.println("The size is " + SIZE);
    }
}
