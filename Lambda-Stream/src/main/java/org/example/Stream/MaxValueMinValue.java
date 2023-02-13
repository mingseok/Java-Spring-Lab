package org.example.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxValueMinValue {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> maxValue = numbers.stream().reduce(Integer::max);
        System.out.println(maxValue); // Optional[5]

        Optional<Integer> minValue = numbers.stream().reduce(Integer::min);
        System.out.println(minValue); // Optional[1]


        // list안에 숫자의 총 개수를 알고 싶다면?
        int count = numbers.stream()
                .map(i -> 1)
                .reduce(0, (a, b) -> a + b);

        System.out.println(count); // 5
    }
}
