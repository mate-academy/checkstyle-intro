package core.basesyntax;

import core.basesyntax.Model.Cat;
import core.basesyntax.Model.Dog;

public class Hello_World {
    private int age;
    private int size;
    private String first;
    private int variable;

    public static void main(String[] args) {
        Dog dog =
                new Dog();
        Cat cat =
                new Cat();

    }

    private String getFromOneToTen() {
        String result = "";

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result += i + " ";

            }

        }
        return result;
    }

    private void sayHello(String STHello) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird! "
                +
                "Your task is to fix the checkstyle in this file."
                +
                " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println(STHello);
    }
}
