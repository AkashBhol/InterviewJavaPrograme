package ds;

import java.util.LinkedList;

public class HashSet<T> {

    private static final int INITIAL_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;
    private LinkedList<T>[] buckets;
    private int size;

    public HashSet() {
        this.buckets = new LinkedList[INITIAL_CAPACITY];
        this.size = 0;
    }

    public void add(T element) {
        int index = getBucketIndex(element);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        LinkedList<T> bucket = buckets[index];
        if (!bucket.contains(element)) {
            bucket.add(element);
            size++;
        }
        if ((double) size / buckets.length > LOAD_FACTOR) {
            resize();
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }

    public void clear() {
        buckets = new LinkedList[INITIAL_CAPACITY];
        size = 0;
    }

    public LinkedList<T>[] toArray() {
        LinkedList<T>[] array = new LinkedList[size];
        int index = 0;

        for (LinkedList<T> bucket : buckets) {
            if (bucket != null) {
                array[index++] = bucket;
            }
        }
        return array;
    }

    public boolean contains(T element) {
        int index = getBucketIndex(element);

        if (buckets[index] == null) {
            return false;
        }
        LinkedList<T> list = buckets[index];
        if (list.contains(element)) {
            return true;
        }
        return false;
    }


    private int getBucketIndex(T element) {
        int index = Math.abs(element.hashCode()) % buckets.length;
        return index;
    }

    private void resize() {
        int newCapacity = buckets.length * 2;
        LinkedList<T>[] newBuckets = new LinkedList[newCapacity];
        for (LinkedList<T> bucket : buckets) {
            if (bucket != null) {
                LinkedList<T> elements = bucket;
                for (T element : elements) {
                    int newIndex = Math.abs(element.hashCode()) % newCapacity;
                    if (newBuckets[newIndex] == null) {
                        newBuckets[newIndex] = new LinkedList<>();
                    }
                    LinkedList<T> newBucket = newBuckets[newIndex];
                    newBucket.add(element);
                }
            }
        }
        buckets = newBuckets;
    }

    private void remove(T element) {
        int index = getBucketIndex(element);
        if (buckets[index] != null) {
            LinkedList<T> list = buckets[index];
            if (list.contains(element)) {
                list.remove(element);
                size--;
            }
        }
    }

}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age && name.equals(student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + age;
    }



}

class TestHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("abc1");
        System.out.println(set.size());

        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("Ravi", 28));
        hashSet.add(new Student("Ravi", 28));
        System.out.println(hashSet.size());



    }

}