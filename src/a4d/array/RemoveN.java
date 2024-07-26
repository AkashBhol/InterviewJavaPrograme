package a4d.array;

import java.util.*;

public class RemoveN {
    public static void main(String[] args) {
        int n = 2;
        int[] array = new int[7];
        array[0] = 1;
        array[1] = 2;
        array[2] = 2;
        array[3] = 11;
        array[4] = 23;
        array[5] = 18;
        System.out.println(array.toString());

        int[] arr = {82, 1, 2, 3, 2, 2, 34, 56, 77, 77};

        // remove all n occurrence in same array

        List<Integer> list = new LinkedList<>();
        for (int i : arr)
            if (i != 2)
                list.add(i);
        int[] ar = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(ar));

        // count occurrence of all

        Map<Integer, Integer> map = new LinkedHashMap<>();
        int count = 0;
        for (int a : arr)
            if (a == n)
                map.put(a, count++);
        System.out.println(count);
    }
}
