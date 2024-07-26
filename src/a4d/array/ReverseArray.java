package a4d.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int j = 0;
        /*for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            j++;
        }
        System.out.println(Arrays.toString(arr));*/

        int[] arr1 = new int[arr.length];

        while (j != arr.length) {
            arr1[j] = arr[j];
            j++;
        }
        System.out.println("New array " + Arrays.toString(arr1));
    }
}
