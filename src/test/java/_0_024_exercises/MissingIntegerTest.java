package _0_024_exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingIntegerTest {

    @Test
    public void test1(){
        int[] A = {1, 3, 6, 4, 1, 2};
        int expected = 5;
        assertEquals(expected, MissingInteger.solution(A));
    }

    @Test
    public void test2(){
        int[] A = {1, 2, 3};
        int expected = 4;
        assertEquals(expected, MissingInteger.solution(A));
    }

    @Test
    public void test3(){
        int[] A = {4,5};
        int expected = 1;
        assertEquals(expected, MissingInteger.solution(A));
    }

    @Test
    public void test4(){
        int[] A = {2};
        int expected = 1;
        assertEquals(expected, MissingInteger.solution(A));
    }
    @Test
    public void test5(){
        int[] A = {-1, -3};
        int expected = 1;
        assertEquals(expected, MissingInteger.solution(A));
    }

}