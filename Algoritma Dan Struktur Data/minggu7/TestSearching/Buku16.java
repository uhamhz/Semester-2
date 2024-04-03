package TestSearching;

public class Buku16 {

    int tahunTerbit, stok;
    String judul, pengarang, kodeBuku;

    Buku16(String kodeBuku, String judul, String pengarang, int tahunTerbit, int stok) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.stok = stok;
    }

    void tampilDataBuku(){
        System.out.println("=====================");
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Stok : " + stok);
    }
}