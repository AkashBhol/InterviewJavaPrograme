package dsa;

import java.util.Arrays;

public class MaxAndMinArray {
    public static void main(String[] args) {
        int arr[] = {123, 4, 8, 0, 33, 99, 11};
        Arrays.sort(arr);
        System.out.println("Max value : " + arr[arr.length - 1] + " Min value : " + arr[0]);
    }
}
