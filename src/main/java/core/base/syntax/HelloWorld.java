package CoreBaseSyntax;

import CoreBaseSyntax.Model.Cat;
import CoreBaseSyntax.Model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    public HelloWorld() {
    }

    public static void main(String[] args) {
        new Dog();
        new Cat();
    }

    private String getFromOneToTen() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" ");
            }
        }

        return result.toString();
    }

    private void sayHello(String hello) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird!");
        System.out.println("Your task is to fix the checkstyle in this file. Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println(hello);
    }

    private void initializeVariables() {
        String a = "Hello mates!";
        System.out.println(a);
        int variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + "year");
        int age = 25;
        System.out.println("I'm " + age);
        int size = 42;
        System.out.println("The size is " + size);
    }
}
