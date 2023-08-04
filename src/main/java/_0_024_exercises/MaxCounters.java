package _0_024_exercises;

public class MaxCounters {
//    A[0] = 3    (0, 0, 1, 0, 0)    (0, 0, 1, 0, 0)
//    A[1] = 4    (0, 0, 1, 1, 0)    (0, 0, 1, 1, 0)
//    A[2] = 4    (0, 0, 1, 2, 0)    (0, 0, 1, 2, 0)
//    A[3] = 6    (0, 0, 1, 2, 0)    (2, 2, 2, 2, 2)    max=2
//    A[4] = 1    (1, 0, 1, 2, 0)    (3, 2, 2, 2, 2)
//    A[5] = 4    (1, 0, 1, 3, 0)    (3, 2, 2, 3, 2)
//    A[6] = 4    (1, 0, 1, 4, 0)    (3, 2, 2, 4, 2)

    public static int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int lastMaxCount = 0;
        int curMaxCount = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == N + 1) {
                lastMaxCount = curMaxCount;
            } else {
                counters[A[i]-1] = Math.max(lastMaxCount, counters[A[i]-1]);
                counters[A[i]-1]++;
                curMaxCount = Math.max(curMaxCount, counters[A[i]-1]);
            }
        }

        for (int i=0; i < counters.length; i++){
            if (counters[i] < lastMaxCount){
                counters[i] = lastMaxCount;
            }
        }

        return counters;
    }
}
