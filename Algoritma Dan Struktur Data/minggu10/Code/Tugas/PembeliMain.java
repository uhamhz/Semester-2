package Code.Tugas;

import java.util.Scanner;

public class PembeliMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih = 0;
        System.out.print("Masukan kapasitas Queue : ");
        int max = sc.nextInt();
        PembeliQueue antri = new PembeliQueue(max);
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {

                case 1:
                    System.out.print("Masukan Nama : ");
                    String nama = sc.next();
                    System.out.print("Masukan Nomor Hp : ");
                    int noHp = sc.nextInt();
                    antri.enQueue(new Pembeli(nama, noHp));
                    break;

                case 2:
                    antri.deQueue();
                    break;

                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.dataPembeli();
                    break;

                case 5:
                    antri.peekRear();
                    break;

                case 6:
                    System.out.print("Masukan Nama : ");
                    String namaCari = sc.next();
                    antri.peekPosition(namaCari);
                    break;

                case 7:
                    antri.dataPembeli();
                    break;

                default:
                    break;
            }
        } while (pilih > 0 || pilih < 6);
    }

    public static void menu() {
        System.out.println("Pilih Menu : ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian Terbelakang");
        System.out.println("6. Cek Antrian Berdasarkan Nama");
        System.out.println("7. Daftar Pembeli");
        System.out.println("--------------------");
    }
}
