package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TraderApplication {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );


        /**
         * 1번) 2011년에 일어난 모든 트랜젝션을 찾아 값을 오름차순으로 정리하세요.
         */
        List<Transaction> tr2011 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                // 2011년에 발생한 트랜잭션을 필터링하도록 프레디케이트를 넘겨줌

                .sorted(Comparator.comparing(Transaction::getValue))
                // 트랜잭션값으로 요소 정렬

                .collect(Collectors.toList()
                        // 결과 스트림의 모든 요소를 리스트로 반환
                );


        /**
         * 2번) 거래자가 근무하는 모든 도시를 중복 없이 나열하세요.
         */
        List<String> cities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                // 트랜잭션과 관련한 각 거래자의 도시 추출

                .distinct()
                // 고유 도시만 선택

                .collect(Collectors.toList()
                );


        /**
         * 3번) 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하세요.
         */
        List<Trader> traders = transactions.stream()
                .map(Transaction::getTrader)
                // 트랜잭션의 모든 거래자 추출

                .filter(trader -> trader.getCity().equals("Cambridge"))
                // 케임브리지의 거래자만 선택

                .distinct()
                // 중복이 없도록 확인

                .sorted(Comparator.comparing(Trader::getName))
                // 결과 스트림의 거래자를 이름으로 정렬

                .collect(Collectors.toList()
                );


        /**
         * 4번) 모든 거래자의 이름을 알파벳순으로 정렬해서 반환하세요.
         */
        String traderStr = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                // 모든 거래자명을 문자열 스트림으로 추출

                .distinct()
                // 각각의 이름을 하나의 문자열로 연결하여 결국 모든 이름 연결

                .sorted()
                // 중복된 이름 제거

                .reduce("", (n1, n2) -> n1 + n2);
        // 이름을 알파벳순으로 정렬


        /**
         * 5번) 밀라노에 거래자가 있는가요?
         */
        boolean milanBased = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader()
                        .getCity()
                        .equals("Milan") // anyMatch에 프레디케이트를 전달해서 밀라노에 거래자가 있는 확인
                );

        /**
         * 6번) 케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하세요.
         */
        //transactions.stream()
        //.filter(t -> "Cambridge".equals(t.getTrader().getCity()))
        // 케임브리지에 거주하는 거래자의 트랜잭션을 선택

        //.map(Transaction::getValue)
        // 각 값을 출력

        //.forEach(System.out::println);
        // 이 거래자들의 값 추출

        /**
         * 7번) 전체 트랜잭션 중 최댓값은 얼마인가요?
         */
        Optional<Integer> highestValue = transactions.stream()
                .map(Transaction::getValue)
                // 각 트랜잭션의 값 추출

                .reduce(Integer::max);
        // 결과 스트림의 최댓값 계산


        /**
         * 8번) 전체 트랜잭션 중 최솟값은 얼마인가요?
         */
        Optional<Transaction> smallestTransaction =
                transactions.stream()
                        .min(Comparator.comparing(Transaction::getValue));

        System.out.println(smallestTransaction);
        // 8번 정답: Optional[{Trader:Brian in Cambridge, year: 2011, value: 300}]
    }
}
