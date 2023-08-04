package _0_024_exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSliceSumTest {

    @Test
    public void test1(){
        int[] A = {3, 2, -6, 4, 0};
        int expected = 5;
        assertEquals(expected, MaxSliceSum.solution(A));
    }

}