package Code.Tugas;

public class PembeliQueue {

    Pembeli[] antrian;
    int front, rear, size, max;

    PembeliQueue(int n) {
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(Pembeli antri) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                }
                rear++;
            }
        }
        antrian[rear] = antri;
        size++;
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            if (front == rear) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
            size--;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama );
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama);
            System.out.println("Jumlah Elemen : " + size);
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen Terdepan : " + antrian[front].nama);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen Terbelakang : " + antrian[rear].nama);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String nama) {
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                if (antrian[i].nama.equals(nama)) {
                    System.out.println("Antrian dengan nama " + antrian[i].nama + " berada di posisi ke-" + (i + 1));
                }
                i = (i + 1) % max;
            }
            if (antrian[i].nama.equals(nama)) {
                System.out.println("Antrian dengan nama " + antrian[i].nama + " berada di posisi ke-" + (i + 1));
            }
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void dataPembeli() {
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                System.out.println("Nama : "+ antrian[i].nama + " Nomor HP : " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println("Nama : " + antrian[i].nama + " Nomor HP : " + antrian[i].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

}
