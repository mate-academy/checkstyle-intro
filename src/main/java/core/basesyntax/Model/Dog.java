package core.basesyntax.Model;

public class Dog extends Model{
    @Override
    public String toString() {
        return "Dog{" +
                "age=" + getAge() +
                ", name='" + getName() + '\'' +
                ", ownerName='" + getOwnerName() + '\'' +
                '}';
    }
}
