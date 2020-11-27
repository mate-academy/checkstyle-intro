package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;

public class HelloWorld {

    String abc;
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

        String one = "Hello, Mate! I am happy to see you! This class looks weird!";
        String two = " Your task is to fix the checkstyle in this file. ";
        String three = " Your goal is to run `mvn clean package`";
        String four = " and receive `BUILD SUCCESS` message";

        System.out.println(one + two + three + four);
        System.out.println(hello);
    }
}
