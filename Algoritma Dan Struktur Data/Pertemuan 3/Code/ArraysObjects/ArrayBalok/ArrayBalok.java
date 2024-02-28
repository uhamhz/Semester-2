package Code.ArraysObjects.ArrayBalok;

public class ArrayBalok {
    public static void main(String[] args) {
        Balok[] blArray = new Balok[3];

        blArray[0] = new Balok(100, 30, 12);
        blArray[1] = new Balok(120, 40, 15);
        blArray[2] = new Balok(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke-" + i + " : " + blArray[i].hitungVolume());
        }

        Segitiga[] segitiga = new Segitiga[4];
        segitiga[0] = new Segitiga(10, 4);
        segitiga[1] = new Segitiga(20, 10);
        segitiga[2] = new Segitiga(15, 6);
        segitiga[3] = new Segitiga(25, 10);

        for (int i = 0; i < segitiga.length; i++) {
            System.out.println(segitiga[i].hitungLuas());
            System.out.println(segitiga[i].hitungKeliling());
        }
    }
}
