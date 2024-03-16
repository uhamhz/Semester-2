package minggu5.Code.BruteForceDivideConquer;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = 0;
        System.out.println("=========================================");
        System.out.print("Masukan Jumlah Perusahaan : ");
        int jml = sc.nextInt();

        while (range < jml) {
            range++;
            Sum[] array = new Sum[jml];

            for (int i = 0; i < jml; i++) {
                array[i] = new Sum(jml);
            }

            System.out.println("=========================================");
            System.out.println("Program Menghitung Keuntungan Total (Satuan Juta Misal 5.9)");
            System.out.print("Masukan Jumlah Bulan : ");
            int elm = sc.nextInt();

            Sum sm = new Sum(elm);
            System.out.println("====================================");
            for (int i = 0; i < sm.elemen; i++) {
                System.out.print("Masukan Untung Bulan ke-" + (i + 1) + " = ");
                sm.keuntungan[i] = sc.nextDouble();
            }

            System.out.println("======================================");
            System.out.println("Algoritma Brute Force");
            System.out.println(
                    "Total Keuntungan Perusahaan ke-" + range + " selama " + sm.elemen + " bulan adalah = "
                            + sm.totalBF(sm.keuntungan));
            System.out.println("======================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total Keuntungan Perusahaan ke-" + range + " selama " + sm.elemen + " bulan adalah = "
                    + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
        }
    }
}
