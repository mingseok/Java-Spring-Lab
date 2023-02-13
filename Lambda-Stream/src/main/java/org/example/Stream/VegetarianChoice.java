package org.example.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class VegetarianChoice {
    public static void main(String[] args) {

        // 요소 검색 하는 방법
        /**
         * Optional<Dish> dish = menu.stream()
         *                           .filter(Dish::isVegetarian)
         *                           .findAny();
         */


        // 첫번째 요소 찾기
        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> firstSquareDivisibleByThree =
                someNumbers.stream()
                        .map(n -> n * n)
                        .filter(n -> n % 3 == 0)
                        .findFirst();
    }
}
