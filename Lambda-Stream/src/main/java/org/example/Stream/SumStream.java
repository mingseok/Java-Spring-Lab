package org.example.Stream;

import java.util.Arrays;

public class SumStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // 스트림 생성
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum); // 15

        /**
         * 	int[] arr = { 1, 2, 3, 4, 5 };
         *
         * 	IntStream stream = Arrays.stream(arr);
         * 	int sum = stream.sum();
         *
         * 	System.out.println(sum);
         */
    }
}