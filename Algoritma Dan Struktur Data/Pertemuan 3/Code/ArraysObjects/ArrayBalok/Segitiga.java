package Code.ArraysObjects.ArrayBalok;

public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    int hitungLuas() {
        return   alas * tinggi / 2;
    }

    int hitungKeliling() {
        return alas + tinggi + (int) Math.sqrt((alas * alas) + (tinggi * tinggi));
    }
}
