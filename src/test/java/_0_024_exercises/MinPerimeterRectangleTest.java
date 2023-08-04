package _0_024_exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinPerimeterRectangleTest {

    @Test
    public void test1(){
        int N = 30;
        int expected = 22;
        assertEquals(expected, MinPerimeterRectangle.solution(N));
    }

}