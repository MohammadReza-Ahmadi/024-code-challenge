package _0_24_ing;

public class Q2 {

    // reverse numbers
    public static int rev(int N) {
//        int number = 987654,
//        int reverse = 0;
//        while (number != 0) {
//            int remainder = number % 10;
//            reverse = reverse * 10 + remainder;
//            number = number / 10;
//        }
//        System.out.println("The reverse of the given number is: " + reverse);
//        return reverse;

        //todo: my
        System.out.println("NUM="+N);
////        int reverse = 0;
//        while (N > 0) {
//
//            int enable_print = N % 10;
////            reverse = reverse * 10 + enable_print;
//            if (enable_print == 0 && N % 10 != 0) {
//                enable_print = 1;
//            }
////            else if (enable_print == 1) {
//            else if (enable_print > 0) {
//                System.out.print(N % 10);
////                System.out.print("ret=" + N % 10);
//            }
//
//            N = N / 10;
//        }
//        return N;

        //todo: org

        while (N > 0) {
            int enable_print = N % 10;
            if (enable_print == 0 && N % 10 != 0) {
                enable_print = 1;
            }
//            else if (enable_print == 1) {
            else {
                System.out.print(N % 10);
            }
            N = N / 10;
        }
        return N;
    }

    public void solution(int N) {

        while (N > 0) {
            int enable_print = N % 10;
            if (enable_print == 0 && N % 10 != 0) {
                enable_print = 1;
            }
            else if (enable_print == 1) {
                System.out.print(N % 10);
            }
            N = N / 10;
        }
    }

    //todo: org
    public void solution_org(int N) {
        int enable_print = N % 10;
        while (N > 0) {
            if (enable_print == 0 && N % 10 != 0) {
                enable_print = 1;
            }
            else if (enable_print == 1) {
                System.out.print(N % 10);
            }
            N = N / 10;
        }
    }


}
