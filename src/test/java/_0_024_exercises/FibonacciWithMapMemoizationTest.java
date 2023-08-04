package _0_024_exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciWithMapMemoizationTest {

    // fibonacci numbers: 0,1,1,2,3,5,8,13,21,34,55

    @Test
    public void test1() {
        int N = 4;
        int expected = 3;
        Assertions.assertEquals(expected, FibonacciWithMapMemoization.fib_with_memoization(N));
    }

    @Test
    public void test2() {
        int N = 0;
        int expected = 0;
        Assertions.assertEquals(expected, FibonacciWithMapMemoization.fib_with_memoization(N));
    }

    @Test
    public void test3() {
        int N = 1;
        int expected = 1;
        Assertions.assertEquals(expected, FibonacciWithMapMemoization.fib_with_memoization(N));
    }

    @Test
    public void test4() {
        int N = 2;
        int expected = 1;
        Assertions.assertEquals(expected, FibonacciWithMapMemoization.fib_with_memoization(N));
    }

    @Test
    public void test5() {
        int N = 3;
        int expected = 2;
        Assertions.assertEquals(expected, FibonacciWithMapMemoization.fib_with_memoization(N));
    }

    @Test
    public void test6() {
        int N = 10;
        int expected = 55;
        Assertions.assertEquals(expected, FibonacciWithMapMemoization.fib_with_memoization(N));
    }

    @Test
    public void test7() {
        int N = 100;
        long expected = 3736710778780434371L;
        Assertions.assertEquals(expected, FibonacciWithMapMemoization.fib_with_memoization(N));
    }

    @Test
    public void test8() {
        int N = 500;
        long expected = 2171430676560690477L;
        Assertions.assertEquals(expected, FibonacciWithMapMemoization.fib_with_memoization(N));
    }

    @Test
    public void test9() {
        int N = 1000;
        long expected = 817770325994397771L;
        Assertions.assertEquals(expected, FibonacciWithMapMemoization.fib_with_memoization(N));
    }

    //This test failed with StackOverFlowError because of many recursive call in stack
    @Test
    public void test10() {
        int N = 50000;
        FibonacciWithMapMemoization.fib_with_memoization(N);
//        long expected = 4378934567125391099L;
//        Assertions.assertEquals(expected, FibonacciWithMapMemoization.fib_with_memoization(N));
    }

}