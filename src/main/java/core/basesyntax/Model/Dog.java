package core.basesyntax.model;

public class Dog {
    private int age;
    private String name;
    private String ownerName;

    // Конструктор без параметрів
    public Dog() {
        this.age = 0;
        this.name = "Unknown";
        this.ownerName = "Unknown";
    }

    // Конструктор з параметрами
    public Dog(int age, String name, String ownerName) {
        this.age = age;
        this.name = name;
        this.ownerName = ownerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Dog{"
                + "age=" + age
                + ", name='" + name + '\''
                + ", ownerName='" + ownerName + '\''
                + '}';
    }
}

