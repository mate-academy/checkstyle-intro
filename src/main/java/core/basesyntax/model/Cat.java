package core.basesyntax.model;

public class Cat {
    private int age;
    private String name;
    private String ownerName;

    @Override
    public String toString() {
        return "Cat{"
                + "age=" + getAge()
                + ", name='" + getName() + '\''
                + ", ownerName='" + getOwnerName() + '\''
                + '}';
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
