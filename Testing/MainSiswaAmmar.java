import java.util.Scanner;

public class MainSiswaAmmar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahNasabahAmar = 0;
        while (jumlahNasabahAmar < 6) {
            System.out.print("Masukan Jumlah Siswa : ");
            jumlahNasabahAmar = sc.nextInt();
        }

        SiswaAmmar[] siswa = new SiswaAmmar[jumlahNasabahAmar];
        boolean exit = false;
        while (exit == false) {

            System.out.println("Pilih Menu");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Sorting Nilai");
            System.out.print("Piih : ");
            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    for (int i = 0; i < siswa.length; i++) {
                        System.out.println("Masukan data siswa ke-" + (i + 1));
                        System.out.print("NISN : ");
                        String nisn = sc.next();
                        System.out.print("Nama : ");
                        String nama = sc.next();
                        System.out.print("Alamat : ");
                        String alamat = sc.next();
                        System.out.print("Tahun : ");
                        int tahun = sc.nextInt();
                        System.out.print("Nilai : ");
                        double nilai = sc.nextDouble();
                        siswa[i] = new SiswaAmmar(nisn, nama, alamat, tahun, nilai);
                    }
                    break;

                case 2:
                    for (int i = 0; i < siswa.length; i++) {
                        System.out.println("Data Siswa Ke-" + (i + 1));
                        System.out.println(siswa[i].TampilSiswa());
                    }
                    break;

                case 3:
                    SiswaAmmar.SortingSiswa(siswa);
                    break;

                case 4:
                    System.out.print("Masukan NISN Yang Ingin Dicari : ");
                    String cari = sc.next();
                    SiswaAmmar.CariSiswa(siswa, cari);
                    break;

                default:
                    break;
            }
        }
    }
}
