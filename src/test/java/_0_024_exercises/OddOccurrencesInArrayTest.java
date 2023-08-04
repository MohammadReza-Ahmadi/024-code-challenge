package _0_024_exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OddOccurrencesInArrayTest {

    @Test
    public void test1() {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        int expected = 7;
        Assertions.assertEquals(expected, OddOccurrencesInArray.solution(A));
    }

    @Test
    public void test2() {
        int[] A = {2, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 2, 1};
        int expected = 1;
        Assertions.assertEquals(expected, OddOccurrencesInArray.solution(A));
    }
}