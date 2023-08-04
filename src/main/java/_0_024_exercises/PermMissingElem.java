package _0_024_exercises;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class PermMissingElem {

    public static int solution(int[] A) {
        if (A.length == 0) {
            return 1;
        }

        if (A.length == 1) {
            return A[0] > 1 ? 1 : 2;
        }

        int[] numRange = new int[A.length + 2];
        Arrays.stream(A)
                .forEach(n -> numRange[n] = n);

        OptionalInt missIndex = IntStream.range(1, numRange.length)
                .filter(i -> numRange[i] == 0)
                .findFirst();
        return missIndex.orElse(-1);
    }
}
