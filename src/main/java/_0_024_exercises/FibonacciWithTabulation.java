package _0_024_exercises;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Get Nth number of Fibonacci series with Tabulation or Bottom-Up approach
 * this approach is efficient for a big number also because at first create tabulation table one time
 * and don't use recursive call
 */
public class FibonacciWithTabulation {

    private static final Map<Integer, BigDecimal> bottomUp = new HashMap<>();

    public static BigDecimal fib_with_tabulation(int N) {
        bottomUp.put(0, BigDecimal.ZERO);
        bottomUp.put(1, BigDecimal.ONE);
        bottomUp.put(2, BigDecimal.ONE);
        BigDecimal f = fib(N);
        System.out.println("fib=" + f);
        return f;
    }

    private static BigDecimal fib(int N) {
        if (N <= 1) {
            return bottomUp.get(N);
        }

        for (int i = 3; i <= N + 1; i++) {
            bottomUp.put(i, bottomUp.get(i - 1).add(bottomUp.get(i - 2)));
        }

        return bottomUp.get(N);
    }
}
