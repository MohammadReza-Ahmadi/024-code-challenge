package _0_024_exercises.hackerrank;

public class MinNumberOperationsToConvertAStringToPalindrome {

    public static int theLoveLetterMystery(String s) {
        int start = 0;
        int end = s.length() - 1;
        int minConvertCount = 0;
        while (start < end) {
            minConvertCount += Math.abs(s.charAt(start++) - s.charAt(end--));
        }

        return minConvertCount;
    }
}
