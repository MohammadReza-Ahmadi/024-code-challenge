package _0_024_exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermCheckTest {

    @Test
    public void test1(){
        int[] A = {4, 1, 3, 2};
        int expected = 1;
        assertEquals(expected, PermCheck.solution(A));
    }

    @Test
    public void test2(){
        int[] A = {4, 1, 2};
        int expected = 0;
        assertEquals(expected, PermCheck.solution(A));
    }

    @Test
    public void test3(){
        int[] A = {1};
        int expected = 1;
        assertEquals(expected, PermCheck.solution(A));
    }

    @Test
    public void test4(){
        int[] A = {2};
        int expected = 0;
        assertEquals(expected, PermCheck.solution(A));
    }
}