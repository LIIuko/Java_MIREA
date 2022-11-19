package practice_29_30;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.";
        String[] strings = string.split("([!№@#$%^&,.\\?\\+=_><{}:;'|])*[^a-zA-Zа-яА-ЯёЁ]+([!№@#$%^&,.?+=_><{}:;'|])*");
        Stream.of(strings).collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting())).entrySet().stream().sorted( (elem1, elem2) -> {
            if (elem1.getValue().equals(elem2.getValue())) {
                return elem1.getKey().compareTo(elem2.getKey());
            } else {
                return elem2.getValue().compareTo(elem1.getValue());
            }
        }).limit(10).forEach(System.out::println);
    }
}
