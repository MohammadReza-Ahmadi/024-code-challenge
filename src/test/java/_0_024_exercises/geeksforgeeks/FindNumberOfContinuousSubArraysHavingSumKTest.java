package _0_024_exercises.geeksforgeeks;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.MyUtils;

public class FindNumberOfContinuousSubArraysHavingSumKTest {

    @Test
    public void test1() {
        int[] Arr = {9, 4, 20, 3, 10, 5};
        int N = 6;
        int k = 33;
        int expected = 2;
        Assertions.assertThat(FindNumberOfContinuousSubArraysHavingSumK.findSubArraySum(Arr, N, k))
                .isEqualTo(expected);
    }

    @Test
    public void test2() {
        int[] Arr = {10, 2, -2, -20, 10};
        int N = 5;
        int k = -10;
        int expected = 3;
        Assertions.assertThat(FindNumberOfContinuousSubArraysHavingSumK.findSubArraySum(Arr, N, k))
                .isEqualTo(expected);
    }

    @Test
    public void test3() {
        int[] Arr = {-20, 5, 10, 5};
        int N = 4;
        int k = -5;
        int expected = 1;
        Assertions.assertThat(FindNumberOfContinuousSubArraysHavingSumK.findSubArraySum(Arr, N, k))
                .isEqualTo(expected);
    }

    @Test
    public void test4() {
        int[] Arr = {1, -7, 4, -3, -3};
        int N = 5;
        int k = -3;
        int expected = 3;
        Assertions.assertThat(FindNumberOfContinuousSubArraysHavingSumK.findSubArraySum(Arr, N, k))
                .isEqualTo(expected);
    }

    @Test
    public void test5() {
        int[] Arr = {1, 2, 3};
        int N = 3;
        int k = 3;
        int expected = 2;
        Assertions.assertThat(FindNumberOfContinuousSubArraysHavingSumK.findSubArraySum(Arr, N, k))
                .isEqualTo(expected);
    }

    @Test
    public void test6() {
        //12
        //2 -3 4 9 -9 12 32 -23 21 11 8 15 9
        //6
        int[] Arr = MyUtils.getIntArray("2 -3 4 9 -9 12 32 -23 21 11 8 15 9");
        int N = 13;
        int k = 6;
        int expected = 0;
        Assertions.assertThat(FindNumberOfContinuousSubArraysHavingSumK.findSubArraySum(Arr, N, k))
                .isEqualTo(expected);
    }

    @Test
    public void test7() {
        int[] Arr = MyUtils.getIntArray("2 -3 4 9 -9 12 32 -23 21 11 8 15");
        int N = 12;
        int k = 15;
        int expected = 2;
        Assertions.assertThat(FindNumberOfContinuousSubArraysHavingSumK.findSubArraySum(Arr, N, k))
                .isEqualTo(expected);
    }

}