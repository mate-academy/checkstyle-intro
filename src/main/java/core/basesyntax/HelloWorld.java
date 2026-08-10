package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String a2;
    private int variable;
    private int age;
    private int size;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    private String getFromOneToTen() {
        String result = "";

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result = result + i + " ";
            }
        }
        return result;
    }

    private void sayhello(String hello) {
        String p1 = "hello, Mate! I am happy to see you! This class looks weird! "
                + "Your task is to fix the checkstyle in this file.";
        String p2 = " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message";
        System.out.println(p1 + p2);
        System.out.println(hello);
    }

    private void initializevariables() {
        a2 = "hello mates!";
        System.out.println(a2);
        variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
