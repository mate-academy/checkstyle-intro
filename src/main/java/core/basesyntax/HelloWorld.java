package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;

public class HelloWorld {
    public static void main(String[] args) {
        Cat cat = new Cat(3, "Whiskers");
        Dog dog = new Dog("Golden Retriever");
        System.out.println(cat);
        System.out.println(dog);
    }
}
