package _0_024_exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassingCarsTest {

    @Test
    public void test1(){
        int[] A = {0, 1, 0, 1, 1};
        int expected = 5;
        assertEquals(expected, PassingCars.solution(A));
    }

    @Test
    public void test2(){
        int[] A = {0, 1};
        int expected = 1;
        assertEquals(expected, PassingCars.solution(A));
    }

    @Test
    public void test3(){
        int[] A = {0};
        int expected = 0;
        assertEquals(expected, PassingCars.solution(A));
    }

    @Test
    public void test4(){
        int[] A = {1};
        int expected = 0;
        assertEquals(expected, PassingCars.solution(A));
    }

    @Test
    public void test5(){
        int[] A = {1,0};
        int expected = 0;
        assertEquals(expected, PassingCars.solution(A));
    }

    @Test
    public void test6(){
        int[] A = {1,0,1};
        int expected = 1;
        assertEquals(expected, PassingCars.solution(A));
    }
    @Test
    public void test7(){
        int[] A = {1,0,1,1};
        int expected = 2;
        assertEquals(expected, PassingCars.solution(A));
    }

}