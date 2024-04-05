package TestSearching;

import java.util.Scanner;

public class BukuMain16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku16 data = new PencarianBuku16();
        int jumBuku = 5;

        System.out.println("---------------------------");
        System.out.println("Masukan Data Buku Secara Urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("-----------------------");
            System.out.print("Kode Buku \t : ");
            String kodeBuku = s.next();
            System.out.print("Judul Buku \t : ");
            String judul = s1.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stok \t\t : ");
            int stok = s.nextInt();

            s.nextLine();
            

            Buku16 m = new Buku16(kodeBuku, judul, pengarang, tahunTerbit, stok);
            data.tambah(m);
        }
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukan Judul Buku yang ingin dicari : ");
        String cari = s.nextLine();
        System.out.println("==========================");
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindJudSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        System.out.println("=========================");
        System.out.println("Menggunakan Binary Search");
        data.Sorting();
        posisi = data.FindJudBinary(cari, 0, jumBuku - 1);
        data.Tampilposisi(cari, posisi);
    }   
}
