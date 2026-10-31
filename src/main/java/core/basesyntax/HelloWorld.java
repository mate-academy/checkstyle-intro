package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String message;
    private int variable;
    private int age;
    private int size;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println(dog);
        System.out.println(cat);
        HelloWorld hello = new HelloWorld();
        hello.initializeVariables();    
    }

    private void initializeVariables() {
        message = "Hello mates!";
        System.out.println(message);
        variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + " year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
