package _0_024_exercises;

import java.util.HashMap;
import java.util.Map;

public class MissingInteger {

    public static int solution(int[] A) {
        Map<Integer, Integer> nums = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                nums.put(A[i],A[i]);
            }
        }

        for (int i = 1; i <= nums.size(); i++) {
            if (nums.get(i) == null) {
                return i;
            }
        }
        return nums.size() + 1;
    }
}