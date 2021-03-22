package core.basesyntax;

import model.Cat;
import model.Dog;

public class HelloWorld {
    private String str;
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
                result += i
                        + " ";
            }
        }
        return result;
    }

    private void sayHello(String hello) {
        System.out.println(hello);
    }
}
