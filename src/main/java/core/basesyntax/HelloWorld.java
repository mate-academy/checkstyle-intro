package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(getFromOneToTen());
        sayHello("Hello");
        initializeVariables();

    }

    private static String getFromOneToTen() {

        String result = "";
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result += i + " ";
            }
        }
        return result;
    }

    private static void sayHello(String text) {
        System.out.println(text);
    }

    private static void initializeVariables() {
        String str = "Hello mates!";
        int year = LocalDate.now().getYear();
        int age = 25;
        int size = 42;
        System.out.println(str);
        System.out.println("It is " + year + " year");
        System.out.println("I'm " + age);
        System.out.println("The size is " + size);
    }
}
