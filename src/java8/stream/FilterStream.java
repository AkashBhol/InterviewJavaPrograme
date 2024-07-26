package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStream {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("1", "name", 200.0));
        list.add(new Product("12", "name2", 2020));
        list.add(new Product("11", "name3", 200.03));
        list.add(new Product("122", "name22", 20220.0));

        List<Double> list1 = new ArrayList<>();
        // filter by price
        for (Product p : list) {
            if (p.price < 2000) {
                list1.add(p.price);
            }
        }
        System.out.println(list1);
    }
}

class Product {
    String id;
    String name;
    double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class Stream1 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("1", "name", 200.0));
        list.add(new Product("12", "name2", 2020));
        list.add(new Product("11", "name3", 200.03));
        list.add(new Product("122", "name22", 20220.0));

        List<Double> list1 = list.stream().filter(e -> e.price > 2000)
                .map(e -> e.price).toList();
        System.out.println(list1);
    }
}

class Stream2 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("1", "name", 200.0));
        list.add(new Product("12", "name2", 2020));
        list.add(new Product("11", "name3", 200.03));
        list.add(new Product("122", "name22", 20220.0));
        list.add(new Product("122", "name22", 20220.0));

        //filter and iterate
        System.out.println(list.stream().filter(e -> e.price > 2000).map(e -> e.price).reduce(0.0, Double::sum));
    }
}

class Stream3 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("1", "name", 200.0));
        list.add(new Product("12", "name2", 2020));
        list.add(new Product("11", "name3", 200.03));
        list.add(new Product("122", "name22", 20220.0));
        list.add(new Product("122", "name22", 20220.0));

        list.forEach(System.out::println);
        System.out.println(list.get(1));
    }
}