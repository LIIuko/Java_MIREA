package practice_17_18;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^abcdefghijklmnopqrstuv18340&");
        String string = sc.next();
        System.out.println(Pattern.matches("^(abcdefghijklmnopqrstuv18340)&", string));
    }

}
