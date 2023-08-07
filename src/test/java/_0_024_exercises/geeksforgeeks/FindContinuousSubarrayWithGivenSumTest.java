package _0_024_exercises.geeksforgeeks;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FindContinuousSubarrayWithGivenSumTest {

    @Test
    public void test1() {
        int n = 5;
        int s = 12;
        int[] arr = {1, 2, 3, 7, 5};
        List<Integer> expected = List.of(2, 4);
        Assertions.assertThat(FindContinuousSubarrayWithGivenSum.subarraySum(arr, n, s))
                .isEqualTo(expected);
    }

    @Test
    public void tes2() {
        int n = 10;
        int s = 15;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> expected = List.of(1, 5);
        Assertions.assertThat(FindContinuousSubarrayWithGivenSum.subarraySum(arr, n, s))
                .isEqualTo(expected);
    }

    @Test
    public void tes3() {
        int n = 8;
        int s = 21;
        int[] arr = {7, 3, 1, 9, 11, 2, 3, 2};
        List<Integer> expected = List.of(3, 5);
        Assertions.assertThat(FindContinuousSubarrayWithGivenSum.subarraySum(arr, n, s))
                .isEqualTo(expected);
    }

    @Test
    public void tes4() {
        int n = 11;
        int s = 5;
        int[] arr = {7, 3, 1, 9, 39, 11, 2, 2, 1, 12, 2};
        List<Integer> expected = List.of(7, 9);
        Assertions.assertThat(FindContinuousSubarrayWithGivenSum.subarraySum(arr, n, s))
                .isEqualTo(expected);
    }

    @Test
    public void tes5() {
        int n = 11;
        int s = 0;
        int[] arr = {7, 3, 1, 9, 39, 11, 2, 2, 1, 12, 2};
        List<Integer> expected = List.of(-1);
        Assertions.assertThat(FindContinuousSubarrayWithGivenSum.subarraySum(arr, n, s))
                .isEqualTo(expected);
    }

    @Test
    public void te6() {
        int n = 11;
        int s = 13;
        int[] arr = {7, 3, 1, 11, 39, 11, 2, 2, 1, 12, 2};
        List<Integer> expected = List.of(6, 7);
        Assertions.assertThat(FindContinuousSubarrayWithGivenSum.subarraySum(arr, n, s))
                .isEqualTo(expected);
    }

//    2 1
//1 2

}