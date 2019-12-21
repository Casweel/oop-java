public class CyclicList {
    private Node head;
    private Node tail;
    private int size;

    public CyclicList() {
        this.size = 0;
    }

    public class Node {
        Item data;
        Node prev;
        Node next;

        public Node(Item data, Node prev, Node next) {
            this.prev = prev;
            this.next = next;
            this.data = data;
        }
    }

    public int getSize() {
        return size;
    }

    public Node getHead() {
        return head;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(Item data) {
        Node help = new Node(data, head, null);
        if (head != null) head.prev = help;
        head = help;
        if (tail == null) tail = help;
        size++;
    }

    public void addLast(Item data) {
        Node help = new Node(data, null, tail);
        if (tail != null) tail.next = help;
        tail = help;
        if (head == null) head = help;
        size++;
    }

    public boolean remove(String name) {
        boolean flag = false;
        if (head.data.getName() == name) {
            head = head.next;
            head.prev = null;
            flag = true;
        } else if (tail.data.getName() == name) {
            tail = tail.prev;
            tail.next = null;
            flag = true;
        } else {
            Node help = head;
            while (help.next != null && help.next.data.getName() != name) {
                help = help.next;
                flag = true;
            }
            if (help != null) {
                help.next = help.next.next;
                help.next.prev = help;
            }
        }
        return flag;
    }

}
