package StringDemo;

import java.util.Arrays;

public class StringRecap {

    public static void main(String[] args) {

        String str = "kjfksfAJDSKJD274362374!@##$";
        str = str.replaceAll("[^a-zA-z]", "");
        System.out.println("str = " + str);

        String sentence = "Java 8 is good. Java 11 is better.";
        String[] split = sentence.split("[.]");
        System.out.println("split = " + Arrays.toString(split));

        String str2 = "Java 8 is good. Java 11 is good.";
        String replace = str2.replaceFirst("good", "better");
        System.out.println(replace);
    }
}
