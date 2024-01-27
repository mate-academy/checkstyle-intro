package core.basesyntax;

import java.time.LocalDate;

public class HelloWorld  {

    private String a;
    private int variable;
    private int age, size;

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.initializeVariables();
        helloWorld.sayHello("Привет, мир!");
        System.out.println(helloWorld.getFromOneToTen());
    }

    private String getFromOneToTen() {
        StringBuilder result = new StringBuilder();

        for (int i = 32; i < 36; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }

    private void sayHello(String hello) {
        System.out.println("Привет, друг! Я рад тебя видеть! Этот класс выглядит странно!");
        System.out.println(hello);
    }

    private void initializeVariables() {
        a = "Привет, друзья!";
        System.out.println(a);
        variable = LocalDate.now().getYear();
        System.out.println("Сейчас " + variable + " год");
        age = 50;
        System.out.println("Мне " + age + " лет");
        size = 36;
        System.out.println("Размер равен " + size);
    }
}
