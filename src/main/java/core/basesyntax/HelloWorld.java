package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String abc;
    private int variable;
    private int age;
    private int size;

    public HelloWorld(String abc, int variable, int age, int size) {
        this.abc = abc;
        this.variable = variable;
        this.age = age;
        this.size = size;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat(5, "Murzik", "Alis");
    }

    public String getFromOneToTen() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result = "Even number";
            }
            break;
        }
        return result;
    }

    public void sayHello(String hello) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird! "
                + "Your task is to fix the checkstyle in this file. "
                + "Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
    }

    public void initializeVariables() {
        abc = "Hello mates!";
        System.out.println(abc);
        variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}