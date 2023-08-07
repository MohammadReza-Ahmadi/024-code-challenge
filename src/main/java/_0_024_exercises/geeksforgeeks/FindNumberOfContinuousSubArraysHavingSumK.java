package _0_024_exercises.geeksforgeeks;

import java.util.HashMap;
import java.util.Map;

//todo: problem link: https://practice.geeksforgeeks.org/problems/subarrays-with-sum-k/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
//todo: GFK solution: https://www.geeksforgeeks.org/number-subarrays-sum-exactly-equal-k/?ref=gcse
public class FindNumberOfContinuousSubArraysHavingSumK {

    //todo: my own solution, passed GeeksForGeeks platform tests,  correctness & performance are 100%
    //todo: geeksForGeeks platform link: https://practice.geeksforgeeks.org/problems/subarrays-with-sum-k/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
    public static int findSubArraySum(int Arr[], int N, int k) {
        Map<Integer, Integer> prefixSumIndexMap = new HashMap<>();
        int prefixSum = 0;
        int subArraysCount = 0;

        for (int i = 0; i < N; i++) {
            prefixSum += Arr[i];
            if (prefixSum == k) {
                subArraysCount++;
            }

            if (prefixSumIndexMap.get(prefixSum - k) != null) {
                subArraysCount += prefixSumIndexMap.get(prefixSum - k);
            }
            prefixSumIndexMap.compute(prefixSum, (key, val) -> prefixSumIndexMap.getOrDefault(key, 0) + 1);

        }

        return subArraysCount;
    }
}
