package _0_024_exercises;


import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

//529 has binary representation 1000010001 and contains two binary gaps: one of length 4
public class BinaryGap {

    public static int solution(int N) {
//        return solutionSimple(N);

        return solutionInJava8_1(N);
    }

    private static int solutionInJava8_1(int N) {
        var cnx = new Object() {
            int gabLen = 0;
            int maxLen = 0;
        };

        Integer.toBinaryString(N).chars()
                .forEach(System.out::println);

        Integer.toBinaryString(N)
                .chars()
                .forEach(
                        c -> {
                            if ((char) c == '1') {
                                cnx.maxLen = Math.max(cnx.gabLen, cnx.maxLen);
                                cnx.gabLen = 0;
                            } else {
                                ++cnx.gabLen;
                            }
                        }
                );

        return cnx.maxLen;
    }

    private static int solutionInJava8_2(int N) {
        Map<IntPredicate, Consumer<CalcContext>> rules = new HashMap<>();
        IntPredicate p0 = c -> c == '0';
        IntPredicate p1 = c -> c == '1';
        Consumer<CalcContext> c0 = cnx -> {
            cnx.setMaxLen(Math.max(cnx.getGabLen(), cnx.getMaxLen()));
            cnx.setGabLen(0);
        };

        Consumer<CalcContext> c1 = CalcContext::incrementGabLen;
        rules.put(p0, c0);
        rules.put(p1, c1);

//        Integer.toBinaryString(N)
//                .chars()
//                .
        return 0;
    }

    private static int solutionSimple(int N) {
        int gabLen = 0;
        int maxLen = 0;
        for (char c : Integer.toBinaryString(N).toCharArray()) {
            if (c == '1') {
                maxLen = Math.max(gabLen, maxLen);
                gabLen = 0;
            } else {
                ++gabLen;
            }
        }
        return maxLen;
    }

    class CalcContext {
        private int gabLen = 0;
        private int maxLen = 0;

        public void incrementGabLen() {
            ++gabLen;
        }

        public int getGabLen() {
            return gabLen;
        }

        public void setGabLen(int gabLen) {
            this.gabLen = gabLen;
        }

        public int getMaxLen() {
            return maxLen;
        }

        public void setMaxLen(int maxLen) {
            this.maxLen = maxLen;
        }
    }

}
