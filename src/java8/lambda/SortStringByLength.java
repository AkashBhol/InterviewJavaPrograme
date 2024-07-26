package java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringByLength {
    public static void main(String[] args) {
        String[] arr = {"ram", "mohan", "krishna", "yaduvansi", "bihar", "gowahatipur"};
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.sort(Comparator.comparingInt(String::length));
        list.forEach(System.out::println);
    }
}
