package ds.ds_1;

public class LinkedList {

    Node head;

    void add(Object data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
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


}

class Node {
    Object data;
    Node next;

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }
}