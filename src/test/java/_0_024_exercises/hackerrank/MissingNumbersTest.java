package _0_024_exercises.hackerrank;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MissingNumbersTest {

    @Test
    public void test1(){
        List<Integer> arr = List.of(7,2,5,3,5,3);
        List<Integer> brr = List.of(7,2,5,4,6,3,5,3);
        List<Integer> expected = List.of(4,6);
        Assertions.assertThat(MissingNumbers.missingNumbers(arr,brr)).isEqualTo(expected);
    }
}