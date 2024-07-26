package ds;


class Node {
    Object data;
    Node next;

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    void insert(Object data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode; // head will always point to first node
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void delete(Object data) {
        if (head == null)
            return;

        if (head.data == data)
            head = head.next;

        Node current = head;

        while (current.next != null && current.next.data != data)
            current = current.next;

        if (current.next != null)
            current.next = current.next.next;

    }

    boolean search(Object data) {
        if (head.data == data)
            return true;

        Node current = head;

        while (current != null) {

            if (current.data == data)
                return true;
            current = current.next;
        }

        return false;
    }

    void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.print();
        list.delete(20);
        System.out.println("Given Data is present in Node :" + list.search(20));
        System.out.println("Given Data is present in Node :" + list.search(22));
        System.out.println("Given Data is present in Node :" + list.search(30));
    }

}
