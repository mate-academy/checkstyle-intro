package core.basesyntax.model;

public class Cat extends Animal {

    @Override
    public String toString() {
        return "Cat{"
                + "age=" + this.getAge()
                + ", name='" + this.getName() + '\''
                + ", ownerName='" + this.getOwnerName() + '\'' + '}';
    }
}
