package _0_024_exercises;

import java.util.Arrays;

public class TapeEquilibrium {

    public static int solution(int[] A) {
        int totalSum = Arrays.stream(A)
                .reduce(0, Integer::sum);
        int min = Integer.MAX_VALUE;
        int leftSum = 0;
        for (int i = 0; i < A.length - 1; i++) {
            leftSum += A[i];
            // calc right sum => totalSum - leftSum
            // calc diff => |leftSum - rightSum|
            int diff = Math.abs(leftSum - (totalSum - leftSum));
            // calc min diff between min & current diff
            min = Math.min(min, diff);
        }
        return min;
    }
}
