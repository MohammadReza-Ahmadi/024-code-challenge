package _0_24_ing;

/**
 * Fair Index
*/
public class Q1 {


    public static int solution(int[] A, int[] B) {
        int[] prefixSumA = new int[A.length];
        int[] prefixSumB = new int[A.length];

        prefixSumA[0] = A[0];

        for (int i=1; i < A.length; i++){
            prefixSumA[i] = prefixSumA[i - 1] + A[i];
        }

        prefixSumB[0] = B[0];
        for (int i=1; i < B.length; i++){
            prefixSumB[i] = prefixSumB[i-1] + B[i];
        }

        int count = 0;
        for (int i=1; i < A.length - 1; i++){
            if ((prefixSumA[i] == prefixSumB[i]) &&
                    (prefixSumA[prefixSumA.length - 1] - prefixSumA[i] == prefixSumA[i]) &&
                    (prefixSumB[prefixSumB.length - 1] - prefixSumB[i] == prefixSumB[i])
            ){
                count++;
            }
        }

        return count;
    }
}
