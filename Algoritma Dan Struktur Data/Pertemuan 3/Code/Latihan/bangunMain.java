package Code.Latihan;

import java.util.Scanner;

public class bangunMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = 0;
        
        System.out.print("Masukan Jumlah Kerucut : ");
        jumlah = input.nextInt();
        Kerucut[] kArray = new Kerucut[jumlah];
        for (int i = 0; i < kArray.length; i++) {
            kArray[i] = new Kerucut();
            System.out.println("Kerucut ke-" + i);
            System.out.print("Masukan Jari-Jari Kerucut : ");
            kArray[i].jari = input.nextInt();
            System.out.print("Masukan Sisi Miring Kerucut : ");
            kArray[i].sisiMiring = input.nextInt();
            System.out.println("Luas Permukaan Kerucut ke-" + i + " Adalah : " + kArray[i].luasPermukaan());
            System.out.println("Volume Kerucut ke-" + i + " Adalah : " + kArray[i].volume());
        }

        System.out.print("Masukan Jumlah Limas Segi Empat : ");
        jumlah = input.nextInt();
        Limas[] lArray = new Limas[jumlah];
        for (int i = 0; i < lArray.length; i++) {
            lArray[i] = new Limas();
            System.out.println("Limas ke-" + i);
            System.out.print("Masukan Panjang Sisi Alas Limas : ");
            lArray[i].PanjangSisiAlas = input.nextInt();
            System.out.print("Masukan Tinggi Limas : ");
            lArray[i].tinggiLimas = input.nextInt();
            System.out.println("Luas Permukaan Limas ke-" + i + " Adalah : " + lArray[i].luasPermukaanLimas());
            System.out.println("Volume Limas ke-" + i + " Adalah : " + lArray[i].volumeLimas());
        }

        System.out.print("Masukan Jumlah Bola : ");
        jumlah = input.nextInt();
        Bola[] bArray = new Bola[jumlah];
        for (int i = 0; i < bArray.length; i++) {
            bArray[i] = new Bola();
            System.out.println("Bola ke-" + i);
            System.out.print("Masukan Jari-Jari Bola : ");
            bArray[i].jari = input.nextInt();
            System.out.println("Luas Permukaan Bola ke-" + i + " Adalah : " + bArray[i].luasPermukaanBola());
            System.out.println("Volume Bola ke-" + i + " Adalah : " + bArray[i].volumeBola());
        }
    }
}
