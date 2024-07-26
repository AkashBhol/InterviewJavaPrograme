package a3d._ai;

import java.util.*;

public class ArrayStream {
    public static void main(String[] args) {
        int[] array = {56, 43, 6543, 645, 33643, 67463, 6633, 567452, 653, 656, 462, 66445, 35643, 667576, 57546};
        //sum of an array
        int sum = Arrays.stream(array).sum();
        System.out.println(sum);
        //max of an array
        OptionalInt max = Arrays.stream(array).skip(5).max();
        System.out.println(max);
        //target 35686 return two indices
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int target = 35686;
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(target - array[i])) {
                System.out.println("indices are : " + map.get(target - array[i]) + " and " + i);
            } else map.put(array[i], i);
        }
    }
}

class TargetSum {
    public static void main(String[] args) {
        int[] array = {56, 43, 6543, 645, 33643, 67463, 6633, 567452, 653, 656, 462, 66445, 35643, 667576, 57546};
        targetSum(array, 35686);
        sumArray(array);
        thirdHigh(array);
    }

    private static void thirdHigh(int[] array) {
        System.out.println(Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst());
    }

    private static void sumArray(int[] array) {
        int sum = Arrays.stream(array).sum();
        System.out.println("sum of the array : " + sum);
        OptionalInt max = Arrays.stream(array).max();
        System.out.println(max);
    }

    private static void targetSum(int[] array, int k) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
            int target = k - array[i];
            if (map.containsKey(target)) {
                System.out.println("both indices are : " + map.get(target) + " , " + i);
            } else map.put(array[i], i);
        }
    }
}