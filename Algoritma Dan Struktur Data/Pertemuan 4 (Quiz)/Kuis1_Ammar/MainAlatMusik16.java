import java.util.Scanner;

public class MainAlatMusik16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        AlatMusik16[] MusikArray16 = new AlatMusik16[2];

        String namaAlat16, MerkAlat16, KategoriAlat16;
        int Alatstok16, Alatjumlah16;

        for (int i = 0; i < MusikArray16.length; i++) {
        System.out.print("Masukan Nama Alat : ");
        namaAlat16 = input.next();
        System.out.print("Masukan Merk : ");
        MerkAlat16 = input.next();
        System.out.print("Masukan Kategori : ");
        KategoriAlat16 = input.next();
        System.out.print("Jumlah Stok : ");
        Alatstok16 = input.nextInt();
        System.out.print("Masukan Jumlah Alat Terjual : ");
        Alatjumlah16 = input.nextInt();
        MusikArray16[i] = new AlatMusik16(namaAlat16,MerkAlat16,KategoriAlat16,Alatstok16,Alatjumlah16);
        }

        for (int i = 0; i < MusikArray16.length; i++) {
            System.out.println("==============================");
            System.out.println("Data Alat ke-" + (i+1));
            MusikArray16[i].tampil();
            System.out.println("Alat Tersisa Sebanyak : " + MusikArray16[i].hitungSisa());
            System.out.println("==============================");
        }
    }
    
}
