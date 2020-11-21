package core;

import core.model.Cat;
import core.model.Dog;

public class HelloWorld {

    private String name;

    private int age;
    private int size;
    private int varible;

    public HelloWorld() {
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    private String getFromOneToTen() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                stringBuilder.append(i).append(" ");
            }
        }
        return stringBuilder.toString();
    }

    private void sayHello(String hello) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird!"
                + " Your task is to fix the checkstyle in this file."
                + " Your goal is to run `mvn clean package` and receive "
                + "`BUILD SUCCESS` message");
        System.out.println(hello);
    }
}
