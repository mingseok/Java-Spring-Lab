package org.example.Stream;

import java.util.ArrayList;
import java.util.List;

public class Connection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(8);

        list.stream()
                .distinct() // 중복 제거
                .limit(3) // n개 자르기 만약 5개중 limit(1) 로 했다면,
                            // 마지막 하나만 출력시키고 나머진 다 버린다.
                .sorted() // 정렬
                .forEach(System.out::println); // 5 7 8
    }
}
