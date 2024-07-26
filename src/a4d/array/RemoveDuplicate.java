package a4d.array;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] i = {1, 1, 2, 2, 3, 3, 4, 2, 4, 1, 32, 4, 4, 22, 22, 22, 44};
        Set<Integer> set = new LinkedHashSet<>();
        for (int a : i) {
            set.add(a);
        }
        System.out.println(Arrays.toString(set.stream().mapToInt(Integer::intValue).toArray()));
    }
}

class RemoveOneNum {
    public static void main(String[] args) {
        int[] i = {1, 1, 2, 2, 3, 3, 4, 2, 4, 1, 32, 4, 4, 22, 22, 22, 44};
        List<Integer> list = new LinkedList<>();
        for (int a : i) {
            if (a != 22)
                list.add(a);
        }
        //remove 22
        System.out.println(Arrays.toString(list.stream().mapToInt(Integer::intValue).toArray()));
    }
}
 class RemoveDuplicateInArrayExample{
    public static int removeDuplicateElements(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        System.out.println(Arrays.toString(temp));
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        // Changing original array
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main (String[] args) {
        int arr[] = {10,20,20,30,30,40,50,50};
        int length = arr.length;
        length = removeDuplicateElements(arr, length);
        //printing array elements
        for (int i=0; i<length; i++)
            System.out.print(arr[i]+" ");
    }
}