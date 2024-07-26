package a3d._ai;

import java.util.*;


public class EvenSortStream {
    public static void main(String[] args) {
        List<Integer> integers = (Arrays.asList(1, 5, 23, 52, 66, 33, 42, 9));
        // even Sorted List
        List<Integer> evenSortedList = integers.stream().filter(r -> r % 2 == 0).sorted().toList();
        System.out.println(evenSortedList);
        //total sum of array
        int totalSum = integers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(totalSum);
        //sort string by length
        List<String> strings = Arrays.asList("abc", "dfgfd", "we", "jhghjklk", "hgfdfghj");
        List<String> list = strings.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println(list);

    }
}

class SortEven {
    public static void main(String[] args) {
        List<Integer> integers = (Arrays.asList(1, 5, 23, 52, 66, 33, 42, 9));
        int arr[] = {1, 5, 23, 52, 66, 33, 42, 9};
        int[] s = Arrays.stream(arr).boxed().filter(e -> e % 2 == 0).mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(s));
        int[] i = integers.stream().filter(e -> e % 2 == 0).mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(i));
        List<Integer> integers1 = integers.stream().filter(e -> e % 2 == 1).toList();
        System.out.println(integers1);
    }
}
