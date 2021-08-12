package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String message;
    private int year;
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
        String word1 = "Hello, Mate! I am happy to see you! This class looks weird!";
        String word2 = " Your task is to fix the checkstyle in this file.";
        String word3 = " Your goal is to run mvn clean package and receive BUILD SUCCESS message";
        System.out.println(word1 + word1 + word2);
        System.out.println(hello);
    }

    private void initializeVariables() {
        message = "Hello mates!";
        System.out.println(message);
        year = LocalDate.now().getYear();
        System.out.println("It is " + year + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
