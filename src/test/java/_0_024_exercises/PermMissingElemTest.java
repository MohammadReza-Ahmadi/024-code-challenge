package _0_024_exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermMissingElemTest {

    @Test
    public void test1() {
        int[] A = {2, 3, 1, 5};
        int expected = 4;
        assertEquals(expected, PermMissingElem.solution(A));
    }

    @Test
    public void test2() {
        int[] A = {9, 7, 1, 5, 6, 8, 4, 2};
        int expected = 3;
        assertEquals(expected, PermMissingElem.solution(A));
    }

    @Test
    public void test3() {
        int[] A = {1};
        int expected = 2;
        assertEquals(expected, PermMissingElem.solution(A));
    }

    @Test
    public void test4() {
        int[] A = {4};
        int expected = 1;
        assertEquals(expected, PermMissingElem.solution(A));
    }

    @Test
    public void test5() {
        int[] A = {1,2,4};
        int expected = 3;
        assertEquals(expected, PermMissingElem.solution(A));
    }

    @Test
    public void test6() {
        int[] A = {2,3,4,5};
        int expected = 1;
        assertEquals(expected, PermMissingElem.solution(A));
    }

    @Test
    public void test7() {
        int[] A = {4,5,2,3};
        int expected = 1;
        assertEquals(expected, PermMissingElem.solution(A));
    }

   @Test
    public void test8() {
        int[] A = {1,2};
        int expected = 3;
        assertEquals(expected, PermMissingElem.solution(A));
    }

}