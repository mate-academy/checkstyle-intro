package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String a1;
    private int age;
    private int size;
    private int variable;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
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
        System.out.println("Hello, Mate! I am happy to see you! "
                + "This class looks weird! "
                + "Your task is to fix the checkstyle in this file."
                + " Your goal is to run `mvn clean package` and receive "
                + "`BUILD SUCCESS` message");
    }

    private void initializeVariables() {
        a1 = "Hello mates!";
        variable = LocalDate.now().getYear();
        age = 25;
        size = 42;

        System.out.println(a1);
        System.out.println("It is" + " " + variable + " " + "year");
        System.out.println("I'm" + " " + age);
        System.out.println("The size is" + " " + size);
    }
}
