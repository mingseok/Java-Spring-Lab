package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OnlineApp {
    public static void main(String[] args) {
        List<OnlineClass> sprintClass = new ArrayList<>();
        sprintClass.add(new OnlineClass(1, "spring boot", true));
        sprintClass.add(new OnlineClass(2, "spring data jpa", true));
        sprintClass.add(new OnlineClass(3, "spring mvc", false));
        sprintClass.add(new OnlineClass(4, "spring core", false));
        sprintClass.add(new OnlineClass(5, "rest api development", false));


        System.out.println("spring으로 시작하는 수업 번호(id) 출력");
        sprintClass.stream()
                .filter(online -> online.getTitle().startsWith("spring"))
                .forEach(online -> System.out.print(online.getId() + " "));


        System.out.println();
        System.out.println("closed 되지 않는 수업");
        sprintClass.stream()
                .filter(Predicate.not(OnlineClass::isClosed))
                .forEach(online -> System.out.print(online.getId() + " "));


        System.out.println();
        System.out.println("수업 이름만 모아서 스트림을 만든다");
        sprintClass.stream()
                .map(OnlineClass::getTitle)

                // forEach로 들어 올땐 String타입으로 들어온 것이다.
                .forEach(System.out::println);



        List<OnlineClass> javaClasses = new ArrayList<>();
        javaClasses.add(new OnlineClass(6, "The Java, Test", true));
        javaClasses.add(new OnlineClass(7, "The Java, Code manipulation", true));
        javaClasses.add(new OnlineClass(8, "The Java, 8 to 11", false));

        List<List<OnlineClass>> minseokEvents = new ArrayList<>();
        minseokEvents.add(sprintClass);
        minseokEvents.add(javaClasses);


        System.out.println();
        System.out.println("두 수업 목록에 들어있는 모든 수업 아이디 출력");
        minseokEvents.stream()
                .flatMap(Collection::stream)
                .forEach(online -> System.out.print(online.getId() + " "));


        System.out.println();
        System.out.println("10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 빼고 최대 10개 까지만");
        Stream.iterate(10, i -> i + 1)
                .skip(10)
                .limit(10)
                .forEach(System.out::println);


        System.out.println();
        System.out.println("자바 수업 중에 Test가 들어있는 수업이 있는지 확인");
        boolean test = javaClasses.stream().anyMatch(online -> online.getTitle().contains("Test"));
        System.out.println(test);


        System.out.println();
        System.out.println("스프링 수업 중에 제목에 spring이 들어간 제목만 모아서 List로 만들기");
        List<String> spring = sprintClass.stream()
                .filter(online -> online.getTitle().contains("spring"))
                .map(OnlineClass::getTitle)
                .collect(Collectors.toList());
        spring.forEach(System.out::println);

    }
}
