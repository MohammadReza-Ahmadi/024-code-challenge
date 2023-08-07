package _0_024_exercises.hackerrank;

import java.util.*;
import java.util.stream.Collectors;


public class BookingQ3 {


    public static List<Integer> awardTopKHotels(String positiveKeywords, String negativeKeywords, List<Integer> hotelIds, List<String> reviews, int k) {

        Map<String, Integer> positiveMap = new HashMap<>();
        Map<String, Integer> negativeMap = new HashMap<>();

        //create pos map
        String[] pos = positiveKeywords
                .replaceAll("\\.", " ")
                .replaceAll(";", " ")
                .toLowerCase()
                .split(" ");

        for (int i = 0; i < pos.length; i++) {
            positiveMap.putIfAbsent(pos[i], 3);
        }

        //create neg map
        String[] negs = negativeKeywords
                .replaceAll("\\.", " ")
                .replaceAll(";", " ")
                .toLowerCase()
                .split(" ");

        for (int i = 0; i < negs.length; i++) {
            negativeMap.putIfAbsent(negs[i], -1);
        }

        //initiate hotel map with hotel ids
        Map<Integer, Integer> hotelMap = new HashMap<>();
        for (int i = 0; i < hotelIds.size(); i++) {
            hotelMap.putIfAbsent(i, hotelIds.get(i));
        }

        //map of hotel rateMap based on hotel id and its rate
        Map<Integer, Integer> hotelRateMap = new TreeMap<>();

        boolean hasDifferentRates = false;
        boolean initPrvRate = false;
        int prvRate = 0;

        for (int i = 0; i < reviews.size(); i++) {

            //create neg map
            String[] revs = reviews.get(i)
                    .replaceAll("\\.", " ")
                    .replaceAll(";", " ")
                    .toLowerCase()
                    .split(" ");

            for (String r : revs) {
                Map<String, Integer> usedFeedback = new HashMap<>();

                hotelRateMap.put(hotelMap.get(i),
                        hotelRateMap.getOrDefault(hotelMap.get(i), 0)
                                + positiveMap.getOrDefault(r, 0)
                                + negativeMap.getOrDefault(r, 0));
            }

            //check and initiate prvRate
            int rate = hotelRateMap.getOrDefault(hotelMap.get(i), 0);
            if (!initPrvRate) {
                prvRate = rate;
                initPrvRate = true;
            }

            //check if hotels have different rates
            if (!hasDifferentRates) {
                hasDifferentRates = prvRate != rate;
            }
        }

        if (hasDifferentRates) {
            return hotelRateMap.entrySet().stream()
                    .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                    .limit(k)
                    .mapToInt(Map.Entry::getKey)
                    .boxed()
                    .collect(Collectors.toList());
        } else {
            return hotelRateMap.entrySet().stream()
                    .sorted(Comparator.comparing(Map.Entry::getKey))
                    .limit(k)
                    .mapToInt(Map.Entry::getKey)
                    .boxed()
                    .collect(Collectors.toList());
        }
    }
}
