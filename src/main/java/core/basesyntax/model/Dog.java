package core.basesyntax.model;

public class Dog extends Animal {
    @Override
    public String toString() {
        return "Dog{"
                + "age=" + getAge()
                + ", name='" + getName() + '\''
                + ", ownerName='" + getOwnerName() + '\''
                + '}';
    }
}
