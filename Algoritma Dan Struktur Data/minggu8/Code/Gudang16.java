package Code;

public class Gudang16 {
    Barang16[] tumpukan;
    int size;
    int top;

    public Gudang16(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang16[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang16 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang16 ambilBarang() {
        if (!cekKosong()) {
            Barang16 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            System.out.println("Kode unik dalam Biner : " + konversiBinerKeDesimal(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang16 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang16 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas : " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang16 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang16 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah : " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang");
            for (int i = top; i >= 0; i--){
                System.out.printf("Kode %d : %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public String konversiBinerKeDesimal(int kode) {
        StackKonversi16 stack = new StackKonversi16();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner = biner + stack.pop();
        }
        return biner;
    }

    public Barang16 barangNama(String cariNama) {
        for (int i = 0; i < tumpukan.length; i++) {
            if (tumpukan[i].nama.equalsIgnoreCase(cariNama)) {
                System.out.println("Barang dengan kode " + tumpukan[i].kode + " ditemukan adalah : " + tumpukan[i].nama);
                return tumpukan[i];
            } else {
                System.out.println("Barang tidak ditemukan");
            }
        }
        return null;
    }

    public Barang16 barangKode(int cariKode) {
        for (int i = 0; i < tumpukan.length; i++) {
            if (tumpukan[i].kode == cariKode) {
                System.out.println("Barang dengan kode " + tumpukan[i].kode + " ditemukan adalah : " + tumpukan[i].nama);
                return tumpukan[i];
            } else {
                System.out.println("Barang tidak ditemukan");
            }
        }
        return null;
    }
}
