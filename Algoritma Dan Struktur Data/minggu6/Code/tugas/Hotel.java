package Code.tugas;

public class Hotel {
    String nama, kota;
    int harga;
    byte bintang;

    Hotel(String n, String k, int h, byte b){
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampil(){
        System.out.println("--------------------------");
        System.out.println("Nama = " + nama);
        System.out.println("Kota = " + kota);
        System.out.println("Harga = " + harga);
        System.out.println("Bintang = " + bintang);
        System.out.println("--------------------------");

    }
}
