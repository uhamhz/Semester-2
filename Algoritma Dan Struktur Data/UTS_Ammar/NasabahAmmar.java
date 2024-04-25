/**
 * NasabahAmmar
 */
public class NasabahAmmar {

    String norekAmmar;
    String namaAmmar;
    String nikAmmar;
    int umurAmmar;
    double saldoAmmar;

    NasabahAmmar(String norekAmmar, String namaAmmar, String nikAmmar, int umurAmmar, double saldoAmmar) {
        this.norekAmmar = norekAmmar;
        this.namaAmmar = namaAmmar;
        this.nikAmmar = nikAmmar;
        this.umurAmmar = umurAmmar;
        this.saldoAmmar = saldoAmmar;
    }

    public String tampilNasabahAmmar() {
        return "NOREK : " + norekAmmar + " NAMA : " + namaAmmar + " NIK : " + nikAmmar + " UMUR : " + umurAmmar + " SALDO : " + saldoAmmar;
    }


    public static void cariNasabahAmmar(NasabahAmmar[] nasabahBaruAmmar, String cari) {
        int posisiAmmar = -1;
        int countAmmar = 0;
        for (int j = 0; j < nasabahBaruAmmar.length; j++) {
            if (nasabahBaruAmmar[j].namaAmmar.equalsIgnoreCase(cari)) {
                posisiAmmar = j;
                countAmmar++;
            }
        }
        if (countAmmar == 0) {
            System.out.println("Data Tidak Ditemukan");
        } else if (countAmmar == 1) {
            System.out.println(nasabahBaruAmmar[posisiAmmar].tampilNasabahAmmar());
        }
    }

    public static void pengurutansNasabahAmmar(NasabahAmmar[] nasabahBaruAmmar){
        for (int i = 0; i < nasabahBaruAmmar.length - 1; i++) {
            int indexMinAmmar = i;
            for (int j = i + 1; j < nasabahBaruAmmar.length; j++) {
                if (nasabahBaruAmmar[j].umurAmmar < nasabahBaruAmmar[indexMinAmmar].umurAmmar) {
                    indexMinAmmar = j;
                }
            }
            NasabahAmmar temp = nasabahBaruAmmar[indexMinAmmar];
            nasabahBaruAmmar[indexMinAmmar] = nasabahBaruAmmar[i];
            nasabahBaruAmmar[i] = temp;
        }
    }

}