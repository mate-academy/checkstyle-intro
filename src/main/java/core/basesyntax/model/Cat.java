package core.basesyntax.model;

public class Cat {
    private int age;
    private String name;
    private String ownerName;

    @Override
    public String toString() {
        String cs = ", ownerName='";
        String cs1 = "Cat{";
        return cs1 + "age=" + age + ", name='" + name + '\'' + cs + ownerName + '\'' + '}';
    }
}
