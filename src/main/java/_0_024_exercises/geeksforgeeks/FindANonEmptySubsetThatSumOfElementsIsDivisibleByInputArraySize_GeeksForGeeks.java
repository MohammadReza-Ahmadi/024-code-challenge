package _0_024_exercises.geeksforgeeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindANonEmptySubsetThatSumOfElementsIsDivisibleByInputArraySize_GeeksForGeeks {

    //todo: my solution 1-based indexing
    // note that the method returns a 1-based indexing means it is a list of indexes of subarray that start from 1 (not zero), means first index, second index and so on ...
    public static int[] findNonEmptySubset(int arr[], int N) {
        // Hash Map to store the
        // indices of residue upon
        // taking modulo N of prefixSum
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        List<Integer> retSubset = new ArrayList<>();

        int prefixSumResidue = 0;
        for (int i = 0; i < N; i++) {
            // Calculating the
            // residue of prefixSum
            prefixSumResidue = (prefixSumResidue + arr[i]) % N;

            // If the pre[i]%n==0
            if (prefixSumResidue == 0) {
                // print size
//                System.out.print(i + 1 + "\n");

                // Print the first i indices
                for (int j = 0; j <= i; j++) {
//                    System.out.print(j + 1 + " ");
//                    System.out.print(arr[j + 1] + ", ");
                    retSubset.add(j + 1);
                }

//                System.out.println();
                return retSubset.stream().mapToInt(n -> n).toArray();
            }

            // If this sum was seen
            // earlier, then the
            // contiguous subsegment
            // has been found
            if (mp.containsKey(prefixSumResidue) == true) {
                // Print the size of subset
//                System.out.println((i - mp.get(prefixSumResidue)));


                // contiguous subset
                for (int j = mp.get(prefixSumResidue) + 1; j <= i; j++) {
                    // Print the indices of
//                    System.out.print(j + 1 + " ");

                    // Print the elements of
//                    System.out.print(arr[j + 1] + ", ");
                    retSubset.add(j + 1);
                }

//                System.out.println();
                return retSubset.stream().mapToInt(n -> n).toArray();
            } else
                mp.put(prefixSumResidue, i);
        }

        return new int[0];
    }


    //todo: original solution copied from GeeksForGeeks,
    // original solution link: https://www.geeksforgeeks.org/find-a-non-empty-subset-in-an-array-of-n-integers-such-that-sum-of-elements-of-subset-is-divisible-by-n/
    public static void findNonEmptySubset_ORG(int arr[], int N) {
        System.out.println("-------N=" + N + "-------");

        // Hash Map to store the
        // indices of residue upon
        // taking modulo N of prefixSum
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();

        int prefixSumResidue = 0;
        for (int i = 0; i < N; i++) {
            // Calculating the
            // residue of prefixSum
            prefixSumResidue = (prefixSumResidue + arr[i]) % N;

            // If the pre[i]%n==0
            if (prefixSumResidue == 0) {
                // print size
                System.out.print(i + 1 + "\n");

                // Print the first i indices
                for (int j = 0; j <= i; j++) {
//                    System.out.print(j + 1 + " ");
                    System.out.print(arr[j] + ", ");
                }

                System.out.println();
                return;
            }

            // If this sum was seen
            // earlier, then the
            // contiguous subsegment
            // has been found
            if (mp.containsKey(prefixSumResidue) == true) {
                // Print the size of subset
                System.out.println((i - mp.get(prefixSumResidue)));


                // contiguous subset
                for (int j = mp.get(prefixSumResidue) + 1; j <= i; j++) {
                    // Print the indices of
//                    System.out.print(j + 1 + " ");

                    // Print the elements of
                    System.out.print(arr[j] + ", ");
                }

                System.out.println();
                return;
            } else
                mp.put(prefixSumResidue, i);
        }

    }

    // Driver Code
    public static void main(String[] args) {
//        int arr[] = {2, 3, 7, 1, 9};
//        int N = arr.length;

        int arr[] = {3, 1, 9, 2, 3};
        int N = arr.length;

        findNonEmptySubset_ORG(arr, N);
    }
}
