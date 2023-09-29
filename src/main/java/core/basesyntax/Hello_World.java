package core.basesyntax;

import core.basesyntax.Model.Dog;
import core.basesyntax.Model.Cat;

import java.time.LocalDate;

public class Hello_World {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    private String getFromOneToTen() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result += i
                        + " ";
            }
        }
        return result;
    }

    private void sayHello(String hello) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird! Your "
                + "task is to fix the checkstyle in this file. Your goal"
                + " is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println(hello);
    }

    private void initializeVariables() {
        String a;
        a = "Hello mates!";
        int variable;
        variable = LocalDate.now().getYear();
        int age, size;
        age = 25;
        size = 42;
        System.out.println("I'm "
                + age);
        System.out.println("The size is "
                + size);
        System.out.println(a);
        System.out.println("It is "
                + variable
                + "year");
    }
}
