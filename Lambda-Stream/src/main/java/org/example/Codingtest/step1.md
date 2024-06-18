## step1

```java
import java.util.*;

public class Main {
    private static int[] solution(int[] arr) {
        // 중복값 제거
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);

        // 내림차순 정렬
        Arrays.sort(result, Collections.reverseOrder());

        // int형 배열로 변경 후 반환
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 1, 3, 4};
        for (int x : solution(arr)) {
            System.out.print(x + " "); // 4 3 2 1
        }
    }
}
```
