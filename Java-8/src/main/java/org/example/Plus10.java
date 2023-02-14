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
        System.out.println(plus10.apply(1)); // 11


        Function<Integer, Integer> multiply2 = (i) -> i * 2;
        System.out.println(multiply2.apply(1)); // 2


        // 컴포즈를 사용하면 어떻게 될까? (=힌드틑 함수가 두개 있다고 생각하면 된다)
        // 첫번째. 어떤 값('2')가 들어오면 compose() 괄호 안에 있는 것부터하여
        // 들어온 값에 *2 를 진행한다. 그다음 compose() 앞부분에 있는 plus10 함수를 진행 시키는 것이다.
        // 그렇게 된다면, +10을 계산하게 되어 14가 출력 되는 것이다.
        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        System.out.println(multiply2AndPlus10.apply(2)); // 14


        // andThen()은 compose() 메서드의 반대이다.
        // 즉, plus10부터 진행한다는 것이다.
        System.out.println(plus10.andThen(multiply2).apply(2));
    }
}