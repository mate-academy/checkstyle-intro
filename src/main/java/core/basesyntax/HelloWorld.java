package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String name = "a";
    private int varIaBlE;
    private int size;
    private int age;

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

    private void sayHello(String heLlO) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird!"
                +
                " Your task is to fix the checkstyle in this file."
                +
                 " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println(heLlO);
    }

    private void initializeVariables() {
        name = "Hello mates!";
        System.out.println(name);
        varIaBlE = LocalDate.now().getYear();
        System.out.println("It is " + varIaBlE + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
