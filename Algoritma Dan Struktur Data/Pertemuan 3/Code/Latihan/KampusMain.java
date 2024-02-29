package Code.Latihan;

import java.util.Scanner;

public class KampusMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Mahasiswa : ");
        int jumlah = input.nextInt();
        Kampus[] mArray = new Kampus[jumlah];

        for (int i = 0; i < mArray.length; i++) {
         mArray[i] = new Kampus();
         System.out.println("Masukan Data Mahasiswa ke-" + (i+1) );
         System.out.print("Masukan Nama Mahasiswa : ");
         mArray[i].nama = input.next();
         System.out.print("Masukan NIM Mahasiswa : ");
         mArray[i].nim = input.next();
         System.out.print("Masukan Jenis Kelamin Mahasiswa (P/L) : ");
         mArray[i].jenisKelamin = input.next().charAt(0);
         System.out.print("Masukan IPK Mahasiswa : ");
         mArray[i].ipk = input.nextDouble();
        }

        for (int i = 0; i < mArray.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("Nama : " + mArray[i].nama);
            System.out.println("NIM : " + mArray[i].nim);
            System.out.println("Jenis Kelamin : " + mArray[i].jenisKelamin);
            System.out.println("IPK : " + mArray[i].ipk);
        }
        System.out.println("Rata-Rata Keseluruhan IPK Mahasiswa : " + rataIpk(mArray));
        System.out.println("IPK Tertinggi Mahasiswa : " + ipkTertinggi(mArray));
    }

    static double rataIpk(Kampus[] mArray){
        double jumlah = 0;
        for (int i = 0; i < mArray.length; i++) {
        jumlah += mArray[i].ipk;
        }
        return jumlah / mArray.length;
    }

    static double ipkTertinggi(Kampus[] mArray){
        double a = 0;
        for (int i = 0; i < mArray.length; i++) {
            if (mArray[i].ipk > a) {
                a = mArray[i].ipk;
            }       
        }
        return a;
    }

}
