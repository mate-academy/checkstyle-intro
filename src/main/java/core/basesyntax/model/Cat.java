package core.basesyntax.model;

public class Cat extends Animal {
    @Override
    public String toString() {
        return "Cat{"
                + "age=" + getAge()
                + ", name='" + getName() + '\''
                + ", ownerName='" + getOwnerName() + '\''
                + '}';
    }
}
