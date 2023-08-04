package _0_024_exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubsequenceTest {

    @Test
    public void test1(){
        String text1 = "ABC";
        String text2 = "BC";
        int expected = 2;
        assertEquals(expected, LongestCommonSubsequence.longestCommonSubsequence(text1, text2));
    }

    @Test
    public void test2(){
        String text1 = "AGGTAB";
        String text2 = "GXTXAYB";
        int expected = 4;
        assertEquals(expected, LongestCommonSubsequence.longestCommonSubsequence(text1, text2));
    }

}