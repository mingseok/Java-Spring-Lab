package org.example.Stream;

import java.util.Arrays;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
         numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct() // 중복제거
                .forEach(System.out::println);
    }
}
