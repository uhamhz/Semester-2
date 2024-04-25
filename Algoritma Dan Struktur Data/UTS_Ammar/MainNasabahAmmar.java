import java.util.Scanner;

public class MainNasabahAmmar {
    public static void main(String[] args) {
        Scanner scAmmar = new Scanner(System.in);

        int jumlahNasabahAmar = 0;
        while (jumlahNasabahAmar < 6) {
            System.out.print("Masukan Jumlah Nasabah : ");
            jumlahNasabahAmar = scAmmar.nextInt();
        }

        NasabahAmmar[] nasabahBaruAmmar = new NasabahAmmar[jumlahNasabahAmar];

        boolean exitAmmar = false;
        while (exitAmmar == false) {

            System.out.println("Pilih Menu");
            System.out.println("1. Tambah Data Nasabah");
            System.out.println("2. Tampil Data Nasabah");
            System.out.println("3. Pencarian Data Nasabah");
            System.out.println("4. Pengurutan Data Nasabah");
            System.out.println("5. Exit");
            System.out.print("Pilih : ");
            int pilihanAmmar = scAmmar.nextInt();

            switch (pilihanAmmar) {
                case 1:
                    for (int i = 0; i < nasabahBaruAmmar.length; i++) {
                        System.out.println("Masukan data Nasabah ke-" + (i + 1));
                        System.out.print("Nomor Rekening : ");
                        String norekAmmar = scAmmar.next();
                        System.out.print("Nama : ");
                        String namaAmmar = scAmmar.next();
                        System.out.print("NIK : ");
                        String nikAmmar = scAmmar.next();
                        System.out.print("Umur : ");
                        int umurAmmar = scAmmar.nextInt();
                        System.out.print("Saldo : ");
                        double saldoAmmar = scAmmar.nextDouble();
                        nasabahBaruAmmar[i] = new NasabahAmmar(norekAmmar, namaAmmar, nikAmmar, umurAmmar, saldoAmmar);
                    }
                    break;

                case 2:
                    for (int i = 0; i < nasabahBaruAmmar.length; i++) {
                        System.out.println("Data Nasabah Ke-" + (i + 1));
                        System.out.println(nasabahBaruAmmar[i].tampilNasabahAmmar());
                    }
                    break;

                case 3:
                    System.out.print("Masukan Nama yang Ingin Dicari : ");
                    String lineCariNasabahAmmar = scAmmar.next();
                    NasabahAmmar.cariNasabahAmmar(nasabahBaruAmmar, lineCariNasabahAmmar);
                    break;

                case 4:
                    NasabahAmmar.pengurutansNasabahAmmar(nasabahBaruAmmar);
                    break;
                    
                case 5:
                    exitAmmar = true;
                    break;
                default:
                    break;
            }
        }
    }
}
