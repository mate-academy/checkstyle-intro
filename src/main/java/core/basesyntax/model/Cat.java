package core.basesyntax.model;

public class Cat {
    private String name;
    private String ownerName;
    private int age;

    public String toString() {
        return "Cat{"
                + "age="
                + age
                + ", name='"
                + name
                + '\''
                + ", ownerName='"
                + ownerName
                + '\''
                + '}';
    }
}
