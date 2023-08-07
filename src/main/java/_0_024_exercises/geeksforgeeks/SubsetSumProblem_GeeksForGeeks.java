package _0_024_exercises.geeksforgeeks;

//todo: problem: https://practice.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1
//todo: solution: https://www.geeksforgeeks.org/subset-sum-problem-dp-25/

import java.util.stream.IntStream;

public class SubsetSumProblem_GeeksForGeeks {

    //todo: my own solution
    public static Boolean isSubsetSum(int N, int arr[], int sum) {

        int[][] dp = new int[N + 1][sum + 1];

        //fill first item of each row with Zero
        for (int i=0; i <= N; i++){
            dp[i][0]=1;
        }

        for (int r = 1; r <= N; r++) {
            for (int c = 1; c <= sum; c++) {
                int currNum = arr[r - 1];
                int currSum = c;
                if (dp[r - 1][c] == 1) {
                    dp[r][c] = 1;
                } else if (currNum > currSum) {
                    dp[r][c] = 0;
                } else {
                    int remainOfSum = currSum - currNum;
                    int remainOfSumInAboveRow = dp[r - 1][remainOfSum];
                    dp[r][c] = remainOfSumInAboveRow;
                }
            }
        }

        return dp[N][sum] == 1;
    }

    static Boolean isSubsetSum_with_IntStream(int N, int arr[], int sum) {

        int[][] dp = new int[N + 1][sum + 1];

        //fill first item of each row with Zero
        IntStream.range(0, N + 1)
                .forEach(i -> dp[i][0] = 1);

        //fill first item of each column with Zero
        IntStream.range(1, sum + 1)
                .forEach(i -> dp[0][i] = 0);

        for (int r = 1; r <= N; r++) {
            for (int c = 1; c <= sum; c++) {
                int currNum = arr[r - 1];
                int currSum = r;
                if (dp[r - 1][c] == 1) {
                    dp[r][c] = 1;
                } else if (currNum > currSum) {
                    dp[r][c] = 0;
                } else {
                    int remainOfSum = currSum - currNum;
                    int remainOfSumInAboveRow = dp[r - 1][remainOfSum];
                    dp[r][c] = remainOfSumInAboveRow;
                }
            }
        }

        return dp[N][sum] == 1;
    }

}
