package core.basesyntax.model;

public class Cat {
    private int age;
    private String name;
    private String ownerName;

    @Override
    public String toString() {
        String str = "Cat{" + "age=" + age + ", name='";
        return str + name + '\'' + ", ownerName='" + ownerName + '\'' + '}';
    }
}
