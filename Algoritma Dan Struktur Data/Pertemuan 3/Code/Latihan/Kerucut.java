package Code.Latihan;

public class Kerucut {
    public int jari;
    public int sisiMiring;

    int luasPermukaan() {
        return jari * (jari + sisiMiring) * 22 / 7;
    }

    double volume() {
        double tinggiK = Math.sqrt(sisiMiring * sisiMiring - jari * jari);
        return 22.0 * jari * jari * tinggiK / 3.0 / 7.0;
    }

}
