package practice_19_20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class CarNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        HashSet<String> hashSet = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        String alphabet = "QWERTYUIOPASDFGHJKLZXCVBNM";

        for (int i = 0; i < alphabet.length(); i++){
            for (int j = 0; j < alphabet.length(); j++){
                for (int k = 0; k < alphabet.length(); k++){
                    if(alphabet.charAt(i) == alphabet.charAt(j)
                            || alphabet.charAt(i) == alphabet.charAt(k)
                            || alphabet.charAt(k) == alphabet.charAt(j)){
                        continue;
                    }
                    for (int q = 1; q < 10; q++){
                        for (int p = 1; p < 200; p++) {
                            if (p < 10){
                                arrayList.add("" + alphabet.charAt(i) + q + "" + q + "" + q + alphabet.charAt(j) + +alphabet.charAt(k) + 0 + "" + p);
                                hashSet.add("" + alphabet.charAt(i) + q + "" + q + "" + q + alphabet.charAt(j) + +alphabet.charAt(k) + 0 + "" + p);
                                treeSet.add("" + alphabet.charAt(i) + q + "" + q + "" + q + alphabet.charAt(j) + +alphabet.charAt(k) + 0 + "" + p);
                            }else{
                                arrayList.add("" + alphabet.charAt(i) + q + "" + q + "" + q + alphabet.charAt(j) + +alphabet.charAt(k) + p);
                                hashSet.add("" + alphabet.charAt(i) + q + "" + q + "" + q + alphabet.charAt(j) + +alphabet.charAt(k) + p);
                                treeSet.add("" + alphabet.charAt(i) + q + "" + q + "" + q + alphabet.charAt(j) + +alphabet.charAt(k) + p);
                            }
                        }
                    }
                }
            }
        }
        long m;
        String carNumber = sc.next();
        m = System.currentTimeMillis();
        System.out.println("Поиск перебором: " + carNumber + " <" + arrayList.contains(carNumber) + ">, поиск занял " + (double) (System.currentTimeMillis() - m) + "мс");
        m = System.currentTimeMillis();
        System.out.println("Поиск перебором: " + carNumber + " <" + arrayList.contains(carNumber) + ">, поиск занял " + (double) (System.currentTimeMillis() - m) + "мс");
        arrayList.contains(carNumber);
        hashSet.contains(carNumber);
        treeSet.contains(carNumber);
    }
}
