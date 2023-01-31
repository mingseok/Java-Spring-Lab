package org.example;

import java.util.*;

public class FirstSquareDivisibleByThree {
    public static void main(String[] args) {
        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> firstSquareDivisibleByThree =
                someNumbers.stream()
                           .map(n -> n * n)
                           .filter(n -> n % 3 == 0)
                           .findFirst(); // 9
    }
}