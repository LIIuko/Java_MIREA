package practice_17_18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Является ли введенная строка строкой "abcdefghijklmnopqrstuv18340"
        Pattern pattern1 = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher1 = pattern1.matcher("abcdefghijklmnopqrstuv18340");
        Matcher matcher2 = pattern1.matcher("abcdefghijklmnoasdfasdpqrstuv18340");
        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());

        //Является ли заданная строка правильным MAC-адресом
        Pattern pattern2 = Pattern.compile("([\\da-fA-F]{2}):([\\da-fA-F]{2}):([\\da-fA-F]{2}):([\\da-fA-F]{2}):([\\da-fA-F]{2}):([\\da-fA-F]{2})");
        matcher1 = pattern2.matcher("aE:dC:cA:56:76:54");
        matcher2 = pattern2.matcher("01:23:45:67:89:Az");
        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());

//        Pattern pattern3 = Pattern.compile("(\\d+\\.\\d{2}\\sUSD)|(\\d+\\.\\d{2}\\sRUR)|(\\d+\\.\\d{2}\\sEU)(\\d+\\sUSD)|(\\d+\\sRUR)|(\\d+\\sEU)");
        //Извлечь цены в USD, RUR, EU.
        //Цены 6.267 RUR 30.06 USD 50.30 RUR 50f32 RUR 60.12 CHF 11,23 23.78 UDD 23.98 USD 15.23 EU
        Pattern pattern3 = Pattern.compile("(\\d+[.]\\d{2}\\s(USD|EU|RUR))|\\d+\\s(USD|EU|RUR)");
        Matcher matcher3 = pattern3.matcher("Цены 6.267 RUR 30.06 USD 50.30 RUR 50f32 RUR 60.12 CHF 11,23 23.78 UDD 23.98 USD 15.23 EU");
        while (matcher3.find()){
            System.out.println(matcher3.group());
        }
    }
}
