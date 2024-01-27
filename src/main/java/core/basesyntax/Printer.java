package core.basesyntax;

import java.time.LocalDate;

public class Printer {
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

        int currentYear = LocalDate.now().getYear();
        System.out.println("Сейчас " + currentYear + " год осень и холодно");

        int age = 50;
        System.out.println("Мне " + age + " лет");

        int size = 38;
        System.out.println("Размер равен " + size);
    }
}
