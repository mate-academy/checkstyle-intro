package core.basesyntax.model;

public class Cat {
    private int age;
    private String name;
    private String ownerName;

    @Override
    public String toString() {
        String a = "Cat{age=" + age + ", name='";
        return a + name + '\'' + ", ownerName='" + ownerName + '\'' + '}';
    }
}
