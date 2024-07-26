package a4d.array;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33};
        int j = 0, k = 0;
        System.out.println("Printing add :: ");
        while (j != arr.length) {
            if (arr[j] % 2 == 1)
                System.out.print(arr[j] + " ");
            j++;
        }
        System.out.println();
        System.out.println("Printing even :: ");
        while (k != arr.length) {
            if (arr[k] % 2 == 0)
                System.out.print(arr[k] + " ");
            k++;
        }
    }
}
