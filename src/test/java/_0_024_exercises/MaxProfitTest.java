package _0_024_exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxProfitTest {

    @Test
    public void test1() {
        int[] A = {23171,
                21011,
                21123,
                21366,
                21013,
                21367};

        int expected = 356;
        assertEquals(expected, MaxProfit.solution(A));
    }

    @Test
    public void test2() {
        int[] A = {4, 2, 5, 7, -4, 11};

        int expected = 15;
        assertEquals(expected, MaxProfit.solution(A));
    }

    @Test
    public void test3() {
        int[] A = {4, 2, 5, 7, 4, 11};

        int expected = 9;
        assertEquals(expected, MaxProfit.solution(A));
    }

    @Test
    public void test4() {
        int[] A = {1, 2, 5, 7, 12, 11};

        int expected = 11;
        assertEquals(expected, MaxProfit.solution(A));
    }

    @Test
    public void test5() {
        int[] A = {};

        int expected = 0;
        assertEquals(expected, MaxProfit.solution(A));
    }

}