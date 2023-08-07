package _0_024_exercises.hackerrank;

public class LongestCommonSubsequence_LCS {

    public static int commonChild(String s1, String s2) {
        //create a dp array
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int r = 1; r <= s1.length(); r++) {
            for (int c = 1; c <= s1.length(); c++) {
                //if two chars of two str at the same position are equal?
                if (s1.charAt(r - 1) == s2.charAt(c - 1)){
                    //get value of above-row-left-col sell in dp plus 1
                    dp[r][c] = dp[r-1][c-1] + 1;

                } else {
                    // set max of same-row-left-col and above-row-same-col
                    dp[r][c] = Math.max(dp[r][c-1], dp[r-1][c]);
                }
            }

        }

        return dp[s1.length()][s2.length()];
    }
}
