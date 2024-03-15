package minggu5.Code.BruteForceDivideConquer;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============");
        System.out.println("Masukan Jumlah Elemen Yang Dihitung : ");
        int elemen = sc.nextInt();

        pangkat[] png = new pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukan Nilai Yang Hendak Dipangkatkan : ");
            int nilai = sc.nextInt();
            System.out.println("Masukan Nilai Pangkat : ");
            int pangkat = sc.nextInt();
            png[i] = new pangkat(nilai, pangkat);
        }

        System.out.println("1. Pangkat Brute Force");
        System.out.println("2. Pangkat Divide Conquer");
        System.out.print("Pilih Menu : ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil Dari "
                            + png[i].nilai
                            + " Pangkat "
                            + png[i].pangkat
                            + " adalah "
                            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE CONQUER");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil Dari "
                            + png[i].nilai
                            + " Pangkat "
                            + png[i].pangkat
                            + " adalah "
                            + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
        }
    }
}
