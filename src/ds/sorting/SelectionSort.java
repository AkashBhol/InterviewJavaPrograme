package ds.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {64, 25, 11, 78, 10};
        sort(arr);
        print(arr);
    }

    // finding the smallest and pushing at the end !!!
    public static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void print(int[] arr) {
        for (int a : arr)
            System.out.println(a);
    }
}
