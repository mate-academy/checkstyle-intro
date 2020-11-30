package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;

public class HelloWorld {
    private String name;
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
        String s1 = "Hello, Mate! I am happy to see you! ";
        String s2 = "This class looks weird! ";
        String s3 = "Your task is to fix the checkstyle in this file.";
        String s4 = " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message";
        System.out.println(s1 + s2 + s3 + s4);
        System.out.println(hello);
    }
}
