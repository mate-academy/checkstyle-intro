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
        //String result = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                stringBuilder.append(i).append(" ");
                //result += i + " ";
            }
        }
        return stringBuilder.toString();
    }

    private void sayHello(String hello) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird!");
        System.out.println(" Your task is to fix the checkstyle in this file.");
        System.out.println(" Your goal is to run `mvn clean package`");
        System.out.print(" and receive `BUILD SUCCESS` message");
        System.out.println(hello);
    }
}
