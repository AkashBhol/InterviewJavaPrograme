import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s = "it is raining and it is raining";
        Map<String, Integer> map = Arrays.stream(s.split(" "))
                .collect(Collectors.toMap(e -> e, v -> 1, Integer::sum, LinkedHashMap::new));
        String word = Arrays.stream(s.split(" "))
                .collect(Collectors.toMap(e -> e, v -> 1, Integer::sum, LinkedHashMap::new))
                .entrySet().stream().max(Map.Entry.comparingByValue()).toString();
        System.out.println(word);
    }
}