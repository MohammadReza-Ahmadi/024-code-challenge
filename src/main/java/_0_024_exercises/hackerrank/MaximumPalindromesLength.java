package _0_024_exercises.hackerrank;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MaximumPalindromesLength {

    private static String str;

    private static int[] alphabeticalCodes;

    public static void initialize(String s) {
        str = s;

//        alphabeticalCodes = new int[26];
////        String s = str.substring(l-1, r-1);
//        s.chars().forEach(c -> alphabeticalCodes[c - 'a'] += 1);
    }

    /*
     * Complete the 'answerQuery' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER l
     *  2. INTEGER r
     */

    public static int answerQuery(int l, int r) {
        int[] alphabeticalCodes = new int[26];
        String s = str.substring(l - 1, r);
        s.chars().forEach(c -> alphabeticalCodes[c - 'a'] += 1);

        return Arrays.stream(alphabeticalCodes)
                .filter(c -> c >= 2 && c % 2 == 0)
                .findFirst()
                .stream()
                .flatMap(i -> IntStream.of((i / 2) * (s.length() > i ? s.length() - i : 1)))
                .sum();
    }
}
