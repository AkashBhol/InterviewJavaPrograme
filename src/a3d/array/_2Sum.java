package a3d.array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _2Sum {
    public static void main(String[] args) {
        //group by length
        List<String> words = Arrays.asList("apple", "banana", "kiwii", "pear");
        Map<Integer, List<String>> map = words.stream().collect(Collectors.groupingBy(String::length));
        for (Map.Entry<Integer, List<String>> map1 : map.entrySet()) {
            Integer number = map1.getKey();
            List<String> list = map1.getValue();
            System.out.println(list + " : " + number);
        }

    }
}

