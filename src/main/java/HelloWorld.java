import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        sayHello(
                "Hello");

        initializeVariables();

        System.out.println(getFromOneToTen());

    }

    private static String getFromOneToTen() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }

    private static void sayHello(String string) {
        System.out.println("Your goal is to run `mvn clean package` and  `BUILD SUCCESS` message");
        System.out.println(string);
    }

    private static void initializeVariables() {
        String string = "Hello mates!";
        System.out.println(string);

        int variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + " year");

        int age = 25;
        System.out.println("I'm " + age);

        int size = 42;
        System.out.println("The size is " + size);
    }
}
