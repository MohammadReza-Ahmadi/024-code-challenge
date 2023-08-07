package _0_024_exercises.hackerrank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaximumPalindromesLengthTest {

    @Test
    public void test1() {
        String s = "week";
        int l = 1;
        int r = 4;
        int expected = 2;
        MaximumPalindromesLength.initialize(s);
        assertThat(MaximumPalindromesLength.answerQuery(l, r)).isEqualTo(expected);
    }

    @Test
    public void test2() {
        String s = "week";
        int l = 2;
        int r = 3;
        int expected = 1;
        MaximumPalindromesLength.initialize(s);
        assertThat(MaximumPalindromesLength.answerQuery(l, r)).isEqualTo(expected);
    }

    @Test
    public void test3() {
        String s = "abad";
        int l = 1;
        int r = 4;
        int expected = 2;
        MaximumPalindromesLength.initialize(s);
        assertThat(MaximumPalindromesLength.answerQuery(l, r)).isEqualTo(expected);
    }

    @Test
    public void test4() {
        String s = "madamimadam";
        int l = 4;
        int r = 7;
        int expected = 2;
        MaximumPalindromesLength.initialize(s);
        assertThat(MaximumPalindromesLength.answerQuery(l, r)).isEqualTo(expected);
    }

    @Test
    public void test5() {
        String s = "wuhmbspjnfviogqzldrcxtaeyk";
        int l = 21;
        int r = 21;
        int expected = 0;
        MaximumPalindromesLength.initialize(s);
        assertThat(MaximumPalindromesLength.answerQuery(l, r)).isEqualTo(expected);
    }

    @Test
    public void test6() {
        String s = "wuhmbspjnfviogqzldrcxtaeyk";
        int l = 4;
        int r = 5;
        int expected = 0;
        MaximumPalindromesLength.initialize(s);
        assertThat(MaximumPalindromesLength.answerQuery(l, r)).isEqualTo(expected);
    }

    @Test
    public void test7() {
        String s = "abab";
        int l = 1;
        int r = 4;
        int expected = 2;
        MaximumPalindromesLength.initialize(s);
        assertThat(MaximumPalindromesLength.answerQuery(l, r)).isEqualTo(expected);
    }


}