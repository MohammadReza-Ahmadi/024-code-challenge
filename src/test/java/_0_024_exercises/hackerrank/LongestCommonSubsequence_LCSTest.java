package _0_024_exercises.hackerrank;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongestCommonSubsequence_LCSTest {

    @Test
    public void test1(){
        String s1 = "ABCD";
        String s2 = "ABDC";
        Assertions.assertThat(LongestCommonSubsequence_LCS.commonChild(s1,s2))
                .isEqualTo(3);
    }

    @Test
    public void test2(){
        String s1 = "HARRY";
        String s2 = "SALLY";
        Assertions.assertThat(LongestCommonSubsequence_LCS.commonChild(s1,s2))
                .isEqualTo(2);
    }
    @Test
    public void test3(){
        String s1 = "AA";
        String s2 = "BB";
        Assertions.assertThat(LongestCommonSubsequence_LCS.commonChild(s1,s2))
                .isEqualTo(0);
    }

    @Test
    public void test4(){
        String s1 = "SHINCHAN";
        String s2 = "NOHARAAA";
        Assertions.assertThat(LongestCommonSubsequence_LCS.commonChild(s1,s2))
                .isEqualTo(3);
    }

    @Test
    public void test5(){
        String s1 = "ABCDEF";
        String s2 = "FBDAMN";
        Assertions.assertThat(LongestCommonSubsequence_LCS.commonChild(s1,s2))
                .isEqualTo(2);
    }


}