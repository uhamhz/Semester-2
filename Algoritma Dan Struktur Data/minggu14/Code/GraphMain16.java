package Code;

import java.util.Scanner;

public class GraphMain16 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
      
        Graph16 gedung = new Graph16(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.removeEdge(1, 3);
        gedung.printGraph();
        
        GraphMatriks16 gdg = new GraphMatriks16(6);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil Setelah penghapusan edge ");
        gdg.removeEdge(2, 1);
        gdg.degree(0);
        gdg.printGraph();
        
        while (true) {
            System.out.println("1. Relasi antar Gedung");
            System.out.println("2. Exit");
            System.out.print("Pilih : ");
            int pilih = input.nextInt();
            if (pilih == 1) {
                System.out.print("Masukan Gedung Asal : ");
                int asal = input.nextInt();
                System.out.print("Masukan Gedung Tujuan : ");
                int tujuan = input.nextInt();
                gedung.isAdjacent(asal, tujuan);
            } else if (pilih == 2) {
                break;
            }
        }
    }
}
