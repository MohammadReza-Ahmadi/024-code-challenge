package _0_024_exercises.hackerrank;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IsTwoStringsHasCommonSubStringsTest {

    @Test
    public void test1(){
        String s1 = "and";
        String s2 = "art";
        assertThat(IsTwoStringsHasCommonSubStrings.twoStrings(s1, s2)).isEqualTo("YES");
    }

   @Test
    public void test2(){
        String s1 = "be";
        String s2 = "cat";
        assertThat(IsTwoStringsHasCommonSubStrings.twoStrings(s1, s2)).isEqualTo("NO");
    }

}