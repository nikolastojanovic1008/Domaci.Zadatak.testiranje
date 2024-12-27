package cetvrtak2908.Domaci;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        /*
        1. Napisati program koji trazi od korisnika da unese niz celih brojeva i vraca sumu svih elemenata niza
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj elemenata u nizu: ");

        int n = sc.nextInt();
        int[] unetiNiz = new int[n];
        int suma = 0;
        System.out.println("Unesite " + n + " brojeva:");
        for (int i = 0; i < n; i++) {
            unetiNiz[i] = sc.nextInt();
        }
        System.out.println("Uneti niz brojeva je: ");
        System.out.println(Arrays.toString(unetiNiz));
        for (int broj : unetiNiz) {
            suma += broj;
        }
        System.out.println("Ukupan zbir svih elemenata u nizu je: " + suma);
    }
}
