package _0_024_exercises.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RewardTopKStudents_SimilarToBookingDotComeHotelProblemTest {

    @Test
    public void test1() {
        String[] positive_feedback = {"smart", "brilliant", "studious"};
        String[] negative_feedback = {"not"};
        String[] report = {"this student is studious", "the student is smart"};
        int[] student_id = {1, 2};
        int k = 2;
        List<Integer> expected = List.of(1, 2);
        Assertions.assertThat(
                        RewardTopKStudents_SimilarToBookingDotComeHotelProblem.topStudents(positive_feedback, negative_feedback, report, student_id, k))
                .isEqualTo(expected);
    }

    @Test
    public void test2() {
        String[] positive_feedback = {"smart", "brilliant", "studious"};
        String[] negative_feedback = {"not"};
        String[] report = {"this student is not studious", "the student is smart"};
        int[] student_id = {1, 2};
        int k = 2;
        List<Integer> expected = List.of(2, 1);
        Assertions.assertThat(
                        RewardTopKStudents_SimilarToBookingDotComeHotelProblem.topStudents(positive_feedback, negative_feedback, report, student_id, k))
                .isEqualTo(expected);
    }

    @Test
    public void test3() {
        String[] positive_feedback = {"smart", "brilliant", "studious"};
        String[] negative_feedback = {"not"};
        String[] report = {"this student is not studious", "the student is smart"};
        int[] student_id = {100, 200};
        int k = 2;
        List<Integer> expected = List.of(200, 100);
        Assertions.assertThat(
                        RewardTopKStudents_SimilarToBookingDotComeHotelProblem.topStudents(positive_feedback, negative_feedback, report, student_id, k))
                .isEqualTo(expected);
    }

    @Test
    public void test4() {
        String[] positive_feedback = {"smart", "brilliant", "studious"};
        String[] negative_feedback = {"not"};
        String[] report = {"this student is not studious", "the student is smart"};
        int[] student_id = {100, 200};
        int k = 1;
        List<Integer> expected = List.of(200);
        Assertions.assertThat(
                        RewardTopKStudents_SimilarToBookingDotComeHotelProblem.topStudents(positive_feedback, negative_feedback, report, student_id, k))
                .isEqualTo(expected);
    }

    @Test
    public void test5() {
        String[] positive_feedback = {"smart", "brilliant", "studious"};
        String[] negative_feedback = {"not"};
        String[] report = {"this student is studious", "the student is smart"};
        int[] student_id = {1, 2};
        int k = 1;
        List<Integer> expected = List.of(1);
        Assertions.assertThat(
                        RewardTopKStudents_SimilarToBookingDotComeHotelProblem.topStudents(positive_feedback, negative_feedback, report, student_id, k))
                .isEqualTo(expected);
    }

    @Test
    public void test6() {
        String[] positive_feedback = {"pyuknvau","nc","hwcpe","wn"};
        String[] negative_feedback = {"bjzzjcgxv","dibldp","pmlb"};
        String[] report = {"qws z pmlb xmcugvuos lpnygddx bjzzjcgxv hwcpe pmlb pmlb rocg",
                "hwcpe pyuknvau dibldp bjzzjcgxv bjzzjcgxv hwcpe wn pmlb pyuknvau wodnvd",
                "dibldp dibldp gna dibldp pmlb pyuknvau pyuknvau nc iygs rkhtnjreq",
                "pmlb aas wn hwcpe bjzzjcgxv otird pyuknvau fdl bjzzjcgxv dibldp"};

        int[] student_id = {357574114,899543310,676388750,793586311};
        int k = 2;
        List<Integer> expected = List.of(899543310,676388750);
        Assertions.assertThat(
                        RewardTopKStudents_SimilarToBookingDotComeHotelProblem.topStudents(positive_feedback, negative_feedback, report, student_id, k))
                .isEqualTo(expected);
    }


}