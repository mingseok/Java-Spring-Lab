package org.example.Stream;

import java.util.Arrays;
import java.util.List;

public class Reducing {
    public static void main(String[] args) {

        // 메뉴의 모든 칼로리의 합계를 구하시오
        // 메뉴에서 칼로리가 가장 높은 요리는?

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum); // 15

        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(product); // 120

        // 더 간결하게
        int result = numbers.stream().reduce(0, Integer::sum);
        System.out.println(result); // 15
    }
}