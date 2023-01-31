package org.example;

public interface Consumer<T> {
    void accept(T t);
}

public <T> void forEach(List<T> list, Consumer<T> consumer) {
    for (T t : list) {
        c.accept(t);
    }
}

forEach(
    Arrays.asList(1,2,3,4,5),
    (Integer i) -> System.out.println(i)
);