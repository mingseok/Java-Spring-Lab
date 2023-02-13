package org.example.Stream;

import java.util.HashMap;

public class MapStream {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);

//        for (Map.Entry<String, Integer> x : map.entrySet()) {
//            System.out.println(x.getKey());
//            System.out.println(x.getValue());
//        }

        map.forEach((key, value) -> System.out.println(key + " " + value));


        map.keySet().stream()
                    .forEach(System.out::print); // a b c d


        map.values().stream()
                    .forEach(System.out::print); // 1 2 3 4
    }
}
