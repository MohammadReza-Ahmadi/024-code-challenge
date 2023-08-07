package _0_024_exercises.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//todo: problem link Hackerrank: https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?isFullScreen=true
public class SherlockStringThatAllCharsAppearSameNumberOfTimes {

    //todo: my own solution passed all test in Hackerrank platform 100% correctness and performance
    public static String isValid(String s) {
        int[] charCodes = new int[26];
        s.chars().forEach(i -> charCodes[i - 'a']++);
        List<Integer> counts = Arrays.stream(charCodes)
                .filter(cnt -> cnt > 0)
                .boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        boolean hasEvenOccurrence = false;
        int hasSeenDiffCount = 0;
        for (int i = 0; i <= counts.size() - 1; i++) {
            if (!hasEvenOccurrence && counts.get(i) % 2 == 0) {
                hasEvenOccurrence = true;
            }

            if (i < counts.size() - 1 && counts.get(i) - counts.get(i + 1) >= 1) {
                hasSeenDiffCount++;
            }
        }

        for (int i = 0; i <= counts.size() - 3; i++) {
            if (hasSeenDiffCount > 1) {
                return "NO";
            }

            if (counts.get(i) - counts.get(i + 1) > 1 ||
                    (counts.get(i + 1).compareTo(counts.get(i + 2)) == 0 &&
                            counts.get(i + 2) % 2 > 0 &&
                            hasEvenOccurrence)) {
                return "NO";
            }
        }
        return "YES";
    }

}
