package _0_024_exercises.geeksforgeeks;

import java.util.*;

//todo: problem link: https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&sortBy=submissions
public class FindContinuousSubarrayWithGivenSum {

    //todo: My own solution based on prefix sum
    //todo: this passed 100% correctness in geeksForGeeks platform: https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&sortBy=submissions
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int prefixSum = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == s) {
                return new ArrayList<>(List.of(i + 1, i + 1));
            }

            prefixSum += arr[i];
            while (prefixSum > s && start < i) {
                prefixSum -= arr[start];
                start++;
            }

            if (prefixSum == s) {
                return new ArrayList<>(List.of(start + 1, i + 1));
            }
        }

        return new ArrayList<>(List.of(-1));
    }

    //todo: A optimized solution without HashMap: https://takeuforward.org/data-structure/subarray-with-given-sum/
    //todo: this solution passed 100% in GeeksForGeeksPlatform: https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&sortBy=submissions
    //todo: this solution also is good for counting and printing sub arrays
    public static ArrayList<Integer> subarraySum_2(int[] arr, int n, int s) {
        int start = 0, end = -1, sum = 0;
        while (start < n) {
            while ((end + 1 < n) && (sum + arr[end + 1] <= s))
                sum += arr[++end];

            if (sum == s && start < end) {
                //todo: below line useful for counting and printing sub arrays
//                for (int p = start; p <= end; p++)
//                    System.out.print(arr[p] + " ");
//                System.out.println();

                return new ArrayList<>(List.of(start + 1, end + 1));
            }

            sum -= arr[start];
            start++;
        }
        return new ArrayList<>(List.of(-1));
    }


    //todo: my own solution with HashMap, it seems 100% correctness but can not passed 100% performance in geeksForGeeks platform, in execution faced performance issue
    public static ArrayList<Integer> subarraySum_1(int[] arr, int n, int s) {
        Map<Integer, Integer> prefixSumIndexMap = new HashMap<>();
        int prefixSum = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == s) {
                return new ArrayList<>(List.of(i + 1, i + 1));
            }

            if (arr[i] > s) {
                prefixSumIndexMap = new HashMap<>();
            }

            prefixSum += arr[i];
            if (prefixSum == s) {
                return new ArrayList<>(List.of(1, i + 1));
            }

            if (prefixSum > s && prefixSumIndexMap.get(prefixSum - s) != null) {
                return new ArrayList<>(List.of(prefixSumIndexMap.get(prefixSum - s) + 1, i + 1));
            } else {
                prefixSumIndexMap.put(prefixSum, i + 1);
            }
        }

        return new ArrayList<>(List.of(-1));
    }
}
