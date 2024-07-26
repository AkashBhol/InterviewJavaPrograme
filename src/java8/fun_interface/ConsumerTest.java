package java8.fun_interface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {

        /*ArrayList<Student> numbers = new ArrayList<>();*/

        HashSet<Student> numbers = new HashSet<>();
        numbers.add(new Student(12, "Amit"));
        numbers.add(new Student(12, "Amit"));
        numbers.add(new Student(12, "Amit"));
        numbers.add(new Student(12, "Amit"));

        Consumer<Student> method = (n) -> {
            System.out.println(n);
            System.out.println(n.hashCode());
        };
        numbers.forEach(method);
    }
}

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return 31 * age + name.hashCode();
    }

    @Override
    public String toString() {
        return "Student{ name =" + name + ", age =" + age + "}";
    }
}