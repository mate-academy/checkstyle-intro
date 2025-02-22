package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String greeting;
    private int variable;
    private int age;
    private int size;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        // Используем объекты для вывода (если toString() переопределен, как в Cat)
        System.out.println(dog);
        System.out.println(cat);
        
        // Создаем объект HelloWorld для вызова нестатических методов
        HelloWorld hw = new HelloWorld();
        // Вызываем метод, который возвращает строку и выводим её
        System.out.println(hw.getFromOneToTen());
        // Вызываем метод sayHello, передавая строку (параметр можно использовать, если понадобится)
        hw.sayHello("Hello");
        // Вызываем метод, который инициализирует переменные и выводит информацию
        hw.initializeVariables();
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
        System.out.println("Hello, Mate! I am happy to see you!"
                + " This class looks weird!"
                + " Your task is to fix the checkstyle in this file."
                + " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println("HELLO");
    }

    private void initializeVariables() {
        greeting = "Hello mates!";
        System.out.println(greeting);
        variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + " year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
