package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyUtils {

    public static int[] convertIntegerListToArray(List<Integer> integerList) {
        return integerList.stream().mapToInt(i -> i).toArray();
    }

    public static List<Integer> convertSpaceSeparatedIntValuesStringToIntArray(String intValuesString) {
        return Arrays.stream(intValuesString.split(" "))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
    }

    // a implementation of counting sort algorithm for char array input
    // this method sort input array and change order into input array
    public static void countingSortCharArray(char arr[]) {
        int n = arr.length;

        // The output character array that will have sorted arr
        char output[] = new char[n];

        // Create a count array to store count of inidividul
        // characters and initialize count array as 0
        int count[] = new int[256];
        for (int i = 0; i < 256; ++i)
            count[i] = 0;

        // store count of each character
        for (int i = 0; i < n; ++i)
            ++count[arr[i]];

        // Change count[i] so that count[i] now contains actual
        // position of this character in output array
        for (int i = 1; i <= 255; ++i)
            count[i] += count[i - 1];

        // Build the output character array
        // To make it stable we are operating in reverse order.
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }

        // Copy the output array to arr, so that arr now
        // contains sorted characters
        for (int i = 0; i < n; ++i)
            arr[i] = output[i];
    }

    // a implementation of counting sort algorithm for int array input
    // this method sort input array and change order into input array
    public static void countingSortIntArray(int arr[], int maxValue) {
        int n = arr.length;

        // The output character array that will have sorted arr
        int output[] = new int[n];

        // Create a count array to store count of inidividul
        // characters and initialize count array as 0
        int count[] = new int[maxValue + 1];
        for (int i = 0; i < maxValue; ++i)
            count[i] = 0;

        // store count of each character
        for (int i = 0; i < n; ++i)
            ++count[arr[i]];

        // Change count[i] so that count[i] now contains actual
        // position of this character in output array
        for (int i = 1; i <= maxValue; ++i)
            count[i] += count[i - 1];

        // Build the output character array
        // To make it stable we are operating in reverse order.
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }

        // Copy the output array to arr, so that arr now
        // contains sorted characters
        for (int i = 0; i < n; ++i)
            arr[i] = output[i];
    }


    // read number that separated by a single space in a file
    public static String readNumberSpaceSeparatedFileFromResource(String fullFileName) {
        ClassLoader classLoader = MyUtils.class.getClassLoader();
        File file = new File(classLoader.getResource(fullFileName).getFile());
        //Read File Content
        String content = null;
        try {
            content = new String(Files.readAllBytes(file.toPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static void printArray(String msg, int[] A) {
        System.out.print("\n" + msg + ": ");
        Arrays.stream(A).forEach((a) -> System.out.print(a + ", "));
    }

    public static void printArrayPerLine(int[] a) {
        Arrays.stream(a).forEach(System.out::println);
    }

    public static void printDP(int[][] dp, int[] arr) {
        for (int i = 0; i <= dp.length; i++) {

            if (i == 0) {
                System.out.print("   ");
            }

            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0) {
                    System.out.print(j + "  ");

                } else if (i == 1) {
                    if (j == 0) {
                        System.out.print("0: " + dp[i - 1][j] + ", ");
                    } else {
                        System.out.print(dp[i - 1][j] + ", ");
                    }

                } else if (i > 1) {
                    if (j == 0) {
                        System.out.print(arr[i - 2] + ": " + dp[i - 1][j] + ", ");
                    } else {
                        System.out.print(dp[i - 1][j] + ", ");
                    }
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] dp = new int[4][6];
        int[] arr = {500,600,700};

        //fill first cols
        for (int i=0; i < dp.length; i++){
            dp[i][0] = i+1 + 100;
        }

        //fill first rows
        for (int i=0; i < dp[0].length; i++){
            dp[0][i] = i+1 + 200;
        }

        printDP(dp, arr);

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {

            }
        }
    }

    public static int[] getIntArray(String spaceSeperatedValue){
       return Arrays.stream(spaceSeperatedValue.split(" "))
                .mapToInt(Integer::valueOf)
                .toArray();
    }

    public static String getCommaSeperatedValues(String spaceSeperatedValue){
        String ret = spaceSeperatedValue.replaceAll(" ", ", ");
        System.out.println(ret);
        return ret;
    }
}
