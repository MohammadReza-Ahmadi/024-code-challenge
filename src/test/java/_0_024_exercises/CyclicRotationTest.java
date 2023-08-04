package _0_024_exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.MyUtils;

class CyclicRotationTest {

    @Test
    public void test1() {
        int[] A = {3, 8, 9, 7, 6};
        int k = 3;
        int[] expected = {9, 7, 6, 3, 8};
        int[] actual = CyclicRotation.solution(A, k);
        MyUtils.printArray("expected", expected);
        MyUtils.printArray("  actual", actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[] A = {1, 2, 3, 4};
        int k = 4;
        int[] expected = {1, 2, 3, 4}; //=A
        int[] actual = CyclicRotation.solution(A, k);
        MyUtils.printArray("expected", expected);
        MyUtils.printArray("  actual", actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        int[] A = {1, 2, 3, 4};
        int k = 3;
        int[] expected = {2, 3, 4, 1};
        int[] actual = CyclicRotation.solution(A, k);
        MyUtils.printArray("expected", expected);
        MyUtils.printArray("  actual", actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        int[] A = {1, 1, 2, 3, 5};
        int k =42;
        int[] expected = {3, 5, 1, 1, 2};
        int[] actual = CyclicRotation.solution(A, k);
        MyUtils.printArray("expected", expected);
        MyUtils.printArray("  actual", actual);
        Assertions.assertArrayEquals(expected, actual);
    }

}