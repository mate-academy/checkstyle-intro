package core.basesyntax;

import core.basesyntax.Model.Dog;
import core.basesyntax.Model.Cat;

public class Hello_World
{
    private String a;
    private int variable;
    private int age;
    private int size;


    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat(); }

    private String getFromOneToTen() {
        String result="";

        for (int i=0; i<10; i++){
            if(i%2==0) {
                result = result + i + " ";
            }
        }
        return result;
    }

    private void sayHello(String HELLO) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird!"
                +"Your task is to fix the checkstyle in this file."
                +"Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println(HELLO);
    }
}
