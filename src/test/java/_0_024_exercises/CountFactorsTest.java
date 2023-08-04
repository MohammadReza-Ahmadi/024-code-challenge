package _0_024_exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountFactorsTest {

    @Test
    public void test1(){
        int N = 24;
        int expected = 8;
        assertEquals(expected, CountFactors.solution(N));
    }

    @Test
    public void test2(){
        int N = 8;
        int expected = 4;
        assertEquals(expected, CountFactors.solution(N));
    }

    @Test
    public void test3(){
        int N = 9;
        int expected = 3;
        assertEquals(expected, CountFactors.solution(N));
    }

    @Test
    public void test4(){
        int N = 1;
        int expected = 1;
        assertEquals(expected, CountFactors.solution(N));
    }

    @Test
    public void test5(){
        int N = 2;
        int expected = 2;
        assertEquals(expected, CountFactors.solution(N));
    }


}