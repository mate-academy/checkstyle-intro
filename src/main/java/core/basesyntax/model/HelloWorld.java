package core.basesyntax.model;

import java.time.LocalDate;

class HelloWorld {
    private String myString;
    private int variable;
    private int age;
    private int size;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
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

    private void sayHello(String sayHello) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird!"
                +
                " Your task is to fix the checkstyle in this file."
                +
                " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println(sayHello);
    }

    private void initializeVariables() {
        myString = "Hello mates!";
        System.out.println(myString);
        variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
