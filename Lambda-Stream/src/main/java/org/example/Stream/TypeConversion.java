package org.example.Stream;

import java.util.function.Function;

public class TypeConversion {
    public static void main(String[] args) {
        Function<String, Integer> number1 = (String s) -> Integer.parseInt(s);

        // 위 코드를 메서드 참조로 바꾸면 이렇게 된다.
        // 클래스이름::메서드이름;
        // 클래스이름 다시 말해 뭐다? -> 타입이다.
        Function<String, Integer> number2 = Integer::parseInt;

        System.out.println(number1.apply("100") + 200); // 300
    }
}

