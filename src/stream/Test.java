package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Order {
    List<Item> items;

    public Order(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                '}';
    }
}


class Item {
    String name;
    int quantity;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public int getQuantity() {
        return quantity;
    }
}

/*
    flat list of items
 */
public class Test {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>(Arrays.asList(new Order(Arrays.asList(
                        new Item("item1", 11),
                        new Item("item2", 12))),
                new Order(Arrays.asList(new Item("item1", 23),
                        new Item("item3", 8),
                        new Item("item4", 66)))));

        // list of order having quantity > 30
        List<Order> order = list.stream().filter(e -> e.items.stream()
                .anyMatch(r -> r.quantity > 30)).toList();
        System.out.println(order);

        // make one list of item ascending by quantity
        List<Item> items = list.stream().flatMap(e -> e.items.stream()).
                sorted(Comparator.comparing(Item::getQuantity)).toList();
        System.out.println(items);

        // list of item having maximum quantity
        //----------- first find the max quantity----------
        int maxQuantity = list.stream().flatMap(e -> e.items.stream())
                .mapToInt(Item::getQuantity).max().orElseThrow();
        List<Item> items1 = list.stream().flatMap(e -> e.items.stream())
                .filter(e -> e.quantity == maxQuantity).toList();
        System.out.println(items1);
        Optional<Item> list1 = list.stream().flatMap(e -> e.items.stream())
                .sorted(Comparator.comparingInt(Item::getQuantity).reversed()).findFirst();

    }
}

class TestCopy {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>(Arrays.asList(new Order(Arrays.asList(new Item("pen", 10),
                new Item("book", 40))), new Order(Arrays.asList(new Item("chocolate", 299),
                new Item("locopie", 200)))));
        List<Item> items = new ArrayList<>();
        items.add(new Item("book", 112));
        items.add(new Item("abc", 22));

        List<Item> items1 = new ArrayList<>();
        items1.add(new Item("book", 112));
        items1.add(new Item("abc", 22));
        Order order = new Order(items);
        Order order1 = new Order(items1);
        List<Order> list1 = new ArrayList<>(Arrays.asList(order, order1));

        // ------------ flat list of items of orders----------------
        List<Item> result = list1.stream().flatMap(e -> e.items.stream()).toList();
        System.out.println(result);

        // ------------ flat list of items ----------------
        List<Item> items2 = items.stream().toList();
        System.out.println(items2);

        // ------------ flat list of items ascending by quantity ----------------
        List<Item> items3 = items.stream().sorted(Comparator.comparing(e -> e.quantity)).toList();
        System.out.println(items3);

    }
}

/*
    flat list of items
 */
class Test1 {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>(Arrays.asList(new Order(Arrays.asList(
                        new Item("item1", 11),
                        new Item("item2", 12))),
                new Order(Arrays.asList(new Item("item1", 23),
                        new Item("item3", 8),
                        new Item("item4", 66)))));
        List<Item> list1 = list.stream().flatMap(e -> e.items.stream()).toList();
        System.out.println(list1);

        //flattening list
        List<Item> items = list.stream().flatMap(e -> e.items.stream()).toList();
        System.out.println(items);
    }
}

/*
    list of orders with max value > 30
 */
class Test2 {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>(Arrays.asList(new Order(Arrays.asList(
                        new Item("item1", 11),
                        new Item("item2", 12))),
                new Order(Arrays.asList(new Item("item1", 23),
                        new Item("item3", 8),
                        new Item("item4", 66)))));
        List<Order> filteredOrders = list.stream()
                .filter(order -> order.items.stream()
                        .mapToInt(Item::getQuantity)
                        .max()
                        .orElse(0) > 30)
                .collect(Collectors.toList());
        List<Order> list1 = list.stream().filter(e -> e.items.stream().allMatch(r -> r.quantity > 30)).toList();
        System.out.println(filteredOrders);
        List<Order> list2 = list.stream().filter(e -> e.items.stream().allMatch(p -> p.quantity > 30)).toList();
        System.out.println(list2);

        System.out.println(list1);
    }
}

/*
    list of orders with max value
 */
class Test3 {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>(Arrays.asList(new Order(Arrays.asList(
                        new Item("item1", 11),
                        new Item("item2", 12))),
                new Order(Arrays.asList(new Item("item1", 23),
                        new Item("item3", 8),
                        new Item("item4", 66)))));
        Optional<Order> order = list.stream().max(Comparator.comparingInt(e -> e.items.stream()
                .mapToInt(Item::getQuantity).max().orElse(Integer.MIN_VALUE)));
        Optional<Order> max = list.stream().max(Comparator.comparing(e -> e.items.stream().mapToInt(Item::getQuantity).max().orElse(Integer.MAX_VALUE)));
        System.out.println(order);
        System.out.println(max);
//        List<Order> list1 = list.stream().sorted(Comparator.comparingInt(e->e.items.stream().mapToInt(Item::getQuantity).max().orElse(Integer.MIN_VALUE)))
    }
}

/*
        list of orders with max value by quantity
*/
class Test4 {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>(Arrays.asList(new Order(Arrays.asList(
                        new Item("item1", 11),
                        new Item("item2", 12))),
                new Order(Arrays.asList(new Item("item1", 23),
                        new Item("item3", 8),
                        new Item("item4", 66)))));
        Optional<Order> order = list.stream().min(Comparator.comparingInt(e -> e.items.stream()
                .mapToInt(Item::getQuantity).max().orElse(Integer.MAX_VALUE)));
        System.out.println(order);
    }
}

class Test5 {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>(Arrays.asList(new Item("item1", 11),
                new Item("name2", 22), new Item("name3", 33)));
        Optional<Item> item = items.stream().max(Comparator.comparingInt(e -> e.getQuantity()));
    }
}

//count occurrence of words in string and list of strings
class Test6 {
    public static void main(String[] args) {
        String s = "it is it is is Rain rain raining";
        List<String> list = new ArrayList<>(Arrays.asList("rain rain again it is raining", "how are you",
                "i hope you are doing well"));
        Map<String, Long> map = Arrays.stream(s.split("\\s")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((a, b) -> System.out.println(a + " : " + b));

        Map<String, Long> map1 = list.stream().flatMap(e -> Arrays.stream(e.split("\\s")))
                .map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map1.forEach((a, b) -> System.out.println(a + " : " + b));
    }
}

class Test6Copy {
    public static void main(String[] args) {
        String s = "it is it is is Rain rain raining";
        List<String> list = new ArrayList<>(Arrays.asList("rain rain again it is raining", "how are you",
                "i hope you are doing well"));

        // most occurred word
        String word = list.stream().flatMap(e -> Arrays.stream(e.split("\\s")))
                .collect(Collectors.toMap(e -> e, n -> 1, Integer::sum, LinkedHashMap::new))
                .entrySet().stream().max(Map.Entry.comparingByValue()).toString();
        System.out.println(word);
    }
}