public class AlatMusik16 {
    public static final String MerkAlat16 = null;
    public final int Alatjumlah16 = 0;
    public String nama16;
    public String merk16;
    public String kategori16;
    public int stok16;
    public int jumlah16;
    public String namaAlat16;
    
    AlatMusik16(){
        
    }

    AlatMusik16(String nama, String merk, String kategori, int stok, int jumlah){
        this.nama16 = nama;
        this.merk16 = merk;
        this.kategori16 = kategori;
        this.stok16 = stok;
        this.jumlah16 = jumlah;
    }

    void tampil(){
        System.out.print("Nama Alat : " + nama16);
        System.out.println("Merk : " + merk16);
        System.out.println("Kategori :" + kategori16);
        System.out.println("Stok : " + stok16);
        System.out.println("Jumlah : " + jumlah16);
    }

    int hitungSisa(){
        return stok16 - jumlah16;
    }

    void cariAlatMusikTidakLaku(){

    }

    void daftarAlatMusik(){
        
    }

    
}
