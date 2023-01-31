package org.example;

import java.util.*;

public class DistinctTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);
    }
}