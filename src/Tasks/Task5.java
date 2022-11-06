package Tasks;

public class Task5 {

    public static void main(String[] args) {

        String str = "abc";
        StringBuilder st = new StringBuilder(str);
        st.reverse();

        if (st.toString().equals(str)) {
            System.out.println("The String is Palindrome");
        } else {
            System.out.println("The String is not Palindrome");
        }
    }
}
