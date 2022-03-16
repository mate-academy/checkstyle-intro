package core.basesyntax.model;

public class Cat {

    private String age;
    private String name;
    private String ownerName;

    @Override
    public String toString() {
        return age + name + ownerName;
    }
}
