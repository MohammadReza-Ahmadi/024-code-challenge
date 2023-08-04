package _0_24_ing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1Test {

    @Test
    public void test1(){
        int[] A = {0, 4, -1, 0, 3};
        int[] B = {0, -2, 5, 0, 3};
        int expected = 2;
        assertEquals(expected, Q1.solution(A, B));
    }
}