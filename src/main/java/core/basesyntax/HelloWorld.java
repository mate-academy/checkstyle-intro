package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String greetMessage;
    private int year;
    private int age;
    private int size;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    private String getFromOneToTen() {
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < 10; i += 2) {
            resultString.append(i).append(' ');
        }
        return resultString.toString();
    }

    private void sayHello(String helloMessage) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird!"
                            + " Your task is to fix the checkstyle in this file."
                            + " Your goal is to run `mvn clean package`"
                            + " and receive `BUILD SUCCESS` message");
        System.out.println(helloMessage);
    }

    private void initializeVariables() {
        greetMessage = "Hello mates!";
        System.out.println(greetMessage);
        year = LocalDate.now().getYear();
        System.out.println("It is " + year + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
