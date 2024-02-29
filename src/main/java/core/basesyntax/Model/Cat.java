package core.basesyntax.model;

public class Cat {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Cat{" 
            + "name='" + name + '\'' 
            + ", age=" + age 
            + '}';
    }
}
