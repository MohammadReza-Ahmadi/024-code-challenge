package _0_024_exercises.geeksforgeeks;

import _0_024_exercises.geeksforgeeks.FindANonEmptySubsetThatSumOfElementsIsDivisibleByInputArraySize_GeeksForGeeks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindANonEmptySubsetThatSumOfElementsIsDivisibleByInputArraySize_GeeksForGeeksTest {

    @Test
    public void test1(){
        int N = 5;
        int[] arr = {2, 3, 7, 1, 9};
        int[] expected = {1, 2}; //means item at first index and second index which are: {2, 3}
        Assertions.assertThat(FindANonEmptySubsetThatSumOfElementsIsDivisibleByInputArraySize_GeeksForGeeks.findNonEmptySubset(arr,N))
                .isEqualTo(expected);

    }

    @Test
    public void test2(){
        int N = 5;
        int[] arr = {3,1,7,8,2,9};
        int[] expected = {3, 4}; // items: {7, 8}
        Assertions.assertThat(FindANonEmptySubsetThatSumOfElementsIsDivisibleByInputArraySize_GeeksForGeeks.findNonEmptySubset(arr,N))
                .isEqualTo(expected);

    }
    @Test
    public void test3(){
        int N = 5;
        int[] arr = {2,1,7,8,2};
        int[] expected = {1,2,3}; // items: {2,1,7}
        Assertions.assertThat(FindANonEmptySubsetThatSumOfElementsIsDivisibleByInputArraySize_GeeksForGeeks.findNonEmptySubset(arr,N))
                .isEqualTo(expected);

    }

    @Test
    public void test4(){
        int N = 5;
        int[] arr = {8,9,2,1,7};
        int[] expected = {1,2,3,4}; // items: {8,9,2,1} // because this solution works sequentially
        Assertions.assertThat(FindANonEmptySubsetThatSumOfElementsIsDivisibleByInputArraySize_GeeksForGeeks.findNonEmptySubset(arr,N))
                .isEqualTo(expected);

    }

    @Test
    public void test5(){
        int N = 5;
        int[] arr = {8,9,1,2,7};
        int[] expected = {2,3}; // items: {9,1} // because this solution works sequentially
        Assertions.assertThat(FindANonEmptySubsetThatSumOfElementsIsDivisibleByInputArraySize_GeeksForGeeks.findNonEmptySubset(arr,N))
                .isEqualTo(expected);

    }

}