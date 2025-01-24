package core.basesyntax.Model;

public class Cat {
    private final int age;
    private final String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return  "Cat{name='" + name + "', age=" + age + "}";
    }
}
