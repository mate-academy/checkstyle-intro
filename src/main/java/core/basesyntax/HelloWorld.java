package core.basesyntax;


import java.time.LocalDate;


public class HelloWorld {


    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();
        System.out.println(helloWorld.getFromOneToTen());
        helloWorld.initializeVariables();
    }

    private String getFromOneToTen() {
        StringBuilder result=new StringBuilder();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }

    private void sayHello() {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird! Your task is to fix the checkstyle in this file." +
        " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println("Hello from main!");
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
