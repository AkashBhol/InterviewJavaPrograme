package java8.fun_interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 5, 3, 9, 3, 10);
        Collections.sort(list);
        Collections.sort(list, Comparator.naturalOrder());
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());
    }

}
