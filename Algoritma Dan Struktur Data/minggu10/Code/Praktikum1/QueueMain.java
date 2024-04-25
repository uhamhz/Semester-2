import java.util.Scanner;

/**
 * QueueMain
 */
public class QueueMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilih = 0;

        System.out.print("Masukan Kapasitas Queue : ");
        int n = sc.nextInt();
        Queue Q = new Queue(n);

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    if (!Q.isFull()) {
                        System.out.print("Masukan data baru : ");
                        int dataMasuk = sc.nextInt();
                        Q.Enqueue(dataMasuk);
                        break;
                    }else{
                        return;
                    }

                case 2:
                if (!Q.isEmpty()) {
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan : " + dataKeluar);
                        break;
                    }
                }else{
                    return;
                }

                case 3:
                    Q.print();
                    break;

                case 4:
                    Q.peek();
                    break;

                case 5:
                    Q.clear();
                    break;

                default:
                    break;
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);

    }

    public static void menu() {
        System.out.println("Masukan operasi yang diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("--------------------");
    }
}