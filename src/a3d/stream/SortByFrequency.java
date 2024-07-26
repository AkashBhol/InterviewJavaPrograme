package a3d.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortByFrequency {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("The quick brown fox jumps over the lazy dog.");
        list.add("fox sells thousand single the dog.");
        list.add("A A journey of of thousand miles sells a single fox.");

        //sort the words by their occurrence

        // Flatten the list into a stream of words
        Stream<String> wordsStream = list.stream()
                .flatMap(sentence -> Arrays.stream(sentence.toLowerCase()
                        .replaceAll("[^a-zA-Z ]", "").split("\\s+")));

        /*Map<String, Long> wordsStream = list.stream()
                .flatMap(sentence -> Arrays.stream(sentence.toLowerCase().split("\\s+")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));*/

        // Count the frequency of each word
        Map<String, Long> wordFrequency = wordsStream.collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Sort the words by their frequency
        List<Map.Entry<String, Long>> sortedByFrequency = wordFrequency.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()).toList();

        // Print the sorted words by frequency
        sortedByFrequency.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        Stream<String> stream = list.stream().flatMap(e -> Arrays.stream(e.split("\\s")));
        Map<String, Long> map = stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Map.Entry<String, Long>> sorted = map.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue()
                .reversed()).toList();
        sorted.forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}

