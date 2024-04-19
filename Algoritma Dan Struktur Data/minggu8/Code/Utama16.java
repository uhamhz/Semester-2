package Code;

import java.util.Scanner;

public class Utama16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kapasistas Gudang : ");
        int size = scanner.nextInt();
        Gudang16 gudang = new Gudang16(size);

        while (true) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan Barang");
            System.out.println("4. Tampilkan Barang Teratas");
            System.out.println("5. Tampilkan Barang Terbawah");
            System.out.println("6. Cari Barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih Operasi : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukan Kode Barang : ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukan nama barang : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukan kategori : ");
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
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.println("1. Cari Berdasarkan Kode");
                    System.out.println("2. Cari Berdasarkan Nama");
                    System.out.print("Pilih Operasi : ");
                    pilihan = scanner.nextInt();
                    scanner.nextLine();
                    switch (pilihan) {
                        case 1:
                            System.out.print("Masukan Kode Barang yang dicari : ");
                            int cariKode = scanner.nextInt();
                            gudang.barangKode(cariKode);
                            break;
                        case 2:
                            System.out.print("Masukan Nama Barang yang dicari : ");
                            String cariJudul = scanner.nextLine();
                            gudang.barangNama(cariJudul);
                            break;

                        default:
                            break;
                    }
                    break;
                case 7:

                    break;
                default:
                    break;
            }
        }

    }
}
