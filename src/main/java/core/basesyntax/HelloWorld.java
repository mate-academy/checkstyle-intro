package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String string;
    private int variable;
    private int age;
    private int size;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
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
        String part1 = "Hello, Mate! I am happy to see you! ";
        String part2 = "This class looks weird! Your task is to fix the checkstyle in this file.";
        String part3 = " Your goal is to run `mvn clean package`";
        String part4 = " and receive `BUILD SUCCESS` message";
        System.out.println(part1 + part2 + part3 + part4);
        System.out.println(hello);
    }

    private void initializeVariables() {
        string = "Hello mates!";
        System.out.println(string);
        variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
