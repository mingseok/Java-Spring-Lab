package org.example.Lambda;

@FunctionalInterface
interface Say {
    int someting(int a, int b);
}

class Person {
    public void hi(Say line) {
        int number = line.someting(3, 4);
        System.out.println("Number is " + number);
    }
}
