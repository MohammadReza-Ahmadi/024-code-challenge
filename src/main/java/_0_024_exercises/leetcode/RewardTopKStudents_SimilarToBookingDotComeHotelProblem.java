package _0_024_exercises.leetcode;

import java.util.*;
import java.util.stream.Collectors;

//todo: problem link on Leetcode: https://leetcode.com/problems/reward-top-k-students/
//todo: booking.com similar hotel problem discussion links:
//todo: link1:  https://leetcode.com/discuss/interview-question/1431676/bookingcom-award-top-k-hotels-oa-hackerrank
//todo: link2:  https://leetcode.com/discuss/interview-question/1245302/Booking.com-or-Hacker-rank-test-or-May-2021/1790447
//todo: link3:  https://leetcode.com/discuss/interview-question/1574201/Booking.com-Top-K-Hotels.
public class RewardTopKStudents_SimilarToBookingDotComeHotelProblem {

    //todo: my own solution, tested in leetcode, passed 100% correctness and performance tests
    //todo: my submitted solution here: https://leetcode.com/problems/reward-top-k-students/submissions/
    public static List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        Map<String, Integer> positiveMap = new HashMap<>();
        Map<String, Integer> negativeMap = new HashMap<>();

        for (int i = 0; i < positive_feedback.length; i++) {
            positiveMap.putIfAbsent(positive_feedback[i], 3);
        }

        for (int i = 0; i < negative_feedback.length; i++) {
            negativeMap.putIfAbsent(negative_feedback[i], -1);
        }

        //initiate student map with student ids
        Map<Integer, Integer> studentMap = new HashMap<>();
        for (int i = 0; i < student_id.length; i++) {
            studentMap.putIfAbsent(i, student_id[i]);
        }

        //map of student rateMap based on student id and its rate
        Map<Integer, Integer> studentRateMap = new TreeMap<>();

        boolean hasDifferentRates = false;
        boolean initPrvRate = false;
        int prvRate = 0;

        for (int i = 0; i < report.length; i++) {
            for (String r : report[i].split(" ")) {
                Map<String, Integer> usedFeedback = new HashMap<>();

                //creat a feedbackMap with each count for one to control just use one time per each unique feedback
                if (positiveMap.get(r) != null || negativeMap.get(r) != null) {
                    usedFeedback.putIfAbsent(r, 1);
                }

                studentRateMap.put(studentMap.get(i),
                        studentRateMap.getOrDefault(studentMap.get(i), 0)
                                + (usedFeedback.getOrDefault(r, 0) == 1 ? positiveMap.getOrDefault(r, 0) : 0)
                                + (usedFeedback.getOrDefault(r, 0) == 1 ? negativeMap.getOrDefault(r, 0) : 0));
            }

            //check and initiate prvRate
            int rate = studentRateMap.getOrDefault(studentMap.get(i), 0);
            if (!initPrvRate) {
                prvRate = rate;
                initPrvRate = true;
            }

            //check if students have different rates
            if (!hasDifferentRates) {
                hasDifferentRates = prvRate != rate;
            }
        }

        List<Integer> collect;
        if (hasDifferentRates) {
            collect = studentRateMap.entrySet().stream()
                    .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                    .limit(k)
                    .mapToInt(Map.Entry::getKey)
                    .boxed()
                    .collect(Collectors.toList());
        } else {
            collect = studentRateMap.entrySet().stream()
                    .sorted(Comparator.comparing(Map.Entry::getKey))
                    .limit(k)
                    .mapToInt(Map.Entry::getKey)
                    .boxed()
                    .collect(Collectors.toList());
        }

        return collect;
    }

}
