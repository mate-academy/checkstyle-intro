package core.basesyntax.model;

public class Cat {
    private final int age;
    private final String name;
    private final String ownerName;

    public Cat(int age, String name, String ownerName) {
        this.age = age;
        this.name = name;
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Cat{" + "age=" + age
                + ", name='" + name + '\''
                + ", ownerName='" + ownerName + '\''
                + '}';
    }
}
