package core.basesyntax.Model;

public class Cat {
    private int age;
    private String name;
    private String ownerName;

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Cat{")
                .append("age=")
                .append(age)
                .append(", name='")
                .append(name)
                .append('\'')
                .append(", ownerName='")
                .append(ownerName)
                .append('\'')
                .append('}').toString();
    }
}
