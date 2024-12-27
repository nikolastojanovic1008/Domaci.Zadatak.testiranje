package cetvrtak2908.Domaci;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        /*
        1. Napisati program koji trazi od korisnika da unese niz celih brojeva,
        pronalazi minimalni i maksimalni element u nizu i racuna kvadrat njihove razlike.
         */
        Scanner sc = new Scanner(System.in);
        int[] unetiNiz = new int[5];
        int maksimum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        System.out.println("Unesite 5 celobrojnih brojeva: ");
        for (int i = 0; i < 5; i++) {
            unetiNiz[i] = sc.nextInt();
            if (minimum > unetiNiz[i]) {
                minimum = unetiNiz[i];
            }
            if (maksimum < unetiNiz[i]) {
                maksimum = unetiNiz[i];
            }

            //  for (int j = 4; j >= 0; j--) {
            //      if (minimum > unetiNiz[j]) {
            //          minimum = unetiNiz[j];
            //      }
            //  }
        }
        double razlika = maksimum - minimum;
        double kvadratRazlike = Math.pow((razlika), 2.0);
        System.out.println("Maksimum iz unetog niza je: " + maksimum);
        System.out.println("Minimum iz unetog niza je: " + minimum);
        System.out.println("Kvadrat njihove razlike je: " + kvadratRazlike);
    }
}
