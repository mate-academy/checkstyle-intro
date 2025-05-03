package core.basesyntax;

import java.util.Arrays;

public class HelloWorld {
    private String string;
    private int year;
    private int age;
    private int size;

    public static void main(String[] args) {
        String[] x = {"FRODO", "SAM", "MERRY", "PIPPIN"};
        System.out.println(Arrays.toString(capitalizeNames(x)));
        String a = "";
        //a.replaceAll("")
    }

    public static String[] capitalizeNames(String[] names) {
        String[] array = new String[names.length];
        int count = 0;
        for (String name:names) {
            String x = name.toLowerCase().substring(0,1).toUpperCase() + name.substring(1)
                    .toLowerCase();
            array[count++] = x;
        }
        return array;
    }
}
