package org.example.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Deduplication {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("potato", "carrot", "tomato", "apple");
        List<String> vegetableWords = list.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(vegetableWords);
    }
}
