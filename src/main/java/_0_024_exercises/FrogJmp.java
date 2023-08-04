package _0_024_exercises;

public class FrogJmp {

    public static int solution(int X, int Y, int D) {
        if (X == Y ){
            return 0;
        }

        if ((Y - X) <= D) {
            return 1;
        }

        return (Y - X) % D == 0? (Y - X) / D: ((Y - X) / D) + 1;
    }
}
