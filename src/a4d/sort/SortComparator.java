package a4d.sort;

import java.util.*;

public class SortComparator {
    public static void main(String[] args) {

        List<Emp> list = new ArrayList<>(Arrays.asList(new Emp("Ravi", 22, 5.22),
                new Emp("Kavi", 33, 45.1), new Emp("Mukul", 21, 6.3),
                new Emp("Mahaveer", 66, 6.6)));
        Collections.sort(list, new Emp());
        System.out.println(list);
        Collections.sort(list, new HeightComparator());
        System.out.println(list);
        Collections.sort(list, new NameComparator());
        System.out.println(list);
    }
}

class Emp implements Comparator<Emp> {
    String name;
    int age;
    double height;

   /* @Override
    public int compare(Emp o1, Emp o2) {
        return Integer.compare(o1.age, o2.age);
    }*/

    @Override
    public int compare(Emp o1, Emp o2) {
        if (o1.age == o2.age)
            return 0;
        else if (o1.age > o2.age)
            return 1;
        else return -1;
    }

    public Emp() {
    }

    public Emp(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

class NameComparator implements Comparator<Emp> {

    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.name.compareTo(o2.name);
    }
}

class HeightComparator implements Comparator<Emp> {

    @Override
    public int compare(Emp o1, Emp o2) {
        return Integer.compare(o2.age, o1.age);
    }
}