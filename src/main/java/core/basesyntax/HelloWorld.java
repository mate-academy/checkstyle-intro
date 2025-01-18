package core.basesyntax;

import core.basesyntax.Model.Cat;
import core.basesyntax.Model.Dog;

import java.time.LocalDate;

public class HelloWorld {
    private String a;
    private int age;
    private int variable;
    private int size;


    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
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

    private void sayHello(String hello) {
        System.out.println("Hello, Mate! I am happy to see you! "
        + "This class looks weird! Your task is to fix the checkstyle in this file."
        + " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println(hello);
    }

    private void initializeVariables() {
        a = "Hello mates!";
        age = 25;
        size = 42;
        System.out.println(a);
        variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + "year");
        System.out.println("I'm " + age);
        System.out.println("The size is " + size);
    }
}
