package core.basesyntax.model;

public class Cat {
    private int age;
    private String name;
    private String ownerName;

    @Override
    public String toString() {
        String help = "Cat{" + "age=" + age + ", name='" + name;
        return help + ", ownerName='" + ownerName + '}';
    }
}
