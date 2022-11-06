package StringDemo;

public class StringDemo2 {

    public static void main(String[] args) {

        String str = "I love java programming";
        /*
         * charAt returns the character at a specific index
         */
        System.out.println(str.charAt(3));

        for (int i = 0; i < str.length(); i++) {
            //print only the characters not spaces
            if (!(str.charAt(i) == ' ')) {
                System.out.print(str.charAt(i)+" ");
            }

        }
    }
}
