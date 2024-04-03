package TestSearching;

public class PencarianBuku16 {
    Buku16 listBk[] = new Buku16[5];
    int idx;

    void tambah(Buku16 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }

    }

    void tampil() {
        for (Buku16 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public void TampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t\t : " + listBk[pos].judul);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stok\t\t : " + listBk[pos].stok);
        }
    }

    public int FindSeqSearch(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equalsIgnoreCase(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;

    }

    public Buku16 findBuku(String cari) {
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku.equalsIgnoreCase(cari)) {
                return listBk[i];
            }
        }
        return null;
    }

    public void Tampilposisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks ke-" + pos);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }

    public int FindBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari.equalsIgnoreCase(listBk[mid].kodeBuku)) {
                return mid;
            } else if (listBk[mid].kodeBuku.compareTo(cari) > 0) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public int FindJudSeqSearch(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judul.equalsIgnoreCase(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int Sorting(){
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = i + 1; j < listBk.length; j++) {
                if (listBk[i].kodeBuku.compareTo(listBk[j].kodeBuku) > 0) {
                    Buku16 temp = listBk[i];
                    listBk[i] = listBk[j];
                    listBk[j] = temp;
                }
            }
        }
        return 0;
    }

    public int FindJudBinary(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari.equalsIgnoreCase(listBk[mid].judul)) {
                return mid;
            } else if (listBk[mid].judul.compareTo(cari) > 0) {
                return FindJudBinary(cari, left, mid - 1);
            } else {
                return FindJudBinary(cari, mid + 1, right);
            }
        }
        return -1;
    }

}
