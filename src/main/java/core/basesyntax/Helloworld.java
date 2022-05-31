package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class Helloworld {
    private String string;
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
        String st = "Hello, Mate! I am happy to see you! ";
        String str = "This class looks weird! Your task is to fix the checkstyle in this file.";
        String str2 = " Your goal is to run `mvn clean package`";
        String str3 = " and receive `BUILD SUCCESS` message";
        System.out.println(st + str + str2 + str3);
        System.out.println(hello);
    }

    private void initializeVariables() {
        string = "Hello mates!";
        System.out.println(string);
        variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
