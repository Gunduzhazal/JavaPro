package StringDemo;

public class StringDemo1 {

    public static void main(String[] args) {

      String str = "Shah";
      String str2 = "Shah";
      String str3 = new String("Shah");

      if (str.equals("shah")) {
          System.out.println("I found that");
      }

      if (str.equalsIgnoreCase("shah")) {
          System.out.println("I found it with equalsIgnoreCase");
      }
    }
}