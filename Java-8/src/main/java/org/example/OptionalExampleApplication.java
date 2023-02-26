package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExampleApplication {
    public static void main(String[] args) {
        List<OnlineClass> sprintClass = new ArrayList<>();
        sprintClass.add(new OnlineClass(1, "spring boot", true));
        sprintClass.add(new OnlineClass(5, "rest api development", false));


        // 자동적으로 Optional 타입으로 반환된다.
        Optional<OnlineClass> spring = sprintClass.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

        boolean present = spring.isPresent();
//        System.out.println(present);


        Optional<OnlineClass> onlineClass =
                spring.filter(oc -> !oc.isClosed());

//        System.out.println(onlineClass.isEmpty());


        Optional<OnlineClass> aClass =
                spring.filter(oc -> oc.isClosed());

//        System.out.println(aClass.isEmpty());

    }

    private static OnlineClass createNewClass() {
        System.out.println("creating new online class");
        return new OnlineClass(10, "new class", false);
    }
}
