package org.example.Lambda;

import java.util.HashMap;

public class MapEx1 {
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

        map.keySet().stream()
                    .forEach(k -> System.out.println(k));

        map.values().stream()
                    .forEach(v -> System.out.println(v));
    }
}