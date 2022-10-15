package practice_12_15.practice_12;

import java.util.Scanner;

public class TestPerson {

    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Person person = new Person(name);
    }
}
