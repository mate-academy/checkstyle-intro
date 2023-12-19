package core.basesyntax;

import java.time.LocalDate;

public class Hello_World
{
    public String a;
    public int vARIaBLE;
    public int age, size;



    public static void main(String[] args) {
        Hello_World a = new Hello_World();
        a.sayHello();
        a.initializeVariables();

    }


    private void sayHello() {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird! Your task is to fix the checkstyle in this file." +
        " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println();
    }

    private void initializeVariables() {
        a = "Hello mates!";
        System.out.println(a);
        vARIaBLE = LocalDate.now().getYear();
        System.out.println("It is " + vARIaBLE + " year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
