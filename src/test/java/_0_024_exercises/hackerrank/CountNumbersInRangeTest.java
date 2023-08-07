package _0_024_exercises.hackerrank;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CountNumbersInRangeTest {

    @Test
    public void test1(){
        Long L = 0L;
        Long R = 0L;
        int expected = 0;
        Assertions.assertThat(CountNumbersInRange.count3DivNums(L,R)).isEqualTo(expected);
    }

}