package dsa;

import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        System.out.println(largest(arr, 3));
    }

    static int largest(int[] a, int k) {
        Arrays.sort(a);
        return a[a.length - k];
    }
}
