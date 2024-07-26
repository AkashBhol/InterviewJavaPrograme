package ds;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class HashMap<K, V> {

    private static final int DEFAULT_CAPACITY = 16;
    private static final double INITIAL_LOAD_FACTOR = 0.75;

    private LinkedList<Entry<K, V>>[] buckets;
    private int size;
    private int capacity;
    private double loadFactor;

    public HashMap() {
        this(DEFAULT_CAPACITY, INITIAL_LOAD_FACTOR);
    }

    public HashMap(int initialCapacity, double loadFactor) {
        this.capacity = initialCapacity;
        this.loadFactor = loadFactor;
        this.buckets = new LinkedList[capacity];
        this.size = 0;
    }

    public void put(K key, V value) {
        int index = (key == null) ? 0 : calculateIndex(key);
        if (buckets[index] == null)
            buckets[index] = new LinkedList<>();
        LinkedList<Entry<K, V>> list = buckets[index];
        for (Entry<K, V> entry : list) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }
        list.add(new Entry<>(key, value));
        size++;

    }

    public V get(K key) {
        int index = calculateIndex(key);
        if (buckets[index] != null) {
            LinkedList<Entry<K, V>> bucket = buckets[index];
            for (Entry<K, V> entry : bucket) {
                if ((key == null && entry.getKey() == null) ||
                        (key != null && key.equals(entry.getKey()))) {
                    return entry.getValue();
                }

            }
        }
        return null;
    }

    public void remove(K key) {
        int index = calculateIndex(key);
        if (buckets[index] != null) {
            LinkedList<Entry<K, V>> entries = buckets[index];
            entries.removeIf(e -> e.getKey().equals(key));
            size--;
        }
    }

    public int size() {
        return size;
    }

    private void resize() {
        int newCapacity = capacity * 2;
        LinkedList<Entry<K, V>>[] newBuckets = new LinkedList[newCapacity];
        for (LinkedList<Entry<K, V>> entry : buckets) {
            if (entry != null) {
                for (Entry<K, V> element : entry) {
                    int newIndex = calculateIndex(element.key);
                    if (newBuckets[newIndex] == null) {
                        newBuckets[newIndex] = new LinkedList<>();
                    }
                    newBuckets[newIndex].add(element);
                }
            }
            capacity = newCapacity;
            buckets = newBuckets;
        }

    }

    private int calculateIndex(K key) {
        return (key == null) ? 0 : Math.abs(key.hashCode()) % capacity;
    }

    private static class Entry<K, V> {
        private final K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}

class TestHashMap {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        LinkedList<Student> list = new LinkedList<>();
        list.add(new Student("Ravi", 28));
        list.add(new Student("Rohan", 26));
        map.put("name", "Ravi");
        map.put("name", "Rohan");
        map.put("id", 101);
        map.put("age", 26);
        map.put("students", list);
        System.out.println(map.get("name"));

        LinkedList<Student> list1 = (LinkedList<Student>) map.get("students");
        for (Student s : list1) {
            System.out.println(s);
        }

    }
}