package _0_024_exercises.hackerrank;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


public class BookingQ2Test {

    @Test
    public void test1() {
        List<Integer> arr = List.of(2,5,4,9);
        int numOdds = 1;
        int expected = 6;
        Assertions.assertThat(BookingQ2.beautifulSubarrays(arr,numOdds)).isEqualTo(9);
    }
}