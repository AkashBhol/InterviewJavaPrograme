package a3d.stream;

import java.util.*;
import java.util.stream.Collectors;

public class IntegerStream {
    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4};
        int array2[] = {1, 2, 3, 4};
        int array3[] = {1, 2, 3, 4};

        List<Integer> integers = Arrays.stream(array1).boxed().toList();
        List<Integer> integers1 = Arrays.stream(array2).boxed().toList();
        List<Integer> integers2 = Arrays.stream(array3).boxed().toList();

        //flattening in a single list
        List<List<Integer>> list1 = new ArrayList<>(Arrays.asList(integers, integers1, integers2));
        System.out.println("lists of list" + list1);
        List<Integer> integers3 = list1.stream().flatMap(List::stream).toList();
        System.out.println(integers3);

        //flat in a list of integers
        List<Integer> list = Arrays.stream(array1).mapToObj(e -> (int) e).collect(Collectors.toList());
        System.out.println(Arrays.stream(array1).boxed().toList());
        System.out.println(list);

        //max of an array from Integer
        Optional<Integer> maxInteger = list.stream().max(Comparator.comparingInt(Integer::intValue));
        System.out.println(maxInteger);

        //max of an array from Integer
        OptionalInt maxInt = list.stream().mapToInt(Integer::intValue).max();
        System.out.println(maxInt);

    }
}

class IntegerStreamCopy {
    public static void main(String[] args) {
        // how to add int [] into list
        int[] arr = {1, 3, 4, 5, 6};
        List<Integer> integers = Arrays.stream(arr).boxed().toList();
        System.out.println(integers);

    }
}