package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;

public class HelloWorld {
    private int variable;
    private int age;
    private int size;

    public HelloWorld() {
    }

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
        System.out.println(new StringBuilder().append("Hello, Mate!")
                                              .append(" I am happy to see you!")
                                              .append("This class looks weird!")
                                              .append("Your task is ")
                                              .append("to fix the checkstyle in this file.")
                                              .append(" Your goal is to run `mvn clean package` ")
                                              .append("and receive `BUILD SUCCESS` message")
                                              .toString());
        System.out.println(hello);
    }
}
