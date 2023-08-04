package _0_024_exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinAvgTwoSliceTest {

    @Test
    public void test1(){
        int[] A = {4, 2, 2, 5, 1, 5, 8};
        int expected = 1;
        assertEquals(expected, MinAvgTwoSlice.solution(A));
    }
}