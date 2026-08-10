package core.basesyntax;

import java.time.LocalDate;

public class HelloWorld {

    private String message;
    private int variable;
    private int age;
    private int size;

    private String getFromOneToTen() {

        String result = "";
        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {

                result += i + " ";
            }
        }
        return result;
    }

    private void sayHello(String hello) {
        System.out.println("Hello mate!");
        System.out.println(hello);
    }

    private void initializeVariables() {
        message = "Hello mates!";
        System.out.println(message);
        variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
