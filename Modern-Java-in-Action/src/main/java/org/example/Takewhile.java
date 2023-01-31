package org.example;

public class Takewhile {
    public static void main(String[] args) {
        List<Dish> Menu = Arrays.asList(
                new Dish("seasonal", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french", true, 530, Dish.Type.OTHER));
    }
}