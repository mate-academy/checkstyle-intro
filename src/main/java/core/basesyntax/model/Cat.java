package core.basesyntax.model;

public class Cat {
    private int age;
    private String name;
    private String ownerName;

    @Override
    public String toString() {
        String s = "Cat{" + "age=" + age + ", name='" + name
                + '\'' + ", ownerName='" + ownerName + '\'' + '}';
        return s;
    }
}

