package Code.ArraysObjects;

import java.util.Scanner;

/**
 * ArrayObjects
 */
public class ArrayObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan Jumlah Persegi Panjang : ");
        int jumlah = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[jumlah];
        

        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang Ke-" + i);
            System.out.print("Masukan Panjang : ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukan Lebar : ");
            ppArray[i].lebar = sc.nextInt();
        }
        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang : " + ppArray[i].panjang + ", Lebar : " + ppArray[i].lebar);
        }
    }
}