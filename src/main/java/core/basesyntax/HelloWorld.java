package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String greetingsMessage;
    private int dateVariable;
    private int userAge;
    private int userSize;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    private String getFromOneToTen() {
        String result = " ";
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result += i + " ";
            }
        }
        return result;
    }

    private void sayHello(String message) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird!"
                + " Your task is to fix the checkstyle in this file."
                + " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println(message);
    }

    private void initializeVariables() {
        greetingsMessage = "Hello mates!";
        System.out.println(greetingsMessage);
        dateVariable = LocalDate.now().getYear();
        System.out.println("It is " + dateVariable + " year");
        userAge = 25;
        System.out.println("I'm " + userAge);
        userSize = 42;
        System.out.println("The size is " + userSize);
    }
}
