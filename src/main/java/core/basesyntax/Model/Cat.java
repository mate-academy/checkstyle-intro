package core.basesyntax.Model;

public class Cat {
    int age;
    String name;
    String ownerName;

    @Override
    public String toString() {
        return "Cat{" + "age=" + age + ", name='" + name + '\'' + ", ownerName='" + ownerName + '\'' + '}';
    }
}
