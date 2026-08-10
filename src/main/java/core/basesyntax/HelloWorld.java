package core.basesyntax;

import java.time.LocalDate;

public class HelloWorld {
    private static final int TEN = 10;
    private static final int TWO = 2;

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.initializeVariables();
        helloWorld.sayHello("Hello");
        System.out.println(helloWorld.getFromOneToTen());
        new core.basesyntax.model.Dog();
        new core.basesyntax.model.Cat();
    }

    private String getFromOneToTen() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < TEN; i++) {
            if (i % TWO == 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }

    private void sayHello(String hello) {
        System.out.println("Hello, Mate! I am happy to see you!");
        System.out.println(hello);
    }

    private void initializeVariables() {
        final String message = "Hello mates!";
        System.out.println(message);

        final int currentYear = LocalDate.now().getYear();
        System.out.println("It is " + currentYear + " year");

        final int age = 25;
        System.out.println("I'm " + age);

        final int size = 42;
        System.out.println("The size is " + size);
    }
}