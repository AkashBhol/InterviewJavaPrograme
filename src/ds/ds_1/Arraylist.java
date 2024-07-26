package ds.ds_1;

import java.util.Arrays;

public class Arraylist {

    public Arraylist() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    private static final int DEFAULT_CAPACITY = 2;
    private int size;
    private Object[] array;

    public void add(Object data) {
        checkSize();
        array[size++] = data;
    }

    public void delete(int index) {
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[--size] = null;
        }
    }

    private int size() {
        return size;
    }

    private void checkSize() {
        if (size == array.length) {
            // array = Arrays.copyOf(array, array.length * 2);
            Object newSize[] = new Object[size * 2];
            for (int i = 0; i < size; i++) {
                newSize[i] = array[i];
            }
            array = newSize;
        }
    }

}
