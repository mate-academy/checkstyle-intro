package core.basesyntax;

import core.basesyntax.Model.Cat;
import core.basesyntax.Model.Dog;

public class Hello_World {
    public static void main(String[] args) {
        Cat cat = new Cat(3, "Whiskers");
        Dog dog = new Dog("Golden Retriever");
        System.out.println(cat);
        System.out.println(dog);
    }
}
