package minggu5.Code.Tugas;

public class CarMain {
    public static void main(String[] args) {
        Car[] Arrc = new Car[8];

        Arrc[0] = new Car("Mercedes", "M2 Coupe", 2016, 6816, 728);
        Arrc[1] = new Car("Ford", "Fiesta ST", 2014, 3921, 575);
        Arrc[2] = new Car("Nissan", "370Z", 2009, 4360, 657);
        Arrc[3] = new Car("Subaru", "BRZ", 2014, 4058, 609);
        Arrc[4] = new Car("Subaru", "Impreza WRX STI", 2013, 6255, 703);
        Arrc[5] = new Car("Toyota", "AE86 Trueno", 1986, 3700, 553);
        Arrc[6] = new Car("Toyota", "86/GT86", 2014, 4180, 609);
        Arrc[7] = new Car("Volkswagen", "Golf GTI", 2014, 4180, 631);
        
        System.out.println("Top Acceleration Tertinggi : " + topTDC(Arrc, 0, 7));
        System.out.println("Top Acceleration Terendah : " + topDDC(Arrc, 0, 7));
        System.out.println("Rata-Rata Top Power : " + totalTP(Arrc));

    }

    static int topTDC(Car Arrc[], int l, int r) {
        if (l == r) {
            return Arrc[l].top_accleration;
        }else if (l == r - 1) {
            if (Arrc[r].top_accleration > Arrc[l].top_accleration) {
                return Arrc[r].top_accleration;
            } else {
                return Arrc[l].top_accleration;
            }
        } else {
            int mid = (l + r) / 2;
            int lsum = topTDC(Arrc, l, mid - 1);
            int rsum = topTDC(Arrc, mid + 1, r);
            if (lsum > rsum) {
                return lsum;
            } else {
                return rsum;
            }
        }
    }

    static int topDDC(Car Arrc[], int l, int r) {
        if (l == r) {
            return Arrc[l].top_accleration;
        }else if (l == r - 1) {
            if (Arrc[r].top_accleration > Arrc[l].top_accleration) {
                return Arrc[l].top_accleration;
            } else {
                return Arrc[r].top_accleration;
            }
        } else {
            int mid = (l + r) / 2;
            int lsum = topDDC(Arrc, l, mid);
            int rsum = topDDC(Arrc, mid + 1, r);
            if (lsum > rsum) {
                return rsum;
            } else {
                return lsum;
            }
        }
    }

    static int totalTP(Car Arrc[]) {
        int total = 0;
        for (int i = 0; i < Arrc.length; i++) {
            total = total + Arrc[i].top_power;
        }
        return total / Arrc.length;
    }

}
