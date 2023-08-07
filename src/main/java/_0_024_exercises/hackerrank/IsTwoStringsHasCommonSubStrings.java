package _0_024_exercises.hackerrank;

import java.util.concurrent.atomic.AtomicReference;

public class IsTwoStringsHasCommonSubStrings {

    public static String twoStrings(String s1, String s2) {
        int[] alphabeticalCodes = new int[26];

        //todo: it is useful for calculating character occurrence also
//        s1.chars().forEach(c -> alphabeticalCodes[c - 'a'] = alphabeticalCodes[c - 'a'] +1);

        s1.chars().forEach(c -> alphabeticalCodes[c - 'a'] = 1);
        boolean present = s2.chars()
                .filter(c -> alphabeticalCodes[c - 'a'] > 0)
                .findFirst()
                .isPresent();

        return present ? "YES" : "NO";
    }
}
