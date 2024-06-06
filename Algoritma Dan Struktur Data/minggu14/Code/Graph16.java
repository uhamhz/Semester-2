package Code;

/**
 * Graph16
 */
public class Graph16 {

    int vertex;
    DoubleLinkedList16 list[];

    public Graph16(int v) {
        vertex = v;
        list = new DoubleLinkedList16[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList16();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            // outDegree
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("inDegree dari Gedung " + (char) ('A' + asal) + " : " + totalIn);
        System.out.println("outDegree dari Gedung " + (char) ('A' + asal) + " : " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + " : " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (!list[i].isEmpty()) {
                System.out.println("Gedung " + (char) ('A' + i) + " Terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A'  + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    boolean isAdjacent(int asal, int tujuan) {
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                System.out.println("Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " terhubung");
                return true;
            }
        }
        System.out.println("Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " tidak terhubung");
        return false;
    }

    // void printGraph() {
    //     for (int i = 0; i < vertex; i++) {
    //         if (!list[i].isEmpty()) {
    //             System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
    //             for (int j = 0; j < list[i].size; j++) {
    //                 System.out.print((char) ('A' + list[i].get(j)) + "(" + list[i].getJarak(j) + "m),");
    //             }
    //             System.out.println();
    //         }
    //     }
    //     System.out.println();
    // }
}