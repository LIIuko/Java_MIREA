package practice_12_15.practice_15;

public class PhoneNumber {
    private String number;

    public PhoneNumber(String number) {
        number = number.trim();
        if (number.charAt(0) != '+'){
            number = "+7" + number.substring(1);
        }
        this.number = number.substring(number.length() - 4);
        number = number.substring(0, number.length() - 4);
        this.number = number.substring(number.length() - 3) + "-" + this.number;
        number = number.substring(0, number.length() - 3);
        this.number = number + "-" + this.number;
    }

    public String getNumber() {
        return number;
    }
}
