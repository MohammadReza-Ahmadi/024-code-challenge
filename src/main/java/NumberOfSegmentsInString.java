import java.util.Arrays;

/**
 * LeetCode
 * <p>
 * 434. Number of Segments in a String
 * Easy
 * 670
 * 1.2K
 * Companies
 * Given a string s, return the number of segments in the string.
 * <p>
 * A segment is defined to be a contiguous sequence of non-space characters.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "Hello, my name is John"
 * Output: 5
 * Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
 * Example 2:
 * <p>
 * Input: s = "Hello"
 * Output: 1
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 300
 * s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:".
 * The only space character in s is ' '.
 */

public class NumberOfSegmentsInString {

    public int countSegments(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        return (int) Arrays.stream(s.split(" ")).filter(str -> !str.trim().isEmpty()).count();
    }

    public int countSegments_NEW(String s) {
        if (s == null || s.trim().length() == 0) {
            return 0;
        }

        int i = 0;
        int c = 0;
        for (; i < s.length(); i++) {
            int j = skipSpaceChar(s, i);
            int k = skipNonSpaceChar(s, j);
            if (k > j || i > j) {
                c++;
                i = k - 1;
            }
        }
        return c;
    }

    int skipSpaceChar(String s, int i) {
        while (s.charAt(i) == ' ' && i < s.length() - 1) {
            i++;
        }
        return i;
    }

    int skipNonSpaceChar(String s, int i) {
        while (s.charAt(i) != ' ' && i < s.length() - 1) {
            i++;
        }
        return i;
    }

}
