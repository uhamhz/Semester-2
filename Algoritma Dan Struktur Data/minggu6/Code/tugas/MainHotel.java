package Code.tugas;

import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HotelService hotel = new HotelService();
        hotel.tambah(new Hotel("Park Hyatt Jakarta", "Jakarta", 320000, (byte) 5));
        hotel.tambah(new Hotel("Novotel Bandung", "Bandung", 200000, (byte) 4));
        hotel.tambah(new Hotel("Majapahit Surabaya MGallery", "Surabaya", 300000, (byte) 5));
        hotel.tambah(new Hotel("Amaris Hotel Malioboro", "Yogyakarta", 250000, (byte) 2));
        hotel.tambah(new Hotel("Kelingking Sunset", "Bali", 400000, (byte) 3));

        boolean condition = true;
        while (condition) {
            System.out.println("1. Tampilkan Daftar Hotel");
            System.out.println("2. Filter Harga Hotel");
            System.out.println("3. Filter Bintang Hotel");
            System.out.println("4. Keluar");
            System.out.print("Masukkan menu : ");
            int menu = input.nextInt();
            switch (menu) {
                case 1:
                hotel.tampilAll();
                break;
                
                case 2:
                hotel.bubbleSort();
                hotel.tampilAll();
                break;
                
                case 3:
                hotel.selectionSort();
                hotel.tampilAll();
                break;

                case 4:
                condition = false;
                break;

                default:
                break;
            }
        }
    }
}
