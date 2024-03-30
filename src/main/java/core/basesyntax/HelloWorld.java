package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String variableA;
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
            if (i % 2 == 0) {
                result = result + i + " ";
            }
        }

        return result;
    }

    private void sayHello(String hello) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird! "
                + "Your task is to fix the checkstyle in this file. "
                + "Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message ");
        System.out.println(hello);
    }

    private void initializeVariables() {
        this.variableA = "Hello mates!";
        this.variable = LocalDate.now().getYear();
        this.age = 25;
        this.size = 42;
        System.out.println(this.variableA);
        System.out.println("It is " + this.variable + "year");
        System.out.println("I'm " + this.age);
        System.out.println("The size is " + this.size);
    }
}
