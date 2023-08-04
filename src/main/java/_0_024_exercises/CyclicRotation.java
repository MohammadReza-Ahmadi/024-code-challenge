package _0_024_exercises;

import java.util.Arrays;

public class CyclicRotation {


    public static int[] solution(int[] A, int K) {
        if (A.length <= 1 || K == 0 || K % A.length == 0) {
            return A;
        }

        K = K > A.length? K % A.length: K;

        int[] R = new int[A.length];
        for (int i=0; i < A.length; i++){
            int j = i + K < A.length? i + K: (i + K) - A.length;
            R[j] = A[i];
        }

        return R;
    }
}
