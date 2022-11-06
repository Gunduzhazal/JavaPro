package MethodsDemo;

public class MethodDemo4 {

    boolean mystery() {
        return true;
    }

    String mystery2(int num) {
        return "Java";
    }

    String method(String word) {
        if (word.equals("Java")) {
            return "python";

        } else {
            return "Java";
        }
    }

    public static void main(String[] args) {

        MethodDemo4 method = new MethodDemo4();
        System.out.println(method.mystery());
        System.out.println(method.mystery2(1));
        System.out.println(method.method("Java"));


    }
}
