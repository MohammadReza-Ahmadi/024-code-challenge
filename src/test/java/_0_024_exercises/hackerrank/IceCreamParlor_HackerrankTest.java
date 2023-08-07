package _0_024_exercises.hackerrank;

import _0_024_exercises.hackerrank.IceCreamParlor_Hackerrank;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class IceCreamParlor_HackerrankTest {

    @Test
    public void test1() {
        int m = 6;
        List<Integer> arr = List.of(1, 3, 4, 5, 6); // items{1,5}
        List<Integer> expected = List.of(1, 4);
        assertThat(IceCreamParlor_Hackerrank.icecreamParlor(m, arr)).isEqualTo(expected);
    }

    @Test
    public void test2() {
        int m = 4;
        List<Integer> arr = List.of(2, 2, 4, 3); // items:{2,2}
        List<Integer> expected = List.of(1, 2);
        assertThat(IceCreamParlor_Hackerrank.icecreamParlor(m, arr)).isEqualTo(expected);
    }

    @Test
    public void test3() {
        int m = 4;
        List<Integer> arr = List.of(1, 4, 5, 3, 2);
        List<Integer> expected = List.of(1, 4);
        assertThat(IceCreamParlor_Hackerrank.icecreamParlor(m, arr)).isEqualTo(expected);
    }

    @Test
    public void test4() {
        //8
        //6
        //1 3 4 4 6 8
        int m = 8;
        List<Integer> arr = List.of(1, 3, 4, 4, 6, 8);
        List<Integer> expected = List.of(3, 4);
        assertThat(IceCreamParlor_Hackerrank.icecreamParlor(m, arr)).isEqualTo(expected);
    }

    @Test
    public void test5() {
//9
//6
//1 3 4 6 7 9
//8
//6
//1 3 4 4 6 8
        int m = 9;
        List<Integer> arr = List.of(1, 3, 4, 6, 7, 9);
        List<Integer> expected = List.of(2, 4);
        assertThat(IceCreamParlor_Hackerrank.icecreamParlor(m, arr)).isEqualTo(expected);
    }
}