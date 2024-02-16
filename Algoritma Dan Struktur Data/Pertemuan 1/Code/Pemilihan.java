import java.util.Scanner;

/**
 * Pemilihan
 */
public class Pemilihan {
    public static void main(String[] args) {
        boolean nilaiValid = true;
        String nilaiHuruf;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nilai Tugas : ");
        double tugas = input.nextDouble();
        if (tugas > 100 || tugas < 0) {
            nilaiValid = false;
        }
        System.out.print("Masukan Nilai Kuis : ");
        double kuis = input.nextDouble();
        if (kuis > 100 || tugas < 0) {
            nilaiValid = false;
        }

        System.out.print("Masukan Nilai UTS : ");
        double uts = input.nextDouble();
        if (uts > 100 || tugas < 0) {
            nilaiValid = false;
        }

        System.out.print("Masukan Nilai UAS : ");
        double uas = input.nextDouble();
        if (uas > 100 || tugas < 0) {
            nilaiValid = false;
        }

        double nilaiAkhir = (tugas *= 0.2)+(kuis *= 0.2)+(uts *= 0.3)+(uas *= 0.3);

        if (nilaiAkhir > 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        if (nilaiValid = false) {
            System.out.println("Nilai Tidak Valid");
        } else {
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            if (nilaiHuruf == "D" || nilaiHuruf == "E") {
                System.out.println("Anda Tidak Lulus");
            } else {
                System.out.println("Selamat Anda Lulus");
            }
        }


    }
}