package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Banana");
        list.add("Papaya");
        list.add("Grapes");
        System.out.println(list);
    }
}

class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abccs");
        list.add("fgh");
        list.add("hjkjh");
        list.add("fghjk");
        list.add("jkl;");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(list);
    }
}