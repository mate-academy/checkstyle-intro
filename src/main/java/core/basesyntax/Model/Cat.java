package core.basesyntax.Model;

public class Cat extends Model{
    @Override
    public String toString() {
        return "Cat{" +
                "age=" + getAge() +
                ", name='" + getName() + '\'' +
                ", ownerName='" + getOwnerName() + '\'' +
                '}';
    }
}
