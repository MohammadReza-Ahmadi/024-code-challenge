package _0_024_exercises;

public class MaxSliceSum {

    //3, 2, -6, 4, 0
    public static int solution(int[] A) {
        int max = A[0];
        int currMax = A[0];
        for (int i=1; i < A.length; i++){
            currMax = Math.max(A[i], currMax + A[i]);
            max = Math.max(currMax, max);
        }
        return max;
    }
}
