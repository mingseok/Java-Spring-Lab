package org.example.Stream;

import java.util.*;
import java.util.stream.Collectors;

class Dish {
    String name;
    boolean flag;
    int calorie;

    public Dish(String name, boolean flag, int calorie) {
        this.name = name;
        this.flag = flag;
        this.calorie = calorie;
    }
}

public class Menu {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("seasonal", true, 120),
                new Dish("prawns", false, 300),
                new Dish("rice", true, 350),
                new Dish("chicken", false, 400),
                new Dish("french", true, 530));


        // 300 이상인 칼로리 선택
        menu.stream()
                .filter(dish -> dish.calorie > 300)
                .collect(Collectors.toList());


        // 스트림 축소
        menu.stream()
                .filter(dish -> dish.calorie > 300)
                .limit(3)
                .collect(Collectors.toList());


        // 요소 건너뛰기
        menu.stream()
                .filter(dish -> dish.calorie > 300)
                .skip(2)
                .collect(Collectors.toList());
    }
}
