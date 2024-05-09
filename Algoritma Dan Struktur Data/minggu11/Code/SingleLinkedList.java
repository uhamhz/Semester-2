package Code;

/**
 * SingleLinkedList
 */
public class SingleLinkedList {

    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List : ");
            while (tmp != null) {
                System.out.print(tmp.data + " ");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int data) {
        Node ndInput = new Node(data, null);
        if (!isEmpty()) {
            ndInput.next = head;
            head = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void addLast(int data) {
        Node ndInput = new Node(data, null);
        if (!isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int index, int input) {
        Node ndInput = new Node();
        Node temp = head;
        do {
            if (temp.data == index) {
                ndInput.data = input;
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next != null) {
                    tail = ndInput;
                }
            }
            temp = temp.next;
        } while (temp == null);
    }

    void insertAt(int index, int input) {
        Node ndINput = new Node();
        if (index < 0) {
            System.out.println("Perbaiki logikanya!" + " kalau indeksnya -1 bagaimana?");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}