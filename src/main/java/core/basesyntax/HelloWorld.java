package core.basesyntax;

import core.basesyntax.Model.Dog;
import core.basesyntax.Model.Cat;
import java.time.LocalDate;
import java.util.Objects;

public class HelloWorld {
    private String a;
    private int variable;
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
            return result;
        }
        return result;
    }
}
