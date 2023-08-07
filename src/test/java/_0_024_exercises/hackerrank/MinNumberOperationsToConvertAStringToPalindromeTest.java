package _0_024_exercises.hackerrank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinNumberOperationsToConvertAStringToPalindromeTest {

    @Test
    public void test1() {
        String s = "cde";
        int expected = 2;
        assertThat(MinNumberOperationsToConvertAStringToPalindrome.theLoveLetterMystery(s)).isEqualTo(expected);
    }

    @Test
    public void test2() {
        String s = "abc";
        int expected = 2;
        assertThat(MinNumberOperationsToConvertAStringToPalindrome.theLoveLetterMystery(s)).isEqualTo(expected);
    }

    @Test
    public void test3() {
        String s = "abcba";
        int expected = 0;
        assertThat(MinNumberOperationsToConvertAStringToPalindrome.theLoveLetterMystery(s)).isEqualTo(expected);
    }

    @Test
    public void test4() {
        String s = "abcd";
        int expected = 4;
        assertThat(MinNumberOperationsToConvertAStringToPalindrome.theLoveLetterMystery(s)).isEqualTo(expected);
    }


}