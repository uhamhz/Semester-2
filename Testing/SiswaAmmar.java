/**
 * SiswaAmmar
 */
public class SiswaAmmar {

    String nisn;
    String nama;
    String alamat;
    int tahun;
    double nilai;

    SiswaAmmar(String nisn, String nama, String alamat, int tahun, double nilai) {
        this.nisn = nisn;
        this.nama = nama;
        this.alamat = alamat;
        this.tahun = tahun;
        this.nilai = nilai;
    }

    public String TampilSiswa() {
        return "NISN : " + nisn + " NAMA : " + nama + " ALAMAT : " + alamat + " TAHUN : " + tahun + " NILAI : " + nilai;
    }

    public static void SortingSiswa(SiswaAmmar[] siswa) {
        for (int i = 0; i < siswa.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < siswa.length; j++) {
                if (siswa[j].nilai > siswa[index].nilai) {
                    index = j;
                }
            }
            SiswaAmmar temp = siswa[index];
            siswa[index] = siswa[i];
            siswa[i] = temp;
        }
    }

    public static void CariSiswa(SiswaAmmar[] siswa, String cari) {
        int posisi = -1;
        int count = 0;
        for (int j = 0; j < siswa.length; j++) {
            if (siswa[j].nisn.equalsIgnoreCase(cari)) {
                posisi = j;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Data Tidak Ditemukan");
        } else if (count == 1) {
            System.out.println(siswa[posisi].TampilSiswa());
        }
    }
}