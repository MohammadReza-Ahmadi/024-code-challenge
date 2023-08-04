package _0_024_exercises;

import org.junit.jupiter.api.Test;
import utils.MyUtils;

import static org.junit.jupiter.api.Assertions.*;

class MaxCountersTest {

    @Test
    public void test1(){
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int N = 5;
        int[] expected = {3, 2, 2, 4, 2};
        int[] actual = MaxCounters.solution(N, A);
        MyUtils.printArray("expected=", expected);
        MyUtils.printArray("  actual=", actual);
        assertArrayEquals(expected, actual);
    }

}