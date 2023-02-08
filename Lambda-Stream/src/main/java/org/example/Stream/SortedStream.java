package org.example.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 5, 4, 2);

        List<Integer> sortedList = list.stream()
                                       .sorted() // list를 정렬해서
                                       .collect(Collectors.toList()); // 새로운 list에 저장

        System.out.println(list); // [3, 1, 5, 4, 2] 변경 X
        System.out.println(sortedList); // [1, 2, 3, 4, 5]
    }
}
