package a3d.array;


public class CloneArray {
    public static void main(String[] args) {
        // Creating an array of integers
        int[] originalArray = {1, 2, 3, 4, 5};

        // Cloning the array
        int[] clonedArray = originalArray.clone();

        // Printing the original and cloned arrays
        System.out.println("Original array: ");
        for (int i : originalArray) {
            System.out.print(i + " ");
        }

        System.out.println("\nCloned array: ");
        for (int i : clonedArray) {
            System.out.print(i + " ");
        }

        // Modifying the original array
        originalArray[0] = 10;

        // Printing the modified original array and the cloned array to show they are different
        System.out.println("\n\nAfter modifying the original array:");
        System.out.println("Original array: ");
        for (int i : originalArray) {
            System.out.print(i + " ");
        }

        System.out.println("\nCloned array: ");
        for (int i : clonedArray) {
            System.out.print(i + " ");
        }
    }
}
