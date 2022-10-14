package practice_12_15.practice_15;

public class TestPhoneNumber {
    public static void main(String[] args) {
        System.out.println(new PhoneNumber("+71234567890").getNumber());
        System.out.println(new PhoneNumber("81234567890").getNumber());
        System.out.println(new PhoneNumber("+101234567890").getNumber());
    }
}
