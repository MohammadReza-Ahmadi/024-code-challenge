package _0_024_exercises;

import java.util.OptionalInt;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class FrogRiverOne {

    public static int solution(int X, int[] A) {
        if (A.length == 1){
            return X > 1? -1 : 0;
        }

        int[] pos = new int[A.length];
        pos[0] = 1;
        AtomicInteger uncovered = new AtomicInteger(X);
        OptionalInt earliestTime = IntStream.range(0, A.length)
                .filter(
                        i -> {
                            boolean flag = false;
                            if (pos[A[i]] == 0) {
                                flag = uncovered.decrementAndGet() == 0;
                                ++pos[A[i]];
                            }
                            return flag;
                        }
                )
                .findFirst();

        return earliestTime.orElse(-1);
    }


}
