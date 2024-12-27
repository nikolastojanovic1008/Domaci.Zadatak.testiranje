package ponedeljak2608.domaci2608;

import java.util.Scanner;

public class Domaci2 {
    public static void main(String[] args) {
        /*
        2. Napisi program koji koristi for petlju da proveri da li je broj N prost. Korisnik treba da unese vrednost N,
        a program treba da ispita da li je taj broj deljiv samo sa 1 i sa samim sobom. Ispiši odgovarajuću poruku.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki celobrojni broj: ");
        int N = sc.nextInt();
        boolean prost = true;

        if (N <= 1) {
            prost = false;
        } else {
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    prost = false;
                    break;
                }
            }
        }
        if (prost) {
            System.out.println("Broj " + N + " je prost broj");
        } else {
            System.out.println("Broj " + N + " nije prost broj");
        }
    }
}