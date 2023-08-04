package _0_024_exercises;

import java.util.HashMap;
import java.util.Map;

public class PermCheck {


    public static int solution(int[] A) {
        if (A.length == 1) {
           return A[0] == 1 ? 1 : 0;
        }
        int uncovered = A.length;
        Map<Integer, Integer> seq = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= A.length && seq.get(A[i]) == null) {
                seq.put(A[i], i);
                --uncovered;
            }
        }
        return uncovered == 0 ? 1 : 0;
    }
}
