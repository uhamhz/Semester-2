package Code;
public class DoubleLinkedList16 {

    Node16 head;
    Node16 tail;
    int size;

    DoubleLinkedList16() {
        head = null;
        tail = null;  
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node16(null, item, jarak, null);
        } else {
            Node16 newNode = new Node16(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    int getJarak(int index) {
        if (index < 0 || index >= size|| isEmpty()) {
            System.out.println("Nilai indeks di luar batas");
            return -1;
        }

        Node16 tmp = head;
        for (int i = 0; i < index; i++) {
            if (tmp.next != null) {
                tmp = tmp.next;
            }
        }
        return tmp.jarak;
    }

    void remove(int index) {
        Node16 current = head;
        while (current != null) {
            if (current.data== index) {
                if (current.prev!=null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next!=null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
    }

    void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int j) {
        Node16 current = head;
        for (int i = 0; i < j; i++) {
            if (current.next != null) {
                current = current.next;
            }else {
                return -1;
            }
        }
        return current.data;
    }
}