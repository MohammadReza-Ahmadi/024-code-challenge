package _0_024_exercises.hackerrank;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class BookingQ1Test {

    @Test
    public void test1() {
        String t = "abbbaacc";
        Assertions.assertThat(BookingQ1.maximumOccurringCharacter(t)).isEqualTo('a');
    }

    @Test
    public void test2() {
        String t = "helloworld";
        Assertions.assertThat(BookingQ1.maximumOccurringCharacter(t)).isEqualTo('l');
    }
}