package _0_024_exercises.hackerrank;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


public class BookingQ3Test {

    @Test
    public void test1() {
        String positiveKeywords = "breakfast beach citycenter location metro view staff price";
        String negativeKeywords = "not";
        List<Integer> hotelIds = List.of(1,2,1,1,2);
        List<String> reviews = List.of(
                "The hotel has a nice view of the citycenter. The location is perfect",
                "The breakfast is ok. Regarding loacatiion, it is quite far from citycenter but price is cheep so it is worth"
//                "",
//                "",

        );
        int k = 2;
        List<Integer> expected = List.of(2,1);
        Assertions.assertThat(BookingQ3.awardTopKHotels(positiveKeywords,negativeKeywords,hotelIds,reviews,k)).isEqualTo(expected);
    }

    @Test
    public void test2() {
        String positiveKeywords = "breakfast beach";
        String negativeKeywords = "not";
        List<Integer> hotelIds = List.of(1,2);
        List<String> reviews = List.of(
                "beach not",
                "beach"
//                "",
//                "",

        );
        int k = 2;
        List<Integer> expected = List.of(2,1);
        Assertions.assertThat(BookingQ3.awardTopKHotels(positiveKeywords,negativeKeywords,hotelIds,reviews,k)).isEqualTo(expected);
    }

    @Test
    public void test3() {
        String positiveKeywords = "breakfast beach";
        String negativeKeywords = "not";
        List<Integer> hotelIds = List.of(1,2);
        List<String> reviews = List.of(
                "beach not",
                "beach not"
//                "",
//                "",

        );
        int k = 2;
        List<Integer> expected = List.of(1,2);
        Assertions.assertThat(BookingQ3.awardTopKHotels(positiveKeywords,negativeKeywords,hotelIds,reviews,k)).isEqualTo(expected);
    }
    @Test
    public void test4() {
        String positiveKeywords = "breakfast beach good;";
        String negativeKeywords = "not";
        List<Integer> hotelIds = List.of(1,2);
        List<String> reviews = List.of(
                "beach not",
                "beach not good"
//                "",
//                "",

        );
        int k = 2;
        List<Integer> expected = List.of(2,1);
        Assertions.assertThat(BookingQ3.awardTopKHotels(positiveKeywords,negativeKeywords,hotelIds,reviews,k)).isEqualTo(expected);
    }
    @Test
    public void test5() {
        String positiveKeywords = "breakfast beach good;";
        String negativeKeywords = "not";
        List<Integer> hotelIds = List.of(1,2);
        List<String> reviews = List.of(
                "beach not beach",
                "beach not good"
//                "",
//                "",

        );
        int k = 2;
        List<Integer> expected = List.of(1,2);
        Assertions.assertThat(BookingQ3.awardTopKHotels(positiveKeywords,negativeKeywords,hotelIds,reviews,k)).isEqualTo(expected);
    }

    @Test
    public void test6() {
        String positiveKeywords = "breakfast beach good;";
        String negativeKeywords = "not";
        List<Integer> hotelIds = List.of(1,2,1);
        List<String> reviews = List.of(
                "beach not beach",
                "beach not good",
                "beach not good"
//                "",
//                "",

        );
        int k = 2;
        List<Integer> expected = List.of(1,2);
        Assertions.assertThat(BookingQ3.awardTopKHotels(positiveKeywords,negativeKeywords,hotelIds,reviews,k)).isEqualTo(expected);
    }
}