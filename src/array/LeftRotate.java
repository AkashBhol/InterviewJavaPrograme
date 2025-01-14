package array;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int k = 5;
        //left rotate by n = 5
        leftRotate(arr, k);
    }

    private static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + k) % n];
        }
        System.out.println(Arrays.toString(temp));
    }
}
