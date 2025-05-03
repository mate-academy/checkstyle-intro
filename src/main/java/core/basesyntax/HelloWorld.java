package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String hello;
    private int year;
    private int age;
    private int size;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    public String getGreeting() {
        return hello;
    }

    public void setGreeting(String hello) {
        this.hello = hello;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private String getFromOneToTen() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            result.append(i).append(" ");
        }
        return result.toString();
    }

    private void sayHello(String hello) {
        System.out.println(hello);
    }

    private void initializeVariables() {
        setGreeting("Hello mates!");
        System.out.println(getGreeting());
        setYear(LocalDate.now().getYear());
        System.out.println("It is " + getYear() + " year");
        setAge(25);
        System.out.println("I'm " + getAge());
        setSize(42);
        System.out.println("The size is " + getSize());
    }
}
