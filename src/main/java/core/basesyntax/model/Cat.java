package core.basesyntax.model;

public class Cat {
    private int age;
    private String name;
    private String ownerName;

    @Override
    public String toString() {
        return "Cat{" + "age=" + age + ", name='" + name + '\''
                + ", ownerName='" + ownerName + '\'' + '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
