package a3d.array;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 22, 4, 6, 73, 2, 34, 4}; // add 2num to get a target
        int target = 35;
        getTarget(arr, target);
    }

    private static void getTarget(int[] arr, int target) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int searching = target - arr[i];
            if (map.containsKey(searching)) {
                System.out.println("required index are : " + map.get(searching) + " and " + i);
                System.out.println("values are : " + searching + " and " + arr[i]);
                return;
            } else map.put(arr[i], i);
        }
    }

}

/*
Return the indices of the two numbers as an integer array answer of size 2.
Target 9 index starts from 1
output [1,2]
 */
class T {
    public static void main(String[] args) {
        int arr[] = {2, 7, 5, 8, 6, 3};
        getTarget(arr, 9);
    }

    private static void getTarget(int[] arr, int i) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int newArray[] = new int[2];
        for (int n = 1; n <= arr.length; n++) {
            int search = i - arr[n - 1];
            if (map.containsKey(search)) {
                newArray[0] = map.get(search);
                newArray[1] = n;
                System.out.println(Arrays.toString(newArray));
                return;
            } else map.put(arr[n - 1], n);
        }
    }
}