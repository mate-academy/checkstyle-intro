package core.basesyntax.model;

public class Cat {

    private int age;
    private String name;
    private String ownerName;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{"
                + "age=" + age
                + ", name='" + name + '\''
                + ", ownerName='" + ownerName + '\''
                + '}';
    }
}
