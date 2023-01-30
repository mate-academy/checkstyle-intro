package core.basesyntax.model;

public class Cat {
    private int age;
    private String name;
    private String ownerName;

    @Override
    public String toString() {
        return String.format("Cat{age=%d, name='%s', ownerName='%s'}", age, name, ownerName);
    }
}
