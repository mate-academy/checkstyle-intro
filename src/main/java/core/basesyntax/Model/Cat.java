package core.basesyntax.model;

public class Cat {
    private int age;
    private String name;
    private String ownerName;

    @Override
    public String toString() {
        return "Cat{"
                + "age=" + this.age
                + ", name='" + this.name + '\n'
                + ", ownerName='" + this.ownerName + '\n'
                + '}';
    }
}
