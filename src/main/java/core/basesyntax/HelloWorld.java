package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String greeting;
    private int currentDate;
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
                result += + i + " ";
            }

        }
        return result;
    }

    private void sayHello(String hello) {
        System.out.println(hello);
        System.out.println("Hello, Mate! I am happy to see you!");
        System.out.println("This class looks weird!");
        System.out.println("Your task is to fix the checkstyle in this file.");
        System.out.println("Your goal is to run `mvn clean package` "
                + "and receive `BUILD SUCCESS` message");
    }

    private void initializeVariables() {
        greeting = "Hello mates!";
        age = 25;
        size = 42;
        currentDate = LocalDate.now().getYear();

        System.out.println(greeting);
        System.out.println("It is " + currentDate + "year");
        System.out.println("I'm " + age);
        System.out.println("The size is " + size);
    }
}
