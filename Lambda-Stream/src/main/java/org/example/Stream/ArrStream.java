package org.example.Stream;

import java.util.stream.Stream;

public class ArrStream {
    public static void main(String[] args) {
        String[] strArr = {"a", "b", "c", "d"};
        Stream<String> strStream = Stream.of(strArr);
        strStream.forEach(System.out::println);

        /**
         * List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
         * Stream<Integer> intStream = list.stream(); // list를 스트림으로 변환
         * intStream.forEach(System.out::print); // 12345
         */
    }
}
