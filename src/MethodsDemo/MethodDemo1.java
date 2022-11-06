package MethodsDemo;

public class MethodDemo1 {

    void printHello() {
        System.out.println("Hello World");
        System.out.println("Hello Java");
    }

    void printWord(String word) {
        System.out.println(word);
    }

    public static void main(String[] args) {
        MethodDemo1 obj = new MethodDemo1();
        obj.printHello();
        obj.printWord("This is Java");
    }
}
