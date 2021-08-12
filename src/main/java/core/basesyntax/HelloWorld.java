package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;
// import java.util.Objects;

public class HelloWorld {
    private String message;
    private int variable;
    private int age;
    private int size;

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
    }

    private String getFromOneToTen() {
        String result = "";

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result = String.format("%s%d ", result, i);
            }
        }
        return result;
    }

    private void sayHello(String hello) {
        StringBuilder mes = new StringBuilder();
        String message = "Hello, Mate! "
        		+ "I am happy to see you! ";
        		+ "This class looks weird! ";
        		+ "Your task is to fix the checkstyle in this file.";
        System.out.println(me1 + me2 + me3 + me4);
        String mes2;
        mes2 = "Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message";
        System.out.println(mes2);
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
