package _0_024_exercises;

public class MaxProfit {

    //A = {1, 3, 4, 7} , scenario-1
    // == buy date ===== buy price >>>>>>>>>  sel date ==== sel price ======= profit ===
    //    day 1  --------- 1  >>>>>>>>>>>>>>>>>> 1 ------------ 1 ----------- 1-1=0 ====
    //    day 1  --------- 1  >>>>>>>>>>>>>>>>>> 2 ------------ 3 ----------- 3-1=2 ====
    //    day 1  --------- 1  >>>>>>>>>>>>>>>>>> 3 ------------ 4 ----------- 4-1=3 ====
    //    day 1  --------- 1  >>>>>>>>>>>>>>>>>> 4 ------------ 7 ----------- 7-1=6 ====

    //A = {4, 2, 4, 7, 9} , scenario-2
    // == buy date ===== buy price >>>>>>>>>  sel date ==== sel price ======= profit ===
    //    day 1  --------- 1  >>>>>>>>>>>>>>>>>> 1 ------------ 1 ----------- 1-1=0 ====
    //    day 1  --------- 1  >>>>>>>>>>>>>>>>>> 2 ------------ 3 ----------- 3-1=2 ====
    //    day 1  --------- 1  >>>>>>>>>>>>>>>>>> 3 ------------ 4 ----------- 4-1=3 ====
    //    day 1  --------- 1  >>>>>>>>>>>>>>>>>> 4 ------------ 7 ----------- 7-1=6 ====

    public static int solution(int[] A) {
        int maxProfit = 0;
        int minShareSlice = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            minShareSlice = Math.min(minShareSlice, A[i]);
            maxProfit = Math.max(maxProfit, A[i] - minShareSlice);
        }

        return maxProfit;
    }


    //todo: solution-1, correctness=100% , performance=25%
//    public static int solution_1(int[] A) {
//        int maxProfit = Integer.MIN_VALUE;
//        int buyDate = 0;
//        for (int i = 0; i < A.length; i++) {
//            for (int j = i + 1; j < A.length && j <= i + 2; j++) {
//                maxProfit = Math.max(maxProfit, A[j] - A[buyDate]);
//            }
//            if (i < A.length -2 && A[i+2] - A[i+1] > maxProfit){
//                maxProfit = A[i+2] - A[i+1];
//                buyDate = i +1;
//            }
//        }
////        System.out.println("buy day= "+ (buyDate+1));
//        return Math.max(maxProfit, 0);
//    }



    //todo: solution-2, not finished yet and does not work
    //    public static int solution(int[] A) {
////        int maxProfit = Integer.MIN_VALUE;
//        int maxProfit = 0;
//        int buyDate = 0;
//        for (int i = 1; i < A.length; i++) {
//            maxProfit = Math.max(maxProfit, A[i] - A[buyDate]);
//            if (A[i] - A[buyDate + 1] > maxProfit){
//                ++buyDate;
//            }
//
//        }
//        System.out.println("buy day= "+ (buyDate+1));
//        return Math.max(maxProfit, 0);
//    }
}
