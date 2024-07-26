package a3d.stream;

//Given a list of sentences, write a stream pipeline to count
// the frequency of each word in all sentences combined.

import java.util.*;
import java.util.stream.Collectors;

public class CountFrequency {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
                Arrays.asList("This is a test",
                        "Java streams are powerful",
                        "This test is about Java streams")
        );
        Map<String, Integer> map = list.stream().flatMap(e -> Arrays.stream(e.split("\\s"))).
                collect(Collectors.toMap(
                        k -> k,
                        v -> 1,
                        Integer::sum,
                        LinkedHashMap::new
                ));
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}

class CountFrequency2 {
    public static void main(String[] args) {
        String s = "Ravi";
        Map<Character, Integer> map = s.chars().
                mapToObj(c -> (char) c).collect(Collectors.toMap(
                        k -> k,
                        v -> 1,
                        Integer::sum,
                        LinkedHashMap::new

                ));
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}