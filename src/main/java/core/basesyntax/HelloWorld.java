package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String greeting;
    private int actualYear;
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello, Mate! I am happy to see you! This class looks weird! ");
        stringBuilder.append("Your task is to fix the checkstyle in this file.");
        stringBuilder.append("Your goal is to run `mvn clean package`");
        stringBuilder.append(" and receive `BUILD SUCCESS` message");
        System.out.println(stringBuilder);
        System.out.println(hello);
    }

    private void initializeVariables() {
        greeting = "Hello mates!";
        System.out.println(greeting);
        actualYear = LocalDate.now().getYear();
        System.out.println("It is " + actualYear + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
