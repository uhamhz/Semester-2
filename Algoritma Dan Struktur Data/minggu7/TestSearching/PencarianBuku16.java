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
        if (pos == -1) {
            System.out.println("Data : " + x + " tidak ditemukan");
        } else if (pos == -2) {
            System.out.println("Data : " + x + " Ditemukan Lebih Dari 1");
        } else {
            System.out.println("Data : " + x + " ditemukan pada indeks ke-" + pos);
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
        int count = 0;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judul.equalsIgnoreCase(cari)) {
                posisi = j;
                count++;
            }
        }
        if (count == 0) {
            return -1;
        } else if (count == 1) {
            return posisi;
        } else {
            return -2;
        }
    }

    public void Sorting() {
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = 0; j < listBk.length - 1 - i; j++) {
                if (listBk[j].judul.compareTo(listBk[j + 1].judul) > 0) {
                    Buku16 temp = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j + 1] = temp;
                }
            }
        }
    }

    public int FindJudBinary(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari.equalsIgnoreCase(listBk[mid].judul)) {
                if (mid >= 0 && mid < listBk.length - 1) {
                    if (listBk[mid].judul.equalsIgnoreCase(listBk[mid + 1].judul)) {
                        return -2;
                    }
                }  if (mid > 0 && mid <= listBk.length - 1) {
                    if (listBk[mid].judul.equalsIgnoreCase(listBk[mid - 1].judul)) {
                        return -2;
                    }
                } else {
                    return mid;
                }
            } else if (listBk[mid].judul.compareTo(cari) > 0) {
                return FindJudBinary(cari, left, mid - 1);
            } else {
                return FindJudBinary(cari, mid + 1, right);
            }
        }
        return -1;
    }

}
