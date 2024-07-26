package a4d.array;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 4, 4, 7, 7, 8};
        int[] arr2 = new int[10];

        //copy to other

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));

        // frequency of each element

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i : arr2) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("number :: " + entry.getKey() + " occurrence :: " + entry.getValue());
        }
    }

}
