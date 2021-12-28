package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String aka;
    private int var;
    private int age;
    private int size;

    public static void main(String [] arg) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    private String getFromOneToTen() {
        String res = "";
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                res += i + " ";
            }
        }
        return res;
    }

    private void sayHello(String hello) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird! "
                + "Your task is to fix the checkstyle in this file. "
                + "Your goal is to run `mvn clean package` and receive "
                + "`BUILD SUCCESS` message");
        System.out.println(hello);
    }

    private void initializeVariables() {
        aka = "Hello mates!";
        System.out.println(aka);
        var = LocalDate.now().getYear();
        System.out.println("It is " + var + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
