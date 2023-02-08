package org.example.Lambda;

// 인자 x, y를 받아들여 x+y를 리턴하는 람다식 만들기
// 함수형 인터페이스
@FunctionalInterface
interface MyFunction {
    int calc(int x, int y);
}

public class LambdaEx1 {
    public LambdaEx1() {
        MyFunction f1 = (x, y) -> {
            return x + y;
        };
        System.out.println("f1의 결과: " + f1.calc(22, 100));


        MyFunction f2 = (x, y) -> {
            return x - y;
        };
        System.out.println("f2의 결과: " + f2.calc(99, 9));
    }

    public static void main(String[] args) {
        new LambdaEx1();
    }
}