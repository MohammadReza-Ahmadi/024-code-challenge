package _0_024_exercises;

/**
 * Get Nth number of Fibonacci series with Array Memoization or Top-Down approach
 * this approach is not efficient for a big number because of many recursive call may stack crashes.
 */
public class FibonacciWithArrayMemoization {

    public static long fibArray[] = new long[1000];

    public static long fibonacci_with_memoization(long n) {
        long fibValue = 0;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (fibArray[(int) n] != 0) {
            return fibArray[(int) n];
        } else {
            fibValue = fibonacci_with_memoization(n - 1) + fibonacci_with_memoization(n - 2);
            fibArray[(int) n] = fibValue;
            return fibValue;
        }
    }
}
