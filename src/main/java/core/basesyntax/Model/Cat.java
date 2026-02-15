package core.basesyntax.model;


public class Cat {

private int age;
private String name;
private String ownerName;
private String color;

@Override
public String toString() {
    return "Cat{"
    + "name='" + name + '\''
    + ", age=" + age
    + ", color='" + color + '\''
    + '}';
    }
}