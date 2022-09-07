package practice_5;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want to test for simplicity: ");
        int number = scanner.nextInt();
        answerIsAPrimeNUmber(number);
        System.out.println("--------------------");
        System.out.print("Enter the number you want to factorize: ");
        number = scanner.nextInt();
        factorization(number, 2);
        System.out.println("--------------------");
        System.out.print("Enter the word you want to check for a palindrome: ");
        String string = scanner.next();
        palindrome(string);
        System.out.println("--------------------");
        System.out.println("Enter the number of zeros and ones");
        int nZeros = scanner.nextInt();
        int nOnes = scanner.nextInt();
        System.out.println(zeroTwo(nZeros, nOnes));
        System.out.println("--------------------");
        System.out.print("Enter the number you want to expand: ");
        number = scanner.nextInt();
        System.out.println(reverseNumb(number, 0));
    }

    /*Проверка числа на простоту*/
    private static boolean primeNumber(int number, int param){
        if (number < 2) { return false; }
        if (number == 2) { return true; }
        if (number % param ==0) { return false; }
        if (param < number / 2) { return primeNumber(number, param + 1); }
        return true;
    }

    /*Ответ на вопрос "простое ли это число?"*/
    private static void answerIsAPrimeNUmber(int number){
        if (primeNumber(number, 2)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    /*Разложение числа на простые множители в пороядке неубывания*/
    private static void factorization(int number, int param ){
        if (param > number / 2){
            System.out.println(number);
            return;
        }
        if (number % param == 0){
            System.out.println(param);
            factorization(number / param, param);
        }
        else{
            factorization(number, ++param);
        }
    }

    /*Проверка строки на палиндром*/
    private static void palindrome(String word){
        if(word.length() < 2){
            System.out.println("YES");
            return;
        }
        if(word.charAt(0) == word.charAt(word.length() - 1)){
            palindrome(word.substring(1, word.length() - 1));
        }
        else{
            System.out.println("NO");
        }
    }

    private static int zeroTwo(int a, int b){
        if(b + 1 == a){
            return 1;
        }
        if(a == 0 || b == 0){
            return 1;
        }
        if(b + 1 < a) {
            return 0;
        }
        return zeroTwo(a - 1, b - 1) + zeroTwo(a, b - 1);
    }

    private static int reverseNumb(int numb, int reverseNumb){
        return numb == 0 ? reverseNumb : reverseNumb(numb / 10, reverseNumb * 10 + numb %10);
    }
}
