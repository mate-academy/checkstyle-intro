package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String abcd;
    private int variable;
    private int age;
    private int size;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.initializeVariables();

        System.out.println(helloWorld.getFromOneToTen());
        helloWorld.sayHello("Hello, World!");
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
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird! "
                + "Your task is to fix the checkstyle in this file. "
                + "Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println(hello);
    }

    private void initializeVariables() {
        String abcd = "Hello mates!";
        System.out.println(abcd);

        int variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + "year");

        int age = 25;
        System.out.println("I'm " + age);

        int size = 42;
        System.out.println("The size is " + size);
    }
}
