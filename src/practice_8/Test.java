package practice_8;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        String string = "Hello";
        strings.add(string);
        strings.add("hi");
        strings.add("qq");
        WaitList<String> waitList = new WaitList<>(strings);
        System.out.println(waitList);
        waitList.add("GG");
        System.out.println(waitList.contains(string));
        System.out.println(waitList);
    }
}
