package a4d.array;

import java.util.*;

public class PrintDuplicates {
    public static void main(String[] args) {
        int[] num = {2, 2, 2, 3, 3, 3, 4, 5, 6, 7, 8, 9, 0};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : num) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else map.put(i, 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1)
                System.out.println(entry.getKey() + " is duplicate");
        }
        Set<Integer> set = new LinkedHashSet<>();

        for (int i : num) {
            set.add(i);
        }
        System.out.println(Arrays.toString(set.stream().mapToInt(Integer::intValue).toArray()));
    }
}
