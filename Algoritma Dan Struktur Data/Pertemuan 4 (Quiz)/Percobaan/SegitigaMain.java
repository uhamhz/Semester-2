import java.util.Scanner;

public class SegitigaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Jumlah Segitiga : ");
        int jumlah = input.nextInt();
        SegitigaClass[] segitigaArray = new SegitigaClass[jumlah];

        double bawah = 0, miring = 0;

        for (int i = 0; i < segitigaArray.length; i++) {
            System.out.print("Masukan Alas Segitiga : ");
            bawah = input.nextDouble();
            System.out.print("Masukan Sisi Miring Segitiga : ");
            miring = input.nextDouble();
            segitigaArray[i] = new SegitigaClass(bawah, miring);
            segitigaArray[i].tinggiBanget = segitigaArray[i].tinggi();
            System.out.println(segitigaArray[i].tinggi());
            System.out.println(segitigaArray[i].luas());

        }
    }
}
