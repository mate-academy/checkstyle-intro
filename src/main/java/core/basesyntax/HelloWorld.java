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
            result = result + " " + i;
        }
        return result;
    }

    private void sayHello(String hello) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird! "
                + "Your task is to fix the checkstyle in this file. "
                + "Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
    }

    private void initializeVariables() {
        memberName = "Hello mates!";
        System.out.println(memberName);
        variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + " year");
        age = 24;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
