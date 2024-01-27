package core.basesyntax.model;

import java.time.LocalDate;

public class HelloWorld {
    private String helloPhrase;
    private int age;
    private int variable;
    private int size;

    public void setHelloPhrase(String helloPhrase) {
        this.helloPhrase = helloPhrase;
    }

    public String getHelloPhrase() {
        return helloPhrase;
    }

    public void setVariable(int variable) {
        this.variable = variable;
    }

    public int getVariable() {
        return variable;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        HelloWorld a = new HelloWorld();
        a.sayHello();
        a.initializeVariables();

    }

    private void sayHello() {
        System.out.println("Hello, Mate! I am happy to see you! "
                + "This class looks weird! Your task is to fix the checkstyle in this file. "
                + "Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println();
    }

    private void initializeVariables() {
        setHelloPhrase("Hello mates!");
        System.out.println(getHelloPhrase());
        setVariable(LocalDate.now().getYear());
        System.out.println("It is " + getVariable() + " year");
        setAge(25);
        System.out.println("I'm " + getAge());
        setSize(42);
        System.out.println("The size is " + getSize());
    }
}
