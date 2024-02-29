package Code.Latihan;

public class Limas {
    public int PanjangSisiAlas;
    public int tinggiLimas;


    double luasPermukaanLimas(){
        int luasAlas = PanjangSisiAlas * PanjangSisiAlas;
        double miringSegitiga = Math.sqrt(PanjangSisiAlas / 2.0 * PanjangSisiAlas / 2.0 + tinggiLimas * tinggiLimas);
        return luasAlas + miringSegitiga * PanjangSisiAlas / 2.0 * 4.0;
    }

    double volumeLimas(){
        return  PanjangSisiAlas * PanjangSisiAlas * tinggiLimas / 3.0;
    }
}
