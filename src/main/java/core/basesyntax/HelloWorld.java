package core.basesyntax;

import core.basesyntax.model.Cat; //rearranged in the correct lexicographical order
import core.basesyntax.model.Dog;
import java.time.LocalDate;
// delete unused import

public class HelloWorld { //fixed checkstyle mistakes
    private String text;
    private int variable;//fixed checkstyle mistakes
    private int age;
    private int size; //initialized the variable on a separate line

    //delete empty lines before method
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
    } //moved the closing arc to a separate line

    private String getFromOneToTen() {
        String result = ""; // add whitespases around =

        for (int i = 0; i < 10; i++) { // add whitespases around =, < and before {
            if (i % 2 == 0) { // add whitespases and {
                result = result + i + " ";
            }
        }
        return result;
    }

    private void sayHello(String hello) { //rename String
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird! "
                + "Your task is to fix the checkstyle in this file."
                + " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println(hello);
    }

    private void initializeVariables() {
        text = "Hello mates!";
        System.out.println(text);
        variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
