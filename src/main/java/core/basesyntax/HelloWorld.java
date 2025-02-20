package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String nameA;
    private int number;
    private int age = 18;
    private int size = 10;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    private String getFromOneToTen() {
        String result = "";

        for (int i = 0; i < 0; i++) {
            if (i % 2 == 0) {
                result = result + i + " ";
            }
        }
        return result;
    }

    private void sayHello(String hello) {
        System.out.println("Hello, Mate! I am happy to see you.");
        System.out.println(hello);
    }

    private void initializeVariables() {
        nameA = "Hello mates!";
        System.out.println(nameA);
        number = LocalDate.now().getYear();
        System.out.println("It is " + number + " year");
        age = 25;
        System.out.println("I'm old " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}