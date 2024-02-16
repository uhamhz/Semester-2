import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan NIM : ");
        String nim = input.nextLine();

        int n = Integer.parseInt(nim.substring(8));
        if (n < 10) {
            n += 10;
        }
        System.out.print("Maka N : " + n + "\n");

        for (int i = 1; i <= n ; i++) {
            if (i == 10 || i == 6) {
                continue;
            } else if (i%2 == 0) {
                System.out.print(i);
            } else {
                System.out.print("*");
            }
        }
    }
}
