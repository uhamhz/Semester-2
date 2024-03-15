public class SegitigaClass {

    public double alas;
    public double sisiMiring;
    public double tinggiBanget;

    SegitigaClass(double alas, double sisiMiring) {
        this.alas = alas;
        this.sisiMiring = sisiMiring;
    }

    double tinggi() {
        return Math.sqrt(sisiMiring * sisiMiring - alas * alas);
    }

    double luas() {
        return alas * tinggiBanget / 2.0 ;
    }
}
