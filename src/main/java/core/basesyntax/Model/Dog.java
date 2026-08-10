package core.basesyntax.model;

public class Dog {
    private int age;
    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{"
                + "age=" + age
                + ", name='" + name
                + '\''
                + '}';
    }
}
