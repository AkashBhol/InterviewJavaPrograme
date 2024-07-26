package a3d.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("one", 23));
        list.add(new Person("two", 33));
        list.add(new Person("three", 53));
        list.add(new Person("four", 30));
        List<String> list1 = list.stream().filter(e -> e.age > 30).map(e -> e.name).toList();
        System.out.println(list1);
    }
}

/*
Given a list of Person objects, filter out people who are older than 30, then collect their names into a list.
 */
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
/*
Given a list of words, group them by their starting letter and count the number of words in each group.
 */

/*
Given a list of integers, find the maximum and minimum values.
 */

class Stream1 {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 44, 5, 7, 5};
        Arrays.sort(a);
        System.out.println("max: " + a[a.length - 1] + " min: " + a[0]);
    }
}

/*
Given a list of lists of integers, flatten it into a single list.
 */
class Stream2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 4, 4, 3));
        List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 3, 4, 4, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 3, 4, 4, 3));
        List<List<Integer>> lists = new ArrayList<>(Arrays.asList(list, list1, list2));
        List<Integer> list3 = lists.stream().flatMap(List::stream).toList();
        System.out.println(list3);
    }
}