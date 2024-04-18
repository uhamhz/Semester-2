package Code;

import java.util.Scanner;

public class Utama16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gudang16 gudang = new Gudang16(7);

        while (true) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan Barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih Operasi : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukan Kode Barang : ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Masukan nama barang : ");
                    String nama = scanner.nextLine();
                    System.out.println("Masukan kategori : ");
                    String kategori = scanner.nextLine();
                    Barang16 barangBaru = new Barang16(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }

    }
}
