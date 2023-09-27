package com.basesyntax;

import com.basesyntax.model.Cat;
import com.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {

    private int variable;
    private int age;
    private int size;
    private String word;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    private String getFromOneToTen() {
        String result = " ";

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result = result + i + " ";
            }
        }
        return result;
    }

    private void sayHello(String hello) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird!");
        System.out.println(hello);
    }

    private void initializeVariables() {
        word = "Hello mates!";
        System.out.println(word);
        variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
