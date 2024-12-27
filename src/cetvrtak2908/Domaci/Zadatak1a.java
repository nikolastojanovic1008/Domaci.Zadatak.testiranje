package cetvrtak2908.Domaci;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1a {
    public static void main(String[] args) {
        /*
        1. Napisati program koji trazi od korisnika da unese niz celih brojeva i vraca sumu svih elemenata niza
         */
        Scanner sc = new Scanner(System.in);
        int[] unetiNiz = new int[5];
        int suma = 0;
        System.out.println("Unesite 5 celobrojnih brojeva:");
        for (int i = 0; i < 5; i++) {
            unetiNiz[i] = sc.nextInt();
            suma+= unetiNiz[i];
        }
        System.out.println("Uneli ste sledeci niz brojeva:");
        System.out.println(Arrays.toString(unetiNiz));
        System.out.println("Ukupna suma elemenata u nizu je " + suma);
    }
}
