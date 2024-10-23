package core.basesyntax.model;

public class Dog {
    private int age;
    private String name;
    private String breed;

    @Override
    public String toString() {
        return "Dog{"
                + "age=" + age
                + ", name='" + name + '\''
                + ", breed='" + breed + '\''
                + '}';
    }
}