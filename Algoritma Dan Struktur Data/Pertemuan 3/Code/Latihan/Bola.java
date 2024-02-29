package Code.Latihan;

public class Bola {
    public int jari;

    double luasPermukaanBola(){
        return 22.0 * jari * jari / 7.0 * 4.0;
    }

    double volumeBola(){
       return 22.0 * jari * jari * jari * 4.0  / 7.0 / 3.0 ; 
    }
}
