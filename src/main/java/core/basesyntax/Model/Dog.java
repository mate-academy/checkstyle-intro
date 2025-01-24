package core.basesyntax.Model;

public class Dog {
    private final String breed;

    public Dog(String  breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Dog{breed='" + breed +"'}";
    }
}
