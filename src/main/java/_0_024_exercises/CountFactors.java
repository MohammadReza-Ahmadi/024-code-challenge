package _0_024_exercises;

public class CountFactors {

    // N=24
    // factors: 1,2,3,4,6,8,12,24
    public static int solution(int N) {

        // solution-1, correctness=100%, performance=83%, in big range number got timeout error
//        int i = 1;
//        int factorCount = 0;
//        while (i * i < N) {
//            if (N % i == 0) {
//                factorCount += 2;
//            }
//            i++;
//        }
//        if (i * i == N) {
//            factorCount += 1;
//        }
//        return factorCount;



        //solution-2, optimized solution, correctness=100%, performance=100%
        int factors = 0;
        int squareRootN = (int) Math.sqrt(N);
        if(Math.pow(squareRootN, 2) != N) {
            squareRootN++; //round up for any non-perfect squares
        }
        else { //perfect squares have an additional factor
            factors++;
        }

        for(int i=1; i<squareRootN; i++) {
            if(N % i == 0) {
                factors += 2;
            }
        }

        return factors;
    }
}
