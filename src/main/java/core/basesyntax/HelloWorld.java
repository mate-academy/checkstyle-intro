package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String sector;
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

    private void sayHello(String hello) {
        System.out.print("Hello, Mate! I am happy to see you! This class looks");
        System.out.print(" weird! Your task is to fix the checkstyle in this file.");
        System.out.println(" Your goal is to run `mvn clean package` and receive");
        System.out.println(" `BUILD SUCCESS` message");
        System.out.println(hello);
    }

    private void initializeVariables() {
        sector = "Hello mates!";
        System.out.println(sector);
        variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
