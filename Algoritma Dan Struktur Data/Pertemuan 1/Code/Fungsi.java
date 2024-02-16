import java.util.Arrays;
import java.util.Scanner;

public class Fungsi {
    static boolean exit = false;
    static Scanner input = new Scanner(System.in);
    static int pilihMenu = 0;
    static int omset = 0;
    static int baris = 0;
    static int kolom = 0;
    static String namaToko[] = {
            "Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"
    };
    static int stokToko[][] = {
            { 10, 5, 15, 7 },
            { 6, 11, 11, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
    };
    static int harga[] = {
            75000, 50000, 60000, 10000
    };

    public static void main(String[] args) {
        do {
            
            System.out.printf("%-20s%-15s%-15s%-15s%-15s\n", "Nama Cabang", "Aglonema", "Keladi", "Alcosia", "Mawar");
            for (int i = 0; i < stokToko.length; i++) {
                System.out.printf("%-20s", namaToko[i]);
                for (int j = 0; j < stokToko.length; j++) {
                    System.out.printf("%-15s", stokToko[i][j]);
                }
                System.out.println();
            }
            System.out.println("1. Omset\n2. Bunga Mati");
            System.out.print("Pilih Menu : ");
            pilihMenu = input.nextInt();
            switch (pilihMenu) {
                case 1:
                omset();
                break;

                case 2:
                stokMati();
                break;
                
                default:
                break;
            }
        } while (exit == false);
    }

    static void stokMati() {
        System.out.printf("%-20s%-15s%-15s%-15s%-15s\n", "Nama Cabang", "Aglonema", "Keladi", "Alcosia", "Mawar");
        for (int i = 0; i < stokToko.length; i++) {
            System.out.printf("%-20s", namaToko[i]);
            for (int j = 0; j < stokToko.length; j++) {
                System.out.printf("%-15s", stokToko[i][j]);
            }
            System.out.println();
        }
        System.out.print("Pilih Toko (1-4) : ");
        baris = input.nextInt() - 1;
        System.out.printf("%-20s%-15s%-15s%-15s%-15s\n", "Nama Cabang", "Aglonema", "Keladi", "Alcosia", "Mawar");
        System.out.printf("%-20s", namaToko[baris]);
        for (int i = 0; i < stokToko.length; i++) {
            System.out.printf("%-15s", stokToko[baris][i]);
        }
        System.out.println();
        System.out.print("Pilih Bunga (1-4) : ");
        kolom = input.nextInt() - 1 ;
        System.out.print("Berapa Banyak yang Mati : ");
        stokToko[baris][kolom] -= input.nextInt();

    }

    static void omset() {
        System.out.printf("%-20s%-15s", "Nama Toko", "Omset");
        System.out.println();
        for (int i = 0; i < stokToko.length; i++) {
            System.out.printf("%-20s", namaToko[i]);
            for (int j = 0; j < stokToko.length; j++) {
                omset += harga[j] * stokToko[i][j];
            }
            System.out.printf("%-15s", omset);
            omset = 0;
            System.out.println();
        }
        System.out.print("Masukan Angka Berapapun untuk Keluar : ");
        pilihMenu = input.nextInt();
    }

}
