package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Printer printer = new Printer();

        greeter.sayHello("Привет, мир!");
        printer.printFromOneToTen();
        printer.printVariables();
    }
}

