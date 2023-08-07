package _0_024_exercises.geeksforgeeks;

import _0_024_exercises.geeksforgeeks.SubsetSumProblem_GeeksForGeeks;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SubsetSumProblem_GeeksForGeeksTest {

    @Test
    public void test1() {
        int N = 6;
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        boolean expected = true;
        assertThat(SubsetSumProblem_GeeksForGeeks.isSubsetSum(N, arr, sum)).isEqualTo(expected);
    }

    @Test
    public void test2() {
        int N = 6;
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 30;
        boolean expected = false;
        assertThat(SubsetSumProblem_GeeksForGeeks.isSubsetSum(N, arr, sum)).isEqualTo(expected);
    }
}