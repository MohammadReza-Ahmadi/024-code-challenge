package _0_024_exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogJmpTest {

    @Test
    public void test1(){
        int x = 10;
        int y= 85;
        int d = 30;
        int expected = 3;
        assertEquals(expected, FrogJmp.solution(x,y,d));
    }

    @Test
    public void test2(){
        int x = 10;
        int y= 10;
        int d = 1;
        int expected = 0;
        assertEquals(expected, FrogJmp.solution(x,y,d));
    }

    @Test
    public void test3(){
        int x = 10;
        int y= 11;
        int d = 1;
        int expected = 1;
        assertEquals(expected, FrogJmp.solution(x,y,d));
    }

    @Test
    public void test4(){
        int x = 10;
        int y= 12;
        int d = 1;
        int expected = 2;
        assertEquals(expected, FrogJmp.solution(x,y,d));
    }

}