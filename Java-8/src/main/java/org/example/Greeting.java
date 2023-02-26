package org.example;

public class Greeting {
    private String name;

    public Greeting() {

    }

    public Greeting(String name) {
        this.name = name;
    }

    public String hi(String name) {
        return "hi " + name;
    }

    // 람다식으로 보자면 (s) -> "hello " + s; 이, 코드랑 같다.
    public static String hello(String name) {
        return "hello " + name;
    }
}
