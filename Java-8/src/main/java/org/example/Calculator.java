package org.example;

class MyCalTest {
    public static void main(String[] args) {
        MyCal myCal = new MyCal(); // 내가 만든 계산기

        int plus = myCal.plus(1, 3);// 추상
        int cal = myCal.exec(2, 5);// 디폴트 메서드

        System.out.println(cal); // 출력 : 7
    }
}


class MyCal implements Calculator {
    @Override
    public int plus(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }

    // 디폴트 메서는 없어도 된다!
}


public interface Calculator {
    public int plus(int a, int b);

    public int minus(int a, int b);

    default int exec(int a, int b) {
        return a + b;
    }
}