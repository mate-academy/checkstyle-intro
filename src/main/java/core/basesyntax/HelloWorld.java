package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String message;
    private int messageVariable;
    private int age;
    private int size;

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
    }

    private String getFromOneToTen() {
        String result = "";

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result = String.format("%s%d ", result, i);
            }
        }
        return result;
    }

    private void sayHello(String hello) {
        String message = "Hello, Mate! "
        		+ "I am happy to see you! ";
        		+ "This class looks weird! ";
        		+ "Your task is to fix the checkstyle in this file.";
        String message2;
        message2 = "Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message";
        System.out.println(message2);
        System.out.println(hello);
    }

    private void initializeVariables() {
        message = "Hello mates!";
        System.out.println(message);
        messageVariable = LocalDate.now().getYear();
        System.out.println("It is " + messageVariable + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
