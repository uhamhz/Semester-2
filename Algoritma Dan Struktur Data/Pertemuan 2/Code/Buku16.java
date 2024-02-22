public class Buku16 {
    String judul, pengarang;
    int halaman, stok, harga, total, terjual, diskon, hargaDiskon;
    
    public Buku16() {
        
    }

    Buku16(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }


    void tampilInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Sisa Stok : " + stok);
        System.out.println("Harga : Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            terjual = jml;
        } else {
            System.out.println("Stok Sudah Habis!");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    void hitungHargaTotal(){
        total = harga * terjual;
        System.out.println("Total Hasil Penjualan : " + total);
    }

    void hitungDiskon(){
        if (harga > 150000) {
            diskon = (int) (0.12 * harga);
            System.out.println("Anda Mendapatkan Diskon Sebesar : " + diskon);
        } if (harga >= 75000) {
            diskon = (int) (0.05 * harga);
            System.out.println("Anda Mendapatkan Diskon Sebesar : " + diskon);
        } else {
            System.out.println("Anda tidak mendapat Diskon");
        }
    }
}