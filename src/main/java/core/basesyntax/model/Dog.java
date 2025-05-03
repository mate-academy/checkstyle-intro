package core.basesyntax.model;

public class Dog extends Animal {
    @Override
    public String toString() {
        return "Dog{"
                + "age=" + this.getAge()
                + ", name='" + this.getName() + '\''
                + ", ownerName='" + this.getOwnerName() + '\'' + '}';
    }
}
