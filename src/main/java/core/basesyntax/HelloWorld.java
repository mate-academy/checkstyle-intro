package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        sayHello(getFromOneToTen());
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

    private static void sayHello(String hello) {
        System.out.println(
                "Hello, Mate! I am happy to see you!"
        );
        System.out.println(
                "This class looks weird!"
        );
        System.out.println(
                 "Your task is to fix the checkstyle in this file."
        );
        System.out.println(
                  "Your goal is to run `mvn clean package`"
        );
        System.out.println(
                  "and receive `BUILD SUCCESS` message."
        );
        System.out.println(hello);
    }

}
