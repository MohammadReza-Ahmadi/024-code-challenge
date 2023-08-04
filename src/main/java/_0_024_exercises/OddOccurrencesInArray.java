package _0_024_exercises;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class OddOccurrencesInArray {

    //tdo: this solution is passed by 100% correctness and performance in Codility
    // Result after passing the test, Detected time complexity: O(N) or O(N*log(N))

    public static int solution(int[] A) {
        if (A.length == 1) {
            return A[0];
        }

        Map<Integer, Long> map = Arrays.stream(A)
                .boxed()
                .collect(Collectors.groupingBy(a -> a, Collectors.counting()));

        Optional<Map.Entry<Integer, Long>> oddNum = map.entrySet()
                .stream()
                .filter(e -> e.getValue().longValue() % 2 != 0)
                .findFirst();

        return oddNum.get().getKey();
    }
}
