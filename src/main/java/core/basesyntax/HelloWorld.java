package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {

    public static void main(String[] args) {

        Cat cat = new Cat();

        Dog dog = new Dog();
    }

    private String getFromOneToTen() {

        String result = "";

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {

                result += i + " ";
            }
        }
        return result;
    }

    private void sayHello(String input) {

        System.out.println("Hello, Mate! I am happy to see you! This class looks weird! "
                + " Your task is to fix the checkstyle in this file. "
                + " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");

        System.out.println(input);
    }

    private void initializeVariables() {
        String text = "Hello mates!";
        int variable = LocalDate.now().getYear();
        int age = 25;
        int size = 42;

        System.out.println(text);

        System.out.println("It is " + variable + "year");
        System.out.println("I'm " + age);
        System.out.println("The size is " + size);
    }
}
