package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;

import java.time.LocalDate;

public class HelloWorld {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();


        cat.setAge(3);
        cat.setName("Whiskers");
        cat.setOwnerName("John Doe");


        dog.setAge(5);
        dog.setName("Buddy");

        System.out.println("Cat's age: " + cat.getAge());
        System.out.println("Cat's name: " + cat.getName());
        System.out.println("Cat's owner name: " + cat.getOwnerName());

        System.out.println("Dog's age: " + dog.getAge());
        System.out.println("Dog's name: " + dog.getName());


        HelloWorld helloWorld = new HelloWorld();
        helloWorld.initializeVariables();
        helloWorld.sayHello("Hello there!");
        System.out.println(helloWorld.getFromOneToTen());
        System.out.println(cat);
        System.out.println(dog);
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
        String message = "Hello mates!";
        System.out.println(message);
        int variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + " year");
        int age = 25;
        System.out.println("I'm " + age);
        int size = 42;
        System.out.println("The size is " + size);
    }
}
