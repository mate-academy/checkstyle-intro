package core.basesyntax;

import core.basesyntax.Model.Dog;
import core.basesyntax.Model.Cat;
import java.time.LocalDate;

public class Hello_World {
    private String a;
    private int variable;
    private int age;
    private int size;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    private int getFromOneToTen() {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result = result + i;
            }
        } return result;
    }

        private void sayHello() {
            System.out.println("Hello, Mate! I am happy to see you! This class looks weird!"
                    + " Your task is to fix the checkstyle in this file."
                    + " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        }

        private void initializeVariables() {
            String a = "Hello mates!";
            System.out.println(a);
            variable = LocalDate.now().getYear();
            System.out.println("It is " + variable + " year");
            age = 25;
            System.out.println("I'm " + age);
            size = 42;
            System.out.println("The size is " + size);
        }
    }

