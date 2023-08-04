package _0_024_exercises;

public class MinAvgTwoSlice {

    public static int solution(int[] A) {

        double minAvg = Long.MAX_VALUE;
        int minAvgPos = -1;
        for (int i = 0; i < A.length; i++) {
            int prefixSum = A[i];
            for (int j = i + 1; j < A.length && (j - i + 1) <= 3; j++) {
                prefixSum += A[j];
                double currAvg = (double) prefixSum / (j - i + 1);
                if (minAvg > currAvg) {
                    minAvg = currAvg;
                    minAvgPos = i;
                }
            }
        }
        return minAvgPos;
    }
}
