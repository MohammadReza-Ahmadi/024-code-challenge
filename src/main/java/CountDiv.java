/**
 * Write a function:
 *
 * class Solution { public int solution(int A, int B, int K); }
 *
 * that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:
 *
 * { i : A ≤ i ≤ B, i mod K = 0 }
 *
 * For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * A and B are integers within the range [0..2,000,000,000];
 * K is an integer within the range [1..2,000,000,000];
 * A ≤ B.
 */

public class CountDiv {

    public static int solution(int A, int B, int K) {
        //solution 1, correctness = 100% but performance = 0%
/*        if (A == 0 && B == 0){
            return 1;
        }

        if(A == B){
            return A % K == 0? 1: 0;
        }

        int divCount = 0;
        for (int i = A; i <= B; i++){
            if (i % K == 0){
                divCount++;
            }
        }
        return divCount;*/


        // second solution
/*        int divCntA = (A-1) <= 0? 0 : (A -1) / K;
        int divCntB = B > 0 && B < K? 1: B / K;
        return divCntB - divCntA;*/

        // third and final and correct solution
        int base = (int) Math.ceil((double) A / K);
        base *=K;
        B-=base;
        int count = (int) Math.floor((double) B / K);
        count++;
        return count;
    }
}
