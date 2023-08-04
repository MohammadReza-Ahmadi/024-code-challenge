package _0_024_exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryGapTest {

    @Test
    public void test1() {
        int num = 9;
        int expected = 2;
        Assertions.assertEquals(expected, BinaryGap.solution(num));
    }

    @Test
    public void test2() {
        int num = 529;
        int expected = 4;
        Assertions.assertEquals(expected, BinaryGap.solution(num));
    }

    @Test
    public void test3() {
        int num = 15;
        int expected = 0;
        Assertions.assertEquals(expected, BinaryGap.solution(num));
    }

    @Test
    public void test4() {
        int num = 32;
        int expected = 0;
        Assertions.assertEquals(expected, BinaryGap.solution(num));
    }

}