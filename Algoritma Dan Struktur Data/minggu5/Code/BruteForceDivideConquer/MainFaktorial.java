package minggu5.Code.BruteForceDivideConquer;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------");
        System.out.println("Masukan Jumlah Elemen : ");
        int iJml = sc.nextInt();

        Faktorial[] fk = new Faktorial[iJml];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial();
            System.out.println("Masukan Nilai Data ke-" + (i + 1) + " : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println(
                    "Hasil Perhitungan Faktorial Menggunakan Brute Force Adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("HASIL - DIVIDE CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil Perhitungan Faktorial Menggunakan Divide Conquer Adalah : "
                    + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
