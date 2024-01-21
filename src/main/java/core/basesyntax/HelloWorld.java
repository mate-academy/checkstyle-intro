package core.basesyntax;

import java.time.LocalDate;

public class HelloWorld {
    private String myVariable;
    private int myVariableTwo;
    private int myAge;
    private int mySize;

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello("HELLO");
        helloWorld.initializeVariables();
        System.out.println(helloWorld.getFromOneToTen());
    }

    public String getFromOneToTen() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }

    public void sayHello(String hello) {
        System.out.println("Hello, Mate! I am happy to see you!"
                + " This class looks weird! Your task is to fix the checkstyle in this file."
                + " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println(hello);
    }

    public void initializeVariables() {
        myVariable = "Hello mates!";
        System.out.println(myVariable);
        myVariableTwo = LocalDate.now().getYear();
        System.out.println("It is " + myVariableTwo + " year");
        myAge = 25;
        System.out.println("I'm " + myAge);
        mySize = 42;
        System.out.println("The size is " + mySize);
    }
}
