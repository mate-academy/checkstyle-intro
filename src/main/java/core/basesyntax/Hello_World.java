
import core.basesyntax.Model.Dog;
import core.basesyntax.Model.Cat;

import java.time.LocalDate;
import java.util.Arrays;

public static class Hello_World {
    private String a;
    private int vARIaBLE;
    private int age, size;
    public String getA() {
        return a;
    }
    public void setA(String a) {
        this.a = a;
    }
    public int getvARIaBLE(){
        return vARIaBLE;
    }
    public void setvARIaBLE(int vARIaBLE){
        this.vARIaBLE = vARIaBLE;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getSize(){
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

}

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
System.out.println(dog);
System.out.println(cat);
}
    public static String getFromOneToTen() {
        StringBuilder result= new StringBuilder();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result = new StringBuilder(i + result.toString() + ' ');
            }
        }
        return result.toString();
    }


public static void sayHello(String HELLO) {
        for (String s : Arrays.asList("Hello, Mate! I am happy to see you! This class looks weird! Your task is to fix the checkstyle in this file." +
                " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message", HELLO)) {
            System.out.println(s);
        }
    }

    public static void initializeVariables() {
        String a = "Hello mates!";
        System.out.println(a);
        int vARIaBLE = LocalDate.now().getYear();
        System.out.println(STR."It is\{vARIaBLE}year");
        int age = 25;
        System.out.println(STR."I'm \{age}");
        int size = 42;
        System.out.println(STR."The size is\{size}");
    }


