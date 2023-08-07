package _0_024_exercises.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class CountNumberOfNiceSubArrays_LeetcodeTest {

    @Test
    public void test1(){
        int[] nums = {1,1,2,1,1};
        int k = 3;
        int expected = 1;
        assertThat(CountNumberOfNiceSubArrays_Leetcode.numberOfSubarrays(nums,k)).isEqualTo(expected);
    }
}