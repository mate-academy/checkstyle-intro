package core.basesyntax.Model;

public class Model {
    private int age;
    private String name;
    private String ownerName;

    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
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
