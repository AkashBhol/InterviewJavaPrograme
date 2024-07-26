package ds.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {8, 1, 7, 22, 77, 81};
        sort(arr);
        print(arr);
    }

    // swapping largest to the end
    public static void sort(int arr[]) {
        boolean swapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // no swapping means sorted array
        }
    }

    public static void print(int arr[]) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
