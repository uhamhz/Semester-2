package Code.tugas;

public class HotelService {
    Hotel[] rooms = new Hotel[5];

    void tambah(Hotel H) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = H;
                break;
            }
        }
    }

    void tampilAll(){
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                rooms[i].tampil();
            }
        }
    }

    void bubbleSort(){
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if (rooms[j].harga < rooms[j - 1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = temp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < rooms.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[idxMax].bintang < rooms[j].bintang) {
                    idxMax = j;
                }
            }
            Hotel tmp = rooms[i];
            rooms[i] = rooms[idxMax];
            rooms[idxMax] = tmp;
        }
    }
}
