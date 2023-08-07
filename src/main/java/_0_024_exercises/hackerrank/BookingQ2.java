package _0_024_exercises.hackerrank;

import java.util.List;


//todo: similar problem link Leetcode: https://leetcode.com/problems/count-number-of-nice-subarrays/

//todo: and its solution GFK: https://www.geeksforgeeks.org/number-subarrays-m-odd-numbers/

public class BookingQ2 {

    public static long beautifulSubarrays(List<Integer> arr, int numOdds) {
        return getMax(arr, numOdds) - getMax(arr, numOdds - 1);
    }

    private static int getMax(List<Integer> arr, int numOdds) {
        int i = 0, res = 0, oddCnt = 0;
        for (int j = 0; j < arr.size(); j++) {

            // count odd elements
            if (arr.get(j) % 2 == 1) {
                oddCnt++;
            }

            while (i <= j && oddCnt > numOdds) {

                if (arr.get(j) % 2 == 1) {
                    oddCnt--;
                }
                i++;
            }
            res += j - i + 1;
        }
        return res;
    }

    public static int countSubarrays(int[] arr, int n, int m) {
//        // subtract the subarrays with at most k-1 odd elements occur from
//        // the subarrays with at most k odd elements occur, we get exactly
//        // subarray with k odd elements.
//
//        return atMost(arr, n, m) - atMost(arr, n, m - 1);
        return 0;
    }

}
