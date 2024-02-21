public class BukuMain16 {
    public static void main(String[] args) {
        Buku16 bk1 = new Buku16();
        bk1.judul = "Today Ends Tommorow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman =  198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku16 bk2 = new Buku16("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku16 bukuAmmar = new Buku16("Psychology of Money", "Morgan Housel", 200, 10, 100000);
        bukuAmmar.tampilInformasi();
    }
}
