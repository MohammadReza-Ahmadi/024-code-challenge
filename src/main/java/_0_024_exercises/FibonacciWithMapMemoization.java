package _0_024_exercises;

import java.util.HashMap;
import java.util.Map;

/**
 * Get Nth number of Fibonacci series with Map Memoization or Top-Down approach
 */
public class FibonacciWithMapMemoization {

    static final Map<Long, Long> memo = new HashMap<>();
    public static long fib_with_memoization(long N) {
        memo.put(0L,0L);
        memo.put(1L,1L);
        long f = getNthFibNum(N);
        System.out.println("fib="+f);
        return f;
    }

    private static long getNthFibNum(long N) {
        if (N <= 1) {
            return memo.get(N);
        }

        if (memo.get(N) != null) {
            return memo.get(N);
        }

        long fib = getNthFibNum(N - 1) + getNthFibNum(N - 2);
        memo.put(N, fib);
        return fib;
    }

}

