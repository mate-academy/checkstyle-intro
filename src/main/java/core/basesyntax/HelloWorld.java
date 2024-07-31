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
        Cat cat = new Cat();
        Dog dog = new Dog();
    }

    private String getFromOneToTen() {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                builder.append(i);
            }
        }
        return builder.toString();
    }

    private void sayHello(String hello) {
        System.out.println("Hello, Mate! I am happy to see you! "
                + "This class looks weird! Your task is to fix the checkstyle in this file. "
                + "Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println(hello);
    }

    private void initializeVariables() {
        message = "Hello mates!";
        System.out.println(year);
        year = LocalDate.now().getYear();
        System.out.println("It is " + year + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
