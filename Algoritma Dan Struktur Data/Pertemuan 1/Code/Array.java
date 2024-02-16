import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilai[] = new double[8];
        double ips = 0;
        String nilaiHuruf[] = new String[8];
        double bobotNilai[] = new double[8];
        String matkul[] = {
                "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving", "Matematika Dasar",
                "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Kesehatan dan Keselematan Kerja"
        };
        int BobotSKS[] = {
                2, 2, 2, 3, 2, 2, 3, 2
        };

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukan Nilai Angka untuk MK " + matkul[i] + " : ");
            nilai[i] = input.nextDouble();
        }

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if (nilai[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilai[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if (nilai[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilai[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if (nilai[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }
        }

        System.out.printf("%-40s%-20s%-20s%-20s\n", "MatKul", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-40s%-20s%-20s%-20s\n", matkul[i], nilai[i], nilaiHuruf[i], bobotNilai[i]);
        }
        for (int i = 0; i < matkul.length; i++) {
            ips += bobotNilai[i] * BobotSKS[i];
        }
        ips /= 18;
        System.out.printf("IP : %.2f",ips);
    }
}
