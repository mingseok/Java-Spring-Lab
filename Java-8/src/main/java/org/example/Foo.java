package org.example;

@FunctionalInterface
interface RunSomething {
    void doIt();
}

public class Foo {
    public static void main(String[] args) {
        RunSomething runSomething = () -> System.out.println("hello");
        runSomething.doIt();
    }
}