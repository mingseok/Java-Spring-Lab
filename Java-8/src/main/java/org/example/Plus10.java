package org.example;

import java.util.function.Function;

// <T, R> 앞쪽에 T는 매개변수 타입을 말하고, 뒤쪾에 R은 리턴되는 타입을 말한다.
public class Plus10 implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer + 10;
    }
}


class Execution {
    public static void main(String[] args) {
        // 이렇게도 가능하지만 람다를 사용해보자.
        // Plus10 plus10 = new Plus10();
        // System.out.println(plus10.apply(1));

        Function<Integer, Integer> plus10 = (i) -> i + 10;
        //System.out.println(plus10.apply(1));

        Function<Integer, Integer> multiply2 = (i) -> i * 2;
        // System.out.println(multiply2.apply(1));

        //TODO: 컴포즈를 사용하면 어떻게 될까?
        plus10.compose(multiply2);

    }
}