package _0_024_exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TapeEquilibriumTest {

    @Test
    public void test1() {
        int[] A = {3, 1, 2, 4, 3};
        int expected = 1;
        assertEquals(expected, TapeEquilibrium.solution(A));
    }

    @Test
    public void test2() {
        int[] A = {1, 1, 1, 1};
        int expected = 0;
        assertEquals(expected, TapeEquilibrium.solution(A));
    }

    @Test
    public void test3() {
        int[] A = {1, 1, 1, 1, 1};
        int expected = 1;
        assertEquals(expected, TapeEquilibrium.solution(A));
    }

    @Test
    public void test4() {
        int[] A = {1, -1, 1, -1, 1};
        int expected = 1;
        assertEquals(expected, TapeEquilibrium.solution(A));
    }

    @Test
    public void test5() {
        int[] A = {1, -1, 1, -1};
        int expected = 0;
        assertEquals(expected, TapeEquilibrium.solution(A));
    }

    @Test
    public void test6() {
        int[] A = {1, -1, 1, -2};
        // totalSum = -1,
        // leftSum => 1 | rightSum => -1+1-2=-2 | diff=|1-(-2)|=3
        // leftSum => 1+(-1)=0 | rightSum => 1+(-2)=-1 | diff=|0-(-1)|=1
        // leftSum => 1+(-1)+1=1 | rightSum => -2 | diff=1-(-2)=3
        int expected = 1;
        assertEquals(expected, TapeEquilibrium.solution(A));
    }

    @Test
    public void test7() {
        int[] A = {2000, 0};
        int expected = 2000;
        assertEquals(expected, TapeEquilibrium.solution(A));
    }

}