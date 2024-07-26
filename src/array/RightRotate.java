package array;

import java.util.Arrays;

public class RightRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int k = 2;
        //right rotate by n = 5
        rightRotate(arr, k);
    }

    private static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(k + i) % n] = arr[i];
        }
        System.out.println(Arrays.toString(temp));
    }
}
