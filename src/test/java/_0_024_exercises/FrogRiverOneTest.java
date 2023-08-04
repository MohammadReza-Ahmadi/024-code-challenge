package _0_024_exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogRiverOneTest {

    @Test
    public void test1(){
        int X = 5;
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        int expected = 6;
        assertEquals(expected, FrogRiverOne.solution(X, A));
    }

}