package StringDemo;

public class StringDemo4 {

    public static void main(String[] args) {

        String str = "I am always confused I was kidding";

        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("s"));
        System.out.println(str.indexOf(" "));

        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 11));
    }
}
