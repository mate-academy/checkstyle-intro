package core.basesyntax;

import java.time.LocalDate;

public class HelloWorld {

    private String mate;
    private int variable;
    private int age;

    private int size;
    private String helloWorld;

    public static void main(String[] args) {
        core.basesyntax.model.Dog dog = new core.basesyntax.model.Dog();
        core.basesyntax.model.Cat cat = new core.basesyntax.model.Cat();
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

    private void sayHello(String helloWorld) {
        helloWorld = helloWorld;
        System.out.println("Hello, Mate! I am happy to see you!"
                +
                " This class looks weird! Your task is to fix the checkstyle in this file."
                +
                " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println(helloWorld);
    }

    private void initializeVariables() {
        mate = "Hello mates!";
        System.out.println(mate);
        variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
