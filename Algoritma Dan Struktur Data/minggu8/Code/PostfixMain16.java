package Code;

import java.util.Scanner;

public class PostfixMain16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.print("Masukan ekspresi matematika (infix) : ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();
        Postfix16 post = new Postfix16(total);
        P = post.konversi(Q);
        System.out.println("Postfix : " + P);
    }
}