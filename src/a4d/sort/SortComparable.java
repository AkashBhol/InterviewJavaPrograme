package a4d.sort;

import java.util.*;

public class SortComparable {
    public static void main(String[] args) {
        /*Student student1 = new Student("Ravi", 28, 5.9);
        Student student2 = new Student("Ronit", 30, 5.11);
        Student student3 = new Student("Mukul", 28, 6.2);
        Student student4 = new Student("Aavya", 1, 2.9);

        List<Student> list = new LinkedList<>(Arrays.asList(student1, student2, student3, student4));*/

        List<Student> list = new ArrayList<>(Arrays.asList(new Student("Ravi", 22, 5.22),
                new Student("Kavi", 33, 45.1), new Student("Mukul", 21, 6.3)));
        Collections.sort(list);
        System.out.println(list);

    }

}

class Student implements Comparable<Student> {
    String name;
    int age;
    double height;

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    /*@Override
    public int compareTo(Student o) {
        if (age > o.age)
            return 1;
        else if (age < o.age)
            return -1;
        else return 0;
    }*/
    @Override
    public int compareTo(Student s) {
        return Integer.compare(s.age, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}