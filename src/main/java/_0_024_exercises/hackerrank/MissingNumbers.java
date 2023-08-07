package _0_024_exercises.hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//todo: problem link: https://www.hackerrank.com/challenges/missing-numbers/problem?isFullScreen=true
public class MissingNumbers {

    //todo: my own solution based on java 8 stream features
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {

        HashMap<Integer, Long> brrMap = brr.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        HashMap::new,
                        Collectors.counting()));

        arr.forEach(i -> brrMap.put(i, brrMap.get(i) - 1));
        return brrMap.keySet().stream()
                .filter(k -> brrMap.get(k) > 0)
                .sorted()
                .collect(Collectors.toList());
    }
}
