package org.example;

// 추상 메서드가 딱 하나만 있다면 함수형 인터페이스이다.
// 현재 RunSomething 같은 경우의 인터페이스는 함수형 인터페이스가 아니다.
public interface Explanation {

    void diIt(); // 인터페이스는 abstract 생략가능하다는 것.
                 // doIt은 추상메서드이다.
                 // 원래 사용할때도 생략 했을 뿐이지 abstract를 붙여야 한다.
                 // 추가로 public 키워드도 생략 가능하다.


    // 인터페이스 안에다가 이렇게 정의할 수가 있다.
    static void printName() {
        System.out.println("자바 8부터 가능");
    }


    // 인터페이스 안에다가 이렇게 정의할 수가 있다.
    default void printAge() {
        System.out.println("자바 8부터 가능");
    }
}
