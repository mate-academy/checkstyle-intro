package core.basesyntax.model;

public class Cat {
    private int age;
    private String name;
    private String ownerName;
    private String color = "White" + "+Black";
    private String sound = "Meow" + "+Purr";
    private String activity = "Playing" + "+Sleeping";
    private String food = "Fish" + "+Milk";

    @Override
    public String toString() {
        return "Cat{"
                + "age=" + age
                + ", name='" + name + '\''
                + ", ownerName='" + ownerName + '\''
                + '}';
    }
}
