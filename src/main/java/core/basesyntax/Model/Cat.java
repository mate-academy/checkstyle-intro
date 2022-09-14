package core.basesyntax.Model;

import core.basesyntax.HelloWorld;

public class Cat extends HelloWorld {
    private int age;
    private String name;
    private String ownerName;

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
