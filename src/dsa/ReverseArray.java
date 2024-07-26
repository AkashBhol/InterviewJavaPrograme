package dsa;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int reverse[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverse[i] = arr[arr.length - 1 - i];
        }
        System.out.println("Reverse array is : ");
        for (int i : reverse)
            System.out.print(i + " ");
    }
}
