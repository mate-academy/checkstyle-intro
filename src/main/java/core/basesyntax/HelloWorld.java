package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {

    public static void main(String[] args) {

        Dog jessy = new Dog("Herta");
        Cat cat = new Cat("Hippie");

        System.out.println(jessy.getName());
        System.out.println(cat.getName());

        initializeVariables();
        sayHello();
        System.out.println(getFromOneToTen());
    }

    private static String getFromOneToTen() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }

    private static void sayHello() {
        System.out.println("Hello, Kolya! I am happy to see you! This class looks weird! "
                + "Your task is to fix the checkstyle in this file."
                + " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
    }

    private static void initializeVariables() {
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
