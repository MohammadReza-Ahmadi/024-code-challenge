package _0_024_exercises.hackerrank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SherlockStringThatAllCharsAppearSameNumberOfTimesTest {

    @Test
    public void test1() {
        String s = "abc";
        String expected = "YES";
        assertThat(SherlockStringThatAllCharsAppearSameNumberOfTimes.isValid(s))
                .isEqualTo(expected);
    }

    @Test
    public void test2() {
        String s = "abccc";
//        String s = "abcc";
        String expected = "NO";
        assertThat(SherlockStringThatAllCharsAppearSameNumberOfTimes.isValid(s))
                .isEqualTo(expected);
    }

    @Test
    public void test3() {
        String s = "aabbcd";
        String expected = "NO";
        assertThat(SherlockStringThatAllCharsAppearSameNumberOfTimes.isValid(s))
                .isEqualTo(expected);
    }

    @Test
    public void test4() {
        String s = "abcdefghhgfedecba";
        String expected = "YES";
        assertThat(SherlockStringThatAllCharsAppearSameNumberOfTimes.isValid(s))
                .isEqualTo(expected);
    }

    @Test
    public void test5() {
        String s = "aaaabbcc";
        String expected = "NO";
        assertThat(SherlockStringThatAllCharsAppearSameNumberOfTimes.isValid(s))
                .isEqualTo(expected);
    }

    @Test
    public void test6() {
        String s = "xxxaabbccrry";
        String expected = "NO";
        assertThat(SherlockStringThatAllCharsAppearSameNumberOfTimes.isValid(s))
                .isEqualTo(expected);
    }
}