package practice_12_15.practice_12;

import java.util.Scanner;

public class TestPerson {

    public static void main(String[] args) {
        int count = 0;
        System.out.print("Enter your surname: ");
        Scanner sc = new Scanner(System.in);
        String fio = sc.nextLine();
        String[] name = fio.trim().split("([!№@#$%^&,.\\?\\+=_><{}:;'|])*[^a-zA-Zа-яА-ЯёЁ]+([!№@#$%^&,.?+=_><{}:;'|])*");
        if(name[0].isEmpty()){
            count++;
            for (int i = 1; i < name.length; i++){
                name[i - 1] = name[i];
            }
        }
        if(name.length - count== 3){
            Person person = new Person(name[0], name[1], name[2]);
        }
        else if(name.length - count == 2){
            Person person = new Person(name[0], name[1]);
        }
        else if(name.length - count == 1){
            Person person = new Person(name[0]);
        }
        else{
            Person person = new Person();
        }
    }
}
