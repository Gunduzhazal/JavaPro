package StringDemo;

public class StringBuilderVsBuffer {

    public static void main(String[] args) {

        //mostly used newer and faster
        StringBuilder stringBuilder = new StringBuilder("Today is java class");

        //older one not used mostly and slow
        StringBuffer stringBuffer = new StringBuffer("Today is java class");

        String str = "Java is easy";

        //to convert the String to a StringBuilder
        StringBuilder stringBuilder1 = new StringBuilder(str);
        System.out.println("stringBuilder1 = " + stringBuilder1);

        //to convert from a StringBuilder to A String
        String newStr = stringBuilder1.toString();
        System.out.println(newStr);

    }
}
