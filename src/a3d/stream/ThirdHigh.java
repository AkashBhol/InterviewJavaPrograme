package a3d.stream;

import java.util.*;
import java.util.stream.Collectors;

public class ThirdHigh {
    public static void main(String[] args) {
        int arr[] = {45, 23, 53, 62, 53, 11};
        OptionalInt num = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .skip(2)
                .findFirst();
        System.out.println(num);
    }
}

class ThirdHigh1 {
    public static void main(String[] args) {
        int arr[] = {45, 23, 53, 62, 53, 11};
        OptionalInt num = Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> b - a)
                .mapToInt(Integer::intValue)
                .skip(2)
                .findFirst();
        System.out.println(num);
    }
}

class ThirdHigh2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(34, 22, 56, 34, 86, 63));
        Optional<Integer> num = list.stream().sorted(Comparator.reverseOrder())
                .skip(2).findFirst();
        System.out.println(num);
    }
}
//        int arr[] = {45, 23, 53, 62, 53, 11}; 3rd high

class _3rdHigh {
    public static void main(String[] args) {
        int arr[] = {45, 23, 53, 62, 53, 11};
        OptionalInt anInt = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .skip(2)
                .findFirst();
        System.out.println(anInt);
    }
}