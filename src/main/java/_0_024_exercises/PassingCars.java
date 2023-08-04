package _0_024_exercises;

public class PassingCars {

    public static int solution(int[] A) {
        int[] pairSum = new int[A.length];
        int currentEastSum = 0;

        int i = A[0] == 1 ? 1 : 0;
        for (; i < A.length; i++) {
            if (A[i] == 0) {
                currentEastSum++;
            } else {
                pairSum[i] = currentEastSum;
            }
        }

        long pairCount = 0;
        for (int j = 0; j < pairSum.length; j++) {
            pairCount += pairSum[j];
            if (pairCount > 1_000_000_000){
                return -1;
            }
        }
        return (int) pairCount;
    }
}
