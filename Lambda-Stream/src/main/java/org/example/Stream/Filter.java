package org.example.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "a2", "b1", "b2", "c1", "c2", "c3");

        Stream<String> stream = list.stream();
        Stream<String> filtered = stream.filter(s -> s.startsWith("c"));
        filtered.forEach(System.out::print); // c1 c2 c3
    }
}
