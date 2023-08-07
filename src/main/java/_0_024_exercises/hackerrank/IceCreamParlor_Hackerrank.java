package _0_024_exercises.hackerrank;

import utils.MyUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

//todo: Problem link: https://www.hackerrank.com/challenges/icecream-parlor/problem?isFullScreen=true
//todo: youtube solution link: https://www.youtube.com/watch?v=cFpKQsoTsew
//todo: solution based on Python: https://codecurse.medium.com/ice-cream-parlor-hackerrank-problem-3ac574c440b5
public class IceCreamParlor_Hackerrank {

    //todo: My 3rd solution using Map 100% correct
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        Integer firstIndex;
        int second;
        for (int i = 0; i < arr.size(); i++) {
            firstIndex = indexMap.get(m - arr.get(i));
            if (firstIndex != null) {
                firstIndex = firstIndex + 1;
                second = i + 1;
                return List.of(firstIndex, second);
            } else {
                indexMap.put(arr.get(i), i);
            }
        }

        return List.of();
    }


//    ================ OLD solutions =======================================
    public static List<Integer> icecreamParlor_3(int m, List<Integer> arr) {

        int[][] dp = new int[arr.size() + 1][m + 1];
        //fill first item of each row with Zero
//        for (int i=0; i <= arr.size(); i++){
//            dp[i][0]=1;
//        }

        //fill DP
        for (int r = 1; r <= arr.size(); r++) {
            for (int c = 1; c <= m; c++) {
                int currTotalAmount = c;
                int currFlavorPrice = arr.get(r - 1);
                if (currFlavorPrice == currTotalAmount) {
                    dp[r][c] = 1;
                } else if (currFlavorPrice > currTotalAmount) {
                    dp[r][c] = dp[r - 1][c];
                } else {
                    int remAmount = currTotalAmount - currFlavorPrice;
                    dp[r][c] = dp[r - 1][remAmount];
                }
            }
        }

        // check if there is no sublist return empty result
//        if (dp[arr.size()][m] == 0) {
//            return List.of();
//        }

        MyUtils.printDP(dp, arr.stream().mapToInt(i -> i).toArray());
        int secondIndex;
        int firstIndex;
        for (int i = arr.size() - 1; i >= 0; i--) {
            secondIndex = i + 1;
            if (arr.get(i) < m && dp[secondIndex][m] == 1) {
                int remAmount = m - arr.get(i);
                firstIndex = remAmount;
                if (dp[secondIndex][firstIndex] == 1) {
                    int prvRowIndex = firstIndex;
                    while (prvRowIndex > 0 && dp[prvRowIndex - 1][firstIndex] == 1) {
                        --prvRowIndex;
                    }
                    return List.of(prvRowIndex, secondIndex);
                }
            }
        }

        return List.of();
    }

    //todo: My 2nd solution using map of flavors indexes, not completed yet
    public static List<Integer> icecreamParlor_2(int m, List<Integer> arr) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        //make an index map of choose-able flavors (those have less price that our amount: m)
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < m) {
                indexMap.putIfAbsent(arr.get(i), i + 1);
            }
        }

        for (Integer i : indexMap.keySet()) {
            int firstFlavorIndex = i;
            Integer secondFlavorIndex = indexMap.get(m - firstFlavorIndex);
            if (secondFlavorIndex != null) {
                return List.of(indexMap.get(firstFlavorIndex), secondFlavorIndex);
            }
        }

        return List.of();
    }


    //todo: My own 1st solution using check the rest of array but not correct for every cases
    public static List<Integer> icecreamParlor_1(int m, List<Integer> arr) {
        //find first flavor index if exists
        int firstFlavorIndex = IntStream.range(0, arr.size())
                .filter(i -> arr.get(i) < m)
                .findFirst().orElse(-1);

        //find second flavor index if exists
        int secondFlavorIndex = IntStream.range(firstFlavorIndex + 1, arr.size())
                .filter(i -> arr.get(i) == m - arr.get(firstFlavorIndex))
                .findFirst().orElse(-1);

        return List.of(firstFlavorIndex + 1, secondFlavorIndex + 1);
    }
}
