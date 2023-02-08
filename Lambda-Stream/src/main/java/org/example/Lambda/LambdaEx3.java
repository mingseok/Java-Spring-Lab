package org.example.Lambda;

// 매개변수가 없는 람다식 만들기
// 함수형 인터페이스
@FunctionalInterface
interface MyFunction3 {
    void print();
}

public class LambdaEx3 {
    public LambdaEx3() {
        MyFunction3 fprint = () -> {
            System.out.println("mingseok Dev");
        };
        fprint.print();
    }

    public static void main(String[] args) {
        new LambdaEx3();
    }
}
