package a3d.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AlphaNumericCheck {
    public static void main(String[] args) {
        String s = "abc hrfh 1drfj fuefg 12deif";
        List<String> list = Arrays.stream(s.split("\\s"))
                .filter(e -> Character.isAlphabetic(e.charAt(0))).toList();
        list.forEach(System.out::println);
    }
}

class NumberCheck {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("it is 1day", "2day 3day 4day", "five six 7s", "abcdsfgh"));
        List<String> result = list.stream()
                .filter(sentence -> Arrays.stream(sentence.split("\\s+"))
                        .anyMatch(word -> Character.isDigit(word.charAt(0))))
                .collect(Collectors.toList());
        System.out.println(result);
        List<String> list1 = new ArrayList<>(Arrays.asList(
                "it is 1day",
                "2day 3day 4day",
                "five six 7s",
                "abc"
        ));

        // Collect all sentences into a single list (no filtering) without flatmap
        List<String> resulList1t = list1.stream().toList();

        // Collect all sentences using flat map
        List<String> result1 = list1.stream().flatMap(e -> Arrays.stream(new String[]{e})).toList();
        System.out.println(result1);

        //print words starts with number in a flat-list
        List<String> list2 = list1.stream().flatMap(e -> Arrays.stream(e.split("\\s")))
                .filter(e -> Character.isDigit(e.charAt(0))).collect(Collectors.toList());
        System.out.println(list2);

        // Print the result
        System.out.println(resulList1t);
    }
}

class AlphaNumCheck {
    public static void main(String[] args) {
        String s = "abc abc 1drfj fuefg 12deif";

        //filter words start with num
        List<String> list = Arrays.stream(s.split("\\s")).filter(e -> e.startsWith("1")).toList();
        System.out.println(list);

        //filter words start with alphabet
        List<String> list1 = Arrays.stream(s.split("\\s")).filter(e -> e.startsWith("b", 1))
                .toList();
        System.out.println(list1);

        //filter by occurrence
        Map<String, Long> map = Arrays.stream(s.split("\\s"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((a, b) -> System.out.println(a + " : " + b));

        //filter max occurred word
        String word = Arrays.stream(s.split("\\s")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).map(e -> e.getKey()).orElse(null);
        System.out.println(word);

    }
}