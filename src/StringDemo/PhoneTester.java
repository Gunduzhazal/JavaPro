package StringDemo;

public class PhoneTester {

    public static void main(String[] args) {

       Phone iphone = new Phone();
       iphone.make = "Apple";
       iphone.model = "Iphone 14 Pro Max";
       iphone.year = 2022;
       iphone.storage = 128;
       iphone.makeCall();

       Phone samsungPhone = new Phone();
       samsungPhone.model = "S22 Ultra";
       samsungPhone.make = "Samsung";
       samsungPhone.year = 2022;
       samsungPhone.makeCall();

    }
}
