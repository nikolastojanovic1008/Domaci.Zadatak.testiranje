package cetvrtak2908.Domaci;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak2a {
    public static void main(String[] args) {
        /*
        2. Napisati program koji trazi od korisnika da unese niz celih brojeva i vraca maksimalni element u nizu
         */
        Scanner sc = new Scanner(System.in);
        int[] unetiNiz = new int[5];
        int maksimum = unetiNiz[0];
        System.out.println("Unesite 5 celobrojnih brojeva: ");
        for (int i = 0; i < 5; i++) {
            unetiNiz[i] = sc.nextInt();
            if (unetiNiz[i] > maksimum) {
                maksimum = unetiNiz[i];
            }
        }
        System.out.println("Uneli ste sledeci niz brojeva:");
        System.out.println(Arrays.toString(unetiNiz));
        System.out.println("Maksimalni element iz unetog niza je: " + maksimum);

    }
}
