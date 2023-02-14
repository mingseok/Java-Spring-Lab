package org.example;

import java.sql.SQLOutput;
import java.util.List;
import java.util.function.Consumer;

@FunctionalInterface
interface RunSomething {
    void doIt();
}

public class Foo {
    public static void main(String[] args) {
        RunSomething runSomething = () -> System.out.println("hello");
        runSomething.doIt();

        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10); // T타입을 받아서 넣기만 할수 있다. 리턴 할 수 없음
    }
}

