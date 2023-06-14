package core.basesyntax.model;

public class Dog extends Animal {
    public String toString() {
        return "Cat{"
                + "age=" + getAge()
                + ", name='" + getName() + '\''
                + ", ownerName='" + getOwnerName() + '\''
                + '}';
    }
}
