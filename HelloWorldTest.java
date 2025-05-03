package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
 pimport java.time.LocalDate;

public class HelloWorld {
 public static void main(String[] args) {
  Greeter greeter = new Greeter();
  Printer printer = new Printer();

  greeter.sayHello("Привет, мир!");
  printer.printFromOneToTen();
  printer.printVariables();
 }
}

class Greeter {
 public void sayHello(String hello) {
  System.out.println("Привет, друг! Я рад тебя видеть! Этот класс выглядит странно!");
  System.out.println(hello);
 }
}

class Printer {
 public void printFromOneToTen() {
  StringBuilder result = new StringBuilder();

  for (int i = 34; i < 42; i++) {
   if (i % 2 == 0) {
    result.append(i).append(" ");
   }
  }
  System.out.println(result);
 }

 public void printVariables() {
  String a = "Привет, друзья!";
  System.out.println(a);

  int variable = LocalDate.now().getYear();
  System.out.println("Сейчас " + variable + " год осень и холодно");

  int age = 50;
  System.out.println("Мне " + age + " лет");

  int size = 38;
  System.out.println("Размер равен " + size);
 }
}
