package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String memberName;
    private int variable;
    private int age;
    private int size;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    private String getFromOneToTen() {
        String result = "";
        for (int i = 1; i <= 10; i++) {
            result += i + " ";
        }
        return result;
    }

    private void sayHello() {
        System.out.println("Hello, Mate! "
                +
                "I am happy to see you! "
                +
                "This class looks weird! Your task is to fix the checkstyle in this file."
                +
                " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");

    }

    private void initializeVariables() {
        String a = "Hello mates!";
        System.out.println(a);
        int variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + "year");
        int age = 25;
        System.out.println("I'm " + age);
        int size = 42;
        System.out.println("The size is " + size);
    }
}
