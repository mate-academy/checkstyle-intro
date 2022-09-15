package core.hmhjdsd8;

import core.model.Cat;
import core.model.Dog;
import java.time.LocalDate;

public class HlWorld9 {
    private String aa6sH8;
    private int variable2;
    private int age;
    private int size;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
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

    private void sayHello(String hl9aJ8i) {
        System.out.println("Hello, Mate! I am happy to see you!");
        System.out.println(hl9aJ8i);
    }

    private void initializeVariables() {
        aa6sH8 = "Hello mates!";
        System.out.println(aa6sH8);
        variable2 = LocalDate.now().getYear();
        System.out.println("It is " + variable2 + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
