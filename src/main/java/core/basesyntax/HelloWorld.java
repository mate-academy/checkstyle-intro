package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;
//import java.util.Objects;

public class HelloWorld {
    private String a1A = "Hello mates!";
    private int variable = LocalDate.now().getYear();
    private int age = 25;
    private int size = 42;

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        HelloWorld helloWorld = new HelloWorld();
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

    private void sayHello(String hello) {
        System.out.println("Hello, Mate!");
        System.out.println(hello);
    }

    private void initializeVariables() {
        System.out.println(a1A);
        System.out.println("It is " + variable + "year");
        System.out.println("I'm " + age);
        System.out.println("The size is " + size);
    }
}
