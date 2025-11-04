package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String message;
    private int variable;
    private int age;
    private int size;

    public String getMessage() {
        return message;
    }

    public int getVariable() {
        return variable;
    }

    public int getAge() {
        return age;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();

        hw.getFromOneToTen();
        hw.sayHello();
        hw.initializeVariables();

        Cat cat = new Cat();

        cat.setAge(2);
        cat.setName("Micky");
        cat.setOwnerName("Bella");

        Dog dog = new Dog();

        dog.setAge(5);
        dog.setName("Nicky");
        dog.setOwnerName("Bella");

        System.out.println(cat);
        System.out.println(dog);

        System.out.println(hw.getFromOneToTen());
    }

    private String getFromOneToTen() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }

    private void sayHello() {
        System.out.print("Hello, Mate! I am happy to see you!" + " This class looks weird!");
        System.out.print(" Your task is to fix the checkstyle in this file.");
        System.out.print(" Your goal is to run `mvn clean package`");
        System.out.println(" and receive `BUILD SUCCESS` message");
    }

    private void initializeVariables() {
        message = "Hello mates!";
        System.out.println(getMessage());
        variable = LocalDate.now().getYear();
        System.out.println("It is " + getVariable() + " year");
        age = 25;
        System.out.println("I'm " + getAge());
        size = 42;
        System.out.println("The size is " + getSize());
    }
}
