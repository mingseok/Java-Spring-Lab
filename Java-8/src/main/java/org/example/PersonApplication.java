package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonApplication {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("whiteship");
        name.add("toby");
        name.add("banana");
        name.add("foo");
        name.add("apple");

        name.removeIf(str -> str.startsWith("w"));
//        name.forEach(System.out::println);

        name.sort(String::compareToIgnoreCase); // 정렬
        name.forEach(System.out::println);

        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        name.sort(compareToIgnoreCase.reversed());
        name.forEach(System.out::println); // 역정렬
    }
}
