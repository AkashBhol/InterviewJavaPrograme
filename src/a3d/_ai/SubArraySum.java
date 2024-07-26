package a3d._ai;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SubArraySum {
    public static void main(String[] args) {
        int[] array = {3, 4, -7, 1, 3, 3, 1, -4, -2, -2};
        List<int[]> result = findZeroSumSubarrays(array);
        printResult(result);
    }

    public static List<int[]> findZeroSumSubarrays(int[] array) {
        // List to store the result
        List<int[]> result = new ArrayList<>();

        // Map to store the cumulative sum and corresponding indices
        Map<Integer, List<Integer>> sumMap = new HashMap<>();

        // Initialize sumMap with sum 0 at index -1
        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1);

        int cumulativeSum = 0;

        for (int i = 0; i < array.length; i++) {
            // Add the current element to the cumulative sum
            cumulativeSum += array[i];

            // Check if the cumulative sum has been seen before
            if (sumMap.containsKey(cumulativeSum)) {
                // Get the list of indices where this cumulative sum was seen
                List<Integer> indices = sumMap.get(cumulativeSum);
                for (int start : indices) {
                    // Add the sub array from start + 1 to i to the result
                    result.add(new int[]{start + 1, i});
                }
            }

            // Add the current index to the list of indices for this cumulative sum
            sumMap.computeIfAbsent(cumulativeSum, k -> new ArrayList<>()).add(i);
        }

        return result;
    }

    public static void printResult(List<int[]> result) {
        for (int[] subarray : result) {
            System.out.println("Sub array found from index " + subarray[0] + " to " + subarray[1]);
        }
    }
}
