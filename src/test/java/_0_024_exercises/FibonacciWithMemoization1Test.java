package _0_024_exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciWithMemoization1Test {

    // fibonacci numbers: 0,1,1,2,3,5,8,13,21,34,55

    @Test
    public void test1() {
        int N = 4;
        int expected = 3;
        Assertions.assertEquals(expected, FibonacciWithArrayMemoization.fibonacci_with_memoization(N));
    }

    @Test
    public void test2() {
        int N = 0;
        int expected = 0;
        Assertions.assertEquals(expected, FibonacciWithArrayMemoization.fibonacci_with_memoization(N));
    }

    @Test
    public void test3() {
        int N = 1;
        int expected = 1;
        Assertions.assertEquals(expected, FibonacciWithArrayMemoization.fibonacci_with_memoization(N));
    }

    @Test
    public void test4() {
        int N = 2;
        int expected = 1;
        Assertions.assertEquals(expected, FibonacciWithArrayMemoization.fibonacci_with_memoization(N));
    }

    @Test
    public void test5() {
        int N = 3;
        int expected = 2;
        Assertions.assertEquals(expected, FibonacciWithArrayMemoization.fibonacci_with_memoization(N));
    }

    @Test
    public void test6() {
        int N = 10;
        int expected = 55;
        Assertions.assertEquals(expected, FibonacciWithArrayMemoization.fibonacci_with_memoization(N));
    }

    @Test
    public void test7() {
        int N = 100;
        long expected = 3736710778780434371L;
        Assertions.assertEquals(expected, FibonacciWithArrayMemoization.fibonacci_with_memoization(N));
    }
}