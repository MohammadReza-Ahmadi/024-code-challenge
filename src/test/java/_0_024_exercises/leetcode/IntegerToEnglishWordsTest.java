package _0_024_exercises.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntegerToEnglishWordsTest {

    @Test
    public void test1(){
        int num = 123;
        String expected = "One Hundred Twenty Three";
        Assertions.assertThat(IntegerToEnglishWords.numberToWords(num)).isEqualTo(expected);
    }
}