package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class Main {
    private String string;
    private int age;
    private int size;
    private int variable;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
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

    private void sayHello() {
        System.out.println("Hello, Mate! I am happy to see you!"
                + " This class looks weird! Your task is to fix the checkstyle in this file."
                + " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
    }

    private void initializeVariables() {
        string = "Hello mates!";
        variable = LocalDate.now().getYear();
        age = 25;
        size = 42;

        System.out.println(string + "\n "
                + "It is" + " " + variable + " " + "year" + "\n "
                + "I'm" + " " + age + "\n "
                + "The size is" + " " + size);
    }
}
