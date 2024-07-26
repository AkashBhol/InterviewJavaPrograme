package dsa;

import java.util.ArrayList;

public class PeakElement {

    static int[] arr = {10, 20, 15, 2, 23, 90, 67};

    //find index of element which is greater than its neighbour

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
                list.add(i);
        }
        System.out.println("peak indices are :: " + list);
    }

}
